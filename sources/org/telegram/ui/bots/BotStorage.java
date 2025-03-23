package org.telegram.ui.bots;

import android.content.Context;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.security.KeyStore;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import org.json.JSONObject;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;

public class BotStorage {
    public final long bot_id;
    public final Context context;
    public final boolean secured;

    public BotStorage(Context context, long j, boolean z) {
        this.context = context;
        this.bot_id = j;
        this.secured = z;
    }

    private byte[] getBytes(File file) {
        byte[] bArr;
        FileInputStream fileInputStream = new FileInputStream(file);
        int length = (int) file.length();
        if (this.secured) {
            int read = fileInputStream.read();
            bArr = new byte[read];
            length = (length - 1) - read;
            fileInputStream.read(bArr);
        } else {
            bArr = null;
        }
        try {
            byte[] bArr2 = new byte[length];
            fileInputStream.read(bArr2);
            fileInputStream.close();
            if (!this.secured) {
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

    public static File getDir() {
        try {
            File filesDir = ApplicationLoader.applicationContext.getFilesDir();
            if (filesDir != null) {
                File file = new File(filesDir, "apps_storage/");
                file.mkdirs();
                if (filesDir.exists() || filesDir.mkdirs()) {
                    if (filesDir.canWrite()) {
                        return file;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return new File("");
    }

    private JSONObject getJSON() {
        File file = getFile();
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

    private SecretKey getSecretKey() {
        KeyGenParameterSpec.Builder blockModes;
        KeyGenParameterSpec.Builder encryptionPaddings;
        KeyGenParameterSpec.Builder userAuthenticationRequired;
        KeyGenParameterSpec build;
        if (Build.VERSION.SDK_INT < 23) {
            throw new RuntimeException("UNSUPPORTED");
        }
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        if (!keyStore.containsAlias("MiniAppsKey")) {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            blockModes = new KeyGenParameterSpec.Builder("MiniAppsKey", 3).setBlockModes("GCM");
            encryptionPaddings = blockModes.setEncryptionPaddings("NoPadding");
            userAuthenticationRequired = encryptionPaddings.setUserAuthenticationRequired(false);
            build = userAuthenticationRequired.build();
            keyGenerator.init(build);
            keyGenerator.generateKey();
        }
        return (SecretKey) keyStore.getKey("MiniAppsKey", null);
    }

    public static boolean isSecuredSupported() {
        return Build.VERSION.SDK_INT >= 23;
    }

    private void setBytes(File file, byte[] bArr) {
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

    private void setJSON(JSONObject jSONObject) {
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

    public void clear() {
        setJSON(new JSONObject());
    }

    public File getFile() {
        File dir = getDir();
        StringBuilder sb = new StringBuilder();
        sb.append(this.bot_id);
        sb.append(this.secured ? "_s" : "");
        return new File(dir, sb.toString());
    }

    public String getKey(String str) {
        if (!this.secured || isSecuredSupported()) {
            return getJSON().optString(str);
        }
        throw new RuntimeException("UNSUPPORTED");
    }

    public void setKey(String str, String str2) {
        if (this.secured && !isSecuredSupported()) {
            throw new RuntimeException("UNSUPPORTED");
        }
        if (str.length() + str2.length() > 5242880) {
            throw new RuntimeException("QUOTA_EXCEEDED");
        }
        JSONObject json = getJSON();
        try {
            json.put(str, str2);
            if (json.length() > 10 && this.secured) {
                throw new RuntimeException("QUOTA_EXCEEDED");
            }
            setJSON(json);
        } catch (Exception e) {
            FileLog.e(e);
            throw new RuntimeException("UNKNOWN_ERROR");
        }
    }
}
