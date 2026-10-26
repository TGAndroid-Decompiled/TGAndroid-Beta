package org.telegram.ui.Components;

import android.graphics.Paint;
import android.media.MediaCodec;
import android.os.Build;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
public final class op0 {
    public final int f31350a;
    public long f31351b;
    public final Object f31352c;
    public final Object d;
    public Object e;
    public Object f31353f;
    public Object f31354g;

    public op0(a8.h0 h0Var) {
        int i10;
        this.f31352c = h0Var;
        synchronized (h0Var) {
            i10 = ((i2.i) h0Var.d).f13561c.f51934b;
        }
        this.f31350a = i10;
        this.d = new e2.x(32);
        u2.z0 z0Var = new u2.z0(0L, i10);
        this.e = z0Var;
        this.f31353f = z0Var;
        this.f31354g = z0Var;
    }

    public static u2.z0 d(u2.z0 z0Var, long j10, ByteBuffer byteBuffer, int i10) {
        while (j10 >= z0Var.f49493b) {
            z0Var = (u2.z0) z0Var.d;
        }
        while (i10 > 0) {
            int min = Math.min(i10, (int) (z0Var.f49493b - j10));
            y2.a aVar = (y2.a) z0Var.f49494c;
            byteBuffer.put(aVar.f51928a, ((int) (j10 - z0Var.f49492a)) + aVar.f51929b, min);
            i10 -= min;
            j10 += min;
            if (j10 == z0Var.f49493b) {
                z0Var = (u2.z0) z0Var.d;
            }
        }
        return z0Var;
    }

    public static u2.z0 e(u2.z0 z0Var, long j10, byte[] bArr, int i10) {
        while (j10 >= z0Var.f49493b) {
            z0Var = (u2.z0) z0Var.d;
        }
        int i11 = i10;
        while (i11 > 0) {
            int min = Math.min(i11, (int) (z0Var.f49493b - j10));
            y2.a aVar = (y2.a) z0Var.f49494c;
            System.arraycopy(aVar.f51928a, ((int) (j10 - z0Var.f49492a)) + aVar.f51929b, bArr, i10 - i11, min);
            i11 -= min;
            j10 += min;
            if (j10 == z0Var.f49493b) {
                z0Var = (u2.z0) z0Var.d;
            }
        }
        return z0Var;
    }

    public static u2.z0 f(u2.z0 z0Var, h2.h hVar, k5.b bVar, e2.x xVar) {
        boolean z10;
        if (hVar.getFlag(1073741824)) {
            long j10 = bVar.f16388a;
            int i10 = 1;
            xVar.K(1);
            u2.z0 e = e(z0Var, j10, xVar.f9732a, 1);
            long j11 = j10 + 1;
            byte b10 = xVar.f9732a[0];
            if ((b10 & 128) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i11 = b10 & Byte.MAX_VALUE;
            h2.d dVar = hVar.f12569b;
            byte[] bArr = dVar.f12561a;
            if (bArr == null) {
                dVar.f12561a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            z0Var = e(e, j11, dVar.f12561a, i11);
            long j12 = j11 + i11;
            if (z10) {
                xVar.K(2);
                z0Var = e(z0Var, j12, xVar.f9732a, 2);
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
                z0Var = e(z0Var, j12, xVar.f9732a, i12);
                j12 += i12;
                xVar.N(0);
                for (int i13 = 0; i13 < i10; i13++) {
                    iArr[i13] = xVar.H();
                    iArr2[i13] = xVar.E();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = bVar.f16389b - ((int) (j12 - bVar.f16388a));
            }
            c3.i0 i0Var = (c3.i0) bVar.f16390c;
            String str = e2.n0.f9692a;
            byte[] bArr2 = i0Var.f6062b;
            byte[] bArr3 = dVar.f12561a;
            int i14 = i0Var.f6061a;
            int i15 = i0Var.f6063c;
            int i16 = i0Var.d;
            dVar.f12564f = i10;
            dVar.d = iArr;
            dVar.e = iArr2;
            dVar.f12562b = bArr2;
            dVar.f12561a = bArr3;
            dVar.f12563c = i14;
            dVar.f12565g = i15;
            dVar.h = i16;
            MediaCodec.CryptoInfo cryptoInfo = dVar.f12566i;
            cryptoInfo.numSubSamples = i10;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i14;
            if (Build.VERSION.SDK_INT >= 24) {
                h2.c cVar = dVar.f12567j;
                cVar.getClass();
                h2.c.a(cVar, i15, i16);
            }
            long j13 = bVar.f16388a;
            int i17 = (int) (j12 - j13);
            bVar.f16388a = j13 + i17;
            bVar.f16389b -= i17;
        }
        if (hVar.hasSupplementalData()) {
            xVar.K(4);
            u2.z0 e10 = e(z0Var, bVar.f16388a, xVar.f9732a, 4);
            int E = xVar.E();
            bVar.f16388a += 4;
            bVar.f16389b -= 4;
            hVar.b(E);
            u2.z0 d = d(e10, bVar.f16388a, hVar.f12570c, E);
            bVar.f16388a += E;
            int i18 = bVar.f16389b - E;
            bVar.f16389b = i18;
            ByteBuffer byteBuffer = hVar.f12571f;
            if (byteBuffer != null && byteBuffer.capacity() >= i18) {
                hVar.f12571f.clear();
            } else {
                hVar.f12571f = ByteBuffer.allocate(i18);
            }
            return d(d, bVar.f16388a, hVar.f12571f, bVar.f16389b);
        }
        hVar.b(bVar.f16389b);
        return d(z0Var, bVar.f16388a, hVar.f12570c, bVar.f16389b);
    }

    public void a(u2.z0 z0Var) {
        if (((y2.a) z0Var.f49494c) == null) {
            return;
        }
        a8.h0 h0Var = (a8.h0) this.f31352c;
        synchronized (h0Var) {
            ((i2.i) h0Var.d).f13561c.b(z0Var);
            u2.z0 z0Var2 = z0Var;
            while (z0Var2 != null) {
                y2.a aVar = (y2.a) z0Var2.f49494c;
                aVar.getClass();
                h0Var.t(aVar);
                z0Var2 = (u2.z0) z0Var2.d;
                if (z0Var2 == null || ((y2.a) z0Var2.f49494c) == null) {
                    z0Var2 = null;
                }
            }
        }
        z0Var.f49494c = null;
        z0Var.d = null;
    }

    public void b(long j10) {
        u2.z0 z0Var;
        if (j10 != -1) {
            while (true) {
                z0Var = (u2.z0) this.e;
                if (j10 < z0Var.f49493b) {
                    break;
                }
                a8.h0 h0Var = (a8.h0) this.f31352c;
                y2.a aVar = (y2.a) z0Var.f49494c;
                synchronized (h0Var) {
                    ((i2.i) h0Var.d).f13561c.c(aVar);
                    h0Var.t(aVar);
                }
                u2.z0 z0Var2 = (u2.z0) this.e;
                z0Var2.f49494c = null;
                z0Var2.d = null;
                this.e = (u2.z0) z0Var2.d;
            }
            if (((u2.z0) this.f31353f).f49492a < z0Var.f49492a) {
                this.f31353f = z0Var;
            }
        }
    }

    public int c(int i10) {
        y2.a a2;
        u2.z0 z0Var = (u2.z0) this.f31354g;
        if (((y2.a) z0Var.f49494c) == null) {
            a8.h0 h0Var = (a8.h0) this.f31352c;
            synchronized (h0Var) {
                a2 = ((i2.i) h0Var.d).f13561c.a();
                ((HashMap) h0Var.f511b).put(a2, (j2.j) h0Var.f512c);
                i2.h hVar = (i2.h) ((i2.i) h0Var.d).f13571p.get((j2.j) h0Var.f512c);
                if (hVar != null) {
                    hVar.a();
                }
            }
            u2.z0 z0Var2 = new u2.z0(((u2.z0) this.f31354g).f49493b, this.f31350a);
            z0Var.f49494c = a2;
            z0Var.d = z0Var2;
        }
        return Math.min(i10, (int) (((u2.z0) this.f31354g).f49493b - this.f31351b));
    }

    public op0(mp0 mp0Var) {
        this.d = new ArrayList(50);
        this.e = new ArrayList(50);
        Paint paint = new Paint(1);
        this.f31353f = paint;
        this.f31350a = 250;
        this.f31352c = mp0Var;
        paint.setStrokeWidth(AndroidUtilities.dp(1.33f));
    }
}
