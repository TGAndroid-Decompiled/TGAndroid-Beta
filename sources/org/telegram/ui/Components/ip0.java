package org.telegram.ui.Components;

import android.graphics.Paint;
import android.media.MediaCodec;
import android.os.Build;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
public final class ip0 {
    public final int f26046a;
    public long f26047b;
    public final Object f26048c;
    public final Object d;
    public Object e;
    public Object f26049f;
    public Object f26050g;

    public ip0(androidx.biometric.e eVar) {
        int i10;
        this.f26048c = eVar;
        synchronized (eVar) {
            i10 = ((i2.i) eVar.d).f11027c.f48513b;
        }
        this.f26046a = i10;
        this.d = new e2.x(32);
        u2.z0 z0Var = new u2.z0(0L, i10);
        this.e = z0Var;
        this.f26049f = z0Var;
        this.f26050g = z0Var;
    }

    public static u2.z0 d(u2.z0 z0Var, long j10, ByteBuffer byteBuffer, int i10) {
        while (j10 >= z0Var.f46111b) {
            z0Var = (u2.z0) z0Var.d;
        }
        while (i10 > 0) {
            int min = Math.min(i10, (int) (z0Var.f46111b - j10));
            y2.a aVar = (y2.a) z0Var.f46112c;
            byteBuffer.put(aVar.f48507a, ((int) (j10 - z0Var.f46110a)) + aVar.f48508b, min);
            i10 -= min;
            j10 += min;
            if (j10 == z0Var.f46111b) {
                z0Var = (u2.z0) z0Var.d;
            }
        }
        return z0Var;
    }

    public static u2.z0 e(u2.z0 z0Var, long j10, byte[] bArr, int i10) {
        while (j10 >= z0Var.f46111b) {
            z0Var = (u2.z0) z0Var.d;
        }
        int i11 = i10;
        while (i11 > 0) {
            int min = Math.min(i11, (int) (z0Var.f46111b - j10));
            y2.a aVar = (y2.a) z0Var.f46112c;
            System.arraycopy(aVar.f48507a, ((int) (j10 - z0Var.f46110a)) + aVar.f48508b, bArr, i10 - i11, min);
            i11 -= min;
            j10 += min;
            if (j10 == z0Var.f46111b) {
                z0Var = (u2.z0) z0Var.d;
            }
        }
        return z0Var;
    }

    public static u2.z0 f(u2.z0 z0Var, h2.h hVar, j5.b bVar, e2.x xVar) {
        boolean z10;
        if (hVar.getFlag(1073741824)) {
            long j10 = bVar.f12840a;
            int i10 = 1;
            xVar.K(1);
            u2.z0 e = e(z0Var, j10, xVar.f8411a, 1);
            long j11 = j10 + 1;
            byte b10 = xVar.f8411a[0];
            if ((b10 & 128) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i11 = b10 & Byte.MAX_VALUE;
            h2.d dVar = hVar.f10325b;
            byte[] bArr = dVar.f10317a;
            if (bArr == null) {
                dVar.f10317a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            z0Var = e(e, j11, dVar.f10317a, i11);
            long j12 = j11 + i11;
            if (z10) {
                xVar.K(2);
                z0Var = e(z0Var, j12, xVar.f8411a, 2);
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
                z0Var = e(z0Var, j12, xVar.f8411a, i12);
                j12 += i12;
                xVar.N(0);
                for (int i13 = 0; i13 < i10; i13++) {
                    iArr[i13] = xVar.H();
                    iArr2[i13] = xVar.E();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = bVar.f12841b - ((int) (j12 - bVar.f12840a));
            }
            c3.h0 h0Var = (c3.h0) bVar.f12842c;
            String str = e2.m0.f8372a;
            byte[] bArr2 = h0Var.f4250b;
            byte[] bArr3 = dVar.f10317a;
            int i14 = h0Var.f4249a;
            int i15 = h0Var.f4251c;
            int i16 = h0Var.d;
            dVar.f10320f = i10;
            dVar.d = iArr;
            dVar.e = iArr2;
            dVar.f10318b = bArr2;
            dVar.f10317a = bArr3;
            dVar.f10319c = i14;
            dVar.f10321g = i15;
            dVar.h = i16;
            MediaCodec.CryptoInfo cryptoInfo = dVar.f10322i;
            cryptoInfo.numSubSamples = i10;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i14;
            if (Build.VERSION.SDK_INT >= 24) {
                h2.c cVar = dVar.f10323j;
                cVar.getClass();
                h2.c.a(cVar, i15, i16);
            }
            long j13 = bVar.f12840a;
            int i17 = (int) (j12 - j13);
            bVar.f12840a = j13 + i17;
            bVar.f12841b -= i17;
        }
        if (hVar.hasSupplementalData()) {
            xVar.K(4);
            u2.z0 e7 = e(z0Var, bVar.f12840a, xVar.f8411a, 4);
            int E = xVar.E();
            bVar.f12840a += 4;
            bVar.f12841b -= 4;
            hVar.b(E);
            u2.z0 d = d(e7, bVar.f12840a, hVar.f10326c, E);
            bVar.f12840a += E;
            int i18 = bVar.f12841b - E;
            bVar.f12841b = i18;
            ByteBuffer byteBuffer = hVar.f10327f;
            if (byteBuffer != null && byteBuffer.capacity() >= i18) {
                hVar.f10327f.clear();
            } else {
                hVar.f10327f = ByteBuffer.allocate(i18);
            }
            return d(d, bVar.f12840a, hVar.f10327f, bVar.f12841b);
        }
        hVar.b(bVar.f12841b);
        return d(z0Var, bVar.f12840a, hVar.f10326c, bVar.f12841b);
    }

    public void a(u2.z0 z0Var) {
        if (((y2.a) z0Var.f46112c) == null) {
            return;
        }
        androidx.biometric.e eVar = (androidx.biometric.e) this.f26048c;
        synchronized (eVar) {
            ((i2.i) eVar.d).f11027c.b(z0Var);
            u2.z0 z0Var2 = z0Var;
            while (z0Var2 != null) {
                y2.a aVar = (y2.a) z0Var2.f46112c;
                aVar.getClass();
                eVar.u(aVar);
                z0Var2 = (u2.z0) z0Var2.d;
                if (z0Var2 == null || ((y2.a) z0Var2.f46112c) == null) {
                    z0Var2 = null;
                }
            }
        }
        z0Var.f46112c = null;
        z0Var.d = null;
    }

    public void b(long j10) {
        u2.z0 z0Var;
        if (j10 != -1) {
            while (true) {
                z0Var = (u2.z0) this.e;
                if (j10 < z0Var.f46111b) {
                    break;
                }
                androidx.biometric.e eVar = (androidx.biometric.e) this.f26048c;
                y2.a aVar = (y2.a) z0Var.f46112c;
                synchronized (eVar) {
                    ((i2.i) eVar.d).f11027c.c(aVar);
                    eVar.u(aVar);
                }
                u2.z0 z0Var2 = (u2.z0) this.e;
                z0Var2.f46112c = null;
                z0Var2.d = null;
                this.e = (u2.z0) z0Var2.d;
            }
            if (((u2.z0) this.f26049f).f46110a < z0Var.f46110a) {
                this.f26049f = z0Var;
            }
        }
    }

    public int c(int i10) {
        y2.a a2;
        u2.z0 z0Var = (u2.z0) this.f26050g;
        if (((y2.a) z0Var.f46112c) == null) {
            androidx.biometric.e eVar = (androidx.biometric.e) this.f26048c;
            synchronized (eVar) {
                a2 = ((i2.i) eVar.d).f11027c.a();
                ((HashMap) eVar.f1196b).put(a2, (j2.k) eVar.f1197c);
                i2.h hVar = (i2.h) ((i2.i) eVar.d).f11037p.get((j2.k) eVar.f1197c);
                if (hVar != null) {
                    hVar.a();
                }
            }
            u2.z0 z0Var2 = new u2.z0(((u2.z0) this.f26050g).f46111b, this.f26046a);
            z0Var.f46112c = a2;
            z0Var.d = z0Var2;
        }
        return Math.min(i10, (int) (((u2.z0) this.f26050g).f46111b - this.f26047b));
    }

    public ip0(yc0 yc0Var) {
        this.d = new ArrayList(50);
        this.e = new ArrayList(50);
        Paint paint = new Paint(1);
        this.f26049f = paint;
        this.f26046a = 250;
        this.f26048c = yc0Var;
        paint.setStrokeWidth(AndroidUtilities.dp(1.33f));
    }
}
