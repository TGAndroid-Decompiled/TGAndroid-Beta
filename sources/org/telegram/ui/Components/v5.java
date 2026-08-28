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
    public final int f33263a;
    public final x5 f33264b;

    public v5(x5 x5Var, int i9) {
        this.f33263a = i9;
        this.f33264b = x5Var;
    }

    @Override
    public final void run() {
        int i9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        View view;
        switch (this.f33263a) {
            case 0:
                this.f33264b.i();
                return;
            case 1:
                ff.h hVar = this.f33264b.f34534v0;
                return;
            case 2:
                x5 x5Var = this.f33264b;
                x5Var.k();
                x5Var.f34513e = null;
                if (x5Var.I >= 0 && x5Var.H == -1) {
                    x5Var.I = -1L;
                }
                x5Var.x(false);
                x5Var.t();
                return;
            case 3:
                x5 x5Var2 = this.f33264b;
                if (!x5Var2.Y && !x5Var2.f34535w && !x5Var2.f34540y0 && x5Var2.f34541z0 == null) {
                    x5Var2.f34511c0 = (float) System.currentTimeMillis();
                    if (mi0.P0 == null) {
                        mi0.P0 = new DispatchQueue("cache generator queue");
                    }
                    x5Var2.f34540y0 = true;
                    x5Var2.f34513e = null;
                    ff.h.A++;
                    DispatchQueue dispatchQueue = mi0.P0;
                    v5 v5Var = new v5(x5Var2, 7);
                    x5Var2.f34541z0 = v5Var;
                    dispatchQueue.postRunnable(v5Var);
                    return;
                }
                return;
            case 4:
                x5 x5Var3 = this.f33264b;
                x5Var3.k();
                if (x5Var3.f34527q0 != null && x5Var3.J) {
                    FileLoader.getInstance(x5Var3.F).removeLoadingVideo(x5Var3.f34527q0.getDocument(), false, false);
                }
                int i10 = x5Var3.K;
                if (i10 <= 0) {
                    x5Var3.J = true;
                } else {
                    x5Var3.K = i10 - 1;
                }
                if (!x5Var3.B) {
                    x5Var3.A = true;
                } else {
                    x5Var3.B = false;
                }
                x5Var3.f34513e = null;
                if (x5Var3.I >= 0) {
                    x5Var3.f34528r = x5Var3.v;
                    x5Var3.f34530s = null;
                } else if (!x5Var3.f34508b) {
                    x5Var3.f34528r = x5Var3.v;
                } else {
                    u5 u5Var = x5Var3.f34528r;
                    if (u5Var == null && x5Var3.f34530s == null) {
                        x5Var3.f34528r = x5Var3.v;
                    } else if (u5Var == null) {
                        x5Var3.f34528r = x5Var3.f34530s;
                        x5Var3.f34530s = x5Var3.v;
                    } else {
                        x5Var3.f34530s = x5Var3.v;
                    }
                }
                x5Var3.v = null;
                if (x5Var3.L) {
                    x5Var3.L = false;
                    x5Var3.f34533u0++;
                    x5Var3.j();
                }
                if (x5Var3.d[3] < x5Var3.f34510c) {
                    float f10 = x5Var3.f34511c0;
                    if (f10 > 0.0f) {
                        i9 = (int) (f10 * 1000.0f);
                    } else {
                        i9 = 0;
                    }
                    x5Var3.f34510c = i9;
                }
                if (x5Var3.I >= 0 && x5Var3.H == -1) {
                    x5Var3.I = -1L;
                }
                x5Var3.f34510c = x5Var3.d[3];
                int size = x5Var3.f34525o0.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((View) x5Var3.f34525o0.get(i11)).invalidate();
                }
                if ((!x5Var3.X && x5Var3.f34539y) || (x5Var3.f34523n == null && x5Var3.f34528r != null)) {
                    x5Var3.t();
                }
                x5Var3.x(false);
                return;
            case 5:
                x5 x5Var4 = this.f33264b;
                if (x5Var4.Y) {
                    AndroidUtilities.runOnUIThread(x5Var4.B0);
                    return;
                }
                boolean z14 = false;
                if (!x5Var4.f34537x && x5Var4.Z == null) {
                    x5Var4.Z = AnimatedFileNative.a(x5Var4.C.getAbsolutePath(), x5Var4.d, x5Var4.F, x5Var4.D, x5Var4.f34527q0, false);
                    if (x5Var4.Z == null && (!x5Var4.f34520j0 || x5Var4.C0 > 15)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    x5Var4.f34507a0 = z12;
                    if (x5Var4.Z != null) {
                        int[] iArr = x5Var4.d;
                        if (iArr[0] > 3840 || iArr[1] > 3840) {
                            x5Var4.Z.f();
                            x5Var4.Z = null;
                        }
                    }
                    x5Var4.d();
                    x5Var4.E();
                    if (x5Var4.f34520j0 && x5Var4.Z == null) {
                        int i12 = x5Var4.C0;
                        x5Var4.C0 = i12 + 1;
                        if (i12 <= 15) {
                            z13 = false;
                            x5Var4.f34537x = z13;
                            AndroidUtilities.runOnUIThread(new v5(x5Var4, 0));
                        }
                    }
                    z13 = true;
                    x5Var4.f34537x = z13;
                    AndroidUtilities.runOnUIThread(new v5(x5Var4, 0));
                }
                try {
                } catch (Throwable th) {
                    FileLog.e(th);
                }
                if (x5Var4.f34534v0 != null) {
                    if (x5Var4.v == null) {
                        if (!x5Var4.h.isEmpty()) {
                            x5Var4.v = (u5) x5Var4.h.remove(0);
                        } else {
                            x5Var4.v = new u5(Bitmap.createBitmap(x5Var4.f34516f0, x5Var4.f34514e0, Bitmap.Config.ARGB_8888));
                        }
                    }
                    if (x5Var4.f34536w0 == null) {
                        x5Var4.f34536w0 = new Object();
                    }
                    System.currentTimeMillis();
                    com.google.android.gms.internal.cast.a aVar = x5Var4.f34536w0;
                    int i13 = aVar.f2981a;
                    ff.h hVar2 = x5Var4.f34534v0;
                    int f11 = hVar2.f(x5Var4.v.f32920b, hVar2.f6186i);
                    aVar.f2981a = hVar2.f6186i;
                    if (hVar2.f6194q && !hVar2.f6183e.isEmpty()) {
                        int i14 = hVar2.f6186i + 1;
                        hVar2.f6186i = i14;
                        if (i14 >= hVar2.f6183e.size()) {
                            hVar2.f6186i = 0;
                        }
                    }
                    if (f11 != -1 && x5Var4.f34536w0.f2981a < i13) {
                        x5Var4.L = true;
                    }
                    int[] iArr2 = x5Var4.d;
                    u5 u5Var2 = x5Var4.v;
                    int max = x5Var4.f34536w0.f2981a * Math.max(16, iArr2[4] / Math.max(1, x5Var4.f34534v0.f6183e.size()));
                    u5Var2.f32922e = max;
                    iArr2[3] = max;
                    x5Var4.v.f32923f = false;
                    if (x5Var4.f34534v0.g()) {
                        AndroidUtilities.runOnUIThread(x5Var4.A0);
                    }
                    if (f11 == -1) {
                        AndroidUtilities.runOnUIThread(x5Var4.f34538x0);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(x5Var4.B0);
                        return;
                    }
                }
                if (x5Var4.Z == null) {
                    int[] iArr3 = x5Var4.d;
                    if (iArr3[0] != 0 && iArr3[1] != 0) {
                        AndroidUtilities.runOnUIThread(x5Var4.f34538x0);
                        return;
                    }
                }
                if (x5Var4.v == null) {
                    int[] iArr4 = x5Var4.d;
                    if (iArr4[0] > 0 && iArr4[1] > 0) {
                        if (!x5Var4.h.isEmpty()) {
                            x5Var4.v = (u5) x5Var4.h.remove(0);
                        } else {
                            int[] iArr5 = x5Var4.d;
                            float f12 = x5Var4.f34519i0;
                            x5Var4.v = new u5(Bitmap.createBitmap((int) (iArr5[0] * f12), (int) (iArr5[1] * f12), Bitmap.Config.ARGB_8888));
                        }
                    }
                }
                if (x5Var4.H >= 0) {
                    x5Var4.d[3] = (int) x5Var4.H;
                    long j10 = x5Var4.H;
                    synchronized (x5Var4.M) {
                        x5Var4.H = -1L;
                    }
                    AnimatedFileDrawableStream animatedFileDrawableStream = x5Var4.f34527q0;
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
                    if (x5Var4.Z.c(x5Var4.v.f32920b, false, x5Var4.f34511c0, x5Var4.f34512d0, x5Var4.f34517g0) == 0) {
                        AndroidUtilities.runOnUIThread(x5Var4.f34538x0);
                        return;
                    }
                    if (!x5Var4.f34515f) {
                        if (x5Var4.Z.f26063a[7] == 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        x5Var4.f34515f = z11;
                    }
                    int i15 = x5Var4.d[3];
                    if (i15 < x5Var4.f34510c) {
                        x5Var4.L = true;
                    }
                    if (z10) {
                        x5Var4.f34510c = i15;
                    }
                    u5 u5Var3 = x5Var4.v;
                    u5Var3.f32922e = i15;
                    if (x5Var4.Z.f26063a[6] == 1) {
                        z14 = true;
                    }
                    u5Var3.f32923f = z14;
                }
                AndroidUtilities.runOnUIThread(x5Var4.B0);
                return;
            case 6:
                x5 x5Var5 = this.f33264b;
                ArrayList arrayList = x5Var5.f34525o0;
                int size2 = arrayList.size();
                for (int i16 = 0; i16 < size2; i16++) {
                    ((View) arrayList.get(i16)).invalidate();
                }
                if ((arrayList.isEmpty() || x5Var5.N) && (view = x5Var5.f34524n0) != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 7:
                x5 x5Var6 = this.f33264b;
                x5Var6.f34534v0.b();
                AndroidUtilities.runOnUIThread(new v5(x5Var6, 8));
                return;
            default:
                x5 x5Var7 = this.f33264b;
                if (x5Var7.f34541z0 != null) {
                    ff.h.c();
                    x5Var7.f34541z0 = null;
                }
                x5Var7.f34540y0 = false;
                x5Var7.k();
                x5Var7.x(false);
                return;
        }
    }
}
