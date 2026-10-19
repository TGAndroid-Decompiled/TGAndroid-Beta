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
    public final int f25963a;
    public long f25964b;
    public final Object f25965c;
    public final Object d;
    public Object e;
    public Object f25966f;
    public Object f25967g;

    public ep0(androidx.biometric.e eVar) {
        int i10;
        this.f25965c = eVar;
        synchronized (eVar) {
            i10 = ((i2.j) eVar.d).f12436c.f49894b;
        }
        this.f25963a = i10;
        this.d = new e2.x(32);
        u2.z0 z0Var = new u2.z0(0L, i10);
        this.e = z0Var;
        this.f25966f = z0Var;
        this.f25967g = z0Var;
    }

    public static u2.z0 d(u2.z0 z0Var, long j10, ByteBuffer byteBuffer, int i10) {
        while (j10 >= z0Var.f47495b) {
            z0Var = (u2.z0) z0Var.d;
        }
        while (i10 > 0) {
            int min = Math.min(i10, (int) (z0Var.f47495b - j10));
            y2.a aVar = (y2.a) z0Var.f47496c;
            byteBuffer.put(aVar.f49888a, ((int) (j10 - z0Var.f47494a)) + aVar.f49889b, min);
            i10 -= min;
            j10 += min;
            if (j10 == z0Var.f47495b) {
                z0Var = (u2.z0) z0Var.d;
            }
        }
        return z0Var;
    }

    public static u2.z0 e(u2.z0 z0Var, long j10, byte[] bArr, int i10) {
        while (j10 >= z0Var.f47495b) {
            z0Var = (u2.z0) z0Var.d;
        }
        int i11 = i10;
        while (i11 > 0) {
            int min = Math.min(i11, (int) (z0Var.f47495b - j10));
            y2.a aVar = (y2.a) z0Var.f47496c;
            System.arraycopy(aVar.f49888a, ((int) (j10 - z0Var.f47494a)) + aVar.f49889b, bArr, i10 - i11, min);
            i11 -= min;
            j10 += min;
            if (j10 == z0Var.f47495b) {
                z0Var = (u2.z0) z0Var.d;
            }
        }
        return z0Var;
    }

    public static u2.z0 f(u2.z0 z0Var, h2.h hVar, j5.c cVar, e2.x xVar) {
        boolean z10;
        if (hVar.getFlag(1073741824)) {
            long j10 = cVar.f14258a;
            int i10 = 1;
            xVar.K(1);
            u2.z0 e = e(z0Var, j10, xVar.f8293a, 1);
            long j11 = j10 + 1;
            byte b10 = xVar.f8293a[0];
            if ((b10 & 128) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i11 = b10 & Byte.MAX_VALUE;
            h2.d dVar = hVar.f11635b;
            byte[] bArr = dVar.f11627a;
            if (bArr == null) {
                dVar.f11627a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            z0Var = e(e, j11, dVar.f11627a, i11);
            long j12 = j11 + i11;
            if (z10) {
                xVar.K(2);
                z0Var = e(z0Var, j12, xVar.f8293a, 2);
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
                z0Var = e(z0Var, j12, xVar.f8293a, i12);
                j12 += i12;
                xVar.N(0);
                for (int i13 = 0; i13 < i10; i13++) {
                    iArr[i13] = xVar.H();
                    iArr2[i13] = xVar.E();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = cVar.f14259b - ((int) (j12 - cVar.f14258a));
            }
            c3.i0 i0Var = (c3.i0) cVar.f14260c;
            String str = e2.m0.f8254a;
            byte[] bArr2 = i0Var.f4628b;
            byte[] bArr3 = dVar.f11627a;
            int i14 = i0Var.f4627a;
            int i15 = i0Var.f4629c;
            int i16 = i0Var.d;
            dVar.f11630f = i10;
            dVar.d = iArr;
            dVar.e = iArr2;
            dVar.f11628b = bArr2;
            dVar.f11627a = bArr3;
            dVar.f11629c = i14;
            dVar.f11631g = i15;
            dVar.h = i16;
            MediaCodec.CryptoInfo cryptoInfo = dVar.f11632i;
            cryptoInfo.numSubSamples = i10;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i14;
            if (Build.VERSION.SDK_INT >= 24) {
                h2.c cVar2 = dVar.f11633j;
                cVar2.getClass();
                h2.c.a(cVar2, i15, i16);
            }
            long j13 = cVar.f14258a;
            int i17 = (int) (j12 - j13);
            cVar.f14258a = j13 + i17;
            cVar.f14259b -= i17;
        }
        if (hVar.hasSupplementalData()) {
            xVar.K(4);
            u2.z0 e7 = e(z0Var, cVar.f14258a, xVar.f8293a, 4);
            int E = xVar.E();
            cVar.f14258a += 4;
            cVar.f14259b -= 4;
            hVar.b(E);
            u2.z0 d = d(e7, cVar.f14258a, hVar.f11636c, E);
            cVar.f14258a += E;
            int i18 = cVar.f14259b - E;
            cVar.f14259b = i18;
            ByteBuffer byteBuffer = hVar.f11637f;
            if (byteBuffer != null && byteBuffer.capacity() >= i18) {
                hVar.f11637f.clear();
            } else {
                hVar.f11637f = ByteBuffer.allocate(i18);
            }
            return d(d, cVar.f14258a, hVar.f11637f, cVar.f14259b);
        }
        hVar.b(cVar.f14259b);
        return d(z0Var, cVar.f14258a, hVar.f11636c, cVar.f14259b);
    }

    public void a(u2.z0 z0Var) {
        if (((y2.a) z0Var.f47496c) == null) {
            return;
        }
        androidx.biometric.e eVar = (androidx.biometric.e) this.f25965c;
        synchronized (eVar) {
            ((i2.j) eVar.d).f12436c.b(z0Var);
            u2.z0 z0Var2 = z0Var;
            while (z0Var2 != null) {
                y2.a aVar = (y2.a) z0Var2.f47496c;
                aVar.getClass();
                eVar.t(aVar);
                z0Var2 = (u2.z0) z0Var2.d;
                if (z0Var2 == null || ((y2.a) z0Var2.f47496c) == null) {
                    z0Var2 = null;
                }
            }
        }
        z0Var.f47496c = null;
        z0Var.d = null;
    }

    public void b(long j10) {
        u2.z0 z0Var;
        if (j10 != -1) {
            while (true) {
                z0Var = (u2.z0) this.e;
                if (j10 < z0Var.f47495b) {
                    break;
                }
                androidx.biometric.e eVar = (androidx.biometric.e) this.f25965c;
                y2.a aVar = (y2.a) z0Var.f47496c;
                synchronized (eVar) {
                    ((i2.j) eVar.d).f12436c.c(aVar);
                    eVar.t(aVar);
                }
                u2.z0 z0Var2 = (u2.z0) this.e;
                z0Var2.f47496c = null;
                z0Var2.d = null;
                this.e = (u2.z0) z0Var2.d;
            }
            if (((u2.z0) this.f25966f).f47494a < z0Var.f47494a) {
                this.f25966f = z0Var;
            }
        }
    }

    public int c(int i10) {
        y2.a a2;
        u2.z0 z0Var = (u2.z0) this.f25967g;
        if (((y2.a) z0Var.f47496c) == null) {
            androidx.biometric.e eVar = (androidx.biometric.e) this.f25965c;
            synchronized (eVar) {
                a2 = ((i2.j) eVar.d).f12436c.a();
                ((HashMap) eVar.f2817b).put(a2, (j2.k) eVar.f2818c);
                i2.i iVar = (i2.i) ((i2.j) eVar.d).f12446p.get((j2.k) eVar.f2818c);
                if (iVar != null) {
                    iVar.a();
                }
            }
            u2.z0 z0Var2 = new u2.z0(((u2.z0) this.f25967g).f47495b, this.f25963a);
            z0Var.f47496c = a2;
            z0Var.d = z0Var2;
        }
        return Math.min(i10, (int) (((u2.z0) this.f25967g).f47495b - this.f25964b));
    }

    public ep0(rc0 rc0Var) {
        this.d = new ArrayList(50);
        this.e = new ArrayList(50);
        Paint paint = new Paint(1);
        this.f25966f = paint;
        this.f25963a = 250;
        this.f25965c = rc0Var;
        paint.setStrokeWidth(AndroidUtilities.dp(1.33f));
    }
}
