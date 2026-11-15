package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import org.telegram.messenger.AnimatedFileDrawableStream;
public final class r5 implements Runnable {
    public final int f38885a;
    public final t5 f38886b;

    public r5(t5 t5Var, int i7) {
        this.f38885a = i7;
        this.f38886b = t5Var;
    }

    @Override
    public final void run() {
        int i7;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        View view;
        switch (this.f38885a) {
            case 0:
                this.f38886b.i();
                return;
            case 1:
                t5 t5Var = this.f38886b;
                if (t5Var.E0 != null) {
                    bg.i.c();
                    t5Var.E0 = null;
                }
                t5Var.D0 = false;
                t5Var.k();
                t5Var.x(false);
                return;
            case 2:
                this.f38886b.t();
                return;
            case 3:
                bg.i iVar = this.f38886b.A0;
                return;
            case 4:
                t5 t5Var2 = this.f38886b;
                t5Var2.k();
                t5Var2.f39515e = null;
                if (t5Var2.N >= 0 && t5Var2.M == -1) {
                    t5Var2.N = -1L;
                }
                t5Var2.x(false);
                t5Var2.t();
                return;
            case 5:
                t5 t5Var3 = this.f38886b;
                if (!t5Var3.f39514d0 && !t5Var3.f39539x && !t5Var3.D0 && t5Var3.E0 == null) {
                    t5Var3.f39520h0 = (float) System.currentTimeMillis();
                    if (ch0.U0 == null) {
                        ch0.U0 = new org.telegram.messenger.q5("cache generator queue", true);
                    }
                    t5Var3.D0 = true;
                    t5Var3.f39515e = null;
                    bg.i.A++;
                    org.telegram.messenger.q5 q5Var = ch0.U0;
                    r5 r5Var = new r5(t5Var3, 9);
                    t5Var3.E0 = r5Var;
                    q5Var.postRunnable(r5Var);
                    return;
                }
                return;
            case 6:
                t5 t5Var4 = this.f38886b;
                t5Var4.k();
                if (t5Var4.f39536v0 != null && t5Var4.O) {
                    org.telegram.messenger.w7.G(t5Var4.K).Z(t5Var4.f39536v0.f22235c, false, false);
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
                t5Var4.f39515e = null;
                if (t5Var4.N >= 0) {
                    t5Var4.f39530r = t5Var4.f39537w;
                    t5Var4.f39532s = null;
                } else if (!t5Var4.f39510b) {
                    t5Var4.f39530r = t5Var4.f39537w;
                } else {
                    q5 q5Var2 = t5Var4.f39530r;
                    if (q5Var2 == null && t5Var4.f39532s == null) {
                        t5Var4.f39530r = t5Var4.f39537w;
                    } else if (q5Var2 == null) {
                        t5Var4.f39530r = t5Var4.f39532s;
                        t5Var4.f39532s = t5Var4.f39537w;
                    } else {
                        t5Var4.f39532s = t5Var4.f39537w;
                    }
                }
                t5Var4.f39537w = null;
                if (t5Var4.Q) {
                    t5Var4.Q = false;
                    t5Var4.f39543z0++;
                    t5Var4.j();
                }
                if (t5Var4.d[3] < t5Var4.f39512c) {
                    float f10 = t5Var4.f39520h0;
                    if (f10 > 0.0f) {
                        i7 = (int) (f10 * 1000.0f);
                    } else {
                        i7 = 0;
                    }
                    t5Var4.f39512c = i7;
                }
                if (t5Var4.N >= 0 && t5Var4.M == -1) {
                    t5Var4.N = -1L;
                }
                t5Var4.f39512c = t5Var4.d[3];
                Iterator it = t5Var4.f39534t0.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                if ((!t5Var4.f39513c0 && t5Var4.E) || (t5Var4.f39525n == null && t5Var4.f39530r != null)) {
                    t5Var4.t();
                }
                t5Var4.x(false);
                return;
            case 7:
                t5 t5Var5 = this.f38886b;
                if (t5Var5.f39514d0) {
                    org.telegram.messenger.g0.h3(t5Var5.G0);
                    return;
                }
                boolean z14 = false;
                if (!t5Var5.f39541y && t5Var5.f39516e0 == null) {
                    t5Var5.f39516e0 = AnimatedFileNative.a(t5Var5.H.getAbsolutePath(), t5Var5.d, t5Var5.K, t5Var5.I, t5Var5.f39536v0, false);
                    if (t5Var5.f39516e0 == null && (!t5Var5.f39527o0 || t5Var5.H0 > 15)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    t5Var5.f39518f0 = z12;
                    if (t5Var5.f39516e0 != null) {
                        int[] iArr = t5Var5.d;
                        if (iArr[0] > 3840 || iArr[1] > 3840) {
                            t5Var5.f39516e0.f();
                            t5Var5.f39516e0 = null;
                        }
                    }
                    t5Var5.d();
                    t5Var5.E();
                    if (t5Var5.f39527o0 && t5Var5.f39516e0 == null) {
                        int i11 = t5Var5.H0;
                        t5Var5.H0 = i11 + 1;
                        if (i11 <= 15) {
                            z13 = false;
                            t5Var5.f39541y = z13;
                            org.telegram.messenger.g0.h3(new r5(t5Var5, 0));
                        }
                    }
                    z13 = true;
                    t5Var5.f39541y = z13;
                    org.telegram.messenger.g0.h3(new r5(t5Var5, 0));
                }
                try {
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                }
                if (t5Var5.A0 != null) {
                    if (t5Var5.f39537w == null) {
                        if (!t5Var5.h.isEmpty()) {
                            t5Var5.f39537w = (q5) t5Var5.h.remove(0);
                        } else {
                            t5Var5.f39537w = new q5(Bitmap.createBitmap(t5Var5.f39523k0, t5Var5.f39522j0, Bitmap.Config.ARGB_8888));
                        }
                    }
                    if (t5Var5.B0 == null) {
                        t5Var5.B0 = new Object();
                    }
                    System.currentTimeMillis();
                    b7.l lVar = t5Var5.B0;
                    int i12 = lVar.f2963a;
                    bg.i iVar2 = t5Var5.A0;
                    int f11 = iVar2.f(iVar2.f3261i, t5Var5.f39537w.f38521b);
                    lVar.f2963a = iVar2.f3261i;
                    if (iVar2.f3269q && !iVar2.f3258e.isEmpty()) {
                        int i13 = iVar2.f3261i + 1;
                        iVar2.f3261i = i13;
                        if (i13 >= iVar2.f3258e.size()) {
                            iVar2.f3261i = 0;
                        }
                    }
                    if (f11 != -1 && t5Var5.B0.f2963a < i12) {
                        t5Var5.Q = true;
                    }
                    int[] iArr2 = t5Var5.d;
                    q5 q5Var3 = t5Var5.f39537w;
                    int max = t5Var5.B0.f2963a * Math.max(16, iArr2[4] / Math.max(1, t5Var5.A0.f3258e.size()));
                    q5Var3.f38523e = max;
                    iArr2[3] = max;
                    t5Var5.f39537w.f38524f = false;
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
                if (t5Var5.f39516e0 == null) {
                    int[] iArr3 = t5Var5.d;
                    if (iArr3[0] != 0 && iArr3[1] != 0) {
                        org.telegram.messenger.g0.h3(t5Var5.C0);
                        return;
                    }
                }
                if (t5Var5.f39537w == null) {
                    int[] iArr4 = t5Var5.d;
                    if (iArr4[0] > 0 && iArr4[1] > 0) {
                        if (!t5Var5.h.isEmpty()) {
                            t5Var5.f39537w = (q5) t5Var5.h.remove(0);
                        } else {
                            int[] iArr5 = t5Var5.d;
                            float f12 = t5Var5.f39526n0;
                            t5Var5.f39537w = new q5(Bitmap.createBitmap((int) (iArr5[0] * f12), (int) (iArr5[1] * f12), Bitmap.Config.ARGB_8888));
                        }
                    }
                }
                if (t5Var5.M >= 0) {
                    t5Var5.d[3] = (int) t5Var5.M;
                    long j3 = t5Var5.M;
                    synchronized (t5Var5.R) {
                        t5Var5.M = -1L;
                    }
                    AnimatedFileDrawableStream animatedFileDrawableStream = t5Var5.f39536v0;
                    if (animatedFileDrawableStream != null) {
                        animatedFileDrawableStream.d();
                    }
                    t5Var5.f39516e0.g(j3, true);
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (t5Var5.f39537w != null) {
                    System.currentTimeMillis();
                    if (t5Var5.f39516e0.c(t5Var5.f39537w.f38521b, false, t5Var5.f39520h0, t5Var5.f39521i0, t5Var5.f39524l0) == 0) {
                        org.telegram.messenger.g0.h3(t5Var5.C0);
                        return;
                    }
                    if (!t5Var5.f39517f) {
                        if (t5Var5.f39516e0.f32149a[7] == 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        t5Var5.f39517f = z11;
                    }
                    int i14 = t5Var5.d[3];
                    if (i14 < t5Var5.f39512c) {
                        t5Var5.Q = true;
                    }
                    if (z10) {
                        t5Var5.f39512c = i14;
                    }
                    q5 q5Var4 = t5Var5.f39537w;
                    q5Var4.f38523e = i14;
                    if (t5Var5.f39516e0.f32149a[6] == 1) {
                        z14 = true;
                    }
                    q5Var4.f38524f = z14;
                }
                org.telegram.messenger.g0.h3(t5Var5.G0);
                return;
            case 8:
                t5 t5Var6 = this.f38886b;
                xe.b bVar = t5Var6.f39534t0;
                Iterator it2 = bVar.iterator();
                while (it2.hasNext()) {
                    ((View) it2.next()).invalidate();
                }
                WeakReference weakReference = t5Var6.f39533s0;
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
                t5 t5Var7 = this.f38886b;
                t5Var7.A0.b();
                org.telegram.messenger.g0.h3(new r5(t5Var7, 1));
                return;
        }
    }
}
