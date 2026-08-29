package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.view.View;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.DispatchQueuePoolBackground;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.LaunchActivity;
public class xi0 extends BitmapDrawable implements Animatable, jf.e {
    public static final AtomicInteger L0 = new AtomicInteger();
    public static final AtomicInteger M0 = new AtomicInteger();
    public static final ExecutorService N0 = Executors.newFixedThreadPool(4, new ThreadFactory() {
        @Override
        public final Thread newThread(Runnable runnable) {
            switch (r1) {
                case 0:
                    return new Thread(runnable, "Lottie-" + xi0.L0.getAndIncrement());
                default:
                    return new Thread(runnable, "LottieLow-" + xi0.M0.getAndIncrement());
            }
        }
    });
    public static final ExecutorService O0 = Executors.newFixedThreadPool(2, new ThreadFactory() {
        @Override
        public final Thread newThread(Runnable runnable) {
            switch (r1) {
                case 0:
                    return new Thread(runnable, "Lottie-" + xi0.L0.getAndIncrement());
                default:
                    return new Thread(runnable, "LottieLow-" + xi0.M0.getAndIncrement());
            }
        }
    });
    public static DispatchQueue P0;
    public boolean A;
    public int A0;
    public float B;
    public boolean B0;
    public final boolean C;
    public boolean C0;
    public WeakReference D;
    public final Runnable D0;
    public int E;
    public int E0;
    public final ArrayList F;
    public RLottieNative F0;
    public int G;
    public int G0;
    public int H;
    public volatile boolean H0;
    public int I;
    public final jf.i I0;
    public int J;
    public boolean J0;
    public volatile boolean K;
    public boolean K0;
    public ui0 L;
    public Runnable M;
    public volatile Bitmap N;
    public volatile Bitmap O;
    public volatile Bitmap P;
    public boolean Q;
    public CountDownLatch R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public int X;
    public final boolean Y;
    public final boolean Z;
    public boolean f34730a;
    public float f34731a0;
    public final int f34732b;
    public float f34733b0;
    public final int f34734c;
    public boolean f34735c0;
    public boolean d;
    public boolean f34736d0;
    public final int[] f34737e;
    public final RectF f34738e0;
    public int f34739f;
    public final RectF[] f34740f0;
    public final Paint[] f34741g0;
    public boolean h;
    public volatile boolean f34742h0;
    public volatile boolean f34743i0;
    public volatile RLottieNative f34744j0;
    public final boolean f34745k0;
    public boolean f34746l0;
    public boolean m0;
    public int[] f34747n;
    public boolean f34748n0;
    public final File f34749o0;
    public final boolean f34750p0;
    public Runnable f34751q0;
    public int[] f34752r;
    public View f34753r0;
    public final HashMap f34754s;
    public final wi0 f34755s0;
    public final Runnable f34756t0;
    public final Runnable f34757u0;
    public final HashMap v;
    public boolean f34758v0;
    public final HashMap f34759w;
    public final Runnable f34760w0;
    public HashMap f34761x;
    public final Runnable f34762x0;
    public boolean f34763y;
    public Runnable f34764y0;
    public jf.g f34765z0;

    public xi0(java.io.File r19, java.lang.String r20, int r21, int r22, ie.i r23, boolean r24, int r25, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xi0.<init>(java.io.File, java.lang.String, int, int, ie.i, boolean, int, boolean):void");
    }

    public static void d(xi0 xi0Var) {
        if (xi0Var.L != null) {
            jf.g.c();
            xi0Var.L = null;
        }
        xi0Var.f34758v0 = false;
        xi0Var.n();
        Runnable runnable = xi0Var.f34764y0;
        if (runnable != null) {
            runnable.run();
            xi0Var.f34764y0 = null;
        }
    }

    public static void e(xi0 xi0Var) {
        if (!xi0Var.f34743i0 && !xi0Var.S && xi0Var.i() && xi0Var.L == null) {
            xi0Var.f34758v0 = true;
            if (P0 == null) {
                P0 = new DispatchQueue("cache generator queue");
            }
            jf.g.A++;
            DispatchQueue dispatchQueue = P0;
            ui0 ui0Var = new ui0(xi0Var, 0);
            xi0Var.L = ui0Var;
            dispatchQueue.postRunnable(ui0Var);
        }
    }

    public static void f(xi0 xi0Var) {
        Runnable runnable = xi0Var.f34756t0;
        int z10 = xi0Var.z();
        if (z10 == 1) {
            xi0Var.E0 = 0;
            AndroidUtilities.runOnUIThread(xi0Var.f34757u0);
        } else if (z10 == 2) {
            AndroidUtilities.runOnUIThread(runnable, xi0Var.E0);
            xi0Var.E0 = Math.min((Math.max(xi0Var.E0, 2) * 3) / 2, 2000);
        } else if (z10 == 3) {
            AndroidUtilities.runOnUIThread(runnable);
        }
        CountDownLatch countDownLatch = xi0Var.R;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    public static void g(xi0 xi0Var) {
        int i10 = xi0Var.G0 + 1;
        xi0Var.G0 = i10;
        if (i10 > 10) {
            xi0Var.H0 = true;
        }
        xi0Var.k();
        if (xi0Var.K0) {
            xi0Var.J0 = true;
            xi0Var.v();
        }
    }

    public static void h(xi0 xi0Var) {
        xi0Var.U = true;
        if ((!xi0Var.f34742h0 && xi0Var.T) || (xi0Var.N == null && xi0Var.O != null)) {
            xi0Var.v();
        }
        xi0Var.n();
    }

    public void A(boolean z10) {
        this.f34742h0 = false;
        this.f34743i0 = true;
        j();
        l();
        if (this.M == null && this.L == null && !this.f34758v0) {
            B(z10);
            jf.g gVar = this.f34765z0;
            if (gVar != null) {
                RandomAccessFile randomAccessFile = gVar.f11610s;
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (IOException e10) {
                        e10.printStackTrace();
                    }
                    gVar.f11610s = null;
                }
                gVar.f11609r = true;
                this.f34765z0 = null;
            }
            C();
            return;
        }
        this.S = true;
    }

    public void B(boolean z10) {
        RLottieNative rLottieNative = this.f34744j0;
        this.f34744j0 = null;
        if (rLottieNative != null) {
            xb0 xb0Var = new xb0(rLottieNative, 15);
            if (z10) {
                DispatchQueuePoolBackground.execute(xb0Var);
            } else {
                Utilities.globalQueue.postRunnable(xb0Var);
            }
        }
    }

    public final void C() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.N);
        arrayList.add(this.P);
        arrayList.add(this.O);
        this.O = null;
        this.N = null;
        this.P = null;
        AndroidUtilities.recycleBitmaps(arrayList);
        if (this.f34751q0 != null) {
            this.f34751q0 = null;
        }
    }

    public final void D(ImageReceiver imageReceiver) {
        ArrayList arrayList = this.F;
        arrayList.remove(imageReceiver);
        if (this.f34765z0 != null && P0 != null && this.L != null && arrayList.isEmpty() && getCallback() == null) {
            View view = this.f34753r0;
            if (view == null || !view.isAttachedToWindow()) {
                ui0 ui0Var = this.L;
                if (ui0Var != null) {
                    P0.cancelRunnable(ui0Var);
                    jf.g.c();
                    this.L = null;
                }
                this.f34758v0 = false;
                this.B0 = false;
            }
        }
    }

    public final void E() {
        if (!this.W && !this.f34742h0 && this.T) {
            if (this.X <= 2) {
                this.X = 0;
            }
            this.K = false;
            this.U = false;
            if (!G()) {
                this.V = true;
            }
        }
        v();
    }

    public final boolean F(boolean z10) {
        if (!z10 && ((this.H < 2 || this.J == 0) && this.I < 0)) {
            return false;
        }
        this.J = 0;
        this.H = 2;
        start();
        return true;
    }

    public final boolean G() {
        ExecutorService executorService;
        if (this.M == null && this.O == null && i() && !u() && !this.S && !this.f34743i0) {
            if (this.f34742h0 || (this.T && !this.U)) {
                if (!this.f34758v0 || this.C0) {
                    if (!this.f34754s.isEmpty()) {
                        this.v.putAll(this.f34754s);
                        this.f34754s.clear();
                    }
                    int[] iArr = this.f34747n;
                    if (iArr != null) {
                        this.f34752r = iArr;
                        this.f34747n = null;
                    }
                    Runnable runnable = this.D0;
                    this.M = runnable;
                    if (this.Y) {
                        executorService = O0;
                    } else {
                        executorService = N0;
                    }
                    executorService.execute(runnable);
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void H(boolean z10) {
        this.T = true;
        G();
    }

    public final void I(int i10) {
        if (this.H == 2 && i10 == 3 && this.X != 0) {
            return;
        }
        this.H = i10;
    }

    public final void J() {
        L(85, false, false);
    }

    public final void K(int i10) {
        L(i10, true, false);
    }

    public final void L(int i10, boolean z10, boolean z11) {
        if (i10 >= 0 && i10 <= this.f34737e[0]) {
            if (this.X != i10 || z11) {
                this.X = i10;
                this.K = false;
                this.U = false;
                if (this.f34746l0) {
                    this.m0 = true;
                    if (this.M != null) {
                        this.f34748n0 = true;
                    }
                }
                if ((!z10 || z11) && this.Q && this.O != null) {
                    this.P = this.O;
                    this.O = null;
                    this.M = null;
                    this.Q = false;
                }
                if (!z10 && this.M == null) {
                    this.R = new CountDownLatch(1);
                }
                if (z11 && !this.f34742h0) {
                    this.f34742h0 = true;
                    j();
                }
                if (G()) {
                    if (!z10) {
                        try {
                            this.R.await();
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                        this.R = null;
                    }
                } else {
                    this.V = true;
                }
                invalidateSelf();
            }
        }
    }

    public final void M(boolean z10) {
        WeakReference weakReference;
        Runnable runnable;
        WeakReference weakReference2;
        this.P = this.N;
        this.N = this.O;
        this.O = null;
        this.J0 = false;
        if (this.G == 2 && (weakReference2 = this.D) != null && this.X - 1 >= this.E) {
            Runnable runnable2 = (Runnable) weakReference2.get();
            if (runnable2 != null) {
                runnable2.run();
            }
            this.D = null;
        }
        if (this.K || (this.I == 0 && this.H == 1)) {
            stop();
        }
        this.M = null;
        if (this.f34748n0) {
            this.f34748n0 = false;
        } else if (this.m0) {
            this.m0 = false;
        }
        this.U = true;
        this.Q = false;
        if (z10 && this.V) {
            this.U = false;
            this.V = false;
        }
        if (this.G == 0 && (weakReference = this.D) != null && this.X >= this.E && (runnable = (Runnable) weakReference.get()) != null) {
            runnable.run();
        }
        G();
    }

    public final boolean N(int i10) {
        if (this.f34739f == i10 || i10 > this.f34737e[0]) {
            return false;
        }
        this.f34739f = i10;
        return true;
    }

    public final void O(int i10, String str) {
        this.f34754s.put(str, Integer.valueOf(i10));
        E();
    }

    public final void P(int i10, Runnable runnable) {
        if (runnable != null) {
            this.D = new WeakReference(runnable);
            this.E = i10;
        } else if (this.D != null) {
            this.D = null;
        }
    }

    public final void Q(float f9, boolean z10) {
        if (f9 < 0.0f) {
            f9 = 0.0f;
        } else if (f9 > 1.0f) {
            f9 = 1.0f;
        }
        L((int) (this.f34737e[0] * f9), z10, false);
    }

    public final void R(long j10) {
        int i10;
        int[] iArr = this.f34737e;
        if (iArr[0] != 0 && (i10 = iArr[1]) != 0) {
            L(Math.round(((float) Math.max(0L, j10)) / (1000.0f / i10)) % iArr[0], true, true);
        }
    }

    public final void S(long j10) {
        boolean z10;
        Integer num;
        int i10;
        this.G0 = 0;
        if (this.H0) {
            this.H0 = false;
            j();
        }
        if (j10 == 0) {
            System.currentTimeMillis();
        }
        if (!this.J0 && (this.f34742h0 || !this.T)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (this.f34742h0) {
            if (this.N == null && this.O == null) {
                G();
            } else if (this.O != null) {
                if (this.N == null || (z10 && !this.f34730a)) {
                    HashMap hashMap = this.f34761x;
                    if (hashMap != null && this.A && (num = (Integer) hashMap.get(Integer.valueOf(this.X - 1))) != null) {
                        try {
                            Activity activity = LaunchActivity.C1;
                            if (activity == null) {
                                activity = BubbleActivity.W;
                            }
                            View decorView = activity.getWindow().getDecorView();
                            if (num.intValue() == 1) {
                                i10 = 0;
                            } else {
                                i10 = 3;
                            }
                            decorView.performHapticFeedback(i10, 2);
                        } catch (Exception unused) {
                        }
                    }
                    M(false);
                }
            }
        } else if ((this.V || (this.T && z10)) && this.O != null) {
            M(true);
        }
    }

    @Override
    public final int a(Bitmap bitmap) {
        int i10;
        RLottieNative rLottieNative = this.F0;
        if (rLottieNative == null) {
            return -1;
        }
        int i11 = this.A0;
        if (i11 >= rLottieNative.f26476a[0]) {
            return 0;
        }
        if (this.Y) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        if (rLottieNative.c(i11, bitmap, true) == -5) {
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e10) {
                e10.printStackTrace();
            }
            return a(bitmap);
        }
        this.A0 += i10;
        return 1;
    }

    @Override
    public final void b() {
        String str;
        File file;
        wi0 wi0Var = this.f34755s0;
        File file2 = wi0Var.d;
        int[] iArr = null;
        if (file2 != null) {
            str = file2.toString();
        } else {
            str = null;
        }
        String str2 = wi0Var.f34425e;
        if (this.Z) {
            iArr = this.f34737e;
        }
        RLottieNative a2 = RLottieNative.a(str, str2, this.f34732b, this.f34734c, iArr, false, wi0Var.f34422a, false, wi0Var.f34423b, this.f34759w);
        this.F0 = a2;
        this.A0 = 0;
        if (a2 == null && (file = this.f34749o0) != null) {
            file.delete();
        }
    }

    @Override
    public final void c() {
        RLottieNative rLottieNative = this.F0;
        if (rLottieNative != null) {
            rLottieNative.d();
            this.F0 = null;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        o(canvas, null, false, 0L, 0);
    }

    public final void finalize() {
        try {
            A(false);
        } finally {
            super.finalize();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f34734c;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f34732b;
    }

    @Override
    public final int getMinimumHeight() {
        return this.f34734c;
    }

    @Override
    public final int getMinimumWidth() {
        return this.f34732b;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final boolean i() {
        if (this.f34750p0) {
            if (this.f34765z0 == null && !this.f34745k0) {
                return false;
            }
            return true;
        } else if (this.f34744j0 == null && !this.d) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final boolean isRunning() {
        return this.f34742h0;
    }

    public final void j() {
        AndroidUtilities.executeOnUIThread(new ui0(this, 6));
    }

    public final void k() {
        float f9;
        if (this.f34742h0 && !this.H0) {
            if (!this.K0) {
                float f10 = this.f34737e[1];
                if (this.Y) {
                    f9 = 2.0f;
                } else {
                    f9 = 1.0f;
                }
                int round = Math.round((f10 / f9) * this.B);
                if (round > 0) {
                    if (this.f34737e[0] != 1 || this.G != 0) {
                        this.K0 = true;
                        this.G0 = 0;
                        jf.j.d().b(this.I0, round);
                        v();
                    }
                }
            }
        } else if (this.K0) {
            this.K0 = false;
            this.G0 = 0;
            jf.j.d().g(this.I0);
        }
    }

    public final void l() {
        ui0 ui0Var = this.L;
        if (ui0Var != null) {
            P0.cancelRunnable(ui0Var);
            jf.g.c();
            this.L = null;
        }
        if (!t() && this.O != null && this.M != null) {
            this.M = null;
            this.O = null;
        }
    }

    public final void m() {
        if (!this.W) {
            return;
        }
        this.W = false;
        if (!this.f34742h0 && this.T) {
            if (this.X <= 2) {
                this.X = 0;
            }
            this.K = false;
            this.U = false;
            if (!G()) {
                this.V = true;
            }
        }
        v();
    }

    public void n() {
        if (this.S) {
            l();
            if (this.M == null && this.L == null && this.f34744j0 != null) {
                B(true);
            }
        }
        if ((this.f34744j0 == null || this.f34745k0) && this.f34765z0 == null) {
            C();
            return;
        }
        this.Q = true;
        if (!t()) {
            stop();
        }
        if (this.f34742h0) {
            G();
        }
    }

    public final void o(Canvas canvas, Paint paint, boolean z10, long j10, int i10) {
        RectF rectF;
        float width;
        boolean z11;
        float f9;
        if (i() && !this.S) {
            if (!z10) {
                S(j10);
            }
            if (z10) {
                rectF = this.f34740f0[i10];
            } else {
                rectF = this.f34738e0;
            }
            if (paint == null) {
                if (z10) {
                    paint = this.f34741g0[i10];
                } else {
                    paint = getPaint();
                }
            }
            if (paint.getAlpha() != 0 && !this.m0 && this.N != null) {
                boolean z12 = true;
                if (!z10) {
                    rectF.set(getBounds());
                    if (this.f34735c0) {
                        this.f34731a0 = rectF.width() / this.f34732b;
                        this.f34733b0 = rectF.height() / this.f34734c;
                        this.f34735c0 = false;
                        if (Math.abs(rectF.width() - this.f34732b) < AndroidUtilities.dp(1.0f) && Math.abs(rectF.height() - this.f34734c) < AndroidUtilities.dp(1.0f)) {
                            z12 = false;
                        }
                        this.f34736d0 = z12;
                    }
                    width = this.f34731a0;
                    f9 = this.f34733b0;
                    z11 = this.f34736d0;
                } else {
                    width = rectF.width() / this.f34732b;
                    float height = rectF.height() / this.f34734c;
                    if (Math.abs(rectF.width() - this.f34732b) < AndroidUtilities.dp(1.0f) && Math.abs(rectF.height() - this.f34734c) < AndroidUtilities.dp(1.0f)) {
                        z12 = false;
                    }
                    z11 = z12;
                    f9 = height;
                }
                if (!z11) {
                    canvas.drawBitmap(this.N, rectF.left, rectF.top, paint);
                    return;
                }
                canvas.save();
                canvas.translate(rectF.left, rectF.top);
                canvas.scale(width, f9);
                canvas.drawBitmap(this.N, 0.0f, 0.0f, paint);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f34735c0 = true;
    }

    public final long p() {
        int[] iArr = this.f34737e;
        return (iArr[0] / iArr[1]) * 1000.0f;
    }

    public final int q() {
        return this.f34737e[0];
    }

    public final float r() {
        return this.X / this.f34737e[0];
    }

    public final boolean s() {
        if (!this.f34743i0) {
            if ((this.N != null || this.O != null) && !this.m0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void start() {
        if (!this.f34742h0) {
            if ((this.H < 2 || this.J == 0) && this.f34739f != this.X) {
                this.f34742h0 = true;
                this.H0 = false;
                if (this.f34746l0) {
                    this.m0 = true;
                    if (this.M != null) {
                        this.f34748n0 = true;
                    }
                }
                G();
                v();
                j();
            }
        }
    }

    @Override
    public final void stop() {
        this.f34742h0 = false;
        j();
    }

    public final boolean t() {
        if (this.F.isEmpty() && this.f34753r0 == null && getCallback() == null) {
            return false;
        }
        return true;
    }

    public boolean u() {
        if (this.N == null || this.f34737e[0] != 1) {
            return false;
        }
        return true;
    }

    public final void v() {
        if (!this.f34743i0) {
            int size = this.F.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((ImageReceiver) this.F.get(i10)).invalidate();
            }
            View view = this.f34753r0;
            if (view != null) {
                view.invalidate();
            }
            if (getCallback() != null) {
                invalidateSelf();
            }
        }
    }

    public final boolean w() {
        if (this.L != null) {
            return true;
        }
        return false;
    }

    public boolean x() {
        return true;
    }

    public final boolean y() {
        if (this.X != this.f34737e[0] - 1) {
            return false;
        }
        return true;
    }

    public int z() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xi0.z():int");
    }

    public xi0(int i10, int i11) {
        this.f34737e = new int[3];
        this.f34739f = -1;
        this.f34754s = new HashMap();
        this.v = new HashMap();
        this.f34759w = new HashMap();
        this.f34763y = false;
        this.A = true;
        this.B = 1.0f;
        this.F = new ArrayList();
        this.H = 1;
        this.I = -1;
        this.f34731a0 = 1.0f;
        this.f34733b0 = 1.0f;
        this.f34738e0 = new RectF();
        this.f34740f0 = new RectF[2];
        this.f34741g0 = new Paint[2];
        this.f34756t0 = new ui0(this, 1);
        this.f34757u0 = new ui0(this, 2);
        this.f34760w0 = new ui0(this, 3);
        this.f34762x0 = new ui0(this, 4);
        this.D0 = new ui0(this, 5);
        this.I0 = new b6(this, 2);
        this.f34732b = i10;
        this.f34734c = i11;
        this.C = false;
    }

    public xi0(int i10, int i11, String str, int i12) {
        this(i10, str, i11, i12, true, null);
    }

    public xi0(int i10, String str, int i11, int i12, boolean z10, int[] iArr) {
        long j10;
        long j11;
        this.f34737e = new int[3];
        this.f34739f = -1;
        this.f34754s = new HashMap();
        this.v = new HashMap();
        this.f34759w = new HashMap();
        this.f34763y = false;
        this.A = true;
        this.B = 1.0f;
        this.F = new ArrayList();
        this.H = 1;
        this.I = -1;
        this.f34731a0 = 1.0f;
        this.f34733b0 = 1.0f;
        this.f34738e0 = new RectF();
        this.f34740f0 = new RectF[2];
        this.f34741g0 = new Paint[2];
        this.f34756t0 = new ui0(this, 1);
        this.f34757u0 = new ui0(this, 2);
        this.f34760w0 = new ui0(this, 3);
        this.f34762x0 = new ui0(this, 4);
        this.D0 = new ui0(this, 5);
        this.I0 = new b6(this, 2);
        this.f34732b = i11;
        this.f34734c = i12;
        this.H = 0;
        getPaint().setFlags(2);
        ?? obj = new Object();
        this.f34755s0 = obj;
        obj.f34426f = str;
        obj.f34422a = iArr == null ? null : (int[]) iArr.clone();
        long[] jArr = se.b.f47731a;
        int length = jArr.length - 1;
        int i13 = 0;
        while (true) {
            if (i13 > length) {
                j10 = -1;
                j11 = -1;
                break;
            }
            int i14 = (i13 + length) >>> 1;
            j11 = jArr[i14];
            j10 = -1;
            int i15 = (int) (j11 >>> 32);
            if (i15 >= i10) {
                if (i15 <= i10) {
                    break;
                }
                length = i14 - 1;
            } else {
                i13 = i14 + 1;
            }
        }
        if (j11 != j10) {
            this.d = true;
            this.f34755s0.f34424c = i10;
            this.C = (8388608 & j11) != 0;
            int[] iArr2 = this.f34737e;
            iArr2[0] = (int) (8388607 & j11);
            iArr2[1] = (int) ((j11 >>> 24) & 255);
        } else {
            this.C = false;
            String readRes = AndroidUtilities.readRes(i10);
            if (TextUtils.isEmpty(readRes)) {
                this.f34755s0 = null;
                return;
            }
            wi0 wi0Var = this.f34755s0;
            wi0Var.f34425e = readRes;
            this.f34744j0 = RLottieNative.b(readRes, str, this.f34737e, wi0Var.f34422a, this.f34759w);
        }
        if (this.C) {
            setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        if (z10) {
            H(true);
        }
    }
}
