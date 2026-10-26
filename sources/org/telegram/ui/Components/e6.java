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
public final class e6 implements Runnable {
    public final int f27747a;
    public final g6 f27748b;

    public e6(g6 g6Var, int i10) {
        this.f27747a = i10;
        this.f27748b = g6Var;
    }

    @Override
    public final void run() {
        int i10;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        View view;
        switch (this.f27747a) {
            case 0:
                this.f27748b.i();
                return;
            case 1:
                g6 g6Var = this.f27748b;
                if (g6Var.D0 != null) {
                    ag.k.c();
                    g6Var.D0 = null;
                }
                g6Var.C0 = false;
                g6Var.k();
                g6Var.x(false);
                return;
            case 2:
                this.f27748b.t();
                return;
            case 3:
                ag.k kVar = this.f27748b.f28468z0;
                return;
            case 4:
                g6 g6Var2 = this.f27748b;
                g6Var2.k();
                g6Var2.e = null;
                if (g6Var2.M >= 0 && g6Var2.L == -1) {
                    g6Var2.M = -1L;
                }
                g6Var2.x(false);
                g6Var2.t();
                return;
            case 5:
                g6 g6Var3 = this.f27748b;
                if (!g6Var3.f28439c0 && !g6Var3.f28462w && !g6Var3.C0 && g6Var3.D0 == null) {
                    g6Var3.f28444g0 = (float) System.currentTimeMillis();
                    if (xj0.T0 == null) {
                        xj0.T0 = new DispatchQueue("cache generator queue");
                    }
                    g6Var3.C0 = true;
                    g6Var3.e = null;
                    ag.k.A++;
                    DispatchQueue dispatchQueue = xj0.T0;
                    e6 e6Var = new e6(g6Var3, 9);
                    g6Var3.D0 = e6Var;
                    dispatchQueue.postRunnable(e6Var);
                    return;
                }
                return;
            case 6:
                g6 g6Var4 = this.f27748b;
                g6Var4.k();
                if (g6Var4.f28460u0 != null && g6Var4.N) {
                    FileLoader.getInstance(g6Var4.J).removeLoadingVideo(g6Var4.f28460u0.getDocument(), false, false);
                }
                int i11 = g6Var4.O;
                if (i11 <= 0) {
                    g6Var4.N = true;
                } else {
                    g6Var4.O = i11 - 1;
                }
                if (!g6Var4.F) {
                    g6Var4.E = true;
                } else {
                    g6Var4.F = false;
                }
                g6Var4.e = null;
                if (g6Var4.M >= 0) {
                    g6Var4.f28455r = g6Var4.v;
                    g6Var4.f28457s = null;
                } else if (!g6Var4.f28436b) {
                    g6Var4.f28455r = g6Var4.v;
                } else {
                    d6 d6Var = g6Var4.f28455r;
                    if (d6Var == null && g6Var4.f28457s == null) {
                        g6Var4.f28455r = g6Var4.v;
                    } else if (d6Var == null) {
                        g6Var4.f28455r = g6Var4.f28457s;
                        g6Var4.f28457s = g6Var4.v;
                    } else {
                        g6Var4.f28457s = g6Var4.v;
                    }
                }
                g6Var4.v = null;
                if (g6Var4.P) {
                    g6Var4.P = false;
                    g6Var4.f28467y0++;
                    g6Var4.j();
                }
                if (g6Var4.d[3] < g6Var4.f28438c) {
                    float f7 = g6Var4.f28444g0;
                    if (f7 > 0.0f) {
                        i10 = (int) (f7 * 1000.0f);
                    } else {
                        i10 = 0;
                    }
                    g6Var4.f28438c = i10;
                }
                if (g6Var4.M >= 0 && g6Var4.L == -1) {
                    g6Var4.M = -1L;
                }
                g6Var4.f28438c = g6Var4.d[3];
                Iterator it = g6Var4.f28458s0.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                if ((!g6Var4.f28437b0 && g6Var4.f28466y) || (g6Var4.f28450n == null && g6Var4.f28455r != null)) {
                    g6Var4.t();
                }
                g6Var4.x(false);
                return;
            case 7:
                g6 g6Var5 = this.f27748b;
                if (g6Var5.f28439c0) {
                    AndroidUtilities.runOnUIThread(g6Var5.F0);
                    return;
                }
                boolean z14 = false;
                if (!g6Var5.f28464x && g6Var5.f28440d0 == null) {
                    g6Var5.f28440d0 = AnimatedFileNative.a(g6Var5.G.getAbsolutePath(), g6Var5.d, g6Var5.J, g6Var5.H, g6Var5.f28460u0, false);
                    if (g6Var5.f28440d0 == null && (!g6Var5.f28451n0 || g6Var5.G0 > 15)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    g6Var5.f28441e0 = z12;
                    if (g6Var5.f28440d0 != null) {
                        int[] iArr = g6Var5.d;
                        if (iArr[0] > 3840 || iArr[1] > 3840) {
                            g6Var5.f28440d0.f();
                            g6Var5.f28440d0 = null;
                        }
                    }
                    g6Var5.d();
                    g6Var5.E();
                    if (g6Var5.f28451n0 && g6Var5.f28440d0 == null) {
                        int i12 = g6Var5.G0;
                        g6Var5.G0 = i12 + 1;
                        if (i12 <= 15) {
                            z13 = false;
                            g6Var5.f28464x = z13;
                            AndroidUtilities.runOnUIThread(new e6(g6Var5, 0));
                        }
                    }
                    z13 = true;
                    g6Var5.f28464x = z13;
                    AndroidUtilities.runOnUIThread(new e6(g6Var5, 0));
                }
                try {
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
                if (g6Var5.f28468z0 != null) {
                    if (g6Var5.v == null) {
                        if (!g6Var5.h.isEmpty()) {
                            g6Var5.v = (d6) g6Var5.h.remove(0);
                        } else {
                            g6Var5.v = new d6(Bitmap.createBitmap(g6Var5.f28447j0, g6Var5.f28446i0, Bitmap.Config.ARGB_8888));
                        }
                    }
                    if (g6Var5.A0 == null) {
                        g6Var5.A0 = new Object();
                    }
                    System.currentTimeMillis();
                    ag.j jVar = g6Var5.A0;
                    int i13 = jVar.f1303a;
                    ag.k kVar2 = g6Var5.f28468z0;
                    int f10 = kVar2.f(g6Var5.v.f27406b, kVar2.f1316i);
                    jVar.f1303a = kVar2.f1316i;
                    if (kVar2.f1324q && !kVar2.e.isEmpty()) {
                        int i14 = kVar2.f1316i + 1;
                        kVar2.f1316i = i14;
                        if (i14 >= kVar2.e.size()) {
                            kVar2.f1316i = 0;
                        }
                    }
                    if (f10 != -1 && g6Var5.A0.f1303a < i13) {
                        g6Var5.P = true;
                    }
                    int[] iArr2 = g6Var5.d;
                    d6 d6Var2 = g6Var5.v;
                    int max = g6Var5.A0.f1303a * Math.max(16, iArr2[4] / Math.max(1, g6Var5.f28468z0.e.size()));
                    d6Var2.e = max;
                    iArr2[3] = max;
                    g6Var5.v.f27408f = false;
                    if (g6Var5.f28468z0.g()) {
                        AndroidUtilities.runOnUIThread(g6Var5.E0);
                    }
                    if (f10 == -1) {
                        AndroidUtilities.runOnUIThread(g6Var5.B0);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(g6Var5.F0);
                        return;
                    }
                }
                if (g6Var5.f28440d0 == null) {
                    int[] iArr3 = g6Var5.d;
                    if (iArr3[0] != 0 && iArr3[1] != 0) {
                        AndroidUtilities.runOnUIThread(g6Var5.B0);
                        return;
                    }
                }
                if (g6Var5.v == null) {
                    int[] iArr4 = g6Var5.d;
                    if (iArr4[0] > 0 && iArr4[1] > 0) {
                        if (!g6Var5.h.isEmpty()) {
                            g6Var5.v = (d6) g6Var5.h.remove(0);
                        } else {
                            int[] iArr5 = g6Var5.d;
                            float f11 = g6Var5.m0;
                            g6Var5.v = new d6(Bitmap.createBitmap((int) (iArr5[0] * f11), (int) (iArr5[1] * f11), Bitmap.Config.ARGB_8888));
                        }
                    }
                }
                if (g6Var5.L >= 0) {
                    g6Var5.d[3] = (int) g6Var5.L;
                    long j10 = g6Var5.L;
                    synchronized (g6Var5.Q) {
                        g6Var5.L = -1L;
                    }
                    AnimatedFileDrawableStream animatedFileDrawableStream = g6Var5.f28460u0;
                    if (animatedFileDrawableStream != null) {
                        animatedFileDrawableStream.reset();
                    }
                    g6Var5.f28440d0.g(j10, true);
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (g6Var5.v != null) {
                    System.currentTimeMillis();
                    if (g6Var5.f28440d0.c(g6Var5.v.f27406b, false, g6Var5.f28444g0, g6Var5.f28445h0, g6Var5.f28448k0) == 0) {
                        AndroidUtilities.runOnUIThread(g6Var5.B0);
                        return;
                    }
                    if (!g6Var5.f28442f) {
                        if (g6Var5.f28440d0.f25833a[7] == 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        g6Var5.f28442f = z11;
                    }
                    int i15 = g6Var5.d[3];
                    if (i15 < g6Var5.f28438c) {
                        g6Var5.P = true;
                    }
                    if (z10) {
                        g6Var5.f28438c = i15;
                    }
                    d6 d6Var3 = g6Var5.v;
                    d6Var3.e = i15;
                    if (g6Var5.f28440d0.f25833a[6] == 1) {
                        z14 = true;
                    }
                    d6Var3.f27408f = z14;
                }
                AndroidUtilities.runOnUIThread(g6Var5.F0);
                return;
            case 8:
                g6 g6Var6 = this.f27748b;
                se.b bVar = g6Var6.f28458s0;
                Iterator it2 = bVar.iterator();
                while (it2.hasNext()) {
                    ((View) it2.next()).invalidate();
                }
                WeakReference weakReference = g6Var6.f28456r0;
                if (weakReference != null) {
                    view = (View) weakReference.get();
                } else {
                    view = null;
                }
                if ((bVar.isEmpty() || g6Var6.R) && view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                g6 g6Var7 = this.f27748b;
                g6Var7.f28468z0.b();
                AndroidUtilities.runOnUIThread(new e6(g6Var7, 1));
                return;
        }
    }
}
