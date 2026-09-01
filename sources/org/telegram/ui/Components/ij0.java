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
public class ij0 extends BitmapDrawable implements Animatable, lf.e {
    public static final AtomicInteger M0 = new AtomicInteger();
    public static final AtomicInteger N0 = new AtomicInteger();
    public static final ExecutorService O0 = Executors.newFixedThreadPool(4, new ThreadFactory() {
        @Override
        public final Thread newThread(Runnable runnable) {
            switch (r1) {
                case 0:
                    return new Thread(runnable, "Lottie-" + ij0.M0.getAndIncrement());
                default:
                    return new Thread(runnable, "LottieLow-" + ij0.N0.getAndIncrement());
            }
        }
    });
    public static final ExecutorService P0 = Executors.newFixedThreadPool(2, new ThreadFactory() {
        @Override
        public final Thread newThread(Runnable runnable) {
            switch (r1) {
                case 0:
                    return new Thread(runnable, "Lottie-" + ij0.M0.getAndIncrement());
                default:
                    return new Thread(runnable, "LottieLow-" + ij0.N0.getAndIncrement());
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
    public boolean f27810a;
    public final boolean f27811a0;
    public final int f27812b;
    public float f27813b0;
    public final int f27814c;
    public float f27815c0;
    public boolean d;
    public boolean f27816d0;
    public final int[] f27817e;
    public boolean f27818e0;
    public int f27819f;
    public final RectF f27820f0;
    public final RectF[] f27821g0;
    public boolean h;
    public final Paint[] f27822h0;
    public volatile boolean f27823i0;
    public volatile boolean f27824j0;
    public volatile RLottieNative f27825k0;
    public final boolean f27826l0;
    public boolean m0;
    public int[] f27827n;
    public boolean f27828n0;
    public boolean f27829o0;
    public final File f27830p0;
    public final boolean f27831q0;
    public int[] f27832r;
    public Runnable f27833r0;
    public final HashMap f27834s;
    public View f27835s0;
    public final hj0 f27836t0;
    public final Runnable f27837u0;
    public final HashMap v;
    public final Runnable f27838v0;
    public final HashMap f27839w;
    public boolean f27840w0;
    public HashMap f27841x;
    public final Runnable f27842x0;
    public boolean f27843y;
    public final Runnable f27844y0;
    public Runnable f27845z0;

    public ij0(java.io.File r19, java.lang.String r20, int r21, int r22, ke.i r23, boolean r24, int r25, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ij0.<init>(java.io.File, java.lang.String, int, int, ke.i, boolean, int, boolean):void");
    }

    public static void d(ij0 ij0Var) {
        if (ij0Var.M != null) {
            lf.g.c();
            ij0Var.M = null;
        }
        ij0Var.f27840w0 = false;
        ij0Var.n();
        Runnable runnable = ij0Var.f27845z0;
        if (runnable != null) {
            runnable.run();
            ij0Var.f27845z0 = null;
        }
    }

    public static void e(ij0 ij0Var) {
        if (!ij0Var.f27824j0 && !ij0Var.T && ij0Var.i() && ij0Var.M == null) {
            ij0Var.f27840w0 = true;
            if (Q0 == null) {
                Q0 = new DispatchQueue("cache generator queue");
            }
            lf.g.A++;
            DispatchQueue dispatchQueue = Q0;
            fj0 fj0Var = new fj0(ij0Var, 0);
            ij0Var.M = fj0Var;
            dispatchQueue.postRunnable(fj0Var);
        }
    }

    public static void f(ij0 ij0Var) {
        Runnable runnable = ij0Var.f27837u0;
        int z4 = ij0Var.z();
        if (z4 == 1) {
            ij0Var.F0 = 0;
            AndroidUtilities.runOnUIThread(ij0Var.f27838v0);
        } else if (z4 == 2) {
            AndroidUtilities.runOnUIThread(runnable, ij0Var.F0);
            ij0Var.F0 = Math.min((Math.max(ij0Var.F0, 2) * 3) / 2, 2000);
        } else if (z4 == 3) {
            AndroidUtilities.runOnUIThread(runnable);
        }
        CountDownLatch countDownLatch = ij0Var.S;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    public static void g(ij0 ij0Var) {
        int i10 = ij0Var.H0 + 1;
        ij0Var.H0 = i10;
        if (i10 > 10) {
            ij0Var.I0 = true;
        }
        ij0Var.k();
        if (ij0Var.L0) {
            ij0Var.K0 = true;
            ij0Var.v();
        }
    }

    public static void h(ij0 ij0Var) {
        ij0Var.V = true;
        if ((!ij0Var.f27823i0 && ij0Var.U) || (ij0Var.O == null && ij0Var.P != null)) {
            ij0Var.v();
        }
        ij0Var.n();
    }

    public void A(boolean z4) {
        this.f27823i0 = false;
        this.f27824j0 = true;
        j();
        l();
        if (this.N == null && this.M == null && !this.f27840w0) {
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
        RLottieNative rLottieNative = this.f27825k0;
        this.f27825k0 = null;
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
        if (this.f27833r0 != null) {
            this.f27833r0 = null;
        }
    }

    public final void D(ImageReceiver imageReceiver) {
        ArrayList arrayList = this.G;
        arrayList.remove(imageReceiver);
        if (this.A0 != null && Q0 != null && this.M != null && arrayList.isEmpty() && getCallback() == null) {
            View view = this.f27835s0;
            if (view == null || !view.isAttachedToWindow()) {
                fj0 fj0Var = this.M;
                if (fj0Var != null) {
                    Q0.cancelRunnable(fj0Var);
                    lf.g.c();
                    this.M = null;
                }
                this.f27840w0 = false;
                this.C0 = false;
            }
        }
    }

    public final void E() {
        if (!this.X && !this.f27823i0 && this.U) {
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
        if (this.N == null && this.P == null && i() && !u() && !this.T && !this.f27824j0) {
            if (this.f27823i0 || (this.U && !this.V)) {
                if (!this.f27840w0 || this.D0) {
                    if (!this.f27834s.isEmpty()) {
                        this.v.putAll(this.f27834s);
                        this.f27834s.clear();
                    }
                    int[] iArr = this.f27827n;
                    if (iArr != null) {
                        this.f27832r = iArr;
                        this.f27827n = null;
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
        if (i10 >= 0 && i10 <= this.f27817e[0]) {
            if (this.Y != i10 || z10) {
                this.Y = i10;
                this.L = false;
                this.V = false;
                if (this.m0) {
                    this.f27828n0 = true;
                    if (this.N != null) {
                        this.f27829o0 = true;
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
                if (z10 && !this.f27823i0) {
                    this.f27823i0 = true;
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
        if (this.f27829o0) {
            this.f27829o0 = false;
        } else if (this.f27828n0) {
            this.f27828n0 = false;
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
        if (this.f27819f == i10 || i10 > this.f27817e[0]) {
            return false;
        }
        this.f27819f = i10;
        return true;
    }

    public final void O(int i10, String str) {
        this.f27834s.put(str, Integer.valueOf(i10));
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
        L((int) (this.f27817e[0] * f10), z4, false);
    }

    public final void R(long j10) {
        int i10;
        int[] iArr = this.f27817e;
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
        if (!this.K0 && (this.f27823i0 || !this.U)) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (this.f27823i0) {
            if (this.O == null && this.P == null) {
                G();
            } else if (this.P != null) {
                if (this.O == null || (z4 && !this.f27810a)) {
                    HashMap hashMap = this.f27841x;
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
        if (i11 >= rLottieNative.f24963a[0]) {
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
        hj0 hj0Var = this.f27836t0;
        File file2 = (File) hj0Var.f27504f;
        int[] iArr = null;
        if (file2 != null) {
            str = file2.toString();
        } else {
            str = null;
        }
        String str2 = hj0Var.f27501b;
        if (this.f27811a0) {
            iArr = this.f27817e;
        }
        RLottieNative a2 = RLottieNative.a(str, str2, this.f27812b, this.f27814c, iArr, false, (int[]) hj0Var.f27503e, false, hj0Var.f27500a, this.f27839w);
        this.G0 = a2;
        this.B0 = 0;
        if (a2 == null && (file = this.f27830p0) != null) {
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
        return this.f27814c;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f27812b;
    }

    @Override
    public final int getMinimumHeight() {
        return this.f27814c;
    }

    @Override
    public final int getMinimumWidth() {
        return this.f27812b;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final boolean i() {
        if (this.f27831q0) {
            if (this.A0 == null && !this.f27826l0) {
                return false;
            }
            return true;
        } else if (this.f27825k0 == null && !this.d) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final boolean isRunning() {
        return this.f27823i0;
    }

    public final void j() {
        AndroidUtilities.executeOnUIThread(new fj0(this, 6));
    }

    public final void k() {
        float f10;
        if (this.f27823i0 && !this.I0) {
            if (!this.L0) {
                float f11 = this.f27817e[1];
                if (this.Z) {
                    f10 = 2.0f;
                } else {
                    f10 = 1.0f;
                }
                int round = Math.round((f11 / f10) * this.C);
                if (round > 0) {
                    if (this.f27817e[0] != 1 || this.H != 0) {
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
        if (!this.f27823i0 && this.U) {
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
            if (this.N == null && this.M == null && this.f27825k0 != null) {
                B(true);
            }
        }
        if ((this.f27825k0 == null || this.f27826l0) && this.A0 == null) {
            C();
            return;
        }
        this.R = true;
        if (!t()) {
            stop();
        }
        if (this.f27823i0) {
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
                rectF = this.f27821g0[i10];
            } else {
                rectF = this.f27820f0;
            }
            if (paint == null) {
                if (z4) {
                    paint = this.f27822h0[i10];
                } else {
                    paint = getPaint();
                }
            }
            if (paint.getAlpha() != 0 && !this.f27828n0 && this.O != null) {
                boolean z11 = true;
                if (!z4) {
                    rectF.set(getBounds());
                    if (this.f27816d0) {
                        this.f27813b0 = rectF.width() / this.f27812b;
                        this.f27815c0 = rectF.height() / this.f27814c;
                        this.f27816d0 = false;
                        if (Math.abs(rectF.width() - this.f27812b) < AndroidUtilities.dp(1.0f) && Math.abs(rectF.height() - this.f27814c) < AndroidUtilities.dp(1.0f)) {
                            z11 = false;
                        }
                        this.f27818e0 = z11;
                    }
                    width = this.f27813b0;
                    f10 = this.f27815c0;
                    z10 = this.f27818e0;
                } else {
                    width = rectF.width() / this.f27812b;
                    float height = rectF.height() / this.f27814c;
                    if (Math.abs(rectF.width() - this.f27812b) < AndroidUtilities.dp(1.0f) && Math.abs(rectF.height() - this.f27814c) < AndroidUtilities.dp(1.0f)) {
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
        this.f27816d0 = true;
    }

    public final long p() {
        int[] iArr = this.f27817e;
        return (iArr[0] / iArr[1]) * 1000.0f;
    }

    public final int q() {
        return this.f27817e[0];
    }

    public final float r() {
        return this.Y / this.f27817e[0];
    }

    public final boolean s() {
        if (!this.f27824j0) {
            if ((this.O != null || this.P != null) && !this.f27828n0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void start() {
        if (!this.f27823i0) {
            if ((this.I < 2 || this.K == 0) && this.f27819f != this.Y) {
                this.f27823i0 = true;
                this.I0 = false;
                if (this.m0) {
                    this.f27828n0 = true;
                    if (this.N != null) {
                        this.f27829o0 = true;
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
        this.f27823i0 = false;
        j();
    }

    public final boolean t() {
        if (this.G.isEmpty() && this.f27835s0 == null && getCallback() == null) {
            return false;
        }
        return true;
    }

    public boolean u() {
        if (this.O == null || this.f27817e[0] != 1) {
            return false;
        }
        return true;
    }

    public final void v() {
        if (!this.f27824j0) {
            int size = this.G.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((ImageReceiver) this.G.get(i10)).invalidate();
            }
            View view = this.f27835s0;
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
        if (this.Y != this.f27817e[0] - 1) {
            return false;
        }
        return true;
    }

    public int z() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ij0.z():int");
    }

    public ij0(int i10, int i11) {
        this.f27817e = new int[3];
        this.f27819f = -1;
        this.f27834s = new HashMap();
        this.v = new HashMap();
        this.f27839w = new HashMap();
        this.f27843y = false;
        this.B = true;
        this.C = 1.0f;
        this.G = new ArrayList();
        this.I = 1;
        this.J = -1;
        this.f27813b0 = 1.0f;
        this.f27815c0 = 1.0f;
        this.f27820f0 = new RectF();
        this.f27821g0 = new RectF[2];
        this.f27822h0 = new Paint[2];
        this.f27837u0 = new fj0(this, 1);
        this.f27838v0 = new fj0(this, 2);
        this.f27842x0 = new fj0(this, 3);
        this.f27844y0 = new fj0(this, 4);
        this.E0 = new fj0(this, 5);
        this.J0 = new x5(this, 2);
        this.f27812b = i10;
        this.f27814c = i11;
        this.D = false;
    }

    public ij0(int i10, int i11, String str, int i12) {
        this(i10, str, i11, i12, true, null);
    }

    public ij0(int i10, String str, int i11, int i12, boolean z4, int[] iArr) {
        long j10;
        long j11;
        this.f27817e = new int[3];
        this.f27819f = -1;
        this.f27834s = new HashMap();
        this.v = new HashMap();
        this.f27839w = new HashMap();
        this.f27843y = false;
        this.B = true;
        this.C = 1.0f;
        this.G = new ArrayList();
        this.I = 1;
        this.J = -1;
        this.f27813b0 = 1.0f;
        this.f27815c0 = 1.0f;
        this.f27820f0 = new RectF();
        this.f27821g0 = new RectF[2];
        this.f27822h0 = new Paint[2];
        this.f27837u0 = new fj0(this, 1);
        this.f27838v0 = new fj0(this, 2);
        this.f27842x0 = new fj0(this, 3);
        this.f27844y0 = new fj0(this, 4);
        this.E0 = new fj0(this, 5);
        this.J0 = new x5(this, 2);
        this.f27812b = i11;
        this.f27814c = i12;
        this.I = 0;
        getPaint().setFlags(2);
        ?? obj = new Object();
        this.f27836t0 = obj;
        obj.d = str;
        obj.f27503e = iArr == null ? 0 : (int[]) iArr.clone();
        long[] jArr = ue.a.f48500a;
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
            this.f27836t0.f27502c = i10;
            this.D = (8388608 & j11) != 0;
            int[] iArr2 = this.f27817e;
            iArr2[0] = (int) (8388607 & j11);
            iArr2[1] = (int) ((j11 >>> 24) & 255);
        } else {
            this.D = false;
            String readRes = AndroidUtilities.readRes(i10);
            if (TextUtils.isEmpty(readRes)) {
                this.f27836t0 = null;
                return;
            }
            hj0 hj0Var = this.f27836t0;
            hj0Var.f27501b = readRes;
            this.f27825k0 = RLottieNative.b(readRes, str, this.f27817e, (int[]) hj0Var.f27503e, this.f27839w);
        }
        if (this.D) {
            setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        if (z4) {
            H(true);
        }
    }
}
