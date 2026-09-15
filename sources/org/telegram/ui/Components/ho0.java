package org.telegram.ui.Components;

import android.graphics.Paint;
import android.media.MediaCodec;
import android.os.Build;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
public final class ho0 {
    public final int f24735a;
    public long f24736b;
    public final Object f24737c;
    public final Object d;
    public Object e;
    public Object f24738f;
    public Object f24739g;

    public ho0(y2.d dVar) {
        this.f24737c = dVar;
        int i10 = dVar.f46262b;
        this.f24735a = i10;
        this.d = new e2.v(32);
        u2.x0 x0Var = new u2.x0(0L, i10);
        this.e = x0Var;
        this.f24738f = x0Var;
        this.f24739g = x0Var;
    }

    public static u2.x0 d(u2.x0 x0Var, long j3, ByteBuffer byteBuffer, int i10) {
        while (j3 >= x0Var.f43532b) {
            x0Var = (u2.x0) x0Var.d;
        }
        while (i10 > 0) {
            int min = Math.min(i10, (int) (x0Var.f43532b - j3));
            y2.a aVar = (y2.a) x0Var.f43533c;
            byteBuffer.put(aVar.f46256a, ((int) (j3 - x0Var.f43531a)) + aVar.f46257b, min);
            i10 -= min;
            j3 += min;
            if (j3 == x0Var.f43532b) {
                x0Var = (u2.x0) x0Var.d;
            }
        }
        return x0Var;
    }

    public static u2.x0 e(u2.x0 x0Var, long j3, byte[] bArr, int i10) {
        while (j3 >= x0Var.f43532b) {
            x0Var = (u2.x0) x0Var.d;
        }
        int i11 = i10;
        while (i11 > 0) {
            int min = Math.min(i11, (int) (x0Var.f43532b - j3));
            y2.a aVar = (y2.a) x0Var.f43533c;
            System.arraycopy(aVar.f46256a, ((int) (j3 - x0Var.f43531a)) + aVar.f46257b, bArr, i10 - i11, min);
            i11 -= min;
            j3 += min;
            if (j3 == x0Var.f43532b) {
                x0Var = (u2.x0) x0Var.d;
            }
        }
        return x0Var;
    }

    public static u2.x0 f(u2.x0 x0Var, h2.h hVar, ii.b0 b0Var, e2.v vVar) {
        boolean z10;
        if (hVar.getFlag(1073741824)) {
            long j3 = b0Var.f11246b;
            int i10 = 1;
            vVar.G(1);
            u2.x0 e = e(x0Var, j3, vVar.f7929a, 1);
            long j10 = j3 + 1;
            byte b10 = vVar.f7929a[0];
            if ((b10 & 128) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i11 = b10 & Byte.MAX_VALUE;
            h2.d dVar = hVar.f10091b;
            byte[] bArr = dVar.f10083a;
            if (bArr == null) {
                dVar.f10083a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            x0Var = e(e, j10, dVar.f10083a, i11);
            long j11 = j10 + i11;
            if (z10) {
                vVar.G(2);
                x0Var = e(x0Var, j11, vVar.f7929a, 2);
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
                x0Var = e(x0Var, j11, vVar.f7929a, i12);
                j11 += i12;
                vVar.J(0);
                for (int i13 = 0; i13 < i10; i13++) {
                    iArr[i13] = vVar.D();
                    iArr2[i13] = vVar.B();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = b0Var.f11245a - ((int) (j11 - b0Var.f11246b));
            }
            c3.g0 g0Var = (c3.g0) b0Var.f11247c;
            String str = e2.d0.f7883a;
            byte[] bArr2 = g0Var.f3761b;
            byte[] bArr3 = dVar.f10083a;
            int i14 = g0Var.f3760a;
            int i15 = g0Var.f3762c;
            int i16 = g0Var.d;
            dVar.f10086f = i10;
            dVar.d = iArr;
            dVar.e = iArr2;
            dVar.f10084b = bArr2;
            dVar.f10083a = bArr3;
            dVar.f10085c = i14;
            dVar.f10087g = i15;
            dVar.h = i16;
            MediaCodec.CryptoInfo cryptoInfo = dVar.f10088i;
            cryptoInfo.numSubSamples = i10;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i14;
            if (Build.VERSION.SDK_INT >= 24) {
                h2.c cVar = dVar.f10089j;
                cVar.getClass();
                h2.c.a(cVar, i15, i16);
            }
            long j12 = b0Var.f11246b;
            int i17 = (int) (j11 - j12);
            b0Var.f11246b = j12 + i17;
            b0Var.f11245a -= i17;
        }
        if (hVar.hasSupplementalData()) {
            vVar.G(4);
            u2.x0 e7 = e(x0Var, b0Var.f11246b, vVar.f7929a, 4);
            int B = vVar.B();
            b0Var.f11246b += 4;
            b0Var.f11245a -= 4;
            hVar.b(B);
            u2.x0 d = d(e7, b0Var.f11246b, hVar.f10092c, B);
            b0Var.f11246b += B;
            int i18 = b0Var.f11245a - B;
            b0Var.f11245a = i18;
            ByteBuffer byteBuffer = hVar.f10093f;
            if (byteBuffer != null && byteBuffer.capacity() >= i18) {
                hVar.f10093f.clear();
            } else {
                hVar.f10093f = ByteBuffer.allocate(i18);
            }
            return d(d, b0Var.f11246b, hVar.f10093f, b0Var.f11245a);
        }
        hVar.b(b0Var.f11245a);
        return d(x0Var, b0Var.f11246b, hVar.f10092c, b0Var.f11245a);
    }

    public void a(u2.x0 x0Var) {
        if (((y2.a) x0Var.f43533c) == null) {
            return;
        }
        y2.d dVar = (y2.d) this.f24737c;
        synchronized (dVar) {
            u2.x0 x0Var2 = x0Var;
            while (x0Var2 != null) {
                try {
                    y2.a[] aVarArr = dVar.f46264f;
                    int i10 = dVar.e;
                    dVar.e = i10 + 1;
                    y2.a aVar = (y2.a) x0Var2.f43533c;
                    aVar.getClass();
                    aVarArr[i10] = aVar;
                    dVar.d--;
                    x0Var2 = (u2.x0) x0Var2.d;
                    if (x0Var2 == null || ((y2.a) x0Var2.f43533c) == null) {
                        x0Var2 = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            dVar.notifyAll();
        }
        x0Var.f43533c = null;
        x0Var.d = null;
    }

    public void b(long j3) {
        u2.x0 x0Var;
        if (j3 != -1) {
            while (true) {
                x0Var = (u2.x0) this.e;
                if (j3 < x0Var.f43532b) {
                    break;
                }
                y2.d dVar = (y2.d) this.f24737c;
                y2.a aVar = (y2.a) x0Var.f43533c;
                synchronized (dVar) {
                    y2.a[] aVarArr = dVar.f46264f;
                    int i10 = dVar.e;
                    dVar.e = i10 + 1;
                    aVarArr[i10] = aVar;
                    dVar.d--;
                    dVar.notifyAll();
                }
                u2.x0 x0Var2 = (u2.x0) this.e;
                x0Var2.f43533c = null;
                x0Var2.d = null;
                this.e = (u2.x0) x0Var2.d;
            }
            if (((u2.x0) this.f24738f).f43531a < x0Var.f43531a) {
                this.f24738f = x0Var;
            }
        }
    }

    public int c(int i10) {
        y2.a aVar;
        u2.x0 x0Var = (u2.x0) this.f24739g;
        if (((y2.a) x0Var.f43533c) == null) {
            y2.d dVar = (y2.d) this.f24737c;
            synchronized (dVar) {
                try {
                    int i11 = dVar.d + 1;
                    dVar.d = i11;
                    int i12 = dVar.e;
                    if (i12 > 0) {
                        y2.a[] aVarArr = dVar.f46264f;
                        int i13 = i12 - 1;
                        dVar.e = i13;
                        aVar = aVarArr[i13];
                        aVar.getClass();
                        dVar.f46264f[dVar.e] = null;
                    } else {
                        y2.a aVar2 = new y2.a(new byte[dVar.f46262b], 0);
                        y2.a[] aVarArr2 = dVar.f46264f;
                        if (i11 > aVarArr2.length) {
                            dVar.f46264f = (y2.a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
                        }
                        aVar = aVar2;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            u2.x0 x0Var2 = new u2.x0(((u2.x0) this.f24739g).f43532b, this.f24735a);
            x0Var.f43533c = aVar;
            x0Var.d = x0Var2;
        }
        return Math.min(i10, (int) (((u2.x0) this.f24739g).f43532b - this.f24736b));
    }

    public ho0(bc0 bc0Var) {
        this.d = new ArrayList(50);
        this.e = new ArrayList(50);
        Paint paint = new Paint(1);
        this.f24738f = paint;
        this.f24735a = 250;
        this.f24737c = bc0Var;
        paint.setStrokeWidth(AndroidUtilities.dp(1.33f));
    }
}
