package org.telegram.ui.bots;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import android.util.Pair;
import androidx.biometric.AuthenticatorUtils;
import androidx.biometric.BiometricManager$DefaultInjector;
import androidx.biometric.BiometricPrompt$AuthenticationCallback;
import androidx.biometric.BiometricPrompt$AuthenticationResult;
import androidx.biometric.BiometricPrompt$CryptoObject;
import androidx.core.content.ContextCompat;
import androidx.core.util.AtomicFile;
import com.android.billingclient.api.zzbo;
import com.android.billingclient.api.zzca;
import com.google.android.exoplayer2.util.Log;
import com.google.android.gms.cast.zzbe;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig$$ExternalSyntheticApiModelOutline0;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda18;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda2;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticApiModelOutline2;
import org.telegram.ui.ThemeActivity$$ExternalSyntheticLambda19;

public final class BotBiometry {
    public static final WeakHashMap instances = new WeakHashMap();
    public static KeyStore keyStore;
    public boolean access_granted;
    public boolean access_requested;
    public final long botId;
    public OAuthSheet$$ExternalSyntheticLambda18 callback;
    public final Context context;
    public final int currentAccount;
    public boolean disabled;
    public String encrypted_token;
    public String iv;
    public zzbe prompt;

    public final class Bot {
        public boolean disabled;
        public final TLRPC.User user;

        public Bot(TLRPC.User user, boolean z) {
            this.user = user;
            this.disabled = z;
        }
    }

    public BotBiometry(Context context, int i, long j) {
        this.context = context;
        this.currentAccount = i;
        this.botId = j;
        load();
    }

    public static BotBiometry get(Context context, int i, long j) {
        Pair pair = new Pair(Integer.valueOf(i), Long.valueOf(j));
        WeakHashMap weakHashMap = instances;
        BotBiometry botBiometry = (BotBiometry) weakHashMap.get(pair);
        if (botBiometry != null) {
            return botBiometry;
        }
        BotBiometry botBiometry2 = new BotBiometry(context, i, j);
        weakHashMap.put(pair, botBiometry2);
        return botBiometry2;
    }

    public static void getBots(Activity activity, int i, Utilities.Callback callback) {
        int i2 = 0;
        SharedPreferences sharedPreferences = activity.getSharedPreferences("2botbiometry_" + i, 0);
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, ?>> it = sharedPreferences.getAll().entrySet().iterator();
        while (it.hasNext()) {
            String key = it.next().getKey();
            if (key.endsWith("_requested")) {
                try {
                    arrayList.add(Long.valueOf(Long.parseLong(key.substring(0, key.length() - 10))));
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
        HashMap map = new HashMap();
        int size = arrayList.size();
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            Long l = (Long) obj;
            BotBiometry botBiometry = get(activity, i, l.longValue());
            if (botBiometry.access_granted && botBiometry.access_requested) {
                map.put(l, Boolean.valueOf(!botBiometry.disabled));
            }
        }
        if (arrayList.isEmpty()) {
            callback.run(new ArrayList());
        } else {
            MessagesStorage.getInstance(i).getStorageQueue().postRunnable(new OAuthSheet$$ExternalSyntheticLambda2(i, arrayList, map, callback, 15));
        }
    }

    public final boolean asked() {
        return this.access_requested;
    }

    public final SecretKey getSecretKey() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
        if (keyStore == null) {
            KeyStore keyStore2 = KeyStore.getInstance("AndroidKeyStore");
            keyStore = keyStore2;
            keyStore2.load(null);
        }
        KeyStore keyStore3 = keyStore;
        StringBuilder sb = new StringBuilder("9bot_");
        long j = this.botId;
        sb.append(j);
        if (keyStore3.containsAlias(sb.toString())) {
            return (SecretKey) keyStore.getKey("9bot_" + j, null);
        }
        SharedConfig$$ExternalSyntheticApiModelOutline0.m880m();
        KeyGenParameterSpec.Builder builderM = PhotoViewer$$ExternalSyntheticApiModelOutline2.m("9bot_" + j);
        builderM.setBlockModes("CBC");
        builderM.setEncryptionPaddings("PKCS7Padding");
        builderM.setUserAuthenticationRequired(true);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            builderM.setUserAuthenticationParameters(60, 2);
        }
        if (i >= 24) {
            builderM.setInvalidatedByBiometricEnrollment(true);
        }
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(builderM.build());
        return keyGenerator.generateKey();
    }

    public final JSONObject getStatus() throws JSONException {
        String str;
        JSONObject jSONObject = new JSONObject();
        Context context = this.context;
        try {
            str = new AtomicFile(new BiometricManager$DefaultInjector(context, 0)).canAuthenticate(15) != 0 ? null : "unknown";
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (str != null) {
            jSONObject.put("available", true);
            jSONObject.put("type", str);
        } else {
            jSONObject.put("available", false);
        }
        jSONObject.put("access_requested", this.access_requested);
        jSONObject.put("access_granted", this.access_granted && !this.disabled);
        jSONObject.put("token_saved", !TextUtils.isEmpty(this.encrypted_token));
        SharedPreferences sharedPreferences = context.getSharedPreferences("2botbiometry_" + this.currentAccount, 0);
        StringBuilder sb = new StringBuilder("device_id");
        long j = this.botId;
        sb.append(j);
        String string = sharedPreferences.getString(sb.toString(), null);
        if (string == null) {
            byte[] bArr = new byte[32];
            new SecureRandom().nextBytes(bArr);
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            String strM = Log.m(j, "device_id");
            string = Utilities.bytesToHex(bArr);
            editorEdit.putString(strM, string).apply();
        }
        jSONObject.put("device_id", string);
        return jSONObject;
    }

    public final boolean granted() {
        return this.access_granted;
    }

    public final void load() {
        SharedPreferences sharedPreferences = this.context.getSharedPreferences("2botbiometry_" + this.currentAccount, 0);
        long j = this.botId;
        this.encrypted_token = sharedPreferences.getString(String.valueOf(j), null);
        this.iv = sharedPreferences.getString(String.valueOf(j) + "_iv", null);
        boolean z = true;
        boolean z2 = this.encrypted_token != null;
        this.access_granted = z2;
        if (!z2) {
            if (!sharedPreferences.getBoolean(j + "_requested", false)) {
                z = false;
            }
        }
        this.access_requested = z;
        this.disabled = sharedPreferences.getBoolean(j + "_disabled", false);
    }

    public final BiometricPrompt$CryptoObject makeCryptoObject(boolean z) {
        try {
            if (Build.VERSION.SDK_INT < 23) {
                return null;
            }
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            SecretKey secretKey = getSecretKey();
            if (z) {
                cipher.init(2, secretKey, new IvParameterSpec(Utilities.hexToBytes(this.iv)));
            } else {
                cipher.init(1, secretKey);
            }
            return new BiometricPrompt$CryptoObject(cipher);
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public final void prompt(String str, boolean z, String str2, Utilities.Callback3 callback3) {
        int i;
        int i2;
        this.callback = null;
        try {
            if (this.prompt == null) {
                this.prompt = new zzbe(LaunchActivity.instance, ContextCompat.getMainExecutor(this.context), new BiometricPrompt$AuthenticationCallback() {
                    @Override
                    public final void onAuthenticationError(int i3, CharSequence charSequence) {
                        FileLog.d("BotBiometry onAuthenticationError " + i3 + " \"" + ((Object) charSequence) + "\"");
                        BotBiometry botBiometry = BotBiometry.this;
                        OAuthSheet$$ExternalSyntheticLambda18 oAuthSheet$$ExternalSyntheticLambda18 = botBiometry.callback;
                        if (oAuthSheet$$ExternalSyntheticLambda18 != null) {
                            botBiometry.callback = null;
                            oAuthSheet$$ExternalSyntheticLambda18.run(Boolean.FALSE, null);
                        }
                    }

                    @Override
                    public final void onAuthenticationFailed() {
                        FileLog.d("BotBiometry onAuthenticationFailed");
                    }

                    @Override
                    public final void onAuthenticationSucceeded(BiometricPrompt$AuthenticationResult biometricPrompt$AuthenticationResult) {
                        FileLog.d("BotBiometry onAuthenticationSucceeded");
                        BotBiometry botBiometry = BotBiometry.this;
                        OAuthSheet$$ExternalSyntheticLambda18 oAuthSheet$$ExternalSyntheticLambda18 = botBiometry.callback;
                        if (oAuthSheet$$ExternalSyntheticLambda18 != null) {
                            botBiometry.callback = null;
                            oAuthSheet$$ExternalSyntheticLambda18.run(Boolean.TRUE, biometricPrompt$AuthenticationResult);
                        }
                    }
                });
            }
            BiometricPrompt$CryptoObject biometricPrompt$CryptoObjectMakeCryptoObject = makeCryptoObject(z);
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.botId));
            zzbo zzboVar = new zzbo();
            zzboVar.zzd = UserObject.getUserName(user);
            zzboVar.zzb = LocaleController.getString(R.string.Back);
            zzboVar.zzc = 15;
            if (!TextUtils.isEmpty(str)) {
                zzboVar.f0zza = str;
            }
            zzca zzcaVarBuild = zzboVar.build();
            if (biometricPrompt$CryptoObjectMakeCryptoObject != null) {
                Cipher cipher = biometricPrompt$CryptoObjectMakeCryptoObject.mCipher;
                if (!z && (i2 = Build.VERSION.SDK_INT) >= 30) {
                    try {
                        if (TextUtils.isEmpty(str2)) {
                            this.encrypted_token = null;
                        } else if (i2 < 23) {
                            this.encrypted_token = str2;
                        } else {
                            this.encrypted_token = Utilities.bytesToHex(cipher.doFinal(str2.getBytes(StandardCharsets.UTF_8)));
                            this.iv = Utilities.bytesToHex(cipher.getIV());
                        }
                        save();
                        callback3.run(Boolean.TRUE, null, null);
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        biometricPrompt$CryptoObjectMakeCryptoObject = makeCryptoObject(z);
                    }
                }
            }
            this.callback = new OAuthSheet$$ExternalSyntheticLambda18(27, callback3, (biometricPrompt$CryptoObjectMakeCryptoObject == null || Build.VERSION.SDK_INT >= 30) ? null : biometricPrompt$CryptoObjectMakeCryptoObject);
            if (biometricPrompt$CryptoObjectMakeCryptoObject == null || (i = Build.VERSION.SDK_INT) >= 30) {
                this.prompt.authenticateInternal(zzcaVarBuild, null);
                return;
            }
            zzbe zzbeVar = this.prompt;
            zzbeVar.getClass();
            int i3 = zzcaVarBuild.zzd;
            int i4 = i3 != 0 ? i3 : 15;
            if ((i4 & 255) == 255) {
                throw new IllegalArgumentException("Crypto-based authentication is not supported for Class 2 (Weak) biometrics.");
            }
            if (i < 30 && AuthenticatorUtils.isDeviceCredentialAllowed(i4)) {
                throw new IllegalArgumentException("Crypto-based authentication is not supported for device credential prior to API 30.");
            }
            zzbeVar.authenticateInternal(zzcaVarBuild, biometricPrompt$CryptoObjectMakeCryptoObject);
        } catch (Exception e2) {
            FileLog.e(e2);
            callback3.run(Boolean.FALSE, null, null);
        }
    }

    public final void save() {
        SharedPreferences.Editor editorEdit = this.context.getSharedPreferences("2botbiometry_" + this.currentAccount, 0).edit();
        boolean z = this.access_requested;
        long j = this.botId;
        if (z) {
            editorEdit.putBoolean(j + "_requested", true);
        } else {
            editorEdit.remove(j + "_requested");
        }
        if (this.access_granted) {
            String strValueOf = String.valueOf(j);
            String str = this.encrypted_token;
            if (str == null) {
                str = "";
            }
            editorEdit.putString(strValueOf, str);
            String str2 = String.valueOf(j) + "_iv";
            String str3 = this.iv;
            editorEdit.putString(str2, str3 != null ? str3 : "");
        } else {
            editorEdit.remove(String.valueOf(j));
            editorEdit.remove(String.valueOf(j) + "_iv");
        }
        if (this.disabled) {
            editorEdit.putBoolean(j + "_disabled", true);
        } else {
            editorEdit.remove(j + "_disabled");
        }
        editorEdit.apply();
    }

    public final void updateToken(String str, final String str2, final ThemeActivity$$ExternalSyntheticLambda19 themeActivity$$ExternalSyntheticLambda19) {
        prompt(str, false, str2, new Utilities.Callback3() {
            @Override
            public final void run(Object obj, Object obj2, Object obj3) {
                String str3 = str2;
                Boolean bool = (Boolean) obj;
                BiometricPrompt$AuthenticationResult biometricPrompt$AuthenticationResult = (BiometricPrompt$AuthenticationResult) obj2;
                BiometricPrompt$CryptoObject biometricPrompt$CryptoObjectMakeCryptoObject = (BiometricPrompt$CryptoObject) obj3;
                BotBiometry botBiometry = this.f$0;
                botBiometry.getClass();
                if (biometricPrompt$AuthenticationResult != null) {
                    try {
                        if (TextUtils.isEmpty(str3)) {
                            botBiometry.encrypted_token = null;
                            botBiometry.iv = null;
                        } else {
                            int i = Build.VERSION.SDK_INT;
                            if (i < 23) {
                                botBiometry.encrypted_token = str3;
                                botBiometry.iv = null;
                            } else {
                                if (i >= 30) {
                                    biometricPrompt$CryptoObjectMakeCryptoObject = botBiometry.makeCryptoObject(false);
                                }
                                if (biometricPrompt$CryptoObjectMakeCryptoObject == null) {
                                    throw new RuntimeException("No cryptoObject found");
                                }
                                Cipher cipher = biometricPrompt$CryptoObjectMakeCryptoObject.mCipher;
                                botBiometry.encrypted_token = Utilities.bytesToHex(cipher.doFinal(str3.getBytes(StandardCharsets.UTF_8)));
                                botBiometry.iv = Utilities.bytesToHex(cipher.getIV());
                            }
                        }
                        botBiometry.save();
                    } catch (Exception e) {
                        FileLog.e(e);
                        bool = Boolean.FALSE;
                    }
                }
                themeActivity$$ExternalSyntheticLambda19.run(bool);
            }
        });
    }
}
