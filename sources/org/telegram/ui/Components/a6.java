package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimatedFileDrawableStream;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
public final class a6 implements Runnable {
    public final int f21390a;
    public final c6 f21391b;

    public a6(c6 c6Var, int i10) {
        this.f21390a = i10;
        this.f21391b = c6Var;
    }

    @Override
    public final void run() {
        int i10;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        View view;
        switch (this.f21390a) {
            case 0:
                this.f21391b.i();
                return;
            case 1:
                xf.e eVar = this.f21391b.f22030z0;
                return;
            case 2:
                c6 c6Var = this.f21391b;
                c6Var.k();
                c6Var.e = null;
                if (c6Var.M >= 0 && c6Var.L == -1) {
                    c6Var.M = -1L;
                }
                c6Var.x(false);
                c6Var.t();
                return;
            case 3:
                c6 c6Var2 = this.f21391b;
                if (!c6Var2.f22001c0 && !c6Var2.f22024w && !c6Var2.C0 && c6Var2.D0 == null) {
                    c6Var2.f22006g0 = (float) System.currentTimeMillis();
                    if (hj0.T0 == null) {
                        hj0.T0 = new DispatchQueue("cache generator queue");
                    }
                    c6Var2.C0 = true;
                    c6Var2.e = null;
                    xf.e.A++;
                    DispatchQueue dispatchQueue = hj0.T0;
                    a6 a6Var = new a6(c6Var2, 7);
                    c6Var2.D0 = a6Var;
                    dispatchQueue.postRunnable(a6Var);
                    return;
                }
                return;
            case 4:
                c6 c6Var3 = this.f21391b;
                c6Var3.k();
                if (c6Var3.f22022u0 != null && c6Var3.N) {
                    FileLoader.getInstance(c6Var3.J).removeLoadingVideo(c6Var3.f22022u0.getDocument(), false, false);
                }
                int i11 = c6Var3.O;
                if (i11 <= 0) {
                    c6Var3.N = true;
                } else {
                    c6Var3.O = i11 - 1;
                }
                if (!c6Var3.F) {
                    c6Var3.E = true;
                } else {
                    c6Var3.F = false;
                }
                c6Var3.e = null;
                if (c6Var3.M >= 0) {
                    c6Var3.f22017r = c6Var3.v;
                    c6Var3.f22019s = null;
                } else if (!c6Var3.f21998b) {
                    c6Var3.f22017r = c6Var3.v;
                } else {
                    z5 z5Var = c6Var3.f22017r;
                    if (z5Var == null && c6Var3.f22019s == null) {
                        c6Var3.f22017r = c6Var3.v;
                    } else if (z5Var == null) {
                        c6Var3.f22017r = c6Var3.f22019s;
                        c6Var3.f22019s = c6Var3.v;
                    } else {
                        c6Var3.f22019s = c6Var3.v;
                    }
                }
                c6Var3.v = null;
                if (c6Var3.P) {
                    c6Var3.P = false;
                    c6Var3.f22029y0++;
                    c6Var3.j();
                }
                if (c6Var3.d[3] < c6Var3.f22000c) {
                    float f7 = c6Var3.f22006g0;
                    if (f7 > 0.0f) {
                        i10 = (int) (f7 * 1000.0f);
                    } else {
                        i10 = 0;
                    }
                    c6Var3.f22000c = i10;
                }
                if (c6Var3.M >= 0 && c6Var3.L == -1) {
                    c6Var3.M = -1L;
                }
                c6Var3.f22000c = c6Var3.d[3];
                int size = c6Var3.f22020s0.size();
                for (int i12 = 0; i12 < size; i12++) {
                    ((View) c6Var3.f22020s0.get(i12)).invalidate();
                }
                if ((!c6Var3.f21999b0 && c6Var3.f22028y) || (c6Var3.f22012n == null && c6Var3.f22017r != null)) {
                    c6Var3.t();
                }
                c6Var3.x(false);
                return;
            case 5:
                c6 c6Var4 = this.f21391b;
                if (c6Var4.f22001c0) {
                    AndroidUtilities.runOnUIThread(c6Var4.F0);
                    return;
                }
                boolean z14 = false;
                if (!c6Var4.f22026x && c6Var4.f22002d0 == null) {
                    c6Var4.f22002d0 = AnimatedFileNative.a(c6Var4.G.getAbsolutePath(), c6Var4.d, c6Var4.J, c6Var4.H, c6Var4.f22022u0, false);
                    if (c6Var4.f22002d0 == null && (!c6Var4.f22013n0 || c6Var4.G0 > 15)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    c6Var4.f22003e0 = z12;
                    if (c6Var4.f22002d0 != null) {
                        int[] iArr = c6Var4.d;
                        if (iArr[0] > 3840 || iArr[1] > 3840) {
                            c6Var4.f22002d0.f();
                            c6Var4.f22002d0 = null;
                        }
                    }
                    c6Var4.d();
                    c6Var4.E();
                    if (c6Var4.f22013n0 && c6Var4.f22002d0 == null) {
                        int i13 = c6Var4.G0;
                        c6Var4.G0 = i13 + 1;
                        if (i13 <= 15) {
                            z13 = false;
                            c6Var4.f22026x = z13;
                            AndroidUtilities.runOnUIThread(new a6(c6Var4, 0));
                        }
                    }
                    z13 = true;
                    c6Var4.f22026x = z13;
                    AndroidUtilities.runOnUIThread(new a6(c6Var4, 0));
                }
                try {
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
                if (c6Var4.f22030z0 != null) {
                    if (c6Var4.v == null) {
                        if (!c6Var4.h.isEmpty()) {
                            c6Var4.v = (z5) c6Var4.h.remove(0);
                        } else {
                            c6Var4.v = new z5(Bitmap.createBitmap(c6Var4.f22009j0, c6Var4.f22008i0, Bitmap.Config.ARGB_8888));
                        }
                    }
                    if (c6Var4.A0 == null) {
                        c6Var4.A0 = new Object();
                    }
                    System.currentTimeMillis();
                    com.google.android.gms.internal.cast.a aVar = c6Var4.A0;
                    int i14 = aVar.f5019a;
                    xf.e eVar2 = c6Var4.f22030z0;
                    int f10 = eVar2.f(c6Var4.v.f29592b, eVar2.f45118i);
                    aVar.f5019a = eVar2.f45118i;
                    if (eVar2.f45126q && !eVar2.e.isEmpty()) {
                        int i15 = eVar2.f45118i + 1;
                        eVar2.f45118i = i15;
                        if (i15 >= eVar2.e.size()) {
                            eVar2.f45118i = 0;
                        }
                    }
                    if (f10 != -1 && c6Var4.A0.f5019a < i14) {
                        c6Var4.P = true;
                    }
                    int[] iArr2 = c6Var4.d;
                    z5 z5Var2 = c6Var4.v;
                    int max = c6Var4.A0.f5019a * Math.max(16, iArr2[4] / Math.max(1, c6Var4.f22030z0.e.size()));
                    z5Var2.e = max;
                    iArr2[3] = max;
                    c6Var4.v.f29594f = false;
                    if (c6Var4.f22030z0.g()) {
                        AndroidUtilities.runOnUIThread(c6Var4.E0);
                    }
                    if (f10 == -1) {
                        AndroidUtilities.runOnUIThread(c6Var4.B0);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(c6Var4.F0);
                        return;
                    }
                }
                if (c6Var4.f22002d0 == null) {
                    int[] iArr3 = c6Var4.d;
                    if (iArr3[0] != 0 && iArr3[1] != 0) {
                        AndroidUtilities.runOnUIThread(c6Var4.B0);
                        return;
                    }
                }
                if (c6Var4.v == null) {
                    int[] iArr4 = c6Var4.d;
                    if (iArr4[0] > 0 && iArr4[1] > 0) {
                        if (!c6Var4.h.isEmpty()) {
                            c6Var4.v = (z5) c6Var4.h.remove(0);
                        } else {
                            int[] iArr5 = c6Var4.d;
                            float f11 = c6Var4.m0;
                            c6Var4.v = new z5(Bitmap.createBitmap((int) (iArr5[0] * f11), (int) (iArr5[1] * f11), Bitmap.Config.ARGB_8888));
                        }
                    }
                }
                if (c6Var4.L >= 0) {
                    c6Var4.d[3] = (int) c6Var4.L;
                    long j3 = c6Var4.L;
                    synchronized (c6Var4.Q) {
                        c6Var4.L = -1L;
                    }
                    AnimatedFileDrawableStream animatedFileDrawableStream = c6Var4.f22022u0;
                    if (animatedFileDrawableStream != null) {
                        animatedFileDrawableStream.reset();
                    }
                    c6Var4.f22002d0.g(j3, true);
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c6Var4.v != null) {
                    System.currentTimeMillis();
                    if (c6Var4.f22002d0.c(c6Var4.v.f29592b, false, c6Var4.f22006g0, c6Var4.f22007h0, c6Var4.f22010k0) == 0) {
                        AndroidUtilities.runOnUIThread(c6Var4.B0);
                        return;
                    }
                    if (!c6Var4.f22004f) {
                        if (c6Var4.f22002d0.f20806a[7] == 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        c6Var4.f22004f = z11;
                    }
                    int i16 = c6Var4.d[3];
                    if (i16 < c6Var4.f22000c) {
                        c6Var4.P = true;
                    }
                    if (z10) {
                        c6Var4.f22000c = i16;
                    }
                    z5 z5Var3 = c6Var4.v;
                    z5Var3.e = i16;
                    if (c6Var4.f22002d0.f20806a[6] == 1) {
                        z14 = true;
                    }
                    z5Var3.f29594f = z14;
                }
                AndroidUtilities.runOnUIThread(c6Var4.F0);
                return;
            case 6:
                c6 c6Var5 = this.f21391b;
                ArrayList arrayList = c6Var5.f22020s0;
                int size2 = arrayList.size();
                for (int i17 = 0; i17 < size2; i17++) {
                    ((View) arrayList.get(i17)).invalidate();
                }
                if ((arrayList.isEmpty() || c6Var5.R) && (view = c6Var5.f22018r0) != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 7:
                c6 c6Var6 = this.f21391b;
                c6Var6.f22030z0.b();
                AndroidUtilities.runOnUIThread(new a6(c6Var6, 8));
                return;
            default:
                c6 c6Var7 = this.f21391b;
                if (c6Var7.D0 != null) {
                    xf.e.c();
                    c6Var7.D0 = null;
                }
                c6Var7.C0 = false;
                c6Var7.k();
                c6Var7.x(false);
                return;
        }
    }
}
