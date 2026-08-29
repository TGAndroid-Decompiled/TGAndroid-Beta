package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimatedFileDrawableStream;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
public final class a6 implements Runnable {
    public final int f26676a;
    public final c6 f26677b;

    public a6(c6 c6Var, int i10) {
        this.f26676a = i10;
        this.f26677b = c6Var;
    }

    @Override
    public final void run() {
        int i10;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        View view;
        switch (this.f26676a) {
            case 0:
                this.f26677b.i();
                return;
            case 1:
                jf.g gVar = this.f26677b.f27341v0;
                return;
            case 2:
                c6 c6Var = this.f26677b;
                c6Var.k();
                c6Var.f27320e = null;
                if (c6Var.I >= 0 && c6Var.H == -1) {
                    c6Var.I = -1L;
                }
                c6Var.x(false);
                c6Var.t();
                return;
            case 3:
                c6 c6Var2 = this.f26677b;
                if (!c6Var2.Y && !c6Var2.f27342w && !c6Var2.f27347y0 && c6Var2.f27348z0 == null) {
                    c6Var2.f27318c0 = (float) System.currentTimeMillis();
                    if (xi0.P0 == null) {
                        xi0.P0 = new DispatchQueue("cache generator queue");
                    }
                    c6Var2.f27347y0 = true;
                    c6Var2.f27320e = null;
                    jf.g.A++;
                    DispatchQueue dispatchQueue = xi0.P0;
                    a6 a6Var = new a6(c6Var2, 7);
                    c6Var2.f27348z0 = a6Var;
                    dispatchQueue.postRunnable(a6Var);
                    return;
                }
                return;
            case 4:
                c6 c6Var3 = this.f26677b;
                c6Var3.k();
                if (c6Var3.f27334q0 != null && c6Var3.J) {
                    FileLoader.getInstance(c6Var3.F).removeLoadingVideo(c6Var3.f27334q0.getDocument(), false, false);
                }
                int i11 = c6Var3.K;
                if (i11 <= 0) {
                    c6Var3.J = true;
                } else {
                    c6Var3.K = i11 - 1;
                }
                if (!c6Var3.B) {
                    c6Var3.A = true;
                } else {
                    c6Var3.B = false;
                }
                c6Var3.f27320e = null;
                if (c6Var3.I >= 0) {
                    c6Var3.f27335r = c6Var3.v;
                    c6Var3.f27337s = null;
                } else if (!c6Var3.f27315b) {
                    c6Var3.f27335r = c6Var3.v;
                } else {
                    z5 z5Var = c6Var3.f27335r;
                    if (z5Var == null && c6Var3.f27337s == null) {
                        c6Var3.f27335r = c6Var3.v;
                    } else if (z5Var == null) {
                        c6Var3.f27335r = c6Var3.f27337s;
                        c6Var3.f27337s = c6Var3.v;
                    } else {
                        c6Var3.f27337s = c6Var3.v;
                    }
                }
                c6Var3.v = null;
                if (c6Var3.L) {
                    c6Var3.L = false;
                    c6Var3.f27340u0++;
                    c6Var3.j();
                }
                if (c6Var3.d[3] < c6Var3.f27317c) {
                    float f9 = c6Var3.f27318c0;
                    if (f9 > 0.0f) {
                        i10 = (int) (f9 * 1000.0f);
                    } else {
                        i10 = 0;
                    }
                    c6Var3.f27317c = i10;
                }
                if (c6Var3.I >= 0 && c6Var3.H == -1) {
                    c6Var3.I = -1L;
                }
                c6Var3.f27317c = c6Var3.d[3];
                int size = c6Var3.f27332o0.size();
                for (int i12 = 0; i12 < size; i12++) {
                    ((View) c6Var3.f27332o0.get(i12)).invalidate();
                }
                if ((!c6Var3.X && c6Var3.f27346y) || (c6Var3.f27330n == null && c6Var3.f27335r != null)) {
                    c6Var3.t();
                }
                c6Var3.x(false);
                return;
            case 5:
                c6 c6Var4 = this.f26677b;
                if (c6Var4.Y) {
                    AndroidUtilities.runOnUIThread(c6Var4.B0);
                    return;
                }
                boolean z14 = false;
                if (!c6Var4.f27344x && c6Var4.Z == null) {
                    c6Var4.Z = AnimatedFileNative.a(c6Var4.C.getAbsolutePath(), c6Var4.d, c6Var4.F, c6Var4.D, c6Var4.f27334q0, false);
                    if (c6Var4.Z == null && (!c6Var4.f27327j0 || c6Var4.C0 > 15)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    c6Var4.f27314a0 = z12;
                    if (c6Var4.Z != null) {
                        int[] iArr = c6Var4.d;
                        if (iArr[0] > 3840 || iArr[1] > 3840) {
                            c6Var4.Z.f();
                            c6Var4.Z = null;
                        }
                    }
                    c6Var4.d();
                    c6Var4.E();
                    if (c6Var4.f27327j0 && c6Var4.Z == null) {
                        int i13 = c6Var4.C0;
                        c6Var4.C0 = i13 + 1;
                        if (i13 <= 15) {
                            z13 = false;
                            c6Var4.f27344x = z13;
                            AndroidUtilities.runOnUIThread(new a6(c6Var4, 0));
                        }
                    }
                    z13 = true;
                    c6Var4.f27344x = z13;
                    AndroidUtilities.runOnUIThread(new a6(c6Var4, 0));
                }
                try {
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
                if (c6Var4.f27341v0 != null) {
                    if (c6Var4.v == null) {
                        if (!c6Var4.h.isEmpty()) {
                            c6Var4.v = (z5) c6Var4.h.remove(0);
                        } else {
                            c6Var4.v = new z5(Bitmap.createBitmap(c6Var4.f27323f0, c6Var4.f27321e0, Bitmap.Config.ARGB_8888));
                        }
                    }
                    if (c6Var4.f27343w0 == null) {
                        c6Var4.f27343w0 = new Object();
                    }
                    System.currentTimeMillis();
                    a5.c cVar = c6Var4.f27343w0;
                    int i14 = cVar.f161a;
                    jf.g gVar2 = c6Var4.f27341v0;
                    int f10 = gVar2.f(c6Var4.v.f35217b, gVar2.f11600i);
                    cVar.f161a = gVar2.f11600i;
                    if (gVar2.f11608q && !gVar2.f11597e.isEmpty()) {
                        int i15 = gVar2.f11600i + 1;
                        gVar2.f11600i = i15;
                        if (i15 >= gVar2.f11597e.size()) {
                            gVar2.f11600i = 0;
                        }
                    }
                    if (f10 != -1 && c6Var4.f27343w0.f161a < i14) {
                        c6Var4.L = true;
                    }
                    int[] iArr2 = c6Var4.d;
                    z5 z5Var2 = c6Var4.v;
                    int max = c6Var4.f27343w0.f161a * Math.max(16, iArr2[4] / Math.max(1, c6Var4.f27341v0.f11597e.size()));
                    z5Var2.f35219e = max;
                    iArr2[3] = max;
                    c6Var4.v.f35220f = false;
                    if (c6Var4.f27341v0.g()) {
                        AndroidUtilities.runOnUIThread(c6Var4.A0);
                    }
                    if (f10 == -1) {
                        AndroidUtilities.runOnUIThread(c6Var4.f27345x0);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(c6Var4.B0);
                        return;
                    }
                }
                if (c6Var4.Z == null) {
                    int[] iArr3 = c6Var4.d;
                    if (iArr3[0] != 0 && iArr3[1] != 0) {
                        AndroidUtilities.runOnUIThread(c6Var4.f27345x0);
                        return;
                    }
                }
                if (c6Var4.v == null) {
                    int[] iArr4 = c6Var4.d;
                    if (iArr4[0] > 0 && iArr4[1] > 0) {
                        if (!c6Var4.h.isEmpty()) {
                            c6Var4.v = (z5) c6Var4.h.remove(0);
                        } else {
                            int[] iArr5 = c6Var4.d;
                            float f11 = c6Var4.f27326i0;
                            c6Var4.v = new z5(Bitmap.createBitmap((int) (iArr5[0] * f11), (int) (iArr5[1] * f11), Bitmap.Config.ARGB_8888));
                        }
                    }
                }
                if (c6Var4.H >= 0) {
                    c6Var4.d[3] = (int) c6Var4.H;
                    long j10 = c6Var4.H;
                    synchronized (c6Var4.M) {
                        c6Var4.H = -1L;
                    }
                    AnimatedFileDrawableStream animatedFileDrawableStream = c6Var4.f27334q0;
                    if (animatedFileDrawableStream != null) {
                        animatedFileDrawableStream.reset();
                    }
                    c6Var4.Z.g(j10, true);
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c6Var4.v != null) {
                    System.currentTimeMillis();
                    if (c6Var4.Z.c(c6Var4.v.f35217b, false, c6Var4.f27318c0, c6Var4.f27319d0, c6Var4.f27324g0) == 0) {
                        AndroidUtilities.runOnUIThread(c6Var4.f27345x0);
                        return;
                    }
                    if (!c6Var4.f27322f) {
                        if (c6Var4.Z.f26074a[7] == 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        c6Var4.f27322f = z11;
                    }
                    int i16 = c6Var4.d[3];
                    if (i16 < c6Var4.f27317c) {
                        c6Var4.L = true;
                    }
                    if (z10) {
                        c6Var4.f27317c = i16;
                    }
                    z5 z5Var3 = c6Var4.v;
                    z5Var3.f35219e = i16;
                    if (c6Var4.Z.f26074a[6] == 1) {
                        z14 = true;
                    }
                    z5Var3.f35220f = z14;
                }
                AndroidUtilities.runOnUIThread(c6Var4.B0);
                return;
            case 6:
                c6 c6Var5 = this.f26677b;
                ArrayList arrayList = c6Var5.f27332o0;
                int size2 = arrayList.size();
                for (int i17 = 0; i17 < size2; i17++) {
                    ((View) arrayList.get(i17)).invalidate();
                }
                if ((arrayList.isEmpty() || c6Var5.N) && (view = c6Var5.f27331n0) != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 7:
                c6 c6Var6 = this.f26677b;
                c6Var6.f27341v0.b();
                AndroidUtilities.runOnUIThread(new a6(c6Var6, 8));
                return;
            default:
                c6 c6Var7 = this.f26677b;
                if (c6Var7.f27348z0 != null) {
                    jf.g.c();
                    c6Var7.f27348z0 = null;
                }
                c6Var7.f27347y0 = false;
                c6Var7.k();
                c6Var7.x(false);
                return;
        }
    }
}
