package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import org.telegram.messenger.AnimatedFileDrawableStream;
public final class r5 implements Runnable {
    public final int f37652a;
    public final t5 f37653b;

    public r5(t5 t5Var, int i3) {
        this.f37652a = i3;
        this.f37653b = t5Var;
    }

    @Override
    public final void run() {
        int i3;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        View view;
        switch (this.f37652a) {
            case 0:
                this.f37653b.i();
                return;
            case 1:
                t5 t5Var = this.f37653b;
                if (t5Var.E0 != null) {
                    cg.h.c();
                    t5Var.E0 = null;
                }
                t5Var.D0 = false;
                t5Var.k();
                t5Var.x(false);
                return;
            case 2:
                this.f37653b.t();
                return;
            case 3:
                cg.h hVar = this.f37653b.A0;
                return;
            case 4:
                t5 t5Var2 = this.f37653b;
                t5Var2.k();
                t5Var2.f38259e = null;
                if (t5Var2.N >= 0 && t5Var2.M == -1) {
                    t5Var2.N = -1L;
                }
                t5Var2.x(false);
                t5Var2.t();
                return;
            case 5:
                t5 t5Var3 = this.f37653b;
                if (!t5Var3.f38258d0 && !t5Var3.f38283x && !t5Var3.D0 && t5Var3.E0 == null) {
                    t5Var3.f38264h0 = (float) System.currentTimeMillis();
                    if (ch0.U0 == null) {
                        ch0.U0 = new org.telegram.messenger.q5("cache generator queue", true);
                    }
                    t5Var3.D0 = true;
                    t5Var3.f38259e = null;
                    cg.h.A++;
                    org.telegram.messenger.q5 q5Var = ch0.U0;
                    r5 r5Var = new r5(t5Var3, 9);
                    t5Var3.E0 = r5Var;
                    q5Var.postRunnable(r5Var);
                    return;
                }
                return;
            case 6:
                t5 t5Var4 = this.f37653b;
                t5Var4.k();
                if (t5Var4.f38280v0 != null && t5Var4.O) {
                    org.telegram.messenger.w7.G(t5Var4.K).a0(t5Var4.f38280v0.f21206c, false, false);
                }
                int i10 = t5Var4.P;
                if (i10 <= 0) {
                    t5Var4.O = true;
                } else {
                    t5Var4.P = i10 - 1;
                }
                if (!t5Var4.G) {
                    t5Var4.F = true;
                } else {
                    t5Var4.G = false;
                }
                t5Var4.f38259e = null;
                if (t5Var4.N >= 0) {
                    t5Var4.f38274r = t5Var4.f38281w;
                    t5Var4.f38276s = null;
                } else if (!t5Var4.f38254b) {
                    t5Var4.f38274r = t5Var4.f38281w;
                } else {
                    q5 q5Var2 = t5Var4.f38274r;
                    if (q5Var2 == null && t5Var4.f38276s == null) {
                        t5Var4.f38274r = t5Var4.f38281w;
                    } else if (q5Var2 == null) {
                        t5Var4.f38274r = t5Var4.f38276s;
                        t5Var4.f38276s = t5Var4.f38281w;
                    } else {
                        t5Var4.f38276s = t5Var4.f38281w;
                    }
                }
                t5Var4.f38281w = null;
                if (t5Var4.Q) {
                    t5Var4.Q = false;
                    t5Var4.f38287z0++;
                    t5Var4.j();
                }
                if (t5Var4.d[3] < t5Var4.f38256c) {
                    float f10 = t5Var4.f38264h0;
                    if (f10 > 0.0f) {
                        i3 = (int) (f10 * 1000.0f);
                    } else {
                        i3 = 0;
                    }
                    t5Var4.f38256c = i3;
                }
                if (t5Var4.N >= 0 && t5Var4.M == -1) {
                    t5Var4.N = -1L;
                }
                t5Var4.f38256c = t5Var4.d[3];
                Iterator it = t5Var4.f38278t0.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                if ((!t5Var4.f38257c0 && t5Var4.E) || (t5Var4.f38269n == null && t5Var4.f38274r != null)) {
                    t5Var4.t();
                }
                t5Var4.x(false);
                return;
            case 7:
                t5 t5Var5 = this.f37653b;
                if (t5Var5.f38258d0) {
                    org.telegram.messenger.g0.h3(t5Var5.G0);
                    return;
                }
                boolean z14 = false;
                if (!t5Var5.f38285y && t5Var5.f38260e0 == null) {
                    t5Var5.f38260e0 = AnimatedFileNative.a(t5Var5.H.getAbsolutePath(), t5Var5.d, t5Var5.K, t5Var5.I, t5Var5.f38280v0, false);
                    if (t5Var5.f38260e0 == null && (!t5Var5.f38271o0 || t5Var5.H0 > 15)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    t5Var5.f38262f0 = z12;
                    if (t5Var5.f38260e0 != null) {
                        int[] iArr = t5Var5.d;
                        if (iArr[0] > 3840 || iArr[1] > 3840) {
                            t5Var5.f38260e0.f();
                            t5Var5.f38260e0 = null;
                        }
                    }
                    t5Var5.d();
                    t5Var5.E();
                    if (t5Var5.f38271o0 && t5Var5.f38260e0 == null) {
                        int i11 = t5Var5.H0;
                        t5Var5.H0 = i11 + 1;
                        if (i11 <= 15) {
                            z13 = false;
                            t5Var5.f38285y = z13;
                            org.telegram.messenger.g0.h3(new r5(t5Var5, 0));
                        }
                    }
                    z13 = true;
                    t5Var5.f38285y = z13;
                    org.telegram.messenger.g0.h3(new r5(t5Var5, 0));
                }
                try {
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                }
                if (t5Var5.A0 != null) {
                    if (t5Var5.f38281w == null) {
                        if (!t5Var5.h.isEmpty()) {
                            t5Var5.f38281w = (q5) t5Var5.h.remove(0);
                        } else {
                            t5Var5.f38281w = new q5(Bitmap.createBitmap(t5Var5.f38267k0, t5Var5.f38266j0, Bitmap.Config.ARGB_8888));
                        }
                    }
                    if (t5Var5.B0 == null) {
                        t5Var5.B0 = new Object();
                    }
                    System.currentTimeMillis();
                    a7.l lVar = t5Var5.B0;
                    int i12 = lVar.f156a;
                    cg.h hVar2 = t5Var5.A0;
                    int f11 = hVar2.f(t5Var5.f38281w.f37346b, hVar2.f4671i);
                    lVar.f156a = hVar2.f4671i;
                    if (hVar2.f4679q && !hVar2.f4668e.isEmpty()) {
                        int i13 = hVar2.f4671i + 1;
                        hVar2.f4671i = i13;
                        if (i13 >= hVar2.f4668e.size()) {
                            hVar2.f4671i = 0;
                        }
                    }
                    if (f11 != -1 && t5Var5.B0.f156a < i12) {
                        t5Var5.Q = true;
                    }
                    int[] iArr2 = t5Var5.d;
                    q5 q5Var3 = t5Var5.f38281w;
                    int max = t5Var5.B0.f156a * Math.max(16, iArr2[4] / Math.max(1, t5Var5.A0.f4668e.size()));
                    q5Var3.f37348e = max;
                    iArr2[3] = max;
                    t5Var5.f38281w.f37349f = false;
                    if (t5Var5.A0.g()) {
                        org.telegram.messenger.g0.h3(t5Var5.F0);
                    }
                    if (f11 == -1) {
                        org.telegram.messenger.g0.h3(t5Var5.C0);
                        return;
                    } else {
                        org.telegram.messenger.g0.h3(t5Var5.G0);
                        return;
                    }
                }
                if (t5Var5.f38260e0 == null) {
                    int[] iArr3 = t5Var5.d;
                    if (iArr3[0] != 0 && iArr3[1] != 0) {
                        org.telegram.messenger.g0.h3(t5Var5.C0);
                        return;
                    }
                }
                if (t5Var5.f38281w == null) {
                    int[] iArr4 = t5Var5.d;
                    if (iArr4[0] > 0 && iArr4[1] > 0) {
                        if (!t5Var5.h.isEmpty()) {
                            t5Var5.f38281w = (q5) t5Var5.h.remove(0);
                        } else {
                            int[] iArr5 = t5Var5.d;
                            float f12 = t5Var5.f38270n0;
                            t5Var5.f38281w = new q5(Bitmap.createBitmap((int) (iArr5[0] * f12), (int) (iArr5[1] * f12), Bitmap.Config.ARGB_8888));
                        }
                    }
                }
                if (t5Var5.M >= 0) {
                    t5Var5.d[3] = (int) t5Var5.M;
                    long j10 = t5Var5.M;
                    synchronized (t5Var5.R) {
                        t5Var5.M = -1L;
                    }
                    AnimatedFileDrawableStream animatedFileDrawableStream = t5Var5.f38280v0;
                    if (animatedFileDrawableStream != null) {
                        animatedFileDrawableStream.d();
                    }
                    t5Var5.f38260e0.g(j10, true);
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (t5Var5.f38281w != null) {
                    System.currentTimeMillis();
                    if (t5Var5.f38260e0.c(t5Var5.f38281w.f37346b, false, t5Var5.f38264h0, t5Var5.f38265i0, t5Var5.f38268l0) == 0) {
                        org.telegram.messenger.g0.h3(t5Var5.C0);
                        return;
                    }
                    if (!t5Var5.f38261f) {
                        if (t5Var5.f38260e0.f31079a[7] == 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        t5Var5.f38261f = z11;
                    }
                    int i14 = t5Var5.d[3];
                    if (i14 < t5Var5.f38256c) {
                        t5Var5.Q = true;
                    }
                    if (z10) {
                        t5Var5.f38256c = i14;
                    }
                    q5 q5Var4 = t5Var5.f38281w;
                    q5Var4.f37348e = i14;
                    if (t5Var5.f38260e0.f31079a[6] == 1) {
                        z14 = true;
                    }
                    q5Var4.f37349f = z14;
                }
                org.telegram.messenger.g0.h3(t5Var5.G0);
                return;
            case 8:
                t5 t5Var6 = this.f37653b;
                ue.b bVar = t5Var6.f38278t0;
                Iterator it2 = bVar.iterator();
                while (it2.hasNext()) {
                    ((View) it2.next()).invalidate();
                }
                WeakReference weakReference = t5Var6.f38277s0;
                if (weakReference != null) {
                    view = (View) weakReference.get();
                } else {
                    view = null;
                }
                if ((bVar.isEmpty() || t5Var6.S) && view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                t5 t5Var7 = this.f37653b;
                t5Var7.A0.b();
                org.telegram.messenger.g0.h3(new r5(t5Var7, 1));
                return;
        }
    }
}
