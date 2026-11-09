package org.telegram.ui.Components;

import android.graphics.Paint;
import android.media.MediaCodec;
import android.os.Build;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
public final class pm0 {
    public final int f37041a;
    public long f37042b;
    public final Object f37043c;
    public final Object d;
    public Object f37044e;
    public Object f37045f;
    public Object f37046g;

    public pm0(h6.m mVar) {
        int i7;
        this.f37043c = mVar;
        synchronized (mVar) {
            i7 = ((l2.h) mVar.d).f17826c.f2923b;
        }
        this.f37041a = i7;
        this.d = new h2.x(32);
        a4.c cVar = new a4.c(0L, i7);
        this.f37044e = cVar;
        this.f37045f = cVar;
        this.f37046g = cVar;
    }

    public static a4.c d(a4.c cVar, long j3, ByteBuffer byteBuffer, int i7) {
        while (j3 >= cVar.f159b) {
            cVar = (a4.c) cVar.d;
        }
        while (i7 > 0) {
            int min = Math.min(i7, (int) (cVar.f159b - j3));
            b3.a aVar = (b3.a) cVar.f160c;
            byteBuffer.put(aVar.f2913a, ((int) (j3 - cVar.f158a)) + aVar.f2914b, min);
            i7 -= min;
            j3 += min;
            if (j3 == cVar.f159b) {
                cVar = (a4.c) cVar.d;
            }
        }
        return cVar;
    }

    public static a4.c e(a4.c cVar, long j3, byte[] bArr, int i7) {
        while (j3 >= cVar.f159b) {
            cVar = (a4.c) cVar.d;
        }
        int i10 = i7;
        while (i10 > 0) {
            int min = Math.min(i10, (int) (cVar.f159b - j3));
            b3.a aVar = (b3.a) cVar.f160c;
            System.arraycopy(aVar.f2913a, ((int) (j3 - cVar.f158a)) + aVar.f2914b, bArr, i7 - i10, min);
            i10 -= min;
            j3 += min;
            if (j3 == cVar.f159b) {
                cVar = (a4.c) cVar.d;
            }
        }
        return cVar;
    }

    public static a4.c f(a4.c cVar, k2.h hVar, li.z zVar, h2.x xVar) {
        boolean z9;
        if (hVar.getFlag(1073741824)) {
            long j3 = zVar.f19036b;
            int i7 = 1;
            xVar.K(1);
            a4.c e10 = e(cVar, j3, xVar.f14162a, 1);
            long j10 = j3 + 1;
            byte b10 = xVar.f14162a[0];
            if ((b10 & 128) != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            int i10 = b10 & Byte.MAX_VALUE;
            k2.d dVar = hVar.f17174b;
            byte[] bArr = dVar.f17165a;
            if (bArr == null) {
                dVar.f17165a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            cVar = e(e10, j10, dVar.f17165a, i10);
            long j11 = j10 + i10;
            if (z9) {
                xVar.K(2);
                cVar = e(cVar, j11, xVar.f14162a, 2);
                j11 += 2;
                i7 = xVar.H();
            }
            int[] iArr = dVar.d;
            if (iArr == null || iArr.length < i7) {
                iArr = new int[i7];
            }
            int[] iArr2 = dVar.f17168e;
            if (iArr2 == null || iArr2.length < i7) {
                iArr2 = new int[i7];
            }
            if (z9) {
                int i11 = i7 * 6;
                xVar.K(i11);
                cVar = e(cVar, j11, xVar.f14162a, i11);
                j11 += i11;
                xVar.N(0);
                for (int i12 = 0; i12 < i7; i12++) {
                    iArr[i12] = xVar.H();
                    iArr2[i12] = xVar.E();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = zVar.f19035a - ((int) (j11 - zVar.f19036b));
            }
            f3.i0 i0Var = (f3.i0) zVar.f19037c;
            String str = h2.m0.f14112a;
            byte[] bArr2 = i0Var.f11036b;
            byte[] bArr3 = dVar.f17165a;
            int i13 = i0Var.f11035a;
            int i14 = i0Var.f11037c;
            int i15 = i0Var.d;
            dVar.f17169f = i7;
            dVar.d = iArr;
            dVar.f17168e = iArr2;
            dVar.f17166b = bArr2;
            dVar.f17165a = bArr3;
            dVar.f17167c = i13;
            dVar.f17170g = i14;
            dVar.h = i15;
            MediaCodec.CryptoInfo cryptoInfo = dVar.f17171i;
            cryptoInfo.numSubSamples = i7;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i13;
            if (Build.VERSION.SDK_INT >= 24) {
                k2.c cVar2 = dVar.f17172j;
                cVar2.getClass();
                k2.c.a(cVar2, i14, i15);
            }
            long j12 = zVar.f19036b;
            int i16 = (int) (j11 - j12);
            zVar.f19036b = j12 + i16;
            zVar.f19035a -= i16;
        }
        if (hVar.hasSupplementalData()) {
            xVar.K(4);
            a4.c e11 = e(cVar, zVar.f19036b, xVar.f14162a, 4);
            int E = xVar.E();
            zVar.f19036b += 4;
            zVar.f19035a -= 4;
            hVar.b(E);
            a4.c d = d(e11, zVar.f19036b, hVar.f17175c, E);
            zVar.f19036b += E;
            int i17 = zVar.f19035a - E;
            zVar.f19035a = i17;
            ByteBuffer byteBuffer = hVar.f17177f;
            if (byteBuffer != null && byteBuffer.capacity() >= i17) {
                hVar.f17177f.clear();
            } else {
                hVar.f17177f = ByteBuffer.allocate(i17);
            }
            return d(d, zVar.f19036b, hVar.f17177f, zVar.f19035a);
        }
        hVar.b(zVar.f19035a);
        return d(cVar, zVar.f19036b, hVar.f17175c, zVar.f19035a);
    }

    public void a(a4.c cVar) {
        if (((b3.a) cVar.f160c) == null) {
            return;
        }
        h6.m mVar = (h6.m) this.f37043c;
        synchronized (mVar) {
            ((l2.h) mVar.d).f17826c.b(cVar);
            a4.c cVar2 = cVar;
            while (cVar2 != null) {
                b3.a aVar = (b3.a) cVar2.f160c;
                aVar.getClass();
                mVar.D(aVar);
                cVar2 = (a4.c) cVar2.d;
                if (cVar2 == null || ((b3.a) cVar2.f160c) == null) {
                    cVar2 = null;
                }
            }
        }
        cVar.f160c = null;
        cVar.d = null;
    }

    public void b(long j3) {
        a4.c cVar;
        if (j3 != -1) {
            while (true) {
                cVar = (a4.c) this.f37044e;
                if (j3 < cVar.f159b) {
                    break;
                }
                h6.m mVar = (h6.m) this.f37043c;
                b3.a aVar = (b3.a) cVar.f160c;
                synchronized (mVar) {
                    ((l2.h) mVar.d).f17826c.c(aVar);
                    mVar.D(aVar);
                }
                a4.c cVar2 = (a4.c) this.f37044e;
                cVar2.f160c = null;
                cVar2.d = null;
                this.f37044e = (a4.c) cVar2.d;
            }
            if (((a4.c) this.f37045f).f158a < cVar.f158a) {
                this.f37045f = cVar;
            }
        }
    }

    public int c(int i7) {
        b3.a a10;
        a4.c cVar = (a4.c) this.f37046g;
        if (((b3.a) cVar.f160c) == null) {
            h6.m mVar = (h6.m) this.f37043c;
            synchronized (mVar) {
                a10 = ((l2.h) mVar.d).f17826c.a();
                ((HashMap) mVar.f14264b).put(a10, (m2.j) mVar.f14265c);
                l2.g gVar = (l2.g) ((l2.h) mVar.d).f17837p.get((m2.j) mVar.f14265c);
                if (gVar != null) {
                    gVar.a();
                }
            }
            a4.c cVar2 = new a4.c(((a4.c) this.f37046g).f159b, this.f37041a);
            cVar.f160c = a10;
            cVar.d = cVar2;
        }
        return Math.min(i7, (int) (((a4.c) this.f37046g).f159b - this.f37042b));
    }

    public pm0(pb0 pb0Var) {
        this.d = new ArrayList(50);
        this.f37044e = new ArrayList(50);
        Paint paint = new Paint(1);
        this.f37045f = paint;
        this.f37041a = 250;
        this.f37043c = pb0Var;
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.33f));
    }
}
