package org.telegram.ui.Components;

import android.graphics.Paint;
import android.media.MediaCodec;
import android.os.Build;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
public final class jp0 {
    public final int f27735a;
    public long f27736b;
    public final Object f27737c;
    public final Object d;
    public Object e;
    public Object f27738f;
    public Object f27739g;

    public jp0(androidx.biometric.e eVar) {
        int i10;
        this.f27737c = eVar;
        synchronized (eVar) {
            i10 = ((i2.i) eVar.d).f12463c.f50345b;
        }
        this.f27735a = i10;
        this.d = new e2.x(32);
        u2.b1 b1Var = new u2.b1(0L, i10);
        this.e = b1Var;
        this.f27738f = b1Var;
        this.f27739g = b1Var;
    }

    public static u2.b1 d(u2.b1 b1Var, long j10, ByteBuffer byteBuffer, int i10) {
        while (j10 >= b1Var.f47709b) {
            b1Var = (u2.b1) b1Var.d;
        }
        while (i10 > 0) {
            int min = Math.min(i10, (int) (b1Var.f47709b - j10));
            y2.a aVar = (y2.a) b1Var.f47710c;
            byteBuffer.put(aVar.f50339a, ((int) (j10 - b1Var.f47708a)) + aVar.f50340b, min);
            i10 -= min;
            j10 += min;
            if (j10 == b1Var.f47709b) {
                b1Var = (u2.b1) b1Var.d;
            }
        }
        return b1Var;
    }

    public static u2.b1 e(u2.b1 b1Var, long j10, byte[] bArr, int i10) {
        while (j10 >= b1Var.f47709b) {
            b1Var = (u2.b1) b1Var.d;
        }
        int i11 = i10;
        while (i11 > 0) {
            int min = Math.min(i11, (int) (b1Var.f47709b - j10));
            y2.a aVar = (y2.a) b1Var.f47710c;
            System.arraycopy(aVar.f50339a, ((int) (j10 - b1Var.f47708a)) + aVar.f50340b, bArr, i10 - i11, min);
            i11 -= min;
            j10 += min;
            if (j10 == b1Var.f47709b) {
                b1Var = (u2.b1) b1Var.d;
            }
        }
        return b1Var;
    }

    public static u2.b1 f(u2.b1 b1Var, h2.h hVar, j5.c cVar, e2.x xVar) {
        boolean z10;
        if (hVar.getFlag(1073741824)) {
            long j10 = cVar.f14301a;
            int i10 = 1;
            xVar.K(1);
            u2.b1 e = e(b1Var, j10, xVar.f8298a, 1);
            long j11 = j10 + 1;
            byte b10 = xVar.f8298a[0];
            if ((b10 & 128) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i11 = b10 & Byte.MAX_VALUE;
            h2.d dVar = hVar.f11660b;
            byte[] bArr = dVar.f11652a;
            if (bArr == null) {
                dVar.f11652a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            b1Var = e(e, j11, dVar.f11652a, i11);
            long j12 = j11 + i11;
            if (z10) {
                xVar.K(2);
                b1Var = e(b1Var, j12, xVar.f8298a, 2);
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
                b1Var = e(b1Var, j12, xVar.f8298a, i12);
                j12 += i12;
                xVar.N(0);
                for (int i13 = 0; i13 < i10; i13++) {
                    iArr[i13] = xVar.H();
                    iArr2[i13] = xVar.E();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = cVar.f14302b - ((int) (j12 - cVar.f14301a));
            }
            c3.k0 k0Var = (c3.k0) cVar.f14303c;
            String str = e2.m0.f8259a;
            byte[] bArr2 = k0Var.f4643b;
            byte[] bArr3 = dVar.f11652a;
            int i14 = k0Var.f4642a;
            int i15 = k0Var.f4644c;
            int i16 = k0Var.d;
            dVar.f11655f = i10;
            dVar.d = iArr;
            dVar.e = iArr2;
            dVar.f11653b = bArr2;
            dVar.f11652a = bArr3;
            dVar.f11654c = i14;
            dVar.f11656g = i15;
            dVar.h = i16;
            MediaCodec.CryptoInfo cryptoInfo = dVar.f11657i;
            cryptoInfo.numSubSamples = i10;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i14;
            if (Build.VERSION.SDK_INT >= 24) {
                h2.c cVar2 = dVar.f11658j;
                cVar2.getClass();
                h2.c.a(cVar2, i15, i16);
            }
            long j13 = cVar.f14301a;
            int i17 = (int) (j12 - j13);
            cVar.f14301a = j13 + i17;
            cVar.f14302b -= i17;
        }
        if (hVar.hasSupplementalData()) {
            xVar.K(4);
            u2.b1 e7 = e(b1Var, cVar.f14301a, xVar.f8298a, 4);
            int E = xVar.E();
            cVar.f14301a += 4;
            cVar.f14302b -= 4;
            hVar.b(E);
            u2.b1 d = d(e7, cVar.f14301a, hVar.f11661c, E);
            cVar.f14301a += E;
            int i18 = cVar.f14302b - E;
            cVar.f14302b = i18;
            ByteBuffer byteBuffer = hVar.f11662f;
            if (byteBuffer != null && byteBuffer.capacity() >= i18) {
                hVar.f11662f.clear();
            } else {
                hVar.f11662f = ByteBuffer.allocate(i18);
            }
            return d(d, cVar.f14301a, hVar.f11662f, cVar.f14302b);
        }
        hVar.b(cVar.f14302b);
        return d(b1Var, cVar.f14301a, hVar.f11661c, cVar.f14302b);
    }

    public void a(u2.b1 b1Var) {
        if (((y2.a) b1Var.f47710c) == null) {
            return;
        }
        androidx.biometric.e eVar = (androidx.biometric.e) this.f27737c;
        synchronized (eVar) {
            ((i2.i) eVar.d).f12463c.b(b1Var);
            u2.b1 b1Var2 = b1Var;
            while (b1Var2 != null) {
                y2.a aVar = (y2.a) b1Var2.f47710c;
                aVar.getClass();
                eVar.t(aVar);
                b1Var2 = (u2.b1) b1Var2.d;
                if (b1Var2 == null || ((y2.a) b1Var2.f47710c) == null) {
                    b1Var2 = null;
                }
            }
        }
        b1Var.f47710c = null;
        b1Var.d = null;
    }

    public void b(long j10) {
        u2.b1 b1Var;
        if (j10 != -1) {
            while (true) {
                b1Var = (u2.b1) this.e;
                if (j10 < b1Var.f47709b) {
                    break;
                }
                androidx.biometric.e eVar = (androidx.biometric.e) this.f27737c;
                y2.a aVar = (y2.a) b1Var.f47710c;
                synchronized (eVar) {
                    ((i2.i) eVar.d).f12463c.c(aVar);
                    eVar.t(aVar);
                }
                u2.b1 b1Var2 = (u2.b1) this.e;
                b1Var2.f47710c = null;
                b1Var2.d = null;
                this.e = (u2.b1) b1Var2.d;
            }
            if (((u2.b1) this.f27738f).f47708a < b1Var.f47708a) {
                this.f27738f = b1Var;
            }
        }
    }

    public int c(int i10) {
        y2.a a2;
        u2.b1 b1Var = (u2.b1) this.f27739g;
        if (((y2.a) b1Var.f47710c) == null) {
            androidx.biometric.e eVar = (androidx.biometric.e) this.f27737c;
            synchronized (eVar) {
                a2 = ((i2.i) eVar.d).f12463c.a();
                ((HashMap) eVar.f2822b).put(a2, (j2.j) eVar.f2823c);
                i2.h hVar = (i2.h) ((i2.i) eVar.d).f12473p.get((j2.j) eVar.f2823c);
                if (hVar != null) {
                    hVar.a();
                }
            }
            u2.b1 b1Var2 = new u2.b1(((u2.b1) this.f27739g).f47709b, this.f27735a);
            b1Var.f47710c = a2;
            b1Var.d = b1Var2;
        }
        return Math.min(i10, (int) (((u2.b1) this.f27739g).f47709b - this.f27736b));
    }

    public jp0(yb0 yb0Var) {
        this.d = new ArrayList(50);
        this.e = new ArrayList(50);
        Paint paint = new Paint(1);
        this.f27738f = paint;
        this.f27735a = 250;
        this.f27737c = yb0Var;
        paint.setStrokeWidth(AndroidUtilities.dp(1.33f));
    }
}
