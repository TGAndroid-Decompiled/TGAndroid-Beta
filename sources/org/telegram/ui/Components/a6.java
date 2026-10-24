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
    public final int f24633a;
    public final c6 f24634b;

    public a6(c6 c6Var, int i10) {
        this.f24633a = i10;
        this.f24634b = c6Var;
    }

    @Override
    public final void run() {
        int i10;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        View view;
        switch (this.f24633a) {
            case 0:
                this.f24634b.i();
                return;
            case 1:
                c6 c6Var = this.f24634b;
                if (c6Var.D0 != null) {
                    zf.e.c();
                    c6Var.D0 = null;
                }
                c6Var.C0 = false;
                c6Var.k();
                c6Var.x(false);
                return;
            case 2:
                this.f24634b.t();
                return;
            case 3:
                zf.e eVar = this.f24634b.f25232z0;
                return;
            case 4:
                c6 c6Var2 = this.f24634b;
                c6Var2.k();
                c6Var2.e = null;
                if (c6Var2.M >= 0 && c6Var2.L == -1) {
                    c6Var2.M = -1L;
                }
                c6Var2.x(false);
                c6Var2.t();
                return;
            case 5:
                c6 c6Var3 = this.f24634b;
                if (!c6Var3.f25203c0 && !c6Var3.f25226w && !c6Var3.C0 && c6Var3.D0 == null) {
                    c6Var3.f25208g0 = (float) System.currentTimeMillis();
                    if (xj0.T0 == null) {
                        xj0.T0 = new DispatchQueue("cache generator queue");
                    }
                    c6Var3.C0 = true;
                    c6Var3.e = null;
                    zf.e.A++;
                    DispatchQueue dispatchQueue = xj0.T0;
                    a6 a6Var = new a6(c6Var3, 9);
                    c6Var3.D0 = a6Var;
                    dispatchQueue.postRunnable(a6Var);
                    return;
                }
                return;
            case 6:
                c6 c6Var4 = this.f24634b;
                c6Var4.k();
                if (c6Var4.f25224u0 != null && c6Var4.N) {
                    FileLoader.getInstance(c6Var4.J).removeLoadingVideo(c6Var4.f25224u0.getDocument(), false, false);
                }
                int i11 = c6Var4.O;
                if (i11 <= 0) {
                    c6Var4.N = true;
                } else {
                    c6Var4.O = i11 - 1;
                }
                if (!c6Var4.F) {
                    c6Var4.E = true;
                } else {
                    c6Var4.F = false;
                }
                c6Var4.e = null;
                if (c6Var4.M >= 0) {
                    c6Var4.f25219r = c6Var4.v;
                    c6Var4.f25221s = null;
                } else if (!c6Var4.f25200b) {
                    c6Var4.f25219r = c6Var4.v;
                } else {
                    z5 z5Var = c6Var4.f25219r;
                    if (z5Var == null && c6Var4.f25221s == null) {
                        c6Var4.f25219r = c6Var4.v;
                    } else if (z5Var == null) {
                        c6Var4.f25219r = c6Var4.f25221s;
                        c6Var4.f25221s = c6Var4.v;
                    } else {
                        c6Var4.f25221s = c6Var4.v;
                    }
                }
                c6Var4.v = null;
                if (c6Var4.P) {
                    c6Var4.P = false;
                    c6Var4.f25231y0++;
                    c6Var4.j();
                }
                if (c6Var4.d[3] < c6Var4.f25202c) {
                    float f7 = c6Var4.f25208g0;
                    if (f7 > 0.0f) {
                        i10 = (int) (f7 * 1000.0f);
                    } else {
                        i10 = 0;
                    }
                    c6Var4.f25202c = i10;
                }
                if (c6Var4.M >= 0 && c6Var4.L == -1) {
                    c6Var4.M = -1L;
                }
                c6Var4.f25202c = c6Var4.d[3];
                Iterator it = c6Var4.f25222s0.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                if ((!c6Var4.f25201b0 && c6Var4.f25230y) || (c6Var4.f25214n == null && c6Var4.f25219r != null)) {
                    c6Var4.t();
                }
                c6Var4.x(false);
                return;
            case 7:
                c6 c6Var5 = this.f24634b;
                if (c6Var5.f25203c0) {
                    AndroidUtilities.runOnUIThread(c6Var5.F0);
                    return;
                }
                boolean z14 = false;
                if (!c6Var5.f25228x && c6Var5.f25204d0 == null) {
                    c6Var5.f25204d0 = AnimatedFileNative.a(c6Var5.G.getAbsolutePath(), c6Var5.d, c6Var5.J, c6Var5.H, c6Var5.f25224u0, false);
                    if (c6Var5.f25204d0 == null && (!c6Var5.f25215n0 || c6Var5.G0 > 15)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    c6Var5.f25205e0 = z12;
                    if (c6Var5.f25204d0 != null) {
                        int[] iArr = c6Var5.d;
                        if (iArr[0] > 3840 || iArr[1] > 3840) {
                            c6Var5.f25204d0.f();
                            c6Var5.f25204d0 = null;
                        }
                    }
                    c6Var5.d();
                    c6Var5.E();
                    if (c6Var5.f25215n0 && c6Var5.f25204d0 == null) {
                        int i12 = c6Var5.G0;
                        c6Var5.G0 = i12 + 1;
                        if (i12 <= 15) {
                            z13 = false;
                            c6Var5.f25228x = z13;
                            AndroidUtilities.runOnUIThread(new a6(c6Var5, 0));
                        }
                    }
                    z13 = true;
                    c6Var5.f25228x = z13;
                    AndroidUtilities.runOnUIThread(new a6(c6Var5, 0));
                }
                try {
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
                if (c6Var5.f25232z0 != null) {
                    if (c6Var5.v == null) {
                        if (!c6Var5.h.isEmpty()) {
                            c6Var5.v = (z5) c6Var5.h.remove(0);
                        } else {
                            c6Var5.v = new z5(Bitmap.createBitmap(c6Var5.f25211j0, c6Var5.f25210i0, Bitmap.Config.ARGB_8888));
                        }
                    }
                    if (c6Var5.A0 == null) {
                        c6Var5.A0 = new Object();
                    }
                    System.currentTimeMillis();
                    com.google.android.gms.internal.cast.a aVar = c6Var5.A0;
                    int i13 = aVar.f6575a;
                    zf.e eVar2 = c6Var5.f25232z0;
                    int f10 = eVar2.f(c6Var5.v.f33153b, eVar2.f52012i);
                    aVar.f6575a = eVar2.f52012i;
                    if (eVar2.f52020q && !eVar2.e.isEmpty()) {
                        int i14 = eVar2.f52012i + 1;
                        eVar2.f52012i = i14;
                        if (i14 >= eVar2.e.size()) {
                            eVar2.f52012i = 0;
                        }
                    }
                    if (f10 != -1 && c6Var5.A0.f6575a < i13) {
                        c6Var5.P = true;
                    }
                    int[] iArr2 = c6Var5.d;
                    z5 z5Var2 = c6Var5.v;
                    int max = c6Var5.A0.f6575a * Math.max(16, iArr2[4] / Math.max(1, c6Var5.f25232z0.e.size()));
                    z5Var2.e = max;
                    iArr2[3] = max;
                    c6Var5.v.f33155f = false;
                    if (c6Var5.f25232z0.g()) {
                        AndroidUtilities.runOnUIThread(c6Var5.E0);
                    }
                    if (f10 == -1) {
                        AndroidUtilities.runOnUIThread(c6Var5.B0);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(c6Var5.F0);
                        return;
                    }
                }
                if (c6Var5.f25204d0 == null) {
                    int[] iArr3 = c6Var5.d;
                    if (iArr3[0] != 0 && iArr3[1] != 0) {
                        AndroidUtilities.runOnUIThread(c6Var5.B0);
                        return;
                    }
                }
                if (c6Var5.v == null) {
                    int[] iArr4 = c6Var5.d;
                    if (iArr4[0] > 0 && iArr4[1] > 0) {
                        if (!c6Var5.h.isEmpty()) {
                            c6Var5.v = (z5) c6Var5.h.remove(0);
                        } else {
                            int[] iArr5 = c6Var5.d;
                            float f11 = c6Var5.m0;
                            c6Var5.v = new z5(Bitmap.createBitmap((int) (iArr5[0] * f11), (int) (iArr5[1] * f11), Bitmap.Config.ARGB_8888));
                        }
                    }
                }
                if (c6Var5.L >= 0) {
                    c6Var5.d[3] = (int) c6Var5.L;
                    long j10 = c6Var5.L;
                    synchronized (c6Var5.Q) {
                        c6Var5.L = -1L;
                    }
                    AnimatedFileDrawableStream animatedFileDrawableStream = c6Var5.f25224u0;
                    if (animatedFileDrawableStream != null) {
                        animatedFileDrawableStream.reset();
                    }
                    c6Var5.f25204d0.g(j10, true);
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c6Var5.v != null) {
                    System.currentTimeMillis();
                    if (c6Var5.f25204d0.c(c6Var5.v.f33153b, false, c6Var5.f25208g0, c6Var5.f25209h0, c6Var5.f25212k0) == 0) {
                        AndroidUtilities.runOnUIThread(c6Var5.B0);
                        return;
                    }
                    if (!c6Var5.f25206f) {
                        if (c6Var5.f25204d0.f24041a[7] == 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        c6Var5.f25206f = z11;
                    }
                    int i15 = c6Var5.d[3];
                    if (i15 < c6Var5.f25202c) {
                        c6Var5.P = true;
                    }
                    if (z10) {
                        c6Var5.f25202c = i15;
                    }
                    z5 z5Var3 = c6Var5.v;
                    z5Var3.e = i15;
                    if (c6Var5.f25204d0.f24041a[6] == 1) {
                        z14 = true;
                    }
                    z5Var3.f33155f = z14;
                }
                AndroidUtilities.runOnUIThread(c6Var5.F0);
                return;
            case 8:
                c6 c6Var6 = this.f24634b;
                re.b bVar = c6Var6.f25222s0;
                Iterator it2 = bVar.iterator();
                while (it2.hasNext()) {
                    ((View) it2.next()).invalidate();
                }
                WeakReference weakReference = c6Var6.f25220r0;
                if (weakReference != null) {
                    view = (View) weakReference.get();
                } else {
                    view = null;
                }
                if ((bVar.isEmpty() || c6Var6.R) && view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                c6 c6Var7 = this.f24634b;
                c6Var7.f25232z0.b();
                AndroidUtilities.runOnUIThread(new a6(c6Var7, 1));
                return;
        }
    }
}
