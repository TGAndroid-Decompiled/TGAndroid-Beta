package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimatedFileDrawableStream;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
public final class a6 implements Runnable {
    public final int f22545a;
    public final c6 f22546b;

    public a6(c6 c6Var, int i10) {
        this.f22545a = i10;
        this.f22546b = c6Var;
    }

    @Override
    public final void run() {
        int i10;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        View view;
        switch (this.f22545a) {
            case 0:
                this.f22546b.i();
                return;
            case 1:
                yf.e eVar = this.f22546b.f23220z0;
                return;
            case 2:
                c6 c6Var = this.f22546b;
                c6Var.k();
                c6Var.e = null;
                if (c6Var.M >= 0 && c6Var.L == -1) {
                    c6Var.M = -1L;
                }
                c6Var.x(false);
                c6Var.t();
                return;
            case 3:
                c6 c6Var2 = this.f22546b;
                if (!c6Var2.f23191c0 && !c6Var2.f23214w && !c6Var2.C0 && c6Var2.D0 == null) {
                    c6Var2.f23196g0 = (float) System.currentTimeMillis();
                    if (kj0.T0 == null) {
                        kj0.T0 = new DispatchQueue("cache generator queue");
                    }
                    c6Var2.C0 = true;
                    c6Var2.e = null;
                    yf.e.A++;
                    DispatchQueue dispatchQueue = kj0.T0;
                    a6 a6Var = new a6(c6Var2, 7);
                    c6Var2.D0 = a6Var;
                    dispatchQueue.postRunnable(a6Var);
                    return;
                }
                return;
            case 4:
                c6 c6Var3 = this.f22546b;
                c6Var3.k();
                if (c6Var3.f23212u0 != null && c6Var3.N) {
                    FileLoader.getInstance(c6Var3.J).removeLoadingVideo(c6Var3.f23212u0.getDocument(), false, false);
                }
                int i11 = c6Var3.O;
                if (i11 <= 0) {
                    c6Var3.N = true;
                } else {
                    c6Var3.O = i11 - 1;
                }
                if (!c6Var3.F) {
                    c6Var3.E = true;
                } else {
                    c6Var3.F = false;
                }
                c6Var3.e = null;
                if (c6Var3.M >= 0) {
                    c6Var3.f23207r = c6Var3.v;
                    c6Var3.f23209s = null;
                } else if (!c6Var3.f23188b) {
                    c6Var3.f23207r = c6Var3.v;
                } else {
                    z5 z5Var = c6Var3.f23207r;
                    if (z5Var == null && c6Var3.f23209s == null) {
                        c6Var3.f23207r = c6Var3.v;
                    } else if (z5Var == null) {
                        c6Var3.f23207r = c6Var3.f23209s;
                        c6Var3.f23209s = c6Var3.v;
                    } else {
                        c6Var3.f23209s = c6Var3.v;
                    }
                }
                c6Var3.v = null;
                if (c6Var3.P) {
                    c6Var3.P = false;
                    c6Var3.f23219y0++;
                    c6Var3.j();
                }
                if (c6Var3.d[3] < c6Var3.f23190c) {
                    float f7 = c6Var3.f23196g0;
                    if (f7 > 0.0f) {
                        i10 = (int) (f7 * 1000.0f);
                    } else {
                        i10 = 0;
                    }
                    c6Var3.f23190c = i10;
                }
                if (c6Var3.M >= 0 && c6Var3.L == -1) {
                    c6Var3.M = -1L;
                }
                c6Var3.f23190c = c6Var3.d[3];
                Iterator it = c6Var3.f23210s0.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                if ((!c6Var3.f23189b0 && c6Var3.f23218y) || (c6Var3.f23202n == null && c6Var3.f23207r != null)) {
                    c6Var3.t();
                }
                c6Var3.x(false);
                return;
            case 5:
                c6 c6Var4 = this.f22546b;
                if (c6Var4.f23191c0) {
                    AndroidUtilities.runOnUIThread(c6Var4.F0);
                    return;
                }
                boolean z14 = false;
                if (!c6Var4.f23216x && c6Var4.f23192d0 == null) {
                    c6Var4.f23192d0 = AnimatedFileNative.a(c6Var4.G.getAbsolutePath(), c6Var4.d, c6Var4.J, c6Var4.H, c6Var4.f23212u0, false);
                    if (c6Var4.f23192d0 == null && (!c6Var4.f23203n0 || c6Var4.G0 > 15)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    c6Var4.f23193e0 = z12;
                    if (c6Var4.f23192d0 != null) {
                        int[] iArr = c6Var4.d;
                        if (iArr[0] > 3840 || iArr[1] > 3840) {
                            c6Var4.f23192d0.f();
                            c6Var4.f23192d0 = null;
                        }
                    }
                    c6Var4.d();
                    c6Var4.E();
                    if (c6Var4.f23203n0 && c6Var4.f23192d0 == null) {
                        int i12 = c6Var4.G0;
                        c6Var4.G0 = i12 + 1;
                        if (i12 <= 15) {
                            z13 = false;
                            c6Var4.f23216x = z13;
                            AndroidUtilities.runOnUIThread(new a6(c6Var4, 0));
                        }
                    }
                    z13 = true;
                    c6Var4.f23216x = z13;
                    AndroidUtilities.runOnUIThread(new a6(c6Var4, 0));
                }
                try {
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
                if (c6Var4.f23220z0 != null) {
                    if (c6Var4.v == null) {
                        if (!c6Var4.h.isEmpty()) {
                            c6Var4.v = (z5) c6Var4.h.remove(0);
                        } else {
                            c6Var4.v = new z5(Bitmap.createBitmap(c6Var4.f23199j0, c6Var4.f23198i0, Bitmap.Config.ARGB_8888));
                        }
                    }
                    if (c6Var4.A0 == null) {
                        c6Var4.A0 = new Object();
                    }
                    System.currentTimeMillis();
                    com.google.android.gms.internal.cast.a aVar = c6Var4.A0;
                    int i13 = aVar.f6244a;
                    yf.e eVar2 = c6Var4.f23220z0;
                    int f10 = eVar2.f(c6Var4.v.f30821b, eVar2.f47124i);
                    aVar.f6244a = eVar2.f47124i;
                    if (eVar2.f47132q && !eVar2.e.isEmpty()) {
                        int i14 = eVar2.f47124i + 1;
                        eVar2.f47124i = i14;
                        if (i14 >= eVar2.e.size()) {
                            eVar2.f47124i = 0;
                        }
                    }
                    if (f10 != -1 && c6Var4.A0.f6244a < i13) {
                        c6Var4.P = true;
                    }
                    int[] iArr2 = c6Var4.d;
                    z5 z5Var2 = c6Var4.v;
                    int max = c6Var4.A0.f6244a * Math.max(16, iArr2[4] / Math.max(1, c6Var4.f23220z0.e.size()));
                    z5Var2.e = max;
                    iArr2[3] = max;
                    c6Var4.v.f30823f = false;
                    if (c6Var4.f23220z0.g()) {
                        AndroidUtilities.runOnUIThread(c6Var4.E0);
                    }
                    if (f10 == -1) {
                        AndroidUtilities.runOnUIThread(c6Var4.B0);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(c6Var4.F0);
                        return;
                    }
                }
                if (c6Var4.f23192d0 == null) {
                    int[] iArr3 = c6Var4.d;
                    if (iArr3[0] != 0 && iArr3[1] != 0) {
                        AndroidUtilities.runOnUIThread(c6Var4.B0);
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
                            float f11 = c6Var4.m0;
                            c6Var4.v = new z5(Bitmap.createBitmap((int) (iArr5[0] * f11), (int) (iArr5[1] * f11), Bitmap.Config.ARGB_8888));
                        }
                    }
                }
                if (c6Var4.L >= 0) {
                    c6Var4.d[3] = (int) c6Var4.L;
                    long j3 = c6Var4.L;
                    synchronized (c6Var4.Q) {
                        c6Var4.L = -1L;
                    }
                    AnimatedFileDrawableStream animatedFileDrawableStream = c6Var4.f23212u0;
                    if (animatedFileDrawableStream != null) {
                        animatedFileDrawableStream.reset();
                    }
                    c6Var4.f23192d0.g(j3, true);
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c6Var4.v != null) {
                    System.currentTimeMillis();
                    if (c6Var4.f23192d0.c(c6Var4.v.f30821b, false, c6Var4.f23196g0, c6Var4.f23197h0, c6Var4.f23200k0) == 0) {
                        AndroidUtilities.runOnUIThread(c6Var4.B0);
                        return;
                    }
                    if (!c6Var4.f23194f) {
                        if (c6Var4.f23192d0.f21957a[7] == 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        c6Var4.f23194f = z11;
                    }
                    int i15 = c6Var4.d[3];
                    if (i15 < c6Var4.f23190c) {
                        c6Var4.P = true;
                    }
                    if (z10) {
                        c6Var4.f23190c = i15;
                    }
                    z5 z5Var3 = c6Var4.v;
                    z5Var3.e = i15;
                    if (c6Var4.f23192d0.f21957a[6] == 1) {
                        z14 = true;
                    }
                    z5Var3.f30823f = z14;
                }
                AndroidUtilities.runOnUIThread(c6Var4.F0);
                return;
            case 6:
                c6 c6Var5 = this.f22546b;
                pe.b bVar = c6Var5.f23210s0;
                Iterator it2 = bVar.iterator();
                while (it2.hasNext()) {
                    ((View) it2.next()).invalidate();
                }
                WeakReference weakReference = c6Var5.f23208r0;
                if (weakReference != null) {
                    view = (View) weakReference.get();
                } else {
                    view = null;
                }
                if ((bVar.isEmpty() || c6Var5.R) && view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 7:
                c6 c6Var6 = this.f22546b;
                c6Var6.f23220z0.b();
                AndroidUtilities.runOnUIThread(new a6(c6Var6, 8));
                return;
            default:
                c6 c6Var7 = this.f22546b;
                if (c6Var7.D0 != null) {
                    yf.e.c();
                    c6Var7.D0 = null;
                }
                c6Var7.C0 = false;
                c6Var7.k();
                c6Var7.x(false);
                return;
        }
    }
}
