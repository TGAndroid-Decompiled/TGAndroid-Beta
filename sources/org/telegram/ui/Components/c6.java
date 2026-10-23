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
public final class c6 implements Runnable {
    public final int f25109a;
    public final e6 f25110b;

    public c6(e6 e6Var, int i10) {
        this.f25109a = i10;
        this.f25110b = e6Var;
    }

    @Override
    public final void run() {
        int i10;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        View view;
        switch (this.f25109a) {
            case 0:
                this.f25110b.i();
                return;
            case 1:
                zf.e eVar = this.f25110b.f25780z0;
                return;
            case 2:
                e6 e6Var = this.f25110b;
                e6Var.k();
                e6Var.e = null;
                if (e6Var.M >= 0 && e6Var.L == -1) {
                    e6Var.M = -1L;
                }
                e6Var.x(false);
                e6Var.t();
                return;
            case 3:
                e6 e6Var2 = this.f25110b;
                if (!e6Var2.f25751c0 && !e6Var2.f25774w && !e6Var2.C0 && e6Var2.D0 == null) {
                    e6Var2.f25756g0 = (float) System.currentTimeMillis();
                    if (vj0.T0 == null) {
                        vj0.T0 = new DispatchQueue("cache generator queue");
                    }
                    e6Var2.C0 = true;
                    e6Var2.e = null;
                    zf.e.A++;
                    DispatchQueue dispatchQueue = vj0.T0;
                    c6 c6Var = new c6(e6Var2, 7);
                    e6Var2.D0 = c6Var;
                    dispatchQueue.postRunnable(c6Var);
                    return;
                }
                return;
            case 4:
                e6 e6Var3 = this.f25110b;
                e6Var3.k();
                if (e6Var3.f25772u0 != null && e6Var3.N) {
                    FileLoader.getInstance(e6Var3.J).removeLoadingVideo(e6Var3.f25772u0.getDocument(), false, false);
                }
                int i11 = e6Var3.O;
                if (i11 <= 0) {
                    e6Var3.N = true;
                } else {
                    e6Var3.O = i11 - 1;
                }
                if (!e6Var3.F) {
                    e6Var3.E = true;
                } else {
                    e6Var3.F = false;
                }
                e6Var3.e = null;
                if (e6Var3.M >= 0) {
                    e6Var3.f25767r = e6Var3.v;
                    e6Var3.f25769s = null;
                } else if (!e6Var3.f25748b) {
                    e6Var3.f25767r = e6Var3.v;
                } else {
                    b6 b6Var = e6Var3.f25767r;
                    if (b6Var == null && e6Var3.f25769s == null) {
                        e6Var3.f25767r = e6Var3.v;
                    } else if (b6Var == null) {
                        e6Var3.f25767r = e6Var3.f25769s;
                        e6Var3.f25769s = e6Var3.v;
                    } else {
                        e6Var3.f25769s = e6Var3.v;
                    }
                }
                e6Var3.v = null;
                if (e6Var3.P) {
                    e6Var3.P = false;
                    e6Var3.f25779y0++;
                    e6Var3.j();
                }
                if (e6Var3.d[3] < e6Var3.f25750c) {
                    float f7 = e6Var3.f25756g0;
                    if (f7 > 0.0f) {
                        i10 = (int) (f7 * 1000.0f);
                    } else {
                        i10 = 0;
                    }
                    e6Var3.f25750c = i10;
                }
                if (e6Var3.M >= 0 && e6Var3.L == -1) {
                    e6Var3.M = -1L;
                }
                e6Var3.f25750c = e6Var3.d[3];
                Iterator it = e6Var3.f25770s0.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                if ((!e6Var3.f25749b0 && e6Var3.f25778y) || (e6Var3.f25762n == null && e6Var3.f25767r != null)) {
                    e6Var3.t();
                }
                e6Var3.x(false);
                return;
            case 5:
                e6 e6Var4 = this.f25110b;
                if (e6Var4.f25751c0) {
                    AndroidUtilities.runOnUIThread(e6Var4.F0);
                    return;
                }
                boolean z14 = false;
                if (!e6Var4.f25776x && e6Var4.f25752d0 == null) {
                    e6Var4.f25752d0 = AnimatedFileNative.a(e6Var4.G.getAbsolutePath(), e6Var4.d, e6Var4.J, e6Var4.H, e6Var4.f25772u0, false);
                    if (e6Var4.f25752d0 == null && (!e6Var4.f25763n0 || e6Var4.G0 > 15)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    e6Var4.f25753e0 = z12;
                    if (e6Var4.f25752d0 != null) {
                        int[] iArr = e6Var4.d;
                        if (iArr[0] > 3840 || iArr[1] > 3840) {
                            e6Var4.f25752d0.f();
                            e6Var4.f25752d0 = null;
                        }
                    }
                    e6Var4.d();
                    e6Var4.E();
                    if (e6Var4.f25763n0 && e6Var4.f25752d0 == null) {
                        int i12 = e6Var4.G0;
                        e6Var4.G0 = i12 + 1;
                        if (i12 <= 15) {
                            z13 = false;
                            e6Var4.f25776x = z13;
                            AndroidUtilities.runOnUIThread(new c6(e6Var4, 0));
                        }
                    }
                    z13 = true;
                    e6Var4.f25776x = z13;
                    AndroidUtilities.runOnUIThread(new c6(e6Var4, 0));
                }
                try {
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
                if (e6Var4.f25780z0 != null) {
                    if (e6Var4.v == null) {
                        if (!e6Var4.h.isEmpty()) {
                            e6Var4.v = (b6) e6Var4.h.remove(0);
                        } else {
                            e6Var4.v = new b6(Bitmap.createBitmap(e6Var4.f25759j0, e6Var4.f25758i0, Bitmap.Config.ARGB_8888));
                        }
                    }
                    if (e6Var4.A0 == null) {
                        e6Var4.A0 = new Object();
                    }
                    System.currentTimeMillis();
                    com.google.android.gms.internal.cast.a aVar = e6Var4.A0;
                    int i13 = aVar.f6563a;
                    zf.e eVar2 = e6Var4.f25780z0;
                    int f10 = eVar2.f(e6Var4.v.f24813b, eVar2.f51552i);
                    aVar.f6563a = eVar2.f51552i;
                    if (eVar2.f51560q && !eVar2.e.isEmpty()) {
                        int i14 = eVar2.f51552i + 1;
                        eVar2.f51552i = i14;
                        if (i14 >= eVar2.e.size()) {
                            eVar2.f51552i = 0;
                        }
                    }
                    if (f10 != -1 && e6Var4.A0.f6563a < i13) {
                        e6Var4.P = true;
                    }
                    int[] iArr2 = e6Var4.d;
                    b6 b6Var2 = e6Var4.v;
                    int max = e6Var4.A0.f6563a * Math.max(16, iArr2[4] / Math.max(1, e6Var4.f25780z0.e.size()));
                    b6Var2.e = max;
                    iArr2[3] = max;
                    e6Var4.v.f24815f = false;
                    if (e6Var4.f25780z0.g()) {
                        AndroidUtilities.runOnUIThread(e6Var4.E0);
                    }
                    if (f10 == -1) {
                        AndroidUtilities.runOnUIThread(e6Var4.B0);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(e6Var4.F0);
                        return;
                    }
                }
                if (e6Var4.f25752d0 == null) {
                    int[] iArr3 = e6Var4.d;
                    if (iArr3[0] != 0 && iArr3[1] != 0) {
                        AndroidUtilities.runOnUIThread(e6Var4.B0);
                        return;
                    }
                }
                if (e6Var4.v == null) {
                    int[] iArr4 = e6Var4.d;
                    if (iArr4[0] > 0 && iArr4[1] > 0) {
                        if (!e6Var4.h.isEmpty()) {
                            e6Var4.v = (b6) e6Var4.h.remove(0);
                        } else {
                            int[] iArr5 = e6Var4.d;
                            float f11 = e6Var4.m0;
                            e6Var4.v = new b6(Bitmap.createBitmap((int) (iArr5[0] * f11), (int) (iArr5[1] * f11), Bitmap.Config.ARGB_8888));
                        }
                    }
                }
                if (e6Var4.L >= 0) {
                    e6Var4.d[3] = (int) e6Var4.L;
                    long j10 = e6Var4.L;
                    synchronized (e6Var4.Q) {
                        e6Var4.L = -1L;
                    }
                    AnimatedFileDrawableStream animatedFileDrawableStream = e6Var4.f25772u0;
                    if (animatedFileDrawableStream != null) {
                        animatedFileDrawableStream.reset();
                    }
                    e6Var4.f25752d0.g(j10, true);
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (e6Var4.v != null) {
                    System.currentTimeMillis();
                    if (e6Var4.f25752d0.c(e6Var4.v.f24813b, false, e6Var4.f25756g0, e6Var4.f25757h0, e6Var4.f25760k0) == 0) {
                        AndroidUtilities.runOnUIThread(e6Var4.B0);
                        return;
                    }
                    if (!e6Var4.f25754f) {
                        if (e6Var4.f25752d0.f23902a[7] == 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        e6Var4.f25754f = z11;
                    }
                    int i15 = e6Var4.d[3];
                    if (i15 < e6Var4.f25750c) {
                        e6Var4.P = true;
                    }
                    if (z10) {
                        e6Var4.f25750c = i15;
                    }
                    b6 b6Var3 = e6Var4.v;
                    b6Var3.e = i15;
                    if (e6Var4.f25752d0.f23902a[6] == 1) {
                        z14 = true;
                    }
                    b6Var3.f24815f = z14;
                }
                AndroidUtilities.runOnUIThread(e6Var4.F0);
                return;
            case 6:
                e6 e6Var5 = this.f25110b;
                re.b bVar = e6Var5.f25770s0;
                Iterator it2 = bVar.iterator();
                while (it2.hasNext()) {
                    ((View) it2.next()).invalidate();
                }
                WeakReference weakReference = e6Var5.f25768r0;
                if (weakReference != null) {
                    view = (View) weakReference.get();
                } else {
                    view = null;
                }
                if ((bVar.isEmpty() || e6Var5.R) && view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 7:
                e6 e6Var6 = this.f25110b;
                e6Var6.f25780z0.b();
                AndroidUtilities.runOnUIThread(new c6(e6Var6, 8));
                return;
            default:
                e6 e6Var7 = this.f25110b;
                if (e6Var7.D0 != null) {
                    zf.e.c();
                    e6Var7.D0 = null;
                }
                e6Var7.C0 = false;
                e6Var7.k();
                e6Var7.x(false);
                return;
        }
    }
}
