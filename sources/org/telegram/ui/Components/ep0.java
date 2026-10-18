package org.telegram.ui.Components;

import android.graphics.Paint;
import android.media.MediaCodec;
import android.os.Build;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
public final class ep0 {
    public final int f25972a;
    public long f25973b;
    public final Object f25974c;
    public final Object d;
    public Object e;
    public Object f25975f;
    public Object f25976g;

    public ep0(androidx.biometric.e eVar) {
        int i10;
        this.f25974c = eVar;
        synchronized (eVar) {
            i10 = ((i2.i) eVar.d).f12431c.f49895b;
        }
        this.f25972a = i10;
        this.d = new e2.x(32);
        u2.a1 a1Var = new u2.a1(0L, i10);
        this.e = a1Var;
        this.f25975f = a1Var;
        this.f25976g = a1Var;
    }

    public static u2.a1 d(u2.a1 a1Var, long j10, ByteBuffer byteBuffer, int i10) {
        while (j10 >= a1Var.f47247b) {
            a1Var = (u2.a1) a1Var.d;
        }
        while (i10 > 0) {
            int min = Math.min(i10, (int) (a1Var.f47247b - j10));
            y2.a aVar = (y2.a) a1Var.f47248c;
            byteBuffer.put(aVar.f49889a, ((int) (j10 - a1Var.f47246a)) + aVar.f49890b, min);
            i10 -= min;
            j10 += min;
            if (j10 == a1Var.f47247b) {
                a1Var = (u2.a1) a1Var.d;
            }
        }
        return a1Var;
    }

    public static u2.a1 e(u2.a1 a1Var, long j10, byte[] bArr, int i10) {
        while (j10 >= a1Var.f47247b) {
            a1Var = (u2.a1) a1Var.d;
        }
        int i11 = i10;
        while (i11 > 0) {
            int min = Math.min(i11, (int) (a1Var.f47247b - j10));
            y2.a aVar = (y2.a) a1Var.f47248c;
            System.arraycopy(aVar.f49889a, ((int) (j10 - a1Var.f47246a)) + aVar.f49890b, bArr, i10 - i11, min);
            i11 -= min;
            j10 += min;
            if (j10 == a1Var.f47247b) {
                a1Var = (u2.a1) a1Var.d;
            }
        }
        return a1Var;
    }

    public static u2.a1 f(u2.a1 a1Var, h2.h hVar, j5.c cVar, e2.x xVar) {
        boolean z10;
        if (hVar.getFlag(1073741824)) {
            long j10 = cVar.f14256a;
            int i10 = 1;
            xVar.K(1);
            u2.a1 e = e(a1Var, j10, xVar.f8292a, 1);
            long j11 = j10 + 1;
            byte b10 = xVar.f8292a[0];
            if ((b10 & 128) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i11 = b10 & Byte.MAX_VALUE;
            h2.d dVar = hVar.f11634b;
            byte[] bArr = dVar.f11626a;
            if (bArr == null) {
                dVar.f11626a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            a1Var = e(e, j11, dVar.f11626a, i11);
            long j12 = j11 + i11;
            if (z10) {
                xVar.K(2);
                a1Var = e(a1Var, j12, xVar.f8292a, 2);
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
                a1Var = e(a1Var, j12, xVar.f8292a, i12);
                j12 += i12;
                xVar.N(0);
                for (int i13 = 0; i13 < i10; i13++) {
                    iArr[i13] = xVar.H();
                    iArr2[i13] = xVar.E();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = cVar.f14257b - ((int) (j12 - cVar.f14256a));
            }
            c3.i0 i0Var = (c3.i0) cVar.f14258c;
            String str = e2.m0.f8253a;
            byte[] bArr2 = i0Var.f4630b;
            byte[] bArr3 = dVar.f11626a;
            int i14 = i0Var.f4629a;
            int i15 = i0Var.f4631c;
            int i16 = i0Var.d;
            dVar.f11629f = i10;
            dVar.d = iArr;
            dVar.e = iArr2;
            dVar.f11627b = bArr2;
            dVar.f11626a = bArr3;
            dVar.f11628c = i14;
            dVar.f11630g = i15;
            dVar.h = i16;
            MediaCodec.CryptoInfo cryptoInfo = dVar.f11631i;
            cryptoInfo.numSubSamples = i10;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i14;
            if (Build.VERSION.SDK_INT >= 24) {
                h2.c cVar2 = dVar.f11632j;
                cVar2.getClass();
                h2.c.a(cVar2, i15, i16);
            }
            long j13 = cVar.f14256a;
            int i17 = (int) (j12 - j13);
            cVar.f14256a = j13 + i17;
            cVar.f14257b -= i17;
        }
        if (hVar.hasSupplementalData()) {
            xVar.K(4);
            u2.a1 e7 = e(a1Var, cVar.f14256a, xVar.f8292a, 4);
            int E = xVar.E();
            cVar.f14256a += 4;
            cVar.f14257b -= 4;
            hVar.b(E);
            u2.a1 d = d(e7, cVar.f14256a, hVar.f11635c, E);
            cVar.f14256a += E;
            int i18 = cVar.f14257b - E;
            cVar.f14257b = i18;
            ByteBuffer byteBuffer = hVar.f11636f;
            if (byteBuffer != null && byteBuffer.capacity() >= i18) {
                hVar.f11636f.clear();
            } else {
                hVar.f11636f = ByteBuffer.allocate(i18);
            }
            return d(d, cVar.f14256a, hVar.f11636f, cVar.f14257b);
        }
        hVar.b(cVar.f14257b);
        return d(a1Var, cVar.f14256a, hVar.f11635c, cVar.f14257b);
    }

    public void a(u2.a1 a1Var) {
        if (((y2.a) a1Var.f47248c) == null) {
            return;
        }
        androidx.biometric.e eVar = (androidx.biometric.e) this.f25974c;
        synchronized (eVar) {
            ((i2.i) eVar.d).f12431c.b(a1Var);
            u2.a1 a1Var2 = a1Var;
            while (a1Var2 != null) {
                y2.a aVar = (y2.a) a1Var2.f47248c;
                aVar.getClass();
                eVar.u(aVar);
                a1Var2 = (u2.a1) a1Var2.d;
                if (a1Var2 == null || ((y2.a) a1Var2.f47248c) == null) {
                    a1Var2 = null;
                }
            }
        }
        a1Var.f47248c = null;
        a1Var.d = null;
    }

    public void b(long j10) {
        u2.a1 a1Var;
        if (j10 != -1) {
            while (true) {
                a1Var = (u2.a1) this.e;
                if (j10 < a1Var.f47247b) {
                    break;
                }
                androidx.biometric.e eVar = (androidx.biometric.e) this.f25974c;
                y2.a aVar = (y2.a) a1Var.f47248c;
                synchronized (eVar) {
                    ((i2.i) eVar.d).f12431c.c(aVar);
                    eVar.u(aVar);
                }
                u2.a1 a1Var2 = (u2.a1) this.e;
                a1Var2.f47248c = null;
                a1Var2.d = null;
                this.e = (u2.a1) a1Var2.d;
            }
            if (((u2.a1) this.f25975f).f47246a < a1Var.f47246a) {
                this.f25975f = a1Var;
            }
        }
    }

    public int c(int i10) {
        y2.a a2;
        u2.a1 a1Var = (u2.a1) this.f25976g;
        if (((y2.a) a1Var.f47248c) == null) {
            androidx.biometric.e eVar = (androidx.biometric.e) this.f25974c;
            synchronized (eVar) {
                a2 = ((i2.i) eVar.d).f12431c.a();
                ((HashMap) eVar.f2819b).put(a2, (j2.k) eVar.f2820c);
                i2.h hVar = (i2.h) ((i2.i) eVar.d).f12441p.get((j2.k) eVar.f2820c);
                if (hVar != null) {
                    hVar.a();
                }
            }
            u2.a1 a1Var2 = new u2.a1(((u2.a1) this.f25976g).f47247b, this.f25972a);
            a1Var.f47248c = a2;
            a1Var.d = a1Var2;
        }
        return Math.min(i10, (int) (((u2.a1) this.f25976g).f47247b - this.f25973b));
    }

    public ep0(rc0 rc0Var) {
        this.d = new ArrayList(50);
        this.e = new ArrayList(50);
        Paint paint = new Paint(1);
        this.f25975f = paint;
        this.f25972a = 250;
        this.f25974c = rc0Var;
        paint.setStrokeWidth(AndroidUtilities.dp(1.33f));
    }
}
