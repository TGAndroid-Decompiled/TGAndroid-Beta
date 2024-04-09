package org.telegram.ui.bots;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import androidx.biometric.BiometricManager;
import androidx.biometric.BiometricPrompt;
import androidx.core.content.ContextCompat;
import java.nio.charset.StandardCharsets;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.ui.LaunchActivity;
public class BotBiometry {
    private static KeyStore keyStore;
    public boolean access_granted;
    public boolean access_requested;
    public final long botId;
    private Utilities.Callback<BiometricPrompt.AuthenticationResult> callback;
    public final Context context;
    public final int currentAccount;
    public boolean disabled;
    private String encrypted_token;
    private BiometricPrompt prompt;

    public BotBiometry(Context context, int i, long j) {
        this.context = context;
        this.currentAccount = i;
        this.botId = j;
        load();
    }

    public void load() {
        Context context = this.context;
        SharedPreferences sharedPreferences = context.getSharedPreferences("2botbiometry_" + this.currentAccount, 0);
        String string = sharedPreferences.getString(String.valueOf(this.botId), null);
        this.encrypted_token = string;
        boolean z = true;
        boolean z2 = string != null;
        this.access_granted = z2;
        if (!z2) {
            if (!sharedPreferences.getBoolean(this.botId + "_requested", false)) {
                z = false;
            }
        }
        this.access_requested = z;
        this.disabled = sharedPreferences.getBoolean(this.botId + "_disabled", false);
    }

    public static String getAvailableType(Context context) {
        try {
            BiometricManager from = BiometricManager.from(context);
            if (from == null) {
                return null;
            }
            if (from.canAuthenticate(15) != 0) {
                return null;
            }
            return "unknown";
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public void requestToken(String str, final Utilities.Callback2<Boolean, String> callback2) {
        prompt(str, true, null, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                BotBiometry.this.lambda$requestToken$0(callback2, (BiometricPrompt.AuthenticationResult) obj);
            }
        });
    }

    public void lambda$requestToken$0(Utilities.Callback2 callback2, BiometricPrompt.AuthenticationResult authenticationResult) {
        String str = null;
        if (authenticationResult != null) {
            try {
                BiometricPrompt.CryptoObject cryptoObject = authenticationResult.getCryptoObject();
                if (Build.VERSION.SDK_INT < 23) {
                    if (!TextUtils.isEmpty(this.encrypted_token)) {
                        str = this.encrypted_token.split(";")[0];
                    } else {
                        str = this.encrypted_token;
                    }
                } else if (cryptoObject != null) {
                    str = new String(cryptoObject.getCipher().doFinal(Utilities.hexToBytes(this.encrypted_token.split(";")[0])), StandardCharsets.UTF_8);
                } else if (!TextUtils.isEmpty(this.encrypted_token)) {
                    throw new RuntimeException("No cryptoObject found");
                }
            } catch (Exception e) {
                FileLog.e(e);
                authenticationResult = null;
            }
        }
        callback2.run(Boolean.valueOf(authenticationResult != null), str);
    }

    public void updateToken(String str, final String str2, final Utilities.Callback<Boolean> callback) {
        prompt(str, false, str2, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                BotBiometry.this.lambda$updateToken$1(str2, callback, (BiometricPrompt.AuthenticationResult) obj);
            }
        });
    }

    public void lambda$updateToken$1(String str, Utilities.Callback callback, BiometricPrompt.AuthenticationResult authenticationResult) {
        boolean z = false;
        if (authenticationResult != null) {
            try {
                BiometricPrompt.CryptoObject cryptoObject = authenticationResult.getCryptoObject();
                if (TextUtils.isEmpty(str)) {
                    this.encrypted_token = null;
                } else if (Build.VERSION.SDK_INT < 23) {
                    this.encrypted_token = str;
                } else {
                    if (cryptoObject == null) {
                        cryptoObject = makeCryptoObject(false);
                    }
                    if (cryptoObject != null) {
                        this.encrypted_token = Utilities.bytesToHex(cryptoObject.getCipher().doFinal(str.getBytes(StandardCharsets.UTF_8))) + ";" + Utilities.bytesToHex(cryptoObject.getCipher().getIV());
                    } else {
                        throw new RuntimeException("No cryptoObject found");
                    }
                }
                save();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        z = true;
        callback.run(Boolean.valueOf(z));
    }

    private void initPrompt() {
        if (this.prompt != null) {
            return;
        }
        this.prompt = new BiometricPrompt(LaunchActivity.instance, ContextCompat.getMainExecutor(this.context), new BiometricPrompt.AuthenticationCallback() {
            @Override
            public void onAuthenticationError(int i, CharSequence charSequence) {
                FileLog.d("BotBiometry onAuthenticationError " + i + " \"" + ((Object) charSequence) + "\"");
                if (BotBiometry.this.callback != null) {
                    Utilities.Callback callback = BotBiometry.this.callback;
                    BotBiometry.this.callback = null;
                    callback.run(null);
                }
            }

            @Override
            public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
                FileLog.d("BotBiometry onAuthenticationSucceeded");
                if (BotBiometry.this.callback != null) {
                    Utilities.Callback callback = BotBiometry.this.callback;
                    BotBiometry.this.callback = null;
                    callback.run(authenticationResult);
                }
            }

            @Override
            public void onAuthenticationFailed() {
                FileLog.d("BotBiometry onAuthenticationFailed");
                if (BotBiometry.this.callback != null) {
                    Utilities.Callback callback = BotBiometry.this.callback;
                    BotBiometry.this.callback = null;
                    callback.run(null);
                }
            }
        });
    }

    private BiometricPrompt.CryptoObject makeCryptoObject(boolean z) {
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                Cipher cipher = getCipher();
                SecretKey secretKey = getSecretKey();
                if (z) {
                    cipher.init(2, secretKey, new IvParameterSpec(Utilities.hexToBytes(this.encrypted_token.split(";")[1])));
                } else {
                    cipher.init(1, secretKey);
                }
                return new BiometricPrompt.CryptoObject(cipher);
            }
            return null;
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    private void prompt(String str, boolean z, String str2, Utilities.Callback<BiometricPrompt.AuthenticationResult> callback) {
        this.callback = callback;
        try {
            initPrompt();
            BiometricPrompt.CryptoObject makeCryptoObject = makeCryptoObject(z);
            BiometricPrompt.PromptInfo.Builder allowedAuthenticators = new BiometricPrompt.PromptInfo.Builder().setTitle(UserObject.getUserName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.botId)))).setNegativeButtonText(LocaleController.getString(R.string.Back)).setAllowedAuthenticators(15);
            if (!TextUtils.isEmpty(str)) {
                allowedAuthenticators.setDescription(str);
            }
            BiometricPrompt.PromptInfo build = allowedAuthenticators.build();
            if (makeCryptoObject != null && !z) {
                try {
                    this.encrypted_token = Utilities.bytesToHex(makeCryptoObject.getCipher().doFinal(str2.getBytes(StandardCharsets.UTF_8))) + ";" + Utilities.bytesToHex(makeCryptoObject.getCipher().getIV());
                    save();
                    this.callback = null;
                    callback.run(null);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    makeCryptoObject = makeCryptoObject(z);
                }
            }
            if (makeCryptoObject != null) {
                this.prompt.authenticate(build, makeCryptoObject);
            } else {
                this.prompt.authenticate(build);
            }
        } catch (Exception e2) {
            FileLog.e(e2);
            callback.run(null);
        }
    }

    private SecretKey getSecretKey() throws Exception {
        if (keyStore == null) {
            KeyStore keyStore2 = KeyStore.getInstance("AndroidKeyStore");
            keyStore = keyStore2;
            keyStore2.load(null);
        }
        KeyStore keyStore3 = keyStore;
        if (keyStore3.containsAlias("6bot_" + this.botId)) {
            KeyStore keyStore4 = keyStore;
            return (SecretKey) keyStore4.getKey("6bot_" + this.botId, null);
        }
        KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder("6bot_" + this.botId, 3);
        builder.setBlockModes("CBC");
        builder.setEncryptionPaddings("PKCS7Padding");
        builder.setUserAuthenticationRequired(true);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            builder.setUserAuthenticationParameters(60, 2);
        } else {
            builder.setUserAuthenticationValidityDurationSeconds(60);
        }
        if (i >= 24) {
            builder.setInvalidatedByBiometricEnrollment(true);
        }
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(builder.build());
        return keyGenerator.generateKey();
    }

    private Cipher getCipher() throws Exception {
        return Cipher.getInstance("AES/CBC/PKCS7Padding");
    }

    public JSONObject getStatus() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String availableType = getAvailableType(this.context);
        boolean z = false;
        if (availableType != null) {
            jSONObject.put("available", true);
            jSONObject.put("type", availableType);
        } else {
            jSONObject.put("available", false);
        }
        jSONObject.put("access_requested", this.access_requested);
        if (this.access_granted && !this.disabled) {
            z = true;
        }
        jSONObject.put("access_granted", z);
        jSONObject.put("token_saved", !TextUtils.isEmpty(this.encrypted_token));
        jSONObject.put("device_id", getDeviceId(this.context, this.currentAccount, this.botId));
        return jSONObject;
    }

    public static String getDeviceId(Context context, int i, long j) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("2botbiometry_" + i, 0);
        String string = sharedPreferences.getString("device_id" + j, null);
        if (string == null) {
            byte[] bArr = new byte[32];
            new SecureRandom().nextBytes(bArr);
            String bytesToHex = Utilities.bytesToHex(bArr);
            sharedPreferences.edit().putString("device_id" + j, bytesToHex).apply();
            return bytesToHex;
        }
        return string;
    }

    public void save() {
        Context context = this.context;
        SharedPreferences.Editor edit = context.getSharedPreferences("2botbiometry_" + this.currentAccount, 0).edit();
        if (this.access_requested) {
            edit.putBoolean(this.botId + "_requested", true);
        } else {
            edit.remove(this.botId + "_requested");
        }
        if (this.access_granted) {
            String valueOf = String.valueOf(this.botId);
            String str = this.encrypted_token;
            if (str == null) {
                str = "";
            }
            edit.putString(valueOf, str);
        } else {
            edit.remove(String.valueOf(this.botId));
        }
        if (this.disabled) {
            edit.putBoolean(this.botId + "_disabled", true);
        } else {
            edit.remove(this.botId + "_disabled");
        }
        edit.apply();
    }

    public static class Bot {
        public boolean disabled;
        public TLRPC$User user;

        private Bot(TLRPC$User tLRPC$User, boolean z) {
            this.user = tLRPC$User;
            this.disabled = z;
        }
    }

    public static void getBots(Context context, final int i, final Utilities.Callback<ArrayList<Bot>> callback) {
        if (callback == null) {
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("2botbiometry_" + i, 0);
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        Map<String, ?> all = sharedPreferences.getAll();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            if (entry.getKey().startsWith("device_id") && (entry.getValue() instanceof String)) {
                try {
                    long parseLong = Long.parseLong(entry.getKey().substring(9));
                    Boolean bool = (Boolean) all.get(parseLong + "_disabled");
                    boolean z = bool != null && bool.booleanValue();
                    arrayList.add(Long.valueOf(parseLong));
                    arrayList2.add(Boolean.valueOf(z));
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
        if (arrayList.isEmpty()) {
            callback.run(new ArrayList<>());
        } else {
            MessagesStorage.getInstance(i).getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    BotBiometry.lambda$getBots$3(i, arrayList, arrayList2, callback);
                }
            });
        }
    }

    public static void lambda$getBots$3(int i, ArrayList arrayList, final ArrayList arrayList2, final Utilities.Callback callback) {
        final ArrayList<TLRPC$User> users = MessagesStorage.getInstance(i).getUsers(arrayList);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BotBiometry.lambda$getBots$2(users, arrayList2, callback);
            }
        });
    }

    public static void lambda$getBots$2(ArrayList arrayList, ArrayList arrayList2, Utilities.Callback callback) {
        ArrayList arrayList3 = new ArrayList();
        int i = 0;
        while (i < arrayList.size()) {
            arrayList3.add(new Bot((TLRPC$User) arrayList.get(i), i < arrayList2.size() && ((Boolean) arrayList2.get(i)).booleanValue()));
            i++;
        }
        callback.run(arrayList3);
    }

    public static void toggleBotDisabled(Context context, int i, long j, boolean z) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("2botbiometry_" + i, 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean(j + "_disabled", z);
        if (!z && sharedPreferences.getString(String.valueOf(j), null) == null) {
            edit.putString(String.valueOf(j), "");
        }
        edit.apply();
    }

    public static void clear() {
        Context context = ApplicationLoader.applicationContext;
        if (context == null) {
            return;
        }
        for (int i = 0; i < 4; i++) {
            context.getSharedPreferences("2botbiometry_" + i, 0).edit().clear().apply();
        }
    }
}
