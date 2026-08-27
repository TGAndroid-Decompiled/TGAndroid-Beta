package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimatedFileDrawableStream;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;

public final class v5 implements Runnable {

    public final int f33268a;

    public final x5 f33269b;

    public v5(x5 x5Var, int i10) {
        this.f33268a = i10;
        this.f33269b = x5Var;
    }

    @Override
    public final void run() {
        boolean z10;
        int i10;
        boolean z11;
        AnimatedFileDrawableStream animatedFileDrawableStream;
        boolean z12;
        View view;
        switch (this.f33268a) {
            case 0:
                this.f33269b.i();
                return;
            case 1:
                gf.h hVar = this.f33269b.f34495v0;
                return;
            case 2:
                x5 x5Var = this.f33269b;
                x5Var.k();
                x5Var.f34474e = null;
                if (x5Var.I >= 0 && x5Var.H == -1) {
                    x5Var.I = -1L;
                }
                x5Var.x(false);
                x5Var.t();
                return;
            case 3:
                x5 x5Var2 = this.f33269b;
                if (x5Var2.Y || x5Var2.f34496w || x5Var2.f34501y0 || x5Var2.f34502z0 != null) {
                    return;
                }
                x5Var2.f34472c0 = System.currentTimeMillis();
                if (oi0.P0 == null) {
                    oi0.P0 = new DispatchQueue("cache generator queue");
                }
                x5Var2.f34501y0 = true;
                x5Var2.f34474e = null;
                gf.h.A++;
                DispatchQueue dispatchQueue = oi0.P0;
                v5 v5Var = new v5(x5Var2, 7);
                x5Var2.f34502z0 = v5Var;
                dispatchQueue.postRunnable(v5Var);
                return;
            case 4:
                x5 x5Var3 = this.f33269b;
                x5Var3.k();
                if (x5Var3.f34488q0 != null && x5Var3.J) {
                    FileLoader.getInstance(x5Var3.F).removeLoadingVideo(x5Var3.f34488q0.getDocument(), false, false);
                }
                int i11 = x5Var3.K;
                if (i11 <= 0) {
                    x5Var3.J = true;
                } else {
                    x5Var3.K = i11 - 1;
                }
                if (x5Var3.B) {
                    x5Var3.B = false;
                } else {
                    x5Var3.A = true;
                }
                x5Var3.f34474e = null;
                if (x5Var3.I >= 0) {
                    x5Var3.f34489r = x5Var3.v;
                    x5Var3.f34491s = null;
                } else if (x5Var3.f34469b) {
                    u5 u5Var = x5Var3.f34489r;
                    if (u5Var == null && x5Var3.f34491s == null) {
                        x5Var3.f34489r = x5Var3.v;
                    } else if (u5Var == null) {
                        x5Var3.f34489r = x5Var3.f34491s;
                        x5Var3.f34491s = x5Var3.v;
                    } else {
                        x5Var3.f34491s = x5Var3.v;
                    }
                } else {
                    x5Var3.f34489r = x5Var3.v;
                }
                x5Var3.v = null;
                if (x5Var3.L) {
                    x5Var3.L = false;
                    x5Var3.f34494u0++;
                    x5Var3.j();
                }
                if (x5Var3.d[3] < x5Var3.f34471c) {
                    float f10 = x5Var3.f34472c0;
                    x5Var3.f34471c = f10 > 0.0f ? (int) (f10 * 1000.0f) : 0;
                }
                if (x5Var3.I >= 0 && x5Var3.H == -1) {
                    x5Var3.I = -1L;
                }
                x5Var3.f34471c = x5Var3.d[3];
                int size = x5Var3.f34486o0.size();
                for (int i12 = 0; i12 < size; i12++) {
                    ((View) x5Var3.f34486o0.get(i12)).invalidate();
                }
                if ((!x5Var3.X && x5Var3.f34500y) || (x5Var3.f34484n == null && x5Var3.f34489r != null)) {
                    x5Var3.t();
                }
                x5Var3.x(false);
                return;
            case 5:
                x5 x5Var4 = this.f33269b;
                if (x5Var4.Y) {
                    AndroidUtilities.runOnUIThread(x5Var4.B0);
                    return;
                }
                if (!x5Var4.f34498x && x5Var4.Z == null) {
                    x5Var4.Z = AnimatedFileNative.a(x5Var4.C.getAbsolutePath(), x5Var4.d, x5Var4.F, x5Var4.D, x5Var4.f34488q0, false);
                    x5Var4.f34468a0 = x5Var4.Z == null && (!x5Var4.f34481j0 || x5Var4.C0 > 15);
                    if (x5Var4.Z != null) {
                        int[] iArr = x5Var4.d;
                        if (iArr[0] > 3840 || iArr[1] > 3840) {
                            x5Var4.Z.f();
                            x5Var4.Z = null;
                        }
                    }
                    x5Var4.d();
                    x5Var4.E();
                    if (x5Var4.f34481j0 && x5Var4.Z == null) {
                        int i13 = x5Var4.C0;
                        x5Var4.C0 = i13 + 1;
                        if (i13 > 15) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                    } else {
                        z12 = true;
                    }
                    x5Var4.f34498x = z12;
                    AndroidUtilities.runOnUIThread(new v5(x5Var4, 0));
                }
                try {
                    if (x5Var4.f34495v0 != null) {
                        if (x5Var4.v == null) {
                            if (x5Var4.h.isEmpty()) {
                                x5Var4.v = new u5(Bitmap.createBitmap(x5Var4.f34477f0, x5Var4.f34475e0, Bitmap.Config.ARGB_8888));
                            } else {
                                x5Var4.v = (u5) x5Var4.h.remove(0);
                            }
                        }
                        if (x5Var4.f34497w0 == null) {
                            x5Var4.f34497w0 = new com.google.android.gms.internal.cast.a();
                        }
                        System.currentTimeMillis();
                        com.google.android.gms.internal.cast.a aVar = x5Var4.f34497w0;
                        int i14 = aVar.f3426a;
                        gf.h hVar2 = x5Var4.f34495v0;
                        int iF = hVar2.f(x5Var4.v.f32971b, hVar2.f6986i);
                        aVar.f3426a = hVar2.f6986i;
                        if (hVar2.f6994q && !hVar2.f6983e.isEmpty()) {
                            int i15 = hVar2.f6986i + 1;
                            hVar2.f6986i = i15;
                            if (i15 >= hVar2.f6983e.size()) {
                                hVar2.f6986i = 0;
                            }
                        }
                        if (iF != -1 && x5Var4.f34497w0.f3426a < i14) {
                            x5Var4.L = true;
                        }
                        int[] iArr2 = x5Var4.d;
                        u5 u5Var2 = x5Var4.v;
                        int iMax = x5Var4.f34497w0.f3426a * Math.max(16, iArr2[4] / Math.max(1, x5Var4.f34495v0.f6983e.size()));
                        u5Var2.f32973e = iMax;
                        iArr2[3] = iMax;
                        x5Var4.v.f32974f = false;
                        if (x5Var4.f34495v0.g()) {
                            AndroidUtilities.runOnUIThread(x5Var4.A0);
                        }
                        if (iF == -1) {
                            AndroidUtilities.runOnUIThread(x5Var4.f34499x0);
                            return;
                        } else {
                            AndroidUtilities.runOnUIThread(x5Var4.B0);
                            return;
                        }
                    }
                    if (x5Var4.Z == null) {
                        int[] iArr3 = x5Var4.d;
                        if (iArr3[0] != 0 && iArr3[1] != 0) {
                            AndroidUtilities.runOnUIThread(x5Var4.f34499x0);
                            return;
                        }
                    }
                    if (x5Var4.v == null) {
                        int[] iArr4 = x5Var4.d;
                        if (iArr4[0] <= 0 || iArr4[1] <= 0) {
                            if (x5Var4.H >= 0) {
                                x5Var4.d[3] = (int) x5Var4.H;
                                long j10 = x5Var4.H;
                                synchronized (x5Var4.M) {
                                    x5Var4.H = -1L;
                                    break;
                                }
                                animatedFileDrawableStream = x5Var4.f34488q0;
                                if (animatedFileDrawableStream != null) {
                                    animatedFileDrawableStream.reset();
                                }
                                x5Var4.Z.g(j10, true);
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (x5Var4.v != null) {
                                System.currentTimeMillis();
                                if (x5Var4.Z.c(x5Var4.v.f32971b, false, x5Var4.f34472c0, x5Var4.f34473d0, x5Var4.f34478g0) == 0) {
                                    AndroidUtilities.runOnUIThread(x5Var4.f34499x0);
                                    return;
                                }
                                if (!x5Var4.f34476f) {
                                    if (x5Var4.Z.f26059a[7] == 1) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    x5Var4.f34476f = z11;
                                }
                                i10 = x5Var4.d[3];
                                if (i10 < x5Var4.f34471c) {
                                    x5Var4.L = true;
                                }
                                if (z10) {
                                    x5Var4.f34471c = i10;
                                }
                                u5 u5Var3 = x5Var4.v;
                                u5Var3.f32973e = i10;
                                u5Var3.f32974f = x5Var4.Z.f26059a[6] == 1;
                            }
                        } else {
                            try {
                                if (x5Var4.h.isEmpty()) {
                                    int[] iArr5 = x5Var4.d;
                                    float f11 = iArr5[0];
                                    float f12 = x5Var4.f34480i0;
                                    x5Var4.v = new u5(Bitmap.createBitmap((int) (f11 * f12), (int) (iArr5[1] * f12), Bitmap.Config.ARGB_8888));
                                } else {
                                    x5Var4.v = (u5) x5Var4.h.remove(0);
                                }
                            } catch (Throwable th) {
                                FileLog.e(th);
                            }
                            if (x5Var4.H >= 0) {
                                x5Var4.d[3] = (int) x5Var4.H;
                                long j11 = x5Var4.H;
                                synchronized (x5Var4.M) {
                                    x5Var4.H = -1L;
                                    animatedFileDrawableStream = x5Var4.f34488q0;
                                    if (animatedFileDrawableStream != null) {
                                        animatedFileDrawableStream.reset();
                                    }
                                    x5Var4.Z.g(j11, true);
                                    z10 = true;
                                }
                            } else {
                                z10 = false;
                            }
                            if (x5Var4.v != null) {
                                System.currentTimeMillis();
                                if (x5Var4.Z.c(x5Var4.v.f32971b, false, x5Var4.f34472c0, x5Var4.f34473d0, x5Var4.f34478g0) == 0) {
                                    AndroidUtilities.runOnUIThread(x5Var4.f34499x0);
                                    return;
                                }
                                if (!x5Var4.f34476f) {
                                    if (x5Var4.Z.f26059a[7] == 1) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    x5Var4.f34476f = z11;
                                }
                                i10 = x5Var4.d[3];
                                if (i10 < x5Var4.f34471c) {
                                    x5Var4.L = true;
                                }
                                if (z10) {
                                    x5Var4.f34471c = i10;
                                }
                                u5 u5Var4 = x5Var4.v;
                                u5Var4.f32973e = i10;
                                u5Var4.f32974f = x5Var4.Z.f26059a[6] == 1;
                            }
                        }
                    } else {
                        if (x5Var4.H >= 0) {
                            x5Var4.d[3] = (int) x5Var4.H;
                            long j12 = x5Var4.H;
                            synchronized (x5Var4.M) {
                                x5Var4.H = -1L;
                                animatedFileDrawableStream = x5Var4.f34488q0;
                                if (animatedFileDrawableStream != null) {
                                    animatedFileDrawableStream.reset();
                                }
                                x5Var4.Z.g(j12, true);
                                z10 = true;
                            }
                        } else {
                            z10 = false;
                        }
                        if (x5Var4.v != null) {
                            System.currentTimeMillis();
                            if (x5Var4.Z.c(x5Var4.v.f32971b, false, x5Var4.f34472c0, x5Var4.f34473d0, x5Var4.f34478g0) == 0) {
                                AndroidUtilities.runOnUIThread(x5Var4.f34499x0);
                                return;
                            }
                            if (!x5Var4.f34476f) {
                                if (x5Var4.Z.f26059a[7] == 1) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                x5Var4.f34476f = z11;
                            }
                            i10 = x5Var4.d[3];
                            if (i10 < x5Var4.f34471c) {
                                x5Var4.L = true;
                            }
                            if (z10) {
                                x5Var4.f34471c = i10;
                            }
                            u5 u5Var5 = x5Var4.v;
                            u5Var5.f32973e = i10;
                            u5Var5.f32974f = x5Var4.Z.f26059a[6] == 1;
                        }
                    }
                    break;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
                AndroidUtilities.runOnUIThread(x5Var4.B0);
                return;
            case 6:
                x5 x5Var5 = this.f33269b;
                ArrayList arrayList = x5Var5.f34486o0;
                int size2 = arrayList.size();
                for (int i16 = 0; i16 < size2; i16++) {
                    ((View) arrayList.get(i16)).invalidate();
                }
                if ((arrayList.isEmpty() || x5Var5.N) && (view = x5Var5.f34485n0) != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 7:
                x5 x5Var6 = this.f33269b;
                x5Var6.f34495v0.b();
                AndroidUtilities.runOnUIThread(new v5(x5Var6, 8));
                return;
            default:
                x5 x5Var7 = this.f33269b;
                if (x5Var7.f34502z0 != null) {
                    gf.h.c();
                    x5Var7.f34502z0 = null;
                }
                x5Var7.f34501y0 = false;
                x5Var7.k();
                x5Var7.x(false);
                return;
        }
    }
}
