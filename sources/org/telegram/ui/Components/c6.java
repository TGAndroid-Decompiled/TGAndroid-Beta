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
    public final int f25247a;
    public final e6 f25248b;

    public c6(e6 e6Var, int i10) {
        this.f25247a = i10;
        this.f25248b = e6Var;
    }

    @Override
    public final void run() {
        int i10;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        View view;
        switch (this.f25247a) {
            case 0:
                this.f25248b.i();
                return;
            case 1:
                e6 e6Var = this.f25248b;
                if (e6Var.D0 != null) {
                    zf.e.c();
                    e6Var.D0 = null;
                }
                e6Var.C0 = false;
                e6Var.k();
                e6Var.x(false);
                return;
            case 2:
                this.f25248b.t();
                return;
            case 3:
                zf.e eVar = this.f25248b.f25896z0;
                return;
            case 4:
                e6 e6Var2 = this.f25248b;
                e6Var2.k();
                e6Var2.e = null;
                if (e6Var2.M >= 0 && e6Var2.L == -1) {
                    e6Var2.M = -1L;
                }
                e6Var2.x(false);
                e6Var2.t();
                return;
            case 5:
                e6 e6Var3 = this.f25248b;
                if (!e6Var3.f25867c0 && !e6Var3.f25890w && !e6Var3.C0 && e6Var3.D0 == null) {
                    e6Var3.f25872g0 = (float) System.currentTimeMillis();
                    if (yj0.T0 == null) {
                        yj0.T0 = new DispatchQueue("cache generator queue");
                    }
                    e6Var3.C0 = true;
                    e6Var3.e = null;
                    zf.e.A++;
                    DispatchQueue dispatchQueue = yj0.T0;
                    c6 c6Var = new c6(e6Var3, 9);
                    e6Var3.D0 = c6Var;
                    dispatchQueue.postRunnable(c6Var);
                    return;
                }
                return;
            case 6:
                e6 e6Var4 = this.f25248b;
                e6Var4.k();
                if (e6Var4.f25888u0 != null && e6Var4.N) {
                    FileLoader.getInstance(e6Var4.J).removeLoadingVideo(e6Var4.f25888u0.getDocument(), false, false);
                }
                int i11 = e6Var4.O;
                if (i11 <= 0) {
                    e6Var4.N = true;
                } else {
                    e6Var4.O = i11 - 1;
                }
                if (!e6Var4.F) {
                    e6Var4.E = true;
                } else {
                    e6Var4.F = false;
                }
                e6Var4.e = null;
                if (e6Var4.M >= 0) {
                    e6Var4.f25883r = e6Var4.v;
                    e6Var4.f25885s = null;
                } else if (!e6Var4.f25864b) {
                    e6Var4.f25883r = e6Var4.v;
                } else {
                    b6 b6Var = e6Var4.f25883r;
                    if (b6Var == null && e6Var4.f25885s == null) {
                        e6Var4.f25883r = e6Var4.v;
                    } else if (b6Var == null) {
                        e6Var4.f25883r = e6Var4.f25885s;
                        e6Var4.f25885s = e6Var4.v;
                    } else {
                        e6Var4.f25885s = e6Var4.v;
                    }
                }
                e6Var4.v = null;
                if (e6Var4.P) {
                    e6Var4.P = false;
                    e6Var4.f25895y0++;
                    e6Var4.j();
                }
                if (e6Var4.d[3] < e6Var4.f25866c) {
                    float f7 = e6Var4.f25872g0;
                    if (f7 > 0.0f) {
                        i10 = (int) (f7 * 1000.0f);
                    } else {
                        i10 = 0;
                    }
                    e6Var4.f25866c = i10;
                }
                if (e6Var4.M >= 0 && e6Var4.L == -1) {
                    e6Var4.M = -1L;
                }
                e6Var4.f25866c = e6Var4.d[3];
                Iterator it = e6Var4.f25886s0.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                if ((!e6Var4.f25865b0 && e6Var4.f25894y) || (e6Var4.f25878n == null && e6Var4.f25883r != null)) {
                    e6Var4.t();
                }
                e6Var4.x(false);
                return;
            case 7:
                e6 e6Var5 = this.f25248b;
                if (e6Var5.f25867c0) {
                    AndroidUtilities.runOnUIThread(e6Var5.F0);
                    return;
                }
                boolean z14 = false;
                if (!e6Var5.f25892x && e6Var5.f25868d0 == null) {
                    e6Var5.f25868d0 = AnimatedFileNative.a(e6Var5.G.getAbsolutePath(), e6Var5.d, e6Var5.J, e6Var5.H, e6Var5.f25888u0, false);
                    if (e6Var5.f25868d0 == null && (!e6Var5.f25879n0 || e6Var5.G0 > 15)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    e6Var5.f25869e0 = z12;
                    if (e6Var5.f25868d0 != null) {
                        int[] iArr = e6Var5.d;
                        if (iArr[0] > 3840 || iArr[1] > 3840) {
                            e6Var5.f25868d0.f();
                            e6Var5.f25868d0 = null;
                        }
                    }
                    e6Var5.d();
                    e6Var5.E();
                    if (e6Var5.f25879n0 && e6Var5.f25868d0 == null) {
                        int i12 = e6Var5.G0;
                        e6Var5.G0 = i12 + 1;
                        if (i12 <= 15) {
                            z13 = false;
                            e6Var5.f25892x = z13;
                            AndroidUtilities.runOnUIThread(new c6(e6Var5, 0));
                        }
                    }
                    z13 = true;
                    e6Var5.f25892x = z13;
                    AndroidUtilities.runOnUIThread(new c6(e6Var5, 0));
                }
                try {
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
                if (e6Var5.f25896z0 != null) {
                    if (e6Var5.v == null) {
                        if (!e6Var5.h.isEmpty()) {
                            e6Var5.v = (b6) e6Var5.h.remove(0);
                        } else {
                            e6Var5.v = new b6(Bitmap.createBitmap(e6Var5.f25875j0, e6Var5.f25874i0, Bitmap.Config.ARGB_8888));
                        }
                    }
                    if (e6Var5.A0 == null) {
                        e6Var5.A0 = new Object();
                    }
                    System.currentTimeMillis();
                    com.google.android.gms.internal.cast.a aVar = e6Var5.A0;
                    int i13 = aVar.f6575a;
                    zf.e eVar2 = e6Var5.f25896z0;
                    int f10 = eVar2.f(e6Var5.v.f24959b, eVar2.f52013i);
                    aVar.f6575a = eVar2.f52013i;
                    if (eVar2.f52021q && !eVar2.e.isEmpty()) {
                        int i14 = eVar2.f52013i + 1;
                        eVar2.f52013i = i14;
                        if (i14 >= eVar2.e.size()) {
                            eVar2.f52013i = 0;
                        }
                    }
                    if (f10 != -1 && e6Var5.A0.f6575a < i13) {
                        e6Var5.P = true;
                    }
                    int[] iArr2 = e6Var5.d;
                    b6 b6Var2 = e6Var5.v;
                    int max = e6Var5.A0.f6575a * Math.max(16, iArr2[4] / Math.max(1, e6Var5.f25896z0.e.size()));
                    b6Var2.e = max;
                    iArr2[3] = max;
                    e6Var5.v.f24961f = false;
                    if (e6Var5.f25896z0.g()) {
                        AndroidUtilities.runOnUIThread(e6Var5.E0);
                    }
                    if (f10 == -1) {
                        AndroidUtilities.runOnUIThread(e6Var5.B0);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(e6Var5.F0);
                        return;
                    }
                }
                if (e6Var5.f25868d0 == null) {
                    int[] iArr3 = e6Var5.d;
                    if (iArr3[0] != 0 && iArr3[1] != 0) {
                        AndroidUtilities.runOnUIThread(e6Var5.B0);
                        return;
                    }
                }
                if (e6Var5.v == null) {
                    int[] iArr4 = e6Var5.d;
                    if (iArr4[0] > 0 && iArr4[1] > 0) {
                        if (!e6Var5.h.isEmpty()) {
                            e6Var5.v = (b6) e6Var5.h.remove(0);
                        } else {
                            int[] iArr5 = e6Var5.d;
                            float f11 = e6Var5.m0;
                            e6Var5.v = new b6(Bitmap.createBitmap((int) (iArr5[0] * f11), (int) (iArr5[1] * f11), Bitmap.Config.ARGB_8888));
                        }
                    }
                }
                if (e6Var5.L >= 0) {
                    e6Var5.d[3] = (int) e6Var5.L;
                    long j10 = e6Var5.L;
                    synchronized (e6Var5.Q) {
                        e6Var5.L = -1L;
                    }
                    AnimatedFileDrawableStream animatedFileDrawableStream = e6Var5.f25888u0;
                    if (animatedFileDrawableStream != null) {
                        animatedFileDrawableStream.reset();
                    }
                    e6Var5.f25868d0.g(j10, true);
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (e6Var5.v != null) {
                    System.currentTimeMillis();
                    if (e6Var5.f25868d0.c(e6Var5.v.f24959b, false, e6Var5.f25872g0, e6Var5.f25873h0, e6Var5.f25876k0) == 0) {
                        AndroidUtilities.runOnUIThread(e6Var5.B0);
                        return;
                    }
                    if (!e6Var5.f25870f) {
                        if (e6Var5.f25868d0.f24040a[7] == 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        e6Var5.f25870f = z11;
                    }
                    int i15 = e6Var5.d[3];
                    if (i15 < e6Var5.f25866c) {
                        e6Var5.P = true;
                    }
                    if (z10) {
                        e6Var5.f25866c = i15;
                    }
                    b6 b6Var3 = e6Var5.v;
                    b6Var3.e = i15;
                    if (e6Var5.f25868d0.f24040a[6] == 1) {
                        z14 = true;
                    }
                    b6Var3.f24961f = z14;
                }
                AndroidUtilities.runOnUIThread(e6Var5.F0);
                return;
            case 8:
                e6 e6Var6 = this.f25248b;
                re.b bVar = e6Var6.f25886s0;
                Iterator it2 = bVar.iterator();
                while (it2.hasNext()) {
                    ((View) it2.next()).invalidate();
                }
                WeakReference weakReference = e6Var6.f25884r0;
                if (weakReference != null) {
                    view = (View) weakReference.get();
                } else {
                    view = null;
                }
                if ((bVar.isEmpty() || e6Var6.R) && view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                e6 e6Var7 = this.f25248b;
                e6Var7.f25896z0.b();
                AndroidUtilities.runOnUIThread(new c6(e6Var7, 1));
                return;
        }
    }
}
