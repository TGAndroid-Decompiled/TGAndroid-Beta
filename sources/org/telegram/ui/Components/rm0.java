package org.telegram.ui.Components;

import android.graphics.Paint;
import android.media.MediaCodec;
import android.os.Build;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
public final class rm0 {
    public final int f37749a;
    public long f37750b;
    public final Object f37751c;
    public final Object d;
    public Object f37752e;
    public Object f37753f;
    public Object f37754g;

    public rm0(android.support.v4.media.session.a0 a0Var) {
        int i3;
        this.f37751c = a0Var;
        synchronized (a0Var) {
            i3 = ((k2.h) a0Var.d).f16515c.f65b;
        }
        this.f37749a = i3;
        this.d = new g2.y(32);
        w2.z0 z0Var = new w2.z0(0L, i3);
        this.f37752e = z0Var;
        this.f37753f = z0Var;
        this.f37754g = z0Var;
    }

    public static w2.z0 d(w2.z0 z0Var, long j10, ByteBuffer byteBuffer, int i3) {
        while (j10 >= z0Var.f57293b) {
            z0Var = (w2.z0) z0Var.d;
        }
        while (i3 > 0) {
            int min = Math.min(i3, (int) (z0Var.f57293b - j10));
            a3.a aVar = (a3.a) z0Var.f57294c;
            byteBuffer.put(aVar.f55a, ((int) (j10 - z0Var.f57292a)) + aVar.f56b, min);
            i3 -= min;
            j10 += min;
            if (j10 == z0Var.f57293b) {
                z0Var = (w2.z0) z0Var.d;
            }
        }
        return z0Var;
    }

    public static w2.z0 e(w2.z0 z0Var, long j10, byte[] bArr, int i3) {
        while (j10 >= z0Var.f57293b) {
            z0Var = (w2.z0) z0Var.d;
        }
        int i10 = i3;
        while (i10 > 0) {
            int min = Math.min(i10, (int) (z0Var.f57293b - j10));
            a3.a aVar = (a3.a) z0Var.f57294c;
            System.arraycopy(aVar.f55a, ((int) (j10 - z0Var.f57292a)) + aVar.f56b, bArr, i3 - i10, min);
            i10 -= min;
            j10 += min;
            if (j10 == z0Var.f57293b) {
                z0Var = (w2.z0) z0Var.d;
            }
        }
        return z0Var;
    }

    public static w2.z0 f(w2.z0 z0Var, j2.h hVar, l5.c cVar, g2.y yVar) {
        boolean z10;
        if (hVar.getFlag(1073741824)) {
            long j10 = cVar.f18042a;
            int i3 = 1;
            yVar.K(1);
            w2.z0 e10 = e(z0Var, j10, yVar.f11923a, 1);
            long j11 = j10 + 1;
            byte b10 = yVar.f11923a[0];
            if ((b10 & 128) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i10 = b10 & Byte.MAX_VALUE;
            j2.d dVar = hVar.f16156b;
            byte[] bArr = dVar.f16147a;
            if (bArr == null) {
                dVar.f16147a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            z0Var = e(e10, j11, dVar.f16147a, i10);
            long j12 = j11 + i10;
            if (z10) {
                yVar.K(2);
                z0Var = e(z0Var, j12, yVar.f11923a, 2);
                j12 += 2;
                i3 = yVar.H();
            }
            int[] iArr = dVar.d;
            if (iArr == null || iArr.length < i3) {
                iArr = new int[i3];
            }
            int[] iArr2 = dVar.f16150e;
            if (iArr2 == null || iArr2.length < i3) {
                iArr2 = new int[i3];
            }
            if (z10) {
                int i11 = i3 * 6;
                yVar.K(i11);
                z0Var = e(z0Var, j12, yVar.f11923a, i11);
                j12 += i11;
                yVar.N(0);
                for (int i12 = 0; i12 < i3; i12++) {
                    iArr[i12] = yVar.H();
                    iArr2[i12] = yVar.E();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = cVar.f18043b - ((int) (j12 - cVar.f18042a));
            }
            e3.h0 h0Var = (e3.h0) cVar.f18044c;
            String str = g2.n0.f11873a;
            byte[] bArr2 = h0Var.f9472b;
            byte[] bArr3 = dVar.f16147a;
            int i13 = h0Var.f9471a;
            int i14 = h0Var.f9473c;
            int i15 = h0Var.d;
            dVar.f16151f = i3;
            dVar.d = iArr;
            dVar.f16150e = iArr2;
            dVar.f16148b = bArr2;
            dVar.f16147a = bArr3;
            dVar.f16149c = i13;
            dVar.f16152g = i14;
            dVar.h = i15;
            MediaCodec.CryptoInfo cryptoInfo = dVar.f16153i;
            cryptoInfo.numSubSamples = i3;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i13;
            if (Build.VERSION.SDK_INT >= 24) {
                j2.c cVar2 = dVar.f16154j;
                cVar2.getClass();
                j2.c.a(cVar2, i14, i15);
            }
            long j13 = cVar.f18042a;
            int i16 = (int) (j12 - j13);
            cVar.f18042a = j13 + i16;
            cVar.f18043b -= i16;
        }
        if (hVar.hasSupplementalData()) {
            yVar.K(4);
            w2.z0 e11 = e(z0Var, cVar.f18042a, yVar.f11923a, 4);
            int E = yVar.E();
            cVar.f18042a += 4;
            cVar.f18043b -= 4;
            hVar.b(E);
            w2.z0 d = d(e11, cVar.f18042a, hVar.f16157c, E);
            cVar.f18042a += E;
            int i17 = cVar.f18043b - E;
            cVar.f18043b = i17;
            ByteBuffer byteBuffer = hVar.f16159f;
            if (byteBuffer != null && byteBuffer.capacity() >= i17) {
                hVar.f16159f.clear();
            } else {
                hVar.f16159f = ByteBuffer.allocate(i17);
            }
            return d(d, cVar.f18042a, hVar.f16159f, cVar.f18043b);
        }
        hVar.b(cVar.f18043b);
        return d(z0Var, cVar.f18042a, hVar.f16157c, cVar.f18043b);
    }

    public void a(w2.z0 z0Var) {
        if (((a3.a) z0Var.f57294c) == null) {
            return;
        }
        android.support.v4.media.session.a0 a0Var = (android.support.v4.media.session.a0) this.f37751c;
        synchronized (a0Var) {
            ((k2.h) a0Var.d).f16515c.c(z0Var);
            w2.z0 z0Var2 = z0Var;
            while (z0Var2 != null) {
                a3.a aVar = (a3.a) z0Var2.f57294c;
                aVar.getClass();
                a0Var.p(aVar);
                z0Var2 = (w2.z0) z0Var2.d;
                if (z0Var2 == null || ((a3.a) z0Var2.f57294c) == null) {
                    z0Var2 = null;
                }
            }
        }
        z0Var.f57294c = null;
        z0Var.d = null;
    }

    public void b(long j10) {
        w2.z0 z0Var;
        if (j10 != -1) {
            while (true) {
                z0Var = (w2.z0) this.f37752e;
                if (j10 < z0Var.f57293b) {
                    break;
                }
                android.support.v4.media.session.a0 a0Var = (android.support.v4.media.session.a0) this.f37751c;
                a3.a aVar = (a3.a) z0Var.f57294c;
                synchronized (a0Var) {
                    ((k2.h) a0Var.d).f16515c.b(aVar);
                    a0Var.p(aVar);
                }
                w2.z0 z0Var2 = (w2.z0) this.f37752e;
                z0Var2.f57294c = null;
                z0Var2.d = null;
                this.f37752e = (w2.z0) z0Var2.d;
            }
            if (((w2.z0) this.f37753f).f57292a < z0Var.f57292a) {
                this.f37753f = z0Var;
            }
        }
    }

    public int c(int i3) {
        a3.a a10;
        w2.z0 z0Var = (w2.z0) this.f37754g;
        if (((a3.a) z0Var.f57294c) == null) {
            android.support.v4.media.session.a0 a0Var = (android.support.v4.media.session.a0) this.f37751c;
            synchronized (a0Var) {
                a10 = ((k2.h) a0Var.d).f16515c.a();
                ((HashMap) a0Var.f1186b).put(a10, (l2.k) a0Var.f1187c);
                k2.g gVar = (k2.g) ((k2.h) a0Var.d).f16526p.get((l2.k) a0Var.f1187c);
                if (gVar != null) {
                    gVar.a();
                }
            }
            w2.z0 z0Var2 = new w2.z0(((w2.z0) this.f37754g).f57293b, this.f37749a);
            z0Var.f57294c = a10;
            z0Var.d = z0Var2;
        }
        return Math.min(i3, (int) (((w2.z0) this.f37754g).f57293b - this.f37750b));
    }

    public rm0(jb0 jb0Var) {
        this.d = new ArrayList(50);
        this.f37752e = new ArrayList(50);
        Paint paint = new Paint(1);
        this.f37753f = paint;
        this.f37749a = 250;
        this.f37751c = jb0Var;
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.33f));
    }
}
