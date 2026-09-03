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
public class hj0 extends BitmapDrawable implements Animatable, lf.e {
    public static final AtomicInteger M0 = new AtomicInteger();
    public static final AtomicInteger N0 = new AtomicInteger();
    public static final ExecutorService O0 = Executors.newFixedThreadPool(4, new ThreadFactory() {
        @Override
        public final Thread newThread(Runnable runnable) {
            switch (r1) {
                case 0:
                    return new Thread(runnable, "Lottie-" + hj0.M0.getAndIncrement());
                default:
                    return new Thread(runnable, "LottieLow-" + hj0.N0.getAndIncrement());
            }
        }
    });
    public static final ExecutorService P0 = Executors.newFixedThreadPool(2, new ThreadFactory() {
        @Override
        public final Thread newThread(Runnable runnable) {
            switch (r1) {
                case 0:
                    return new Thread(runnable, "Lottie-" + hj0.M0.getAndIncrement());
                default:
                    return new Thread(runnable, "LottieLow-" + hj0.N0.getAndIncrement());
            }
        }
    });
    public static DispatchQueue Q0;
    public lf.g A0;
    public boolean B;
    public int B0;
    public float C;
    public boolean C0;
    public final boolean D;
    public boolean D0;
    public WeakReference E;
    public final Runnable E0;
    public int F;
    public int F0;
    public final ArrayList G;
    public RLottieNative G0;
    public int H;
    public int H0;
    public int I;
    public volatile boolean I0;
    public int J;
    public final lf.i J0;
    public int K;
    public boolean K0;
    public volatile boolean L;
    public boolean L0;
    public fj0 M;
    public Runnable N;
    public volatile Bitmap O;
    public volatile Bitmap P;
    public volatile Bitmap Q;
    public boolean R;
    public CountDownLatch S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public int Y;
    public final boolean Z;
    public boolean f27517a;
    public final boolean f27518a0;
    public final int f27519b;
    public float f27520b0;
    public final int f27521c;
    public float f27522c0;
    public boolean d;
    public boolean f27523d0;
    public final int[] f27524e;
    public boolean f27525e0;
    public int f27526f;
    public final RectF f27527f0;
    public final RectF[] f27528g0;
    public boolean h;
    public final Paint[] f27529h0;
    public volatile boolean f27530i0;
    public volatile boolean f27531j0;
    public volatile RLottieNative f27532k0;
    public final boolean f27533l0;
    public boolean m0;
    public int[] f27534n;
    public boolean f27535n0;
    public boolean f27536o0;
    public final File f27537p0;
    public final boolean f27538q0;
    public int[] f27539r;
    public Runnable f27540r0;
    public final HashMap f27541s;
    public View f27542s0;
    public final com.google.firebase.messaging.n f27543t0;
    public final Runnable f27544u0;
    public final HashMap v;
    public final Runnable f27545v0;
    public final HashMap f27546w;
    public boolean f27547w0;
    public HashMap f27548x;
    public final Runnable f27549x0;
    public boolean f27550y;
    public final Runnable f27551y0;
    public Runnable f27552z0;

    public hj0(java.io.File r19, java.lang.String r20, int r21, int r22, ke.i r23, boolean r24, int r25, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hj0.<init>(java.io.File, java.lang.String, int, int, ke.i, boolean, int, boolean):void");
    }

    public static void d(hj0 hj0Var) {
        if (hj0Var.M != null) {
            lf.g.c();
            hj0Var.M = null;
        }
        hj0Var.f27547w0 = false;
        hj0Var.n();
        Runnable runnable = hj0Var.f27552z0;
        if (runnable != null) {
            runnable.run();
            hj0Var.f27552z0 = null;
        }
    }

    public static void e(hj0 hj0Var) {
        if (!hj0Var.f27531j0 && !hj0Var.T && hj0Var.i() && hj0Var.M == null) {
            hj0Var.f27547w0 = true;
            if (Q0 == null) {
                Q0 = new DispatchQueue("cache generator queue");
            }
            lf.g.A++;
            DispatchQueue dispatchQueue = Q0;
            fj0 fj0Var = new fj0(hj0Var, 0);
            hj0Var.M = fj0Var;
            dispatchQueue.postRunnable(fj0Var);
        }
    }

    public static void f(hj0 hj0Var) {
        Runnable runnable = hj0Var.f27544u0;
        int z4 = hj0Var.z();
        if (z4 == 1) {
            hj0Var.F0 = 0;
            AndroidUtilities.runOnUIThread(hj0Var.f27545v0);
        } else if (z4 == 2) {
            AndroidUtilities.runOnUIThread(runnable, hj0Var.F0);
            hj0Var.F0 = Math.min((Math.max(hj0Var.F0, 2) * 3) / 2, 2000);
        } else if (z4 == 3) {
            AndroidUtilities.runOnUIThread(runnable);
        }
        CountDownLatch countDownLatch = hj0Var.S;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    public static void g(hj0 hj0Var) {
        int i10 = hj0Var.H0 + 1;
        hj0Var.H0 = i10;
        if (i10 > 10) {
            hj0Var.I0 = true;
        }
        hj0Var.k();
        if (hj0Var.L0) {
            hj0Var.K0 = true;
            hj0Var.v();
        }
    }

    public static void h(hj0 hj0Var) {
        hj0Var.V = true;
        if ((!hj0Var.f27530i0 && hj0Var.U) || (hj0Var.O == null && hj0Var.P != null)) {
            hj0Var.v();
        }
        hj0Var.n();
    }

    public void A(boolean z4) {
        this.f27530i0 = false;
        this.f27531j0 = true;
        j();
        l();
        if (this.N == null && this.M == null && !this.f27547w0) {
            B(z4);
            lf.g gVar = this.A0;
            if (gVar != null) {
                RandomAccessFile randomAccessFile = gVar.f12446s;
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (IOException e6) {
                        e6.printStackTrace();
                    }
                    gVar.f12446s = null;
                }
                gVar.f12445r = true;
                this.A0 = null;
            }
            C();
            return;
        }
        this.T = true;
    }

    public void B(boolean z4) {
        RLottieNative rLottieNative = this.f27532k0;
        this.f27532k0 = null;
        if (rLottieNative != null) {
            ec0 ec0Var = new ec0(rLottieNative, 15);
            if (z4) {
                DispatchQueuePoolBackground.execute(ec0Var);
            } else {
                Utilities.globalQueue.postRunnable(ec0Var);
            }
        }
    }

    public final void C() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.O);
        arrayList.add(this.Q);
        arrayList.add(this.P);
        this.P = null;
        this.O = null;
        this.Q = null;
        AndroidUtilities.recycleBitmaps(arrayList);
        if (this.f27540r0 != null) {
            this.f27540r0 = null;
        }
    }

    public final void D(ImageReceiver imageReceiver) {
        ArrayList arrayList = this.G;
        arrayList.remove(imageReceiver);
        if (this.A0 != null && Q0 != null && this.M != null && arrayList.isEmpty() && getCallback() == null) {
            View view = this.f27542s0;
            if (view == null || !view.isAttachedToWindow()) {
                fj0 fj0Var = this.M;
                if (fj0Var != null) {
                    Q0.cancelRunnable(fj0Var);
                    lf.g.c();
                    this.M = null;
                }
                this.f27547w0 = false;
                this.C0 = false;
            }
        }
    }

    public final void E() {
        if (!this.X && !this.f27530i0 && this.U) {
            if (this.Y <= 2) {
                this.Y = 0;
            }
            this.L = false;
            this.V = false;
            if (!G()) {
                this.W = true;
            }
        }
        v();
    }

    public final boolean F(boolean z4) {
        if (!z4 && ((this.I < 2 || this.K == 0) && this.J < 0)) {
            return false;
        }
        this.K = 0;
        this.I = 2;
        start();
        return true;
    }

    public final boolean G() {
        ExecutorService executorService;
        if (this.N == null && this.P == null && i() && !u() && !this.T && !this.f27531j0) {
            if (this.f27530i0 || (this.U && !this.V)) {
                if (!this.f27547w0 || this.D0) {
                    if (!this.f27541s.isEmpty()) {
                        this.v.putAll(this.f27541s);
                        this.f27541s.clear();
                    }
                    int[] iArr = this.f27534n;
                    if (iArr != null) {
                        this.f27539r = iArr;
                        this.f27534n = null;
                    }
                    Runnable runnable = this.E0;
                    this.N = runnable;
                    if (this.Z) {
                        executorService = P0;
                    } else {
                        executorService = O0;
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

    public final void H(boolean z4) {
        this.U = true;
        G();
    }

    public final void I(int i10) {
        if (this.I == 2 && i10 == 3 && this.Y != 0) {
            return;
        }
        this.I = i10;
    }

    public final void J() {
        L(85, false, false);
    }

    public final void K(int i10) {
        L(i10, true, false);
    }

    public final void L(int i10, boolean z4, boolean z10) {
        if (i10 >= 0 && i10 <= this.f27524e[0]) {
            if (this.Y != i10 || z10) {
                this.Y = i10;
                this.L = false;
                this.V = false;
                if (this.m0) {
                    this.f27535n0 = true;
                    if (this.N != null) {
                        this.f27536o0 = true;
                    }
                }
                if ((!z4 || z10) && this.R && this.P != null) {
                    this.Q = this.P;
                    this.P = null;
                    this.N = null;
                    this.R = false;
                }
                if (!z4 && this.N == null) {
                    this.S = new CountDownLatch(1);
                }
                if (z10 && !this.f27530i0) {
                    this.f27530i0 = true;
                    j();
                }
                if (G()) {
                    if (!z4) {
                        try {
                            this.S.await();
                        } catch (Exception e6) {
                            FileLog.e(e6);
                        }
                        this.S = null;
                    }
                } else {
                    this.W = true;
                }
                invalidateSelf();
            }
        }
    }

    public final void M(boolean z4) {
        WeakReference weakReference;
        Runnable runnable;
        WeakReference weakReference2;
        this.Q = this.O;
        this.O = this.P;
        this.P = null;
        this.K0 = false;
        if (this.H == 2 && (weakReference2 = this.E) != null && this.Y - 1 >= this.F) {
            Runnable runnable2 = (Runnable) weakReference2.get();
            if (runnable2 != null) {
                runnable2.run();
            }
            this.E = null;
        }
        if (this.L || (this.J == 0 && this.I == 1)) {
            stop();
        }
        this.N = null;
        if (this.f27536o0) {
            this.f27536o0 = false;
        } else if (this.f27535n0) {
            this.f27535n0 = false;
        }
        this.V = true;
        this.R = false;
        if (z4 && this.W) {
            this.V = false;
            this.W = false;
        }
        if (this.H == 0 && (weakReference = this.E) != null && this.Y >= this.F && (runnable = (Runnable) weakReference.get()) != null) {
            runnable.run();
        }
        G();
    }

    public final boolean N(int i10) {
        if (this.f27526f == i10 || i10 > this.f27524e[0]) {
            return false;
        }
        this.f27526f = i10;
        return true;
    }

    public final void O(int i10, String str) {
        this.f27541s.put(str, Integer.valueOf(i10));
        E();
    }

    public final void P(int i10, Runnable runnable) {
        if (runnable != null) {
            this.E = new WeakReference(runnable);
            this.F = i10;
        } else if (this.E != null) {
            this.E = null;
        }
    }

    public final void Q(float f10, boolean z4) {
        if (f10 < 0.0f) {
            f10 = 0.0f;
        } else if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        L((int) (this.f27524e[0] * f10), z4, false);
    }

    public final void R(long j10) {
        int i10;
        int[] iArr = this.f27524e;
        if (iArr[0] != 0 && (i10 = iArr[1]) != 0) {
            L(Math.round(((float) Math.max(0L, j10)) / (1000.0f / i10)) % iArr[0], true, true);
        }
    }

    public final void S(long j10) {
        boolean z4;
        Integer num;
        int i10;
        this.H0 = 0;
        if (this.I0) {
            this.I0 = false;
            j();
        }
        if (j10 == 0) {
            System.currentTimeMillis();
        }
        if (!this.K0 && (this.f27530i0 || !this.U)) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (this.f27530i0) {
            if (this.O == null && this.P == null) {
                G();
            } else if (this.P != null) {
                if (this.O == null || (z4 && !this.f27517a)) {
                    HashMap hashMap = this.f27548x;
                    if (hashMap != null && this.B && (num = (Integer) hashMap.get(Integer.valueOf(this.Y - 1))) != null) {
                        try {
                            Activity activity = LaunchActivity.D1;
                            if (activity == null) {
                                activity = BubbleActivity.X;
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
        } else if ((this.W || (this.U && z4)) && this.P != null) {
            M(true);
        }
    }

    @Override
    public final int a(Bitmap bitmap) {
        int i10;
        RLottieNative rLottieNative = this.G0;
        if (rLottieNative == null) {
            return -1;
        }
        int i11 = this.B0;
        if (i11 >= rLottieNative.f24965a[0]) {
            return 0;
        }
        if (this.Z) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        if (rLottieNative.c(i11, bitmap, true) == -5) {
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e6) {
                e6.printStackTrace();
            }
            return a(bitmap);
        }
        this.B0 += i10;
        return 1;
    }

    @Override
    public final void b() {
        String str;
        File file;
        com.google.firebase.messaging.n nVar = this.f27543t0;
        File file2 = (File) nVar.f4074e;
        int[] iArr = null;
        if (file2 != null) {
            str = file2.toString();
        } else {
            str = null;
        }
        String str2 = (String) nVar.d;
        if (this.f27518a0) {
            iArr = this.f27524e;
        }
        RLottieNative a2 = RLottieNative.a(str, str2, this.f27519b, this.f27521c, iArr, false, (int[]) nVar.f4073c, false, nVar.f4071a, this.f27546w);
        this.G0 = a2;
        this.B0 = 0;
        if (a2 == null && (file = this.f27537p0) != null) {
            file.delete();
        }
    }

    @Override
    public final void c() {
        RLottieNative rLottieNative = this.G0;
        if (rLottieNative != null) {
            rLottieNative.d();
            this.G0 = null;
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
        return this.f27521c;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f27519b;
    }

    @Override
    public final int getMinimumHeight() {
        return this.f27521c;
    }

    @Override
    public final int getMinimumWidth() {
        return this.f27519b;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final boolean i() {
        if (this.f27538q0) {
            if (this.A0 == null && !this.f27533l0) {
                return false;
            }
            return true;
        } else if (this.f27532k0 == null && !this.d) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final boolean isRunning() {
        return this.f27530i0;
    }

    public final void j() {
        AndroidUtilities.executeOnUIThread(new fj0(this, 6));
    }

    public final void k() {
        float f10;
        if (this.f27530i0 && !this.I0) {
            if (!this.L0) {
                float f11 = this.f27524e[1];
                if (this.Z) {
                    f10 = 2.0f;
                } else {
                    f10 = 1.0f;
                }
                int round = Math.round((f11 / f10) * this.C);
                if (round > 0) {
                    if (this.f27524e[0] != 1 || this.H != 0) {
                        this.L0 = true;
                        this.H0 = 0;
                        lf.j.d().b(this.J0, round);
                        v();
                    }
                }
            }
        } else if (this.L0) {
            this.L0 = false;
            this.H0 = 0;
            lf.j.d().g(this.J0);
        }
    }

    public final void l() {
        fj0 fj0Var = this.M;
        if (fj0Var != null) {
            Q0.cancelRunnable(fj0Var);
            lf.g.c();
            this.M = null;
        }
        if (!t() && this.P != null && this.N != null) {
            this.N = null;
            this.P = null;
        }
    }

    public final void m() {
        if (!this.X) {
            return;
        }
        this.X = false;
        if (!this.f27530i0 && this.U) {
            if (this.Y <= 2) {
                this.Y = 0;
            }
            this.L = false;
            this.V = false;
            if (!G()) {
                this.W = true;
            }
        }
        v();
    }

    public void n() {
        if (this.T) {
            l();
            if (this.N == null && this.M == null && this.f27532k0 != null) {
                B(true);
            }
        }
        if ((this.f27532k0 == null || this.f27533l0) && this.A0 == null) {
            C();
            return;
        }
        this.R = true;
        if (!t()) {
            stop();
        }
        if (this.f27530i0) {
            G();
        }
    }

    public final void o(Canvas canvas, Paint paint, boolean z4, long j10, int i10) {
        RectF rectF;
        float width;
        boolean z10;
        float f10;
        if (i() && !this.T) {
            if (!z4) {
                S(j10);
            }
            if (z4) {
                rectF = this.f27528g0[i10];
            } else {
                rectF = this.f27527f0;
            }
            if (paint == null) {
                if (z4) {
                    paint = this.f27529h0[i10];
                } else {
                    paint = getPaint();
                }
            }
            if (paint.getAlpha() != 0 && !this.f27535n0 && this.O != null) {
                boolean z11 = true;
                if (!z4) {
                    rectF.set(getBounds());
                    if (this.f27523d0) {
                        this.f27520b0 = rectF.width() / this.f27519b;
                        this.f27522c0 = rectF.height() / this.f27521c;
                        this.f27523d0 = false;
                        if (Math.abs(rectF.width() - this.f27519b) < AndroidUtilities.dp(1.0f) && Math.abs(rectF.height() - this.f27521c) < AndroidUtilities.dp(1.0f)) {
                            z11 = false;
                        }
                        this.f27525e0 = z11;
                    }
                    width = this.f27520b0;
                    f10 = this.f27522c0;
                    z10 = this.f27525e0;
                } else {
                    width = rectF.width() / this.f27519b;
                    float height = rectF.height() / this.f27521c;
                    if (Math.abs(rectF.width() - this.f27519b) < AndroidUtilities.dp(1.0f) && Math.abs(rectF.height() - this.f27521c) < AndroidUtilities.dp(1.0f)) {
                        z11 = false;
                    }
                    z10 = z11;
                    f10 = height;
                }
                if (!z10) {
                    canvas.drawBitmap(this.O, rectF.left, rectF.top, paint);
                    return;
                }
                canvas.save();
                canvas.translate(rectF.left, rectF.top);
                canvas.scale(width, f10);
                canvas.drawBitmap(this.O, 0.0f, 0.0f, paint);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f27523d0 = true;
    }

    public final long p() {
        int[] iArr = this.f27524e;
        return (iArr[0] / iArr[1]) * 1000.0f;
    }

    public final int q() {
        return this.f27524e[0];
    }

    public final float r() {
        return this.Y / this.f27524e[0];
    }

    public final boolean s() {
        if (!this.f27531j0) {
            if ((this.O != null || this.P != null) && !this.f27535n0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void start() {
        if (!this.f27530i0) {
            if ((this.I < 2 || this.K == 0) && this.f27526f != this.Y) {
                this.f27530i0 = true;
                this.I0 = false;
                if (this.m0) {
                    this.f27535n0 = true;
                    if (this.N != null) {
                        this.f27536o0 = true;
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
        this.f27530i0 = false;
        j();
    }

    public final boolean t() {
        if (this.G.isEmpty() && this.f27542s0 == null && getCallback() == null) {
            return false;
        }
        return true;
    }

    public boolean u() {
        if (this.O == null || this.f27524e[0] != 1) {
            return false;
        }
        return true;
    }

    public final void v() {
        if (!this.f27531j0) {
            int size = this.G.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((ImageReceiver) this.G.get(i10)).invalidate();
            }
            View view = this.f27542s0;
            if (view != null) {
                view.invalidate();
            }
            if (getCallback() != null) {
                invalidateSelf();
            }
        }
    }

    public final boolean w() {
        if (this.M != null) {
            return true;
        }
        return false;
    }

    public boolean x() {
        return true;
    }

    public final boolean y() {
        if (this.Y != this.f27524e[0] - 1) {
            return false;
        }
        return true;
    }

    public int z() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hj0.z():int");
    }

    public hj0(int i10, int i11) {
        this.f27524e = new int[3];
        this.f27526f = -1;
        this.f27541s = new HashMap();
        this.v = new HashMap();
        this.f27546w = new HashMap();
        this.f27550y = false;
        this.B = true;
        this.C = 1.0f;
        this.G = new ArrayList();
        this.I = 1;
        this.J = -1;
        this.f27520b0 = 1.0f;
        this.f27522c0 = 1.0f;
        this.f27527f0 = new RectF();
        this.f27528g0 = new RectF[2];
        this.f27529h0 = new Paint[2];
        this.f27544u0 = new fj0(this, 1);
        this.f27545v0 = new fj0(this, 2);
        this.f27549x0 = new fj0(this, 3);
        this.f27551y0 = new fj0(this, 4);
        this.E0 = new fj0(this, 5);
        this.J0 = new x5(this, 2);
        this.f27519b = i10;
        this.f27521c = i11;
        this.D = false;
    }

    public hj0(int i10, int i11, int i12) {
        this(i10, i11, i12, true, null);
    }

    public hj0(int i10, int i11, int i12, boolean z4, int[] iArr) {
        long j10;
        this.f27524e = new int[3];
        this.f27526f = -1;
        this.f27541s = new HashMap();
        this.v = new HashMap();
        this.f27546w = new HashMap();
        this.f27550y = false;
        this.B = true;
        this.C = 1.0f;
        this.G = new ArrayList();
        this.I = 1;
        this.J = -1;
        this.f27520b0 = 1.0f;
        this.f27522c0 = 1.0f;
        this.f27527f0 = new RectF();
        this.f27528g0 = new RectF[2];
        this.f27529h0 = new Paint[2];
        this.f27544u0 = new fj0(this, 1);
        this.f27545v0 = new fj0(this, 2);
        this.f27549x0 = new fj0(this, 3);
        this.f27551y0 = new fj0(this, 4);
        this.E0 = new fj0(this, 5);
        this.J0 = new x5(this, 2);
        this.f27519b = i11;
        this.f27521c = i12;
        this.I = 0;
        getPaint().setFlags(2);
        ?? obj = new Object();
        this.f27543t0 = obj;
        obj.f4073c = iArr == null ? null : (int[]) iArr.clone();
        long[] jArr = ue.a.f48536a;
        int length = jArr.length - 1;
        int i13 = 0;
        while (true) {
            if (i13 > length) {
                j10 = -1;
                break;
            }
            int i14 = (i13 + length) >>> 1;
            j10 = jArr[i14];
            int i15 = (int) (j10 >>> 32);
            if (i15 >= i10) {
                if (i15 <= i10) {
                    break;
                }
                length = i14 - 1;
            } else {
                i13 = i14 + 1;
            }
        }
        if (j10 != -1) {
            this.d = true;
            this.f27543t0.f4072b = i10;
            this.D = (8388608 & j10) != 0;
            int[] iArr2 = this.f27524e;
            iArr2[0] = (int) (8388607 & j10);
            iArr2[1] = (int) ((j10 >>> 24) & 255);
        } else {
            this.D = false;
            String readRes = AndroidUtilities.readRes(i10);
            if (TextUtils.isEmpty(readRes)) {
                this.f27543t0 = null;
                return;
            }
            com.google.firebase.messaging.n nVar = this.f27543t0;
            nVar.d = readRes;
            this.f27532k0 = RLottieNative.b(readRes, this.f27524e, (int[]) nVar.f4073c, this.f27546w);
        }
        if (this.D) {
            setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        if (z4) {
            H(true);
        }
    }
}
