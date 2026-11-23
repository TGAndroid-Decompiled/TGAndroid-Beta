package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import org.telegram.messenger.AnimatedFileDrawableStream;
public final class a6 implements Runnable {
    public final int f33323a;
    public final c6 f33324b;

    public a6(c6 c6Var, int i7) {
        this.f33323a = i7;
        this.f33324b = c6Var;
    }

    @Override
    public final void run() {
        int i7;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        View view;
        switch (this.f33323a) {
            case 0:
                this.f33324b.i();
                return;
            case 1:
                c6 c6Var = this.f33324b;
                if (c6Var.E0 != null) {
                    bg.i.c();
                    c6Var.E0 = null;
                }
                c6Var.D0 = false;
                c6Var.k();
                c6Var.x(false);
                return;
            case 2:
                this.f33324b.t();
                return;
            case 3:
                bg.i iVar = this.f33324b.A0;
                return;
            case 4:
                c6 c6Var2 = this.f33324b;
                c6Var2.k();
                c6Var2.f34074e = null;
                if (c6Var2.N >= 0 && c6Var2.M == -1) {
                    c6Var2.N = -1L;
                }
                c6Var2.x(false);
                c6Var2.t();
                return;
            case 5:
                c6 c6Var3 = this.f33324b;
                if (!c6Var3.f34073d0 && !c6Var3.f34098x && !c6Var3.D0 && c6Var3.E0 == null) {
                    c6Var3.f34079h0 = (float) System.currentTimeMillis();
                    if (oh0.U0 == null) {
                        oh0.U0 = new org.telegram.messenger.r5("cache generator queue", true);
                    }
                    c6Var3.D0 = true;
                    c6Var3.f34074e = null;
                    bg.i.A++;
                    org.telegram.messenger.r5 r5Var = oh0.U0;
                    a6 a6Var = new a6(c6Var3, 9);
                    c6Var3.E0 = a6Var;
                    r5Var.postRunnable(a6Var);
                    return;
                }
                return;
            case 6:
                c6 c6Var4 = this.f33324b;
                c6Var4.k();
                if (c6Var4.f34095v0 != null && c6Var4.O) {
                    org.telegram.messenger.w7.G(c6Var4.K).Z(c6Var4.f34095v0.f22629c, false, false);
                }
                int i10 = c6Var4.P;
                if (i10 <= 0) {
                    c6Var4.O = true;
                } else {
                    c6Var4.P = i10 - 1;
                }
                if (!c6Var4.G) {
                    c6Var4.F = true;
                } else {
                    c6Var4.G = false;
                }
                c6Var4.f34074e = null;
                if (c6Var4.N >= 0) {
                    c6Var4.f34089r = c6Var4.f34096w;
                    c6Var4.f34091s = null;
                } else if (!c6Var4.f34069b) {
                    c6Var4.f34089r = c6Var4.f34096w;
                } else {
                    z5 z5Var = c6Var4.f34089r;
                    if (z5Var == null && c6Var4.f34091s == null) {
                        c6Var4.f34089r = c6Var4.f34096w;
                    } else if (z5Var == null) {
                        c6Var4.f34089r = c6Var4.f34091s;
                        c6Var4.f34091s = c6Var4.f34096w;
                    } else {
                        c6Var4.f34091s = c6Var4.f34096w;
                    }
                }
                c6Var4.f34096w = null;
                if (c6Var4.Q) {
                    c6Var4.Q = false;
                    c6Var4.f34102z0++;
                    c6Var4.j();
                }
                if (c6Var4.d[3] < c6Var4.f34071c) {
                    float f10 = c6Var4.f34079h0;
                    if (f10 > 0.0f) {
                        i7 = (int) (f10 * 1000.0f);
                    } else {
                        i7 = 0;
                    }
                    c6Var4.f34071c = i7;
                }
                if (c6Var4.N >= 0 && c6Var4.M == -1) {
                    c6Var4.N = -1L;
                }
                c6Var4.f34071c = c6Var4.d[3];
                Iterator it = c6Var4.f34093t0.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                if ((!c6Var4.f34072c0 && c6Var4.E) || (c6Var4.f34084n == null && c6Var4.f34089r != null)) {
                    c6Var4.t();
                }
                c6Var4.x(false);
                return;
            case 7:
                c6 c6Var5 = this.f33324b;
                if (c6Var5.f34073d0) {
                    org.telegram.messenger.g0.g3(c6Var5.G0);
                    return;
                }
                boolean z14 = false;
                if (!c6Var5.f34100y && c6Var5.f34075e0 == null) {
                    c6Var5.f34075e0 = AnimatedFileNative.a(c6Var5.H.getAbsolutePath(), c6Var5.d, c6Var5.K, c6Var5.I, c6Var5.f34095v0, false);
                    if (c6Var5.f34075e0 == null && (!c6Var5.f34086o0 || c6Var5.H0 > 15)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    c6Var5.f34077f0 = z12;
                    if (c6Var5.f34075e0 != null) {
                        int[] iArr = c6Var5.d;
                        if (iArr[0] > 3840 || iArr[1] > 3840) {
                            c6Var5.f34075e0.f();
                            c6Var5.f34075e0 = null;
                        }
                    }
                    c6Var5.d();
                    c6Var5.E();
                    if (c6Var5.f34086o0 && c6Var5.f34075e0 == null) {
                        int i11 = c6Var5.H0;
                        c6Var5.H0 = i11 + 1;
                        if (i11 <= 15) {
                            z13 = false;
                            c6Var5.f34100y = z13;
                            org.telegram.messenger.g0.g3(new a6(c6Var5, 0));
                        }
                    }
                    z13 = true;
                    c6Var5.f34100y = z13;
                    org.telegram.messenger.g0.g3(new a6(c6Var5, 0));
                }
                try {
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                }
                if (c6Var5.A0 != null) {
                    if (c6Var5.f34096w == null) {
                        if (!c6Var5.h.isEmpty()) {
                            c6Var5.f34096w = (z5) c6Var5.h.remove(0);
                        } else {
                            c6Var5.f34096w = new z5(Bitmap.createBitmap(c6Var5.f34082k0, c6Var5.f34081j0, Bitmap.Config.ARGB_8888));
                        }
                    }
                    if (c6Var5.B0 == null) {
                        c6Var5.B0 = new Object();
                    }
                    System.currentTimeMillis();
                    b7.l lVar = c6Var5.B0;
                    int i12 = lVar.f2980a;
                    bg.i iVar2 = c6Var5.A0;
                    int f11 = iVar2.f(iVar2.f3274i, c6Var5.f34096w.f42682b);
                    lVar.f2980a = iVar2.f3274i;
                    if (iVar2.f3282q && !iVar2.f3271e.isEmpty()) {
                        int i13 = iVar2.f3274i + 1;
                        iVar2.f3274i = i13;
                        if (i13 >= iVar2.f3271e.size()) {
                            iVar2.f3274i = 0;
                        }
                    }
                    if (f11 != -1 && c6Var5.B0.f2980a < i12) {
                        c6Var5.Q = true;
                    }
                    int[] iArr2 = c6Var5.d;
                    z5 z5Var2 = c6Var5.f34096w;
                    int max = c6Var5.B0.f2980a * Math.max(16, iArr2[4] / Math.max(1, c6Var5.A0.f3271e.size()));
                    z5Var2.f42684e = max;
                    iArr2[3] = max;
                    c6Var5.f34096w.f42685f = false;
                    if (c6Var5.A0.g()) {
                        org.telegram.messenger.g0.g3(c6Var5.F0);
                    }
                    if (f11 == -1) {
                        org.telegram.messenger.g0.g3(c6Var5.C0);
                        return;
                    } else {
                        org.telegram.messenger.g0.g3(c6Var5.G0);
                        return;
                    }
                }
                if (c6Var5.f34075e0 == null) {
                    int[] iArr3 = c6Var5.d;
                    if (iArr3[0] != 0 && iArr3[1] != 0) {
                        org.telegram.messenger.g0.g3(c6Var5.C0);
                        return;
                    }
                }
                if (c6Var5.f34096w == null) {
                    int[] iArr4 = c6Var5.d;
                    if (iArr4[0] > 0 && iArr4[1] > 0) {
                        if (!c6Var5.h.isEmpty()) {
                            c6Var5.f34096w = (z5) c6Var5.h.remove(0);
                        } else {
                            int[] iArr5 = c6Var5.d;
                            float f12 = c6Var5.f34085n0;
                            c6Var5.f34096w = new z5(Bitmap.createBitmap((int) (iArr5[0] * f12), (int) (iArr5[1] * f12), Bitmap.Config.ARGB_8888));
                        }
                    }
                }
                if (c6Var5.M >= 0) {
                    c6Var5.d[3] = (int) c6Var5.M;
                    long j3 = c6Var5.M;
                    synchronized (c6Var5.R) {
                        c6Var5.M = -1L;
                    }
                    AnimatedFileDrawableStream animatedFileDrawableStream = c6Var5.f34095v0;
                    if (animatedFileDrawableStream != null) {
                        animatedFileDrawableStream.d();
                    }
                    c6Var5.f34075e0.g(j3, true);
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c6Var5.f34096w != null) {
                    System.currentTimeMillis();
                    if (c6Var5.f34075e0.c(c6Var5.f34096w.f42682b, false, c6Var5.f34079h0, c6Var5.f34080i0, c6Var5.f34083l0) == 0) {
                        org.telegram.messenger.g0.g3(c6Var5.C0);
                        return;
                    }
                    if (!c6Var5.f34076f) {
                        if (c6Var5.f34075e0.f32565a[7] == 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        c6Var5.f34076f = z11;
                    }
                    int i14 = c6Var5.d[3];
                    if (i14 < c6Var5.f34071c) {
                        c6Var5.Q = true;
                    }
                    if (z10) {
                        c6Var5.f34071c = i14;
                    }
                    z5 z5Var3 = c6Var5.f34096w;
                    z5Var3.f42684e = i14;
                    if (c6Var5.f34075e0.f32565a[6] == 1) {
                        z14 = true;
                    }
                    z5Var3.f42685f = z14;
                }
                org.telegram.messenger.g0.g3(c6Var5.G0);
                return;
            case 8:
                c6 c6Var6 = this.f33324b;
                xe.b bVar = c6Var6.f34093t0;
                Iterator it2 = bVar.iterator();
                while (it2.hasNext()) {
                    ((View) it2.next()).invalidate();
                }
                WeakReference weakReference = c6Var6.f34092s0;
                if (weakReference != null) {
                    view = (View) weakReference.get();
                } else {
                    view = null;
                }
                if ((bVar.isEmpty() || c6Var6.S) && view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                c6 c6Var7 = this.f33324b;
                c6Var7.A0.b();
                org.telegram.messenger.g0.g3(new a6(c6Var7, 1));
                return;
        }
    }
}
