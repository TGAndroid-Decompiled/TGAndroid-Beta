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
public class mi0 extends BitmapDrawable implements Animatable, ff.f {
    public static final AtomicInteger L0 = new AtomicInteger();
    public static final AtomicInteger M0 = new AtomicInteger();
    public static final ExecutorService N0 = Executors.newFixedThreadPool(4, new ThreadFactory() {
        @Override
        public final Thread newThread(Runnable runnable) {
            switch (r1) {
                case 0:
                    return new Thread(runnable, "Lottie-" + mi0.L0.getAndIncrement());
                default:
                    return new Thread(runnable, "LottieLow-" + mi0.M0.getAndIncrement());
            }
        }
    });
    public static final ExecutorService O0 = Executors.newFixedThreadPool(2, new ThreadFactory() {
        @Override
        public final Thread newThread(Runnable runnable) {
            switch (r1) {
                case 0:
                    return new Thread(runnable, "Lottie-" + mi0.L0.getAndIncrement());
                default:
                    return new Thread(runnable, "LottieLow-" + mi0.M0.getAndIncrement());
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
    public final ff.j I0;
    public int J;
    public boolean J0;
    public volatile boolean K;
    public boolean K0;
    public ji0 L;
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
    public boolean f30840a;
    public float f30841a0;
    public final int f30842b;
    public float f30843b0;
    public final int f30844c;
    public boolean f30845c0;
    public boolean d;
    public boolean f30846d0;
    public final int[] f30847e;
    public final RectF f30848e0;
    public int f30849f;
    public final RectF[] f30850f0;
    public final Paint[] f30851g0;
    public boolean h;
    public volatile boolean f30852h0;
    public volatile boolean f30853i0;
    public volatile RLottieNative f30854j0;
    public final boolean f30855k0;
    public boolean f30856l0;
    public boolean m0;
    public int[] f30857n;
    public boolean f30858n0;
    public final File f30859o0;
    public final boolean f30860p0;
    public Runnable f30861q0;
    public int[] f30862r;
    public View f30863r0;
    public final HashMap f30864s;
    public final li0 f30865s0;
    public final Runnable f30866t0;
    public final Runnable f30867u0;
    public final HashMap v;
    public boolean f30868v0;
    public final HashMap f30869w;
    public final Runnable f30870w0;
    public HashMap f30871x;
    public final Runnable f30872x0;
    public boolean f30873y;
    public Runnable f30874y0;
    public ff.h f30875z0;

    public mi0(java.io.File r19, java.lang.String r20, int r21, int r22, fe.i r23, boolean r24, int r25, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mi0.<init>(java.io.File, java.lang.String, int, int, fe.i, boolean, int, boolean):void");
    }

    public static void d(mi0 mi0Var) {
        if (mi0Var.L != null) {
            ff.h.c();
            mi0Var.L = null;
        }
        mi0Var.f30868v0 = false;
        mi0Var.n();
        Runnable runnable = mi0Var.f30874y0;
        if (runnable != null) {
            runnable.run();
            mi0Var.f30874y0 = null;
        }
    }

    public static void e(mi0 mi0Var) {
        if (!mi0Var.f30853i0 && !mi0Var.S && mi0Var.i() && mi0Var.L == null) {
            mi0Var.f30868v0 = true;
            if (P0 == null) {
                P0 = new DispatchQueue("cache generator queue");
            }
            ff.h.A++;
            DispatchQueue dispatchQueue = P0;
            ji0 ji0Var = new ji0(mi0Var, 0);
            mi0Var.L = ji0Var;
            dispatchQueue.postRunnable(ji0Var);
        }
    }

    public static void f(mi0 mi0Var) {
        Runnable runnable = mi0Var.f30866t0;
        int z10 = mi0Var.z();
        if (z10 == 1) {
            mi0Var.E0 = 0;
            AndroidUtilities.runOnUIThread(mi0Var.f30867u0);
        } else if (z10 == 2) {
            AndroidUtilities.runOnUIThread(runnable, mi0Var.E0);
            mi0Var.E0 = Math.min((Math.max(mi0Var.E0, 2) * 3) / 2, 2000);
        } else if (z10 == 3) {
            AndroidUtilities.runOnUIThread(runnable);
        }
        CountDownLatch countDownLatch = mi0Var.R;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    public static void g(mi0 mi0Var) {
        int i9 = mi0Var.G0 + 1;
        mi0Var.G0 = i9;
        if (i9 > 10) {
            mi0Var.H0 = true;
        }
        mi0Var.k();
        if (mi0Var.K0) {
            mi0Var.J0 = true;
            mi0Var.v();
        }
    }

    public static void h(mi0 mi0Var) {
        mi0Var.U = true;
        if ((!mi0Var.f30852h0 && mi0Var.T) || (mi0Var.N == null && mi0Var.O != null)) {
            mi0Var.v();
        }
        mi0Var.n();
    }

    public void A(boolean z10) {
        this.f30852h0 = false;
        this.f30853i0 = true;
        j();
        l();
        if (this.M == null && this.L == null && !this.f30868v0) {
            B(z10);
            ff.h hVar = this.f30875z0;
            if (hVar != null) {
                RandomAccessFile randomAccessFile = hVar.f6196s;
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (IOException e10) {
                        e10.printStackTrace();
                    }
                    hVar.f6196s = null;
                }
                hVar.f6195r = true;
                this.f30875z0 = null;
            }
            C();
            return;
        }
        this.S = true;
    }

    public void B(boolean z10) {
        RLottieNative rLottieNative = this.f30854j0;
        this.f30854j0 = null;
        if (rLottieNative != null) {
            ib0 ib0Var = new ib0(rLottieNative, 15);
            if (z10) {
                DispatchQueuePoolBackground.execute(ib0Var);
            } else {
                Utilities.globalQueue.postRunnable(ib0Var);
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
        if (this.f30861q0 != null) {
            this.f30861q0 = null;
        }
    }

    public final void D(ImageReceiver imageReceiver) {
        ArrayList arrayList = this.F;
        arrayList.remove(imageReceiver);
        if (this.f30875z0 != null && P0 != null && this.L != null && arrayList.isEmpty() && getCallback() == null) {
            View view = this.f30863r0;
            if (view == null || !view.isAttachedToWindow()) {
                ji0 ji0Var = this.L;
                if (ji0Var != null) {
                    P0.cancelRunnable(ji0Var);
                    ff.h.c();
                    this.L = null;
                }
                this.f30868v0 = false;
                this.B0 = false;
            }
        }
    }

    public final void E() {
        if (!this.W && !this.f30852h0 && this.T) {
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
        if (this.M == null && this.O == null && i() && !u() && !this.S && !this.f30853i0) {
            if (this.f30852h0 || (this.T && !this.U)) {
                if (!this.f30868v0 || this.C0) {
                    if (!this.f30864s.isEmpty()) {
                        this.v.putAll(this.f30864s);
                        this.f30864s.clear();
                    }
                    int[] iArr = this.f30857n;
                    if (iArr != null) {
                        this.f30862r = iArr;
                        this.f30857n = null;
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

    public final void I(int i9) {
        if (this.H == 2 && i9 == 3 && this.X != 0) {
            return;
        }
        this.H = i9;
    }

    public final void J() {
        L(85, false, false);
    }

    public final void K(int i9) {
        L(i9, true, false);
    }

    public final void L(int i9, boolean z10, boolean z11) {
        if (i9 >= 0 && i9 <= this.f30847e[0]) {
            if (this.X != i9 || z11) {
                this.X = i9;
                this.K = false;
                this.U = false;
                if (this.f30856l0) {
                    this.m0 = true;
                    if (this.M != null) {
                        this.f30858n0 = true;
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
                if (z11 && !this.f30852h0) {
                    this.f30852h0 = true;
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
        if (this.f30858n0) {
            this.f30858n0 = false;
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

    public final boolean N(int i9) {
        if (this.f30849f == i9 || i9 > this.f30847e[0]) {
            return false;
        }
        this.f30849f = i9;
        return true;
    }

    public final void O(int i9, String str) {
        this.f30864s.put(str, Integer.valueOf(i9));
        E();
    }

    public final void P(int i9, Runnable runnable) {
        if (runnable != null) {
            this.D = new WeakReference(runnable);
            this.E = i9;
        } else if (this.D != null) {
            this.D = null;
        }
    }

    public final void Q(float f10, boolean z10) {
        if (f10 < 0.0f) {
            f10 = 0.0f;
        } else if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        L((int) (this.f30847e[0] * f10), z10, false);
    }

    public final void R(long j10) {
        int i9;
        int[] iArr = this.f30847e;
        if (iArr[0] != 0 && (i9 = iArr[1]) != 0) {
            L(Math.round(((float) Math.max(0L, j10)) / (1000.0f / i9)) % iArr[0], true, true);
        }
    }

    public final void S(long j10) {
        boolean z10;
        Integer num;
        int i9;
        this.G0 = 0;
        if (this.H0) {
            this.H0 = false;
            j();
        }
        if (j10 == 0) {
            System.currentTimeMillis();
        }
        if (!this.J0 && (this.f30852h0 || !this.T)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (this.f30852h0) {
            if (this.N == null && this.O == null) {
                G();
            } else if (this.O != null) {
                if (this.N == null || (z10 && !this.f30840a)) {
                    HashMap hashMap = this.f30871x;
                    if (hashMap != null && this.A && (num = (Integer) hashMap.get(Integer.valueOf(this.X - 1))) != null) {
                        try {
                            Activity activity = LaunchActivity.C1;
                            if (activity == null) {
                                activity = BubbleActivity.W;
                            }
                            View decorView = activity.getWindow().getDecorView();
                            if (num.intValue() == 1) {
                                i9 = 0;
                            } else {
                                i9 = 3;
                            }
                            decorView.performHapticFeedback(i9, 2);
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
        int i9;
        RLottieNative rLottieNative = this.F0;
        if (rLottieNative == null) {
            return -1;
        }
        int i10 = this.A0;
        if (i10 >= rLottieNative.f26465a[0]) {
            return 0;
        }
        if (this.Y) {
            i9 = 2;
        } else {
            i9 = 1;
        }
        if (rLottieNative.c(i10, bitmap, true) == -5) {
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e10) {
                e10.printStackTrace();
            }
            return a(bitmap);
        }
        this.A0 += i9;
        return 1;
    }

    @Override
    public final void b() {
        String str;
        File file;
        li0 li0Var = this.f30865s0;
        File file2 = li0Var.d;
        int[] iArr = null;
        if (file2 != null) {
            str = file2.toString();
        } else {
            str = null;
        }
        String str2 = li0Var.f30460e;
        if (this.Z) {
            iArr = this.f30847e;
        }
        RLottieNative a2 = RLottieNative.a(str, str2, this.f30842b, this.f30844c, iArr, false, li0Var.f30457a, false, li0Var.f30458b, this.f30869w);
        this.F0 = a2;
        this.A0 = 0;
        if (a2 == null && (file = this.f30859o0) != null) {
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
        return this.f30844c;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f30842b;
    }

    @Override
    public final int getMinimumHeight() {
        return this.f30844c;
    }

    @Override
    public final int getMinimumWidth() {
        return this.f30842b;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final boolean i() {
        if (this.f30860p0) {
            if (this.f30875z0 == null && !this.f30855k0) {
                return false;
            }
            return true;
        } else if (this.f30854j0 == null && !this.d) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final boolean isRunning() {
        return this.f30852h0;
    }

    public final void j() {
        AndroidUtilities.executeOnUIThread(new ji0(this, 6));
    }

    public final void k() {
        float f10;
        if (this.f30852h0 && !this.H0) {
            if (!this.K0) {
                float f11 = this.f30847e[1];
                if (this.Y) {
                    f10 = 2.0f;
                } else {
                    f10 = 1.0f;
                }
                int round = Math.round((f11 / f10) * this.B);
                if (round > 0) {
                    if (this.f30847e[0] != 1 || this.G != 0) {
                        this.K0 = true;
                        this.G0 = 0;
                        ff.k.d().b(this.I0, round);
                        v();
                    }
                }
            }
        } else if (this.K0) {
            this.K0 = false;
            this.G0 = 0;
            ff.k.d().f(this.I0);
        }
    }

    public final void l() {
        ji0 ji0Var = this.L;
        if (ji0Var != null) {
            P0.cancelRunnable(ji0Var);
            ff.h.c();
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
        if (!this.f30852h0 && this.T) {
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
            if (this.M == null && this.L == null && this.f30854j0 != null) {
                B(true);
            }
        }
        if ((this.f30854j0 == null || this.f30855k0) && this.f30875z0 == null) {
            C();
            return;
        }
        this.Q = true;
        if (!t()) {
            stop();
        }
        if (this.f30852h0) {
            G();
        }
    }

    public final void o(Canvas canvas, Paint paint, boolean z10, long j10, int i9) {
        RectF rectF;
        float width;
        boolean z11;
        float f10;
        if (i() && !this.S) {
            if (!z10) {
                S(j10);
            }
            if (z10) {
                rectF = this.f30850f0[i9];
            } else {
                rectF = this.f30848e0;
            }
            if (paint == null) {
                if (z10) {
                    paint = this.f30851g0[i9];
                } else {
                    paint = getPaint();
                }
            }
            if (paint.getAlpha() != 0 && !this.m0 && this.N != null) {
                boolean z12 = true;
                if (!z10) {
                    rectF.set(getBounds());
                    if (this.f30845c0) {
                        this.f30841a0 = rectF.width() / this.f30842b;
                        this.f30843b0 = rectF.height() / this.f30844c;
                        this.f30845c0 = false;
                        if (Math.abs(rectF.width() - this.f30842b) < AndroidUtilities.dp(1.0f) && Math.abs(rectF.height() - this.f30844c) < AndroidUtilities.dp(1.0f)) {
                            z12 = false;
                        }
                        this.f30846d0 = z12;
                    }
                    width = this.f30841a0;
                    f10 = this.f30843b0;
                    z11 = this.f30846d0;
                } else {
                    width = rectF.width() / this.f30842b;
                    float height = rectF.height() / this.f30844c;
                    if (Math.abs(rectF.width() - this.f30842b) < AndroidUtilities.dp(1.0f) && Math.abs(rectF.height() - this.f30844c) < AndroidUtilities.dp(1.0f)) {
                        z12 = false;
                    }
                    z11 = z12;
                    f10 = height;
                }
                if (!z11) {
                    canvas.drawBitmap(this.N, rectF.left, rectF.top, paint);
                    return;
                }
                canvas.save();
                canvas.translate(rectF.left, rectF.top);
                canvas.scale(width, f10);
                canvas.drawBitmap(this.N, 0.0f, 0.0f, paint);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f30845c0 = true;
    }

    public final long p() {
        int[] iArr = this.f30847e;
        return (iArr[0] / iArr[1]) * 1000.0f;
    }

    public final int q() {
        return this.f30847e[0];
    }

    public final float r() {
        return this.X / this.f30847e[0];
    }

    public final boolean s() {
        if (!this.f30853i0) {
            if ((this.N != null || this.O != null) && !this.m0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void start() {
        if (!this.f30852h0) {
            if ((this.H < 2 || this.J == 0) && this.f30849f != this.X) {
                this.f30852h0 = true;
                this.H0 = false;
                if (this.f30856l0) {
                    this.m0 = true;
                    if (this.M != null) {
                        this.f30858n0 = true;
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
        this.f30852h0 = false;
        j();
    }

    public final boolean t() {
        if (this.F.isEmpty() && this.f30863r0 == null && getCallback() == null) {
            return false;
        }
        return true;
    }

    public boolean u() {
        if (this.N == null || this.f30847e[0] != 1) {
            return false;
        }
        return true;
    }

    public final void v() {
        if (!this.f30853i0) {
            int size = this.F.size();
            for (int i9 = 0; i9 < size; i9++) {
                ((ImageReceiver) this.F.get(i9)).invalidate();
            }
            View view = this.f30863r0;
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
        if (this.X != this.f30847e[0] - 1) {
            return false;
        }
        return true;
    }

    public int z() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mi0.z():int");
    }

    public mi0(int i9, int i10) {
        this.f30847e = new int[3];
        this.f30849f = -1;
        this.f30864s = new HashMap();
        this.v = new HashMap();
        this.f30869w = new HashMap();
        this.f30873y = false;
        this.A = true;
        this.B = 1.0f;
        this.F = new ArrayList();
        this.H = 1;
        this.I = -1;
        this.f30841a0 = 1.0f;
        this.f30843b0 = 1.0f;
        this.f30848e0 = new RectF();
        this.f30850f0 = new RectF[2];
        this.f30851g0 = new Paint[2];
        this.f30866t0 = new ji0(this, 1);
        this.f30867u0 = new ji0(this, 2);
        this.f30870w0 = new ji0(this, 3);
        this.f30872x0 = new ji0(this, 4);
        this.D0 = new ji0(this, 5);
        this.I0 = new w5(this, 2);
        this.f30842b = i9;
        this.f30844c = i10;
        this.C = false;
    }

    public mi0(int i9, int i10, String str, int i11) {
        this(i9, str, i10, i11, true, null);
    }

    public mi0(int i9, String str, int i10, int i11, boolean z10, int[] iArr) {
        long j10;
        long j11;
        this.f30847e = new int[3];
        this.f30849f = -1;
        this.f30864s = new HashMap();
        this.v = new HashMap();
        this.f30869w = new HashMap();
        this.f30873y = false;
        this.A = true;
        this.B = 1.0f;
        this.F = new ArrayList();
        this.H = 1;
        this.I = -1;
        this.f30841a0 = 1.0f;
        this.f30843b0 = 1.0f;
        this.f30848e0 = new RectF();
        this.f30850f0 = new RectF[2];
        this.f30851g0 = new Paint[2];
        this.f30866t0 = new ji0(this, 1);
        this.f30867u0 = new ji0(this, 2);
        this.f30870w0 = new ji0(this, 3);
        this.f30872x0 = new ji0(this, 4);
        this.D0 = new ji0(this, 5);
        this.I0 = new w5(this, 2);
        this.f30842b = i10;
        this.f30844c = i11;
        this.H = 0;
        getPaint().setFlags(2);
        ?? obj = new Object();
        this.f30865s0 = obj;
        obj.f30461f = str;
        obj.f30457a = iArr == null ? null : (int[]) iArr.clone();
        long[] jArr = pe.b.f45554a;
        int length = jArr.length - 1;
        int i12 = 0;
        while (true) {
            if (i12 > length) {
                j10 = -1;
                j11 = -1;
                break;
            }
            int i13 = (i12 + length) >>> 1;
            j11 = jArr[i13];
            j10 = -1;
            int i14 = (int) (j11 >>> 32);
            if (i14 >= i9) {
                if (i14 <= i9) {
                    break;
                }
                length = i13 - 1;
            } else {
                i12 = i13 + 1;
            }
        }
        if (j11 != j10) {
            this.d = true;
            this.f30865s0.f30459c = i9;
            this.C = (8388608 & j11) != 0;
            int[] iArr2 = this.f30847e;
            iArr2[0] = (int) (8388607 & j11);
            iArr2[1] = (int) ((j11 >>> 24) & 255);
        } else {
            this.C = false;
            String readRes = AndroidUtilities.readRes(i9);
            if (TextUtils.isEmpty(readRes)) {
                this.f30865s0 = null;
                return;
            }
            li0 li0Var = this.f30865s0;
            li0Var.f30460e = readRes;
            this.f30854j0 = RLottieNative.b(readRes, str, this.f30847e, li0Var.f30457a, this.f30869w);
        }
        if (this.C) {
            setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        if (z10) {
            H(true);
        }
    }
}
