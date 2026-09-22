package org.telegram.ui.Components;

import android.graphics.Paint;
import android.media.MediaCodec;
import android.os.Build;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
public final class wo0 {
    public final int f30086a;
    public long f30087b;
    public final Object f30088c;
    public final Object d;
    public Object e;
    public Object f30089f;
    public Object f30090g;

    public wo0(y2.d dVar) {
        this.f30088c = dVar;
        int i10 = dVar.f46585b;
        this.f30086a = i10;
        this.d = new e2.v(32);
        u2.y0 y0Var = new u2.y0(0L, i10);
        this.e = y0Var;
        this.f30089f = y0Var;
        this.f30090g = y0Var;
    }

    public static u2.y0 d(u2.y0 y0Var, long j3, ByteBuffer byteBuffer, int i10) {
        while (j3 >= y0Var.f43857b) {
            y0Var = (u2.y0) y0Var.d;
        }
        while (i10 > 0) {
            int min = Math.min(i10, (int) (y0Var.f43857b - j3));
            y2.a aVar = (y2.a) y0Var.f43858c;
            byteBuffer.put(aVar.f46579a, ((int) (j3 - y0Var.f43856a)) + aVar.f46580b, min);
            i10 -= min;
            j3 += min;
            if (j3 == y0Var.f43857b) {
                y0Var = (u2.y0) y0Var.d;
            }
        }
        return y0Var;
    }

    public static u2.y0 e(u2.y0 y0Var, long j3, byte[] bArr, int i10) {
        while (j3 >= y0Var.f43857b) {
            y0Var = (u2.y0) y0Var.d;
        }
        int i11 = i10;
        while (i11 > 0) {
            int min = Math.min(i11, (int) (y0Var.f43857b - j3));
            y2.a aVar = (y2.a) y0Var.f43858c;
            System.arraycopy(aVar.f46579a, ((int) (j3 - y0Var.f43856a)) + aVar.f46580b, bArr, i10 - i11, min);
            i11 -= min;
            j3 += min;
            if (j3 == y0Var.f43857b) {
                y0Var = (u2.y0) y0Var.d;
            }
        }
        return y0Var;
    }

    public static u2.y0 f(u2.y0 y0Var, h2.h hVar, ii.b0 b0Var, e2.v vVar) {
        boolean z10;
        if (hVar.getFlag(1073741824)) {
            long j3 = b0Var.f11250b;
            int i10 = 1;
            vVar.G(1);
            u2.y0 e = e(y0Var, j3, vVar.f7933a, 1);
            long j10 = j3 + 1;
            byte b10 = vVar.f7933a[0];
            if ((b10 & 128) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i11 = b10 & Byte.MAX_VALUE;
            h2.d dVar = hVar.f10096b;
            byte[] bArr = dVar.f10088a;
            if (bArr == null) {
                dVar.f10088a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            y0Var = e(e, j10, dVar.f10088a, i11);
            long j11 = j10 + i11;
            if (z10) {
                vVar.G(2);
                y0Var = e(y0Var, j11, vVar.f7933a, 2);
                j11 += 2;
                i10 = vVar.D();
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
                vVar.G(i12);
                y0Var = e(y0Var, j11, vVar.f7933a, i12);
                j11 += i12;
                vVar.J(0);
                for (int i13 = 0; i13 < i10; i13++) {
                    iArr[i13] = vVar.D();
                    iArr2[i13] = vVar.B();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = b0Var.f11249a - ((int) (j11 - b0Var.f11250b));
            }
            c3.g0 g0Var = (c3.g0) b0Var.f11251c;
            String str = e2.d0.f7887a;
            byte[] bArr2 = g0Var.f3765b;
            byte[] bArr3 = dVar.f10088a;
            int i14 = g0Var.f3764a;
            int i15 = g0Var.f3766c;
            int i16 = g0Var.d;
            dVar.f10091f = i10;
            dVar.d = iArr;
            dVar.e = iArr2;
            dVar.f10089b = bArr2;
            dVar.f10088a = bArr3;
            dVar.f10090c = i14;
            dVar.f10092g = i15;
            dVar.h = i16;
            MediaCodec.CryptoInfo cryptoInfo = dVar.f10093i;
            cryptoInfo.numSubSamples = i10;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i14;
            if (Build.VERSION.SDK_INT >= 24) {
                h2.c cVar = dVar.f10094j;
                cVar.getClass();
                h2.c.a(cVar, i15, i16);
            }
            long j12 = b0Var.f11250b;
            int i17 = (int) (j11 - j12);
            b0Var.f11250b = j12 + i17;
            b0Var.f11249a -= i17;
        }
        if (hVar.hasSupplementalData()) {
            vVar.G(4);
            u2.y0 e7 = e(y0Var, b0Var.f11250b, vVar.f7933a, 4);
            int B = vVar.B();
            b0Var.f11250b += 4;
            b0Var.f11249a -= 4;
            hVar.c(B);
            u2.y0 d = d(e7, b0Var.f11250b, hVar.f10097c, B);
            b0Var.f11250b += B;
            int i18 = b0Var.f11249a - B;
            b0Var.f11249a = i18;
            ByteBuffer byteBuffer = hVar.f10098f;
            if (byteBuffer != null && byteBuffer.capacity() >= i18) {
                hVar.f10098f.clear();
            } else {
                hVar.f10098f = ByteBuffer.allocate(i18);
            }
            return d(d, b0Var.f11250b, hVar.f10098f, b0Var.f11249a);
        }
        hVar.c(b0Var.f11249a);
        return d(y0Var, b0Var.f11250b, hVar.f10097c, b0Var.f11249a);
    }

    public void a(u2.y0 y0Var) {
        if (((y2.a) y0Var.f43858c) == null) {
            return;
        }
        y2.d dVar = (y2.d) this.f30088c;
        synchronized (dVar) {
            u2.y0 y0Var2 = y0Var;
            while (y0Var2 != null) {
                try {
                    y2.a[] aVarArr = dVar.f46587f;
                    int i10 = dVar.e;
                    dVar.e = i10 + 1;
                    y2.a aVar = (y2.a) y0Var2.f43858c;
                    aVar.getClass();
                    aVarArr[i10] = aVar;
                    dVar.d--;
                    y0Var2 = (u2.y0) y0Var2.d;
                    if (y0Var2 == null || ((y2.a) y0Var2.f43858c) == null) {
                        y0Var2 = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            dVar.notifyAll();
        }
        y0Var.f43858c = null;
        y0Var.d = null;
    }

    public void b(long j3) {
        u2.y0 y0Var;
        if (j3 != -1) {
            while (true) {
                y0Var = (u2.y0) this.e;
                if (j3 < y0Var.f43857b) {
                    break;
                }
                y2.d dVar = (y2.d) this.f30088c;
                y2.a aVar = (y2.a) y0Var.f43858c;
                synchronized (dVar) {
                    y2.a[] aVarArr = dVar.f46587f;
                    int i10 = dVar.e;
                    dVar.e = i10 + 1;
                    aVarArr[i10] = aVar;
                    dVar.d--;
                    dVar.notifyAll();
                }
                u2.y0 y0Var2 = (u2.y0) this.e;
                y0Var2.f43858c = null;
                y0Var2.d = null;
                this.e = (u2.y0) y0Var2.d;
            }
            if (((u2.y0) this.f30089f).f43856a < y0Var.f43856a) {
                this.f30089f = y0Var;
            }
        }
    }

    public int c(int i10) {
        y2.a aVar;
        u2.y0 y0Var = (u2.y0) this.f30090g;
        if (((y2.a) y0Var.f43858c) == null) {
            y2.d dVar = (y2.d) this.f30088c;
            synchronized (dVar) {
                try {
                    int i11 = dVar.d + 1;
                    dVar.d = i11;
                    int i12 = dVar.e;
                    if (i12 > 0) {
                        y2.a[] aVarArr = dVar.f46587f;
                        int i13 = i12 - 1;
                        dVar.e = i13;
                        aVar = aVarArr[i13];
                        aVar.getClass();
                        dVar.f46587f[dVar.e] = null;
                    } else {
                        y2.a aVar2 = new y2.a(new byte[dVar.f46585b], 0);
                        y2.a[] aVarArr2 = dVar.f46587f;
                        if (i11 > aVarArr2.length) {
                            dVar.f46587f = (y2.a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
                        }
                        aVar = aVar2;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            u2.y0 y0Var2 = new u2.y0(((u2.y0) this.f30090g).f43857b, this.f30086a);
            y0Var.f43858c = aVar;
            y0Var.d = y0Var2;
        }
        return Math.min(i10, (int) (((u2.y0) this.f30090g).f43857b - this.f30087b));
    }

    public wo0(jc0 jc0Var) {
        this.d = new ArrayList(50);
        this.e = new ArrayList(50);
        Paint paint = new Paint(1);
        this.f30089f = paint;
        this.f30086a = 250;
        this.f30088c = jc0Var;
        paint.setStrokeWidth(AndroidUtilities.dp(1.33f));
    }
}
