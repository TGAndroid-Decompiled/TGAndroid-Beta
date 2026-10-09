package org.telegram.ui.Wallet;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
public final class h0 implements AutoCloseable {
    public final byte[] f34958a;
    public boolean f34959b;

    public h0(byte[] bArr) {
        if (bArr != null) {
            this.f34958a = (byte[]) bArr.clone();
            return;
        }
        throw new IllegalArgumentException("Missing recovery phrase");
    }

    public static h0 d(ArrayList arrayList) {
        byte[] bytes;
        int max = Math.max(0, arrayList.size() - 1);
        ArrayList arrayList2 = new ArrayList();
        try {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                arrayList2.add(((String) obj).getBytes(StandardCharsets.UTF_8));
                long length = max + bytes.length;
                max = (int) length;
                if (length != max) {
                    throw new ArithmeticException();
                }
            }
            byte[] bArr = new byte[max];
            int i11 = 0;
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                if (i12 > 0) {
                    bArr[i11] = 32;
                    i11++;
                }
                byte[] bArr2 = (byte[]) arrayList2.get(i12);
                System.arraycopy(bArr2, 0, bArr, i11, bArr2.length);
                i11 += bArr2.length;
            }
            h0 h0Var = new h0(bArr);
            Arrays.fill(bArr, (byte) 0);
            int size2 = arrayList2.size();
            int i13 = 0;
            while (i13 < size2) {
                Object obj2 = arrayList2.get(i13);
                i13++;
                Arrays.fill((byte[]) obj2, (byte) 0);
            }
            return h0Var;
        } catch (Throwable th2) {
            int size3 = arrayList2.size();
            int i14 = 0;
            while (i14 < size3) {
                Object obj3 = arrayList2.get(i14);
                i14++;
                Arrays.fill((byte[]) obj3, (byte) 0);
            }
            throw th2;
        }
    }

    public static boolean f(byte b10) {
        if (b10 != 32 && b10 != 9 && b10 != 10 && b10 != 13 && b10 != 12 && b10 != 11) {
            return false;
        }
        return true;
    }

    public final void a() {
        if (!this.f34959b) {
            return;
        }
        throw new IllegalStateException("Recovery phrase is closed");
    }

    public final synchronized h0 b() {
        a();
        return new h0(this.f34958a);
    }

    public final synchronized byte[] c() {
        a();
        return (byte[]) this.f34958a.clone();
    }

    @Override
    public final synchronized void close() {
        Arrays.fill(this.f34958a, (byte) 0);
        this.f34959b = true;
    }

    public final synchronized boolean e() {
        boolean z10;
        if (h() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        return z10;
    }

    public final synchronized ArrayList g() {
        ArrayList arrayList;
        try {
            a();
            arrayList = new ArrayList();
            int i10 = 0;
            while (i10 < this.f34958a.length) {
                while (true) {
                    byte[] bArr = this.f34958a;
                    if (i10 >= bArr.length || !f(bArr[i10])) {
                        break;
                    }
                    i10++;
                }
                int i11 = i10;
                while (true) {
                    byte[] bArr2 = this.f34958a;
                    if (i11 >= bArr2.length || f(bArr2[i11])) {
                        break;
                    }
                    i11++;
                }
                if (i11 > i10) {
                    arrayList.add(new String(this.f34958a, i10, i11 - i10, StandardCharsets.UTF_8));
                }
                i10 = i11;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    public final synchronized int h() {
        int i10;
        a();
        i10 = 0;
        boolean z10 = false;
        for (byte b10 : this.f34958a) {
            if (f(b10)) {
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
