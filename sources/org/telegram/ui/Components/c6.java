package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.os.Looper;
import android.view.View;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import org.telegram.messenger.AnimatedFileDrawableStream;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class c6 extends BitmapDrawable implements Animatable, bg.g {
    public static final float[] W0 = new float[8];
    public static final ScheduledThreadPoolExecutor X0 = new ScheduledThreadPoolExecutor(8, new ThreadPoolExecutor.DiscardPolicy());
    public static final PorterDuffXfermode Y0 = new PorterDuffXfermode(PorterDuff.Mode.SRC);
    public final bg.i A0;
    public b7.l B0;
    public final a6 C0;
    public boolean D0;
    public boolean E;
    public a6 E0;
    public boolean F;
    public final a6 F0;
    public boolean G;
    public final a6 G0;
    public final File H;
    public int H0;
    public final long I;
    public final a6 I0;
    public final int J;
    public final a6 J0;
    public final int K;
    public a6 K0;
    public boolean L;
    public boolean L0;
    public volatile long M;
    public long M0;
    public volatile long N;
    public Bitmap N0;
    public boolean O;
    public AnimatedFileNative O0;
    public int P;
    public int P0;
    public boolean Q;
    public int Q0;
    public final Object R;
    public int R0;
    public boolean S;
    public volatile boolean S0;
    public final RectF T;
    public final b6 T0;
    public final int[] U;
    public boolean U0;
    public int[] V;
    public boolean V0;
    public final Matrix[] W;
    public final Path[] X;
    public float Y;
    public float Z;
    public boolean f34067a;
    public boolean f34068a0;
    public boolean f34069b;
    public final RectF f34070b0;
    public int f34071c;
    public volatile boolean f34072c0;
    public final int[] d;
    public volatile boolean f34073d0;
    public a6 f34074e;
    public volatile AnimatedFileNative f34075e0;
    public boolean f34076f;
    public boolean f34077f0;
    public org.telegram.messenger.r5 f34078g0;
    public final ArrayList h;
    public float f34079h0;
    public float f34080i0;
    public int f34081j0;
    public int f34082k0;
    public final boolean f34083l0;
    public final boolean m0;
    public z5 f34084n;
    public float f34085n0;
    public boolean f34086o0;
    public final TLRPC.Document f34087p0;
    public final RectF[] f34088q0;
    public z5 f34089r;
    public final Paint[] f34090r0;
    public z5 f34091s;
    public WeakReference f34092s0;
    public final xe.b f34093t0;
    public final xe.b f34094u0;
    public AnimatedFileDrawableStream f34095v0;
    public z5 f34096w;
    public boolean f34097w0;
    public boolean f34098x;
    public boolean f34099x0;
    public boolean f34100y;
    public boolean f34101y0;
    public int f34102z0;

    public c6(File file, boolean z10, long j3, int i7, TLRPC.Document document, org.telegram.messenger.gc gcVar, Object obj, long j10, int i10, boolean z11) {
        this(file, z10, j3, i7, document, gcVar, obj, j10, i10, z11, 0, 0, null, document != null ? 1 : 0, true);
    }

    public final void A(boolean z10) {
        this.f34101y0 = z10;
        if (z10) {
            this.f34069b = false;
        }
    }

    public final void B(int[] iArr) {
        boolean isEmpty = this.f34093t0.isEmpty();
        int[] iArr2 = this.U;
        if (!isEmpty) {
            if (this.V == null) {
                this.V = new int[4];
            }
            int[] iArr3 = this.V;
            System.arraycopy(iArr2, 0, iArr3, 0, iArr3.length);
        }
        for (int i7 = 0; i7 < 4; i7++) {
            if (!this.f34099x0 && iArr[i7] != iArr2[i7]) {
                this.f34099x0 = true;
            }
            iArr2[i7] = iArr[i7];
        }
    }

    public final void C(long j3, long j10) {
        this.f34079h0 = ((float) j3) / 1000.0f;
        this.f34080i0 = ((float) j10) / 1000.0f;
        if (j3 >= 0 && o() < j3) {
            y(j3, true, false);
        }
    }

    public final void D(long j3) {
        boolean z10;
        this.R0 = 0;
        if (this.S0) {
            this.S0 = false;
            a6 a6Var = new a6(this, 0);
            Typeface typeface = org.telegram.messenger.g0.f24018a;
            if (Looper.myLooper() != Looper.getMainLooper()) {
                org.telegram.messenger.g0.g3(a6Var);
            } else {
                a6Var.run();
            }
        }
        if (!this.U0 && (this.f34072c0 || !this.E)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (this.f34072c0) {
            z5 z5Var = this.f34084n;
            if (z5Var == null && this.f34089r == null) {
                x(false);
            } else if (this.f34089r != null) {
                if (z5Var == null || (z10 && !this.f34067a && this.N < 0)) {
                    z5 z5Var2 = this.f34084n;
                    if (z5Var2 != null) {
                        this.h.add(z5Var2);
                    }
                    this.f34084n = this.f34089r;
                    this.f34089r = this.f34091s;
                    this.f34091s = null;
                    this.U0 = false;
                    x(false);
                }
            }
        } else if (!this.f34072c0 && this.E && z10 && this.f34089r != null) {
            z5 z5Var3 = this.f34084n;
            if (z5Var3 != null) {
                this.h.add(z5Var3);
            }
            this.f34084n = this.f34089r;
            this.f34089r = this.f34091s;
            this.f34091s = null;
            this.U0 = false;
            x(false);
        }
    }

    public final void E() {
        int i7;
        int i10;
        int[] iArr;
        int i11;
        int i12;
        if (!this.f34086o0 && (i7 = this.f34081j0) > 0 && (i10 = this.f34082k0) > 0 && (i11 = (iArr = this.d)[0]) > 0 && (i12 = iArr[1]) > 0) {
            float max = Math.max(i10 / i11, i7 / i12);
            this.f34085n0 = max;
            if (max > 0.0f && max <= 0.7d) {
                return;
            }
            this.f34085n0 = 1.0f;
            return;
        }
        this.f34085n0 = 1.0f;
    }

    @Override
    public final int a(Bitmap bitmap) {
        int i7;
        if (this.O0 == null) {
            return -1;
        }
        Canvas canvas = new Canvas(bitmap);
        Bitmap bitmap2 = this.N0;
        int[] iArr = this.d;
        if (bitmap2 == null) {
            this.N0 = Bitmap.createBitmap(iArr[0], iArr[1], Bitmap.Config.ARGB_8888);
        }
        this.O0.c(this.N0, false, this.f34079h0, this.f34080i0, this.f34083l0);
        long j3 = this.M0;
        if (j3 != 0 && ((i7 = iArr[3]) == 0 || j3 > i7)) {
            return 0;
        }
        int i10 = this.Q0;
        int i11 = iArr[3];
        if (i10 == i11) {
            int i12 = this.P0 + 1;
            this.P0 = i12;
            if (i12 > 5) {
                return 0;
            }
        }
        this.Q0 = i11;
        bitmap.eraseColor(0);
        canvas.save();
        float width = this.f34082k0 / this.N0.getWidth();
        canvas.scale(width, width);
        canvas.drawBitmap(this.N0, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
        this.M0 = iArr[3];
        return 1;
    }

    @Override
    public final void b() {
        this.O0 = AnimatedFileNative.a(this.H.getAbsolutePath(), this.d, this.K, this.I, this.f34095v0, false);
    }

    @Override
    public final void c() {
        AnimatedFileNative animatedFileNative = this.O0;
        if (animatedFileNative != null) {
            animatedFileNative.f();
            this.O0 = null;
        }
    }

    public final void d() {
        int i7;
        if (this.f34082k0 == 0 && this.f34081j0 == 0) {
            int[] iArr = this.d;
            int i10 = iArr[0];
            if (i10 <= 3000 && (i7 = iArr[1]) <= 3000) {
                if (i10 > 2200 || i7 > 2200) {
                    this.f34082k0 = i10 / 2;
                    this.f34081j0 = i7 / 2;
                    return;
                }
                return;
            }
            this.f34082k0 = i10 / 4;
            this.f34081j0 = iArr[1] / 4;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        l(canvas, false, System.currentTimeMillis(), 0);
    }

    public final void e(ImageReceiver imageReceiver) {
        if (imageReceiver != null && this.f34094u0.add(imageReceiver) && this.f34072c0) {
            x(false);
        }
        h();
    }

    public final void f(View view) {
        if (view != null) {
            this.f34093t0.add(view);
        }
    }

    public final void finalize() {
        try {
            this.f34093t0.clear();
            u();
        } finally {
            super.finalize();
        }
    }

    public final boolean g() {
        if (this.m0) {
            if (this.A0 == null) {
                return false;
            }
            return true;
        } else if (this.f34075e0 == null && this.f34100y) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        int i7 = 0;
        if (this.f34100y) {
            int[] iArr = this.d;
            int i10 = iArr[2];
            if (i10 != 90 && i10 != 270) {
                i7 = iArr[1];
            } else {
                i7 = iArr[0];
            }
        }
        if (i7 == 0) {
            return org.telegram.messenger.g0.L(100.0f);
        }
        return (int) (i7 * this.f34085n0);
    }

    @Override
    public final int getIntrinsicWidth() {
        int i7 = 0;
        if (this.f34100y) {
            int[] iArr = this.d;
            int i10 = iArr[2];
            if (i10 != 90 && i10 != 270) {
                i7 = iArr[0];
            } else {
                i7 = iArr[1];
            }
        }
        if (i7 == 0) {
            return org.telegram.messenger.g0.L(100.0f);
        }
        return (int) (i7 * this.f34085n0);
    }

    @Override
    public final int getMinimumHeight() {
        int i7 = 0;
        if (this.f34100y) {
            int[] iArr = this.d;
            int i10 = iArr[2];
            if (i10 != 90 && i10 != 270) {
                i7 = iArr[1];
            } else {
                i7 = iArr[0];
            }
        }
        if (i7 == 0) {
            return org.telegram.messenger.g0.L(100.0f);
        }
        return i7;
    }

    @Override
    public final int getMinimumWidth() {
        int i7 = 0;
        if (this.f34100y) {
            int[] iArr = this.d;
            int i10 = iArr[2];
            if (i10 != 90 && i10 != 270) {
                i7 = iArr[0];
            } else {
                i7 = iArr[1];
            }
        }
        if (i7 == 0) {
            return org.telegram.messenger.g0.L(100.0f);
        }
        return i7;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h() {
        a6 a6Var;
        if (this.A0 != null) {
            boolean isEmpty = this.f34094u0.isEmpty();
            if (isEmpty && this.K0 == null) {
                a6 a6Var2 = new a6(this, 3);
                this.K0 = a6Var2;
                org.telegram.messenger.g0.h3(a6Var2, 600L);
            } else if (!isEmpty && (a6Var = this.K0) != null) {
                org.telegram.messenger.g0.r(a6Var);
                this.K0 = null;
            }
        }
    }

    public final void i() {
        int i7;
        if (this.f34072c0 && !this.S0 && !this.f34076f) {
            if (!this.V0 && (i7 = this.d[5]) > 0) {
                this.V0 = true;
                this.R0 = 0;
                bg.k.d().b(this.T0, i7);
            }
        } else if (this.V0) {
            this.V0 = false;
            this.R0 = 0;
            bg.k.d().g(this.T0);
        }
    }

    @Override
    public final boolean isRunning() {
        return this.f34072c0;
    }

    public final void j() {
        xe.b bVar = this.f34094u0;
        Iterator it = bVar.iterator();
        int i7 = 0;
        int i10 = 0;
        while (it.hasNext()) {
            ImageReceiver imageReceiver = (ImageReceiver) it.next();
            if (!imageReceiver.f22707y1) {
                bVar.remove(imageReceiver);
            } else {
                i7++;
            }
            int i11 = imageReceiver.D1;
            if (i11 > 0 && this.f34102z0 >= i11) {
                i10++;
            }
        }
        if (i7 == i10) {
            stop();
        } else {
            start();
        }
    }

    public final void k() {
        if (!g()) {
            z5 z5Var = this.f34084n;
            if (z5Var != null) {
                z5Var.f42682b.recycle();
                Arrays.fill(z5Var.f42681a, (Object) null);
                this.f34084n = null;
            }
            z5 z5Var2 = this.f34096w;
            if (z5Var2 != null) {
                z5Var2.f42682b.recycle();
                Arrays.fill(z5Var2.f42681a, (Object) null);
                this.f34096w = null;
            }
            org.telegram.messenger.r5 r5Var = this.f34078g0;
            if (r5Var != null) {
                r5Var.recycle();
                this.f34078g0 = null;
            }
            int i7 = 0;
            while (true) {
                ArrayList arrayList = this.h;
                if (i7 < arrayList.size()) {
                    z5 z5Var3 = (z5) arrayList.get(i7);
                    z5Var3.f42682b.recycle();
                    Arrays.fill(z5Var3.f42681a, (Object) null);
                    i7++;
                } else {
                    arrayList.clear();
                    t();
                    return;
                }
            }
        }
    }

    public final void l(android.graphics.Canvas r20, boolean r21, long r22, int r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.c6.l(android.graphics.Canvas, boolean, long, int):void");
    }

    public final Bitmap m() {
        z5 z5Var = this.f34084n;
        if (z5Var != null) {
            return z5Var.f42682b;
        }
        z5 z5Var2 = this.f34089r;
        if (z5Var2 != null) {
            return z5Var2.f42682b;
        }
        z5 z5Var3 = this.f34091s;
        if (z5Var3 != null) {
            return z5Var3.f42682b;
        }
        return null;
    }

    public final float n() {
        if (this.d[4] == 0) {
            return 0.0f;
        }
        if (this.N >= 0) {
            return ((float) this.N) / this.d[4];
        }
        int[] iArr = this.d;
        return iArr[3] / iArr[4];
    }

    public final int o() {
        int i7;
        if (this.N >= 0) {
            return (int) this.N;
        }
        z5 z5Var = this.f34089r;
        if (z5Var != null && (i7 = z5Var.f42684e) != 0) {
            return i7;
        }
        z5 z5Var2 = this.f34084n;
        if (z5Var2 != null) {
            return z5Var2.f42684e;
        }
        return 0;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f34068a0 = true;
    }

    public final Bitmap p() {
        int i7 = this.f34082k0;
        int i10 = this.f34081j0;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap createBitmap = Bitmap.createBitmap(i7, i10, config);
        Canvas canvas = new Canvas(createBitmap);
        AnimatedFileNative a10 = AnimatedFileNative.a(this.H.getAbsolutePath(), this.d, this.K, this.I, this.f34095v0, false);
        if (a10 == null) {
            return createBitmap;
        }
        if (this.N0 == null) {
            int[] iArr = this.d;
            this.N0 = Bitmap.createBitmap(Math.max(1, iArr[0]), Math.max(1, iArr[1]), config);
        }
        a10.c(this.N0, false, this.f34079h0, this.f34080i0, true);
        a10.f();
        createBitmap.eraseColor(0);
        canvas.save();
        float width = this.f34082k0 / this.N0.getWidth();
        canvas.scale(width, width);
        canvas.drawBitmap(this.N0, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
        return createBitmap;
    }

    public final Bitmap q(long j3, boolean z10) {
        int c10;
        if (this.f34100y && this.f34075e0 != null) {
            AnimatedFileDrawableStream animatedFileDrawableStream = this.f34095v0;
            if (animatedFileDrawableStream != null) {
                animatedFileDrawableStream.b(false);
                this.f34095v0.d();
            }
            if (!z10) {
                this.f34075e0.g(j3, z10);
            }
            int[] iArr = this.d;
            Bitmap createBitmap = Bitmap.createBitmap(iArr[0], iArr[1], Bitmap.Config.ARGB_8888);
            if (z10) {
                c10 = this.f34075e0.b(j3, createBitmap);
            } else {
                c10 = this.f34075e0.c(createBitmap, true, 0.0f, 0.0f, true);
            }
            if (c10 != 0) {
                return createBitmap;
            }
            createBitmap.recycle();
        }
        return null;
    }

    public final Bitmap r(boolean z10) {
        if (this.f34075e0 == null) {
            z5 z5Var = this.f34096w;
            if (z5Var != null) {
                return z5Var.f42682b;
            }
            return null;
        }
        if (this.f34096w == null) {
            if (!this.h.isEmpty()) {
                this.f34096w = (z5) this.h.remove(0);
            } else {
                int[] iArr = this.d;
                float f10 = this.f34085n0;
                this.f34096w = new z5(Bitmap.createBitmap((int) (iArr[0] * f10), (int) (iArr[1] * f10), Bitmap.Config.ARGB_8888));
            }
        }
        this.f34075e0.c(this.f34096w.f42682b, false, this.f34079h0, this.f34080i0, z10);
        return this.f34096w.f42682b;
    }

    public final boolean s() {
        if (g()) {
            if (this.f34084n != null || this.f34089r != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void start() {
        if (!this.f34072c0 && !this.f34094u0.isEmpty()) {
            this.f34072c0 = true;
            this.S0 = false;
            x(false);
            org.telegram.messenger.g0.g3(this.J0);
            a6 a6Var = new a6(this, 0);
            if (Looper.myLooper() != Looper.getMainLooper()) {
                org.telegram.messenger.g0.g3(a6Var);
            } else {
                a6Var.run();
            }
        }
    }

    @Override
    public final void stop() {
        this.f34072c0 = false;
        a6 a6Var = new a6(this, 0);
        Typeface typeface = org.telegram.messenger.g0.f24018a;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            org.telegram.messenger.g0.g3(a6Var);
        } else {
            a6Var.run();
        }
    }

    public final void t() {
        Iterator it = this.f34094u0.iterator();
        while (it.hasNext()) {
            ((ImageReceiver) it.next()).invalidate();
        }
    }

    public final void u() {
        if (!this.f34093t0.isEmpty()) {
            this.L = true;
            return;
        }
        int i7 = 0;
        this.f34072c0 = false;
        this.f34073d0 = true;
        a6 a6Var = new a6(this, 0);
        Typeface typeface = org.telegram.messenger.g0.f24018a;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            org.telegram.messenger.g0.g3(a6Var);
        } else {
            a6Var.run();
        }
        if (this.E0 != null) {
            bg.i.c();
            oh0.U0.cancelRunnable(this.E0);
            this.E0 = null;
        }
        if (this.f34074e == null) {
            if (this.f34075e0 != null) {
                this.f34075e0.f();
                this.f34075e0 = null;
            }
            ArrayList arrayList = new ArrayList();
            z5 z5Var = this.f34084n;
            if (z5Var != null) {
                arrayList.add(z5Var.f42682b);
            }
            z5 z5Var2 = this.f34089r;
            if (z5Var2 != null) {
                arrayList.add(z5Var2.f42682b);
            }
            z5 z5Var3 = this.f34091s;
            if (z5Var3 != null) {
                arrayList.add(z5Var3.f42682b);
            }
            z5 z5Var4 = this.f34096w;
            if (z5Var4 != null) {
                arrayList.add(z5Var4.f42682b);
            }
            ArrayList arrayList2 = this.h;
            int size = arrayList2.size();
            while (i7 < size) {
                Object obj = arrayList2.get(i7);
                i7++;
                z5 z5Var5 = (z5) obj;
                if (z5Var5 != null) {
                    arrayList.add(z5Var5.f42682b);
                }
            }
            this.h.clear();
            this.f34084n = null;
            this.f34089r = null;
            this.f34091s = null;
            this.f34096w = null;
            org.telegram.messenger.r5 r5Var = this.f34078g0;
            if (r5Var != null) {
                r5Var.recycle();
                this.f34078g0 = null;
            }
            getPaint().setShader(null);
            org.telegram.messenger.g0.A2(arrayList);
        } else {
            this.f34098x = true;
        }
        AnimatedFileDrawableStream animatedFileDrawableStream = this.f34095v0;
        if (animatedFileDrawableStream != null) {
            animatedFileDrawableStream.b(true);
            this.f34095v0 = null;
        }
        a6 a6Var2 = new a6(this, 2);
        if (Looper.myLooper() != Looper.getMainLooper()) {
            org.telegram.messenger.g0.g3(a6Var2);
        } else {
            a6Var2.run();
        }
    }

    public final void v(ImageReceiver imageReceiver) {
        xe.b bVar = this.f34094u0;
        bVar.remove(imageReceiver);
        if (bVar.isEmpty()) {
            this.f34102z0 = 0;
        }
        h();
    }

    public final void w(View view) {
        xe.b bVar = this.f34093t0;
        bVar.remove(view);
        if (bVar.isEmpty()) {
            if (this.L) {
                u();
                return;
            }
            int[] iArr = this.V;
            if (iArr != null) {
                B(iArr);
            }
        }
    }

    public final void x(boolean z10) {
        a6 a6Var;
        a6 a6Var2;
        if (this.f34074e == null || z10) {
            if ((this.f34069b && (this.f34091s == null || (!this.L0 && this.N >= 0))) || this.f34089r == null) {
                if ((this.f34084n == null || !this.f34076f) && g() && !this.f34098x) {
                    if ((this.f34072c0 || (this.E && !this.F)) && !this.f34094u0.isEmpty() && !this.D0) {
                        if (this.f34097w0) {
                            if (this.f34101y0) {
                                a6 a6Var3 = this.I0;
                                this.f34074e = a6Var3;
                                org.telegram.messenger.s5.a(a6Var3);
                            } else {
                                if (z10 && (a6Var2 = this.f34074e) != null) {
                                    X0.remove(a6Var2);
                                }
                                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = X0;
                                a6 a6Var4 = this.I0;
                                this.f34074e = a6Var4;
                                scheduledThreadPoolExecutor.execute(a6Var4);
                            }
                        } else {
                            if (this.f34078g0 == null) {
                                this.f34078g0 = new org.telegram.messenger.r5("decodeQueue" + this, true);
                            }
                            if (z10 && (a6Var = this.f34074e) != null) {
                                this.f34078g0.cancelRunnable(a6Var);
                            }
                            org.telegram.messenger.r5 r5Var = this.f34078g0;
                            a6 a6Var5 = this.I0;
                            this.f34074e = a6Var5;
                            r5Var.postRunnable(a6Var5, 0L);
                        }
                        this.L0 = true;
                    }
                }
            }
        }
    }

    public final void y(long j3, boolean z10, boolean z11) {
        AnimatedFileDrawableStream animatedFileDrawableStream;
        int i7;
        synchronized (this.R) {
            try {
                this.M = j3;
                this.N = j3;
                this.L0 = false;
                if (this.f34075e0 != null) {
                    this.f34075e0.e();
                }
                if (this.f34100y && (animatedFileDrawableStream = this.f34095v0) != null) {
                    animatedFileDrawableStream.b(z10);
                    this.O = z10;
                    if (z10) {
                        i7 = 0;
                    } else {
                        i7 = 10;
                    }
                    this.P = i7;
                }
                if (z11 && this.E) {
                    this.F = false;
                    if (this.f34074e == null) {
                        x(true);
                    } else {
                        this.G = true;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void z(float f10, float f11, float f12, float f13) {
        float f14 = f13 + f11;
        float f15 = f12 + f10;
        RectF rectF = this.T;
        if (rectF.left == f10 && rectF.top == f11 && rectF.right == f15 && rectF.bottom == f14) {
            return;
        }
        rectF.set(f10, f11, f15, f14);
        this.f34099x0 = true;
    }

    public c6(java.io.File r19, boolean r20, long r21, int r23, org.telegram.tgnet.TLRPC.Document r24, org.telegram.messenger.gc r25, java.lang.Object r26, long r27, int r29, boolean r30, int r31, int r32, bg.f r33, int r34, boolean r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.c6.<init>(java.io.File, boolean, long, int, org.telegram.tgnet.TLRPC$Document, org.telegram.messenger.gc, java.lang.Object, long, int, boolean, int, int, bg.f, int, boolean):void");
    }
}
