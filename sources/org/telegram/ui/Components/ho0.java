package org.telegram.ui.Components;

import android.graphics.Paint;
import android.media.MediaCodec;
import android.os.Build;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
public final class ho0 {
    public final int f26800a;
    public long f26801b;
    public final Object f26802c;
    public final Object d;
    public Object f26803e;
    public Object f26804f;
    public Object f26805g;

    public ho0(y2.d dVar) {
        this.f26802c = dVar;
        int i10 = dVar.f49510b;
        this.f26800a = i10;
        this.d = new e2.v(32);
        u2.x0 x0Var = new u2.x0(0L, i10);
        this.f26803e = x0Var;
        this.f26804f = x0Var;
        this.f26805g = x0Var;
    }

    public static u2.x0 d(u2.x0 x0Var, long j3, ByteBuffer byteBuffer, int i10) {
        while (j3 >= x0Var.f46883b) {
            x0Var = (u2.x0) x0Var.d;
        }
        while (i10 > 0) {
            int min = Math.min(i10, (int) (x0Var.f46883b - j3));
            y2.a aVar = (y2.a) x0Var.f46884c;
            byteBuffer.put(aVar.f49504a, ((int) (j3 - x0Var.f46882a)) + aVar.f49505b, min);
            i10 -= min;
            j3 += min;
            if (j3 == x0Var.f46883b) {
                x0Var = (u2.x0) x0Var.d;
            }
        }
        return x0Var;
    }

    public static u2.x0 e(u2.x0 x0Var, long j3, byte[] bArr, int i10) {
        while (j3 >= x0Var.f46883b) {
            x0Var = (u2.x0) x0Var.d;
        }
        int i11 = i10;
        while (i11 > 0) {
            int min = Math.min(i11, (int) (x0Var.f46883b - j3));
            y2.a aVar = (y2.a) x0Var.f46884c;
            System.arraycopy(aVar.f49504a, ((int) (j3 - x0Var.f46882a)) + aVar.f49505b, bArr, i10 - i11, min);
            i11 -= min;
            j3 += min;
            if (j3 == x0Var.f46883b) {
                x0Var = (u2.x0) x0Var.d;
            }
        }
        return x0Var;
    }

    public static u2.x0 f(u2.x0 x0Var, h2.h hVar, j5.b bVar, e2.v vVar) {
        boolean z10;
        if (hVar.getFlag(1073741824)) {
            long j3 = bVar.f13538a;
            int i10 = 1;
            vVar.G(1);
            u2.x0 e7 = e(x0Var, j3, vVar.f8817a, 1);
            long j10 = j3 + 1;
            byte b10 = vVar.f8817a[0];
            if ((b10 & 128) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i11 = b10 & Byte.MAX_VALUE;
            h2.d dVar = hVar.f10875b;
            byte[] bArr = dVar.f10866a;
            if (bArr == null) {
                dVar.f10866a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            x0Var = e(e7, j10, dVar.f10866a, i11);
            long j11 = j10 + i11;
            if (z10) {
                vVar.G(2);
                x0Var = e(x0Var, j11, vVar.f8817a, 2);
                j11 += 2;
                i10 = vVar.D();
            }
            int[] iArr = dVar.d;
            if (iArr == null || iArr.length < i10) {
                iArr = new int[i10];
            }
            int[] iArr2 = dVar.f10869e;
            if (iArr2 == null || iArr2.length < i10) {
                iArr2 = new int[i10];
            }
            if (z10) {
                int i12 = i10 * 6;
                vVar.G(i12);
                x0Var = e(x0Var, j11, vVar.f8817a, i12);
                j11 += i12;
                vVar.J(0);
                for (int i13 = 0; i13 < i10; i13++) {
                    iArr[i13] = vVar.D();
                    iArr2[i13] = vVar.B();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = bVar.f13539b - ((int) (j11 - bVar.f13538a));
            }
            c3.g0 g0Var = (c3.g0) bVar.f13540c;
            String str = e2.d0.f8765a;
            byte[] bArr2 = g0Var.f4286b;
            byte[] bArr3 = dVar.f10866a;
            int i14 = g0Var.f4285a;
            int i15 = g0Var.f4287c;
            int i16 = g0Var.d;
            dVar.f10870f = i10;
            dVar.d = iArr;
            dVar.f10869e = iArr2;
            dVar.f10867b = bArr2;
            dVar.f10866a = bArr3;
            dVar.f10868c = i14;
            dVar.f10871g = i15;
            dVar.h = i16;
            MediaCodec.CryptoInfo cryptoInfo = dVar.f10872i;
            cryptoInfo.numSubSamples = i10;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i14;
            if (Build.VERSION.SDK_INT >= 24) {
                h2.c cVar = dVar.f10873j;
                cVar.getClass();
                h2.c.a(cVar, i15, i16);
            }
            long j12 = bVar.f13538a;
            int i17 = (int) (j11 - j12);
            bVar.f13538a = j12 + i17;
            bVar.f13539b -= i17;
        }
        if (hVar.hasSupplementalData()) {
            vVar.G(4);
            u2.x0 e10 = e(x0Var, bVar.f13538a, vVar.f8817a, 4);
            int B = vVar.B();
            bVar.f13538a += 4;
            bVar.f13539b -= 4;
            hVar.b(B);
            u2.x0 d = d(e10, bVar.f13538a, hVar.f10876c, B);
            bVar.f13538a += B;
            int i18 = bVar.f13539b - B;
            bVar.f13539b = i18;
            ByteBuffer byteBuffer = hVar.f10878f;
            if (byteBuffer != null && byteBuffer.capacity() >= i18) {
                hVar.f10878f.clear();
            } else {
                hVar.f10878f = ByteBuffer.allocate(i18);
            }
            return d(d, bVar.f13538a, hVar.f10878f, bVar.f13539b);
        }
        hVar.b(bVar.f13539b);
        return d(x0Var, bVar.f13538a, hVar.f10876c, bVar.f13539b);
    }

    public void a(u2.x0 x0Var) {
        if (((y2.a) x0Var.f46884c) == null) {
            return;
        }
        y2.d dVar = (y2.d) this.f26802c;
        synchronized (dVar) {
            u2.x0 x0Var2 = x0Var;
            while (x0Var2 != null) {
                try {
                    y2.a[] aVarArr = dVar.f49513f;
                    int i10 = dVar.f49512e;
                    dVar.f49512e = i10 + 1;
                    y2.a aVar = (y2.a) x0Var2.f46884c;
                    aVar.getClass();
                    aVarArr[i10] = aVar;
                    dVar.d--;
                    x0Var2 = (u2.x0) x0Var2.d;
                    if (x0Var2 == null || ((y2.a) x0Var2.f46884c) == null) {
                        x0Var2 = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            dVar.notifyAll();
        }
        x0Var.f46884c = null;
        x0Var.d = null;
    }

    public void b(long j3) {
        u2.x0 x0Var;
        if (j3 != -1) {
            while (true) {
                x0Var = (u2.x0) this.f26803e;
                if (j3 < x0Var.f46883b) {
                    break;
                }
                y2.d dVar = (y2.d) this.f26802c;
                y2.a aVar = (y2.a) x0Var.f46884c;
                synchronized (dVar) {
                    y2.a[] aVarArr = dVar.f49513f;
                    int i10 = dVar.f49512e;
                    dVar.f49512e = i10 + 1;
                    aVarArr[i10] = aVar;
                    dVar.d--;
                    dVar.notifyAll();
                }
                u2.x0 x0Var2 = (u2.x0) this.f26803e;
                x0Var2.f46884c = null;
                x0Var2.d = null;
                this.f26803e = (u2.x0) x0Var2.d;
            }
            if (((u2.x0) this.f26804f).f46882a < x0Var.f46882a) {
                this.f26804f = x0Var;
            }
        }
    }

    public int c(int i10) {
        y2.a aVar;
        u2.x0 x0Var = (u2.x0) this.f26805g;
        if (((y2.a) x0Var.f46884c) == null) {
            y2.d dVar = (y2.d) this.f26802c;
            synchronized (dVar) {
                try {
                    int i11 = dVar.d + 1;
                    dVar.d = i11;
                    int i12 = dVar.f49512e;
                    if (i12 > 0) {
                        y2.a[] aVarArr = dVar.f49513f;
                        int i13 = i12 - 1;
                        dVar.f49512e = i13;
                        aVar = aVarArr[i13];
                        aVar.getClass();
                        dVar.f49513f[dVar.f49512e] = null;
                    } else {
                        y2.a aVar2 = new y2.a(new byte[dVar.f49510b], 0);
                        y2.a[] aVarArr2 = dVar.f49513f;
                        if (i11 > aVarArr2.length) {
                            dVar.f49513f = (y2.a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
                        }
                        aVar = aVar2;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            u2.x0 x0Var2 = new u2.x0(((u2.x0) this.f26805g).f46883b, this.f26800a);
            x0Var.f46884c = aVar;
            x0Var.d = x0Var2;
        }
        return Math.min(i10, (int) (((u2.x0) this.f26805g).f46883b - this.f26801b));
    }

    public ho0(cc0 cc0Var) {
        this.d = new ArrayList(50);
        this.f26803e = new ArrayList(50);
        Paint paint = new Paint(1);
        this.f26804f = paint;
        this.f26800a = 250;
        this.f26802c = cc0Var;
        paint.setStrokeWidth(AndroidUtilities.dp(1.33f));
    }
}
