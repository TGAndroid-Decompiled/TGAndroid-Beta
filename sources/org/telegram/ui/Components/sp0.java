package org.telegram.ui.Components;

import android.graphics.Paint;
import android.media.MediaCodec;
import android.os.Build;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
public final class sp0 {
    public final int f30607a;
    public long f30608b;
    public final Object f30609c;
    public final Object d;
    public Object f30610e;
    public Object f30611f;
    public Object f30612g;

    public sp0(y2.d dVar) {
        this.f30609c = dVar;
        int i10 = dVar.f51886b;
        this.f30607a = i10;
        this.d = new e2.v(32);
        u2.w0 w0Var = new u2.w0(0L, i10);
        this.f30610e = w0Var;
        this.f30611f = w0Var;
        this.f30612g = w0Var;
    }

    public static u2.w0 d(u2.w0 w0Var, long j3, ByteBuffer byteBuffer, int i10) {
        while (j3 >= w0Var.f48959b) {
            w0Var = (u2.w0) w0Var.d;
        }
        while (i10 > 0) {
            int min = Math.min(i10, (int) (w0Var.f48959b - j3));
            y2.a aVar = (y2.a) w0Var.f48960c;
            byteBuffer.put(aVar.f51880a, ((int) (j3 - w0Var.f48958a)) + aVar.f51881b, min);
            i10 -= min;
            j3 += min;
            if (j3 == w0Var.f48959b) {
                w0Var = (u2.w0) w0Var.d;
            }
        }
        return w0Var;
    }

    public static u2.w0 e(u2.w0 w0Var, long j3, byte[] bArr, int i10) {
        while (j3 >= w0Var.f48959b) {
            w0Var = (u2.w0) w0Var.d;
        }
        int i11 = i10;
        while (i11 > 0) {
            int min = Math.min(i11, (int) (w0Var.f48959b - j3));
            y2.a aVar = (y2.a) w0Var.f48960c;
            System.arraycopy(aVar.f51880a, ((int) (j3 - w0Var.f48958a)) + aVar.f51881b, bArr, i10 - i11, min);
            i11 -= min;
            j3 += min;
            if (j3 == w0Var.f48959b) {
                w0Var = (u2.w0) w0Var.d;
            }
        }
        return w0Var;
    }

    public static u2.w0 f(u2.w0 w0Var, h2.h hVar, ii.b0 b0Var, e2.v vVar) {
        boolean z10;
        if (hVar.getFlag(1073741824)) {
            long j3 = b0Var.f12279b;
            int i10 = 1;
            vVar.G(1);
            u2.w0 e7 = e(w0Var, j3, vVar.f8581a, 1);
            long j10 = j3 + 1;
            byte b10 = vVar.f8581a[0];
            if ((b10 & 128) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i11 = b10 & Byte.MAX_VALUE;
            h2.d dVar = hVar.f10982b;
            byte[] bArr = dVar.f10973a;
            if (bArr == null) {
                dVar.f10973a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            w0Var = e(e7, j10, dVar.f10973a, i11);
            long j11 = j10 + i11;
            if (z10) {
                vVar.G(2);
                w0Var = e(w0Var, j11, vVar.f8581a, 2);
                j11 += 2;
                i10 = vVar.D();
            }
            int[] iArr = dVar.d;
            if (iArr == null || iArr.length < i10) {
                iArr = new int[i10];
            }
            int[] iArr2 = dVar.f10976e;
            if (iArr2 == null || iArr2.length < i10) {
                iArr2 = new int[i10];
            }
            if (z10) {
                int i12 = i10 * 6;
                vVar.G(i12);
                w0Var = e(w0Var, j11, vVar.f8581a, i12);
                j11 += i12;
                vVar.J(0);
                for (int i13 = 0; i13 < i10; i13++) {
                    iArr[i13] = vVar.D();
                    iArr2[i13] = vVar.B();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = b0Var.f12278a - ((int) (j11 - b0Var.f12279b));
            }
            c3.g0 g0Var = (c3.g0) b0Var.f12280c;
            String str = e2.d0.f8529a;
            byte[] bArr2 = g0Var.f4113b;
            byte[] bArr3 = dVar.f10973a;
            int i14 = g0Var.f4112a;
            int i15 = g0Var.f4114c;
            int i16 = g0Var.d;
            dVar.f10977f = i10;
            dVar.d = iArr;
            dVar.f10976e = iArr2;
            dVar.f10974b = bArr2;
            dVar.f10973a = bArr3;
            dVar.f10975c = i14;
            dVar.f10978g = i15;
            dVar.h = i16;
            MediaCodec.CryptoInfo cryptoInfo = dVar.f10979i;
            cryptoInfo.numSubSamples = i10;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i14;
            if (Build.VERSION.SDK_INT >= 24) {
                h2.c cVar = dVar.f10980j;
                cVar.getClass();
                h2.c.a(cVar, i15, i16);
            }
            long j12 = b0Var.f12279b;
            int i17 = (int) (j11 - j12);
            b0Var.f12279b = j12 + i17;
            b0Var.f12278a -= i17;
        }
        if (hVar.hasSupplementalData()) {
            vVar.G(4);
            u2.w0 e10 = e(w0Var, b0Var.f12279b, vVar.f8581a, 4);
            int B = vVar.B();
            b0Var.f12279b += 4;
            b0Var.f12278a -= 4;
            hVar.b(B);
            u2.w0 d = d(e10, b0Var.f12279b, hVar.f10983c, B);
            b0Var.f12279b += B;
            int i18 = b0Var.f12278a - B;
            b0Var.f12278a = i18;
            ByteBuffer byteBuffer = hVar.f10985f;
            if (byteBuffer != null && byteBuffer.capacity() >= i18) {
                hVar.f10985f.clear();
            } else {
                hVar.f10985f = ByteBuffer.allocate(i18);
            }
            return d(d, b0Var.f12279b, hVar.f10985f, b0Var.f12278a);
        }
        hVar.b(b0Var.f12278a);
        return d(w0Var, b0Var.f12279b, hVar.f10983c, b0Var.f12278a);
    }

    public void a(u2.w0 w0Var) {
        if (((y2.a) w0Var.f48960c) == null) {
            return;
        }
        y2.d dVar = (y2.d) this.f30609c;
        synchronized (dVar) {
            u2.w0 w0Var2 = w0Var;
            while (w0Var2 != null) {
                try {
                    y2.a[] aVarArr = dVar.f51889f;
                    int i10 = dVar.f51888e;
                    dVar.f51888e = i10 + 1;
                    y2.a aVar = (y2.a) w0Var2.f48960c;
                    aVar.getClass();
                    aVarArr[i10] = aVar;
                    dVar.d--;
                    w0Var2 = (u2.w0) w0Var2.d;
                    if (w0Var2 == null || ((y2.a) w0Var2.f48960c) == null) {
                        w0Var2 = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            dVar.notifyAll();
        }
        w0Var.f48960c = null;
        w0Var.d = null;
    }

    public void b(long j3) {
        u2.w0 w0Var;
        if (j3 != -1) {
            while (true) {
                w0Var = (u2.w0) this.f30610e;
                if (j3 < w0Var.f48959b) {
                    break;
                }
                y2.d dVar = (y2.d) this.f30609c;
                y2.a aVar = (y2.a) w0Var.f48960c;
                synchronized (dVar) {
                    y2.a[] aVarArr = dVar.f51889f;
                    int i10 = dVar.f51888e;
                    dVar.f51888e = i10 + 1;
                    aVarArr[i10] = aVar;
                    dVar.d--;
                    dVar.notifyAll();
                }
                u2.w0 w0Var2 = (u2.w0) this.f30610e;
                w0Var2.f48960c = null;
                w0Var2.d = null;
                this.f30610e = (u2.w0) w0Var2.d;
            }
            if (((u2.w0) this.f30611f).f48958a < w0Var.f48958a) {
                this.f30611f = w0Var;
            }
        }
    }

    public int c(int i10) {
        y2.a aVar;
        u2.w0 w0Var = (u2.w0) this.f30612g;
        if (((y2.a) w0Var.f48960c) == null) {
            y2.d dVar = (y2.d) this.f30609c;
            synchronized (dVar) {
                try {
                    int i11 = dVar.d + 1;
                    dVar.d = i11;
                    int i12 = dVar.f51888e;
                    if (i12 > 0) {
                        y2.a[] aVarArr = dVar.f51889f;
                        int i13 = i12 - 1;
                        dVar.f51888e = i13;
                        aVar = aVarArr[i13];
                        aVar.getClass();
                        dVar.f51889f[dVar.f51888e] = null;
                    } else {
                        y2.a aVar2 = new y2.a(new byte[dVar.f51886b], 0);
                        y2.a[] aVarArr2 = dVar.f51889f;
                        if (i11 > aVarArr2.length) {
                            dVar.f51889f = (y2.a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
                        }
                        aVar = aVar2;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            u2.w0 w0Var2 = new u2.w0(((u2.w0) this.f30612g).f48959b, this.f30607a);
            w0Var.f48960c = aVar;
            w0Var.d = w0Var2;
        }
        return Math.min(i10, (int) (((u2.w0) this.f30612g).f48959b - this.f30608b));
    }

    public sp0(cd0 cd0Var) {
        this.d = new ArrayList(50);
        this.f30610e = new ArrayList(50);
        Paint paint = new Paint(1);
        this.f30611f = paint;
        this.f30607a = 250;
        this.f30609c = cd0Var;
        paint.setStrokeWidth(AndroidUtilities.dp(1.33f));
    }
}
