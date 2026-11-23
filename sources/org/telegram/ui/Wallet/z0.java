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
import org.telegram.messenger.cz;
import org.telegram.messenger.y10;
import org.telegram.ui.Components.qw0;
import org.telegram.ui.b80;
import org.telegram.ui.cd0;
public final class z0 {
    public static final Object f45376g = new Object();
    public static final HashMap h = new HashMap();
    public static final ExecutorService f45377i = Executors.newSingleThreadExecutor(new ai.z0(4));
    public static final CopyOnWriteArrayList f45378j = new CopyOnWriteArrayList();
    public final Context f45379a;
    public final int f45380b;
    public final String f45381c;
    public final File d;
    public final String f45382e;
    public volatile Exception f45383f;

    public z0(int i7, Context context, String str) {
        if (context != null && str != null && !str.isEmpty()) {
            Context applicationContext = context.getApplicationContext();
            context = applicationContext != null ? applicationContext : context;
            this.f45379a = context;
            this.f45380b = i7;
            this.f45381c = str;
            try {
                String p10 = p(MessageDigest.getInstance("SHA-256").digest(str.getBytes(StandardCharsets.UTF_8)));
                this.d = new File(new File(context.getNoBackupFilesDir(), "gramwallets"), p10.concat(".json"));
                this.f45382e = a8.p0.p("gramwallet_v2_", p10, "_");
                return;
            } catch (Exception e10) {
                throw new IllegalStateException(e10);
            }
        }
        throw new IllegalArgumentException("context/address");
    }

    public static synchronized void A(Runnable runnable) {
        synchronized (z0.class) {
            Iterator it = f45378j.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                Runnable runnable2 = (Runnable) weakReference.get();
                if (runnable2 == null || runnable2 == runnable) {
                    f45378j.remove(weakReference);
                }
            }
        }
    }

    public static byte[] B(String str) {
        if (str != null && str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i7 = 0; i7 < length; i7++) {
                int i10 = i7 * 2;
                int digit = Character.digit(str.charAt(i10), 16);
                int digit2 = Character.digit(str.charAt(i10 + 1), 16);
                if (digit >= 0 && digit2 >= 0) {
                    bArr[i7] = (byte) (digit2 | (digit << 4));
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
        if (context != null && (str = cz.f23439s) != null && str.length() != 0) {
            try {
                KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
                if (keyguardManager != null) {
                    if (keyguardManager.isDeviceSecure()) {
                        return true;
                    }
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        return false;
    }

    public static ArrayList o(Context context, long j3) {
        ArrayList arrayList;
        int i7;
        synchronized (f45376g) {
            arrayList = new ArrayList();
            File[] listFiles = new File(context.getNoBackupFilesDir(), "gramwallets").listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    if (file.getName().endsWith(".json")) {
                        try {
                            JSONObject jSONObject = new JSONObject(new String(x(file), StandardCharsets.UTF_8));
                            String string = jSONObject.getString("address");
                            z0 z0Var = new z0(0, context, string);
                            if (z0Var.d.equals(file)) {
                                qw0 v = z0Var.v(jSONObject);
                                if (v.f39006a == j3 && !((LinkedHashMap) v.f39009e).isEmpty()) {
                                    arrayList.add(string);
                                }
                            }
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                    }
                }
            }
            File[] listFiles2 = new File(context.getApplicationInfo().dataDir, "shared_prefs").listFiles();
            if (listFiles2 != null) {
                for (File file2 : listFiles2) {
                    String name = file2.getName();
                    if (name.endsWith(".xml.bak")) {
                        i7 = 8;
                    } else if (name.endsWith(".xml")) {
                        i7 = 4;
                    } else {
                        i7 = 0;
                    }
                    if (name.startsWith("gramwallet_") && i7 != 0) {
                        String substring = name.substring(11, name.length() - i7);
                        try {
                            z0 z0Var2 = new z0(0, context, substring);
                            if (!z0Var2.d.exists()) {
                                qw0 s5 = z0Var2.s();
                                if (s5.f39006a == j3 && !((LinkedHashMap) s5.f39009e).isEmpty() && !arrayList.contains(substring)) {
                                    arrayList.add(substring);
                                }
                            }
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public static String p(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        char[] charArray = "0123456789abcdef".toCharArray();
        for (int i7 = 0; i7 < bArr.length; i7++) {
            int i10 = i7 * 2;
            byte b10 = bArr[i7];
            cArr[i10] = charArray[(b10 & 255) >>> 4];
            cArr[i10 + 1] = charArray[b10 & 15];
        }
        return new String(cArr);
    }

    public static boolean u(java.lang.Exception r1) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.z0.u(java.lang.Exception):boolean");
    }

    public static byte[] x(File file) {
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

    public static boolean z(qw0 qw0Var, String str) {
        for (JSONObject jSONObject : ((LinkedHashMap) qw0Var.f39009e).values()) {
            if (str.equals(jSONObject.optString("alias"))) {
                return true;
            }
        }
        return false;
    }

    public final void C() {
        synchronized (f45376g) {
            HashMap hashMap = h;
            File file = this.d;
            hashMap.put(file.getAbsolutePath(), Long.valueOf(l() + 1));
            org.telegram.messenger.g0.g3(new a1(file.getAbsolutePath(), 0));
            try {
                this.f45383f = null;
                qw0 qw0Var = new qw0();
                qw0Var.f39008c = i(this.f45379a);
                w(qw0Var, new LinkedHashMap());
                d(qw0Var);
            } catch (Exception e10) {
                m(e10);
            }
        }
    }

    public final byte[] a(qw0 qw0Var, String str) {
        return ("GramWallet:2\n" + this.f45381c + "\n" + qw0Var.f39006a + "\n" + str + "\n" + qw0Var.f39008c).getBytes(StandardCharsets.UTF_8);
    }

    public final void b(long j3, boolean z10) {
        String str;
        m mVar;
        Object obj = f45376g;
        synchronized (obj) {
            c(j3);
        }
        String absolutePath = this.d.getAbsolutePath();
        ai.d0 d0Var = new ai.d0(this, j3, 12);
        e1 e1Var = new e1();
        e1Var.d = absolutePath;
        org.telegram.messenger.g0.g3(new b80(e1Var, d0Var, z10, 11));
        try {
            if (!e1Var.f44144a.await(90L, TimeUnit.SECONDS)) {
                str = "AUTH_TIMEOUT";
                e1Var.f44145b = true;
                mVar = new m(e1Var, 3);
            } else {
                str = e1Var.f44146c;
                e1Var.f44145b = true;
                mVar = new m(e1Var, 3);
            }
            org.telegram.messenger.g0.g3(mVar);
            synchronized (obj) {
                c(j3);
            }
            if (str == null) {
                return;
            }
            throw new Exception(str);
        } catch (Throwable th2) {
            e1Var.f44145b = true;
            org.telegram.messenger.g0.g3(new m(e1Var, 3));
            throw th2;
        }
    }

    public final void c(long j3) {
        if (j3 == l()) {
            return;
        }
        throw new Exception("STORAGE_CANCELED");
    }

    public final void d(qw0 qw0Var) {
        String str = this.f45381c;
        try {
            FileDescriptor open = Os.open(this.d.getParent(), OsConstants.O_RDONLY, 0);
            Os.fsync(open);
            Os.close(open);
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            Enumeration<String> aliases = keyStore.aliases();
            while (aliases.hasMoreElements()) {
                String nextElement = aliases.nextElement();
                if (nextElement.startsWith(this.f45382e) && !z(qw0Var, nextElement)) {
                    keyStore.deleteEntry(nextElement);
                }
            }
            if (!qw0Var.d) {
                if (r().edit().clear().commit()) {
                    keyStore.deleteEntry("gramwallet_free_" + str);
                    keyStore.deleteEntry("gramwallet_lock_" + str);
                    return;
                }
                throw new IOException("legacy cleanup");
            }
        } catch (Exception e10) {
            m(e10);
        }
    }

    public final void e(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            synchronized (f45376g) {
                try {
                    qw0 s5 = s();
                    KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                    keyStore.load(null);
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        String str = (String) obj;
                        if (!z(s5, str)) {
                            keyStore.deleteEntry(str);
                        }
                    }
                } catch (Exception e10) {
                    m(e10);
                }
            }
        }
    }

    public final boolean f(byte[] bArr) {
        boolean containsKey;
        if (bArr == null || bArr.length == 0) {
            return false;
        }
        synchronized (f45376g) {
            try {
                try {
                    containsKey = ((LinkedHashMap) s().f39009e).containsKey(p(bArr));
                } catch (Exception e10) {
                    m(e10);
                    return false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return containsKey;
    }

    public final byte[] g(qw0 qw0Var, String str) {
        String str2;
        Key key;
        JSONObject jSONObject = (JSONObject) ((LinkedHashMap) qw0Var.f39009e).get(str);
        if (jSONObject != null) {
            if (jSONObject.optBoolean("legacy", false)) {
                String string = r().getString("swkey", null);
                if (string != null) {
                    key = new SecretKeySpec(Base64.decode(string, 2), "AES");
                } else {
                    KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                    keyStore.load(null);
                    StringBuilder sb2 = new StringBuilder();
                    if (qw0Var.f39008c) {
                        str2 = "gramwallet_lock_";
                    } else {
                        str2 = "gramwallet_free_";
                    }
                    sb2.append(str2);
                    sb2.append(this.f45381c);
                    Key key2 = keyStore.getKey(sb2.toString(), null);
                    if (key2 instanceof SecretKey) {
                        key = (SecretKey) key2;
                    } else {
                        throw new IOException("legacy key missing");
                    }
                }
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
                cipher.init(2, key, new IvParameterSpec(B(jSONObject.getString("iv"))));
                return cipher.doFinal(B(jSONObject.getString("ciphertext")));
            }
            Cipher cipher2 = Cipher.getInstance("AES/GCM/NoPadding");
            cipher2.init(2, y(jSONObject), new GCMParameterSpec(128, Base64.decode(jSONObject.getString("iv"), 2)));
            cipher2.updateAAD(a(qw0Var, str));
            return cipher2.doFinal(Base64.decode(jSONObject.getString("ciphertext"), 2));
        }
        throw new IOException("record missing");
    }

    public final r0 h(qw0 qw0Var, String str, long j3) {
        byte[] g10;
        try {
            g10 = g(qw0Var, str);
        } catch (Exception e10) {
            if (qw0Var.f39008c && u(e10)) {
                b(j3, false);
                try {
                    g10 = g(qw0Var, str);
                } catch (Exception e11) {
                    if (u(e11)) {
                        b(j3, true);
                        g10 = g(qw0Var, str);
                    } else {
                        throw e11;
                    }
                }
            } else {
                throw e10;
            }
        }
        try {
            return new r0(g10);
        } finally {
            Arrays.fill(g10, (byte) 0);
        }
    }

    public final JSONObject j(qw0 qw0Var, String str, r0 r0Var, ArrayList arrayList, long j3) {
        Cipher k10;
        String str2 = this.f45382e + UUID.randomUUID();
        arrayList.add(str2);
        JSONObject put = new JSONObject().put("alias", str2);
        int i7 = Build.VERSION.SDK_INT;
        KeyGenParameterSpec.Builder userAuthenticationRequired = new KeyGenParameterSpec.Builder(str2, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setUserAuthenticationRequired(qw0Var.f39008c);
        if (qw0Var.f39008c) {
            if (i7 >= 30) {
                userAuthenticationRequired.setUserAuthenticationParameters(30, 3);
            } else {
                userAuthenticationRequired.setUserAuthenticationValidityDurationSeconds(30);
            }
            if (i7 >= 24) {
                userAuthenticationRequired.setInvalidatedByBiometricEnrollment(false);
            }
        }
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(userAuthenticationRequired.build());
        keyGenerator.generateKey();
        try {
            k10 = k(qw0Var, str, put);
        } catch (Exception e10) {
            if (qw0Var.f39008c && u(e10)) {
                b(j3, false);
                try {
                    k10 = k(qw0Var, str, put);
                } catch (Exception e11) {
                    if (u(e11)) {
                        b(j3, true);
                        k10 = k(qw0Var, str, put);
                    } else {
                        throw e11;
                    }
                }
            } else {
                throw e10;
            }
        }
        byte[] c10 = r0Var.c();
        try {
            put.put("ciphertext", Base64.encodeToString(k10.doFinal(c10), 2));
            put.put("iv", Base64.encodeToString(k10.getIV(), 2));
            return put;
        } finally {
            Arrays.fill(c10, (byte) 0);
        }
    }

    public final Cipher k(qw0 qw0Var, String str, JSONObject jSONObject) {
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, y(jSONObject));
        cipher.updateAAD(a(qw0Var, str));
        return cipher;
    }

    public final long l() {
        long longValue;
        synchronized (f45376g) {
            Long l10 = (Long) h.get(this.d.getAbsolutePath());
            if (l10 == null) {
                longValue = 0;
            } else {
                longValue = l10.longValue();
            }
        }
        return longValue;
    }

    public final void m(Exception exc) {
        this.f45383f = exc;
        org.telegram.messenger.a8.g(exc, true);
    }

    public final byte[][] n() {
        byte[][] bArr;
        synchronized (f45376g) {
            try {
                try {
                    ArrayList arrayList = new ArrayList();
                    for (String str : ((LinkedHashMap) s().f39009e).keySet()) {
                        arrayList.add(B(str));
                    }
                    bArr = (byte[][]) arrayList.toArray(new byte[0]);
                } catch (Exception e10) {
                    m(e10);
                    return new byte[0];
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bArr;
    }

    public final void q(long j3, byte[] bArr, r0 r0Var, y10 y10Var) {
        r0 b10;
        String p10;
        if (r0Var == null) {
            b10 = null;
        } else {
            b10 = r0Var.b();
        }
        r0 r0Var2 = b10;
        if (bArr == null) {
            p10 = "";
        } else {
            p10 = p(bArr);
        }
        f45377i.execute(new di.l2(this, p10, r0Var2, l(), j3, y10Var));
    }

    public final SharedPreferences r() {
        return this.f45379a.getSharedPreferences("gramwallet_" + this.f45381c, 0);
    }

    public final qw0 s() {
        File file = this.d;
        if (file.exists()) {
            return v(new JSONObject(new String(x(file), StandardCharsets.UTF_8)));
        }
        qw0 qw0Var = new qw0();
        SharedPreferences r10 = r();
        qw0Var.f39008c = r10.getBoolean("locked", i(this.f45379a));
        qw0Var.f39006a = r10.getLong("userId", 0L);
        qw0Var.f39007b = r10.getInt("lastUsageDate", 0);
        if (r10.contains("phrase")) {
            String p10 = p(B(r10.getString("pubkey", "")));
            if (!p10.isEmpty()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("legacy", true);
                jSONObject.put("ciphertext", r10.getString("phrase", null));
                jSONObject.put("iv", r10.getString("iv", null));
                ((LinkedHashMap) qw0Var.f39009e).put(p10, jSONObject);
                qw0Var.d = true;
                return qw0Var;
            }
            throw new IOException("legacy public key missing");
        }
        return qw0Var;
    }

    public final void t(qw0 qw0Var, String str, LinkedHashMap linkedHashMap, ArrayList arrayList, long j3) {
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) qw0Var.f39009e;
        ArrayList arrayList2 = new ArrayList(linkedHashMap2.keySet());
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            String str2 = (String) obj;
            if (!str2.equals(str) && ((JSONObject) linkedHashMap2.get(str2)).optBoolean("legacy", false)) {
                r0 h7 = h(qw0Var, str2, j3);
                linkedHashMap.put(str2, h7);
                linkedHashMap2.put(str2, j(qw0Var, str2, h7, arrayList, j3));
            }
        }
        qw0Var.d = false;
    }

    public final qw0 v(JSONObject jSONObject) {
        if (jSONObject.getInt("version") == 2) {
            if (this.f45381c.equals(jSONObject.getString("address"))) {
                qw0 qw0Var = new qw0();
                qw0Var.f39006a = jSONObject.getLong("userId");
                qw0Var.f39007b = jSONObject.getInt("lastUsage");
                qw0Var.f39008c = jSONObject.getBoolean("locked");
                JSONObject jSONObject2 = jSONObject.getJSONObject("records");
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (!next.isEmpty() && next.equals(p(B(next)))) {
                        JSONObject jSONObject3 = jSONObject2.getJSONObject(next);
                        ((LinkedHashMap) qw0Var.f39009e).put(next, jSONObject3);
                        qw0Var.d |= jSONObject3.optBoolean("legacy", false);
                    } else {
                        throw new IOException("public key encoding");
                    }
                }
                return qw0Var;
            }
        }
        throw new IOException("wallet format/address");
    }

    public final void w(qw0 qw0Var, LinkedHashMap linkedHashMap) {
        boolean exists;
        boolean delete;
        File file = this.d;
        File parentFile = file.getParentFile();
        if (!parentFile.isDirectory() && !parentFile.mkdirs()) {
            throw new IOException("wallet directory");
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : ((LinkedHashMap) qw0Var.f39009e).entrySet()) {
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
        String jSONObject2 = new JSONObject().put("version", 2).put("address", this.f45381c).put("userId", qw0Var.f39006a).put("lastUsage", qw0Var.f39007b).put("locked", qw0Var.f39008c).put("records", jSONObject).toString();
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
                byte[] x10 = x(file2);
                if (Arrays.equals(bytes, x10)) {
                    qw0 v = v(new JSONObject(new String(x10, charset)));
                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                        byte[] c10 = ((r0) entry2.getValue()).c();
                        byte[] g10 = g(v, (String) entry2.getKey());
                        if (MessageDigest.isEqual(c10, g10)) {
                            Arrays.fill(c10, (byte) 0);
                            if (g10 != null) {
                                Arrays.fill(g10, (byte) 0);
                            }
                        } else {
                            throw new IOException("wallet decryption mismatch");
                        }
                    }
                    Os.rename(file2.getAbsolutePath(), file.getAbsolutePath());
                    org.telegram.messenger.g0.g3(new cd0(10));
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
                    org.telegram.messenger.a8.g(new IOException("wallet staging cleanup"), true);
                }
            }
        }
        throw new IOException("wallet too large");
    }

    public final SecretKey y(JSONObject jSONObject) {
        String string = jSONObject.getString("alias");
        if (string.startsWith(this.f45382e)) {
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
