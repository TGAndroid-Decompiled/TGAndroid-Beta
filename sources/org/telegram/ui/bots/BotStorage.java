package org.telegram.ui.bots;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import android.widget.FrameLayout;
import android.widget.TextView;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.TextHelper;

public final class BotStorage {
    public final int account;
    public final long bot_id;
    public final boolean secured;
    public String storage_id;
    public final long user_id;

    public final class C1StorageCell extends FrameLayout {
        public final String id;
        public final boolean needDivider;
        public final RadioButton radioButton;

        public C1StorageCell(StorageConfig storageConfig, boolean z, Context context) {
            super(context);
            this.id = storageConfig.storage_id;
            RadioButton radioButton = new RadioButton(context);
            this.radioButton = radioButton;
            radioButton.setSize(AndroidUtilities.dp(20.0f));
            radioButton.setColor(Theme.getColor(null, Theme.key_dialogRadioBackground, false), Theme.getColor(null, Theme.key_dialogRadioBackgroundChecked, false));
            addView(radioButton, LayoutHelper.createFrame(22, 22.0f, 19, 20.0f, 0.0f, 0.0f, 0.0f));
            TextView textViewMakeTextView = TextHelper.makeTextView(context, 16.0f, Theme.key_windowBackgroundWhiteBlackText, true);
            textViewMakeTextView.setText(storageConfig.user_name);
            addView(textViewMakeTextView, LayoutHelper.createLinear(-1, -2, 7, 62, 9, 8, 0));
            TextView textViewMakeTextView2 = TextHelper.makeTextView(context, 14.0f, Theme.key_windowBackgroundWhiteGrayText, false);
            textViewMakeTextView2.setText(LocaleController.formatString(R.string.BotRestoreStorageCreatedAt, LocaleController.formatString(R.string.formatDateAtTime, LocaleController.formatSmallDateChat(storageConfig.created_at / 1000), LocaleController.getInstance().getFormatterDay().format(new Date(storageConfig.created_at / 1000)))));
            addView(textViewMakeTextView2, LayoutHelper.createLinear(-1, -2, 7, 62, 32, 8, 0));
            this.needDivider = z;
            setWillNotDraw(!z);
        }

        @Override
        public final void onDraw(Canvas canvas) {
            if (this.needDivider) {
                canvas.drawLine(AndroidUtilities.dp(62.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, Theme.dividerPaint);
            }
        }
    }

    public final class StorageConfig {
        public long created_at;
        public long edited_at;
        public String storage_id;
        public long user_id;
        public String user_name;
    }

    public BotStorage(long j, long j2, int i, boolean z) {
        this.account = i;
        this.bot_id = j2;
        this.user_id = j;
        this.secured = z;
    }

    public static File getDir() {
        try {
            File filesDir = ApplicationLoader.applicationContext.getFilesDir();
            if (filesDir != null) {
                File file = new File(filesDir, "apps_storage/");
                file.mkdirs();
                if ((filesDir.exists() || filesDir.mkdirs()) && filesDir.canWrite()) {
                    return file;
                }
            }
        } catch (Exception unused) {
        }
        return new File("");
    }

    public static SecretKey getSecretKey() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
        if (Build.VERSION.SDK_INT < 23) {
            throw new RuntimeException("UNSUPPORTED");
        }
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        if (!keyStore.containsAlias("MiniAppsKey")) {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            keyGenerator.init(BotStorage$$ExternalSyntheticApiModelOutline0.m3591m().setBlockModes("GCM").setEncryptionPaddings("NoPadding").setUserAuthenticationRequired(false).build());
            keyGenerator.generateKey();
        }
        return (SecretKey) keyStore.getKey("MiniAppsKey", null);
    }

    public static HashMap readConfig() {
        HashMap map = new HashMap();
        try {
            File file = new File(getDir(), "secure_config.json");
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[(int) file.length()];
                fileInputStream.read(bArr);
                fileInputStream.close();
                JSONObject jSONObject = new JSONObject(new String(bArr));
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                    StorageConfig storageConfig = new StorageConfig();
                    storageConfig.storage_id = next;
                    storageConfig.user_id = jSONObject2.getLong("user_id");
                    storageConfig.user_name = jSONObject2.getString("user_name");
                    storageConfig.created_at = jSONObject2.getLong("created_at");
                    storageConfig.edited_at = jSONObject2.getLong("edited_at");
                    map.put(next, storageConfig);
                }
            } catch (OutOfMemoryError e) {
                FileLog.e(e);
                throw new RuntimeException("QUOTA_EXCEEDED");
            }
        } catch (Exception e2) {
            FileLog.e(e2);
        }
        return map;
    }

    public static void saveConfig(HashMap map) {
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : map.entrySet()) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("user_id", ((StorageConfig) entry.getValue()).user_id);
                jSONObject2.put("user_name", ((StorageConfig) entry.getValue()).user_name);
                jSONObject2.put("created_at", ((StorageConfig) entry.getValue()).created_at);
                jSONObject2.put("edited_at", ((StorageConfig) entry.getValue()).edited_at);
                jSONObject.put((String) entry.getKey(), jSONObject2);
            }
            File file = new File(getDir(), "secure_config.json");
            byte[] bytes = jSONObject.toString().getBytes();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(bytes);
            fileOutputStream.close();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final byte[] getBytes(File file) throws IOException {
        byte[] bArr;
        FileInputStream fileInputStream = new FileInputStream(file);
        int length = (int) file.length();
        boolean z = this.secured;
        if (z) {
            int i = fileInputStream.read();
            bArr = new byte[i];
            length = (length - 1) - i;
            fileInputStream.read(bArr);
        } else {
            bArr = null;
        }
        try {
            byte[] bArr2 = new byte[length];
            fileInputStream.read(bArr2);
            fileInputStream.close();
            if (!z) {
                return bArr2;
            }
            try {
                Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                cipher.init(2, getSecretKey(), new GCMParameterSpec(128, bArr));
                return cipher.doFinal(bArr2);
            } catch (Exception e) {
                FileLog.e(e);
                setBytes(file, "{}".getBytes());
                throw new RuntimeException("UNKNOWN_ERROR");
            }
        } catch (OutOfMemoryError e2) {
            FileLog.e(e2);
            throw new RuntimeException("QUOTA_EXCEEDED");
        }
    }

    public final File getFile(String str) {
        File dir = getDir();
        StringBuilder sb = new StringBuilder();
        long j = this.user_id;
        boolean z = this.secured;
        Object objValueOf = str;
        if (!z) {
            objValueOf = Long.valueOf(j);
        }
        sb.append(objValueOf);
        sb.append("_");
        long j2 = this.bot_id;
        sb.append(j2);
        sb.append(z ? "_s" : "");
        File file = new File(dir, sb.toString());
        File dir2 = getDir();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(j2);
        sb2.append(z ? "_s" : "");
        File file2 = new File(dir2, sb2.toString());
        if (!file.exists() && file2.exists()) {
            file2.renameTo(file);
            return file;
        }
        if (z) {
            File file3 = new File(getDir(), j + "_" + j2 + "_s");
            if (!file.exists() && file3.exists()) {
                file3.renameTo(file);
            }
        }
        return file;
    }

    public final JSONObject getJSON(File file) {
        if (!file.exists() || file.length() > 5242880) {
            return new JSONObject();
        }
        try {
            return new JSONObject(new String(getBytes(file)));
        } catch (Exception e) {
            FileLog.e(e);
            return new JSONObject();
        }
    }

    public final Pair getKey(String str) {
        boolean z = this.secured;
        if (z && Build.VERSION.SDK_INT < 23) {
            throw new RuntimeException("UNSUPPORTED");
        }
        JSONObject json = getJSON(getFile());
        String strOptString = json.optString(str);
        boolean z2 = false;
        if (z && strOptString == null && !json.keys().hasNext()) {
            HashSet hashSet = new HashSet();
            for (int i = 0; i < 4; i++) {
                UserConfig userConfig = UserConfig.getInstance(i);
                if (userConfig.isClientActivated()) {
                    hashSet.add(Long.valueOf(userConfig.getClientUserId()));
                }
            }
            Iterator it = ((Set) Collection.EL.stream(readConfig().values()).filter(new BotStorage$$ExternalSyntheticLambda6(hashSet, 1)).collect(Collectors.toSet())).iterator();
            while (it.hasNext()) {
                try {
                    File file = getFile(((StorageConfig) it.next()).storage_id);
                    if (file.exists() && getJSON(file).has(str)) {
                        z2 = true;
                        break;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
        return new Pair(strOptString, Boolean.valueOf(z2));
    }

    public final ArrayList getStoragesWithKey(String str) {
        if (this.secured && Build.VERSION.SDK_INT < 23) {
            throw new RuntimeException("UNSUPPORTED");
        }
        if (getJSON(getFile()).keys().hasNext()) {
            throw new RuntimeException("STORAGE_NOT_EMPTY");
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (int i = 0; i < 4; i++) {
            UserConfig userConfig = UserConfig.getInstance(i);
            if (userConfig.isClientActivated()) {
                hashSet.add(Long.valueOf(userConfig.getClientUserId()));
            }
        }
        for (StorageConfig storageConfig : (Set) Collection.EL.stream(readConfig().values()).filter(new BotStorage$$ExternalSyntheticLambda6(hashSet, 0)).collect(Collectors.toSet())) {
            try {
                File file = getFile(storageConfig.storage_id);
                if (file.exists() && getJSON(file).has(str)) {
                    arrayList.add(storageConfig);
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return arrayList;
    }

    public final void restoreFrom(String str) {
        if (this.secured && Build.VERSION.SDK_INT < 23) {
            throw new RuntimeException("UNSUPPORTED");
        }
        if (getJSON(getFile()).keys().hasNext()) {
            throw new RuntimeException("STORAGE_NOT_EMPTY");
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < 4; i++) {
            UserConfig userConfig = UserConfig.getInstance(i);
            if (userConfig.isClientActivated()) {
                hashSet.add(Long.valueOf(userConfig.getClientUserId()));
            }
        }
        HashMap config = readConfig();
        StorageConfig storageConfig = (StorageConfig) config.get(str);
        if (storageConfig == null) {
            throw new RuntimeException("STORAGE_NOT_FOUND");
        }
        storageConfig.user_id = this.user_id;
        storageConfig.user_name = DialogObject.getName(UserConfig.getInstance(this.account).getCurrentUser());
        storageConfig.edited_at = System.currentTimeMillis();
        saveConfig(config);
        this.storage_id = storageConfig.storage_id;
    }

    public final void setBytes(File file, byte[] bArr) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        if (this.secured) {
            try {
                Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                cipher.init(1, getSecretKey());
                byte[] iv = cipher.getIV();
                fileOutputStream.write(iv.length);
                fileOutputStream.write(iv);
                bArr = cipher.doFinal(bArr);
            } catch (Exception e) {
                FileLog.e(e);
                throw new RuntimeException("UNKNOWN_ERROR");
            }
        }
        fileOutputStream.write(bArr);
        fileOutputStream.close();
    }

    public final void setJSON(JSONObject jSONObject) {
        try {
            byte[] bytes = jSONObject.toString().getBytes();
            if (bytes.length > 5242880) {
                throw new RuntimeException("QUOTA_EXCEEDED");
            }
            try {
                setBytes(getFile(), bytes);
            } catch (Exception e) {
                FileLog.e(e);
                throw new RuntimeException("UNKNOWN_ERROR");
            }
        } catch (Exception e2) {
            FileLog.e(e2);
            throw new RuntimeException("UNKNOWN_ERROR");
        } catch (OutOfMemoryError e3) {
            FileLog.e(e3);
            throw new RuntimeException("QUOTA_EXCEEDED");
        }
    }

    public final void setKey(String str, String str2) {
        boolean z = this.secured;
        if (z && Build.VERSION.SDK_INT < 23) {
            throw new RuntimeException("UNSUPPORTED");
        }
        if (str2.length() + str.length() > 5242880) {
            throw new RuntimeException("QUOTA_EXCEEDED");
        }
        JSONObject json = getJSON(getFile());
        try {
            json.put(str, str2);
            if (json.length() > 10 && z) {
                throw new RuntimeException("QUOTA_EXCEEDED");
            }
            setJSON(json);
            if (z) {
                try {
                    HashMap config = readConfig();
                    StorageConfig storageConfig = (StorageConfig) config.get(this.storage_id);
                    if (storageConfig != null) {
                        storageConfig.edited_at = System.currentTimeMillis();
                        saveConfig(config);
                    }
                } catch (Exception unused) {
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
            throw new RuntimeException("UNKNOWN_ERROR");
        }
    }

    public final File getFile() {
        long j;
        if (this.secured && TextUtils.isEmpty(this.storage_id)) {
            HashMap config = readConfig();
            Iterator it = config.entrySet().iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                j = this.user_id;
                if (!zHasNext) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((StorageConfig) entry.getValue()).user_id == j) {
                    this.storage_id = (String) entry.getKey();
                    break;
                }
            }
            if (TextUtils.isEmpty(this.storage_id)) {
                String string = UUID.randomUUID().toString();
                this.storage_id = string;
                StorageConfig storageConfig = new StorageConfig();
                storageConfig.storage_id = string;
                storageConfig.user_id = j;
                storageConfig.user_name = DialogObject.getName(UserConfig.getInstance(this.account).getCurrentUser());
                long jCurrentTimeMillis = System.currentTimeMillis();
                storageConfig.edited_at = jCurrentTimeMillis;
                storageConfig.created_at = jCurrentTimeMillis;
                config.put(this.storage_id, storageConfig);
                saveConfig(config);
            }
        }
        return getFile(this.storage_id);
    }
}
