package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimatedFileDrawableStream;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
public final class w5 implements Runnable {
    public final int f32644a;
    public final y5 f32645b;

    public w5(y5 y5Var, int i10) {
        this.f32644a = i10;
        this.f32645b = y5Var;
    }

    @Override
    public final void run() {
        int i10;
        boolean z4;
        boolean z10;
        boolean z11;
        boolean z12;
        View view;
        switch (this.f32644a) {
            case 0:
                this.f32645b.i();
                return;
            case 1:
                lf.g gVar = this.f32645b.f33352w0;
                return;
            case 2:
                y5 y5Var = this.f32645b;
                y5Var.k();
                y5Var.f33329e = null;
                if (y5Var.J >= 0 && y5Var.I == -1) {
                    y5Var.J = -1L;
                }
                y5Var.x(false);
                y5Var.t();
                return;
            case 3:
                y5 y5Var2 = this.f32645b;
                if (!y5Var2.Z && !y5Var2.f33351w && !y5Var2.f33357z0 && y5Var2.A0 == null) {
                    y5Var2.f33328d0 = (float) System.currentTimeMillis();
                    if (hj0.Q0 == null) {
                        hj0.Q0 = new DispatchQueue("cache generator queue");
                    }
                    y5Var2.f33357z0 = true;
                    y5Var2.f33329e = null;
                    lf.g.A++;
                    DispatchQueue dispatchQueue = hj0.Q0;
                    w5 w5Var = new w5(y5Var2, 7);
                    y5Var2.A0 = w5Var;
                    dispatchQueue.postRunnable(w5Var);
                    return;
                }
                return;
            case 4:
                y5 y5Var3 = this.f32645b;
                y5Var3.k();
                if (y5Var3.f33345r0 != null && y5Var3.K) {
                    FileLoader.getInstance(y5Var3.G).removeLoadingVideo(y5Var3.f33345r0.getDocument(), false, false);
                }
                int i11 = y5Var3.L;
                if (i11 <= 0) {
                    y5Var3.K = true;
                } else {
                    y5Var3.L = i11 - 1;
                }
                if (!y5Var3.C) {
                    y5Var3.B = true;
                } else {
                    y5Var3.C = false;
                }
                y5Var3.f33329e = null;
                if (y5Var3.J >= 0) {
                    y5Var3.f33344r = y5Var3.v;
                    y5Var3.f33346s = null;
                } else if (!y5Var3.f33324b) {
                    y5Var3.f33344r = y5Var3.v;
                } else {
                    v5 v5Var = y5Var3.f33344r;
                    if (v5Var == null && y5Var3.f33346s == null) {
                        y5Var3.f33344r = y5Var3.v;
                    } else if (v5Var == null) {
                        y5Var3.f33344r = y5Var3.f33346s;
                        y5Var3.f33346s = y5Var3.v;
                    } else {
                        y5Var3.f33346s = y5Var3.v;
                    }
                }
                y5Var3.v = null;
                if (y5Var3.M) {
                    y5Var3.M = false;
                    y5Var3.f33350v0++;
                    y5Var3.j();
                }
                if (y5Var3.d[3] < y5Var3.f33326c) {
                    float f10 = y5Var3.f33328d0;
                    if (f10 > 0.0f) {
                        i10 = (int) (f10 * 1000.0f);
                    } else {
                        i10 = 0;
                    }
                    y5Var3.f33326c = i10;
                }
                if (y5Var3.J >= 0 && y5Var3.I == -1) {
                    y5Var3.J = -1L;
                }
                y5Var3.f33326c = y5Var3.d[3];
                int size = y5Var3.f33342p0.size();
                for (int i12 = 0; i12 < size; i12++) {
                    ((View) y5Var3.f33342p0.get(i12)).invalidate();
                }
                if ((!y5Var3.Y && y5Var3.f33355y) || (y5Var3.f33339n == null && y5Var3.f33344r != null)) {
                    y5Var3.t();
                }
                y5Var3.x(false);
                return;
            case 5:
                y5 y5Var4 = this.f32645b;
                if (y5Var4.Z) {
                    AndroidUtilities.runOnUIThread(y5Var4.C0);
                    return;
                }
                boolean z13 = false;
                if (!y5Var4.f33353x && y5Var4.f33323a0 == null) {
                    y5Var4.f33323a0 = AnimatedFileNative.a(y5Var4.D.getAbsolutePath(), y5Var4.d, y5Var4.G, y5Var4.E, y5Var4.f33345r0, false);
                    if (y5Var4.f33323a0 == null && (!y5Var4.f33337k0 || y5Var4.D0 > 15)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    y5Var4.f33325b0 = z11;
                    if (y5Var4.f33323a0 != null) {
                        int[] iArr = y5Var4.d;
                        if (iArr[0] > 3840 || iArr[1] > 3840) {
                            y5Var4.f33323a0.f();
                            y5Var4.f33323a0 = null;
                        }
                    }
                    y5Var4.d();
                    y5Var4.E();
                    if (y5Var4.f33337k0 && y5Var4.f33323a0 == null) {
                        int i13 = y5Var4.D0;
                        y5Var4.D0 = i13 + 1;
                        if (i13 <= 15) {
                            z12 = false;
                            y5Var4.f33353x = z12;
                            AndroidUtilities.runOnUIThread(new w5(y5Var4, 0));
                        }
                    }
                    z12 = true;
                    y5Var4.f33353x = z12;
                    AndroidUtilities.runOnUIThread(new w5(y5Var4, 0));
                }
                try {
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
                if (y5Var4.f33352w0 != null) {
                    if (y5Var4.v == null) {
                        if (!y5Var4.h.isEmpty()) {
                            y5Var4.v = (v5) y5Var4.h.remove(0);
                        } else {
                            y5Var4.v = new v5(Bitmap.createBitmap(y5Var4.f33333g0, y5Var4.f33332f0, Bitmap.Config.ARGB_8888));
                        }
                    }
                    if (y5Var4.f33354x0 == null) {
                        y5Var4.f33354x0 = new Object();
                    }
                    System.currentTimeMillis();
                    c5.c cVar = y5Var4.f33354x0;
                    int i14 = cVar.f2264a;
                    lf.g gVar2 = y5Var4.f33352w0;
                    int f11 = gVar2.f(y5Var4.v.f31793b, gVar2.f12436i);
                    cVar.f2264a = gVar2.f12436i;
                    if (gVar2.f12444q && !gVar2.f12433e.isEmpty()) {
                        int i15 = gVar2.f12436i + 1;
                        gVar2.f12436i = i15;
                        if (i15 >= gVar2.f12433e.size()) {
                            gVar2.f12436i = 0;
                        }
                    }
                    if (f11 != -1 && y5Var4.f33354x0.f2264a < i14) {
                        y5Var4.M = true;
                    }
                    int[] iArr2 = y5Var4.d;
                    v5 v5Var2 = y5Var4.v;
                    int max = y5Var4.f33354x0.f2264a * Math.max(16, iArr2[4] / Math.max(1, y5Var4.f33352w0.f12433e.size()));
                    v5Var2.f31795e = max;
                    iArr2[3] = max;
                    y5Var4.v.f31796f = false;
                    if (y5Var4.f33352w0.g()) {
                        AndroidUtilities.runOnUIThread(y5Var4.B0);
                    }
                    if (f11 == -1) {
                        AndroidUtilities.runOnUIThread(y5Var4.f33356y0);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(y5Var4.C0);
                        return;
                    }
                }
                if (y5Var4.f33323a0 == null) {
                    int[] iArr3 = y5Var4.d;
                    if (iArr3[0] != 0 && iArr3[1] != 0) {
                        AndroidUtilities.runOnUIThread(y5Var4.f33356y0);
                        return;
                    }
                }
                if (y5Var4.v == null) {
                    int[] iArr4 = y5Var4.d;
                    if (iArr4[0] > 0 && iArr4[1] > 0) {
                        if (!y5Var4.h.isEmpty()) {
                            y5Var4.v = (v5) y5Var4.h.remove(0);
                        } else {
                            int[] iArr5 = y5Var4.d;
                            float f12 = y5Var4.f33336j0;
                            y5Var4.v = new v5(Bitmap.createBitmap((int) (iArr5[0] * f12), (int) (iArr5[1] * f12), Bitmap.Config.ARGB_8888));
                        }
                    }
                }
                if (y5Var4.I >= 0) {
                    y5Var4.d[3] = (int) y5Var4.I;
                    long j10 = y5Var4.I;
                    synchronized (y5Var4.N) {
                        y5Var4.I = -1L;
                    }
                    AnimatedFileDrawableStream animatedFileDrawableStream = y5Var4.f33345r0;
                    if (animatedFileDrawableStream != null) {
                        animatedFileDrawableStream.reset();
                    }
                    y5Var4.f33323a0.g(j10, true);
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (y5Var4.v != null) {
                    System.currentTimeMillis();
                    if (y5Var4.f33323a0.c(y5Var4.v.f31793b, false, y5Var4.f33328d0, y5Var4.f33330e0, y5Var4.f33334h0) == 0) {
                        AndroidUtilities.runOnUIThread(y5Var4.f33356y0);
                        return;
                    }
                    if (!y5Var4.f33331f) {
                        if (y5Var4.f33323a0.f24559a[7] == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        y5Var4.f33331f = z10;
                    }
                    int i16 = y5Var4.d[3];
                    if (i16 < y5Var4.f33326c) {
                        y5Var4.M = true;
                    }
                    if (z4) {
                        y5Var4.f33326c = i16;
                    }
                    v5 v5Var3 = y5Var4.v;
                    v5Var3.f31795e = i16;
                    if (y5Var4.f33323a0.f24559a[6] == 1) {
                        z13 = true;
                    }
                    v5Var3.f31796f = z13;
                }
                AndroidUtilities.runOnUIThread(y5Var4.C0);
                return;
            case 6:
                y5 y5Var5 = this.f32645b;
                ArrayList arrayList = y5Var5.f33342p0;
                int size2 = arrayList.size();
                for (int i17 = 0; i17 < size2; i17++) {
                    ((View) arrayList.get(i17)).invalidate();
                }
                if ((arrayList.isEmpty() || y5Var5.O) && (view = y5Var5.f33341o0) != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 7:
                y5 y5Var6 = this.f32645b;
                y5Var6.f33352w0.b();
                AndroidUtilities.runOnUIThread(new w5(y5Var6, 8));
                return;
            default:
                y5 y5Var7 = this.f32645b;
                if (y5Var7.A0 != null) {
                    lf.g.c();
                    y5Var7.A0 = null;
                }
                y5Var7.f33357z0 = false;
                y5Var7.k();
                y5Var7.x(false);
                return;
        }
    }
}
