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
public final class t5 extends BitmapDrawable implements Animatable, cg.f {
    public static final float[] W0 = new float[8];
    public static final ScheduledThreadPoolExecutor X0 = new ScheduledThreadPoolExecutor(8, new ThreadPoolExecutor.DiscardPolicy());
    public static final PorterDuffXfermode Y0 = new PorterDuffXfermode(PorterDuff.Mode.SRC);
    public final cg.h A0;
    public a7.l B0;
    public final r5 C0;
    public boolean D0;
    public boolean E;
    public r5 E0;
    public boolean F;
    public final r5 F0;
    public boolean G;
    public final r5 G0;
    public final File H;
    public int H0;
    public final long I;
    public final r5 I0;
    public final int J;
    public final r5 J0;
    public final int K;
    public r5 K0;
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
    public final s5 T0;
    public final int[] U;
    public boolean U0;
    public int[] V;
    public boolean V0;
    public final Matrix[] W;
    public final Path[] X;
    public float Y;
    public float Z;
    public boolean f38252a;
    public boolean f38253a0;
    public boolean f38254b;
    public final RectF f38255b0;
    public int f38256c;
    public volatile boolean f38257c0;
    public final int[] d;
    public volatile boolean f38258d0;
    public r5 f38259e;
    public volatile AnimatedFileNative f38260e0;
    public boolean f38261f;
    public boolean f38262f0;
    public org.telegram.messenger.q5 f38263g0;
    public final ArrayList h;
    public float f38264h0;
    public float f38265i0;
    public int f38266j0;
    public int f38267k0;
    public final boolean f38268l0;
    public final boolean m0;
    public q5 f38269n;
    public float f38270n0;
    public boolean f38271o0;
    public final TLRPC.Document f38272p0;
    public final RectF[] f38273q0;
    public q5 f38274r;
    public final Paint[] f38275r0;
    public q5 f38276s;
    public WeakReference f38277s0;
    public final ue.b f38278t0;
    public final ue.b f38279u0;
    public AnimatedFileDrawableStream f38280v0;
    public q5 f38281w;
    public boolean f38282w0;
    public boolean f38283x;
    public boolean f38284x0;
    public boolean f38285y;
    public boolean f38286y0;
    public int f38287z0;

    public t5(File file, boolean z10, long j10, int i3, TLRPC.Document document, org.telegram.messenger.ac acVar, Object obj, long j11, int i10, boolean z11) {
        this(file, z10, j10, i3, document, acVar, obj, j11, i10, z11, 0, 0, null, document != null ? 1 : 0, true);
    }

    public final void A(boolean z10) {
        this.f38286y0 = z10;
        if (z10) {
            this.f38254b = false;
        }
    }

    public final void B(int[] iArr) {
        boolean isEmpty = this.f38278t0.isEmpty();
        int[] iArr2 = this.U;
        if (!isEmpty) {
            if (this.V == null) {
                this.V = new int[4];
            }
            int[] iArr3 = this.V;
            System.arraycopy(iArr2, 0, iArr3, 0, iArr3.length);
        }
        for (int i3 = 0; i3 < 4; i3++) {
            if (!this.f38284x0 && iArr[i3] != iArr2[i3]) {
                this.f38284x0 = true;
            }
            iArr2[i3] = iArr[i3];
        }
    }

    public final void C(long j10, long j11) {
        this.f38264h0 = ((float) j10) / 1000.0f;
        this.f38265i0 = ((float) j11) / 1000.0f;
        if (j10 >= 0 && o() < j10) {
            y(j10, true, false);
        }
    }

    public final void D(long j10) {
        boolean z10;
        this.R0 = 0;
        if (this.S0) {
            this.S0 = false;
            r5 r5Var = new r5(this, 0);
            Typeface typeface = org.telegram.messenger.g0.f22580a;
            if (Looper.myLooper() != Looper.getMainLooper()) {
                org.telegram.messenger.g0.h3(r5Var);
            } else {
                r5Var.run();
            }
        }
        if (!this.U0 && (this.f38257c0 || !this.E)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (this.f38257c0) {
            q5 q5Var = this.f38269n;
            if (q5Var == null && this.f38274r == null) {
                x(false);
            } else if (this.f38274r != null) {
                if (q5Var == null || (z10 && !this.f38252a && this.N < 0)) {
                    q5 q5Var2 = this.f38269n;
                    if (q5Var2 != null) {
                        this.h.add(q5Var2);
                    }
                    this.f38269n = this.f38274r;
                    this.f38274r = this.f38276s;
                    this.f38276s = null;
                    this.U0 = false;
                    x(false);
                }
            }
        } else if (!this.f38257c0 && this.E && z10 && this.f38274r != null) {
            q5 q5Var3 = this.f38269n;
            if (q5Var3 != null) {
                this.h.add(q5Var3);
            }
            this.f38269n = this.f38274r;
            this.f38274r = this.f38276s;
            this.f38276s = null;
            this.U0 = false;
            x(false);
        }
    }

    public final void E() {
        int i3;
        int i10;
        int[] iArr;
        int i11;
        int i12;
        if (!this.f38271o0 && (i3 = this.f38266j0) > 0 && (i10 = this.f38267k0) > 0 && (i11 = (iArr = this.d)[0]) > 0 && (i12 = iArr[1]) > 0) {
            float max = Math.max(i10 / i11, i3 / i12);
            this.f38270n0 = max;
            if (max > 0.0f && max <= 0.7d) {
                return;
            }
            this.f38270n0 = 1.0f;
            return;
        }
        this.f38270n0 = 1.0f;
    }

    @Override
    public final int a(Bitmap bitmap) {
        int i3;
        if (this.O0 == null) {
            return -1;
        }
        Canvas canvas = new Canvas(bitmap);
        Bitmap bitmap2 = this.N0;
        int[] iArr = this.d;
        if (bitmap2 == null) {
            this.N0 = Bitmap.createBitmap(iArr[0], iArr[1], Bitmap.Config.ARGB_8888);
        }
        this.O0.c(this.N0, false, this.f38264h0, this.f38265i0, this.f38268l0);
        long j10 = this.M0;
        if (j10 != 0 && ((i3 = iArr[3]) == 0 || j10 > i3)) {
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
        float width = this.f38267k0 / this.N0.getWidth();
        canvas.scale(width, width);
        canvas.drawBitmap(this.N0, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
        this.M0 = iArr[3];
        return 1;
    }

    @Override
    public final void b() {
        this.O0 = AnimatedFileNative.a(this.H.getAbsolutePath(), this.d, this.K, this.I, this.f38280v0, false);
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
        int i3;
        if (this.f38267k0 == 0 && this.f38266j0 == 0) {
            int[] iArr = this.d;
            int i10 = iArr[0];
            if (i10 <= 3000 && (i3 = iArr[1]) <= 3000) {
                if (i10 > 2200 || i3 > 2200) {
                    this.f38267k0 = i10 / 2;
                    this.f38266j0 = i3 / 2;
                    return;
                }
                return;
            }
            this.f38267k0 = i10 / 4;
            this.f38266j0 = iArr[1] / 4;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        l(canvas, false, System.currentTimeMillis(), 0);
    }

    public final void e(ImageReceiver imageReceiver) {
        if (imageReceiver != null && this.f38279u0.add(imageReceiver) && this.f38257c0) {
            x(false);
        }
        h();
    }

    public final void f(View view) {
        if (view != null) {
            this.f38278t0.add(view);
        }
    }

    public final void finalize() {
        try {
            this.f38278t0.clear();
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
        } else if (this.f38260e0 == null && this.f38285y) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        int i3 = 0;
        if (this.f38285y) {
            int[] iArr = this.d;
            int i10 = iArr[2];
            if (i10 != 90 && i10 != 270) {
                i3 = iArr[1];
            } else {
                i3 = iArr[0];
            }
        }
        if (i3 == 0) {
            return org.telegram.messenger.g0.L(100.0f);
        }
        return (int) (i3 * this.f38270n0);
    }

    @Override
    public final int getIntrinsicWidth() {
        int i3 = 0;
        if (this.f38285y) {
            int[] iArr = this.d;
            int i10 = iArr[2];
            if (i10 != 90 && i10 != 270) {
                i3 = iArr[0];
            } else {
                i3 = iArr[1];
            }
        }
        if (i3 == 0) {
            return org.telegram.messenger.g0.L(100.0f);
        }
        return (int) (i3 * this.f38270n0);
    }

    @Override
    public final int getMinimumHeight() {
        int i3 = 0;
        if (this.f38285y) {
            int[] iArr = this.d;
            int i10 = iArr[2];
            if (i10 != 90 && i10 != 270) {
                i3 = iArr[1];
            } else {
                i3 = iArr[0];
            }
        }
        if (i3 == 0) {
            return org.telegram.messenger.g0.L(100.0f);
        }
        return i3;
    }

    @Override
    public final int getMinimumWidth() {
        int i3 = 0;
        if (this.f38285y) {
            int[] iArr = this.d;
            int i10 = iArr[2];
            if (i10 != 90 && i10 != 270) {
                i3 = iArr[0];
            } else {
                i3 = iArr[1];
            }
        }
        if (i3 == 0) {
            return org.telegram.messenger.g0.L(100.0f);
        }
        return i3;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h() {
        r5 r5Var;
        if (this.A0 != null) {
            boolean isEmpty = this.f38279u0.isEmpty();
            if (isEmpty && this.K0 == null) {
                r5 r5Var2 = new r5(this, 3);
                this.K0 = r5Var2;
                org.telegram.messenger.g0.i3(r5Var2, 600L);
            } else if (!isEmpty && (r5Var = this.K0) != null) {
                org.telegram.messenger.g0.r(r5Var);
                this.K0 = null;
            }
        }
    }

    public final void i() {
        int i3;
        if (this.f38257c0 && !this.S0 && !this.f38261f) {
            if (!this.V0 && (i3 = this.d[5]) > 0) {
                this.V0 = true;
                this.R0 = 0;
                cg.j.d().b(this.T0, i3);
            }
        } else if (this.V0) {
            this.V0 = false;
            this.R0 = 0;
            cg.j.d().g(this.T0);
        }
    }

    @Override
    public final boolean isRunning() {
        return this.f38257c0;
    }

    public final void j() {
        ue.b bVar = this.f38279u0;
        Iterator it = bVar.iterator();
        int i3 = 0;
        int i10 = 0;
        while (it.hasNext()) {
            ImageReceiver imageReceiver = (ImageReceiver) it.next();
            if (!imageReceiver.f21284y1) {
                bVar.remove(imageReceiver);
            } else {
                i3++;
            }
            int i11 = imageReceiver.D1;
            if (i11 > 0 && this.f38287z0 >= i11) {
                i10++;
            }
        }
        if (i3 == i10) {
            stop();
        } else {
            start();
        }
    }

    public final void k() {
        if (!g()) {
            q5 q5Var = this.f38269n;
            if (q5Var != null) {
                q5Var.f37346b.recycle();
                Arrays.fill(q5Var.f37345a, (Object) null);
                this.f38269n = null;
            }
            q5 q5Var2 = this.f38281w;
            if (q5Var2 != null) {
                q5Var2.f37346b.recycle();
                Arrays.fill(q5Var2.f37345a, (Object) null);
                this.f38281w = null;
            }
            org.telegram.messenger.q5 q5Var3 = this.f38263g0;
            if (q5Var3 != null) {
                q5Var3.recycle();
                this.f38263g0 = null;
            }
            int i3 = 0;
            while (true) {
                ArrayList arrayList = this.h;
                if (i3 < arrayList.size()) {
                    q5 q5Var4 = (q5) arrayList.get(i3);
                    q5Var4.f37346b.recycle();
                    Arrays.fill(q5Var4.f37345a, (Object) null);
                    i3++;
                } else {
                    arrayList.clear();
                    t();
                    return;
                }
            }
        }
    }

    public final void l(android.graphics.Canvas r20, boolean r21, long r22, int r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t5.l(android.graphics.Canvas, boolean, long, int):void");
    }

    public final Bitmap m() {
        q5 q5Var = this.f38269n;
        if (q5Var != null) {
            return q5Var.f37346b;
        }
        q5 q5Var2 = this.f38274r;
        if (q5Var2 != null) {
            return q5Var2.f37346b;
        }
        q5 q5Var3 = this.f38276s;
        if (q5Var3 != null) {
            return q5Var3.f37346b;
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
        int i3;
        if (this.N >= 0) {
            return (int) this.N;
        }
        q5 q5Var = this.f38274r;
        if (q5Var != null && (i3 = q5Var.f37348e) != 0) {
            return i3;
        }
        q5 q5Var2 = this.f38269n;
        if (q5Var2 != null) {
            return q5Var2.f37348e;
        }
        return 0;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f38253a0 = true;
    }

    public final Bitmap p() {
        int i3 = this.f38267k0;
        int i10 = this.f38266j0;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap createBitmap = Bitmap.createBitmap(i3, i10, config);
        Canvas canvas = new Canvas(createBitmap);
        AnimatedFileNative a10 = AnimatedFileNative.a(this.H.getAbsolutePath(), this.d, this.K, this.I, this.f38280v0, false);
        if (a10 == null) {
            return createBitmap;
        }
        if (this.N0 == null) {
            int[] iArr = this.d;
            this.N0 = Bitmap.createBitmap(Math.max(1, iArr[0]), Math.max(1, iArr[1]), config);
        }
        a10.c(this.N0, false, this.f38264h0, this.f38265i0, true);
        a10.f();
        createBitmap.eraseColor(0);
        canvas.save();
        float width = this.f38267k0 / this.N0.getWidth();
        canvas.scale(width, width);
        canvas.drawBitmap(this.N0, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
        return createBitmap;
    }

    public final Bitmap q(long j10, boolean z10) {
        int c2;
        if (this.f38285y && this.f38260e0 != null) {
            AnimatedFileDrawableStream animatedFileDrawableStream = this.f38280v0;
            if (animatedFileDrawableStream != null) {
                animatedFileDrawableStream.b(false);
                this.f38280v0.d();
            }
            if (!z10) {
                this.f38260e0.g(j10, z10);
            }
            int[] iArr = this.d;
            Bitmap createBitmap = Bitmap.createBitmap(iArr[0], iArr[1], Bitmap.Config.ARGB_8888);
            if (z10) {
                c2 = this.f38260e0.b(j10, createBitmap);
            } else {
                c2 = this.f38260e0.c(createBitmap, true, 0.0f, 0.0f, true);
            }
            if (c2 != 0) {
                return createBitmap;
            }
            createBitmap.recycle();
        }
        return null;
    }

    public final Bitmap r(boolean z10) {
        if (this.f38260e0 == null) {
            q5 q5Var = this.f38281w;
            if (q5Var != null) {
                return q5Var.f37346b;
            }
            return null;
        }
        if (this.f38281w == null) {
            if (!this.h.isEmpty()) {
                this.f38281w = (q5) this.h.remove(0);
            } else {
                int[] iArr = this.d;
                float f10 = this.f38270n0;
                this.f38281w = new q5(Bitmap.createBitmap((int) (iArr[0] * f10), (int) (iArr[1] * f10), Bitmap.Config.ARGB_8888));
            }
        }
        this.f38260e0.c(this.f38281w.f37346b, false, this.f38264h0, this.f38265i0, z10);
        return this.f38281w.f37346b;
    }

    public final boolean s() {
        if (g()) {
            if (this.f38269n != null || this.f38274r != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void start() {
        if (!this.f38257c0 && !this.f38279u0.isEmpty()) {
            this.f38257c0 = true;
            this.S0 = false;
            x(false);
            org.telegram.messenger.g0.h3(this.J0);
            r5 r5Var = new r5(this, 0);
            if (Looper.myLooper() != Looper.getMainLooper()) {
                org.telegram.messenger.g0.h3(r5Var);
            } else {
                r5Var.run();
            }
        }
    }

    @Override
    public final void stop() {
        this.f38257c0 = false;
        r5 r5Var = new r5(this, 0);
        Typeface typeface = org.telegram.messenger.g0.f22580a;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            org.telegram.messenger.g0.h3(r5Var);
        } else {
            r5Var.run();
        }
    }

    public final void t() {
        Iterator it = this.f38279u0.iterator();
        while (it.hasNext()) {
            ((ImageReceiver) it.next()).invalidate();
        }
    }

    public final void u() {
        if (!this.f38278t0.isEmpty()) {
            this.L = true;
            return;
        }
        int i3 = 0;
        this.f38257c0 = false;
        this.f38258d0 = true;
        r5 r5Var = new r5(this, 0);
        Typeface typeface = org.telegram.messenger.g0.f22580a;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            org.telegram.messenger.g0.h3(r5Var);
        } else {
            r5Var.run();
        }
        if (this.E0 != null) {
            cg.h.c();
            ch0.U0.cancelRunnable(this.E0);
            this.E0 = null;
        }
        if (this.f38259e == null) {
            if (this.f38260e0 != null) {
                this.f38260e0.f();
                this.f38260e0 = null;
            }
            ArrayList arrayList = new ArrayList();
            q5 q5Var = this.f38269n;
            if (q5Var != null) {
                arrayList.add(q5Var.f37346b);
            }
            q5 q5Var2 = this.f38274r;
            if (q5Var2 != null) {
                arrayList.add(q5Var2.f37346b);
            }
            q5 q5Var3 = this.f38276s;
            if (q5Var3 != null) {
                arrayList.add(q5Var3.f37346b);
            }
            q5 q5Var4 = this.f38281w;
            if (q5Var4 != null) {
                arrayList.add(q5Var4.f37346b);
            }
            ArrayList arrayList2 = this.h;
            int size = arrayList2.size();
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                q5 q5Var5 = (q5) obj;
                if (q5Var5 != null) {
                    arrayList.add(q5Var5.f37346b);
                }
            }
            this.h.clear();
            this.f38269n = null;
            this.f38274r = null;
            this.f38276s = null;
            this.f38281w = null;
            org.telegram.messenger.q5 q5Var6 = this.f38263g0;
            if (q5Var6 != null) {
                q5Var6.recycle();
                this.f38263g0 = null;
            }
            getPaint().setShader(null);
            org.telegram.messenger.g0.A2(arrayList);
        } else {
            this.f38283x = true;
        }
        AnimatedFileDrawableStream animatedFileDrawableStream = this.f38280v0;
        if (animatedFileDrawableStream != null) {
            animatedFileDrawableStream.b(true);
            this.f38280v0 = null;
        }
        r5 r5Var2 = new r5(this, 2);
        if (Looper.myLooper() != Looper.getMainLooper()) {
            org.telegram.messenger.g0.h3(r5Var2);
        } else {
            r5Var2.run();
        }
    }

    public final void v(ImageReceiver imageReceiver) {
        ue.b bVar = this.f38279u0;
        bVar.remove(imageReceiver);
        if (bVar.isEmpty()) {
            this.f38287z0 = 0;
        }
        h();
    }

    public final void w(View view) {
        ue.b bVar = this.f38278t0;
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
        r5 r5Var;
        r5 r5Var2;
        if (this.f38259e == null || z10) {
            if ((this.f38254b && (this.f38276s == null || (!this.L0 && this.N >= 0))) || this.f38274r == null) {
                if ((this.f38269n == null || !this.f38261f) && g() && !this.f38283x) {
                    if ((this.f38257c0 || (this.E && !this.F)) && !this.f38279u0.isEmpty() && !this.D0) {
                        if (this.f38282w0) {
                            if (this.f38286y0) {
                                r5 r5Var3 = this.I0;
                                this.f38259e = r5Var3;
                                org.telegram.messenger.r5.a(r5Var3);
                            } else {
                                if (z10 && (r5Var2 = this.f38259e) != null) {
                                    X0.remove(r5Var2);
                                }
                                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = X0;
                                r5 r5Var4 = this.I0;
                                this.f38259e = r5Var4;
                                scheduledThreadPoolExecutor.execute(r5Var4);
                            }
                        } else {
                            if (this.f38263g0 == null) {
                                this.f38263g0 = new org.telegram.messenger.q5("decodeQueue" + this, true);
                            }
                            if (z10 && (r5Var = this.f38259e) != null) {
                                this.f38263g0.cancelRunnable(r5Var);
                            }
                            org.telegram.messenger.q5 q5Var = this.f38263g0;
                            r5 r5Var5 = this.I0;
                            this.f38259e = r5Var5;
                            q5Var.postRunnable(r5Var5, 0L);
                        }
                        this.L0 = true;
                    }
                }
            }
        }
    }

    public final void y(long j10, boolean z10, boolean z11) {
        AnimatedFileDrawableStream animatedFileDrawableStream;
        int i3;
        synchronized (this.R) {
            try {
                this.M = j10;
                this.N = j10;
                this.L0 = false;
                if (this.f38260e0 != null) {
                    this.f38260e0.e();
                }
                if (this.f38285y && (animatedFileDrawableStream = this.f38280v0) != null) {
                    animatedFileDrawableStream.b(z10);
                    this.O = z10;
                    if (z10) {
                        i3 = 0;
                    } else {
                        i3 = 10;
                    }
                    this.P = i3;
                }
                if (z11 && this.E) {
                    this.F = false;
                    if (this.f38259e == null) {
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
        this.f38284x0 = true;
    }

    public t5(java.io.File r19, boolean r20, long r21, int r23, org.telegram.tgnet.TLRPC.Document r24, org.telegram.messenger.ac r25, java.lang.Object r26, long r27, int r29, boolean r30, int r31, int r32, bd.i r33, int r34, boolean r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t5.<init>(java.io.File, boolean, long, int, org.telegram.tgnet.TLRPC$Document, org.telegram.messenger.ac, java.lang.Object, long, int, boolean, int, int, bd.i, int, boolean):void");
    }
}
