package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import org.telegram.messenger.AnimatedFileDrawableStream;
public final class q5 implements Runnable {
    public final int f29632a;
    public final s5 f29633b;

    public q5(s5 s5Var, int i10) {
        this.f29632a = i10;
        this.f29633b = s5Var;
    }

    @Override
    public final void run() {
        int i10;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        View view;
        switch (this.f29632a) {
            case 0:
                this.f29633b.i();
                return;
            case 1:
                s5 s5Var = this.f29633b;
                if (s5Var.D0 != null) {
                    rf.e.c();
                    s5Var.D0 = null;
                }
                s5Var.C0 = false;
                s5Var.k();
                s5Var.x(false);
                return;
            case 2:
                this.f29633b.t();
                return;
            case 3:
                rf.e eVar = this.f29633b.f30212z0;
                return;
            case 4:
                s5 s5Var2 = this.f29633b;
                s5Var2.k();
                s5Var2.e = null;
                if (s5Var2.M >= 0 && s5Var2.L == -1) {
                    s5Var2.M = -1L;
                }
                s5Var2.x(false);
                s5Var2.t();
                return;
            case 5:
                s5 s5Var3 = this.f29633b;
                if (!s5Var3.f30183c0 && !s5Var3.f30208x && !s5Var3.C0 && s5Var3.D0 == null) {
                    s5Var3.f30188g0 = (float) System.currentTimeMillis();
                    if (ci0.T0 == null) {
                        ci0.T0 = new org.telegram.messenger.s5("cache generator queue", true);
                    }
                    s5Var3.C0 = true;
                    s5Var3.e = null;
                    rf.e.A++;
                    org.telegram.messenger.s5 s5Var4 = ci0.T0;
                    q5 q5Var = new q5(s5Var3, 9);
                    s5Var3.D0 = q5Var;
                    s5Var4.postRunnable(q5Var);
                    return;
                }
                return;
            case 6:
                s5 s5Var5 = this.f29633b;
                s5Var5.k();
                if (s5Var5.f30204u0 != null && s5Var5.N) {
                    org.telegram.messenger.b8.G(s5Var5.J).a0(s5Var5.f30204u0.f14347c, false, false);
                }
                int i11 = s5Var5.O;
                if (i11 <= 0) {
                    s5Var5.N = true;
                } else {
                    s5Var5.O = i11 - 1;
                }
                if (!s5Var5.F) {
                    s5Var5.E = true;
                } else {
                    s5Var5.F = false;
                }
                s5Var5.e = null;
                if (s5Var5.M >= 0) {
                    s5Var5.f30199r = s5Var5.f30206w;
                    s5Var5.f30201s = null;
                } else if (!s5Var5.f30180b) {
                    s5Var5.f30199r = s5Var5.f30206w;
                } else {
                    p5 p5Var = s5Var5.f30199r;
                    if (p5Var == null && s5Var5.f30201s == null) {
                        s5Var5.f30199r = s5Var5.f30206w;
                    } else if (p5Var == null) {
                        s5Var5.f30199r = s5Var5.f30201s;
                        s5Var5.f30201s = s5Var5.f30206w;
                    } else {
                        s5Var5.f30201s = s5Var5.f30206w;
                    }
                }
                s5Var5.f30206w = null;
                if (s5Var5.P) {
                    s5Var5.P = false;
                    s5Var5.f30211y0++;
                    s5Var5.j();
                }
                if (s5Var5.d[3] < s5Var5.f30182c) {
                    float f7 = s5Var5.f30188g0;
                    if (f7 > 0.0f) {
                        i10 = (int) (f7 * 1000.0f);
                    } else {
                        i10 = 0;
                    }
                    s5Var5.f30182c = i10;
                }
                if (s5Var5.M >= 0 && s5Var5.L == -1) {
                    s5Var5.M = -1L;
                }
                s5Var5.f30182c = s5Var5.d[3];
                Iterator it = s5Var5.f30202s0.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                if ((!s5Var5.f30181b0 && s5Var5.D) || (s5Var5.f30194n == null && s5Var5.f30199r != null)) {
                    s5Var5.t();
                }
                s5Var5.x(false);
                return;
            case 7:
                s5 s5Var6 = this.f29633b;
                if (s5Var6.f30183c0) {
                    org.telegram.messenger.i0.g3(s5Var6.F0);
                    return;
                }
                boolean z14 = false;
                if (!s5Var6.f30210y && s5Var6.f30184d0 == null) {
                    s5Var6.f30184d0 = AnimatedFileNative.a(s5Var6.G.getAbsolutePath(), s5Var6.d, s5Var6.J, s5Var6.H, s5Var6.f30204u0, false);
                    if (s5Var6.f30184d0 == null && (!s5Var6.f30195n0 || s5Var6.G0 > 15)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    s5Var6.f30185e0 = z12;
                    if (s5Var6.f30184d0 != null) {
                        int[] iArr = s5Var6.d;
                        if (iArr[0] > 3840 || iArr[1] > 3840) {
                            s5Var6.f30184d0.f();
                            s5Var6.f30184d0 = null;
                        }
                    }
                    s5Var6.d();
                    s5Var6.E();
                    if (s5Var6.f30195n0 && s5Var6.f30184d0 == null) {
                        int i12 = s5Var6.G0;
                        s5Var6.G0 = i12 + 1;
                        if (i12 <= 15) {
                            z13 = false;
                            s5Var6.f30210y = z13;
                            org.telegram.messenger.i0.g3(new q5(s5Var6, 0));
                        }
                    }
                    z13 = true;
                    s5Var6.f30210y = z13;
                    org.telegram.messenger.i0.g3(new q5(s5Var6, 0));
                }
                try {
                } catch (Throwable th2) {
                    org.telegram.messenger.f8.g(th2, true);
                }
                if (s5Var6.f30212z0 != null) {
                    if (s5Var6.f30206w == null) {
                        if (!s5Var6.h.isEmpty()) {
                            s5Var6.f30206w = (p5) s5Var6.h.remove(0);
                        } else {
                            s5Var6.f30206w = new p5(Bitmap.createBitmap(s5Var6.f30191j0, s5Var6.f30190i0, Bitmap.Config.ARGB_8888));
                        }
                    }
                    if (s5Var6.A0 == null) {
                        s5Var6.A0 = new Object();
                    }
                    System.currentTimeMillis();
                    ae.j jVar = s5Var6.A0;
                    int i13 = jVar.f425a;
                    rf.e eVar2 = s5Var6.f30212z0;
                    int f10 = eVar2.f(s5Var6.f30206w.f29357b, eVar2.f46524i);
                    jVar.f425a = eVar2.f46524i;
                    if (eVar2.f46532q && !eVar2.e.isEmpty()) {
                        int i14 = eVar2.f46524i + 1;
                        eVar2.f46524i = i14;
                        if (i14 >= eVar2.e.size()) {
                            eVar2.f46524i = 0;
                        }
                    }
                    if (f10 != -1 && s5Var6.A0.f425a < i13) {
                        s5Var6.P = true;
                    }
                    int[] iArr2 = s5Var6.d;
                    p5 p5Var2 = s5Var6.f30206w;
                    int max = s5Var6.A0.f425a * Math.max(16, iArr2[4] / Math.max(1, s5Var6.f30212z0.e.size()));
                    p5Var2.e = max;
                    iArr2[3] = max;
                    s5Var6.f30206w.f29359f = false;
                    if (s5Var6.f30212z0.g()) {
                        org.telegram.messenger.i0.g3(s5Var6.E0);
                    }
                    if (f10 == -1) {
                        org.telegram.messenger.i0.g3(s5Var6.B0);
                        return;
                    } else {
                        org.telegram.messenger.i0.g3(s5Var6.F0);
                        return;
                    }
                }
                if (s5Var6.f30184d0 == null) {
                    int[] iArr3 = s5Var6.d;
                    if (iArr3[0] != 0 && iArr3[1] != 0) {
                        org.telegram.messenger.i0.g3(s5Var6.B0);
                        return;
                    }
                }
                if (s5Var6.f30206w == null) {
                    int[] iArr4 = s5Var6.d;
                    if (iArr4[0] > 0 && iArr4[1] > 0) {
                        if (!s5Var6.h.isEmpty()) {
                            s5Var6.f30206w = (p5) s5Var6.h.remove(0);
                        } else {
                            int[] iArr5 = s5Var6.d;
                            float f11 = s5Var6.m0;
                            s5Var6.f30206w = new p5(Bitmap.createBitmap((int) (iArr5[0] * f11), (int) (iArr5[1] * f11), Bitmap.Config.ARGB_8888));
                        }
                    }
                }
                if (s5Var6.L >= 0) {
                    s5Var6.d[3] = (int) s5Var6.L;
                    long j10 = s5Var6.L;
                    synchronized (s5Var6.Q) {
                        s5Var6.L = -1L;
                    }
                    AnimatedFileDrawableStream animatedFileDrawableStream = s5Var6.f30204u0;
                    if (animatedFileDrawableStream != null) {
                        animatedFileDrawableStream.d();
                    }
                    s5Var6.f30184d0.g(j10, true);
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (s5Var6.f30206w != null) {
                    System.currentTimeMillis();
                    if (s5Var6.f30184d0.c(s5Var6.f30206w.f29357b, false, s5Var6.f30188g0, s5Var6.f30189h0, s5Var6.f30192k0) == 0) {
                        org.telegram.messenger.i0.g3(s5Var6.B0);
                        return;
                    }
                    if (!s5Var6.f30186f) {
                        if (s5Var6.f30184d0.f23670a[7] == 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        s5Var6.f30186f = z11;
                    }
                    int i15 = s5Var6.d[3];
                    if (i15 < s5Var6.f30182c) {
                        s5Var6.P = true;
                    }
                    if (z10) {
                        s5Var6.f30182c = i15;
                    }
                    p5 p5Var3 = s5Var6.f30206w;
                    p5Var3.e = i15;
                    if (s5Var6.f30184d0.f23670a[6] == 1) {
                        z14 = true;
                    }
                    p5Var3.f29359f = z14;
                }
                org.telegram.messenger.i0.g3(s5Var6.F0);
                return;
            case 8:
                s5 s5Var7 = this.f29633b;
                je.b bVar = s5Var7.f30202s0;
                Iterator it2 = bVar.iterator();
                while (it2.hasNext()) {
                    ((View) it2.next()).invalidate();
                }
                WeakReference weakReference = s5Var7.f30200r0;
                if (weakReference != null) {
                    view = (View) weakReference.get();
                } else {
                    view = null;
                }
                if ((bVar.isEmpty() || s5Var7.R) && view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                s5 s5Var8 = this.f29633b;
                s5Var8.f30212z0.b();
                org.telegram.messenger.i0.g3(new q5(s5Var8, 1));
                return;
        }
    }
}
