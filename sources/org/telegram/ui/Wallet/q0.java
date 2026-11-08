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
import org.telegram.messenger.c20;
import org.telegram.messenger.iz;
import org.telegram.ui.Components.ew0;
import org.telegram.ui.g60;
import org.telegram.ui.o61;
public final class q0 {
    public static final Object f43047f = new Object();
    public static final HashMap f43048g = new HashMap();
    public static final ExecutorService h = Executors.newSingleThreadExecutor(new h2.l0(4));
    public static final CopyOnWriteArrayList f43049i = new CopyOnWriteArrayList();
    public final Context f43050a;
    public final int f43051b;
    public final String f43052c;
    public final File d;
    public final String f43053e;

    public q0(int i7, Context context, String str) {
        if (context != null && str != null && !str.isEmpty()) {
            Context applicationContext = context.getApplicationContext();
            context = applicationContext != null ? applicationContext : context;
            this.f43050a = context;
            this.f43051b = i7;
            this.f43052c = str;
            try {
                String o4 = o(MessageDigest.getInstance("SHA-256").digest(str.getBytes(StandardCharsets.UTF_8)));
                this.d = new File(new File(context.getNoBackupFilesDir(), "gramwallets"), o4.concat(".json"));
                this.f43053e = a8.p0.p("gramwallet_v2_", o4, "_");
                return;
            } catch (Exception e10) {
                throw new IllegalStateException(e10);
            }
        }
        throw new IllegalArgumentException("context/address");
    }

    public static byte[] A(String str) {
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
        if (context != null && (str = iz.f23434s) != null && str.length() != 0) {
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

    public static ArrayList n(Context context, long j3) {
        ArrayList arrayList;
        int i7;
        synchronized (f43047f) {
            arrayList = new ArrayList();
            File[] listFiles = new File(context.getNoBackupFilesDir(), "gramwallets").listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    if (file.getName().endsWith(".json")) {
                        try {
                            JSONObject jSONObject = new JSONObject(new String(w(file), StandardCharsets.UTF_8));
                            String string = jSONObject.getString("address");
                            q0 q0Var = new q0(0, context, string);
                            if (q0Var.d.equals(file)) {
                                ew0 u10 = q0Var.u(jSONObject);
                                if (u10.f33391a == j3 && !((LinkedHashMap) u10.f33394e).isEmpty()) {
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
                            q0 q0Var2 = new q0(0, context, substring);
                            if (!q0Var2.d.exists()) {
                                ew0 r10 = q0Var2.r();
                                if (r10.f33391a == j3 && !((LinkedHashMap) r10.f33394e).isEmpty() && !arrayList.contains(substring)) {
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

    public static String o(byte[] bArr) {
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

    public static boolean t(java.lang.Exception r1) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.q0.t(java.lang.Exception):boolean");
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

    public static boolean y(ew0 ew0Var, String str) {
        for (JSONObject jSONObject : ((LinkedHashMap) ew0Var.f33394e).values()) {
            if (str.equals(jSONObject.optString("alias"))) {
                return true;
            }
        }
        return false;
    }

    public static synchronized void z(Runnable runnable) {
        synchronized (q0.class) {
            Iterator it = f43049i.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                Runnable runnable2 = (Runnable) weakReference.get();
                if (runnable2 == null || runnable2 == runnable) {
                    f43049i.remove(weakReference);
                }
            }
        }
    }

    public final void B() {
        synchronized (f43047f) {
            HashMap hashMap = f43048g;
            File file = this.d;
            hashMap.put(file.getAbsolutePath(), Long.valueOf(l() + 1));
            org.telegram.messenger.g0.h3(new r0(file.getAbsolutePath(), 0));
            try {
                ew0 ew0Var = new ew0();
                ew0Var.f33393c = i(this.f43050a);
                v(ew0Var, new LinkedHashMap());
                d(ew0Var);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public final byte[] a(ew0 ew0Var, String str) {
        return ("GramWallet:2\n" + this.f43052c + "\n" + ew0Var.f33391a + "\n" + str + "\n" + ew0Var.f33393c).getBytes(StandardCharsets.UTF_8);
    }

    public final void b(long j3, boolean z9) {
        String str;
        l lVar;
        Object obj = f43047f;
        synchronized (obj) {
            c(j3);
        }
        String absolutePath = this.d.getAbsolutePath();
        di.c1 c1Var = new di.c1(this, j3, 11);
        v0 v0Var = new v0();
        v0Var.d = absolutePath;
        org.telegram.messenger.g0.h3(new g60(v0Var, c1Var, z9, 12));
        try {
            if (!v0Var.f43217a.await(90L, TimeUnit.SECONDS)) {
                str = "AUTH_TIMEOUT";
                v0Var.f43218b = true;
                lVar = new l(v0Var, 4);
            } else {
                str = v0Var.f43219c;
                v0Var.f43218b = true;
                lVar = new l(v0Var, 4);
            }
            org.telegram.messenger.g0.h3(lVar);
            synchronized (obj) {
                c(j3);
            }
            if (str == null) {
                return;
            }
            throw new Exception(str);
        } catch (Throwable th2) {
            v0Var.f43218b = true;
            org.telegram.messenger.g0.h3(new l(v0Var, 4));
            throw th2;
        }
    }

    public final void c(long j3) {
        if (j3 == l()) {
            return;
        }
        throw new Exception("STORAGE_CANCELED");
    }

    public final void d(ew0 ew0Var) {
        String str = this.f43052c;
        try {
            FileDescriptor open = Os.open(this.d.getParent(), OsConstants.O_RDONLY, 0);
            Os.fsync(open);
            Os.close(open);
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            Enumeration<String> aliases = keyStore.aliases();
            while (aliases.hasMoreElements()) {
                String nextElement = aliases.nextElement();
                if (nextElement.startsWith(this.f43053e) && !y(ew0Var, nextElement)) {
                    keyStore.deleteEntry(nextElement);
                }
            }
            if (!ew0Var.d) {
                if (q().edit().clear().commit()) {
                    keyStore.deleteEntry("gramwallet_free_" + str);
                    keyStore.deleteEntry("gramwallet_lock_" + str);
                    return;
                }
                throw new IOException("legacy cleanup");
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void e(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            synchronized (f43047f) {
                try {
                    ew0 r10 = r();
                    KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                    keyStore.load(null);
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        String str = (String) obj;
                        if (!y(r10, str)) {
                            keyStore.deleteEntry(str);
                        }
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
        }
    }

    public final boolean f(byte[] bArr) {
        boolean containsKey;
        if (bArr != null && bArr.length != 0) {
            synchronized (f43047f) {
                try {
                    try {
                        containsKey = ((LinkedHashMap) r().f33394e).containsKey(o(bArr));
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        return false;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return containsKey;
        }
        return false;
    }

    public final byte[] g(ew0 ew0Var, String str) {
        String str2;
        Key key;
        JSONObject jSONObject = (JSONObject) ((LinkedHashMap) ew0Var.f33394e).get(str);
        if (jSONObject != null) {
            if (jSONObject.optBoolean("legacy", false)) {
                String string = q().getString("swkey", null);
                if (string != null) {
                    key = new SecretKeySpec(Base64.decode(string, 2), "AES");
                } else {
                    KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                    keyStore.load(null);
                    StringBuilder sb2 = new StringBuilder();
                    if (ew0Var.f33393c) {
                        str2 = "gramwallet_lock_";
                    } else {
                        str2 = "gramwallet_free_";
                    }
                    sb2.append(str2);
                    sb2.append(this.f43052c);
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
            cipher2.updateAAD(a(ew0Var, str));
            return cipher2.doFinal(Base64.decode(jSONObject.getString("ciphertext"), 2));
        }
        throw new IOException("record missing");
    }

    public final j0 h(ew0 ew0Var, String str, long j3) {
        byte[] g10;
        try {
            g10 = g(ew0Var, str);
        } catch (Exception e10) {
            if (ew0Var.f33393c && t(e10)) {
                b(j3, false);
                try {
                    g10 = g(ew0Var, str);
                } catch (Exception e11) {
                    if (t(e11)) {
                        b(j3, true);
                        g10 = g(ew0Var, str);
                    } else {
                        throw e11;
                    }
                }
            } else {
                throw e10;
            }
        }
        try {
            return new j0(g10);
        } finally {
            Arrays.fill(g10, (byte) 0);
        }
    }

    public final JSONObject j(ew0 ew0Var, String str, j0 j0Var, ArrayList arrayList, long j3) {
        Cipher k10;
        String str2 = this.f43053e + UUID.randomUUID();
        arrayList.add(str2);
        JSONObject put = new JSONObject().put("alias", str2);
        int i7 = Build.VERSION.SDK_INT;
        KeyGenParameterSpec.Builder userAuthenticationRequired = new KeyGenParameterSpec.Builder(str2, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setUserAuthenticationRequired(ew0Var.f33393c);
        if (ew0Var.f33393c) {
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
            k10 = k(ew0Var, str, put);
        } catch (Exception e10) {
            if (ew0Var.f33393c && t(e10)) {
                b(j3, false);
                try {
                    k10 = k(ew0Var, str, put);
                } catch (Exception e11) {
                    if (t(e11)) {
                        b(j3, true);
                        k10 = k(ew0Var, str, put);
                    } else {
                        throw e11;
                    }
                }
            } else {
                throw e10;
            }
        }
        byte[] c10 = j0Var.c();
        try {
            put.put("ciphertext", Base64.encodeToString(k10.doFinal(c10), 2));
            put.put("iv", Base64.encodeToString(k10.getIV(), 2));
            return put;
        } finally {
            Arrays.fill(c10, (byte) 0);
        }
    }

    public final Cipher k(ew0 ew0Var, String str, JSONObject jSONObject) {
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, x(jSONObject));
        cipher.updateAAD(a(ew0Var, str));
        return cipher;
    }

    public final long l() {
        long longValue;
        synchronized (f43047f) {
            Long l10 = (Long) f43048g.get(this.d.getAbsolutePath());
            if (l10 == null) {
                longValue = 0;
            } else {
                longValue = l10.longValue();
            }
        }
        return longValue;
    }

    public final byte[][] m() {
        byte[][] bArr;
        synchronized (f43047f) {
            try {
                try {
                    ArrayList arrayList = new ArrayList();
                    for (String str : ((LinkedHashMap) r().f33394e).keySet()) {
                        arrayList.add(A(str));
                    }
                    bArr = (byte[][]) arrayList.toArray(new byte[0]);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return new byte[0];
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bArr;
    }

    public final void p(long j3, byte[] bArr, j0 j0Var, c20 c20Var) {
        j0 b10;
        String o4;
        if (j0Var == null) {
            b10 = null;
        } else {
            b10 = j0Var.b();
        }
        j0 j0Var2 = b10;
        if (bArr == null) {
            o4 = "";
        } else {
            o4 = o(bArr);
        }
        h.execute(new bi.i3(this, o4, j0Var2, l(), j3, c20Var));
    }

    public final SharedPreferences q() {
        return this.f43050a.getSharedPreferences("gramwallet_" + this.f43052c, 0);
    }

    public final ew0 r() {
        File file = this.d;
        if (file.exists()) {
            return u(new JSONObject(new String(w(file), StandardCharsets.UTF_8)));
        }
        ew0 ew0Var = new ew0();
        SharedPreferences q10 = q();
        ew0Var.f33393c = q10.getBoolean("locked", i(this.f43050a));
        ew0Var.f33391a = q10.getLong("userId", 0L);
        ew0Var.f33392b = q10.getInt("lastUsageDate", 0);
        if (q10.contains("phrase")) {
            String o4 = o(A(q10.getString("pubkey", "")));
            if (!o4.isEmpty()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("legacy", true);
                jSONObject.put("ciphertext", q10.getString("phrase", null));
                jSONObject.put("iv", q10.getString("iv", null));
                ((LinkedHashMap) ew0Var.f33394e).put(o4, jSONObject);
                ew0Var.d = true;
                return ew0Var;
            }
            throw new IOException("legacy public key missing");
        }
        return ew0Var;
    }

    public final void s(ew0 ew0Var, String str, LinkedHashMap linkedHashMap, ArrayList arrayList, long j3) {
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) ew0Var.f33394e;
        ArrayList arrayList2 = new ArrayList(linkedHashMap2.keySet());
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            String str2 = (String) obj;
            if (!str2.equals(str) && ((JSONObject) linkedHashMap2.get(str2)).optBoolean("legacy", false)) {
                j0 h7 = h(ew0Var, str2, j3);
                linkedHashMap.put(str2, h7);
                linkedHashMap2.put(str2, j(ew0Var, str2, h7, arrayList, j3));
            }
        }
        ew0Var.d = false;
    }

    public final ew0 u(JSONObject jSONObject) {
        if (jSONObject.getInt("version") == 2) {
            if (this.f43052c.equals(jSONObject.getString("address"))) {
                ew0 ew0Var = new ew0();
                ew0Var.f33391a = jSONObject.getLong("userId");
                ew0Var.f33392b = jSONObject.getInt("lastUsage");
                ew0Var.f33393c = jSONObject.getBoolean("locked");
                JSONObject jSONObject2 = jSONObject.getJSONObject("records");
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (!next.isEmpty() && next.equals(o(A(next)))) {
                        JSONObject jSONObject3 = jSONObject2.getJSONObject(next);
                        ((LinkedHashMap) ew0Var.f33394e).put(next, jSONObject3);
                        ew0Var.d |= jSONObject3.optBoolean("legacy", false);
                    } else {
                        throw new IOException("public key encoding");
                    }
                }
                return ew0Var;
            }
        }
        throw new IOException("wallet format/address");
    }

    public final void v(ew0 ew0Var, LinkedHashMap linkedHashMap) {
        boolean exists;
        boolean delete;
        File file = this.d;
        File parentFile = file.getParentFile();
        if (!parentFile.isDirectory() && !parentFile.mkdirs()) {
            throw new IOException("wallet directory");
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : ((LinkedHashMap) ew0Var.f33394e).entrySet()) {
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
        String jSONObject2 = new JSONObject().put("version", 2).put("address", this.f43052c).put("userId", ew0Var.f33391a).put("lastUsage", ew0Var.f33392b).put("locked", ew0Var.f33393c).put("records", jSONObject).toString();
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
                    ew0 u10 = u(new JSONObject(new String(w10, charset)));
                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                        byte[] c10 = ((j0) entry2.getValue()).c();
                        byte[] g10 = g(u10, (String) entry2.getKey());
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
                    org.telegram.messenger.g0.h3(new o61(4));
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

    public final SecretKey x(JSONObject jSONObject) {
        String string = jSONObject.getString("alias");
        if (string.startsWith(this.f43053e)) {
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
