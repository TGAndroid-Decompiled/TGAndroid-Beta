package org.telegram.ui.Wallet;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.system.Os;
import android.system.OsConstants;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.KeyStore;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.iz0;
import org.telegram.ui.d80;
import org.telegram.ui.u90;
public final class p0 {
    public static final Object f37071f = new Object();
    public static final HashMap f37072g = new HashMap();
    public static final ExecutorService h = Executors.newSingleThreadExecutor(new e2.l0(5));
    public static final CopyOnWriteArrayList f37073i = new CopyOnWriteArrayList();
    public final Context f37074a;
    public final int f37075b;
    public final String f37076c;
    public final File d;
    public final String e;

    public p0(Context context, String str, int i10) {
        if (context != null && str != null && !str.isEmpty()) {
            Context applicationContext = context.getApplicationContext();
            context = applicationContext != null ? applicationContext : context;
            this.f37074a = context;
            this.f37075b = i10;
            this.f37076c = str;
            try {
                String o10 = o(MessageDigest.getInstance("SHA-256").digest(str.getBytes(StandardCharsets.UTF_8)));
                this.d = new File(new File(context.getNoBackupFilesDir(), "gramwallets"), o10.concat(".json"));
                this.e = a1.g.p("gramwallet_v2_", o10, "_");
                return;
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }
        throw new IllegalArgumentException("context/address");
    }

    public static byte[] A(String str) {
        if (str != null && str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 * 2;
                int digit = Character.digit(str.charAt(i11), 16);
                int digit2 = Character.digit(str.charAt(i11 + 1), 16);
                if (digit >= 0 && digit2 >= 0) {
                    bArr[i10] = (byte) (digit2 | (digit << 4));
                } else {
                    throw new IOException("hex digit");
                }
            }
            return bArr;
        }
        throw new IOException("hex length");
    }

    public static boolean i(Context context) {
        String str;
        if (context != null && (str = SharedConfig.passcodeHash) != null && str.length() != 0) {
            try {
                KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
                if (keyguardManager != null) {
                    if (keyguardManager.isDeviceSecure()) {
                        return true;
                    }
                }
                return false;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return false;
    }

    public static ArrayList n(Context context, long j10) {
        ArrayList arrayList;
        int i10;
        synchronized (f37071f) {
            arrayList = new ArrayList();
            File[] listFiles = new File(context.getNoBackupFilesDir(), "gramwallets").listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    if (file.getName().endsWith(".json")) {
                        try {
                            JSONObject jSONObject = new JSONObject(new String(w(file), StandardCharsets.UTF_8));
                            String string = jSONObject.getString("address");
                            p0 p0Var = new p0(context, string, 0);
                            if (p0Var.d.equals(file)) {
                                iz0 u10 = p0Var.u(jSONObject);
                                if (u10.f29408a == j10 && !((LinkedHashMap) u10.e).isEmpty()) {
                                    arrayList.add(string);
                                }
                            }
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                }
            }
            File[] listFiles2 = new File(context.getApplicationInfo().dataDir, "shared_prefs").listFiles();
            if (listFiles2 != null) {
                for (File file2 : listFiles2) {
                    String name = file2.getName();
                    if (name.endsWith(".xml.bak")) {
                        i10 = 8;
                    } else if (name.endsWith(".xml")) {
                        i10 = 4;
                    } else {
                        i10 = 0;
                    }
                    if (name.startsWith("gramwallet_") && i10 != 0) {
                        String substring = name.substring(11, name.length() - i10);
                        try {
                            p0 p0Var2 = new p0(context, substring, 0);
                            if (!p0Var2.d.exists()) {
                                iz0 r6 = p0Var2.r();
                                if (r6.f29408a == j10 && !((LinkedHashMap) r6.e).isEmpty() && !arrayList.contains(substring)) {
                                    arrayList.add(substring);
                                }
                            }
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public static String o(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        char[] charArray = "0123456789abcdef".toCharArray();
        for (int i10 = 0; i10 < bArr.length; i10++) {
            int i11 = i10 * 2;
            byte b10 = bArr[i10];
            cArr[i11] = charArray[(b10 & 255) >>> 4];
            cArr[i11 + 1] = charArray[b10 & 15];
        }
        return new String(cArr);
    }

    public static boolean t(java.lang.Exception r1) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.p0.t(java.lang.Exception):boolean");
    }

    public static byte[] w(File file) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[4096];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read != -1) {
                    if (byteArrayOutputStream.size() + read <= 4194304) {
                        byteArrayOutputStream.write(bArr, 0, read);
                    } else {
                        throw new IOException("wallet too large");
                    }
                } else {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    fileInputStream.close();
                    return byteArray;
                }
            }
        } catch (Throwable th2) {
            try {
                fileInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static boolean y(iz0 iz0Var, String str) {
        for (JSONObject jSONObject : ((LinkedHashMap) iz0Var.e).values()) {
            if (str.equals(jSONObject.optString("alias"))) {
                return true;
            }
        }
        return false;
    }

    public static synchronized void z(Runnable runnable) {
        synchronized (p0.class) {
            Iterator it = f37073i.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                Runnable runnable2 = (Runnable) weakReference.get();
                if (runnable2 == null || runnable2 == runnable) {
                    f37073i.remove(weakReference);
                }
            }
        }
    }

    public final void B() {
        synchronized (f37071f) {
            HashMap hashMap = f37072g;
            File file = this.d;
            hashMap.put(file.getAbsolutePath(), Long.valueOf(l() + 1));
            AndroidUtilities.runOnUIThread(new q0(file.getAbsolutePath(), 0));
            try {
                iz0 iz0Var = new iz0();
                iz0Var.f29410c = i(this.f37074a);
                v(iz0Var, new LinkedHashMap());
                d(iz0Var);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public final byte[] a(iz0 iz0Var, String str) {
        return ("GramWallet:2\n" + this.f37076c + "\n" + iz0Var.f29408a + "\n" + str + "\n" + iz0Var.f29410c).getBytes(StandardCharsets.UTF_8);
    }

    public final void b(long j10, boolean z10) {
        String str;
        m mVar;
        Object obj = f37071f;
        synchronized (obj) {
            c(j10);
        }
        String absolutePath = this.d.getAbsolutePath();
        di.d1 d1Var = new di.d1(this, j10, 12);
        v0 v0Var = new v0();
        v0Var.d = absolutePath;
        AndroidUtilities.runOnUIThread(new d80(v0Var, d1Var, z10, 12));
        try {
            if (!v0Var.f37361a.await(90L, TimeUnit.SECONDS)) {
                str = "AUTH_TIMEOUT";
                v0Var.f37362b = true;
                mVar = new m(v0Var, 4);
            } else {
                str = v0Var.f37363c;
                v0Var.f37362b = true;
                mVar = new m(v0Var, 4);
            }
            AndroidUtilities.runOnUIThread(mVar);
            synchronized (obj) {
                c(j10);
            }
            if (str == null) {
                return;
            }
            throw new Exception(str);
        } catch (Throwable th2) {
            v0Var.f37362b = true;
            AndroidUtilities.runOnUIThread(new m(v0Var, 4));
            throw th2;
        }
    }

    public final void c(long j10) {
        if (j10 == l()) {
            return;
        }
        throw new Exception("STORAGE_CANCELED");
    }

    public final void d(iz0 iz0Var) {
        String str = this.f37076c;
        try {
            FileDescriptor open = Os.open(this.d.getParent(), OsConstants.O_RDONLY, 0);
            Os.fsync(open);
            Os.close(open);
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            Enumeration<String> aliases = keyStore.aliases();
            while (aliases.hasMoreElements()) {
                String nextElement = aliases.nextElement();
                if (nextElement.startsWith(this.e) && !y(iz0Var, nextElement)) {
                    keyStore.deleteEntry(nextElement);
                }
            }
            if (!iz0Var.d) {
                if (q().edit().clear().commit()) {
                    keyStore.deleteEntry("gramwallet_free_" + str);
                    keyStore.deleteEntry("gramwallet_lock_" + str);
                    return;
                }
                throw new IOException("legacy cleanup");
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void e(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            synchronized (f37071f) {
                try {
                    iz0 r6 = r();
                    KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                    keyStore.load(null);
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        String str = (String) obj;
                        if (!y(r6, str)) {
                            keyStore.deleteEntry(str);
                        }
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
    }

    public final boolean f(byte[] bArr) {
        boolean containsKey;
        if (bArr == null || bArr.length == 0) {
            return false;
        }
        synchronized (f37071f) {
            try {
                try {
                    containsKey = ((LinkedHashMap) r().e).containsKey(o(bArr));
                } catch (Exception e) {
                    FileLog.e(e);
                    return false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return containsKey;
    }

    public final byte[] g(iz0 iz0Var, String str) {
        String str2;
        Key key;
        JSONObject jSONObject = (JSONObject) ((LinkedHashMap) iz0Var.e).get(str);
        if (jSONObject != null) {
            if (jSONObject.optBoolean("legacy", false)) {
                String string = q().getString("swkey", null);
                if (string != null) {
                    key = new SecretKeySpec(Base64.decode(string, 2), "AES");
                } else {
                    KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                    keyStore.load(null);
                    StringBuilder sb2 = new StringBuilder();
                    if (iz0Var.f29410c) {
                        str2 = "gramwallet_lock_";
                    } else {
                        str2 = "gramwallet_free_";
                    }
                    sb2.append(str2);
                    sb2.append(this.f37076c);
                    Key key2 = keyStore.getKey(sb2.toString(), null);
                    if (key2 instanceof SecretKey) {
                        key = (SecretKey) key2;
                    } else {
                        throw new IOException("legacy key missing");
                    }
                }
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
                cipher.init(2, key, new IvParameterSpec(A(jSONObject.getString("iv"))));
                return cipher.doFinal(A(jSONObject.getString("ciphertext")));
            }
            Cipher cipher2 = Cipher.getInstance("AES/GCM/NoPadding");
            cipher2.init(2, x(jSONObject), new GCMParameterSpec(128, Base64.decode(jSONObject.getString("iv"), 2)));
            cipher2.updateAAD(a(iz0Var, str));
            return cipher2.doFinal(Base64.decode(jSONObject.getString("ciphertext"), 2));
        }
        throw new IOException("record missing");
    }

    public final i0 h(iz0 iz0Var, String str, long j10) {
        byte[] g7;
        try {
            g7 = g(iz0Var, str);
        } catch (Exception e) {
            if (iz0Var.f29410c && t(e)) {
                b(j10, false);
                try {
                    g7 = g(iz0Var, str);
                } catch (Exception e10) {
                    if (t(e10)) {
                        b(j10, true);
                        g7 = g(iz0Var, str);
                    } else {
                        throw e10;
                    }
                }
            } else {
                throw e;
            }
        }
        try {
            return new i0(g7);
        } finally {
            Arrays.fill(g7, (byte) 0);
        }
    }

    public final JSONObject j(iz0 iz0Var, String str, i0 i0Var, ArrayList arrayList, long j10) {
        Cipher k10;
        String str2 = this.e + UUID.randomUUID();
        arrayList.add(str2);
        JSONObject put = new JSONObject().put("alias", str2);
        int i10 = Build.VERSION.SDK_INT;
        KeyGenParameterSpec.Builder userAuthenticationRequired = new KeyGenParameterSpec.Builder(str2, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setUserAuthenticationRequired(iz0Var.f29410c);
        if (iz0Var.f29410c) {
            if (i10 >= 30) {
                userAuthenticationRequired.setUserAuthenticationParameters(30, 3);
            } else {
                userAuthenticationRequired.setUserAuthenticationValidityDurationSeconds(30);
            }
            if (i10 >= 24) {
                userAuthenticationRequired.setInvalidatedByBiometricEnrollment(false);
            }
        }
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(userAuthenticationRequired.build());
        keyGenerator.generateKey();
        try {
            k10 = k(iz0Var, str, put);
        } catch (Exception e) {
            if (iz0Var.f29410c && t(e)) {
                b(j10, false);
                try {
                    k10 = k(iz0Var, str, put);
                } catch (Exception e10) {
                    if (t(e10)) {
                        b(j10, true);
                        k10 = k(iz0Var, str, put);
                    } else {
                        throw e10;
                    }
                }
            } else {
                throw e;
            }
        }
        byte[] c10 = i0Var.c();
        try {
            put.put("ciphertext", Base64.encodeToString(k10.doFinal(c10), 2));
            put.put("iv", Base64.encodeToString(k10.getIV(), 2));
            return put;
        } finally {
            Arrays.fill(c10, (byte) 0);
        }
    }

    public final Cipher k(iz0 iz0Var, String str, JSONObject jSONObject) {
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, x(jSONObject));
        cipher.updateAAD(a(iz0Var, str));
        return cipher;
    }

    public final long l() {
        long longValue;
        synchronized (f37071f) {
            Long l4 = (Long) f37072g.get(this.d.getAbsolutePath());
            if (l4 == null) {
                longValue = 0;
            } else {
                longValue = l4.longValue();
            }
        }
        return longValue;
    }

    public final byte[][] m() {
        byte[][] bArr;
        synchronized (f37071f) {
            try {
                try {
                    ArrayList arrayList = new ArrayList();
                    for (String str : ((LinkedHashMap) r().e).keySet()) {
                        arrayList.add(A(str));
                    }
                    bArr = (byte[][]) arrayList.toArray(new byte[0]);
                } catch (Exception e) {
                    FileLog.e(e);
                    return new byte[0];
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bArr;
    }

    public final void p(long j10, byte[] bArr, i0 i0Var, Utilities.Callback callback) {
        i0 b10;
        String o10;
        if (i0Var == null) {
            b10 = null;
        } else {
            b10 = i0Var.b();
        }
        i0 i0Var2 = b10;
        if (bArr == null) {
            o10 = "";
        } else {
            o10 = o(bArr);
        }
        h.execute(new bi.j3(this, o10, i0Var2, l(), j10, callback));
    }

    public final SharedPreferences q() {
        return this.f37074a.getSharedPreferences("gramwallet_" + this.f37076c, 0);
    }

    public final iz0 r() {
        File file = this.d;
        if (file.exists()) {
            return u(new JSONObject(new String(w(file), StandardCharsets.UTF_8)));
        }
        iz0 iz0Var = new iz0();
        SharedPreferences q5 = q();
        iz0Var.f29410c = q5.getBoolean("locked", i(this.f37074a));
        iz0Var.f29408a = q5.getLong("userId", 0L);
        iz0Var.f29409b = q5.getInt("lastUsageDate", 0);
        if (q5.contains("phrase")) {
            String o10 = o(A(q5.getString("pubkey", "")));
            if (!o10.isEmpty()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("legacy", true);
                jSONObject.put("ciphertext", q5.getString("phrase", null));
                jSONObject.put("iv", q5.getString("iv", null));
                ((LinkedHashMap) iz0Var.e).put(o10, jSONObject);
                iz0Var.d = true;
                return iz0Var;
            }
            throw new IOException("legacy public key missing");
        }
        return iz0Var;
    }

    public final void s(iz0 iz0Var, String str, LinkedHashMap linkedHashMap, ArrayList arrayList, long j10) {
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) iz0Var.e;
        ArrayList arrayList2 = new ArrayList(linkedHashMap2.keySet());
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            String str2 = (String) obj;
            if (!str2.equals(str) && ((JSONObject) linkedHashMap2.get(str2)).optBoolean("legacy", false)) {
                i0 h10 = h(iz0Var, str2, j10);
                linkedHashMap.put(str2, h10);
                linkedHashMap2.put(str2, j(iz0Var, str2, h10, arrayList, j10));
            }
        }
        iz0Var.d = false;
    }

    public final iz0 u(JSONObject jSONObject) {
        if (jSONObject.getInt("version") == 2) {
            if (this.f37076c.equals(jSONObject.getString("address"))) {
                iz0 iz0Var = new iz0();
                iz0Var.f29408a = jSONObject.getLong("userId");
                iz0Var.f29409b = jSONObject.getInt("lastUsage");
                iz0Var.f29410c = jSONObject.getBoolean("locked");
                JSONObject jSONObject2 = jSONObject.getJSONObject("records");
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (!next.isEmpty() && next.equals(o(A(next)))) {
                        JSONObject jSONObject3 = jSONObject2.getJSONObject(next);
                        ((LinkedHashMap) iz0Var.e).put(next, jSONObject3);
                        iz0Var.d |= jSONObject3.optBoolean("legacy", false);
                    } else {
                        throw new IOException("public key encoding");
                    }
                }
                return iz0Var;
            }
        }
        throw new IOException("wallet format/address");
    }

    public final void v(iz0 iz0Var, LinkedHashMap linkedHashMap) {
        boolean exists;
        boolean delete;
        File file = this.d;
        File parentFile = file.getParentFile();
        if (!parentFile.isDirectory() && !parentFile.mkdirs()) {
            throw new IOException("wallet directory");
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : ((LinkedHashMap) iz0Var.e).entrySet()) {
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
        String jSONObject2 = new JSONObject().put("version", 2).put("address", this.f37076c).put("userId", iz0Var.f29408a).put("lastUsage", iz0Var.f29409b).put("locked", iz0Var.f29410c).put("records", jSONObject).toString();
        Charset charset = StandardCharsets.UTF_8;
        byte[] bytes = jSONObject2.getBytes(charset);
        if (bytes.length <= 4194304) {
            File file2 = new File(parentFile, file.getName() + ".pending");
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                fileOutputStream.write(bytes);
                fileOutputStream.flush();
                fileOutputStream.getFD().sync();
                fileOutputStream.close();
                byte[] w10 = w(file2);
                if (Arrays.equals(bytes, w10)) {
                    iz0 u10 = u(new JSONObject(new String(w10, charset)));
                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                        byte[] c10 = ((i0) entry2.getValue()).c();
                        byte[] g7 = g(u10, (String) entry2.getKey());
                        if (MessageDigest.isEqual(c10, g7)) {
                            Arrays.fill(c10, (byte) 0);
                            if (g7 != null) {
                                Arrays.fill(g7, (byte) 0);
                            }
                        } else {
                            throw new IOException("wallet decryption mismatch");
                        }
                    }
                    Os.rename(file2.getAbsolutePath(), file.getAbsolutePath());
                    AndroidUtilities.runOnUIThread(new u90(12));
                    if (exists) {
                        if (!delete) {
                            return;
                        }
                        return;
                    }
                    return;
                }
                throw new IOException("wallet read-back mismatch");
            } finally {
                if (file2.exists() && !file2.delete()) {
                    FileLog.e(new IOException("wallet staging cleanup"));
                }
            }
        }
        throw new IOException("wallet too large");
    }

    public final SecretKey x(JSONObject jSONObject) {
        String string = jSONObject.getString("alias");
        if (string.startsWith(this.e)) {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            Key key = keyStore.getKey(string, null);
            if (key != null) {
                if (jSONObject.has("wrappedKey")) {
                    Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                    cipher.init(2, key);
                    byte[] doFinal = cipher.doFinal(Base64.decode(jSONObject.getString("wrappedKey"), 2));
                    try {
                        if (doFinal.length == 32) {
                            return new SecretKeySpec(doFinal, "AES");
                        }
                        throw new IOException("wrapped key length");
                    } finally {
                        Arrays.fill(doFinal, (byte) 0);
                    }
                } else if (key instanceof SecretKey) {
                    return (SecretKey) key;
                } else {
                    throw new IOException("keystore key type");
                }
            }
            throw new IOException("keystore key missing");
        }
        throw new IOException("key alias outside wallet");
    }
}
