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
public final class b6 extends BitmapDrawable implements Animatable, bg.g {
    public static final float[] W0 = new float[8];
    public static final ScheduledThreadPoolExecutor X0 = new ScheduledThreadPoolExecutor(8, new ThreadPoolExecutor.DiscardPolicy());
    public static final PorterDuffXfermode Y0 = new PorterDuffXfermode(PorterDuff.Mode.SRC);
    public final bg.i A0;
    public b7.l B0;
    public final z5 C0;
    public boolean D0;
    public boolean E;
    public z5 E0;
    public boolean F;
    public final z5 F0;
    public boolean G;
    public final z5 G0;
    public final File H;
    public int H0;
    public final long I;
    public final z5 I0;
    public final int J;
    public final z5 J0;
    public final int K;
    public z5 K0;
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
    public final a6 T0;
    public final int[] U;
    public boolean U0;
    public int[] V;
    public boolean V0;
    public final Matrix[] W;
    public final Path[] X;
    public float Y;
    public float Z;
    public boolean f33636a;
    public boolean f33637a0;
    public boolean f33638b;
    public final RectF f33639b0;
    public int f33640c;
    public volatile boolean f33641c0;
    public final int[] d;
    public volatile boolean f33642d0;
    public z5 f33643e;
    public volatile AnimatedFileNative f33644e0;
    public boolean f33645f;
    public boolean f33646f0;
    public org.telegram.messenger.r5 f33647g0;
    public final ArrayList h;
    public float f33648h0;
    public float f33649i0;
    public int f33650j0;
    public int f33651k0;
    public final boolean f33652l0;
    public final boolean m0;
    public y5 f33653n;
    public float f33654n0;
    public boolean f33655o0;
    public final TLRPC.Document f33656p0;
    public final RectF[] f33657q0;
    public y5 f33658r;
    public final Paint[] f33659r0;
    public y5 f33660s;
    public WeakReference f33661s0;
    public final xe.b f33662t0;
    public final xe.b f33663u0;
    public AnimatedFileDrawableStream f33664v0;
    public y5 f33665w;
    public boolean f33666w0;
    public boolean f33667x;
    public boolean f33668x0;
    public boolean f33669y;
    public boolean f33670y0;
    public int f33671z0;

    public b6(File file, boolean z10, long j3, int i7, TLRPC.Document document, org.telegram.messenger.fc fcVar, Object obj, long j10, int i10, boolean z11) {
        this(file, z10, j3, i7, document, fcVar, obj, j10, i10, z11, 0, 0, null, document != null ? 1 : 0, true);
    }

    public final void A(boolean z10) {
        this.f33670y0 = z10;
        if (z10) {
            this.f33638b = false;
        }
    }

    public final void B(int[] iArr) {
        boolean isEmpty = this.f33662t0.isEmpty();
        int[] iArr2 = this.U;
        if (!isEmpty) {
            if (this.V == null) {
                this.V = new int[4];
            }
            int[] iArr3 = this.V;
            System.arraycopy(iArr2, 0, iArr3, 0, iArr3.length);
        }
        for (int i7 = 0; i7 < 4; i7++) {
            if (!this.f33668x0 && iArr[i7] != iArr2[i7]) {
                this.f33668x0 = true;
            }
            iArr2[i7] = iArr[i7];
        }
    }

    public final void C(long j3, long j10) {
        this.f33648h0 = ((float) j3) / 1000.0f;
        this.f33649i0 = ((float) j10) / 1000.0f;
        if (j3 >= 0 && o() < j3) {
            y(j3, true, false);
        }
    }

    public final void D(long j3) {
        boolean z10;
        this.R0 = 0;
        if (this.S0) {
            this.S0 = false;
            z5 z5Var = new z5(this, 0);
            Typeface typeface = org.telegram.messenger.g0.f24198a;
            if (Looper.myLooper() != Looper.getMainLooper()) {
                org.telegram.messenger.g0.g3(z5Var);
            } else {
                z5Var.run();
            }
        }
        if (!this.U0 && (this.f33641c0 || !this.E)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (this.f33641c0) {
            y5 y5Var = this.f33653n;
            if (y5Var == null && this.f33658r == null) {
                x(false);
            } else if (this.f33658r != null) {
                if (y5Var == null || (z10 && !this.f33636a && this.N < 0)) {
                    y5 y5Var2 = this.f33653n;
                    if (y5Var2 != null) {
                        this.h.add(y5Var2);
                    }
                    this.f33653n = this.f33658r;
                    this.f33658r = this.f33660s;
                    this.f33660s = null;
                    this.U0 = false;
                    x(false);
                }
            }
        } else if (!this.f33641c0 && this.E && z10 && this.f33658r != null) {
            y5 y5Var3 = this.f33653n;
            if (y5Var3 != null) {
                this.h.add(y5Var3);
            }
            this.f33653n = this.f33658r;
            this.f33658r = this.f33660s;
            this.f33660s = null;
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
        if (!this.f33655o0 && (i7 = this.f33650j0) > 0 && (i10 = this.f33651k0) > 0 && (i11 = (iArr = this.d)[0]) > 0 && (i12 = iArr[1]) > 0) {
            float max = Math.max(i10 / i11, i7 / i12);
            this.f33654n0 = max;
            if (max > 0.0f && max <= 0.7d) {
                return;
            }
            this.f33654n0 = 1.0f;
            return;
        }
        this.f33654n0 = 1.0f;
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
        this.O0.c(this.N0, false, this.f33648h0, this.f33649i0, this.f33652l0);
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
        float width = this.f33651k0 / this.N0.getWidth();
        canvas.scale(width, width);
        canvas.drawBitmap(this.N0, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
        this.M0 = iArr[3];
        return 1;
    }

    @Override
    public final void b() {
        this.O0 = AnimatedFileNative.a(this.H.getAbsolutePath(), this.d, this.K, this.I, this.f33664v0, false);
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
        if (this.f33651k0 == 0 && this.f33650j0 == 0) {
            int[] iArr = this.d;
            int i10 = iArr[0];
            if (i10 <= 3000 && (i7 = iArr[1]) <= 3000) {
                if (i10 > 2200 || i7 > 2200) {
                    this.f33651k0 = i10 / 2;
                    this.f33650j0 = i7 / 2;
                    return;
                }
                return;
            }
            this.f33651k0 = i10 / 4;
            this.f33650j0 = iArr[1] / 4;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        l(canvas, false, System.currentTimeMillis(), 0);
    }

    public final void e(ImageReceiver imageReceiver) {
        if (imageReceiver != null && this.f33663u0.add(imageReceiver) && this.f33641c0) {
            x(false);
        }
        h();
    }

    public final void f(View view) {
        if (view != null) {
            this.f33662t0.add(view);
        }
    }

    public final void finalize() {
        try {
            this.f33662t0.clear();
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
        } else if (this.f33644e0 == null && this.f33669y) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        int i7 = 0;
        if (this.f33669y) {
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
        return (int) (i7 * this.f33654n0);
    }

    @Override
    public final int getIntrinsicWidth() {
        int i7 = 0;
        if (this.f33669y) {
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
        return (int) (i7 * this.f33654n0);
    }

    @Override
    public final int getMinimumHeight() {
        int i7 = 0;
        if (this.f33669y) {
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
        if (this.f33669y) {
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
        z5 z5Var;
        if (this.A0 != null) {
            boolean isEmpty = this.f33663u0.isEmpty();
            if (isEmpty && this.K0 == null) {
                z5 z5Var2 = new z5(this, 3);
                this.K0 = z5Var2;
                org.telegram.messenger.g0.h3(z5Var2, 600L);
            } else if (!isEmpty && (z5Var = this.K0) != null) {
                org.telegram.messenger.g0.r(z5Var);
                this.K0 = null;
            }
        }
    }

    public final void i() {
        int i7;
        if (this.f33641c0 && !this.S0 && !this.f33645f) {
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
        return this.f33641c0;
    }

    public final void j() {
        xe.b bVar = this.f33663u0;
        Iterator it = bVar.iterator();
        int i7 = 0;
        int i10 = 0;
        while (it.hasNext()) {
            ImageReceiver imageReceiver = (ImageReceiver) it.next();
            if (!imageReceiver.f22774y1) {
                bVar.remove(imageReceiver);
            } else {
                i7++;
            }
            int i11 = imageReceiver.D1;
            if (i11 > 0 && this.f33671z0 >= i11) {
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
            y5 y5Var = this.f33653n;
            if (y5Var != null) {
                y5Var.f42358b.recycle();
                Arrays.fill(y5Var.f42357a, (Object) null);
                this.f33653n = null;
            }
            y5 y5Var2 = this.f33665w;
            if (y5Var2 != null) {
                y5Var2.f42358b.recycle();
                Arrays.fill(y5Var2.f42357a, (Object) null);
                this.f33665w = null;
            }
            org.telegram.messenger.r5 r5Var = this.f33647g0;
            if (r5Var != null) {
                r5Var.recycle();
                this.f33647g0 = null;
            }
            int i7 = 0;
            while (true) {
                ArrayList arrayList = this.h;
                if (i7 < arrayList.size()) {
                    y5 y5Var3 = (y5) arrayList.get(i7);
                    y5Var3.f42358b.recycle();
                    Arrays.fill(y5Var3.f42357a, (Object) null);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b6.l(android.graphics.Canvas, boolean, long, int):void");
    }

    public final Bitmap m() {
        y5 y5Var = this.f33653n;
        if (y5Var != null) {
            return y5Var.f42358b;
        }
        y5 y5Var2 = this.f33658r;
        if (y5Var2 != null) {
            return y5Var2.f42358b;
        }
        y5 y5Var3 = this.f33660s;
        if (y5Var3 != null) {
            return y5Var3.f42358b;
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
        y5 y5Var = this.f33658r;
        if (y5Var != null && (i7 = y5Var.f42360e) != 0) {
            return i7;
        }
        y5 y5Var2 = this.f33653n;
        if (y5Var2 != null) {
            return y5Var2.f42360e;
        }
        return 0;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f33637a0 = true;
    }

    public final Bitmap p() {
        int i7 = this.f33651k0;
        int i10 = this.f33650j0;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap createBitmap = Bitmap.createBitmap(i7, i10, config);
        Canvas canvas = new Canvas(createBitmap);
        AnimatedFileNative a10 = AnimatedFileNative.a(this.H.getAbsolutePath(), this.d, this.K, this.I, this.f33664v0, false);
        if (a10 == null) {
            return createBitmap;
        }
        if (this.N0 == null) {
            int[] iArr = this.d;
            this.N0 = Bitmap.createBitmap(Math.max(1, iArr[0]), Math.max(1, iArr[1]), config);
        }
        a10.c(this.N0, false, this.f33648h0, this.f33649i0, true);
        a10.f();
        createBitmap.eraseColor(0);
        canvas.save();
        float width = this.f33651k0 / this.N0.getWidth();
        canvas.scale(width, width);
        canvas.drawBitmap(this.N0, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
        return createBitmap;
    }

    public final Bitmap q(long j3, boolean z10) {
        int c10;
        if (this.f33669y && this.f33644e0 != null) {
            AnimatedFileDrawableStream animatedFileDrawableStream = this.f33664v0;
            if (animatedFileDrawableStream != null) {
                animatedFileDrawableStream.b(false);
                this.f33664v0.d();
            }
            if (!z10) {
                this.f33644e0.g(j3, z10);
            }
            int[] iArr = this.d;
            Bitmap createBitmap = Bitmap.createBitmap(iArr[0], iArr[1], Bitmap.Config.ARGB_8888);
            if (z10) {
                c10 = this.f33644e0.b(j3, createBitmap);
            } else {
                c10 = this.f33644e0.c(createBitmap, true, 0.0f, 0.0f, true);
            }
            if (c10 != 0) {
                return createBitmap;
            }
            createBitmap.recycle();
        }
        return null;
    }

    public final Bitmap r(boolean z10) {
        if (this.f33644e0 == null) {
            y5 y5Var = this.f33665w;
            if (y5Var != null) {
                return y5Var.f42358b;
            }
            return null;
        }
        if (this.f33665w == null) {
            if (!this.h.isEmpty()) {
                this.f33665w = (y5) this.h.remove(0);
            } else {
                int[] iArr = this.d;
                float f10 = this.f33654n0;
                this.f33665w = new y5(Bitmap.createBitmap((int) (iArr[0] * f10), (int) (iArr[1] * f10), Bitmap.Config.ARGB_8888));
            }
        }
        this.f33644e0.c(this.f33665w.f42358b, false, this.f33648h0, this.f33649i0, z10);
        return this.f33665w.f42358b;
    }

    public final boolean s() {
        if (g()) {
            if (this.f33653n != null || this.f33658r != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void start() {
        if (!this.f33641c0 && !this.f33663u0.isEmpty()) {
            this.f33641c0 = true;
            this.S0 = false;
            x(false);
            org.telegram.messenger.g0.g3(this.J0);
            z5 z5Var = new z5(this, 0);
            if (Looper.myLooper() != Looper.getMainLooper()) {
                org.telegram.messenger.g0.g3(z5Var);
            } else {
                z5Var.run();
            }
        }
    }

    @Override
    public final void stop() {
        this.f33641c0 = false;
        z5 z5Var = new z5(this, 0);
        Typeface typeface = org.telegram.messenger.g0.f24198a;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            org.telegram.messenger.g0.g3(z5Var);
        } else {
            z5Var.run();
        }
    }

    public final void t() {
        Iterator it = this.f33663u0.iterator();
        while (it.hasNext()) {
            ((ImageReceiver) it.next()).invalidate();
        }
    }

    public final void u() {
        if (!this.f33662t0.isEmpty()) {
            this.L = true;
            return;
        }
        int i7 = 0;
        this.f33641c0 = false;
        this.f33642d0 = true;
        z5 z5Var = new z5(this, 0);
        Typeface typeface = org.telegram.messenger.g0.f24198a;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            org.telegram.messenger.g0.g3(z5Var);
        } else {
            z5Var.run();
        }
        if (this.E0 != null) {
            bg.i.c();
            nh0.U0.cancelRunnable(this.E0);
            this.E0 = null;
        }
        if (this.f33643e == null) {
            if (this.f33644e0 != null) {
                this.f33644e0.f();
                this.f33644e0 = null;
            }
            ArrayList arrayList = new ArrayList();
            y5 y5Var = this.f33653n;
            if (y5Var != null) {
                arrayList.add(y5Var.f42358b);
            }
            y5 y5Var2 = this.f33658r;
            if (y5Var2 != null) {
                arrayList.add(y5Var2.f42358b);
            }
            y5 y5Var3 = this.f33660s;
            if (y5Var3 != null) {
                arrayList.add(y5Var3.f42358b);
            }
            y5 y5Var4 = this.f33665w;
            if (y5Var4 != null) {
                arrayList.add(y5Var4.f42358b);
            }
            ArrayList arrayList2 = this.h;
            int size = arrayList2.size();
            while (i7 < size) {
                Object obj = arrayList2.get(i7);
                i7++;
                y5 y5Var5 = (y5) obj;
                if (y5Var5 != null) {
                    arrayList.add(y5Var5.f42358b);
                }
            }
            this.h.clear();
            this.f33653n = null;
            this.f33658r = null;
            this.f33660s = null;
            this.f33665w = null;
            org.telegram.messenger.r5 r5Var = this.f33647g0;
            if (r5Var != null) {
                r5Var.recycle();
                this.f33647g0 = null;
            }
            getPaint().setShader(null);
            org.telegram.messenger.g0.A2(arrayList);
        } else {
            this.f33667x = true;
        }
        AnimatedFileDrawableStream animatedFileDrawableStream = this.f33664v0;
        if (animatedFileDrawableStream != null) {
            animatedFileDrawableStream.b(true);
            this.f33664v0 = null;
        }
        z5 z5Var2 = new z5(this, 2);
        if (Looper.myLooper() != Looper.getMainLooper()) {
            org.telegram.messenger.g0.g3(z5Var2);
        } else {
            z5Var2.run();
        }
    }

    public final void v(ImageReceiver imageReceiver) {
        xe.b bVar = this.f33663u0;
        bVar.remove(imageReceiver);
        if (bVar.isEmpty()) {
            this.f33671z0 = 0;
        }
        h();
    }

    public final void w(View view) {
        xe.b bVar = this.f33662t0;
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
        z5 z5Var;
        z5 z5Var2;
        if (this.f33643e == null || z10) {
            if ((this.f33638b && (this.f33660s == null || (!this.L0 && this.N >= 0))) || this.f33658r == null) {
                if ((this.f33653n == null || !this.f33645f) && g() && !this.f33667x) {
                    if ((this.f33641c0 || (this.E && !this.F)) && !this.f33663u0.isEmpty() && !this.D0) {
                        if (this.f33666w0) {
                            if (this.f33670y0) {
                                z5 z5Var3 = this.I0;
                                this.f33643e = z5Var3;
                                org.telegram.messenger.s5.a(z5Var3);
                            } else {
                                if (z10 && (z5Var2 = this.f33643e) != null) {
                                    X0.remove(z5Var2);
                                }
                                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = X0;
                                z5 z5Var4 = this.I0;
                                this.f33643e = z5Var4;
                                scheduledThreadPoolExecutor.execute(z5Var4);
                            }
                        } else {
                            if (this.f33647g0 == null) {
                                this.f33647g0 = new org.telegram.messenger.r5("decodeQueue" + this, true);
                            }
                            if (z10 && (z5Var = this.f33643e) != null) {
                                this.f33647g0.cancelRunnable(z5Var);
                            }
                            org.telegram.messenger.r5 r5Var = this.f33647g0;
                            z5 z5Var5 = this.I0;
                            this.f33643e = z5Var5;
                            r5Var.postRunnable(z5Var5, 0L);
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
                if (this.f33644e0 != null) {
                    this.f33644e0.e();
                }
                if (this.f33669y && (animatedFileDrawableStream = this.f33664v0) != null) {
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
                    if (this.f33643e == null) {
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
        this.f33668x0 = true;
    }

    public b6(java.io.File r19, boolean r20, long r21, int r23, org.telegram.tgnet.TLRPC.Document r24, org.telegram.messenger.fc r25, java.lang.Object r26, long r27, int r29, boolean r30, int r31, int r32, bg.f r33, int r34, boolean r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b6.<init>(java.io.File, boolean, long, int, org.telegram.tgnet.TLRPC$Document, org.telegram.messenger.fc, java.lang.Object, long, int, boolean, int, int, bg.f, int, boolean):void");
    }
}
