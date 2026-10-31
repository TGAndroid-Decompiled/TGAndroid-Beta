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
import org.telegram.messenger.q20;
import org.telegram.messenger.tz;
import org.telegram.ui.Components.ix0;
import org.telegram.ui.bk0;
public final class p0 {
    public static final Object f35000f = new Object();
    public static final HashMap f35001g = new HashMap();
    public static final ExecutorService h = Executors.newSingleThreadExecutor(new di.n(8));
    public static final CopyOnWriteArrayList f35002i = new CopyOnWriteArrayList();
    public final Context f35003a;
    public final int f35004b;
    public final String f35005c;
    public final File d;
    public final String e;

    public p0(int i10, Context context, String str) {
        if (context != null && str != null && !str.isEmpty()) {
            Context applicationContext = context.getApplicationContext();
            context = applicationContext != null ? applicationContext : context;
            this.f35003a = context;
            this.f35004b = i10;
            this.f35005c = str;
            try {
                String o10 = o(MessageDigest.getInstance("SHA-256").digest(str.getBytes(StandardCharsets.UTF_8)));
                this.d = new File(new File(context.getNoBackupFilesDir(), "gramwallets"), o10.concat(".json"));
                this.e = a1.g.n("gramwallet_v2_", o10, "_");
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
        if (context != null && (str = tz.f18180s) != null && str.length() != 0) {
            try {
                KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
                if (keyguardManager != null) {
                    if (keyguardManager.isDeviceSecure()) {
                        return true;
                    }
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
        return false;
    }

    public static ArrayList n(Context context, long j10) {
        ArrayList arrayList;
        int i10;
        synchronized (f35000f) {
            arrayList = new ArrayList();
            File[] listFiles = new File(context.getNoBackupFilesDir(), "gramwallets").listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    if (file.getName().endsWith(".json")) {
                        try {
                            JSONObject jSONObject = new JSONObject(new String(w(file), StandardCharsets.UTF_8));
                            String string = jSONObject.getString("address");
                            p0 p0Var = new p0(0, context, string);
                            if (p0Var.d.equals(file)) {
                                ix0 u10 = p0Var.u(jSONObject);
                                if (u10.f27119a == j10 && !((LinkedHashMap) u10.e).isEmpty()) {
                                    arrayList.add(string);
                                }
                            }
                        } catch (Exception e) {
                            org.telegram.messenger.f8.g(e, true);
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
                            p0 p0Var2 = new p0(0, context, substring);
                            if (!p0Var2.d.exists()) {
                                ix0 r10 = p0Var2.r();
                                if (r10.f27119a == j10 && !((LinkedHashMap) r10.e).isEmpty() && !arrayList.contains(substring)) {
                                    arrayList.add(substring);
                                }
                            }
                        } catch (Exception e7) {
                            org.telegram.messenger.f8.g(e7, true);
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

    public static boolean y(ix0 ix0Var, String str) {
        for (JSONObject jSONObject : ((LinkedHashMap) ix0Var.e).values()) {
            if (str.equals(jSONObject.optString("alias"))) {
                return true;
            }
        }
        return false;
    }

    public static synchronized void z(Runnable runnable) {
        synchronized (p0.class) {
            Iterator it = f35002i.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                Runnable runnable2 = (Runnable) weakReference.get();
                if (runnable2 == null || runnable2 == runnable) {
                    f35002i.remove(weakReference);
                }
            }
        }
    }

    public final void B() {
        synchronized (f35000f) {
            HashMap hashMap = f35001g;
            File file = this.d;
            hashMap.put(file.getAbsolutePath(), Long.valueOf(l() + 1));
            org.telegram.messenger.i0.g3(new q0(file.getAbsolutePath(), 0));
            try {
                ix0 ix0Var = new ix0();
                ix0Var.f27121c = i(this.f35003a);
                v(ix0Var, new LinkedHashMap());
                d(ix0Var);
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
    }

    public final byte[] a(ix0 ix0Var, String str) {
        return ("GramWallet:2\n" + this.f35005c + "\n" + ix0Var.f27119a + "\n" + str + "\n" + ix0Var.f27121c).getBytes(StandardCharsets.UTF_8);
    }

    public final void b(long j10, boolean z10) {
        String str;
        l lVar;
        Object obj = f35000f;
        synchronized (obj) {
            c(j10);
        }
        String absolutePath = this.d.getAbsolutePath();
        m4.x0 x0Var = new m4.x0(this, j10, 10);
        u0 u0Var = new u0();
        u0Var.d = absolutePath;
        org.telegram.messenger.i0.g3(new bk0(u0Var, x0Var, z10, 9));
        try {
            if (!u0Var.f35258a.await(90L, TimeUnit.SECONDS)) {
                str = "AUTH_TIMEOUT";
                u0Var.f35259b = true;
                lVar = new l(u0Var, 4);
            } else {
                str = u0Var.f35260c;
                u0Var.f35259b = true;
                lVar = new l(u0Var, 4);
            }
            org.telegram.messenger.i0.g3(lVar);
            synchronized (obj) {
                c(j10);
            }
            if (str == null) {
                return;
            }
            throw new Exception(str);
        } catch (Throwable th2) {
            u0Var.f35259b = true;
            org.telegram.messenger.i0.g3(new l(u0Var, 4));
            throw th2;
        }
    }

    public final void c(long j10) {
        if (j10 == l()) {
            return;
        }
        throw new Exception("STORAGE_CANCELED");
    }

    public final void d(ix0 ix0Var) {
        String str = this.f35005c;
        try {
            FileDescriptor open = Os.open(this.d.getParent(), OsConstants.O_RDONLY, 0);
            Os.fsync(open);
            Os.close(open);
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            Enumeration<String> aliases = keyStore.aliases();
            while (aliases.hasMoreElements()) {
                String nextElement = aliases.nextElement();
                if (nextElement.startsWith(this.e) && !y(ix0Var, nextElement)) {
                    keyStore.deleteEntry(nextElement);
                }
            }
            if (!ix0Var.d) {
                if (q().edit().clear().commit()) {
                    keyStore.deleteEntry("gramwallet_free_" + str);
                    keyStore.deleteEntry("gramwallet_lock_" + str);
                    return;
                }
                throw new IOException("legacy cleanup");
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final void e(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            synchronized (f35000f) {
                try {
                    ix0 r10 = r();
                    KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                    keyStore.load(null);
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        String str = (String) obj;
                        if (!y(r10, str)) {
                            keyStore.deleteEntry(str);
                        }
                    }
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
            }
        }
    }

    public final boolean f(byte[] bArr) {
        boolean containsKey;
        if (bArr != null && bArr.length != 0) {
            synchronized (f35000f) {
                try {
                    try {
                        containsKey = ((LinkedHashMap) r().e).containsKey(o(bArr));
                    } catch (Exception e) {
                        org.telegram.messenger.f8.g(e, true);
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

    public final byte[] g(ix0 ix0Var, String str) {
        String str2;
        Key key;
        JSONObject jSONObject = (JSONObject) ((LinkedHashMap) ix0Var.e).get(str);
        if (jSONObject != null) {
            if (jSONObject.optBoolean("legacy", false)) {
                String string = q().getString("swkey", null);
                if (string != null) {
                    key = new SecretKeySpec(Base64.decode(string, 2), "AES");
                } else {
                    KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                    keyStore.load(null);
                    StringBuilder sb2 = new StringBuilder();
                    if (ix0Var.f27121c) {
                        str2 = "gramwallet_lock_";
                    } else {
                        str2 = "gramwallet_free_";
                    }
                    sb2.append(str2);
                    sb2.append(this.f35005c);
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
            cipher2.updateAAD(a(ix0Var, str));
            return cipher2.doFinal(Base64.decode(jSONObject.getString("ciphertext"), 2));
        }
        throw new IOException("record missing");
    }

    public final h0 h(ix0 ix0Var, String str, long j10) {
        byte[] g10;
        try {
            g10 = g(ix0Var, str);
        } catch (Exception e) {
            if (ix0Var.f27121c && t(e)) {
                b(j10, false);
                try {
                    g10 = g(ix0Var, str);
                } catch (Exception e7) {
                    if (t(e7)) {
                        b(j10, true);
                        g10 = g(ix0Var, str);
                    } else {
                        throw e7;
                    }
                }
            } else {
                throw e;
            }
        }
        try {
            return new h0(g10);
        } finally {
            Arrays.fill(g10, (byte) 0);
        }
    }

    public final JSONObject j(ix0 ix0Var, String str, h0 h0Var, ArrayList arrayList, long j10) {
        Cipher k10;
        String str2 = this.e + UUID.randomUUID();
        arrayList.add(str2);
        JSONObject put = new JSONObject().put("alias", str2);
        int i10 = Build.VERSION.SDK_INT;
        KeyGenParameterSpec.Builder userAuthenticationRequired = new KeyGenParameterSpec.Builder(str2, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setUserAuthenticationRequired(ix0Var.f27121c);
        if (ix0Var.f27121c) {
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
            k10 = k(ix0Var, str, put);
        } catch (Exception e) {
            if (ix0Var.f27121c && t(e)) {
                b(j10, false);
                try {
                    k10 = k(ix0Var, str, put);
                } catch (Exception e7) {
                    if (t(e7)) {
                        b(j10, true);
                        k10 = k(ix0Var, str, put);
                    } else {
                        throw e7;
                    }
                }
            } else {
                throw e;
            }
        }
        byte[] c10 = h0Var.c();
        try {
            put.put("ciphertext", Base64.encodeToString(k10.doFinal(c10), 2));
            put.put("iv", Base64.encodeToString(k10.getIV(), 2));
            return put;
        } finally {
            Arrays.fill(c10, (byte) 0);
        }
    }

    public final Cipher k(ix0 ix0Var, String str, JSONObject jSONObject) {
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, x(jSONObject));
        cipher.updateAAD(a(ix0Var, str));
        return cipher;
    }

    public final long l() {
        long longValue;
        synchronized (f35000f) {
            Long l4 = (Long) f35001g.get(this.d.getAbsolutePath());
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
        synchronized (f35000f) {
            try {
                try {
                    ArrayList arrayList = new ArrayList();
                    for (String str : ((LinkedHashMap) r().e).keySet()) {
                        arrayList.add(A(str));
                    }
                    bArr = (byte[][]) arrayList.toArray(new byte[0]);
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return new byte[0];
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bArr;
    }

    public final void p(long j10, byte[] bArr, h0 h0Var, q20 q20Var) {
        h0 b10;
        String o10;
        if (h0Var == null) {
            b10 = null;
        } else {
            b10 = h0Var.b();
        }
        h0 h0Var2 = b10;
        if (bArr == null) {
            o10 = "";
        } else {
            o10 = o(bArr);
        }
        h.execute(new n0(this, o10, h0Var2, l(), j10, q20Var));
    }

    public final SharedPreferences q() {
        return this.f35003a.getSharedPreferences("gramwallet_" + this.f35005c, 0);
    }

    public final ix0 r() {
        File file = this.d;
        if (file.exists()) {
            return u(new JSONObject(new String(w(file), StandardCharsets.UTF_8)));
        }
        ix0 ix0Var = new ix0();
        SharedPreferences q6 = q();
        ix0Var.f27121c = q6.getBoolean("locked", i(this.f35003a));
        ix0Var.f27119a = q6.getLong("userId", 0L);
        ix0Var.f27120b = q6.getInt("lastUsageDate", 0);
        if (q6.contains("phrase")) {
            String o10 = o(A(q6.getString("pubkey", "")));
            if (!o10.isEmpty()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("legacy", true);
                jSONObject.put("ciphertext", q6.getString("phrase", null));
                jSONObject.put("iv", q6.getString("iv", null));
                ((LinkedHashMap) ix0Var.e).put(o10, jSONObject);
                ix0Var.d = true;
                return ix0Var;
            }
            throw new IOException("legacy public key missing");
        }
        return ix0Var;
    }

    public final void s(ix0 ix0Var, String str, LinkedHashMap linkedHashMap, ArrayList arrayList, long j10) {
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) ix0Var.e;
        ArrayList arrayList2 = new ArrayList(linkedHashMap2.keySet());
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            String str2 = (String) obj;
            if (!str2.equals(str) && ((JSONObject) linkedHashMap2.get(str2)).optBoolean("legacy", false)) {
                h0 h10 = h(ix0Var, str2, j10);
                linkedHashMap.put(str2, h10);
                linkedHashMap2.put(str2, j(ix0Var, str2, h10, arrayList, j10));
            }
        }
        ix0Var.d = false;
    }

    public final ix0 u(JSONObject jSONObject) {
        if (jSONObject.getInt("version") == 2) {
            if (this.f35005c.equals(jSONObject.getString("address"))) {
                ix0 ix0Var = new ix0();
                ix0Var.f27119a = jSONObject.getLong("userId");
                ix0Var.f27120b = jSONObject.getInt("lastUsage");
                ix0Var.f27121c = jSONObject.getBoolean("locked");
                JSONObject jSONObject2 = jSONObject.getJSONObject("records");
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (!next.isEmpty() && next.equals(o(A(next)))) {
                        JSONObject jSONObject3 = jSONObject2.getJSONObject(next);
                        ((LinkedHashMap) ix0Var.e).put(next, jSONObject3);
                        ix0Var.d |= jSONObject3.optBoolean("legacy", false);
                    } else {
                        throw new IOException("public key encoding");
                    }
                }
                return ix0Var;
            }
        }
        throw new IOException("wallet format/address");
    }

    public final void v(ix0 ix0Var, LinkedHashMap linkedHashMap) {
        boolean exists;
        boolean delete;
        File file = this.d;
        File parentFile = file.getParentFile();
        if (!parentFile.isDirectory() && !parentFile.mkdirs()) {
            throw new IOException("wallet directory");
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : ((LinkedHashMap) ix0Var.e).entrySet()) {
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
        String jSONObject2 = new JSONObject().put("version", 2).put("address", this.f35005c).put("userId", ix0Var.f27119a).put("lastUsage", ix0Var.f27120b).put("locked", ix0Var.f27121c).put("records", jSONObject).toString();
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
                byte[] w9 = w(file2);
                if (Arrays.equals(bytes, w9)) {
                    ix0 u10 = u(new JSONObject(new String(w9, charset)));
                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                        byte[] c10 = ((h0) entry2.getValue()).c();
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
                    org.telegram.messenger.i0.g3(new org.telegram.ui.Components.voip.m0(20));
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
                    org.telegram.messenger.f8.g(new IOException("wallet staging cleanup"), true);
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
