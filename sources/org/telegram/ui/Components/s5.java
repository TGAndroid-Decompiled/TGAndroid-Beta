package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import org.telegram.messenger.AnimatedFileDrawableStream;
public final class s5 implements Runnable {
    public final int f37867a;
    public final u5 f37868b;

    public s5(u5 u5Var, int i7) {
        this.f37867a = i7;
        this.f37868b = u5Var;
    }

    @Override
    public final void run() {
        int i7;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        View view;
        switch (this.f37867a) {
            case 0:
                this.f37868b.i();
                return;
            case 1:
                u5 u5Var = this.f37868b;
                if (u5Var.D0 != null) {
                    bg.i.c();
                    u5Var.D0 = null;
                }
                u5Var.C0 = false;
                u5Var.k();
                u5Var.x(false);
                return;
            case 2:
                this.f37868b.t();
                return;
            case 3:
                bg.i iVar = this.f37868b.f38548z0;
                return;
            case 4:
                u5 u5Var2 = this.f37868b;
                u5Var2.k();
                u5Var2.f38520e = null;
                if (u5Var2.M >= 0 && u5Var2.L == -1) {
                    u5Var2.M = -1L;
                }
                u5Var2.x(false);
                u5Var2.t();
                return;
            case 5:
                u5 u5Var3 = this.f37868b;
                if (!u5Var3.f38518c0 && !u5Var3.f38544x && !u5Var3.C0 && u5Var3.D0 == null) {
                    u5Var3.f38524g0 = (float) System.currentTimeMillis();
                    if (zg0.T0 == null) {
                        zg0.T0 = new org.telegram.messenger.q5("cache generator queue", true);
                    }
                    u5Var3.C0 = true;
                    u5Var3.f38520e = null;
                    bg.i.A++;
                    org.telegram.messenger.q5 q5Var = zg0.T0;
                    s5 s5Var = new s5(u5Var3, 9);
                    u5Var3.D0 = s5Var;
                    q5Var.postRunnable(s5Var);
                    return;
                }
                return;
            case 6:
                u5 u5Var4 = this.f37868b;
                u5Var4.k();
                if (u5Var4.f38540u0 != null && u5Var4.N) {
                    org.telegram.messenger.w7.G(u5Var4.J).Z(u5Var4.f38540u0.f21161c, false, false);
                }
                int i10 = u5Var4.O;
                if (i10 <= 0) {
                    u5Var4.N = true;
                } else {
                    u5Var4.O = i10 - 1;
                }
                if (!u5Var4.F) {
                    u5Var4.E = true;
                } else {
                    u5Var4.F = false;
                }
                u5Var4.f38520e = null;
                if (u5Var4.M >= 0) {
                    u5Var4.f38535r = u5Var4.f38542w;
                    u5Var4.f38537s = null;
                } else if (!u5Var4.f38515b) {
                    u5Var4.f38535r = u5Var4.f38542w;
                } else {
                    r5 r5Var = u5Var4.f38535r;
                    if (r5Var == null && u5Var4.f38537s == null) {
                        u5Var4.f38535r = u5Var4.f38542w;
                    } else if (r5Var == null) {
                        u5Var4.f38535r = u5Var4.f38537s;
                        u5Var4.f38537s = u5Var4.f38542w;
                    } else {
                        u5Var4.f38537s = u5Var4.f38542w;
                    }
                }
                u5Var4.f38542w = null;
                if (u5Var4.P) {
                    u5Var4.P = false;
                    u5Var4.f38547y0++;
                    u5Var4.j();
                }
                if (u5Var4.d[3] < u5Var4.f38517c) {
                    float f10 = u5Var4.f38524g0;
                    if (f10 > 0.0f) {
                        i7 = (int) (f10 * 1000.0f);
                    } else {
                        i7 = 0;
                    }
                    u5Var4.f38517c = i7;
                }
                if (u5Var4.M >= 0 && u5Var4.L == -1) {
                    u5Var4.M = -1L;
                }
                u5Var4.f38517c = u5Var4.d[3];
                Iterator it = u5Var4.f38538s0.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                if ((!u5Var4.f38516b0 && u5Var4.D) || (u5Var4.f38530n == null && u5Var4.f38535r != null)) {
                    u5Var4.t();
                }
                u5Var4.x(false);
                return;
            case 7:
                u5 u5Var5 = this.f37868b;
                if (u5Var5.f38518c0) {
                    org.telegram.messenger.g0.h3(u5Var5.F0);
                    return;
                }
                boolean z13 = false;
                if (!u5Var5.f38546y && u5Var5.f38519d0 == null) {
                    u5Var5.f38519d0 = AnimatedFileNative.a(u5Var5.G.getAbsolutePath(), u5Var5.d, u5Var5.J, u5Var5.H, u5Var5.f38540u0, false);
                    if (u5Var5.f38519d0 == null && (!u5Var5.f38531n0 || u5Var5.G0 > 15)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    u5Var5.f38521e0 = z11;
                    if (u5Var5.f38519d0 != null) {
                        int[] iArr = u5Var5.d;
                        if (iArr[0] > 3840 || iArr[1] > 3840) {
                            u5Var5.f38519d0.f();
                            u5Var5.f38519d0 = null;
                        }
                    }
                    u5Var5.d();
                    u5Var5.E();
                    if (u5Var5.f38531n0 && u5Var5.f38519d0 == null) {
                        int i11 = u5Var5.G0;
                        u5Var5.G0 = i11 + 1;
                        if (i11 <= 15) {
                            z12 = false;
                            u5Var5.f38546y = z12;
                            org.telegram.messenger.g0.h3(new s5(u5Var5, 0));
                        }
                    }
                    z12 = true;
                    u5Var5.f38546y = z12;
                    org.telegram.messenger.g0.h3(new s5(u5Var5, 0));
                }
                try {
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                }
                if (u5Var5.f38548z0 != null) {
                    if (u5Var5.f38542w == null) {
                        if (!u5Var5.h.isEmpty()) {
                            u5Var5.f38542w = (r5) u5Var5.h.remove(0);
                        } else {
                            u5Var5.f38542w = new r5(Bitmap.createBitmap(u5Var5.f38527j0, u5Var5.f38526i0, Bitmap.Config.ARGB_8888));
                        }
                    }
                    if (u5Var5.A0 == null) {
                        u5Var5.A0 = new Object();
                    }
                    System.currentTimeMillis();
                    b7.l lVar = u5Var5.A0;
                    int i12 = lVar.f3009a;
                    bg.i iVar2 = u5Var5.f38548z0;
                    int f11 = iVar2.f(iVar2.f3306i, u5Var5.f38542w.f37503b);
                    lVar.f3009a = iVar2.f3306i;
                    if (iVar2.f3314q && !iVar2.f3303e.isEmpty()) {
                        int i13 = iVar2.f3306i + 1;
                        iVar2.f3306i = i13;
                        if (i13 >= iVar2.f3303e.size()) {
                            iVar2.f3306i = 0;
                        }
                    }
                    if (f11 != -1 && u5Var5.A0.f3009a < i12) {
                        u5Var5.P = true;
                    }
                    int[] iArr2 = u5Var5.d;
                    r5 r5Var2 = u5Var5.f38542w;
                    int max = u5Var5.A0.f3009a * Math.max(16, iArr2[4] / Math.max(1, u5Var5.f38548z0.f3303e.size()));
                    r5Var2.f37505e = max;
                    iArr2[3] = max;
                    u5Var5.f38542w.f37506f = false;
                    if (u5Var5.f38548z0.g()) {
                        org.telegram.messenger.g0.h3(u5Var5.E0);
                    }
                    if (f11 == -1) {
                        org.telegram.messenger.g0.h3(u5Var5.B0);
                        return;
                    } else {
                        org.telegram.messenger.g0.h3(u5Var5.F0);
                        return;
                    }
                }
                if (u5Var5.f38519d0 == null) {
                    int[] iArr3 = u5Var5.d;
                    if (iArr3[0] != 0 && iArr3[1] != 0) {
                        org.telegram.messenger.g0.h3(u5Var5.B0);
                        return;
                    }
                }
                if (u5Var5.f38542w == null) {
                    int[] iArr4 = u5Var5.d;
                    if (iArr4[0] > 0 && iArr4[1] > 0) {
                        if (!u5Var5.h.isEmpty()) {
                            u5Var5.f38542w = (r5) u5Var5.h.remove(0);
                        } else {
                            int[] iArr5 = u5Var5.d;
                            float f12 = u5Var5.m0;
                            u5Var5.f38542w = new r5(Bitmap.createBitmap((int) (iArr5[0] * f12), (int) (iArr5[1] * f12), Bitmap.Config.ARGB_8888));
                        }
                    }
                }
                if (u5Var5.L >= 0) {
                    u5Var5.d[3] = (int) u5Var5.L;
                    long j3 = u5Var5.L;
                    synchronized (u5Var5.Q) {
                        u5Var5.L = -1L;
                    }
                    AnimatedFileDrawableStream animatedFileDrawableStream = u5Var5.f38540u0;
                    if (animatedFileDrawableStream != null) {
                        animatedFileDrawableStream.d();
                    }
                    u5Var5.f38519d0.g(j3, true);
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (u5Var5.f38542w != null) {
                    System.currentTimeMillis();
                    if (u5Var5.f38519d0.c(u5Var5.f38542w.f37503b, false, u5Var5.f38524g0, u5Var5.f38525h0, u5Var5.f38528k0) == 0) {
                        org.telegram.messenger.g0.h3(u5Var5.B0);
                        return;
                    }
                    if (!u5Var5.f38522f) {
                        if (u5Var5.f38519d0.f31026a[7] == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        u5Var5.f38522f = z10;
                    }
                    int i14 = u5Var5.d[3];
                    if (i14 < u5Var5.f38517c) {
                        u5Var5.P = true;
                    }
                    if (z9) {
                        u5Var5.f38517c = i14;
                    }
                    r5 r5Var3 = u5Var5.f38542w;
                    r5Var3.f37505e = i14;
                    if (u5Var5.f38519d0.f31026a[6] == 1) {
                        z13 = true;
                    }
                    r5Var3.f37506f = z13;
                }
                org.telegram.messenger.g0.h3(u5Var5.F0);
                return;
            case 8:
                u5 u5Var6 = this.f37868b;
                xe.b bVar = u5Var6.f38538s0;
                Iterator it2 = bVar.iterator();
                while (it2.hasNext()) {
                    ((View) it2.next()).invalidate();
                }
                WeakReference weakReference = u5Var6.f38536r0;
                if (weakReference != null) {
                    view = (View) weakReference.get();
                } else {
                    view = null;
                }
                if ((bVar.isEmpty() || u5Var6.R) && view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                u5 u5Var7 = this.f37868b;
                u5Var7.f38548z0.b();
                org.telegram.messenger.g0.h3(new s5(u5Var7, 1));
                return;
        }
    }
}
