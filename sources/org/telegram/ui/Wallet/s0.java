package org.telegram.ui.Wallet;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
public final class s0 implements AutoCloseable {
    public final byte[] f45033a;
    public boolean f45034b;

    public s0(byte[] bArr) {
        if (bArr != null) {
            this.f45033a = (byte[]) bArr.clone();
            return;
        }
        throw new IllegalArgumentException("Missing recovery phrase");
    }

    public static boolean e(byte b10) {
        if (b10 != 32 && b10 != 9 && b10 != 10 && b10 != 13 && b10 != 12 && b10 != 11) {
            return false;
        }
        return true;
    }

    public final void a() {
        if (!this.f45034b) {
            return;
        }
        throw new IllegalStateException("Recovery phrase is closed");
    }

    public final synchronized s0 b() {
        a();
        return new s0(this.f45033a);
    }

    public final synchronized byte[] c() {
        a();
        return (byte[]) this.f45033a.clone();
    }

    @Override
    public final synchronized void close() {
        Arrays.fill(this.f45033a, (byte) 0);
        this.f45034b = true;
    }

    public final synchronized boolean d() {
        boolean z10;
        if (g() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        return z10;
    }

    public final synchronized ArrayList f() {
        ArrayList arrayList;
        try {
            a();
            arrayList = new ArrayList();
            int i7 = 0;
            while (i7 < this.f45033a.length) {
                while (true) {
                    byte[] bArr = this.f45033a;
                    if (i7 >= bArr.length || !e(bArr[i7])) {
                        break;
                    }
                    i7++;
                }
                int i10 = i7;
                while (true) {
                    byte[] bArr2 = this.f45033a;
                    if (i10 >= bArr2.length || e(bArr2[i10])) {
                        break;
                    }
                    i10++;
                }
                if (i10 > i7) {
                    arrayList.add(new String(this.f45033a, i7, i10 - i7, StandardCharsets.UTF_8));
                }
                i7 = i10;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    public final synchronized int g() {
        int i7;
        a();
        i7 = 0;
        boolean z10 = false;
        for (byte b10 : this.f45033a) {
            if (e(b10)) {
                z10 = false;
            } else if (!z10) {
                i7++;
                z10 = true;
            }
        }
        return i7;
    }

    public final String toString() {
        return "SecretPhrase[redacted]";
    }
}
