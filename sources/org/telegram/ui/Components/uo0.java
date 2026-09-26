package org.telegram.ui.Components;

import android.graphics.Paint;
import android.media.MediaCodec;
import android.os.Build;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
public final class uo0 {
    public final int f28853a;
    public long f28854b;
    public final Object f28855c;
    public final Object d;
    public Object e;
    public Object f28856f;
    public Object f28857g;

    public uo0(y2.d dVar) {
        this.f28855c = dVar;
        int i10 = dVar.f46544b;
        this.f28853a = i10;
        this.d = new e2.v(32);
        u2.x0 x0Var = new u2.x0(0L, i10);
        this.e = x0Var;
        this.f28856f = x0Var;
        this.f28857g = x0Var;
    }

    public static u2.x0 d(u2.x0 x0Var, long j3, ByteBuffer byteBuffer, int i10) {
        while (j3 >= x0Var.f43817b) {
            x0Var = (u2.x0) x0Var.d;
        }
        while (i10 > 0) {
            int min = Math.min(i10, (int) (x0Var.f43817b - j3));
            y2.a aVar = (y2.a) x0Var.f43818c;
            byteBuffer.put(aVar.f46538a, ((int) (j3 - x0Var.f43816a)) + aVar.f46539b, min);
            i10 -= min;
            j3 += min;
            if (j3 == x0Var.f43817b) {
                x0Var = (u2.x0) x0Var.d;
            }
        }
        return x0Var;
    }

    public static u2.x0 e(u2.x0 x0Var, long j3, byte[] bArr, int i10) {
        while (j3 >= x0Var.f43817b) {
            x0Var = (u2.x0) x0Var.d;
        }
        int i11 = i10;
        while (i11 > 0) {
            int min = Math.min(i11, (int) (x0Var.f43817b - j3));
            y2.a aVar = (y2.a) x0Var.f43818c;
            System.arraycopy(aVar.f46538a, ((int) (j3 - x0Var.f43816a)) + aVar.f46539b, bArr, i10 - i11, min);
            i11 -= min;
            j3 += min;
            if (j3 == x0Var.f43817b) {
                x0Var = (u2.x0) x0Var.d;
            }
        }
        return x0Var;
    }

    public static u2.x0 f(u2.x0 x0Var, h2.h hVar, ii.b0 b0Var, e2.v vVar) {
        boolean z10;
        if (hVar.getFlag(1073741824)) {
            long j3 = b0Var.f11235b;
            int i10 = 1;
            vVar.G(1);
            u2.x0 e = e(x0Var, j3, vVar.f7916a, 1);
            long j10 = j3 + 1;
            byte b10 = vVar.f7916a[0];
            if ((b10 & 128) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i11 = b10 & Byte.MAX_VALUE;
            h2.d dVar = hVar.f10077b;
            byte[] bArr = dVar.f10069a;
            if (bArr == null) {
                dVar.f10069a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            x0Var = e(e, j10, dVar.f10069a, i11);
            long j11 = j10 + i11;
            if (z10) {
                vVar.G(2);
                x0Var = e(x0Var, j11, vVar.f7916a, 2);
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
                x0Var = e(x0Var, j11, vVar.f7916a, i12);
                j11 += i12;
                vVar.J(0);
                for (int i13 = 0; i13 < i10; i13++) {
                    iArr[i13] = vVar.D();
                    iArr2[i13] = vVar.B();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = b0Var.f11234a - ((int) (j11 - b0Var.f11235b));
            }
            c3.g0 g0Var = (c3.g0) b0Var.f11236c;
            String str = e2.d0.f7870a;
            byte[] bArr2 = g0Var.f3758b;
            byte[] bArr3 = dVar.f10069a;
            int i14 = g0Var.f3757a;
            int i15 = g0Var.f3759c;
            int i16 = g0Var.d;
            dVar.f10072f = i10;
            dVar.d = iArr;
            dVar.e = iArr2;
            dVar.f10070b = bArr2;
            dVar.f10069a = bArr3;
            dVar.f10071c = i14;
            dVar.f10073g = i15;
            dVar.h = i16;
            MediaCodec.CryptoInfo cryptoInfo = dVar.f10074i;
            cryptoInfo.numSubSamples = i10;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i14;
            if (Build.VERSION.SDK_INT >= 24) {
                h2.c cVar = dVar.f10075j;
                cVar.getClass();
                h2.c.a(cVar, i15, i16);
            }
            long j12 = b0Var.f11235b;
            int i17 = (int) (j11 - j12);
            b0Var.f11235b = j12 + i17;
            b0Var.f11234a -= i17;
        }
        if (hVar.hasSupplementalData()) {
            vVar.G(4);
            u2.x0 e7 = e(x0Var, b0Var.f11235b, vVar.f7916a, 4);
            int B = vVar.B();
            b0Var.f11235b += 4;
            b0Var.f11234a -= 4;
            hVar.b(B);
            u2.x0 d = d(e7, b0Var.f11235b, hVar.f10078c, B);
            b0Var.f11235b += B;
            int i18 = b0Var.f11234a - B;
            b0Var.f11234a = i18;
            ByteBuffer byteBuffer = hVar.f10079f;
            if (byteBuffer != null && byteBuffer.capacity() >= i18) {
                hVar.f10079f.clear();
            } else {
                hVar.f10079f = ByteBuffer.allocate(i18);
            }
            return d(d, b0Var.f11235b, hVar.f10079f, b0Var.f11234a);
        }
        hVar.b(b0Var.f11234a);
        return d(x0Var, b0Var.f11235b, hVar.f10078c, b0Var.f11234a);
    }

    public void a(u2.x0 x0Var) {
        if (((y2.a) x0Var.f43818c) == null) {
            return;
        }
        y2.d dVar = (y2.d) this.f28855c;
        synchronized (dVar) {
            u2.x0 x0Var2 = x0Var;
            while (x0Var2 != null) {
                try {
                    y2.a[] aVarArr = dVar.f46546f;
                    int i10 = dVar.e;
                    dVar.e = i10 + 1;
                    y2.a aVar = (y2.a) x0Var2.f43818c;
                    aVar.getClass();
                    aVarArr[i10] = aVar;
                    dVar.d--;
                    x0Var2 = (u2.x0) x0Var2.d;
                    if (x0Var2 == null || ((y2.a) x0Var2.f43818c) == null) {
                        x0Var2 = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            dVar.notifyAll();
        }
        x0Var.f43818c = null;
        x0Var.d = null;
    }

    public void b(long j3) {
        u2.x0 x0Var;
        if (j3 != -1) {
            while (true) {
                x0Var = (u2.x0) this.e;
                if (j3 < x0Var.f43817b) {
                    break;
                }
                y2.d dVar = (y2.d) this.f28855c;
                y2.a aVar = (y2.a) x0Var.f43818c;
                synchronized (dVar) {
                    y2.a[] aVarArr = dVar.f46546f;
                    int i10 = dVar.e;
                    dVar.e = i10 + 1;
                    aVarArr[i10] = aVar;
                    dVar.d--;
                    dVar.notifyAll();
                }
                u2.x0 x0Var2 = (u2.x0) this.e;
                x0Var2.f43818c = null;
                x0Var2.d = null;
                this.e = (u2.x0) x0Var2.d;
            }
            if (((u2.x0) this.f28856f).f43816a < x0Var.f43816a) {
                this.f28856f = x0Var;
            }
        }
    }

    public int c(int i10) {
        y2.a aVar;
        u2.x0 x0Var = (u2.x0) this.f28857g;
        if (((y2.a) x0Var.f43818c) == null) {
            y2.d dVar = (y2.d) this.f28855c;
            synchronized (dVar) {
                try {
                    int i11 = dVar.d + 1;
                    dVar.d = i11;
                    int i12 = dVar.e;
                    if (i12 > 0) {
                        y2.a[] aVarArr = dVar.f46546f;
                        int i13 = i12 - 1;
                        dVar.e = i13;
                        aVar = aVarArr[i13];
                        aVar.getClass();
                        dVar.f46546f[dVar.e] = null;
                    } else {
                        y2.a aVar2 = new y2.a(new byte[dVar.f46544b], 0);
                        y2.a[] aVarArr2 = dVar.f46546f;
                        if (i11 > aVarArr2.length) {
                            dVar.f46546f = (y2.a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
                        }
                        aVar = aVar2;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            u2.x0 x0Var2 = new u2.x0(((u2.x0) this.f28857g).f43817b, this.f28853a);
            x0Var.f43818c = aVar;
            x0Var.d = x0Var2;
        }
        return Math.min(i10, (int) (((u2.x0) this.f28857g).f43817b - this.f28854b));
    }

    public uo0(ic0 ic0Var) {
        this.d = new ArrayList(50);
        this.e = new ArrayList(50);
        Paint paint = new Paint(1);
        this.f28856f = paint;
        this.f28853a = 250;
        this.f28855c = ic0Var;
        paint.setStrokeWidth(AndroidUtilities.dp(1.33f));
    }
}
