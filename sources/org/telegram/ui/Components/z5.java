package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import org.telegram.messenger.AnimatedFileDrawableStream;
public final class z5 implements Runnable {
    public final int f42814a;
    public final b6 f42815b;

    public z5(b6 b6Var, int i7) {
        this.f42814a = i7;
        this.f42815b = b6Var;
    }

    @Override
    public final void run() {
        int i7;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        View view;
        switch (this.f42814a) {
            case 0:
                this.f42815b.i();
                return;
            case 1:
                b6 b6Var = this.f42815b;
                if (b6Var.E0 != null) {
                    bg.i.c();
                    b6Var.E0 = null;
                }
                b6Var.D0 = false;
                b6Var.k();
                b6Var.x(false);
                return;
            case 2:
                this.f42815b.t();
                return;
            case 3:
                bg.i iVar = this.f42815b.A0;
                return;
            case 4:
                b6 b6Var2 = this.f42815b;
                b6Var2.k();
                b6Var2.f33540e = null;
                if (b6Var2.N >= 0 && b6Var2.M == -1) {
                    b6Var2.N = -1L;
                }
                b6Var2.x(false);
                b6Var2.t();
                return;
            case 5:
                b6 b6Var3 = this.f42815b;
                if (!b6Var3.f33539d0 && !b6Var3.f33564x && !b6Var3.D0 && b6Var3.E0 == null) {
                    b6Var3.f33545h0 = (float) System.currentTimeMillis();
                    if (mh0.U0 == null) {
                        mh0.U0 = new org.telegram.messenger.r5("cache generator queue", true);
                    }
                    b6Var3.D0 = true;
                    b6Var3.f33540e = null;
                    bg.i.A++;
                    org.telegram.messenger.r5 r5Var = mh0.U0;
                    z5 z5Var = new z5(b6Var3, 9);
                    b6Var3.E0 = z5Var;
                    r5Var.postRunnable(z5Var);
                    return;
                }
                return;
            case 6:
                b6 b6Var4 = this.f42815b;
                b6Var4.k();
                if (b6Var4.f33561v0 != null && b6Var4.O) {
                    org.telegram.messenger.w7.G(b6Var4.K).Z(b6Var4.f33561v0.f22598c, false, false);
                }
                int i10 = b6Var4.P;
                if (i10 <= 0) {
                    b6Var4.O = true;
                } else {
                    b6Var4.P = i10 - 1;
                }
                if (!b6Var4.G) {
                    b6Var4.F = true;
                } else {
                    b6Var4.G = false;
                }
                b6Var4.f33540e = null;
                if (b6Var4.N >= 0) {
                    b6Var4.f33555r = b6Var4.f33562w;
                    b6Var4.f33557s = null;
                } else if (!b6Var4.f33535b) {
                    b6Var4.f33555r = b6Var4.f33562w;
                } else {
                    y5 y5Var = b6Var4.f33555r;
                    if (y5Var == null && b6Var4.f33557s == null) {
                        b6Var4.f33555r = b6Var4.f33562w;
                    } else if (y5Var == null) {
                        b6Var4.f33555r = b6Var4.f33557s;
                        b6Var4.f33557s = b6Var4.f33562w;
                    } else {
                        b6Var4.f33557s = b6Var4.f33562w;
                    }
                }
                b6Var4.f33562w = null;
                if (b6Var4.Q) {
                    b6Var4.Q = false;
                    b6Var4.f33568z0++;
                    b6Var4.j();
                }
                if (b6Var4.d[3] < b6Var4.f33537c) {
                    float f10 = b6Var4.f33545h0;
                    if (f10 > 0.0f) {
                        i7 = (int) (f10 * 1000.0f);
                    } else {
                        i7 = 0;
                    }
                    b6Var4.f33537c = i7;
                }
                if (b6Var4.N >= 0 && b6Var4.M == -1) {
                    b6Var4.N = -1L;
                }
                b6Var4.f33537c = b6Var4.d[3];
                Iterator it = b6Var4.f33559t0.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                if ((!b6Var4.f33538c0 && b6Var4.E) || (b6Var4.f33550n == null && b6Var4.f33555r != null)) {
                    b6Var4.t();
                }
                b6Var4.x(false);
                return;
            case 7:
                b6 b6Var5 = this.f42815b;
                if (b6Var5.f33539d0) {
                    org.telegram.messenger.g0.g3(b6Var5.G0);
                    return;
                }
                boolean z14 = false;
                if (!b6Var5.f33566y && b6Var5.f33541e0 == null) {
                    b6Var5.f33541e0 = AnimatedFileNative.a(b6Var5.H.getAbsolutePath(), b6Var5.d, b6Var5.K, b6Var5.I, b6Var5.f33561v0, false);
                    if (b6Var5.f33541e0 == null && (!b6Var5.f33552o0 || b6Var5.H0 > 15)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    b6Var5.f33543f0 = z12;
                    if (b6Var5.f33541e0 != null) {
                        int[] iArr = b6Var5.d;
                        if (iArr[0] > 3840 || iArr[1] > 3840) {
                            b6Var5.f33541e0.f();
                            b6Var5.f33541e0 = null;
                        }
                    }
                    b6Var5.d();
                    b6Var5.E();
                    if (b6Var5.f33552o0 && b6Var5.f33541e0 == null) {
                        int i11 = b6Var5.H0;
                        b6Var5.H0 = i11 + 1;
                        if (i11 <= 15) {
                            z13 = false;
                            b6Var5.f33566y = z13;
                            org.telegram.messenger.g0.g3(new z5(b6Var5, 0));
                        }
                    }
                    z13 = true;
                    b6Var5.f33566y = z13;
                    org.telegram.messenger.g0.g3(new z5(b6Var5, 0));
                }
                try {
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                }
                if (b6Var5.A0 != null) {
                    if (b6Var5.f33562w == null) {
                        if (!b6Var5.h.isEmpty()) {
                            b6Var5.f33562w = (y5) b6Var5.h.remove(0);
                        } else {
                            b6Var5.f33562w = new y5(Bitmap.createBitmap(b6Var5.f33548k0, b6Var5.f33547j0, Bitmap.Config.ARGB_8888));
                        }
                    }
                    if (b6Var5.B0 == null) {
                        b6Var5.B0 = new Object();
                    }
                    System.currentTimeMillis();
                    b7.l lVar = b6Var5.B0;
                    int i12 = lVar.f2961a;
                    bg.i iVar2 = b6Var5.A0;
                    int f11 = iVar2.f(iVar2.f3255i, b6Var5.f33562w.f42330b);
                    lVar.f2961a = iVar2.f3255i;
                    if (iVar2.f3263q && !iVar2.f3252e.isEmpty()) {
                        int i13 = iVar2.f3255i + 1;
                        iVar2.f3255i = i13;
                        if (i13 >= iVar2.f3252e.size()) {
                            iVar2.f3255i = 0;
                        }
                    }
                    if (f11 != -1 && b6Var5.B0.f2961a < i12) {
                        b6Var5.Q = true;
                    }
                    int[] iArr2 = b6Var5.d;
                    y5 y5Var2 = b6Var5.f33562w;
                    int max = b6Var5.B0.f2961a * Math.max(16, iArr2[4] / Math.max(1, b6Var5.A0.f3252e.size()));
                    y5Var2.f42332e = max;
                    iArr2[3] = max;
                    b6Var5.f33562w.f42333f = false;
                    if (b6Var5.A0.g()) {
                        org.telegram.messenger.g0.g3(b6Var5.F0);
                    }
                    if (f11 == -1) {
                        org.telegram.messenger.g0.g3(b6Var5.C0);
                        return;
                    } else {
                        org.telegram.messenger.g0.g3(b6Var5.G0);
                        return;
                    }
                }
                if (b6Var5.f33541e0 == null) {
                    int[] iArr3 = b6Var5.d;
                    if (iArr3[0] != 0 && iArr3[1] != 0) {
                        org.telegram.messenger.g0.g3(b6Var5.C0);
                        return;
                    }
                }
                if (b6Var5.f33562w == null) {
                    int[] iArr4 = b6Var5.d;
                    if (iArr4[0] > 0 && iArr4[1] > 0) {
                        if (!b6Var5.h.isEmpty()) {
                            b6Var5.f33562w = (y5) b6Var5.h.remove(0);
                        } else {
                            int[] iArr5 = b6Var5.d;
                            float f12 = b6Var5.f33551n0;
                            b6Var5.f33562w = new y5(Bitmap.createBitmap((int) (iArr5[0] * f12), (int) (iArr5[1] * f12), Bitmap.Config.ARGB_8888));
                        }
                    }
                }
                if (b6Var5.M >= 0) {
                    b6Var5.d[3] = (int) b6Var5.M;
                    long j3 = b6Var5.M;
                    synchronized (b6Var5.R) {
                        b6Var5.M = -1L;
                    }
                    AnimatedFileDrawableStream animatedFileDrawableStream = b6Var5.f33561v0;
                    if (animatedFileDrawableStream != null) {
                        animatedFileDrawableStream.d();
                    }
                    b6Var5.f33541e0.g(j3, true);
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (b6Var5.f33562w != null) {
                    System.currentTimeMillis();
                    if (b6Var5.f33541e0.c(b6Var5.f33562w.f42330b, false, b6Var5.f33545h0, b6Var5.f33546i0, b6Var5.f33549l0) == 0) {
                        org.telegram.messenger.g0.g3(b6Var5.C0);
                        return;
                    }
                    if (!b6Var5.f33542f) {
                        if (b6Var5.f33541e0.f32534a[7] == 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        b6Var5.f33542f = z11;
                    }
                    int i14 = b6Var5.d[3];
                    if (i14 < b6Var5.f33537c) {
                        b6Var5.Q = true;
                    }
                    if (z10) {
                        b6Var5.f33537c = i14;
                    }
                    y5 y5Var3 = b6Var5.f33562w;
                    y5Var3.f42332e = i14;
                    if (b6Var5.f33541e0.f32534a[6] == 1) {
                        z14 = true;
                    }
                    y5Var3.f42333f = z14;
                }
                org.telegram.messenger.g0.g3(b6Var5.G0);
                return;
            case 8:
                b6 b6Var6 = this.f42815b;
                xe.b bVar = b6Var6.f33559t0;
                Iterator it2 = bVar.iterator();
                while (it2.hasNext()) {
                    ((View) it2.next()).invalidate();
                }
                WeakReference weakReference = b6Var6.f33558s0;
                if (weakReference != null) {
                    view = (View) weakReference.get();
                } else {
                    view = null;
                }
                if ((bVar.isEmpty() || b6Var6.S) && view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                b6 b6Var7 = this.f42815b;
                b6Var7.A0.b();
                org.telegram.messenger.g0.g3(new z5(b6Var7, 1));
                return;
        }
    }
}
