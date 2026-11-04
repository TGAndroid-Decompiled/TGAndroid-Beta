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
import org.telegram.messenger.az;
import org.telegram.messenger.u10;
import org.telegram.ui.Components.dw0;
import org.telegram.ui.a60;
import org.telegram.ui.hb1;
public final class o0 {
    public static final Object f42982f = new Object();
    public static final HashMap f42983g = new HashMap();
    public static final ExecutorService h = Executors.newSingleThreadExecutor(new g2.m0(4));
    public static final CopyOnWriteArrayList f42984i = new CopyOnWriteArrayList();
    public final Context f42985a;
    public final int f42986b;
    public final String f42987c;
    public final File d;
    public final String f42988e;

    public o0(int i3, Context context, String str) {
        if (context != null && str != null && !str.isEmpty()) {
            Context applicationContext = context.getApplicationContext();
            context = applicationContext != null ? applicationContext : context;
            this.f42985a = context;
            this.f42986b = i3;
            this.f42987c = str;
            try {
                String o10 = o(MessageDigest.getInstance("SHA-256").digest(str.getBytes(StandardCharsets.UTF_8)));
                this.d = new File(new File(context.getNoBackupFilesDir(), "gramwallets"), o10.concat(".json"));
                this.f42988e = a1.g.q("gramwallet_v2_", o10, "_");
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
            for (int i3 = 0; i3 < length; i3++) {
                int i10 = i3 * 2;
                int digit = Character.digit(str.charAt(i10), 16);
                int digit2 = Character.digit(str.charAt(i10 + 1), 16);
                if (digit >= 0 && digit2 >= 0) {
                    bArr[i3] = (byte) (digit2 | (digit << 4));
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
        if (context != null && (str = az.f21661s) != null && str.length() != 0) {
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

    public static ArrayList n(Context context, long j10) {
        ArrayList arrayList;
        int i3;
        synchronized (f42982f) {
            arrayList = new ArrayList();
            File[] listFiles = new File(context.getNoBackupFilesDir(), "gramwallets").listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    if (file.getName().endsWith(".json")) {
                        try {
                            JSONObject jSONObject = new JSONObject(new String(w(file), StandardCharsets.UTF_8));
                            String string = jSONObject.getString("address");
                            o0 o0Var = new o0(0, context, string);
                            if (o0Var.d.equals(file)) {
                                dw0 u10 = o0Var.u(jSONObject);
                                if (u10.f33200a == j10 && !((LinkedHashMap) u10.f33203e).isEmpty()) {
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
                        i3 = 8;
                    } else if (name.endsWith(".xml")) {
                        i3 = 4;
                    } else {
                        i3 = 0;
                    }
                    if (name.startsWith("gramwallet_") && i3 != 0) {
                        String substring = name.substring(11, name.length() - i3);
                        try {
                            o0 o0Var2 = new o0(0, context, substring);
                            if (!o0Var2.d.exists()) {
                                dw0 r5 = o0Var2.r();
                                if (r5.f33200a == j10 && !((LinkedHashMap) r5.f33203e).isEmpty() && !arrayList.contains(substring)) {
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
        for (int i3 = 0; i3 < bArr.length; i3++) {
            int i10 = i3 * 2;
            byte b10 = bArr[i3];
            cArr[i10] = charArray[(b10 & 255) >>> 4];
            cArr[i10 + 1] = charArray[b10 & 15];
        }
        return new String(cArr);
    }

    public static boolean t(java.lang.Exception r1) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.o0.t(java.lang.Exception):boolean");
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

    public static boolean y(dw0 dw0Var, String str) {
        for (JSONObject jSONObject : ((LinkedHashMap) dw0Var.f33203e).values()) {
            if (str.equals(jSONObject.optString("alias"))) {
                return true;
            }
        }
        return false;
    }

    public static synchronized void z(Runnable runnable) {
        synchronized (o0.class) {
            Iterator it = f42984i.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                Runnable runnable2 = (Runnable) weakReference.get();
                if (runnable2 == null || runnable2 == runnable) {
                    f42984i.remove(weakReference);
                }
            }
        }
    }

    public final void B() {
        synchronized (f42982f) {
            HashMap hashMap = f42983g;
            File file = this.d;
            hashMap.put(file.getAbsolutePath(), Long.valueOf(l() + 1));
            org.telegram.messenger.g0.h3(new p0(file.getAbsolutePath(), 0));
            try {
                dw0 dw0Var = new dw0();
                dw0Var.f33202c = i(this.f42985a);
                v(dw0Var, new LinkedHashMap());
                d(dw0Var);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public final byte[] a(dw0 dw0Var, String str) {
        return ("GramWallet:2\n" + this.f42987c + "\n" + dw0Var.f33200a + "\n" + str + "\n" + dw0Var.f33202c).getBytes(StandardCharsets.UTF_8);
    }

    public final void b(long j10, boolean z10) {
        String str;
        l lVar;
        Object obj = f42982f;
        synchronized (obj) {
            c(j10);
        }
        String absolutePath = this.d.getAbsolutePath();
        ei.c1 c1Var = new ei.c1(this, j10, 12);
        t0 t0Var = new t0();
        t0Var.d = absolutePath;
        org.telegram.messenger.g0.h3(new a60(t0Var, c1Var, z10, 12));
        try {
            if (!t0Var.f43184a.await(90L, TimeUnit.SECONDS)) {
                str = "AUTH_TIMEOUT";
                t0Var.f43185b = true;
                lVar = new l(t0Var, 4);
            } else {
                str = t0Var.f43186c;
                t0Var.f43185b = true;
                lVar = new l(t0Var, 4);
            }
            org.telegram.messenger.g0.h3(lVar);
            synchronized (obj) {
                c(j10);
            }
            if (str == null) {
                return;
            }
            throw new Exception(str);
        } catch (Throwable th2) {
            t0Var.f43185b = true;
            org.telegram.messenger.g0.h3(new l(t0Var, 4));
            throw th2;
        }
    }

    public final void c(long j10) {
        if (j10 == l()) {
            return;
        }
        throw new Exception("STORAGE_CANCELED");
    }

    public final void d(dw0 dw0Var) {
        String str = this.f42987c;
        try {
            FileDescriptor open = Os.open(this.d.getParent(), OsConstants.O_RDONLY, 0);
            Os.fsync(open);
            Os.close(open);
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            Enumeration<String> aliases = keyStore.aliases();
            while (aliases.hasMoreElements()) {
                String nextElement = aliases.nextElement();
                if (nextElement.startsWith(this.f42988e) && !y(dw0Var, nextElement)) {
                    keyStore.deleteEntry(nextElement);
                }
            }
            if (!dw0Var.d) {
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
            synchronized (f42982f) {
                try {
                    dw0 r5 = r();
                    KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                    keyStore.load(null);
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj = arrayList.get(i3);
                        i3++;
                        String str = (String) obj;
                        if (!y(r5, str)) {
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
            synchronized (f42982f) {
                try {
                    try {
                        containsKey = ((LinkedHashMap) r().f33203e).containsKey(o(bArr));
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

    public final byte[] g(dw0 dw0Var, String str) {
        String str2;
        Key key;
        JSONObject jSONObject = (JSONObject) ((LinkedHashMap) dw0Var.f33203e).get(str);
        if (jSONObject != null) {
            if (jSONObject.optBoolean("legacy", false)) {
                String string = q().getString("swkey", null);
                if (string != null) {
                    key = new SecretKeySpec(Base64.decode(string, 2), "AES");
                } else {
                    KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                    keyStore.load(null);
                    StringBuilder sb2 = new StringBuilder();
                    if (dw0Var.f33202c) {
                        str2 = "gramwallet_lock_";
                    } else {
                        str2 = "gramwallet_free_";
                    }
                    sb2.append(str2);
                    sb2.append(this.f42987c);
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
            cipher2.updateAAD(a(dw0Var, str));
            return cipher2.doFinal(Base64.decode(jSONObject.getString("ciphertext"), 2));
        }
        throw new IOException("record missing");
    }

    public final h0 h(dw0 dw0Var, String str, long j10) {
        byte[] g7;
        try {
            g7 = g(dw0Var, str);
        } catch (Exception e10) {
            if (dw0Var.f33202c && t(e10)) {
                b(j10, false);
                try {
                    g7 = g(dw0Var, str);
                } catch (Exception e11) {
                    if (t(e11)) {
                        b(j10, true);
                        g7 = g(dw0Var, str);
                    } else {
                        throw e11;
                    }
                }
            } else {
                throw e10;
            }
        }
        try {
            return new h0(g7);
        } finally {
            Arrays.fill(g7, (byte) 0);
        }
    }

    public final JSONObject j(dw0 dw0Var, String str, h0 h0Var, ArrayList arrayList, long j10) {
        Cipher k10;
        String str2 = this.f42988e + UUID.randomUUID();
        arrayList.add(str2);
        JSONObject put = new JSONObject().put("alias", str2);
        int i3 = Build.VERSION.SDK_INT;
        KeyGenParameterSpec.Builder userAuthenticationRequired = new KeyGenParameterSpec.Builder(str2, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setUserAuthenticationRequired(dw0Var.f33202c);
        if (dw0Var.f33202c) {
            if (i3 >= 30) {
                userAuthenticationRequired.setUserAuthenticationParameters(30, 3);
            } else {
                userAuthenticationRequired.setUserAuthenticationValidityDurationSeconds(30);
            }
            if (i3 >= 24) {
                userAuthenticationRequired.setInvalidatedByBiometricEnrollment(false);
            }
        }
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(userAuthenticationRequired.build());
        keyGenerator.generateKey();
        try {
            k10 = k(dw0Var, str, put);
        } catch (Exception e10) {
            if (dw0Var.f33202c && t(e10)) {
                b(j10, false);
                try {
                    k10 = k(dw0Var, str, put);
                } catch (Exception e11) {
                    if (t(e11)) {
                        b(j10, true);
                        k10 = k(dw0Var, str, put);
                    } else {
                        throw e11;
                    }
                }
            } else {
                throw e10;
            }
        }
        byte[] c2 = h0Var.c();
        try {
            put.put("ciphertext", Base64.encodeToString(k10.doFinal(c2), 2));
            put.put("iv", Base64.encodeToString(k10.getIV(), 2));
            return put;
        } finally {
            Arrays.fill(c2, (byte) 0);
        }
    }

    public final Cipher k(dw0 dw0Var, String str, JSONObject jSONObject) {
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, x(jSONObject));
        cipher.updateAAD(a(dw0Var, str));
        return cipher;
    }

    public final long l() {
        long longValue;
        synchronized (f42982f) {
            Long l10 = (Long) f42983g.get(this.d.getAbsolutePath());
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
        synchronized (f42982f) {
            try {
                try {
                    ArrayList arrayList = new ArrayList();
                    for (String str : ((LinkedHashMap) r().f33203e).keySet()) {
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

    public final void p(long j10, byte[] bArr, h0 h0Var, u10 u10Var) {
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
        h.execute(new ci.v2(this, o10, h0Var2, l(), j10, u10Var));
    }

    public final SharedPreferences q() {
        return this.f42985a.getSharedPreferences("gramwallet_" + this.f42987c, 0);
    }

    public final dw0 r() {
        File file = this.d;
        if (file.exists()) {
            return u(new JSONObject(new String(w(file), StandardCharsets.UTF_8)));
        }
        dw0 dw0Var = new dw0();
        SharedPreferences q10 = q();
        dw0Var.f33202c = q10.getBoolean("locked", i(this.f42985a));
        dw0Var.f33200a = q10.getLong("userId", 0L);
        dw0Var.f33201b = q10.getInt("lastUsageDate", 0);
        if (q10.contains("phrase")) {
            String o10 = o(A(q10.getString("pubkey", "")));
            if (!o10.isEmpty()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("legacy", true);
                jSONObject.put("ciphertext", q10.getString("phrase", null));
                jSONObject.put("iv", q10.getString("iv", null));
                ((LinkedHashMap) dw0Var.f33203e).put(o10, jSONObject);
                dw0Var.d = true;
                return dw0Var;
            }
            throw new IOException("legacy public key missing");
        }
        return dw0Var;
    }

    public final void s(dw0 dw0Var, String str, LinkedHashMap linkedHashMap, ArrayList arrayList, long j10) {
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) dw0Var.f33203e;
        ArrayList arrayList2 = new ArrayList(linkedHashMap2.keySet());
        int size = arrayList2.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            String str2 = (String) obj;
            if (!str2.equals(str) && ((JSONObject) linkedHashMap2.get(str2)).optBoolean("legacy", false)) {
                h0 h7 = h(dw0Var, str2, j10);
                linkedHashMap.put(str2, h7);
                linkedHashMap2.put(str2, j(dw0Var, str2, h7, arrayList, j10));
            }
        }
        dw0Var.d = false;
    }

    public final dw0 u(JSONObject jSONObject) {
        if (jSONObject.getInt("version") == 2) {
            if (this.f42987c.equals(jSONObject.getString("address"))) {
                dw0 dw0Var = new dw0();
                dw0Var.f33200a = jSONObject.getLong("userId");
                dw0Var.f33201b = jSONObject.getInt("lastUsage");
                dw0Var.f33202c = jSONObject.getBoolean("locked");
                JSONObject jSONObject2 = jSONObject.getJSONObject("records");
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (!next.isEmpty() && next.equals(o(A(next)))) {
                        JSONObject jSONObject3 = jSONObject2.getJSONObject(next);
                        ((LinkedHashMap) dw0Var.f33203e).put(next, jSONObject3);
                        dw0Var.d |= jSONObject3.optBoolean("legacy", false);
                    } else {
                        throw new IOException("public key encoding");
                    }
                }
                return dw0Var;
            }
        }
        throw new IOException("wallet format/address");
    }

    public final void v(dw0 dw0Var, LinkedHashMap linkedHashMap) {
        boolean exists;
        boolean delete;
        File file = this.d;
        File parentFile = file.getParentFile();
        if (!parentFile.isDirectory() && !parentFile.mkdirs()) {
            throw new IOException("wallet directory");
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : ((LinkedHashMap) dw0Var.f33203e).entrySet()) {
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
        String jSONObject2 = new JSONObject().put("version", 2).put("address", this.f42987c).put("userId", dw0Var.f33200a).put("lastUsage", dw0Var.f33201b).put("locked", dw0Var.f33202c).put("records", jSONObject).toString();
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
                    dw0 u10 = u(new JSONObject(new String(w10, charset)));
                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                        byte[] c2 = ((h0) entry2.getValue()).c();
                        byte[] g7 = g(u10, (String) entry2.getKey());
                        if (MessageDigest.isEqual(c2, g7)) {
                            Arrays.fill(c2, (byte) 0);
                            if (g7 != null) {
                                Arrays.fill(g7, (byte) 0);
                            }
                        } else {
                            throw new IOException("wallet decryption mismatch");
                        }
                    }
                    Os.rename(file2.getAbsolutePath(), file.getAbsolutePath());
                    org.telegram.messenger.g0.h3(new hb1(3));
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
        if (string.startsWith(this.f42988e)) {
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
