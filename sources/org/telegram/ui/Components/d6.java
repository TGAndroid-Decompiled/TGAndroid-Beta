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
public final class d6 implements Runnable {
    public final int f25635a;
    public final f6 f25636b;

    public d6(f6 f6Var, int i10) {
        this.f25635a = i10;
        this.f25636b = f6Var;
    }

    @Override
    public final void run() {
        int i10;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        View view;
        switch (this.f25635a) {
            case 0:
                this.f25636b.i();
                return;
            case 1:
                yf.e eVar = this.f25636b.f26356z0;
                return;
            case 2:
                f6 f6Var = this.f25636b;
                f6Var.k();
                f6Var.f26328e = null;
                if (f6Var.M >= 0 && f6Var.L == -1) {
                    f6Var.M = -1L;
                }
                f6Var.x(false);
                f6Var.t();
                return;
            case 3:
                f6 f6Var2 = this.f25636b;
                if (!f6Var2.f26326c0 && !f6Var2.f26350w && !f6Var2.C0 && f6Var2.D0 == null) {
                    f6Var2.f26332g0 = (float) System.currentTimeMillis();
                    if (dk0.T0 == null) {
                        dk0.T0 = new DispatchQueue("cache generator queue");
                    }
                    f6Var2.C0 = true;
                    f6Var2.f26328e = null;
                    yf.e.A++;
                    DispatchQueue dispatchQueue = dk0.T0;
                    d6 d6Var = new d6(f6Var2, 7);
                    f6Var2.D0 = d6Var;
                    dispatchQueue.postRunnable(d6Var);
                    return;
                }
                return;
            case 4:
                f6 f6Var3 = this.f25636b;
                f6Var3.k();
                if (f6Var3.f26348u0 != null && f6Var3.N) {
                    FileLoader.getInstance(f6Var3.J).removeLoadingVideo(f6Var3.f26348u0.getDocument(), false, false);
                }
                int i11 = f6Var3.O;
                if (i11 <= 0) {
                    f6Var3.N = true;
                } else {
                    f6Var3.O = i11 - 1;
                }
                if (!f6Var3.F) {
                    f6Var3.E = true;
                } else {
                    f6Var3.F = false;
                }
                f6Var3.f26328e = null;
                if (f6Var3.M >= 0) {
                    f6Var3.f26343r = f6Var3.v;
                    f6Var3.f26345s = null;
                } else if (!f6Var3.f26323b) {
                    f6Var3.f26343r = f6Var3.v;
                } else {
                    c6 c6Var = f6Var3.f26343r;
                    if (c6Var == null && f6Var3.f26345s == null) {
                        f6Var3.f26343r = f6Var3.v;
                    } else if (c6Var == null) {
                        f6Var3.f26343r = f6Var3.f26345s;
                        f6Var3.f26345s = f6Var3.v;
                    } else {
                        f6Var3.f26345s = f6Var3.v;
                    }
                }
                f6Var3.v = null;
                if (f6Var3.P) {
                    f6Var3.P = false;
                    f6Var3.f26355y0++;
                    f6Var3.j();
                }
                if (f6Var3.d[3] < f6Var3.f26325c) {
                    float f7 = f6Var3.f26332g0;
                    if (f7 > 0.0f) {
                        i10 = (int) (f7 * 1000.0f);
                    } else {
                        i10 = 0;
                    }
                    f6Var3.f26325c = i10;
                }
                if (f6Var3.M >= 0 && f6Var3.L == -1) {
                    f6Var3.M = -1L;
                }
                f6Var3.f26325c = f6Var3.d[3];
                Iterator it = f6Var3.f26346s0.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                if ((!f6Var3.f26324b0 && f6Var3.f26354y) || (f6Var3.f26338n == null && f6Var3.f26343r != null)) {
                    f6Var3.t();
                }
                f6Var3.x(false);
                return;
            case 5:
                f6 f6Var4 = this.f25636b;
                if (f6Var4.f26326c0) {
                    AndroidUtilities.runOnUIThread(f6Var4.F0);
                    return;
                }
                boolean z14 = false;
                if (!f6Var4.f26352x && f6Var4.f26327d0 == null) {
                    f6Var4.f26327d0 = AnimatedFileNative.a(f6Var4.G.getAbsolutePath(), f6Var4.d, f6Var4.J, f6Var4.H, f6Var4.f26348u0, false);
                    if (f6Var4.f26327d0 == null && (!f6Var4.f26339n0 || f6Var4.G0 > 15)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    f6Var4.f26329e0 = z12;
                    if (f6Var4.f26327d0 != null) {
                        int[] iArr = f6Var4.d;
                        if (iArr[0] > 3840 || iArr[1] > 3840) {
                            f6Var4.f26327d0.f();
                            f6Var4.f26327d0 = null;
                        }
                    }
                    f6Var4.d();
                    f6Var4.E();
                    if (f6Var4.f26339n0 && f6Var4.f26327d0 == null) {
                        int i12 = f6Var4.G0;
                        f6Var4.G0 = i12 + 1;
                        if (i12 <= 15) {
                            z13 = false;
                            f6Var4.f26352x = z13;
                            AndroidUtilities.runOnUIThread(new d6(f6Var4, 0));
                        }
                    }
                    z13 = true;
                    f6Var4.f26352x = z13;
                    AndroidUtilities.runOnUIThread(new d6(f6Var4, 0));
                }
                try {
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
                if (f6Var4.f26356z0 != null) {
                    if (f6Var4.v == null) {
                        if (!f6Var4.h.isEmpty()) {
                            f6Var4.v = (c6) f6Var4.h.remove(0);
                        } else {
                            f6Var4.v = new c6(Bitmap.createBitmap(f6Var4.f26335j0, f6Var4.f26334i0, Bitmap.Config.ARGB_8888));
                        }
                    }
                    if (f6Var4.A0 == null) {
                        f6Var4.A0 = new Object();
                    }
                    System.currentTimeMillis();
                    com.google.android.gms.internal.cast.a aVar = f6Var4.A0;
                    int i13 = aVar.f6762a;
                    yf.e eVar2 = f6Var4.f26356z0;
                    int f10 = eVar2.f(f6Var4.v.f25240b, eVar2.f52260i);
                    aVar.f6762a = eVar2.f52260i;
                    if (eVar2.f52268q && !eVar2.f52257e.isEmpty()) {
                        int i14 = eVar2.f52260i + 1;
                        eVar2.f52260i = i14;
                        if (i14 >= eVar2.f52257e.size()) {
                            eVar2.f52260i = 0;
                        }
                    }
                    if (f10 != -1 && f6Var4.A0.f6762a < i13) {
                        f6Var4.P = true;
                    }
                    int[] iArr2 = f6Var4.d;
                    c6 c6Var2 = f6Var4.v;
                    int max = f6Var4.A0.f6762a * Math.max(16, iArr2[4] / Math.max(1, f6Var4.f26356z0.f52257e.size()));
                    c6Var2.f25242e = max;
                    iArr2[3] = max;
                    f6Var4.v.f25243f = false;
                    if (f6Var4.f26356z0.g()) {
                        AndroidUtilities.runOnUIThread(f6Var4.E0);
                    }
                    if (f10 == -1) {
                        AndroidUtilities.runOnUIThread(f6Var4.B0);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(f6Var4.F0);
                        return;
                    }
                }
                if (f6Var4.f26327d0 == null) {
                    int[] iArr3 = f6Var4.d;
                    if (iArr3[0] != 0 && iArr3[1] != 0) {
                        AndroidUtilities.runOnUIThread(f6Var4.B0);
                        return;
                    }
                }
                if (f6Var4.v == null) {
                    int[] iArr4 = f6Var4.d;
                    if (iArr4[0] > 0 && iArr4[1] > 0) {
                        if (!f6Var4.h.isEmpty()) {
                            f6Var4.v = (c6) f6Var4.h.remove(0);
                        } else {
                            int[] iArr5 = f6Var4.d;
                            float f11 = f6Var4.m0;
                            f6Var4.v = new c6(Bitmap.createBitmap((int) (iArr5[0] * f11), (int) (iArr5[1] * f11), Bitmap.Config.ARGB_8888));
                        }
                    }
                }
                if (f6Var4.L >= 0) {
                    f6Var4.d[3] = (int) f6Var4.L;
                    long j3 = f6Var4.L;
                    synchronized (f6Var4.Q) {
                        f6Var4.L = -1L;
                    }
                    AnimatedFileDrawableStream animatedFileDrawableStream = f6Var4.f26348u0;
                    if (animatedFileDrawableStream != null) {
                        animatedFileDrawableStream.reset();
                    }
                    f6Var4.f26327d0.g(j3, true);
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (f6Var4.v != null) {
                    System.currentTimeMillis();
                    if (f6Var4.f26327d0.c(f6Var4.v.f25240b, false, f6Var4.f26332g0, f6Var4.f26333h0, f6Var4.f26336k0) == 0) {
                        AndroidUtilities.runOnUIThread(f6Var4.B0);
                        return;
                    }
                    if (!f6Var4.f26330f) {
                        if (f6Var4.f26327d0.f23867a[7] == 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        f6Var4.f26330f = z11;
                    }
                    int i15 = f6Var4.d[3];
                    if (i15 < f6Var4.f26325c) {
                        f6Var4.P = true;
                    }
                    if (z10) {
                        f6Var4.f26325c = i15;
                    }
                    c6 c6Var3 = f6Var4.v;
                    c6Var3.f25242e = i15;
                    if (f6Var4.f26327d0.f23867a[6] == 1) {
                        z14 = true;
                    }
                    c6Var3.f25243f = z14;
                }
                AndroidUtilities.runOnUIThread(f6Var4.F0);
                return;
            case 6:
                f6 f6Var5 = this.f25636b;
                qe.b bVar = f6Var5.f26346s0;
                Iterator it2 = bVar.iterator();
                while (it2.hasNext()) {
                    ((View) it2.next()).invalidate();
                }
                WeakReference weakReference = f6Var5.f26344r0;
                if (weakReference != null) {
                    view = (View) weakReference.get();
                } else {
                    view = null;
                }
                if ((bVar.isEmpty() || f6Var5.R) && view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 7:
                f6 f6Var6 = this.f25636b;
                f6Var6.f26356z0.b();
                AndroidUtilities.runOnUIThread(new d6(f6Var6, 8));
                return;
            default:
                f6 f6Var7 = this.f25636b;
                if (f6Var7.D0 != null) {
                    yf.e.c();
                    f6Var7.D0 = null;
                }
                f6Var7.C0 = false;
                f6Var7.k();
                f6Var7.x(false);
                return;
        }
    }
}
