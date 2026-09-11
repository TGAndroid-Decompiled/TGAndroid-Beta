package org.telegram.ui.Components;

import android.graphics.Paint;
import android.media.MediaCodec;
import android.os.Build;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
public final class ho0 {
    public final int f26773a;
    public long f26774b;
    public final Object f26775c;
    public final Object d;
    public Object f26776e;
    public Object f26777f;
    public Object f26778g;

    public ho0(y2.d dVar) {
        this.f26775c = dVar;
        int i10 = dVar.f49481b;
        this.f26773a = i10;
        this.d = new e2.v(32);
        u2.x0 x0Var = new u2.x0(0L, i10);
        this.f26776e = x0Var;
        this.f26777f = x0Var;
        this.f26778g = x0Var;
    }

    public static u2.x0 d(u2.x0 x0Var, long j3, ByteBuffer byteBuffer, int i10) {
        while (j3 >= x0Var.f46855b) {
            x0Var = (u2.x0) x0Var.d;
        }
        while (i10 > 0) {
            int min = Math.min(i10, (int) (x0Var.f46855b - j3));
            y2.a aVar = (y2.a) x0Var.f46856c;
            byteBuffer.put(aVar.f49475a, ((int) (j3 - x0Var.f46854a)) + aVar.f49476b, min);
            i10 -= min;
            j3 += min;
            if (j3 == x0Var.f46855b) {
                x0Var = (u2.x0) x0Var.d;
            }
        }
        return x0Var;
    }

    public static u2.x0 e(u2.x0 x0Var, long j3, byte[] bArr, int i10) {
        while (j3 >= x0Var.f46855b) {
            x0Var = (u2.x0) x0Var.d;
        }
        int i11 = i10;
        while (i11 > 0) {
            int min = Math.min(i11, (int) (x0Var.f46855b - j3));
            y2.a aVar = (y2.a) x0Var.f46856c;
            System.arraycopy(aVar.f49475a, ((int) (j3 - x0Var.f46854a)) + aVar.f49476b, bArr, i10 - i11, min);
            i11 -= min;
            j3 += min;
            if (j3 == x0Var.f46855b) {
                x0Var = (u2.x0) x0Var.d;
            }
        }
        return x0Var;
    }

    public static u2.x0 f(u2.x0 x0Var, h2.g gVar, j5.b bVar, e2.v vVar) {
        boolean z10;
        if (gVar.c(1073741824)) {
            long j3 = bVar.f13512a;
            int i10 = 1;
            vVar.G(1);
            u2.x0 e7 = e(x0Var, j3, vVar.f8789a, 1);
            long j10 = j3 + 1;
            byte b10 = vVar.f8789a[0];
            if ((b10 & 128) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i11 = b10 & Byte.MAX_VALUE;
            h2.c cVar = gVar.d;
            byte[] bArr = cVar.f10838a;
            if (bArr == null) {
                cVar.f10838a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            x0Var = e(e7, j10, cVar.f10838a, i11);
            long j11 = j10 + i11;
            if (z10) {
                vVar.G(2);
                x0Var = e(x0Var, j11, vVar.f8789a, 2);
                j11 += 2;
                i10 = vVar.D();
            }
            int[] iArr = cVar.d;
            if (iArr == null || iArr.length < i10) {
                iArr = new int[i10];
            }
            int[] iArr2 = cVar.f10841e;
            if (iArr2 == null || iArr2.length < i10) {
                iArr2 = new int[i10];
            }
            if (z10) {
                int i12 = i10 * 6;
                vVar.G(i12);
                x0Var = e(x0Var, j11, vVar.f8789a, i12);
                j11 += i12;
                vVar.J(0);
                for (int i13 = 0; i13 < i10; i13++) {
                    iArr[i13] = vVar.D();
                    iArr2[i13] = vVar.B();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = bVar.f13513b - ((int) (j11 - bVar.f13512a));
            }
            c3.g0 g0Var = (c3.g0) bVar.f13514c;
            String str = e2.d0.f8737a;
            byte[] bArr2 = g0Var.f4259b;
            byte[] bArr3 = cVar.f10838a;
            int i14 = g0Var.f4258a;
            int i15 = g0Var.f4260c;
            int i16 = g0Var.d;
            cVar.f10842f = i10;
            cVar.d = iArr;
            cVar.f10841e = iArr2;
            cVar.f10839b = bArr2;
            cVar.f10838a = bArr3;
            cVar.f10840c = i14;
            cVar.f10843g = i15;
            cVar.h = i16;
            MediaCodec.CryptoInfo cryptoInfo = cVar.f10844i;
            cryptoInfo.numSubSamples = i10;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i14;
            if (Build.VERSION.SDK_INT >= 24) {
                h2.b bVar2 = cVar.f10845j;
                bVar2.getClass();
                h2.b.a(bVar2, i15, i16);
            }
            long j12 = bVar.f13512a;
            int i17 = (int) (j11 - j12);
            bVar.f13512a = j12 + i17;
            bVar.f13513b -= i17;
        }
        if (gVar.c(268435456)) {
            vVar.G(4);
            u2.x0 e10 = e(x0Var, bVar.f13512a, vVar.f8789a, 4);
            int B = vVar.B();
            bVar.f13512a += 4;
            bVar.f13513b -= 4;
            gVar.l(B);
            u2.x0 d = d(e10, bVar.f13512a, gVar.f10847e, B);
            bVar.f13512a += B;
            int i18 = bVar.f13513b - B;
            bVar.f13513b = i18;
            ByteBuffer byteBuffer = gVar.f10849n;
            if (byteBuffer != null && byteBuffer.capacity() >= i18) {
                gVar.f10849n.clear();
            } else {
                gVar.f10849n = ByteBuffer.allocate(i18);
            }
            return d(d, bVar.f13512a, gVar.f10849n, bVar.f13513b);
        }
        gVar.l(bVar.f13513b);
        return d(x0Var, bVar.f13512a, gVar.f10847e, bVar.f13513b);
    }

    public void a(u2.x0 x0Var) {
        if (((y2.a) x0Var.f46856c) == null) {
            return;
        }
        y2.d dVar = (y2.d) this.f26775c;
        synchronized (dVar) {
            u2.x0 x0Var2 = x0Var;
            while (x0Var2 != null) {
                try {
                    y2.a[] aVarArr = dVar.f49484f;
                    int i10 = dVar.f49483e;
                    dVar.f49483e = i10 + 1;
                    y2.a aVar = (y2.a) x0Var2.f46856c;
                    aVar.getClass();
                    aVarArr[i10] = aVar;
                    dVar.d--;
                    x0Var2 = (u2.x0) x0Var2.d;
                    if (x0Var2 == null || ((y2.a) x0Var2.f46856c) == null) {
                        x0Var2 = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            dVar.notifyAll();
        }
        x0Var.f46856c = null;
        x0Var.d = null;
    }

    public void b(long j3) {
        u2.x0 x0Var;
        if (j3 != -1) {
            while (true) {
                x0Var = (u2.x0) this.f26776e;
                if (j3 < x0Var.f46855b) {
                    break;
                }
                y2.d dVar = (y2.d) this.f26775c;
                y2.a aVar = (y2.a) x0Var.f46856c;
                synchronized (dVar) {
                    y2.a[] aVarArr = dVar.f49484f;
                    int i10 = dVar.f49483e;
                    dVar.f49483e = i10 + 1;
                    aVarArr[i10] = aVar;
                    dVar.d--;
                    dVar.notifyAll();
                }
                u2.x0 x0Var2 = (u2.x0) this.f26776e;
                x0Var2.f46856c = null;
                x0Var2.d = null;
                this.f26776e = (u2.x0) x0Var2.d;
            }
            if (((u2.x0) this.f26777f).f46854a < x0Var.f46854a) {
                this.f26777f = x0Var;
            }
        }
    }

    public int c(int i10) {
        y2.a aVar;
        u2.x0 x0Var = (u2.x0) this.f26778g;
        if (((y2.a) x0Var.f46856c) == null) {
            y2.d dVar = (y2.d) this.f26775c;
            synchronized (dVar) {
                try {
                    int i11 = dVar.d + 1;
                    dVar.d = i11;
                    int i12 = dVar.f49483e;
                    if (i12 > 0) {
                        y2.a[] aVarArr = dVar.f49484f;
                        int i13 = i12 - 1;
                        dVar.f49483e = i13;
                        aVar = aVarArr[i13];
                        aVar.getClass();
                        dVar.f49484f[dVar.f49483e] = null;
                    } else {
                        y2.a aVar2 = new y2.a(new byte[dVar.f49481b], 0);
                        y2.a[] aVarArr2 = dVar.f49484f;
                        if (i11 > aVarArr2.length) {
                            dVar.f49484f = (y2.a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
                        }
                        aVar = aVar2;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            u2.x0 x0Var2 = new u2.x0(((u2.x0) this.f26778g).f46855b, this.f26773a);
            x0Var.f46856c = aVar;
            x0Var.d = x0Var2;
        }
        return Math.min(i10, (int) (((u2.x0) this.f26778g).f46855b - this.f26774b));
    }

    public ho0(cc0 cc0Var) {
        this.d = new ArrayList(50);
        this.f26776e = new ArrayList(50);
        Paint paint = new Paint(1);
        this.f26777f = paint;
        this.f26773a = 250;
        this.f26775c = cc0Var;
        paint.setStrokeWidth(AndroidUtilities.dp(1.33f));
    }
}
