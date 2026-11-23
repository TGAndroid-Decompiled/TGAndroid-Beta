package org.telegram.ui.Components;

import android.graphics.Paint;
import android.media.MediaCodec;
import android.os.Build;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
public final class cn0 {
    public final int f34091a;
    public long f34092b;
    public final Object f34093c;
    public final Object d;
    public Object f34094e;
    public Object f34095f;
    public Object f34096g;

    public cn0(h6.m mVar) {
        int i7;
        this.f34093c = mVar;
        synchronized (mVar) {
            i7 = ((l2.i) mVar.d).f19491c.f2843b;
        }
        this.f34091a = i7;
        this.d = new h2.x(32);
        a4.c cVar = new a4.c(0L, i7);
        this.f34094e = cVar;
        this.f34095f = cVar;
        this.f34096g = cVar;
    }

    public static a4.c d(a4.c cVar, long j3, ByteBuffer byteBuffer, int i7) {
        while (j3 >= cVar.f159b) {
            cVar = (a4.c) cVar.d;
        }
        while (i7 > 0) {
            int min = Math.min(i7, (int) (cVar.f159b - j3));
            b3.a aVar = (b3.a) cVar.f160c;
            byteBuffer.put(aVar.f2833a, ((int) (j3 - cVar.f158a)) + aVar.f2834b, min);
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
            System.arraycopy(aVar.f2833a, ((int) (j3 - cVar.f158a)) + aVar.f2834b, bArr, i7 - i10, min);
            i10 -= min;
            j3 += min;
            if (j3 == cVar.f159b) {
                cVar = (a4.c) cVar.d;
            }
        }
        return cVar;
    }

    public static a4.c f(a4.c cVar, k2.h hVar, m5.b bVar, h2.x xVar) {
        boolean z10;
        if (hVar.getFlag(1073741824)) {
            long j3 = bVar.f20924a;
            int i7 = 1;
            xVar.K(1);
            a4.c e10 = e(cVar, j3, xVar.f13828a, 1);
            long j10 = j3 + 1;
            byte b10 = xVar.f13828a[0];
            if ((b10 & 128) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i10 = b10 & Byte.MAX_VALUE;
            k2.d dVar = hVar.f18222b;
            byte[] bArr = dVar.f18213a;
            if (bArr == null) {
                dVar.f18213a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            cVar = e(e10, j10, dVar.f18213a, i10);
            long j11 = j10 + i10;
            if (z10) {
                xVar.K(2);
                cVar = e(cVar, j11, xVar.f13828a, 2);
                j11 += 2;
                i7 = xVar.H();
            }
            int[] iArr = dVar.d;
            if (iArr == null || iArr.length < i7) {
                iArr = new int[i7];
            }
            int[] iArr2 = dVar.f18216e;
            if (iArr2 == null || iArr2.length < i7) {
                iArr2 = new int[i7];
            }
            if (z10) {
                int i11 = i7 * 6;
                xVar.K(i11);
                cVar = e(cVar, j11, xVar.f13828a, i11);
                j11 += i11;
                xVar.N(0);
                for (int i12 = 0; i12 < i7; i12++) {
                    iArr[i12] = xVar.H();
                    iArr2[i12] = xVar.E();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = bVar.f20925b - ((int) (j11 - bVar.f20924a));
            }
            f3.i0 i0Var = (f3.i0) bVar.f20926c;
            String str = h2.l0.f13778a;
            byte[] bArr2 = i0Var.f11161b;
            byte[] bArr3 = dVar.f18213a;
            int i13 = i0Var.f11160a;
            int i14 = i0Var.f11162c;
            int i15 = i0Var.d;
            dVar.f18217f = i7;
            dVar.d = iArr;
            dVar.f18216e = iArr2;
            dVar.f18214b = bArr2;
            dVar.f18213a = bArr3;
            dVar.f18215c = i13;
            dVar.f18218g = i14;
            dVar.h = i15;
            MediaCodec.CryptoInfo cryptoInfo = dVar.f18219i;
            cryptoInfo.numSubSamples = i7;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i13;
            if (Build.VERSION.SDK_INT >= 24) {
                k2.c cVar2 = dVar.f18220j;
                cVar2.getClass();
                k2.c.a(cVar2, i14, i15);
            }
            long j12 = bVar.f20924a;
            int i16 = (int) (j11 - j12);
            bVar.f20924a = j12 + i16;
            bVar.f20925b -= i16;
        }
        if (hVar.hasSupplementalData()) {
            xVar.K(4);
            a4.c e11 = e(cVar, bVar.f20924a, xVar.f13828a, 4);
            int E = xVar.E();
            bVar.f20924a += 4;
            bVar.f20925b -= 4;
            hVar.b(E);
            a4.c d = d(e11, bVar.f20924a, hVar.f18223c, E);
            bVar.f20924a += E;
            int i17 = bVar.f20925b - E;
            bVar.f20925b = i17;
            ByteBuffer byteBuffer = hVar.f18225f;
            if (byteBuffer != null && byteBuffer.capacity() >= i17) {
                hVar.f18225f.clear();
            } else {
                hVar.f18225f = ByteBuffer.allocate(i17);
            }
            return d(d, bVar.f20924a, hVar.f18225f, bVar.f20925b);
        }
        hVar.b(bVar.f20925b);
        return d(cVar, bVar.f20924a, hVar.f18223c, bVar.f20925b);
    }

    public void a(a4.c cVar) {
        if (((b3.a) cVar.f160c) == null) {
            return;
        }
        h6.m mVar = (h6.m) this.f34093c;
        synchronized (mVar) {
            ((l2.i) mVar.d).f19491c.b(cVar);
            a4.c cVar2 = cVar;
            while (cVar2 != null) {
                b3.a aVar = (b3.a) cVar2.f160c;
                aVar.getClass();
                mVar.H(aVar);
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
                cVar = (a4.c) this.f34094e;
                if (j3 < cVar.f159b) {
                    break;
                }
                h6.m mVar = (h6.m) this.f34093c;
                b3.a aVar = (b3.a) cVar.f160c;
                synchronized (mVar) {
                    ((l2.i) mVar.d).f19491c.c(aVar);
                    mVar.H(aVar);
                }
                a4.c cVar2 = (a4.c) this.f34094e;
                cVar2.f160c = null;
                cVar2.d = null;
                this.f34094e = (a4.c) cVar2.d;
            }
            if (((a4.c) this.f34095f).f158a < cVar.f158a) {
                this.f34095f = cVar;
            }
        }
    }

    public int c(int i7) {
        b3.a a10;
        a4.c cVar = (a4.c) this.f34096g;
        if (((b3.a) cVar.f160c) == null) {
            h6.m mVar = (h6.m) this.f34093c;
            synchronized (mVar) {
                a10 = ((l2.i) mVar.d).f19491c.a();
                ((HashMap) mVar.f13931b).put(a10, (m2.i) mVar.f13932c);
                l2.h hVar = (l2.h) ((l2.i) mVar.d).f19502p.get((m2.i) mVar.f13932c);
                if (hVar != null) {
                    hVar.a();
                }
            }
            a4.c cVar2 = new a4.c(((a4.c) this.f34096g).f159b, this.f34091a);
            cVar.f160c = a10;
            cVar.d = cVar2;
        }
        return Math.min(i7, (int) (((a4.c) this.f34096g).f159b - this.f34092b));
    }

    public cn0(eb0 eb0Var) {
        this.d = new ArrayList(50);
        this.f34094e = new ArrayList(50);
        Paint paint = new Paint(1);
        this.f34095f = paint;
        this.f34091a = 250;
        this.f34093c = eb0Var;
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.33f));
    }
}
