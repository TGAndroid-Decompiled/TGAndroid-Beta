package org.telegram.ui.Components;

import android.graphics.Paint;
import android.media.MediaCodec;
import android.os.Build;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
public final class qo0 {
    public final int f26460a;
    public long f26461b;
    public final Object f26462c;
    public final Object d;
    public Object e;
    public Object f26463f;
    public Object f26464g;

    public qo0(y2.d dVar) {
        this.f26462c = dVar;
        int i10 = dVar.f46411b;
        this.f26460a = i10;
        this.d = new e2.v(32);
        u2.z0 z0Var = new u2.z0(0L, i10);
        this.e = z0Var;
        this.f26463f = z0Var;
        this.f26464g = z0Var;
    }

    public static u2.z0 d(u2.z0 z0Var, long j3, ByteBuffer byteBuffer, int i10) {
        while (j3 >= z0Var.f42507b) {
            z0Var = (u2.z0) z0Var.d;
        }
        while (i10 > 0) {
            int min = Math.min(i10, (int) (z0Var.f42507b - j3));
            y2.a aVar = (y2.a) z0Var.f42508c;
            byteBuffer.put(aVar.f46405a, ((int) (j3 - z0Var.f42506a)) + aVar.f46406b, min);
            i10 -= min;
            j3 += min;
            if (j3 == z0Var.f42507b) {
                z0Var = (u2.z0) z0Var.d;
            }
        }
        return z0Var;
    }

    public static u2.z0 e(u2.z0 z0Var, long j3, byte[] bArr, int i10) {
        while (j3 >= z0Var.f42507b) {
            z0Var = (u2.z0) z0Var.d;
        }
        int i11 = i10;
        while (i11 > 0) {
            int min = Math.min(i11, (int) (z0Var.f42507b - j3));
            y2.a aVar = (y2.a) z0Var.f42508c;
            System.arraycopy(aVar.f46405a, ((int) (j3 - z0Var.f42506a)) + aVar.f46406b, bArr, i10 - i11, min);
            i11 -= min;
            j3 += min;
            if (j3 == z0Var.f42507b) {
                z0Var = (u2.z0) z0Var.d;
            }
        }
        return z0Var;
    }

    public static u2.z0 f(u2.z0 z0Var, h2.h hVar, hi.c0 c0Var, e2.v vVar) {
        boolean z10;
        if (hVar.getFlag(1073741824)) {
            long j3 = c0Var.f9483b;
            int i10 = 1;
            vVar.G(1);
            u2.z0 e = e(z0Var, j3, vVar.f7234a, 1);
            long j10 = j3 + 1;
            byte b10 = vVar.f7234a[0];
            if ((b10 & 128) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i11 = b10 & Byte.MAX_VALUE;
            h2.d dVar = hVar.f9209b;
            byte[] bArr = dVar.f9201a;
            if (bArr == null) {
                dVar.f9201a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            z0Var = e(e, j10, dVar.f9201a, i11);
            long j11 = j10 + i11;
            if (z10) {
                vVar.G(2);
                z0Var = e(z0Var, j11, vVar.f7234a, 2);
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
                z0Var = e(z0Var, j11, vVar.f7234a, i12);
                j11 += i12;
                vVar.J(0);
                for (int i13 = 0; i13 < i10; i13++) {
                    iArr[i13] = vVar.D();
                    iArr2[i13] = vVar.B();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = c0Var.f9482a - ((int) (j11 - c0Var.f9483b));
            }
            c3.g0 g0Var = (c3.g0) c0Var.f9484c;
            String str = e2.d0.f7188a;
            byte[] bArr2 = g0Var.f4180b;
            byte[] bArr3 = dVar.f9201a;
            int i14 = g0Var.f4179a;
            int i15 = g0Var.f4181c;
            int i16 = g0Var.d;
            dVar.f9204f = i10;
            dVar.d = iArr;
            dVar.e = iArr2;
            dVar.f9202b = bArr2;
            dVar.f9201a = bArr3;
            dVar.f9203c = i14;
            dVar.f9205g = i15;
            dVar.h = i16;
            MediaCodec.CryptoInfo cryptoInfo = dVar.f9206i;
            cryptoInfo.numSubSamples = i10;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i14;
            if (Build.VERSION.SDK_INT >= 24) {
                h2.c cVar = dVar.f9207j;
                cVar.getClass();
                h2.c.a(cVar, i15, i16);
            }
            long j12 = c0Var.f9483b;
            int i17 = (int) (j11 - j12);
            c0Var.f9483b = j12 + i17;
            c0Var.f9482a -= i17;
        }
        if (hVar.hasSupplementalData()) {
            vVar.G(4);
            u2.z0 e7 = e(z0Var, c0Var.f9483b, vVar.f7234a, 4);
            int B = vVar.B();
            c0Var.f9483b += 4;
            c0Var.f9482a -= 4;
            hVar.b(B);
            u2.z0 d = d(e7, c0Var.f9483b, hVar.f9210c, B);
            c0Var.f9483b += B;
            int i18 = c0Var.f9482a - B;
            c0Var.f9482a = i18;
            ByteBuffer byteBuffer = hVar.f9211f;
            if (byteBuffer != null && byteBuffer.capacity() >= i18) {
                hVar.f9211f.clear();
            } else {
                hVar.f9211f = ByteBuffer.allocate(i18);
            }
            return d(d, c0Var.f9483b, hVar.f9211f, c0Var.f9482a);
        }
        hVar.b(c0Var.f9482a);
        return d(z0Var, c0Var.f9483b, hVar.f9210c, c0Var.f9482a);
    }

    public void a(u2.z0 z0Var) {
        if (((y2.a) z0Var.f42508c) == null) {
            return;
        }
        y2.d dVar = (y2.d) this.f26462c;
        synchronized (dVar) {
            u2.z0 z0Var2 = z0Var;
            while (z0Var2 != null) {
                try {
                    y2.a[] aVarArr = dVar.f46413f;
                    int i10 = dVar.e;
                    dVar.e = i10 + 1;
                    y2.a aVar = (y2.a) z0Var2.f42508c;
                    aVar.getClass();
                    aVarArr[i10] = aVar;
                    dVar.d--;
                    z0Var2 = (u2.z0) z0Var2.d;
                    if (z0Var2 == null || ((y2.a) z0Var2.f42508c) == null) {
                        z0Var2 = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            dVar.notifyAll();
        }
        z0Var.f42508c = null;
        z0Var.d = null;
    }

    public void b(long j3) {
        u2.z0 z0Var;
        if (j3 != -1) {
            while (true) {
                z0Var = (u2.z0) this.e;
                if (j3 < z0Var.f42507b) {
                    break;
                }
                y2.d dVar = (y2.d) this.f26462c;
                y2.a aVar = (y2.a) z0Var.f42508c;
                synchronized (dVar) {
                    y2.a[] aVarArr = dVar.f46413f;
                    int i10 = dVar.e;
                    dVar.e = i10 + 1;
                    aVarArr[i10] = aVar;
                    dVar.d--;
                    dVar.notifyAll();
                }
                u2.z0 z0Var2 = (u2.z0) this.e;
                z0Var2.f42508c = null;
                z0Var2.d = null;
                this.e = (u2.z0) z0Var2.d;
            }
            if (((u2.z0) this.f26463f).f42506a < z0Var.f42506a) {
                this.f26463f = z0Var;
            }
        }
    }

    public int c(int i10) {
        y2.a aVar;
        u2.z0 z0Var = (u2.z0) this.f26464g;
        if (((y2.a) z0Var.f42508c) == null) {
            y2.d dVar = (y2.d) this.f26462c;
            synchronized (dVar) {
                try {
                    int i11 = dVar.d + 1;
                    dVar.d = i11;
                    int i12 = dVar.e;
                    if (i12 > 0) {
                        y2.a[] aVarArr = dVar.f46413f;
                        int i13 = i12 - 1;
                        dVar.e = i13;
                        aVar = aVarArr[i13];
                        aVar.getClass();
                        dVar.f46413f[dVar.e] = null;
                    } else {
                        y2.a aVar2 = new y2.a(new byte[dVar.f46411b], 0);
                        y2.a[] aVarArr2 = dVar.f46413f;
                        if (i11 > aVarArr2.length) {
                            dVar.f46413f = (y2.a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
                        }
                        aVar = aVar2;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            u2.z0 z0Var2 = new u2.z0(((u2.z0) this.f26464g).f42507b, this.f26460a);
            z0Var.f42508c = aVar;
            z0Var.d = z0Var2;
        }
        return Math.min(i10, (int) (((u2.z0) this.f26464g).f42507b - this.f26461b));
    }

    public qo0(kc0 kc0Var) {
        this.d = new ArrayList(50);
        this.e = new ArrayList(50);
        Paint paint = new Paint(1);
        this.f26463f = paint;
        this.f26460a = 250;
        this.f26462c = kc0Var;
        paint.setStrokeWidth(AndroidUtilities.dp(1.33f));
    }
}
