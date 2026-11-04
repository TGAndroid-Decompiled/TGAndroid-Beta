package org.telegram.ui.Wallet;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
public final class h0 implements AutoCloseable {
    public final byte[] f42597a;
    public boolean f42598b;

    public h0(byte[] bArr) {
        if (bArr != null) {
            this.f42597a = (byte[]) bArr.clone();
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
        if (!this.f42598b) {
            return;
        }
        throw new IllegalStateException("Recovery phrase is closed");
    }

    public final synchronized h0 b() {
        a();
        return new h0(this.f42597a);
    }

    public final synchronized byte[] c() {
        a();
        return (byte[]) this.f42597a.clone();
    }

    @Override
    public final synchronized void close() {
        Arrays.fill(this.f42597a, (byte) 0);
        this.f42598b = true;
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
            int i3 = 0;
            while (i3 < this.f42597a.length) {
                while (true) {
                    byte[] bArr = this.f42597a;
                    if (i3 >= bArr.length || !e(bArr[i3])) {
                        break;
                    }
                    i3++;
                }
                int i10 = i3;
                while (true) {
                    byte[] bArr2 = this.f42597a;
                    if (i10 >= bArr2.length || e(bArr2[i10])) {
                        break;
                    }
                    i10++;
                }
                if (i10 > i3) {
                    arrayList.add(new String(this.f42597a, i3, i10 - i3, StandardCharsets.UTF_8));
                }
                i3 = i10;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    public final synchronized int g() {
        int i3;
        a();
        i3 = 0;
        boolean z10 = false;
        for (byte b10 : this.f42597a) {
            if (e(b10)) {
                z10 = false;
            } else if (!z10) {
                i3++;
                z10 = true;
            }
        }
        return i3;
    }

    public final String toString() {
        return "SecretPhrase[redacted]";
    }
}
