package org.telegram.ui.Components;

import android.graphics.Paint;
import android.media.MediaCodec;
import android.os.Build;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
public final class io0 {
    public final int f24971a;
    public long f24972b;
    public final Object f24973c;
    public final Object d;
    public Object e;
    public Object f24974f;
    public Object f24975g;

    public io0(y2.d dVar) {
        this.f24973c = dVar;
        int i10 = dVar.f46285b;
        this.f24971a = i10;
        this.d = new e2.v(32);
        u2.x0 x0Var = new u2.x0(0L, i10);
        this.e = x0Var;
        this.f24974f = x0Var;
        this.f24975g = x0Var;
    }

    public static u2.x0 d(u2.x0 x0Var, long j3, ByteBuffer byteBuffer, int i10) {
        while (j3 >= x0Var.f43555b) {
            x0Var = (u2.x0) x0Var.d;
        }
        while (i10 > 0) {
            int min = Math.min(i10, (int) (x0Var.f43555b - j3));
            y2.a aVar = (y2.a) x0Var.f43556c;
            byteBuffer.put(aVar.f46279a, ((int) (j3 - x0Var.f43554a)) + aVar.f46280b, min);
            i10 -= min;
            j3 += min;
            if (j3 == x0Var.f43555b) {
                x0Var = (u2.x0) x0Var.d;
            }
        }
        return x0Var;
    }

    public static u2.x0 e(u2.x0 x0Var, long j3, byte[] bArr, int i10) {
        while (j3 >= x0Var.f43555b) {
            x0Var = (u2.x0) x0Var.d;
        }
        int i11 = i10;
        while (i11 > 0) {
            int min = Math.min(i11, (int) (x0Var.f43555b - j3));
            y2.a aVar = (y2.a) x0Var.f43556c;
            System.arraycopy(aVar.f46279a, ((int) (j3 - x0Var.f43554a)) + aVar.f46280b, bArr, i10 - i11, min);
            i11 -= min;
            j3 += min;
            if (j3 == x0Var.f43555b) {
                x0Var = (u2.x0) x0Var.d;
            }
        }
        return x0Var;
    }

    public static u2.x0 f(u2.x0 x0Var, h2.h hVar, ii.b0 b0Var, e2.v vVar) {
        boolean z10;
        if (hVar.getFlag(1073741824)) {
            long j3 = b0Var.f11249b;
            int i10 = 1;
            vVar.G(1);
            u2.x0 e = e(x0Var, j3, vVar.f7934a, 1);
            long j10 = j3 + 1;
            byte b10 = vVar.f7934a[0];
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
            x0Var = e(e, j10, dVar.f10088a, i11);
            long j11 = j10 + i11;
            if (z10) {
                vVar.G(2);
                x0Var = e(x0Var, j11, vVar.f7934a, 2);
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
                x0Var = e(x0Var, j11, vVar.f7934a, i12);
                j11 += i12;
                vVar.J(0);
                for (int i13 = 0; i13 < i10; i13++) {
                    iArr[i13] = vVar.D();
                    iArr2[i13] = vVar.B();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = b0Var.f11248a - ((int) (j11 - b0Var.f11249b));
            }
            c3.g0 g0Var = (c3.g0) b0Var.f11250c;
            String str = e2.d0.f7888a;
            byte[] bArr2 = g0Var.f3766b;
            byte[] bArr3 = dVar.f10088a;
            int i14 = g0Var.f3765a;
            int i15 = g0Var.f3767c;
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
            long j12 = b0Var.f11249b;
            int i17 = (int) (j11 - j12);
            b0Var.f11249b = j12 + i17;
            b0Var.f11248a -= i17;
        }
        if (hVar.hasSupplementalData()) {
            vVar.G(4);
            u2.x0 e7 = e(x0Var, b0Var.f11249b, vVar.f7934a, 4);
            int B = vVar.B();
            b0Var.f11249b += 4;
            b0Var.f11248a -= 4;
            hVar.b(B);
            u2.x0 d = d(e7, b0Var.f11249b, hVar.f10097c, B);
            b0Var.f11249b += B;
            int i18 = b0Var.f11248a - B;
            b0Var.f11248a = i18;
            ByteBuffer byteBuffer = hVar.f10098f;
            if (byteBuffer != null && byteBuffer.capacity() >= i18) {
                hVar.f10098f.clear();
            } else {
                hVar.f10098f = ByteBuffer.allocate(i18);
            }
            return d(d, b0Var.f11249b, hVar.f10098f, b0Var.f11248a);
        }
        hVar.b(b0Var.f11248a);
        return d(x0Var, b0Var.f11249b, hVar.f10097c, b0Var.f11248a);
    }

    public void a(u2.x0 x0Var) {
        if (((y2.a) x0Var.f43556c) == null) {
            return;
        }
        y2.d dVar = (y2.d) this.f24973c;
        synchronized (dVar) {
            u2.x0 x0Var2 = x0Var;
            while (x0Var2 != null) {
                try {
                    y2.a[] aVarArr = dVar.f46287f;
                    int i10 = dVar.e;
                    dVar.e = i10 + 1;
                    y2.a aVar = (y2.a) x0Var2.f43556c;
                    aVar.getClass();
                    aVarArr[i10] = aVar;
                    dVar.d--;
                    x0Var2 = (u2.x0) x0Var2.d;
                    if (x0Var2 == null || ((y2.a) x0Var2.f43556c) == null) {
                        x0Var2 = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            dVar.notifyAll();
        }
        x0Var.f43556c = null;
        x0Var.d = null;
    }

    public void b(long j3) {
        u2.x0 x0Var;
        if (j3 != -1) {
            while (true) {
                x0Var = (u2.x0) this.e;
                if (j3 < x0Var.f43555b) {
                    break;
                }
                y2.d dVar = (y2.d) this.f24973c;
                y2.a aVar = (y2.a) x0Var.f43556c;
                synchronized (dVar) {
                    y2.a[] aVarArr = dVar.f46287f;
                    int i10 = dVar.e;
                    dVar.e = i10 + 1;
                    aVarArr[i10] = aVar;
                    dVar.d--;
                    dVar.notifyAll();
                }
                u2.x0 x0Var2 = (u2.x0) this.e;
                x0Var2.f43556c = null;
                x0Var2.d = null;
                this.e = (u2.x0) x0Var2.d;
            }
            if (((u2.x0) this.f24974f).f43554a < x0Var.f43554a) {
                this.f24974f = x0Var;
            }
        }
    }

    public int c(int i10) {
        y2.a aVar;
        u2.x0 x0Var = (u2.x0) this.f24975g;
        if (((y2.a) x0Var.f43556c) == null) {
            y2.d dVar = (y2.d) this.f24973c;
            synchronized (dVar) {
                try {
                    int i11 = dVar.d + 1;
                    dVar.d = i11;
                    int i12 = dVar.e;
                    if (i12 > 0) {
                        y2.a[] aVarArr = dVar.f46287f;
                        int i13 = i12 - 1;
                        dVar.e = i13;
                        aVar = aVarArr[i13];
                        aVar.getClass();
                        dVar.f46287f[dVar.e] = null;
                    } else {
                        y2.a aVar2 = new y2.a(new byte[dVar.f46285b], 0);
                        y2.a[] aVarArr2 = dVar.f46287f;
                        if (i11 > aVarArr2.length) {
                            dVar.f46287f = (y2.a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
                        }
                        aVar = aVar2;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            u2.x0 x0Var2 = new u2.x0(((u2.x0) this.f24975g).f43555b, this.f24971a);
            x0Var.f43556c = aVar;
            x0Var.d = x0Var2;
        }
        return Math.min(i10, (int) (((u2.x0) this.f24975g).f43555b - this.f24972b));
    }

    public io0(bc0 bc0Var) {
        this.d = new ArrayList(50);
        this.e = new ArrayList(50);
        Paint paint = new Paint(1);
        this.f24974f = paint;
        this.f24971a = 250;
        this.f24973c = bc0Var;
        paint.setStrokeWidth(AndroidUtilities.dp(1.33f));
    }
}
