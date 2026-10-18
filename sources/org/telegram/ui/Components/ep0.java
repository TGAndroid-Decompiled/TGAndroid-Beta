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
    public final int f25979a;
    public long f25980b;
    public final Object f25981c;
    public final Object d;
    public Object e;
    public Object f25982f;
    public Object f25983g;

    public ep0(androidx.biometric.e eVar) {
        int i10;
        this.f25981c = eVar;
        synchronized (eVar) {
            i10 = ((i2.i) eVar.d).f12433c.f49942b;
        }
        this.f25979a = i10;
        this.d = new e2.x(32);
        u2.y0 y0Var = new u2.y0(0L, i10);
        this.e = y0Var;
        this.f25982f = y0Var;
        this.f25983g = y0Var;
    }

    public static u2.y0 d(u2.y0 y0Var, long j10, ByteBuffer byteBuffer, int i10) {
        while (j10 >= y0Var.f47538b) {
            y0Var = (u2.y0) y0Var.d;
        }
        while (i10 > 0) {
            int min = Math.min(i10, (int) (y0Var.f47538b - j10));
            y2.a aVar = (y2.a) y0Var.f47539c;
            byteBuffer.put(aVar.f49936a, ((int) (j10 - y0Var.f47537a)) + aVar.f49937b, min);
            i10 -= min;
            j10 += min;
            if (j10 == y0Var.f47538b) {
                y0Var = (u2.y0) y0Var.d;
            }
        }
        return y0Var;
    }

    public static u2.y0 e(u2.y0 y0Var, long j10, byte[] bArr, int i10) {
        while (j10 >= y0Var.f47538b) {
            y0Var = (u2.y0) y0Var.d;
        }
        int i11 = i10;
        while (i11 > 0) {
            int min = Math.min(i11, (int) (y0Var.f47538b - j10));
            y2.a aVar = (y2.a) y0Var.f47539c;
            System.arraycopy(aVar.f49936a, ((int) (j10 - y0Var.f47537a)) + aVar.f49937b, bArr, i10 - i11, min);
            i11 -= min;
            j10 += min;
            if (j10 == y0Var.f47538b) {
                y0Var = (u2.y0) y0Var.d;
            }
        }
        return y0Var;
    }

    public static u2.y0 f(u2.y0 y0Var, h2.h hVar, j5.c cVar, e2.x xVar) {
        boolean z10;
        if (hVar.getFlag(1073741824)) {
            long j10 = cVar.f14258a;
            int i10 = 1;
            xVar.K(1);
            u2.y0 e = e(y0Var, j10, xVar.f8294a, 1);
            long j11 = j10 + 1;
            byte b10 = xVar.f8294a[0];
            if ((b10 & 128) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i11 = b10 & Byte.MAX_VALUE;
            h2.d dVar = hVar.f11636b;
            byte[] bArr = dVar.f11628a;
            if (bArr == null) {
                dVar.f11628a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            y0Var = e(e, j11, dVar.f11628a, i11);
            long j12 = j11 + i11;
            if (z10) {
                xVar.K(2);
                y0Var = e(y0Var, j12, xVar.f8294a, 2);
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
                y0Var = e(y0Var, j12, xVar.f8294a, i12);
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
            String str = e2.m0.f8255a;
            byte[] bArr2 = i0Var.f4630b;
            byte[] bArr3 = dVar.f11628a;
            int i14 = i0Var.f4629a;
            int i15 = i0Var.f4631c;
            int i16 = i0Var.d;
            dVar.f11631f = i10;
            dVar.d = iArr;
            dVar.e = iArr2;
            dVar.f11629b = bArr2;
            dVar.f11628a = bArr3;
            dVar.f11630c = i14;
            dVar.f11632g = i15;
            dVar.h = i16;
            MediaCodec.CryptoInfo cryptoInfo = dVar.f11633i;
            cryptoInfo.numSubSamples = i10;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i14;
            if (Build.VERSION.SDK_INT >= 24) {
                h2.c cVar2 = dVar.f11634j;
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
            u2.y0 e7 = e(y0Var, cVar.f14258a, xVar.f8294a, 4);
            int E = xVar.E();
            cVar.f14258a += 4;
            cVar.f14259b -= 4;
            hVar.b(E);
            u2.y0 d = d(e7, cVar.f14258a, hVar.f11637c, E);
            cVar.f14258a += E;
            int i18 = cVar.f14259b - E;
            cVar.f14259b = i18;
            ByteBuffer byteBuffer = hVar.f11638f;
            if (byteBuffer != null && byteBuffer.capacity() >= i18) {
                hVar.f11638f.clear();
            } else {
                hVar.f11638f = ByteBuffer.allocate(i18);
            }
            return d(d, cVar.f14258a, hVar.f11638f, cVar.f14259b);
        }
        hVar.b(cVar.f14259b);
        return d(y0Var, cVar.f14258a, hVar.f11637c, cVar.f14259b);
    }

    public void a(u2.y0 y0Var) {
        if (((y2.a) y0Var.f47539c) == null) {
            return;
        }
        androidx.biometric.e eVar = (androidx.biometric.e) this.f25981c;
        synchronized (eVar) {
            ((i2.i) eVar.d).f12433c.b(y0Var);
            u2.y0 y0Var2 = y0Var;
            while (y0Var2 != null) {
                y2.a aVar = (y2.a) y0Var2.f47539c;
                aVar.getClass();
                eVar.u(aVar);
                y0Var2 = (u2.y0) y0Var2.d;
                if (y0Var2 == null || ((y2.a) y0Var2.f47539c) == null) {
                    y0Var2 = null;
                }
            }
        }
        y0Var.f47539c = null;
        y0Var.d = null;
    }

    public void b(long j10) {
        u2.y0 y0Var;
        if (j10 != -1) {
            while (true) {
                y0Var = (u2.y0) this.e;
                if (j10 < y0Var.f47538b) {
                    break;
                }
                androidx.biometric.e eVar = (androidx.biometric.e) this.f25981c;
                y2.a aVar = (y2.a) y0Var.f47539c;
                synchronized (eVar) {
                    ((i2.i) eVar.d).f12433c.c(aVar);
                    eVar.u(aVar);
                }
                u2.y0 y0Var2 = (u2.y0) this.e;
                y0Var2.f47539c = null;
                y0Var2.d = null;
                this.e = (u2.y0) y0Var2.d;
            }
            if (((u2.y0) this.f25982f).f47537a < y0Var.f47537a) {
                this.f25982f = y0Var;
            }
        }
    }

    public int c(int i10) {
        y2.a a2;
        u2.y0 y0Var = (u2.y0) this.f25983g;
        if (((y2.a) y0Var.f47539c) == null) {
            androidx.biometric.e eVar = (androidx.biometric.e) this.f25981c;
            synchronized (eVar) {
                a2 = ((i2.i) eVar.d).f12433c.a();
                ((HashMap) eVar.f2819b).put(a2, (j2.k) eVar.f2820c);
                i2.h hVar = (i2.h) ((i2.i) eVar.d).f12443p.get((j2.k) eVar.f2820c);
                if (hVar != null) {
                    hVar.a();
                }
            }
            u2.y0 y0Var2 = new u2.y0(((u2.y0) this.f25983g).f47538b, this.f25979a);
            y0Var.f47539c = a2;
            y0Var.d = y0Var2;
        }
        return Math.min(i10, (int) (((u2.y0) this.f25983g).f47538b - this.f25980b));
    }

    public ep0(rc0 rc0Var) {
        this.d = new ArrayList(50);
        this.e = new ArrayList(50);
        Paint paint = new Paint(1);
        this.f25982f = paint;
        this.f25979a = 250;
        this.f25981c = rc0Var;
        paint.setStrokeWidth(AndroidUtilities.dp(1.33f));
    }
}
