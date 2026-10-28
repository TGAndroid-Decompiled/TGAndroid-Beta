package org.telegram.ui.Components;

import android.graphics.Paint;
import android.media.MediaCodec;
import android.os.Build;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
public final class pp0 {
    public final int f31697a;
    public long f31698b;
    public final Object f31699c;
    public final Object d;
    public Object e;
    public Object f31700f;
    public Object f31701g;

    public pp0(a8.h0 h0Var) {
        int i10;
        this.f31699c = h0Var;
        synchronized (h0Var) {
            i10 = ((i2.i) h0Var.d).f13560c.f51992b;
        }
        this.f31697a = i10;
        this.d = new e2.x(32);
        u2.z0 z0Var = new u2.z0(0L, i10);
        this.e = z0Var;
        this.f31700f = z0Var;
        this.f31701g = z0Var;
    }

    public static u2.z0 d(u2.z0 z0Var, long j10, ByteBuffer byteBuffer, int i10) {
        while (j10 >= z0Var.f49528b) {
            z0Var = (u2.z0) z0Var.d;
        }
        while (i10 > 0) {
            int min = Math.min(i10, (int) (z0Var.f49528b - j10));
            y2.a aVar = (y2.a) z0Var.f49529c;
            byteBuffer.put(aVar.f51986a, ((int) (j10 - z0Var.f49527a)) + aVar.f51987b, min);
            i10 -= min;
            j10 += min;
            if (j10 == z0Var.f49528b) {
                z0Var = (u2.z0) z0Var.d;
            }
        }
        return z0Var;
    }

    public static u2.z0 e(u2.z0 z0Var, long j10, byte[] bArr, int i10) {
        while (j10 >= z0Var.f49528b) {
            z0Var = (u2.z0) z0Var.d;
        }
        int i11 = i10;
        while (i11 > 0) {
            int min = Math.min(i11, (int) (z0Var.f49528b - j10));
            y2.a aVar = (y2.a) z0Var.f49529c;
            System.arraycopy(aVar.f51986a, ((int) (j10 - z0Var.f49527a)) + aVar.f51987b, bArr, i10 - i11, min);
            i11 -= min;
            j10 += min;
            if (j10 == z0Var.f49528b) {
                z0Var = (u2.z0) z0Var.d;
            }
        }
        return z0Var;
    }

    public static u2.z0 f(u2.z0 z0Var, h2.h hVar, k5.b bVar, e2.x xVar) {
        boolean z10;
        if (hVar.getFlag(1073741824)) {
            long j10 = bVar.f16387a;
            int i10 = 1;
            xVar.K(1);
            u2.z0 e = e(z0Var, j10, xVar.f9731a, 1);
            long j11 = j10 + 1;
            byte b10 = xVar.f9731a[0];
            if ((b10 & 128) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i11 = b10 & Byte.MAX_VALUE;
            h2.d dVar = hVar.f12568b;
            byte[] bArr = dVar.f12560a;
            if (bArr == null) {
                dVar.f12560a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            z0Var = e(e, j11, dVar.f12560a, i11);
            long j12 = j11 + i11;
            if (z10) {
                xVar.K(2);
                z0Var = e(z0Var, j12, xVar.f9731a, 2);
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
                z0Var = e(z0Var, j12, xVar.f9731a, i12);
                j12 += i12;
                xVar.N(0);
                for (int i13 = 0; i13 < i10; i13++) {
                    iArr[i13] = xVar.H();
                    iArr2[i13] = xVar.E();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = bVar.f16388b - ((int) (j12 - bVar.f16387a));
            }
            c3.i0 i0Var = (c3.i0) bVar.f16389c;
            String str = e2.n0.f9691a;
            byte[] bArr2 = i0Var.f6062b;
            byte[] bArr3 = dVar.f12560a;
            int i14 = i0Var.f6061a;
            int i15 = i0Var.f6063c;
            int i16 = i0Var.d;
            dVar.f12563f = i10;
            dVar.d = iArr;
            dVar.e = iArr2;
            dVar.f12561b = bArr2;
            dVar.f12560a = bArr3;
            dVar.f12562c = i14;
            dVar.f12564g = i15;
            dVar.h = i16;
            MediaCodec.CryptoInfo cryptoInfo = dVar.f12565i;
            cryptoInfo.numSubSamples = i10;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i14;
            if (Build.VERSION.SDK_INT >= 24) {
                h2.c cVar = dVar.f12566j;
                cVar.getClass();
                h2.c.a(cVar, i15, i16);
            }
            long j13 = bVar.f16387a;
            int i17 = (int) (j12 - j13);
            bVar.f16387a = j13 + i17;
            bVar.f16388b -= i17;
        }
        if (hVar.hasSupplementalData()) {
            xVar.K(4);
            u2.z0 e10 = e(z0Var, bVar.f16387a, xVar.f9731a, 4);
            int E = xVar.E();
            bVar.f16387a += 4;
            bVar.f16388b -= 4;
            hVar.b(E);
            u2.z0 d = d(e10, bVar.f16387a, hVar.f12569c, E);
            bVar.f16387a += E;
            int i18 = bVar.f16388b - E;
            bVar.f16388b = i18;
            ByteBuffer byteBuffer = hVar.f12570f;
            if (byteBuffer != null && byteBuffer.capacity() >= i18) {
                hVar.f12570f.clear();
            } else {
                hVar.f12570f = ByteBuffer.allocate(i18);
            }
            return d(d, bVar.f16387a, hVar.f12570f, bVar.f16388b);
        }
        hVar.b(bVar.f16388b);
        return d(z0Var, bVar.f16387a, hVar.f12569c, bVar.f16388b);
    }

    public void a(u2.z0 z0Var) {
        if (((y2.a) z0Var.f49529c) == null) {
            return;
        }
        a8.h0 h0Var = (a8.h0) this.f31699c;
        synchronized (h0Var) {
            ((i2.i) h0Var.d).f13560c.b(z0Var);
            u2.z0 z0Var2 = z0Var;
            while (z0Var2 != null) {
                y2.a aVar = (y2.a) z0Var2.f49529c;
                aVar.getClass();
                h0Var.t(aVar);
                z0Var2 = (u2.z0) z0Var2.d;
                if (z0Var2 == null || ((y2.a) z0Var2.f49529c) == null) {
                    z0Var2 = null;
                }
            }
        }
        z0Var.f49529c = null;
        z0Var.d = null;
    }

    public void b(long j10) {
        u2.z0 z0Var;
        if (j10 != -1) {
            while (true) {
                z0Var = (u2.z0) this.e;
                if (j10 < z0Var.f49528b) {
                    break;
                }
                a8.h0 h0Var = (a8.h0) this.f31699c;
                y2.a aVar = (y2.a) z0Var.f49529c;
                synchronized (h0Var) {
                    ((i2.i) h0Var.d).f13560c.c(aVar);
                    h0Var.t(aVar);
                }
                u2.z0 z0Var2 = (u2.z0) this.e;
                z0Var2.f49529c = null;
                z0Var2.d = null;
                this.e = (u2.z0) z0Var2.d;
            }
            if (((u2.z0) this.f31700f).f49527a < z0Var.f49527a) {
                this.f31700f = z0Var;
            }
        }
    }

    public int c(int i10) {
        y2.a a2;
        u2.z0 z0Var = (u2.z0) this.f31701g;
        if (((y2.a) z0Var.f49529c) == null) {
            a8.h0 h0Var = (a8.h0) this.f31699c;
            synchronized (h0Var) {
                a2 = ((i2.i) h0Var.d).f13560c.a();
                ((HashMap) h0Var.f511b).put(a2, (j2.j) h0Var.f512c);
                i2.h hVar = (i2.h) ((i2.i) h0Var.d).f13570p.get((j2.j) h0Var.f512c);
                if (hVar != null) {
                    hVar.a();
                }
            }
            u2.z0 z0Var2 = new u2.z0(((u2.z0) this.f31701g).f49528b, this.f31697a);
            z0Var.f49529c = a2;
            z0Var.d = z0Var2;
        }
        return Math.min(i10, (int) (((u2.z0) this.f31701g).f49528b - this.f31698b));
    }

    public pp0(np0 np0Var) {
        this.d = new ArrayList(50);
        this.e = new ArrayList(50);
        Paint paint = new Paint(1);
        this.f31700f = paint;
        this.f31697a = 250;
        this.f31699c = np0Var;
        paint.setStrokeWidth(AndroidUtilities.dp(1.33f));
    }
}
