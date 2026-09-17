package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimatedFileDrawableStream;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
public final class z5 implements Runnable {
    public final int f30394a;
    public final b6 f30395b;

    public z5(b6 b6Var, int i10) {
        this.f30394a = i10;
        this.f30395b = b6Var;
    }

    @Override
    public final void run() {
        int i10;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        View view;
        switch (this.f30394a) {
            case 0:
                this.f30395b.i();
                return;
            case 1:
                yf.e eVar = this.f30395b.f22614z0;
                return;
            case 2:
                b6 b6Var = this.f30395b;
                b6Var.k();
                b6Var.e = null;
                if (b6Var.M >= 0 && b6Var.L == -1) {
                    b6Var.M = -1L;
                }
                b6Var.x(false);
                b6Var.t();
                return;
            case 3:
                b6 b6Var2 = this.f30395b;
                if (!b6Var2.f22585c0 && !b6Var2.f22608w && !b6Var2.C0 && b6Var2.D0 == null) {
                    b6Var2.f22590g0 = (float) System.currentTimeMillis();
                    if (yi0.T0 == null) {
                        yi0.T0 = new DispatchQueue("cache generator queue");
                    }
                    b6Var2.C0 = true;
                    b6Var2.e = null;
                    yf.e.A++;
                    DispatchQueue dispatchQueue = yi0.T0;
                    z5 z5Var = new z5(b6Var2, 7);
                    b6Var2.D0 = z5Var;
                    dispatchQueue.postRunnable(z5Var);
                    return;
                }
                return;
            case 4:
                b6 b6Var3 = this.f30395b;
                b6Var3.k();
                if (b6Var3.f22606u0 != null && b6Var3.N) {
                    FileLoader.getInstance(b6Var3.J).removeLoadingVideo(b6Var3.f22606u0.getDocument(), false, false);
                }
                int i11 = b6Var3.O;
                if (i11 <= 0) {
                    b6Var3.N = true;
                } else {
                    b6Var3.O = i11 - 1;
                }
                if (!b6Var3.F) {
                    b6Var3.E = true;
                } else {
                    b6Var3.F = false;
                }
                b6Var3.e = null;
                if (b6Var3.M >= 0) {
                    b6Var3.f22601r = b6Var3.v;
                    b6Var3.f22603s = null;
                } else if (!b6Var3.f22582b) {
                    b6Var3.f22601r = b6Var3.v;
                } else {
                    y5 y5Var = b6Var3.f22601r;
                    if (y5Var == null && b6Var3.f22603s == null) {
                        b6Var3.f22601r = b6Var3.v;
                    } else if (y5Var == null) {
                        b6Var3.f22601r = b6Var3.f22603s;
                        b6Var3.f22603s = b6Var3.v;
                    } else {
                        b6Var3.f22603s = b6Var3.v;
                    }
                }
                b6Var3.v = null;
                if (b6Var3.P) {
                    b6Var3.P = false;
                    b6Var3.f22613y0++;
                    b6Var3.j();
                }
                if (b6Var3.d[3] < b6Var3.f22584c) {
                    float f7 = b6Var3.f22590g0;
                    if (f7 > 0.0f) {
                        i10 = (int) (f7 * 1000.0f);
                    } else {
                        i10 = 0;
                    }
                    b6Var3.f22584c = i10;
                }
                if (b6Var3.M >= 0 && b6Var3.L == -1) {
                    b6Var3.M = -1L;
                }
                b6Var3.f22584c = b6Var3.d[3];
                int size = b6Var3.f22604s0.size();
                for (int i12 = 0; i12 < size; i12++) {
                    ((View) b6Var3.f22604s0.get(i12)).invalidate();
                }
                if ((!b6Var3.f22583b0 && b6Var3.f22612y) || (b6Var3.f22596n == null && b6Var3.f22601r != null)) {
                    b6Var3.t();
                }
                b6Var3.x(false);
                return;
            case 5:
                b6 b6Var4 = this.f30395b;
                if (b6Var4.f22585c0) {
                    AndroidUtilities.runOnUIThread(b6Var4.F0);
                    return;
                }
                boolean z14 = false;
                if (!b6Var4.f22610x && b6Var4.f22586d0 == null) {
                    b6Var4.f22586d0 = AnimatedFileNative.a(b6Var4.G.getAbsolutePath(), b6Var4.d, b6Var4.J, b6Var4.H, b6Var4.f22606u0, false);
                    if (b6Var4.f22586d0 == null && (!b6Var4.f22597n0 || b6Var4.G0 > 15)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    b6Var4.f22587e0 = z12;
                    if (b6Var4.f22586d0 != null) {
                        int[] iArr = b6Var4.d;
                        if (iArr[0] > 3840 || iArr[1] > 3840) {
                            b6Var4.f22586d0.f();
                            b6Var4.f22586d0 = null;
                        }
                    }
                    b6Var4.d();
                    b6Var4.E();
                    if (b6Var4.f22597n0 && b6Var4.f22586d0 == null) {
                        int i13 = b6Var4.G0;
                        b6Var4.G0 = i13 + 1;
                        if (i13 <= 15) {
                            z13 = false;
                            b6Var4.f22610x = z13;
                            AndroidUtilities.runOnUIThread(new z5(b6Var4, 0));
                        }
                    }
                    z13 = true;
                    b6Var4.f22610x = z13;
                    AndroidUtilities.runOnUIThread(new z5(b6Var4, 0));
                }
                try {
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
                if (b6Var4.f22614z0 != null) {
                    if (b6Var4.v == null) {
                        if (!b6Var4.h.isEmpty()) {
                            b6Var4.v = (y5) b6Var4.h.remove(0);
                        } else {
                            b6Var4.v = new y5(Bitmap.createBitmap(b6Var4.f22593j0, b6Var4.f22592i0, Bitmap.Config.ARGB_8888));
                        }
                    }
                    if (b6Var4.A0 == null) {
                        b6Var4.A0 = new Object();
                    }
                    System.currentTimeMillis();
                    com.google.android.gms.internal.cast.a aVar = b6Var4.A0;
                    int i14 = aVar.f6245a;
                    yf.e eVar2 = b6Var4.f22614z0;
                    int f10 = eVar2.f(b6Var4.v.f30121b, eVar2.f46824i);
                    aVar.f6245a = eVar2.f46824i;
                    if (eVar2.f46832q && !eVar2.e.isEmpty()) {
                        int i15 = eVar2.f46824i + 1;
                        eVar2.f46824i = i15;
                        if (i15 >= eVar2.e.size()) {
                            eVar2.f46824i = 0;
                        }
                    }
                    if (f10 != -1 && b6Var4.A0.f6245a < i14) {
                        b6Var4.P = true;
                    }
                    int[] iArr2 = b6Var4.d;
                    y5 y5Var2 = b6Var4.v;
                    int max = b6Var4.A0.f6245a * Math.max(16, iArr2[4] / Math.max(1, b6Var4.f22614z0.e.size()));
                    y5Var2.e = max;
                    iArr2[3] = max;
                    b6Var4.v.f30123f = false;
                    if (b6Var4.f22614z0.g()) {
                        AndroidUtilities.runOnUIThread(b6Var4.E0);
                    }
                    if (f10 == -1) {
                        AndroidUtilities.runOnUIThread(b6Var4.B0);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(b6Var4.F0);
                        return;
                    }
                }
                if (b6Var4.f22586d0 == null) {
                    int[] iArr3 = b6Var4.d;
                    if (iArr3[0] != 0 && iArr3[1] != 0) {
                        AndroidUtilities.runOnUIThread(b6Var4.B0);
                        return;
                    }
                }
                if (b6Var4.v == null) {
                    int[] iArr4 = b6Var4.d;
                    if (iArr4[0] > 0 && iArr4[1] > 0) {
                        if (!b6Var4.h.isEmpty()) {
                            b6Var4.v = (y5) b6Var4.h.remove(0);
                        } else {
                            int[] iArr5 = b6Var4.d;
                            float f11 = b6Var4.m0;
                            b6Var4.v = new y5(Bitmap.createBitmap((int) (iArr5[0] * f11), (int) (iArr5[1] * f11), Bitmap.Config.ARGB_8888));
                        }
                    }
                }
                if (b6Var4.L >= 0) {
                    b6Var4.d[3] = (int) b6Var4.L;
                    long j3 = b6Var4.L;
                    synchronized (b6Var4.Q) {
                        b6Var4.L = -1L;
                    }
                    AnimatedFileDrawableStream animatedFileDrawableStream = b6Var4.f22606u0;
                    if (animatedFileDrawableStream != null) {
                        animatedFileDrawableStream.reset();
                    }
                    b6Var4.f22586d0.g(j3, true);
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (b6Var4.v != null) {
                    System.currentTimeMillis();
                    if (b6Var4.f22586d0.c(b6Var4.v.f30121b, false, b6Var4.f22590g0, b6Var4.f22591h0, b6Var4.f22594k0) == 0) {
                        AndroidUtilities.runOnUIThread(b6Var4.B0);
                        return;
                    }
                    if (!b6Var4.f22588f) {
                        if (b6Var4.f22586d0.f21731a[7] == 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        b6Var4.f22588f = z11;
                    }
                    int i16 = b6Var4.d[3];
                    if (i16 < b6Var4.f22584c) {
                        b6Var4.P = true;
                    }
                    if (z10) {
                        b6Var4.f22584c = i16;
                    }
                    y5 y5Var3 = b6Var4.v;
                    y5Var3.e = i16;
                    if (b6Var4.f22586d0.f21731a[6] == 1) {
                        z14 = true;
                    }
                    y5Var3.f30123f = z14;
                }
                AndroidUtilities.runOnUIThread(b6Var4.F0);
                return;
            case 6:
                b6 b6Var5 = this.f30395b;
                ArrayList arrayList = b6Var5.f22604s0;
                int size2 = arrayList.size();
                for (int i17 = 0; i17 < size2; i17++) {
                    ((View) arrayList.get(i17)).invalidate();
                }
                if ((arrayList.isEmpty() || b6Var5.R) && (view = b6Var5.f22602r0) != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 7:
                b6 b6Var6 = this.f30395b;
                b6Var6.f22614z0.b();
                AndroidUtilities.runOnUIThread(new z5(b6Var6, 8));
                return;
            default:
                b6 b6Var7 = this.f30395b;
                if (b6Var7.D0 != null) {
                    yf.e.c();
                    b6Var7.D0 = null;
                }
                b6Var7.C0 = false;
                b6Var7.k();
                b6Var7.x(false);
                return;
        }
    }
}
