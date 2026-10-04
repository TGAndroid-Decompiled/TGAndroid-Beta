package org.telegram.ui.Components;

import android.graphics.Paint;
import android.media.MediaCodec;
import android.os.Build;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
public final class ap0 {
    public final int f24623a;
    public long f24624b;
    public final Object f24625c;
    public final Object d;
    public Object f24626e;
    public Object f24627f;
    public Object f24628g;

    public ap0(y2.d dVar) {
        this.f24625c = dVar;
        int i10 = dVar.f50365b;
        this.f24623a = i10;
        this.d = new e2.v(32);
        u2.y0 y0Var = new u2.y0(0L, i10);
        this.f24626e = y0Var;
        this.f24627f = y0Var;
        this.f24628g = y0Var;
    }

    public static u2.y0 d(u2.y0 y0Var, long j3, ByteBuffer byteBuffer, int i10) {
        while (j3 >= y0Var.f47447b) {
            y0Var = (u2.y0) y0Var.d;
        }
        while (i10 > 0) {
            int min = Math.min(i10, (int) (y0Var.f47447b - j3));
            y2.a aVar = (y2.a) y0Var.f47448c;
            byteBuffer.put(aVar.f50359a, ((int) (j3 - y0Var.f47446a)) + aVar.f50360b, min);
            i10 -= min;
            j3 += min;
            if (j3 == y0Var.f47447b) {
                y0Var = (u2.y0) y0Var.d;
            }
        }
        return y0Var;
    }

    public static u2.y0 e(u2.y0 y0Var, long j3, byte[] bArr, int i10) {
        while (j3 >= y0Var.f47447b) {
            y0Var = (u2.y0) y0Var.d;
        }
        int i11 = i10;
        while (i11 > 0) {
            int min = Math.min(i11, (int) (y0Var.f47447b - j3));
            y2.a aVar = (y2.a) y0Var.f47448c;
            System.arraycopy(aVar.f50359a, ((int) (j3 - y0Var.f47446a)) + aVar.f50360b, bArr, i10 - i11, min);
            i11 -= min;
            j3 += min;
            if (j3 == y0Var.f47447b) {
                y0Var = (u2.y0) y0Var.d;
            }
        }
        return y0Var;
    }

    public static u2.y0 f(u2.y0 y0Var, h2.h hVar, ii.b0 b0Var, e2.v vVar) {
        boolean z10;
        if (hVar.getFlag(1073741824)) {
            long j3 = b0Var.f12234b;
            int i10 = 1;
            vVar.G(1);
            u2.y0 e7 = e(y0Var, j3, vVar.f8589a, 1);
            long j10 = j3 + 1;
            byte b10 = vVar.f8589a[0];
            if ((b10 & 128) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i11 = b10 & Byte.MAX_VALUE;
            h2.d dVar = hVar.f10978b;
            byte[] bArr = dVar.f10969a;
            if (bArr == null) {
                dVar.f10969a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            y0Var = e(e7, j10, dVar.f10969a, i11);
            long j11 = j10 + i11;
            if (z10) {
                vVar.G(2);
                y0Var = e(y0Var, j11, vVar.f8589a, 2);
                j11 += 2;
                i10 = vVar.D();
            }
            int[] iArr = dVar.d;
            if (iArr == null || iArr.length < i10) {
                iArr = new int[i10];
            }
            int[] iArr2 = dVar.f10972e;
            if (iArr2 == null || iArr2.length < i10) {
                iArr2 = new int[i10];
            }
            if (z10) {
                int i12 = i10 * 6;
                vVar.G(i12);
                y0Var = e(y0Var, j11, vVar.f8589a, i12);
                j11 += i12;
                vVar.J(0);
                for (int i13 = 0; i13 < i10; i13++) {
                    iArr[i13] = vVar.D();
                    iArr2[i13] = vVar.B();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = b0Var.f12233a - ((int) (j11 - b0Var.f12234b));
            }
            c3.g0 g0Var = (c3.g0) b0Var.f12235c;
            String str = e2.d0.f8537a;
            byte[] bArr2 = g0Var.f4064b;
            byte[] bArr3 = dVar.f10969a;
            int i14 = g0Var.f4063a;
            int i15 = g0Var.f4065c;
            int i16 = g0Var.d;
            dVar.f10973f = i10;
            dVar.d = iArr;
            dVar.f10972e = iArr2;
            dVar.f10970b = bArr2;
            dVar.f10969a = bArr3;
            dVar.f10971c = i14;
            dVar.f10974g = i15;
            dVar.h = i16;
            MediaCodec.CryptoInfo cryptoInfo = dVar.f10975i;
            cryptoInfo.numSubSamples = i10;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i14;
            if (Build.VERSION.SDK_INT >= 24) {
                h2.c cVar = dVar.f10976j;
                cVar.getClass();
                h2.c.a(cVar, i15, i16);
            }
            long j12 = b0Var.f12234b;
            int i17 = (int) (j11 - j12);
            b0Var.f12234b = j12 + i17;
            b0Var.f12233a -= i17;
        }
        if (hVar.hasSupplementalData()) {
            vVar.G(4);
            u2.y0 e10 = e(y0Var, b0Var.f12234b, vVar.f8589a, 4);
            int B = vVar.B();
            b0Var.f12234b += 4;
            b0Var.f12233a -= 4;
            hVar.b(B);
            u2.y0 d = d(e10, b0Var.f12234b, hVar.f10979c, B);
            b0Var.f12234b += B;
            int i18 = b0Var.f12233a - B;
            b0Var.f12233a = i18;
            ByteBuffer byteBuffer = hVar.f10981f;
            if (byteBuffer != null && byteBuffer.capacity() >= i18) {
                hVar.f10981f.clear();
            } else {
                hVar.f10981f = ByteBuffer.allocate(i18);
            }
            return d(d, b0Var.f12234b, hVar.f10981f, b0Var.f12233a);
        }
        hVar.b(b0Var.f12233a);
        return d(y0Var, b0Var.f12234b, hVar.f10979c, b0Var.f12233a);
    }

    public void a(u2.y0 y0Var) {
        if (((y2.a) y0Var.f47448c) == null) {
            return;
        }
        y2.d dVar = (y2.d) this.f24625c;
        synchronized (dVar) {
            u2.y0 y0Var2 = y0Var;
            while (y0Var2 != null) {
                try {
                    y2.a[] aVarArr = dVar.f50368f;
                    int i10 = dVar.f50367e;
                    dVar.f50367e = i10 + 1;
                    y2.a aVar = (y2.a) y0Var2.f47448c;
                    aVar.getClass();
                    aVarArr[i10] = aVar;
                    dVar.d--;
                    y0Var2 = (u2.y0) y0Var2.d;
                    if (y0Var2 == null || ((y2.a) y0Var2.f47448c) == null) {
                        y0Var2 = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            dVar.notifyAll();
        }
        y0Var.f47448c = null;
        y0Var.d = null;
    }

    public void b(long j3) {
        u2.y0 y0Var;
        if (j3 != -1) {
            while (true) {
                y0Var = (u2.y0) this.f24626e;
                if (j3 < y0Var.f47447b) {
                    break;
                }
                y2.d dVar = (y2.d) this.f24625c;
                y2.a aVar = (y2.a) y0Var.f47448c;
                synchronized (dVar) {
                    y2.a[] aVarArr = dVar.f50368f;
                    int i10 = dVar.f50367e;
                    dVar.f50367e = i10 + 1;
                    aVarArr[i10] = aVar;
                    dVar.d--;
                    dVar.notifyAll();
                }
                u2.y0 y0Var2 = (u2.y0) this.f24626e;
                y0Var2.f47448c = null;
                y0Var2.d = null;
                this.f24626e = (u2.y0) y0Var2.d;
            }
            if (((u2.y0) this.f24627f).f47446a < y0Var.f47446a) {
                this.f24627f = y0Var;
            }
        }
    }

    public int c(int i10) {
        y2.a aVar;
        u2.y0 y0Var = (u2.y0) this.f24628g;
        if (((y2.a) y0Var.f47448c) == null) {
            y2.d dVar = (y2.d) this.f24625c;
            synchronized (dVar) {
                try {
                    int i11 = dVar.d + 1;
                    dVar.d = i11;
                    int i12 = dVar.f50367e;
                    if (i12 > 0) {
                        y2.a[] aVarArr = dVar.f50368f;
                        int i13 = i12 - 1;
                        dVar.f50367e = i13;
                        aVar = aVarArr[i13];
                        aVar.getClass();
                        dVar.f50368f[dVar.f50367e] = null;
                    } else {
                        y2.a aVar2 = new y2.a(new byte[dVar.f50365b], 0);
                        y2.a[] aVarArr2 = dVar.f50368f;
                        if (i11 > aVarArr2.length) {
                            dVar.f50368f = (y2.a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
                        }
                        aVar = aVar2;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            u2.y0 y0Var2 = new u2.y0(((u2.y0) this.f24628g).f47447b, this.f24623a);
            y0Var.f47448c = aVar;
            y0Var.d = y0Var2;
        }
        return Math.min(i10, (int) (((u2.y0) this.f24628g).f47447b - this.f24624b));
    }

    public ap0(lc0 lc0Var) {
        this.d = new ArrayList(50);
        this.f24626e = new ArrayList(50);
        Paint paint = new Paint(1);
        this.f24627f = paint;
        this.f24623a = 250;
        this.f24625c = lc0Var;
        paint.setStrokeWidth(AndroidUtilities.dp(1.33f));
    }
}
