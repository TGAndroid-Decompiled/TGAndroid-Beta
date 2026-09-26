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
public final class b6 implements Runnable {
    public final int f22899a;
    public final d6 f22900b;

    public b6(d6 d6Var, int i10) {
        this.f22899a = i10;
        this.f22900b = d6Var;
    }

    @Override
    public final void run() {
        int i10;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        View view;
        switch (this.f22899a) {
            case 0:
                this.f22900b.i();
                return;
            case 1:
                yf.e eVar = this.f22900b.f23547z0;
                return;
            case 2:
                d6 d6Var = this.f22900b;
                d6Var.k();
                d6Var.e = null;
                if (d6Var.M >= 0 && d6Var.L == -1) {
                    d6Var.M = -1L;
                }
                d6Var.x(false);
                d6Var.t();
                return;
            case 3:
                d6 d6Var2 = this.f22900b;
                if (!d6Var2.f23518c0 && !d6Var2.f23541w && !d6Var2.C0 && d6Var2.D0 == null) {
                    d6Var2.f23523g0 = (float) System.currentTimeMillis();
                    if (jj0.T0 == null) {
                        jj0.T0 = new DispatchQueue("cache generator queue");
                    }
                    d6Var2.C0 = true;
                    d6Var2.e = null;
                    yf.e.A++;
                    DispatchQueue dispatchQueue = jj0.T0;
                    b6 b6Var = new b6(d6Var2, 7);
                    d6Var2.D0 = b6Var;
                    dispatchQueue.postRunnable(b6Var);
                    return;
                }
                return;
            case 4:
                d6 d6Var3 = this.f22900b;
                d6Var3.k();
                if (d6Var3.f23539u0 != null && d6Var3.N) {
                    FileLoader.getInstance(d6Var3.J).removeLoadingVideo(d6Var3.f23539u0.getDocument(), false, false);
                }
                int i11 = d6Var3.O;
                if (i11 <= 0) {
                    d6Var3.N = true;
                } else {
                    d6Var3.O = i11 - 1;
                }
                if (!d6Var3.F) {
                    d6Var3.E = true;
                } else {
                    d6Var3.F = false;
                }
                d6Var3.e = null;
                if (d6Var3.M >= 0) {
                    d6Var3.f23534r = d6Var3.v;
                    d6Var3.f23536s = null;
                } else if (!d6Var3.f23515b) {
                    d6Var3.f23534r = d6Var3.v;
                } else {
                    a6 a6Var = d6Var3.f23534r;
                    if (a6Var == null && d6Var3.f23536s == null) {
                        d6Var3.f23534r = d6Var3.v;
                    } else if (a6Var == null) {
                        d6Var3.f23534r = d6Var3.f23536s;
                        d6Var3.f23536s = d6Var3.v;
                    } else {
                        d6Var3.f23536s = d6Var3.v;
                    }
                }
                d6Var3.v = null;
                if (d6Var3.P) {
                    d6Var3.P = false;
                    d6Var3.f23546y0++;
                    d6Var3.j();
                }
                if (d6Var3.d[3] < d6Var3.f23517c) {
                    float f7 = d6Var3.f23523g0;
                    if (f7 > 0.0f) {
                        i10 = (int) (f7 * 1000.0f);
                    } else {
                        i10 = 0;
                    }
                    d6Var3.f23517c = i10;
                }
                if (d6Var3.M >= 0 && d6Var3.L == -1) {
                    d6Var3.M = -1L;
                }
                d6Var3.f23517c = d6Var3.d[3];
                Iterator it = d6Var3.f23537s0.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                if ((!d6Var3.f23516b0 && d6Var3.f23545y) || (d6Var3.f23529n == null && d6Var3.f23534r != null)) {
                    d6Var3.t();
                }
                d6Var3.x(false);
                return;
            case 5:
                d6 d6Var4 = this.f22900b;
                if (d6Var4.f23518c0) {
                    AndroidUtilities.runOnUIThread(d6Var4.F0);
                    return;
                }
                boolean z14 = false;
                if (!d6Var4.f23543x && d6Var4.f23519d0 == null) {
                    d6Var4.f23519d0 = AnimatedFileNative.a(d6Var4.G.getAbsolutePath(), d6Var4.d, d6Var4.J, d6Var4.H, d6Var4.f23539u0, false);
                    if (d6Var4.f23519d0 == null && (!d6Var4.f23530n0 || d6Var4.G0 > 15)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    d6Var4.f23520e0 = z12;
                    if (d6Var4.f23519d0 != null) {
                        int[] iArr = d6Var4.d;
                        if (iArr[0] > 3840 || iArr[1] > 3840) {
                            d6Var4.f23519d0.f();
                            d6Var4.f23519d0 = null;
                        }
                    }
                    d6Var4.d();
                    d6Var4.E();
                    if (d6Var4.f23530n0 && d6Var4.f23519d0 == null) {
                        int i12 = d6Var4.G0;
                        d6Var4.G0 = i12 + 1;
                        if (i12 <= 15) {
                            z13 = false;
                            d6Var4.f23543x = z13;
                            AndroidUtilities.runOnUIThread(new b6(d6Var4, 0));
                        }
                    }
                    z13 = true;
                    d6Var4.f23543x = z13;
                    AndroidUtilities.runOnUIThread(new b6(d6Var4, 0));
                }
                try {
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
                if (d6Var4.f23547z0 != null) {
                    if (d6Var4.v == null) {
                        if (!d6Var4.h.isEmpty()) {
                            d6Var4.v = (a6) d6Var4.h.remove(0);
                        } else {
                            d6Var4.v = new a6(Bitmap.createBitmap(d6Var4.f23526j0, d6Var4.f23525i0, Bitmap.Config.ARGB_8888));
                        }
                    }
                    if (d6Var4.A0 == null) {
                        d6Var4.A0 = new Object();
                    }
                    System.currentTimeMillis();
                    com.google.android.gms.internal.cast.a aVar = d6Var4.A0;
                    int i13 = aVar.f6228a;
                    yf.e eVar2 = d6Var4.f23547z0;
                    int f10 = eVar2.f(d6Var4.v.f22543b, eVar2.f47079i);
                    aVar.f6228a = eVar2.f47079i;
                    if (eVar2.f47087q && !eVar2.e.isEmpty()) {
                        int i14 = eVar2.f47079i + 1;
                        eVar2.f47079i = i14;
                        if (i14 >= eVar2.e.size()) {
                            eVar2.f47079i = 0;
                        }
                    }
                    if (f10 != -1 && d6Var4.A0.f6228a < i13) {
                        d6Var4.P = true;
                    }
                    int[] iArr2 = d6Var4.d;
                    a6 a6Var2 = d6Var4.v;
                    int max = d6Var4.A0.f6228a * Math.max(16, iArr2[4] / Math.max(1, d6Var4.f23547z0.e.size()));
                    a6Var2.e = max;
                    iArr2[3] = max;
                    d6Var4.v.f22545f = false;
                    if (d6Var4.f23547z0.g()) {
                        AndroidUtilities.runOnUIThread(d6Var4.E0);
                    }
                    if (f10 == -1) {
                        AndroidUtilities.runOnUIThread(d6Var4.B0);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(d6Var4.F0);
                        return;
                    }
                }
                if (d6Var4.f23519d0 == null) {
                    int[] iArr3 = d6Var4.d;
                    if (iArr3[0] != 0 && iArr3[1] != 0) {
                        AndroidUtilities.runOnUIThread(d6Var4.B0);
                        return;
                    }
                }
                if (d6Var4.v == null) {
                    int[] iArr4 = d6Var4.d;
                    if (iArr4[0] > 0 && iArr4[1] > 0) {
                        if (!d6Var4.h.isEmpty()) {
                            d6Var4.v = (a6) d6Var4.h.remove(0);
                        } else {
                            int[] iArr5 = d6Var4.d;
                            float f11 = d6Var4.m0;
                            d6Var4.v = new a6(Bitmap.createBitmap((int) (iArr5[0] * f11), (int) (iArr5[1] * f11), Bitmap.Config.ARGB_8888));
                        }
                    }
                }
                if (d6Var4.L >= 0) {
                    d6Var4.d[3] = (int) d6Var4.L;
                    long j3 = d6Var4.L;
                    synchronized (d6Var4.Q) {
                        d6Var4.L = -1L;
                    }
                    AnimatedFileDrawableStream animatedFileDrawableStream = d6Var4.f23539u0;
                    if (animatedFileDrawableStream != null) {
                        animatedFileDrawableStream.reset();
                    }
                    d6Var4.f23519d0.g(j3, true);
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (d6Var4.v != null) {
                    System.currentTimeMillis();
                    if (d6Var4.f23519d0.c(d6Var4.v.f22543b, false, d6Var4.f23523g0, d6Var4.f23524h0, d6Var4.f23527k0) == 0) {
                        AndroidUtilities.runOnUIThread(d6Var4.B0);
                        return;
                    }
                    if (!d6Var4.f23521f) {
                        if (d6Var4.f23519d0.f21942a[7] == 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        d6Var4.f23521f = z11;
                    }
                    int i15 = d6Var4.d[3];
                    if (i15 < d6Var4.f23517c) {
                        d6Var4.P = true;
                    }
                    if (z10) {
                        d6Var4.f23517c = i15;
                    }
                    a6 a6Var3 = d6Var4.v;
                    a6Var3.e = i15;
                    if (d6Var4.f23519d0.f21942a[6] == 1) {
                        z14 = true;
                    }
                    a6Var3.f22545f = z14;
                }
                AndroidUtilities.runOnUIThread(d6Var4.F0);
                return;
            case 6:
                d6 d6Var5 = this.f22900b;
                pe.b bVar = d6Var5.f23537s0;
                Iterator it2 = bVar.iterator();
                while (it2.hasNext()) {
                    ((View) it2.next()).invalidate();
                }
                WeakReference weakReference = d6Var5.f23535r0;
                if (weakReference != null) {
                    view = (View) weakReference.get();
                } else {
                    view = null;
                }
                if ((bVar.isEmpty() || d6Var5.R) && view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 7:
                d6 d6Var6 = this.f22900b;
                d6Var6.f23547z0.b();
                AndroidUtilities.runOnUIThread(new b6(d6Var6, 8));
                return;
            default:
                d6 d6Var7 = this.f22900b;
                if (d6Var7.D0 != null) {
                    yf.e.c();
                    d6Var7.D0 = null;
                }
                d6Var7.C0 = false;
                d6Var7.k();
                d6Var7.x(false);
                return;
        }
    }
}
