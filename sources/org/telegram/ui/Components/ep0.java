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
    public final int f25961a;
    public long f25962b;
    public final Object f25963c;
    public final Object d;
    public Object e;
    public Object f25964f;
    public Object f25965g;

    public ep0(androidx.biometric.e eVar) {
        int i10;
        this.f25963c = eVar;
        synchronized (eVar) {
            i10 = ((i2.j) eVar.d).f12434c.f49896b;
        }
        this.f25961a = i10;
        this.d = new e2.x(32);
        u2.z0 z0Var = new u2.z0(0L, i10);
        this.e = z0Var;
        this.f25964f = z0Var;
        this.f25965g = z0Var;
    }

    public static u2.z0 d(u2.z0 z0Var, long j10, ByteBuffer byteBuffer, int i10) {
        while (j10 >= z0Var.f47497b) {
            z0Var = (u2.z0) z0Var.d;
        }
        while (i10 > 0) {
            int min = Math.min(i10, (int) (z0Var.f47497b - j10));
            y2.a aVar = (y2.a) z0Var.f47498c;
            byteBuffer.put(aVar.f49890a, ((int) (j10 - z0Var.f47496a)) + aVar.f49891b, min);
            i10 -= min;
            j10 += min;
            if (j10 == z0Var.f47497b) {
                z0Var = (u2.z0) z0Var.d;
            }
        }
        return z0Var;
    }

    public static u2.z0 e(u2.z0 z0Var, long j10, byte[] bArr, int i10) {
        while (j10 >= z0Var.f47497b) {
            z0Var = (u2.z0) z0Var.d;
        }
        int i11 = i10;
        while (i11 > 0) {
            int min = Math.min(i11, (int) (z0Var.f47497b - j10));
            y2.a aVar = (y2.a) z0Var.f47498c;
            System.arraycopy(aVar.f49890a, ((int) (j10 - z0Var.f47496a)) + aVar.f49891b, bArr, i10 - i11, min);
            i11 -= min;
            j10 += min;
            if (j10 == z0Var.f47497b) {
                z0Var = (u2.z0) z0Var.d;
            }
        }
        return z0Var;
    }

    public static u2.z0 f(u2.z0 z0Var, h2.h hVar, j5.c cVar, e2.x xVar) {
        boolean z10;
        if (hVar.getFlag(1073741824)) {
            long j10 = cVar.f14256a;
            int i10 = 1;
            xVar.K(1);
            u2.z0 e = e(z0Var, j10, xVar.f8291a, 1);
            long j11 = j10 + 1;
            byte b10 = xVar.f8291a[0];
            if ((b10 & 128) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i11 = b10 & Byte.MAX_VALUE;
            h2.d dVar = hVar.f11633b;
            byte[] bArr = dVar.f11625a;
            if (bArr == null) {
                dVar.f11625a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            z0Var = e(e, j11, dVar.f11625a, i11);
            long j12 = j11 + i11;
            if (z10) {
                xVar.K(2);
                z0Var = e(z0Var, j12, xVar.f8291a, 2);
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
                z0Var = e(z0Var, j12, xVar.f8291a, i12);
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
            String str = e2.m0.f8252a;
            byte[] bArr2 = i0Var.f4626b;
            byte[] bArr3 = dVar.f11625a;
            int i14 = i0Var.f4625a;
            int i15 = i0Var.f4627c;
            int i16 = i0Var.d;
            dVar.f11628f = i10;
            dVar.d = iArr;
            dVar.e = iArr2;
            dVar.f11626b = bArr2;
            dVar.f11625a = bArr3;
            dVar.f11627c = i14;
            dVar.f11629g = i15;
            dVar.h = i16;
            MediaCodec.CryptoInfo cryptoInfo = dVar.f11630i;
            cryptoInfo.numSubSamples = i10;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i14;
            if (Build.VERSION.SDK_INT >= 24) {
                h2.c cVar2 = dVar.f11631j;
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
            u2.z0 e7 = e(z0Var, cVar.f14256a, xVar.f8291a, 4);
            int E = xVar.E();
            cVar.f14256a += 4;
            cVar.f14257b -= 4;
            hVar.b(E);
            u2.z0 d = d(e7, cVar.f14256a, hVar.f11634c, E);
            cVar.f14256a += E;
            int i18 = cVar.f14257b - E;
            cVar.f14257b = i18;
            ByteBuffer byteBuffer = hVar.f11635f;
            if (byteBuffer != null && byteBuffer.capacity() >= i18) {
                hVar.f11635f.clear();
            } else {
                hVar.f11635f = ByteBuffer.allocate(i18);
            }
            return d(d, cVar.f14256a, hVar.f11635f, cVar.f14257b);
        }
        hVar.b(cVar.f14257b);
        return d(z0Var, cVar.f14256a, hVar.f11634c, cVar.f14257b);
    }

    public void a(u2.z0 z0Var) {
        if (((y2.a) z0Var.f47498c) == null) {
            return;
        }
        androidx.biometric.e eVar = (androidx.biometric.e) this.f25963c;
        synchronized (eVar) {
            ((i2.j) eVar.d).f12434c.b(z0Var);
            u2.z0 z0Var2 = z0Var;
            while (z0Var2 != null) {
                y2.a aVar = (y2.a) z0Var2.f47498c;
                aVar.getClass();
                eVar.t(aVar);
                z0Var2 = (u2.z0) z0Var2.d;
                if (z0Var2 == null || ((y2.a) z0Var2.f47498c) == null) {
                    z0Var2 = null;
                }
            }
        }
        z0Var.f47498c = null;
        z0Var.d = null;
    }

    public void b(long j10) {
        u2.z0 z0Var;
        if (j10 != -1) {
            while (true) {
                z0Var = (u2.z0) this.e;
                if (j10 < z0Var.f47497b) {
                    break;
                }
                androidx.biometric.e eVar = (androidx.biometric.e) this.f25963c;
                y2.a aVar = (y2.a) z0Var.f47498c;
                synchronized (eVar) {
                    ((i2.j) eVar.d).f12434c.c(aVar);
                    eVar.t(aVar);
                }
                u2.z0 z0Var2 = (u2.z0) this.e;
                z0Var2.f47498c = null;
                z0Var2.d = null;
                this.e = (u2.z0) z0Var2.d;
            }
            if (((u2.z0) this.f25964f).f47496a < z0Var.f47496a) {
                this.f25964f = z0Var;
            }
        }
    }

    public int c(int i10) {
        y2.a a2;
        u2.z0 z0Var = (u2.z0) this.f25965g;
        if (((y2.a) z0Var.f47498c) == null) {
            androidx.biometric.e eVar = (androidx.biometric.e) this.f25963c;
            synchronized (eVar) {
                a2 = ((i2.j) eVar.d).f12434c.a();
                ((HashMap) eVar.f2815b).put(a2, (j2.k) eVar.f2816c);
                i2.i iVar = (i2.i) ((i2.j) eVar.d).f12444p.get((j2.k) eVar.f2816c);
                if (iVar != null) {
                    iVar.a();
                }
            }
            u2.z0 z0Var2 = new u2.z0(((u2.z0) this.f25965g).f47497b, this.f25961a);
            z0Var.f47498c = a2;
            z0Var.d = z0Var2;
        }
        return Math.min(i10, (int) (((u2.z0) this.f25965g).f47497b - this.f25962b));
    }

    public ep0(rc0 rc0Var) {
        this.d = new ArrayList(50);
        this.e = new ArrayList(50);
        Paint paint = new Paint(1);
        this.f25964f = paint;
        this.f25961a = 250;
        this.f25963c = rc0Var;
        paint.setStrokeWidth(AndroidUtilities.dp(1.33f));
    }
}
