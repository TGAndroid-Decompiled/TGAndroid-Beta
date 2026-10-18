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
import org.telegram.ui.Components.uy0;
import org.telegram.ui.mj0;
import org.telegram.ui.z70;
public final class q0 {
    public static final Object f34724f = new Object();
    public static final HashMap f34725g = new HashMap();
    public static final ExecutorService h = Executors.newSingleThreadExecutor(new e2.l0(4));
    public static final CopyOnWriteArrayList f34726i = new CopyOnWriteArrayList();
    public final Context f34727a;
    public final int f34728b;
    public final String f34729c;
    public final File d;
    public final String e;

    public q0(Context context, String str, int i10) {
        if (context != null && str != null && !str.isEmpty()) {
            Context applicationContext = context.getApplicationContext();
            context = applicationContext != null ? applicationContext : context;
            this.f34727a = context;
            this.f34728b = i10;
            this.f34729c = str;
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
        synchronized (f34724f) {
            arrayList = new ArrayList();
            File[] listFiles = new File(context.getNoBackupFilesDir(), "gramwallets").listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    if (file.getName().endsWith(".json")) {
                        try {
                            JSONObject jSONObject = new JSONObject(new String(w(file), StandardCharsets.UTF_8));
                            String string = jSONObject.getString("address");
                            q0 q0Var = new q0(context, string, 0);
                            if (q0Var.d.equals(file)) {
                                uy0 u10 = q0Var.u(jSONObject);
                                if (u10.f31105a == j10 && !((LinkedHashMap) u10.e).isEmpty()) {
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
                            q0 q0Var2 = new q0(context, substring, 0);
                            if (!q0Var2.d.exists()) {
                                uy0 r10 = q0Var2.r();
                                if (r10.f31105a == j10 && !((LinkedHashMap) r10.e).isEmpty() && !arrayList.contains(substring)) {
                                    arrayList.add(substring);
                                }
                            }
                        } catch (Exception e7) {
                            FileLog.e(e7);
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

    public static boolean y(uy0 uy0Var, String str) {
        for (JSONObject jSONObject : ((LinkedHashMap) uy0Var.e).values()) {
            if (str.equals(jSONObject.optString("alias"))) {
                return true;
            }
        }
        return false;
    }

    public static synchronized void z(Runnable runnable) {
        synchronized (q0.class) {
            Iterator it = f34726i.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                Runnable runnable2 = (Runnable) weakReference.get();
                if (runnable2 == null || runnable2 == runnable) {
                    f34726i.remove(weakReference);
                }
            }
        }
    }

    public final void B() {
        synchronized (f34724f) {
            HashMap hashMap = f34725g;
            File file = this.d;
            hashMap.put(file.getAbsolutePath(), Long.valueOf(l() + 1));
            AndroidUtilities.runOnUIThread(new r0(file.getAbsolutePath(), 0));
            try {
                uy0 uy0Var = new uy0();
                uy0Var.f31107c = i(this.f34727a);
                v(uy0Var, new LinkedHashMap());
                d(uy0Var);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public final byte[] a(uy0 uy0Var, String str) {
        return ("GramWallet:2\n" + this.f34729c + "\n" + uy0Var.f31105a + "\n" + str + "\n" + uy0Var.f31107c).getBytes(StandardCharsets.UTF_8);
    }

    public final void b(long j10, boolean z10) {
        String str;
        n nVar;
        Object obj = f34724f;
        synchronized (obj) {
            c(j10);
        }
        String absolutePath = this.d.getAbsolutePath();
        ci.d1 d1Var = new ci.d1(this, j10, 12);
        w0 w0Var = new w0();
        w0Var.d = absolutePath;
        AndroidUtilities.runOnUIThread(new z70(w0Var, d1Var, z10, 12));
        try {
            if (!w0Var.f35025a.await(90L, TimeUnit.SECONDS)) {
                str = "AUTH_TIMEOUT";
                w0Var.f35026b = true;
                nVar = new n(w0Var, 4);
            } else {
                str = w0Var.f35027c;
                w0Var.f35026b = true;
                nVar = new n(w0Var, 4);
            }
            AndroidUtilities.runOnUIThread(nVar);
            synchronized (obj) {
                c(j10);
            }
            if (str == null) {
                return;
            }
            throw new Exception(str);
        } catch (Throwable th2) {
            w0Var.f35026b = true;
            AndroidUtilities.runOnUIThread(new n(w0Var, 4));
            throw th2;
        }
    }

    public final void c(long j10) {
        if (j10 == l()) {
            return;
        }
        throw new Exception("STORAGE_CANCELED");
    }

    public final void d(uy0 uy0Var) {
        String str = this.f34729c;
        try {
            FileDescriptor open = Os.open(this.d.getParent(), OsConstants.O_RDONLY, 0);
            Os.fsync(open);
            Os.close(open);
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            Enumeration<String> aliases = keyStore.aliases();
            while (aliases.hasMoreElements()) {
                String nextElement = aliases.nextElement();
                if (nextElement.startsWith(this.e) && !y(uy0Var, nextElement)) {
                    keyStore.deleteEntry(nextElement);
                }
            }
            if (!uy0Var.d) {
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
            synchronized (f34724f) {
                try {
                    uy0 r10 = r();
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
        synchronized (f34724f) {
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

    public final byte[] g(uy0 uy0Var, String str) {
        String str2;
        Key key;
        JSONObject jSONObject = (JSONObject) ((LinkedHashMap) uy0Var.e).get(str);
        if (jSONObject != null) {
            if (jSONObject.optBoolean("legacy", false)) {
                String string = q().getString("swkey", null);
                if (string != null) {
                    key = new SecretKeySpec(Base64.decode(string, 2), "AES");
                } else {
                    KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                    keyStore.load(null);
                    StringBuilder sb2 = new StringBuilder();
                    if (uy0Var.f31107c) {
                        str2 = "gramwallet_lock_";
                    } else {
                        str2 = "gramwallet_free_";
                    }
                    sb2.append(str2);
                    sb2.append(this.f34729c);
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
            cipher2.updateAAD(a(uy0Var, str));
            return cipher2.doFinal(Base64.decode(jSONObject.getString("ciphertext"), 2));
        }
        throw new IOException("record missing");
    }

    public final j0 h(uy0 uy0Var, String str, long j10) {
        byte[] g10;
        try {
            g10 = g(uy0Var, str);
        } catch (Exception e) {
            if (uy0Var.f31107c && t(e)) {
                b(j10, false);
                try {
                    g10 = g(uy0Var, str);
                } catch (Exception e7) {
                    if (t(e7)) {
                        b(j10, true);
                        g10 = g(uy0Var, str);
                    } else {
                        throw e7;
                    }
                }
            } else {
                throw e;
            }
        }
        try {
            return new j0(g10);
        } finally {
            Arrays.fill(g10, (byte) 0);
        }
    }

    public final JSONObject j(uy0 uy0Var, String str, j0 j0Var, ArrayList arrayList, long j10) {
        Cipher k10;
        String str2 = this.e + UUID.randomUUID();
        arrayList.add(str2);
        JSONObject put = new JSONObject().put("alias", str2);
        int i10 = Build.VERSION.SDK_INT;
        KeyGenParameterSpec.Builder userAuthenticationRequired = new KeyGenParameterSpec.Builder(str2, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setUserAuthenticationRequired(uy0Var.f31107c);
        if (uy0Var.f31107c) {
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
            k10 = k(uy0Var, str, put);
        } catch (Exception e) {
            if (uy0Var.f31107c && t(e)) {
                b(j10, false);
                try {
                    k10 = k(uy0Var, str, put);
                } catch (Exception e7) {
                    if (t(e7)) {
                        b(j10, true);
                        k10 = k(uy0Var, str, put);
                    } else {
                        throw e7;
                    }
                }
            } else {
                throw e;
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

    public final Cipher k(uy0 uy0Var, String str, JSONObject jSONObject) {
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, x(jSONObject));
        cipher.updateAAD(a(uy0Var, str));
        return cipher;
    }

    public final long l() {
        long longValue;
        synchronized (f34724f) {
            Long l4 = (Long) f34725g.get(this.d.getAbsolutePath());
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
        synchronized (f34724f) {
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

    public final void p(long j10, byte[] bArr, j0 j0Var, Utilities.Callback callback) {
        j0 b10;
        String o10;
        if (j0Var == null) {
            b10 = null;
        } else {
            b10 = j0Var.b();
        }
        j0 j0Var2 = b10;
        if (bArr == null) {
            o10 = "";
        } else {
            o10 = o(bArr);
        }
        h.execute(new ai.h3(this, o10, j0Var2, l(), j10, callback));
    }

    public final SharedPreferences q() {
        return this.f34727a.getSharedPreferences("gramwallet_" + this.f34729c, 0);
    }

    public final uy0 r() {
        File file = this.d;
        if (file.exists()) {
            return u(new JSONObject(new String(w(file), StandardCharsets.UTF_8)));
        }
        uy0 uy0Var = new uy0();
        SharedPreferences q6 = q();
        uy0Var.f31107c = q6.getBoolean("locked", i(this.f34727a));
        uy0Var.f31105a = q6.getLong("userId", 0L);
        uy0Var.f31106b = q6.getInt("lastUsageDate", 0);
        if (q6.contains("phrase")) {
            String o10 = o(A(q6.getString("pubkey", "")));
            if (!o10.isEmpty()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("legacy", true);
                jSONObject.put("ciphertext", q6.getString("phrase", null));
                jSONObject.put("iv", q6.getString("iv", null));
                ((LinkedHashMap) uy0Var.e).put(o10, jSONObject);
                uy0Var.d = true;
                return uy0Var;
            }
            throw new IOException("legacy public key missing");
        }
        return uy0Var;
    }

    public final void s(uy0 uy0Var, String str, LinkedHashMap linkedHashMap, ArrayList arrayList, long j10) {
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) uy0Var.e;
        ArrayList arrayList2 = new ArrayList(linkedHashMap2.keySet());
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            String str2 = (String) obj;
            if (!str2.equals(str) && ((JSONObject) linkedHashMap2.get(str2)).optBoolean("legacy", false)) {
                j0 h10 = h(uy0Var, str2, j10);
                linkedHashMap.put(str2, h10);
                linkedHashMap2.put(str2, j(uy0Var, str2, h10, arrayList, j10));
            }
        }
        uy0Var.d = false;
    }

    public final uy0 u(JSONObject jSONObject) {
        if (jSONObject.getInt("version") == 2) {
            if (this.f34729c.equals(jSONObject.getString("address"))) {
                uy0 uy0Var = new uy0();
                uy0Var.f31105a = jSONObject.getLong("userId");
                uy0Var.f31106b = jSONObject.getInt("lastUsage");
                uy0Var.f31107c = jSONObject.getBoolean("locked");
                JSONObject jSONObject2 = jSONObject.getJSONObject("records");
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (!next.isEmpty() && next.equals(o(A(next)))) {
                        JSONObject jSONObject3 = jSONObject2.getJSONObject(next);
                        ((LinkedHashMap) uy0Var.e).put(next, jSONObject3);
                        uy0Var.d |= jSONObject3.optBoolean("legacy", false);
                    } else {
                        throw new IOException("public key encoding");
                    }
                }
                return uy0Var;
            }
        }
        throw new IOException("wallet format/address");
    }

    public final void v(uy0 uy0Var, LinkedHashMap linkedHashMap) {
        boolean exists;
        boolean delete;
        File file = this.d;
        File parentFile = file.getParentFile();
        if (!parentFile.isDirectory() && !parentFile.mkdirs()) {
            throw new IOException("wallet directory");
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : ((LinkedHashMap) uy0Var.e).entrySet()) {
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
        String jSONObject2 = new JSONObject().put("version", 2).put("address", this.f34729c).put("userId", uy0Var.f31105a).put("lastUsage", uy0Var.f31106b).put("locked", uy0Var.f31107c).put("records", jSONObject).toString();
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
                    uy0 u10 = u(new JSONObject(new String(w9, charset)));
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
                    AndroidUtilities.runOnUIThread(new mj0(8));
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
