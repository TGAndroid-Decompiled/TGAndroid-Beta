package org.telegram.ui.Components;

import android.graphics.Paint;
import android.media.MediaCodec;
import android.os.Build;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
public final class dn0 {
    public final int f34541a;
    public long f34542b;
    public final Object f34543c;
    public final Object d;
    public Object f34544e;
    public Object f34545f;
    public Object f34546g;

    public dn0(h6.m mVar) {
        int i7;
        this.f34543c = mVar;
        synchronized (mVar) {
            i7 = ((l2.h) mVar.d).f19418c.f2884b;
        }
        this.f34541a = i7;
        this.d = new h2.x(32);
        a4.c cVar = new a4.c(0L, i7);
        this.f34544e = cVar;
        this.f34545f = cVar;
        this.f34546g = cVar;
    }

    public static a4.c d(a4.c cVar, long j3, ByteBuffer byteBuffer, int i7) {
        while (j3 >= cVar.f159b) {
            cVar = (a4.c) cVar.d;
        }
        while (i7 > 0) {
            int min = Math.min(i7, (int) (cVar.f159b - j3));
            b3.a aVar = (b3.a) cVar.f160c;
            byteBuffer.put(aVar.f2874a, ((int) (j3 - cVar.f158a)) + aVar.f2875b, min);
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
            System.arraycopy(aVar.f2874a, ((int) (j3 - cVar.f158a)) + aVar.f2875b, bArr, i7 - i10, min);
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
            long j3 = bVar.f20859a;
            int i7 = 1;
            xVar.K(1);
            a4.c e10 = e(cVar, j3, xVar.f13862a, 1);
            long j10 = j3 + 1;
            byte b10 = xVar.f13862a[0];
            if ((b10 & 128) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i10 = b10 & Byte.MAX_VALUE;
            k2.d dVar = hVar.f18154b;
            byte[] bArr = dVar.f18145a;
            if (bArr == null) {
                dVar.f18145a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            cVar = e(e10, j10, dVar.f18145a, i10);
            long j11 = j10 + i10;
            if (z10) {
                xVar.K(2);
                cVar = e(cVar, j11, xVar.f13862a, 2);
                j11 += 2;
                i7 = xVar.H();
            }
            int[] iArr = dVar.d;
            if (iArr == null || iArr.length < i7) {
                iArr = new int[i7];
            }
            int[] iArr2 = dVar.f18148e;
            if (iArr2 == null || iArr2.length < i7) {
                iArr2 = new int[i7];
            }
            if (z10) {
                int i11 = i7 * 6;
                xVar.K(i11);
                cVar = e(cVar, j11, xVar.f13862a, i11);
                j11 += i11;
                xVar.N(0);
                for (int i12 = 0; i12 < i7; i12++) {
                    iArr[i12] = xVar.H();
                    iArr2[i12] = xVar.E();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = bVar.f20860b - ((int) (j11 - bVar.f20859a));
            }
            f3.h0 h0Var = (f3.h0) bVar.f20861c;
            String str = h2.l0.f13812a;
            byte[] bArr2 = h0Var.f11191b;
            byte[] bArr3 = dVar.f18145a;
            int i13 = h0Var.f11190a;
            int i14 = h0Var.f11192c;
            int i15 = h0Var.d;
            dVar.f18149f = i7;
            dVar.d = iArr;
            dVar.f18148e = iArr2;
            dVar.f18146b = bArr2;
            dVar.f18145a = bArr3;
            dVar.f18147c = i13;
            dVar.f18150g = i14;
            dVar.h = i15;
            MediaCodec.CryptoInfo cryptoInfo = dVar.f18151i;
            cryptoInfo.numSubSamples = i7;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i13;
            if (Build.VERSION.SDK_INT >= 24) {
                k2.c cVar2 = dVar.f18152j;
                cVar2.getClass();
                k2.c.a(cVar2, i14, i15);
            }
            long j12 = bVar.f20859a;
            int i16 = (int) (j11 - j12);
            bVar.f20859a = j12 + i16;
            bVar.f20860b -= i16;
        }
        if (hVar.hasSupplementalData()) {
            xVar.K(4);
            a4.c e11 = e(cVar, bVar.f20859a, xVar.f13862a, 4);
            int E = xVar.E();
            bVar.f20859a += 4;
            bVar.f20860b -= 4;
            hVar.b(E);
            a4.c d = d(e11, bVar.f20859a, hVar.f18155c, E);
            bVar.f20859a += E;
            int i17 = bVar.f20860b - E;
            bVar.f20860b = i17;
            ByteBuffer byteBuffer = hVar.f18157f;
            if (byteBuffer != null && byteBuffer.capacity() >= i17) {
                hVar.f18157f.clear();
            } else {
                hVar.f18157f = ByteBuffer.allocate(i17);
            }
            return d(d, bVar.f20859a, hVar.f18157f, bVar.f20860b);
        }
        hVar.b(bVar.f20860b);
        return d(cVar, bVar.f20859a, hVar.f18155c, bVar.f20860b);
    }

    public void a(a4.c cVar) {
        if (((b3.a) cVar.f160c) == null) {
            return;
        }
        h6.m mVar = (h6.m) this.f34543c;
        synchronized (mVar) {
            ((l2.h) mVar.d).f19418c.b(cVar);
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
                cVar = (a4.c) this.f34544e;
                if (j3 < cVar.f159b) {
                    break;
                }
                h6.m mVar = (h6.m) this.f34543c;
                b3.a aVar = (b3.a) cVar.f160c;
                synchronized (mVar) {
                    ((l2.h) mVar.d).f19418c.c(aVar);
                    mVar.H(aVar);
                }
                a4.c cVar2 = (a4.c) this.f34544e;
                cVar2.f160c = null;
                cVar2.d = null;
                this.f34544e = (a4.c) cVar2.d;
            }
            if (((a4.c) this.f34545f).f158a < cVar.f158a) {
                this.f34545f = cVar;
            }
        }
    }

    public int c(int i7) {
        b3.a a10;
        a4.c cVar = (a4.c) this.f34546g;
        if (((b3.a) cVar.f160c) == null) {
            h6.m mVar = (h6.m) this.f34543c;
            synchronized (mVar) {
                a10 = ((l2.h) mVar.d).f19418c.a();
                ((HashMap) mVar.f13965b).put(a10, (m2.i) mVar.f13966c);
                l2.g gVar = (l2.g) ((l2.h) mVar.d).f19429p.get((m2.i) mVar.f13966c);
                if (gVar != null) {
                    gVar.a();
                }
            }
            a4.c cVar2 = new a4.c(((a4.c) this.f34546g).f159b, this.f34541a);
            cVar.f160c = a10;
            cVar.d = cVar2;
        }
        return Math.min(i7, (int) (((a4.c) this.f34546g).f159b - this.f34542b));
    }

    public dn0(hb0 hb0Var) {
        this.d = new ArrayList(50);
        this.f34544e = new ArrayList(50);
        Paint paint = new Paint(1);
        this.f34545f = paint;
        this.f34541a = 250;
        this.f34543c = hb0Var;
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.33f));
    }
}
