package org.telegram.ui.Components;

import android.graphics.Paint;
import android.media.MediaCodec;
import android.os.Build;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
public final class op0 {
    public final int f29448a;
    public long f29449b;
    public final Object f29450c;
    public final Object d;
    public Object f29451e;
    public Object f29452f;
    public Object f29453g;

    public op0(y2.d dVar) {
        this.f29450c = dVar;
        int i10 = dVar.f51749b;
        this.f29448a = i10;
        this.d = new e2.v(32);
        u2.w0 w0Var = new u2.w0(0L, i10);
        this.f29451e = w0Var;
        this.f29452f = w0Var;
        this.f29453g = w0Var;
    }

    public static u2.w0 d(u2.w0 w0Var, long j3, ByteBuffer byteBuffer, int i10) {
        while (j3 >= w0Var.f48818b) {
            w0Var = (u2.w0) w0Var.d;
        }
        while (i10 > 0) {
            int min = Math.min(i10, (int) (w0Var.f48818b - j3));
            y2.a aVar = (y2.a) w0Var.f48819c;
            byteBuffer.put(aVar.f51743a, ((int) (j3 - w0Var.f48817a)) + aVar.f51744b, min);
            i10 -= min;
            j3 += min;
            if (j3 == w0Var.f48818b) {
                w0Var = (u2.w0) w0Var.d;
            }
        }
        return w0Var;
    }

    public static u2.w0 e(u2.w0 w0Var, long j3, byte[] bArr, int i10) {
        while (j3 >= w0Var.f48818b) {
            w0Var = (u2.w0) w0Var.d;
        }
        int i11 = i10;
        while (i11 > 0) {
            int min = Math.min(i11, (int) (w0Var.f48818b - j3));
            y2.a aVar = (y2.a) w0Var.f48819c;
            System.arraycopy(aVar.f51743a, ((int) (j3 - w0Var.f48817a)) + aVar.f51744b, bArr, i10 - i11, min);
            i11 -= min;
            j3 += min;
            if (j3 == w0Var.f48818b) {
                w0Var = (u2.w0) w0Var.d;
            }
        }
        return w0Var;
    }

    public static u2.w0 f(u2.w0 w0Var, h2.h hVar, ii.b0 b0Var, e2.v vVar) {
        boolean z10;
        if (hVar.getFlag(1073741824)) {
            long j3 = b0Var.f12281b;
            int i10 = 1;
            vVar.G(1);
            u2.w0 e7 = e(w0Var, j3, vVar.f8583a, 1);
            long j10 = j3 + 1;
            byte b10 = vVar.f8583a[0];
            if ((b10 & 128) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i11 = b10 & Byte.MAX_VALUE;
            h2.d dVar = hVar.f10983b;
            byte[] bArr = dVar.f10974a;
            if (bArr == null) {
                dVar.f10974a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            w0Var = e(e7, j10, dVar.f10974a, i11);
            long j11 = j10 + i11;
            if (z10) {
                vVar.G(2);
                w0Var = e(w0Var, j11, vVar.f8583a, 2);
                j11 += 2;
                i10 = vVar.D();
            }
            int[] iArr = dVar.d;
            if (iArr == null || iArr.length < i10) {
                iArr = new int[i10];
            }
            int[] iArr2 = dVar.f10977e;
            if (iArr2 == null || iArr2.length < i10) {
                iArr2 = new int[i10];
            }
            if (z10) {
                int i12 = i10 * 6;
                vVar.G(i12);
                w0Var = e(w0Var, j11, vVar.f8583a, i12);
                j11 += i12;
                vVar.J(0);
                for (int i13 = 0; i13 < i10; i13++) {
                    iArr[i13] = vVar.D();
                    iArr2[i13] = vVar.B();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = b0Var.f12280a - ((int) (j11 - b0Var.f12281b));
            }
            c3.g0 g0Var = (c3.g0) b0Var.f12282c;
            String str = e2.d0.f8531a;
            byte[] bArr2 = g0Var.f4114b;
            byte[] bArr3 = dVar.f10974a;
            int i14 = g0Var.f4113a;
            int i15 = g0Var.f4115c;
            int i16 = g0Var.d;
            dVar.f10978f = i10;
            dVar.d = iArr;
            dVar.f10977e = iArr2;
            dVar.f10975b = bArr2;
            dVar.f10974a = bArr3;
            dVar.f10976c = i14;
            dVar.f10979g = i15;
            dVar.h = i16;
            MediaCodec.CryptoInfo cryptoInfo = dVar.f10980i;
            cryptoInfo.numSubSamples = i10;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i14;
            if (Build.VERSION.SDK_INT >= 24) {
                h2.c cVar = dVar.f10981j;
                cVar.getClass();
                h2.c.a(cVar, i15, i16);
            }
            long j12 = b0Var.f12281b;
            int i17 = (int) (j11 - j12);
            b0Var.f12281b = j12 + i17;
            b0Var.f12280a -= i17;
        }
        if (hVar.hasSupplementalData()) {
            vVar.G(4);
            u2.w0 e10 = e(w0Var, b0Var.f12281b, vVar.f8583a, 4);
            int B = vVar.B();
            b0Var.f12281b += 4;
            b0Var.f12280a -= 4;
            hVar.b(B);
            u2.w0 d = d(e10, b0Var.f12281b, hVar.f10984c, B);
            b0Var.f12281b += B;
            int i18 = b0Var.f12280a - B;
            b0Var.f12280a = i18;
            ByteBuffer byteBuffer = hVar.f10986f;
            if (byteBuffer != null && byteBuffer.capacity() >= i18) {
                hVar.f10986f.clear();
            } else {
                hVar.f10986f = ByteBuffer.allocate(i18);
            }
            return d(d, b0Var.f12281b, hVar.f10986f, b0Var.f12280a);
        }
        hVar.b(b0Var.f12280a);
        return d(w0Var, b0Var.f12281b, hVar.f10984c, b0Var.f12280a);
    }

    public void a(u2.w0 w0Var) {
        if (((y2.a) w0Var.f48819c) == null) {
            return;
        }
        y2.d dVar = (y2.d) this.f29450c;
        synchronized (dVar) {
            u2.w0 w0Var2 = w0Var;
            while (w0Var2 != null) {
                try {
                    y2.a[] aVarArr = dVar.f51752f;
                    int i10 = dVar.f51751e;
                    dVar.f51751e = i10 + 1;
                    y2.a aVar = (y2.a) w0Var2.f48819c;
                    aVar.getClass();
                    aVarArr[i10] = aVar;
                    dVar.d--;
                    w0Var2 = (u2.w0) w0Var2.d;
                    if (w0Var2 == null || ((y2.a) w0Var2.f48819c) == null) {
                        w0Var2 = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            dVar.notifyAll();
        }
        w0Var.f48819c = null;
        w0Var.d = null;
    }

    public void b(long j3) {
        u2.w0 w0Var;
        if (j3 != -1) {
            while (true) {
                w0Var = (u2.w0) this.f29451e;
                if (j3 < w0Var.f48818b) {
                    break;
                }
                y2.d dVar = (y2.d) this.f29450c;
                y2.a aVar = (y2.a) w0Var.f48819c;
                synchronized (dVar) {
                    y2.a[] aVarArr = dVar.f51752f;
                    int i10 = dVar.f51751e;
                    dVar.f51751e = i10 + 1;
                    aVarArr[i10] = aVar;
                    dVar.d--;
                    dVar.notifyAll();
                }
                u2.w0 w0Var2 = (u2.w0) this.f29451e;
                w0Var2.f48819c = null;
                w0Var2.d = null;
                this.f29451e = (u2.w0) w0Var2.d;
            }
            if (((u2.w0) this.f29452f).f48817a < w0Var.f48817a) {
                this.f29452f = w0Var;
            }
        }
    }

    public int c(int i10) {
        y2.a aVar;
        u2.w0 w0Var = (u2.w0) this.f29453g;
        if (((y2.a) w0Var.f48819c) == null) {
            y2.d dVar = (y2.d) this.f29450c;
            synchronized (dVar) {
                try {
                    int i11 = dVar.d + 1;
                    dVar.d = i11;
                    int i12 = dVar.f51751e;
                    if (i12 > 0) {
                        y2.a[] aVarArr = dVar.f51752f;
                        int i13 = i12 - 1;
                        dVar.f51751e = i13;
                        aVar = aVarArr[i13];
                        aVar.getClass();
                        dVar.f51752f[dVar.f51751e] = null;
                    } else {
                        y2.a aVar2 = new y2.a(new byte[dVar.f51749b], 0);
                        y2.a[] aVarArr2 = dVar.f51752f;
                        if (i11 > aVarArr2.length) {
                            dVar.f51752f = (y2.a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
                        }
                        aVar = aVar2;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            u2.w0 w0Var2 = new u2.w0(((u2.w0) this.f29453g).f48818b, this.f29448a);
            w0Var.f48819c = aVar;
            w0Var.d = w0Var2;
        }
        return Math.min(i10, (int) (((u2.w0) this.f29453g).f48818b - this.f29449b));
    }

    public op0(cd0 cd0Var) {
        this.d = new ArrayList(50);
        this.f29451e = new ArrayList(50);
        Paint paint = new Paint(1);
        this.f29452f = paint;
        this.f29448a = 250;
        this.f29450c = cd0Var;
        paint.setStrokeWidth(AndroidUtilities.dp(1.33f));
    }
}
