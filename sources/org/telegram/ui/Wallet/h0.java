package org.telegram.ui.Wallet;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
public final class h0 implements AutoCloseable {
    public final byte[] f34608a;
    public boolean f34609b;

    public h0(byte[] bArr) {
        if (bArr != null) {
            this.f34608a = (byte[]) bArr.clone();
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
        if (!this.f34609b) {
            return;
        }
        throw new IllegalStateException("Recovery phrase is closed");
    }

    public final synchronized h0 b() {
        a();
        return new h0(this.f34608a);
    }

    public final synchronized byte[] c() {
        a();
        return (byte[]) this.f34608a.clone();
    }

    @Override
    public final synchronized void close() {
        Arrays.fill(this.f34608a, (byte) 0);
        this.f34609b = true;
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
            int i10 = 0;
            while (i10 < this.f34608a.length) {
                while (true) {
                    byte[] bArr = this.f34608a;
                    if (i10 >= bArr.length || !e(bArr[i10])) {
                        break;
                    }
                    i10++;
                }
                int i11 = i10;
                while (true) {
                    byte[] bArr2 = this.f34608a;
                    if (i11 >= bArr2.length || e(bArr2[i11])) {
                        break;
                    }
                    i11++;
                }
                if (i11 > i10) {
                    arrayList.add(new String(this.f34608a, i10, i11 - i10, StandardCharsets.UTF_8));
                }
                i10 = i11;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    public final synchronized int g() {
        int i10;
        a();
        i10 = 0;
        boolean z10 = false;
        for (byte b10 : this.f34608a) {
            if (e(b10)) {
                z10 = false;
            } else if (!z10) {
                i10++;
                z10 = true;
            }
        }
        return i10;
    }

    public final String toString() {
        return "SecretPhrase[redacted]";
    }
}
