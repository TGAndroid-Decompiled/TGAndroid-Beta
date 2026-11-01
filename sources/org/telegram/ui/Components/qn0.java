package org.telegram.ui.Components;

import android.graphics.Paint;
import android.media.MediaCodec;
import android.os.Build;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
public final class qn0 {
    public final int f29758a;
    public long f29759b;
    public final Object f29760c;
    public final Object d;
    public Object e;
    public Object f29761f;
    public Object f29762g;

    public qn0(android.support.v4.media.session.a0 a0Var) {
        int i10;
        this.f29760c = a0Var;
        synchronized (a0Var) {
            i10 = ((i2.h) a0Var.d).f7874c.f54155b;
        }
        this.f29758a = i10;
        this.d = new e2.x(32);
        u2.z0 z0Var = new u2.z0(0L, i10);
        this.e = z0Var;
        this.f29761f = z0Var;
        this.f29762g = z0Var;
    }

    public static u2.z0 d(u2.z0 z0Var, long j10, ByteBuffer byteBuffer, int i10) {
        while (j10 >= z0Var.f50086b) {
            z0Var = (u2.z0) z0Var.d;
        }
        while (i10 > 0) {
            int min = Math.min(i10, (int) (z0Var.f50086b - j10));
            y2.a aVar = (y2.a) z0Var.f50087c;
            byteBuffer.put(aVar.f54149a, ((int) (j10 - z0Var.f50085a)) + aVar.f54150b, min);
            i10 -= min;
            j10 += min;
            if (j10 == z0Var.f50086b) {
                z0Var = (u2.z0) z0Var.d;
            }
        }
        return z0Var;
    }

    public static u2.z0 e(u2.z0 z0Var, long j10, byte[] bArr, int i10) {
        while (j10 >= z0Var.f50086b) {
            z0Var = (u2.z0) z0Var.d;
        }
        int i11 = i10;
        while (i11 > 0) {
            int min = Math.min(i11, (int) (z0Var.f50086b - j10));
            y2.a aVar = (y2.a) z0Var.f50087c;
            System.arraycopy(aVar.f54149a, ((int) (j10 - z0Var.f50085a)) + aVar.f54150b, bArr, i10 - i11, min);
            i11 -= min;
            j10 += min;
            if (j10 == z0Var.f50086b) {
                z0Var = (u2.z0) z0Var.d;
            }
        }
        return z0Var;
    }

    public static u2.z0 f(u2.z0 z0Var, h2.h hVar, bi.d0 d0Var, e2.x xVar) {
        boolean z10;
        if (hVar.getFlag(1073741824)) {
            long j10 = d0Var.f2915b;
            int i10 = 1;
            xVar.K(1);
            u2.z0 e = e(z0Var, j10, xVar.f6207a, 1);
            long j11 = j10 + 1;
            byte b10 = xVar.f6207a[0];
            if ((b10 & 128) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i11 = b10 & Byte.MAX_VALUE;
            h2.d dVar = hVar.f7586b;
            byte[] bArr = dVar.f7578a;
            if (bArr == null) {
                dVar.f7578a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            z0Var = e(e, j11, dVar.f7578a, i11);
            long j12 = j11 + i11;
            if (z10) {
                xVar.K(2);
                z0Var = e(z0Var, j12, xVar.f6207a, 2);
                j12 += 2;
                i10 = xVar.H();
            }
            int[] iArr = dVar.d;
            if (iArr == null || iArr.length < i10) {
                iArr = new int[i10];
            }
            int[] iArr2 = dVar.e;
            if (iArr2 == null || iArr2.length < i10) {
                iArr2 = new int[i10];
            }
            if (z10) {
                int i12 = i10 * 6;
                xVar.K(i12);
                z0Var = e(z0Var, j12, xVar.f6207a, i12);
                j12 += i12;
                xVar.N(0);
                for (int i13 = 0; i13 < i10; i13++) {
                    iArr[i13] = xVar.H();
                    iArr2[i13] = xVar.E();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = d0Var.f2914a - ((int) (j12 - d0Var.f2915b));
            }
            c3.j0 j0Var = (c3.j0) d0Var.f2916c;
            String str = e2.l0.f6165a;
            byte[] bArr2 = j0Var.f3662b;
            byte[] bArr3 = dVar.f7578a;
            int i14 = j0Var.f3661a;
            int i15 = j0Var.f3663c;
            int i16 = j0Var.d;
            dVar.f7581f = i10;
            dVar.d = iArr;
            dVar.e = iArr2;
            dVar.f7579b = bArr2;
            dVar.f7578a = bArr3;
            dVar.f7580c = i14;
            dVar.f7582g = i15;
            dVar.h = i16;
            MediaCodec.CryptoInfo cryptoInfo = dVar.f7583i;
            cryptoInfo.numSubSamples = i10;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i14;
            if (Build.VERSION.SDK_INT >= 24) {
                h2.c cVar = dVar.f7584j;
                cVar.getClass();
                h2.c.a(cVar, i15, i16);
            }
            long j13 = d0Var.f2915b;
            int i17 = (int) (j12 - j13);
            d0Var.f2915b = j13 + i17;
            d0Var.f2914a -= i17;
        }
        if (hVar.hasSupplementalData()) {
            xVar.K(4);
            u2.z0 e7 = e(z0Var, d0Var.f2915b, xVar.f6207a, 4);
            int E = xVar.E();
            d0Var.f2915b += 4;
            d0Var.f2914a -= 4;
            hVar.c(E);
            u2.z0 d = d(e7, d0Var.f2915b, hVar.f7587c, E);
            d0Var.f2915b += E;
            int i18 = d0Var.f2914a - E;
            d0Var.f2914a = i18;
            ByteBuffer byteBuffer = hVar.f7588f;
            if (byteBuffer != null && byteBuffer.capacity() >= i18) {
                hVar.f7588f.clear();
            } else {
                hVar.f7588f = ByteBuffer.allocate(i18);
            }
            return d(d, d0Var.f2915b, hVar.f7588f, d0Var.f2914a);
        }
        hVar.c(d0Var.f2914a);
        return d(z0Var, d0Var.f2915b, hVar.f7587c, d0Var.f2914a);
    }

    public void a(u2.z0 z0Var) {
        if (((y2.a) z0Var.f50087c) == null) {
            return;
        }
        android.support.v4.media.session.a0 a0Var = (android.support.v4.media.session.a0) this.f29760c;
        synchronized (a0Var) {
            ((i2.h) a0Var.d).f7874c.b(z0Var);
            u2.z0 z0Var2 = z0Var;
            while (z0Var2 != null) {
                y2.a aVar = (y2.a) z0Var2.f50087c;
                aVar.getClass();
                a0Var.v(aVar);
                z0Var2 = (u2.z0) z0Var2.d;
                if (z0Var2 == null || ((y2.a) z0Var2.f50087c) == null) {
                    z0Var2 = null;
                }
            }
        }
        z0Var.f50087c = null;
        z0Var.d = null;
    }

    public void b(long j10) {
        u2.z0 z0Var;
        if (j10 != -1) {
            while (true) {
                z0Var = (u2.z0) this.e;
                if (j10 < z0Var.f50086b) {
                    break;
                }
                android.support.v4.media.session.a0 a0Var = (android.support.v4.media.session.a0) this.f29760c;
                y2.a aVar = (y2.a) z0Var.f50087c;
                synchronized (a0Var) {
                    ((i2.h) a0Var.d).f7874c.c(aVar);
                    a0Var.v(aVar);
                }
                u2.z0 z0Var2 = (u2.z0) this.e;
                z0Var2.f50087c = null;
                z0Var2.d = null;
                this.e = (u2.z0) z0Var2.d;
            }
            if (((u2.z0) this.f29761f).f50085a < z0Var.f50085a) {
                this.f29761f = z0Var;
            }
        }
    }

    public int c(int i10) {
        y2.a a2;
        u2.z0 z0Var = (u2.z0) this.f29762g;
        if (((y2.a) z0Var.f50087c) == null) {
            android.support.v4.media.session.a0 a0Var = (android.support.v4.media.session.a0) this.f29760c;
            synchronized (a0Var) {
                a2 = ((i2.h) a0Var.d).f7874c.a();
                ((HashMap) a0Var.f875b).put(a2, (j2.l) a0Var.f876c);
                i2.g gVar = (i2.g) ((i2.h) a0Var.d).f7884p.get((j2.l) a0Var.f876c);
                if (gVar != null) {
                    gVar.a();
                }
            }
            u2.z0 z0Var2 = new u2.z0(((u2.z0) this.f29762g).f50086b, this.f29758a);
            z0Var.f50087c = a2;
            z0Var.d = z0Var2;
        }
        return Math.min(i10, (int) (((u2.z0) this.f29762g).f50086b - this.f29759b));
    }

    public qn0(eb0 eb0Var) {
        this.d = new ArrayList(50);
        this.e = new ArrayList(50);
        Paint paint = new Paint(1);
        this.f29761f = paint;
        this.f29758a = 250;
        this.f29760c = eb0Var;
        paint.setStrokeWidth(org.telegram.messenger.i0.L(1.33f));
    }
}
