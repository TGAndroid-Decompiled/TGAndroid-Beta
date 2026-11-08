package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import org.telegram.messenger.AnimatedFileDrawableStream;
public final class t5 implements Runnable {
    public final int f38241a;
    public final v5 f38242b;

    public t5(v5 v5Var, int i7) {
        this.f38241a = i7;
        this.f38242b = v5Var;
    }

    @Override
    public final void run() {
        int i7;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        View view;
        switch (this.f38241a) {
            case 0:
                this.f38242b.i();
                return;
            case 1:
                v5 v5Var = this.f38242b;
                if (v5Var.D0 != null) {
                    bg.i.c();
                    v5Var.D0 = null;
                }
                v5Var.C0 = false;
                v5Var.k();
                v5Var.x(false);
                return;
            case 2:
                this.f38242b.t();
                return;
            case 3:
                bg.i iVar = this.f38242b.f38892z0;
                return;
            case 4:
                v5 v5Var2 = this.f38242b;
                v5Var2.k();
                v5Var2.f38864e = null;
                if (v5Var2.M >= 0 && v5Var2.L == -1) {
                    v5Var2.M = -1L;
                }
                v5Var2.x(false);
                v5Var2.t();
                return;
            case 5:
                v5 v5Var3 = this.f38242b;
                if (!v5Var3.f38862c0 && !v5Var3.f38888x && !v5Var3.C0 && v5Var3.D0 == null) {
                    v5Var3.f38868g0 = (float) System.currentTimeMillis();
                    if (zg0.T0 == null) {
                        zg0.T0 = new org.telegram.messenger.q5("cache generator queue", true);
                    }
                    v5Var3.C0 = true;
                    v5Var3.f38864e = null;
                    bg.i.A++;
                    org.telegram.messenger.q5 q5Var = zg0.T0;
                    t5 t5Var = new t5(v5Var3, 9);
                    v5Var3.D0 = t5Var;
                    q5Var.postRunnable(t5Var);
                    return;
                }
                return;
            case 6:
                v5 v5Var4 = this.f38242b;
                v5Var4.k();
                if (v5Var4.f38884u0 != null && v5Var4.N) {
                    org.telegram.messenger.w7.G(v5Var4.J).Z(v5Var4.f38884u0.f21156c, false, false);
                }
                int i10 = v5Var4.O;
                if (i10 <= 0) {
                    v5Var4.N = true;
                } else {
                    v5Var4.O = i10 - 1;
                }
                if (!v5Var4.F) {
                    v5Var4.E = true;
                } else {
                    v5Var4.F = false;
                }
                v5Var4.f38864e = null;
                if (v5Var4.M >= 0) {
                    v5Var4.f38879r = v5Var4.f38886w;
                    v5Var4.f38881s = null;
                } else if (!v5Var4.f38859b) {
                    v5Var4.f38879r = v5Var4.f38886w;
                } else {
                    s5 s5Var = v5Var4.f38879r;
                    if (s5Var == null && v5Var4.f38881s == null) {
                        v5Var4.f38879r = v5Var4.f38886w;
                    } else if (s5Var == null) {
                        v5Var4.f38879r = v5Var4.f38881s;
                        v5Var4.f38881s = v5Var4.f38886w;
                    } else {
                        v5Var4.f38881s = v5Var4.f38886w;
                    }
                }
                v5Var4.f38886w = null;
                if (v5Var4.P) {
                    v5Var4.P = false;
                    v5Var4.f38891y0++;
                    v5Var4.j();
                }
                if (v5Var4.d[3] < v5Var4.f38861c) {
                    float f10 = v5Var4.f38868g0;
                    if (f10 > 0.0f) {
                        i7 = (int) (f10 * 1000.0f);
                    } else {
                        i7 = 0;
                    }
                    v5Var4.f38861c = i7;
                }
                if (v5Var4.M >= 0 && v5Var4.L == -1) {
                    v5Var4.M = -1L;
                }
                v5Var4.f38861c = v5Var4.d[3];
                Iterator it = v5Var4.f38882s0.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                if ((!v5Var4.f38860b0 && v5Var4.D) || (v5Var4.f38874n == null && v5Var4.f38879r != null)) {
                    v5Var4.t();
                }
                v5Var4.x(false);
                return;
            case 7:
                v5 v5Var5 = this.f38242b;
                if (v5Var5.f38862c0) {
                    org.telegram.messenger.g0.h3(v5Var5.F0);
                    return;
                }
                boolean z13 = false;
                if (!v5Var5.f38890y && v5Var5.f38863d0 == null) {
                    v5Var5.f38863d0 = AnimatedFileNative.a(v5Var5.G.getAbsolutePath(), v5Var5.d, v5Var5.J, v5Var5.H, v5Var5.f38884u0, false);
                    if (v5Var5.f38863d0 == null && (!v5Var5.f38875n0 || v5Var5.G0 > 15)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    v5Var5.f38865e0 = z11;
                    if (v5Var5.f38863d0 != null) {
                        int[] iArr = v5Var5.d;
                        if (iArr[0] > 3840 || iArr[1] > 3840) {
                            v5Var5.f38863d0.f();
                            v5Var5.f38863d0 = null;
                        }
                    }
                    v5Var5.d();
                    v5Var5.E();
                    if (v5Var5.f38875n0 && v5Var5.f38863d0 == null) {
                        int i11 = v5Var5.G0;
                        v5Var5.G0 = i11 + 1;
                        if (i11 <= 15) {
                            z12 = false;
                            v5Var5.f38890y = z12;
                            org.telegram.messenger.g0.h3(new t5(v5Var5, 0));
                        }
                    }
                    z12 = true;
                    v5Var5.f38890y = z12;
                    org.telegram.messenger.g0.h3(new t5(v5Var5, 0));
                }
                try {
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                }
                if (v5Var5.f38892z0 != null) {
                    if (v5Var5.f38886w == null) {
                        if (!v5Var5.h.isEmpty()) {
                            v5Var5.f38886w = (s5) v5Var5.h.remove(0);
                        } else {
                            v5Var5.f38886w = new s5(Bitmap.createBitmap(v5Var5.f38871j0, v5Var5.f38870i0, Bitmap.Config.ARGB_8888));
                        }
                    }
                    if (v5Var5.A0 == null) {
                        v5Var5.A0 = new Object();
                    }
                    System.currentTimeMillis();
                    b7.l lVar = v5Var5.A0;
                    int i12 = lVar.f3009a;
                    bg.i iVar2 = v5Var5.f38892z0;
                    int f11 = iVar2.f(iVar2.f3306i, v5Var5.f38886w.f37922b);
                    lVar.f3009a = iVar2.f3306i;
                    if (iVar2.f3314q && !iVar2.f3303e.isEmpty()) {
                        int i13 = iVar2.f3306i + 1;
                        iVar2.f3306i = i13;
                        if (i13 >= iVar2.f3303e.size()) {
                            iVar2.f3306i = 0;
                        }
                    }
                    if (f11 != -1 && v5Var5.A0.f3009a < i12) {
                        v5Var5.P = true;
                    }
                    int[] iArr2 = v5Var5.d;
                    s5 s5Var2 = v5Var5.f38886w;
                    int max = v5Var5.A0.f3009a * Math.max(16, iArr2[4] / Math.max(1, v5Var5.f38892z0.f3303e.size()));
                    s5Var2.f37924e = max;
                    iArr2[3] = max;
                    v5Var5.f38886w.f37925f = false;
                    if (v5Var5.f38892z0.g()) {
                        org.telegram.messenger.g0.h3(v5Var5.E0);
                    }
                    if (f11 == -1) {
                        org.telegram.messenger.g0.h3(v5Var5.B0);
                        return;
                    } else {
                        org.telegram.messenger.g0.h3(v5Var5.F0);
                        return;
                    }
                }
                if (v5Var5.f38863d0 == null) {
                    int[] iArr3 = v5Var5.d;
                    if (iArr3[0] != 0 && iArr3[1] != 0) {
                        org.telegram.messenger.g0.h3(v5Var5.B0);
                        return;
                    }
                }
                if (v5Var5.f38886w == null) {
                    int[] iArr4 = v5Var5.d;
                    if (iArr4[0] > 0 && iArr4[1] > 0) {
                        if (!v5Var5.h.isEmpty()) {
                            v5Var5.f38886w = (s5) v5Var5.h.remove(0);
                        } else {
                            int[] iArr5 = v5Var5.d;
                            float f12 = v5Var5.m0;
                            v5Var5.f38886w = new s5(Bitmap.createBitmap((int) (iArr5[0] * f12), (int) (iArr5[1] * f12), Bitmap.Config.ARGB_8888));
                        }
                    }
                }
                if (v5Var5.L >= 0) {
                    v5Var5.d[3] = (int) v5Var5.L;
                    long j3 = v5Var5.L;
                    synchronized (v5Var5.Q) {
                        v5Var5.L = -1L;
                    }
                    AnimatedFileDrawableStream animatedFileDrawableStream = v5Var5.f38884u0;
                    if (animatedFileDrawableStream != null) {
                        animatedFileDrawableStream.d();
                    }
                    v5Var5.f38863d0.g(j3, true);
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (v5Var5.f38886w != null) {
                    System.currentTimeMillis();
                    if (v5Var5.f38863d0.c(v5Var5.f38886w.f37922b, false, v5Var5.f38868g0, v5Var5.f38869h0, v5Var5.f38872k0) == 0) {
                        org.telegram.messenger.g0.h3(v5Var5.B0);
                        return;
                    }
                    if (!v5Var5.f38866f) {
                        if (v5Var5.f38863d0.f31010a[7] == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        v5Var5.f38866f = z10;
                    }
                    int i14 = v5Var5.d[3];
                    if (i14 < v5Var5.f38861c) {
                        v5Var5.P = true;
                    }
                    if (z9) {
                        v5Var5.f38861c = i14;
                    }
                    s5 s5Var3 = v5Var5.f38886w;
                    s5Var3.f37924e = i14;
                    if (v5Var5.f38863d0.f31010a[6] == 1) {
                        z13 = true;
                    }
                    s5Var3.f37925f = z13;
                }
                org.telegram.messenger.g0.h3(v5Var5.F0);
                return;
            case 8:
                v5 v5Var6 = this.f38242b;
                xe.b bVar = v5Var6.f38882s0;
                Iterator it2 = bVar.iterator();
                while (it2.hasNext()) {
                    ((View) it2.next()).invalidate();
                }
                WeakReference weakReference = v5Var6.f38880r0;
                if (weakReference != null) {
                    view = (View) weakReference.get();
                } else {
                    view = null;
                }
                if ((bVar.isEmpty() || v5Var6.R) && view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                v5 v5Var7 = this.f38242b;
                v5Var7.f38892z0.b();
                org.telegram.messenger.g0.h3(new t5(v5Var7, 1));
                return;
        }
    }
}
