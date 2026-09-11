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
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.DispatchQueuePoolBackground;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ResLottieMeta;
import org.telegram.messenger.Utilities;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.LaunchActivity;
public class xi0 extends BitmapDrawable implements Animatable, yf.c {
    public static final AtomicInteger P0 = new AtomicInteger();
    public static final AtomicInteger Q0 = new AtomicInteger();
    public static final ExecutorService R0 = Executors.newFixedThreadPool(4, new e2.c0(1));
    public static final ExecutorService S0 = Executors.newFixedThreadPool(2, new e2.c0(2));
    public static DispatchQueue T0;
    public final Runnable A0;
    public final Runnable B0;
    public Runnable C0;
    public yf.e D0;
    public boolean E;
    public int E0;
    public float F;
    public boolean F0;
    public final boolean G;
    public boolean G0;
    public WeakReference H;
    public final Runnable H0;
    public int I;
    public int I0;
    public final ArrayList J;
    public RLottieNative J0;
    public int K;
    public int K0;
    public int L;
    public volatile boolean L0;
    public int M;
    public final yf.g M0;
    public int N;
    public boolean N0;
    public volatile boolean O;
    public boolean O0;
    public wi0 P;
    public Runnable Q;
    public volatile Bitmap R;
    public volatile Bitmap S;
    public volatile Bitmap T;
    public boolean U;
    public CountDownLatch V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public boolean f32550a;
    public boolean f32551a0;
    public final int f32552b;
    public int f32553b0;
    public final int f32554c;
    public final boolean f32555c0;
    public boolean d;
    public final boolean f32556d0;
    public final int[] f32557e;
    public float f32558e0;
    public int f32559f;
    public float f32560f0;
    public boolean f32561g0;
    public boolean h;
    public boolean f32562h0;
    public final RectF f32563i0;
    public final RectF[] f32564j0;
    public final Paint[] f32565k0;
    public volatile boolean f32566l0;
    public volatile boolean m0;
    public int[] f32567n;
    public volatile RLottieNative f32568n0;
    public final boolean f32569o0;
    public boolean f32570p0;
    public boolean f32571q0;
    public int[] f32572r;
    public boolean f32573r0;
    public final HashMap f32574s;
    public final File f32575s0;
    public final boolean f32576t0;
    public Runnable f32577u0;
    public final HashMap v;
    public View f32578v0;
    public final HashMap f32579w;
    public final com.google.firebase.messaging.p f32580w0;
    public HashMap f32581x;
    public final Runnable f32582x0;
    public boolean f32583y;
    public final Runnable f32584y0;
    public boolean f32585z0;

    public xi0(java.io.File r19, java.lang.String r20, int r21, int r22, b2.n1 r23, boolean r24, int r25, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xi0.<init>(java.io.File, java.lang.String, int, int, b2.n1, boolean, int, boolean):void");
    }

    public static void d(xi0 xi0Var) {
        if (xi0Var.P != null) {
            yf.e.c();
            xi0Var.P = null;
        }
        xi0Var.f32585z0 = false;
        xi0Var.n();
        Runnable runnable = xi0Var.C0;
        if (runnable != null) {
            runnable.run();
            xi0Var.C0 = null;
        }
    }

    public static void e(xi0 xi0Var) {
        if (!xi0Var.m0 && !xi0Var.W && xi0Var.i() && xi0Var.P == null) {
            xi0Var.f32585z0 = true;
            if (T0 == null) {
                T0 = new DispatchQueue("cache generator queue");
            }
            yf.e.A++;
            DispatchQueue dispatchQueue = T0;
            wi0 wi0Var = new wi0(xi0Var, 0);
            xi0Var.P = wi0Var;
            dispatchQueue.postRunnable(wi0Var);
        }
    }

    public static void f(xi0 xi0Var) {
        Runnable runnable = xi0Var.f32582x0;
        int z10 = xi0Var.z();
        if (z10 == 1) {
            xi0Var.I0 = 0;
            AndroidUtilities.runOnUIThread(xi0Var.f32584y0);
        } else if (z10 == 2) {
            AndroidUtilities.runOnUIThread(runnable, xi0Var.I0);
            xi0Var.I0 = Math.min((Math.max(xi0Var.I0, 2) * 3) / 2, 2000);
        } else if (z10 == 3) {
            AndroidUtilities.runOnUIThread(runnable);
        }
        CountDownLatch countDownLatch = xi0Var.V;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    public static void g(xi0 xi0Var) {
        int i10 = xi0Var.K0 + 1;
        xi0Var.K0 = i10;
        if (i10 > 10) {
            xi0Var.L0 = true;
        }
        xi0Var.k();
        if (xi0Var.O0) {
            xi0Var.N0 = true;
            xi0Var.v();
        }
    }

    public static void h(xi0 xi0Var) {
        xi0Var.Y = true;
        if ((!xi0Var.f32566l0 && xi0Var.X) || (xi0Var.R == null && xi0Var.S != null)) {
            xi0Var.v();
        }
        xi0Var.n();
    }

    public void A(boolean z10) {
        this.f32566l0 = false;
        this.m0 = true;
        j();
        l();
        if (this.Q == null && this.P == null && !this.f32585z0) {
            B(z10);
            yf.e eVar = this.D0;
            if (eVar != null) {
                RandomAccessFile randomAccessFile = eVar.f50085s;
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (IOException e7) {
                        e7.printStackTrace();
                    }
                    eVar.f50085s = null;
                }
                eVar.f50084r = true;
                this.D0 = null;
            }
            C();
            return;
        }
        this.W = true;
    }

    public void B(boolean z10) {
        RLottieNative rLottieNative = this.f32568n0;
        this.f32568n0 = null;
        if (rLottieNative != null) {
            cc0 cc0Var = new cc0(rLottieNative, 15);
            if (z10) {
                DispatchQueuePoolBackground.execute(cc0Var);
            } else {
                Utilities.globalQueue.postRunnable(cc0Var);
            }
        }
    }

    public final void C() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.R);
        arrayList.add(this.T);
        arrayList.add(this.S);
        this.S = null;
        this.R = null;
        this.T = null;
        AndroidUtilities.recycleBitmaps(arrayList);
        if (this.f32577u0 != null) {
            this.f32577u0 = null;
        }
    }

    public final void D(ImageReceiver imageReceiver) {
        ArrayList arrayList = this.J;
        arrayList.remove(imageReceiver);
        if (this.D0 != null && T0 != null && this.P != null && arrayList.isEmpty() && getCallback() == null) {
            View view = this.f32578v0;
            if (view == null || !view.isAttachedToWindow()) {
                wi0 wi0Var = this.P;
                if (wi0Var != null) {
                    T0.cancelRunnable(wi0Var);
                    yf.e.c();
                    this.P = null;
                }
                this.f32585z0 = false;
                this.F0 = false;
            }
        }
    }

    public final void E() {
        if (!this.f32551a0 && !this.f32566l0 && this.X) {
            if (this.f32553b0 <= 2) {
                this.f32553b0 = 0;
            }
            this.O = false;
            this.Y = false;
            if (!G()) {
                this.Z = true;
            }
        }
        v();
    }

    public final boolean F(boolean z10) {
        if (!z10 && ((this.L < 2 || this.N == 0) && this.M < 0)) {
            return false;
        }
        this.N = 0;
        this.L = 2;
        start();
        return true;
    }

    public final boolean G() {
        ExecutorService executorService;
        if (this.Q == null && this.S == null && i() && !u() && !this.W && !this.m0) {
            if (this.f32566l0 || (this.X && !this.Y)) {
                if (!this.f32585z0 || this.G0) {
                    if (!this.f32574s.isEmpty()) {
                        this.v.putAll(this.f32574s);
                        this.f32574s.clear();
                    }
                    int[] iArr = this.f32567n;
                    if (iArr != null) {
                        this.f32572r = iArr;
                        this.f32567n = null;
                    }
                    Runnable runnable = this.H0;
                    this.Q = runnable;
                    if (this.f32555c0) {
                        executorService = S0;
                    } else {
                        executorService = R0;
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
        this.X = true;
        G();
    }

    public final void I(int i10) {
        if (this.L == 2 && i10 == 3 && this.f32553b0 != 0) {
            return;
        }
        this.L = i10;
    }

    public final void J() {
        L(85, false, false);
    }

    public final void K(int i10) {
        L(i10, true, false);
    }

    public final void L(int i10, boolean z10, boolean z11) {
        if (i10 >= 0 && i10 <= this.f32557e[0]) {
            if (this.f32553b0 != i10 || z11) {
                this.f32553b0 = i10;
                this.O = false;
                this.Y = false;
                if (this.f32570p0) {
                    this.f32571q0 = true;
                    if (this.Q != null) {
                        this.f32573r0 = true;
                    }
                }
                if ((!z10 || z11) && this.U && this.S != null) {
                    this.T = this.S;
                    this.S = null;
                    this.Q = null;
                    this.U = false;
                }
                if (!z10 && this.Q == null) {
                    this.V = new CountDownLatch(1);
                }
                if (z11 && !this.f32566l0) {
                    this.f32566l0 = true;
                    j();
                }
                if (G()) {
                    if (!z10) {
                        try {
                            this.V.await();
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                        this.V = null;
                    }
                } else {
                    this.Z = true;
                }
                invalidateSelf();
            }
        }
    }

    public final void M(boolean z10) {
        WeakReference weakReference;
        Runnable runnable;
        WeakReference weakReference2;
        this.T = this.R;
        this.R = this.S;
        this.S = null;
        this.N0 = false;
        if (this.K == 2 && (weakReference2 = this.H) != null && this.f32553b0 - 1 >= this.I) {
            Runnable runnable2 = (Runnable) weakReference2.get();
            if (runnable2 != null) {
                runnable2.run();
            }
            this.H = null;
        }
        if (this.O || (this.M == 0 && this.L == 1)) {
            stop();
        }
        this.Q = null;
        if (this.f32573r0) {
            this.f32573r0 = false;
        } else if (this.f32571q0) {
            this.f32571q0 = false;
        }
        this.Y = true;
        this.U = false;
        if (z10 && this.Z) {
            this.Y = false;
            this.Z = false;
        }
        if (this.K == 0 && (weakReference = this.H) != null && this.f32553b0 >= this.I && (runnable = (Runnable) weakReference.get()) != null) {
            runnable.run();
        }
        G();
    }

    public final boolean N(int i10) {
        if (this.f32559f == i10 || i10 > this.f32557e[0]) {
            return false;
        }
        this.f32559f = i10;
        return true;
    }

    public final void O(int i10, String str) {
        this.f32574s.put(str, Integer.valueOf(i10));
        E();
    }

    public final void P(int i10, Runnable runnable) {
        if (runnable != null) {
            this.H = new WeakReference(runnable);
            this.I = i10;
        } else if (this.H != null) {
            this.H = null;
        }
    }

    public final void Q(float f7, boolean z10) {
        if (f7 < 0.0f) {
            f7 = 0.0f;
        } else if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        L((int) (this.f32557e[0] * f7), z10, false);
    }

    public final void R(long j3) {
        int i10;
        int[] iArr = this.f32557e;
        if (iArr[0] != 0 && (i10 = iArr[1]) != 0) {
            L(Math.round(((float) Math.max(0L, j3)) / (1000.0f / i10)) % iArr[0], true, true);
        }
    }

    public final void S(long j3) {
        boolean z10;
        Integer num;
        int i10;
        this.K0 = 0;
        if (this.L0) {
            this.L0 = false;
            j();
        }
        if (!this.N0 && (this.f32566l0 || !this.X)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (this.f32566l0) {
            if (this.R == null && this.S == null) {
                G();
            } else if (this.S != null) {
                if (this.R == null || (z10 && !this.f32550a)) {
                    HashMap hashMap = this.f32581x;
                    if (hashMap != null && this.E && (num = (Integer) hashMap.get(Integer.valueOf(this.f32553b0 - 1))) != null) {
                        try {
                            Activity activity = LaunchActivity.G1;
                            if (activity == null) {
                                activity = BubbleActivity.f21576a0;
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
        } else if ((this.Z || (this.X && z10)) && this.S != null) {
            M(true);
        }
    }

    @Override
    public final int a(Bitmap bitmap) {
        int i10;
        RLottieNative rLottieNative = this.J0;
        if (rLottieNative == null) {
            return -1;
        }
        int i11 = this.E0;
        if (i11 >= rLottieNative.f24067a[0]) {
            return 0;
        }
        if (this.f32555c0) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        if (rLottieNative.c(i11, bitmap, true) == -5) {
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e7) {
                e7.printStackTrace();
            }
            return a(bitmap);
        }
        this.E0 += i10;
        return 1;
    }

    @Override
    public final void b() {
        String str;
        File file;
        com.google.firebase.messaging.p pVar = this.f32580w0;
        File file2 = (File) pVar.f6385e;
        int[] iArr = null;
        if (file2 != null) {
            str = file2.toString();
        } else {
            str = null;
        }
        String str2 = (String) pVar.d;
        if (this.f32556d0) {
            iArr = this.f32557e;
        }
        RLottieNative a2 = RLottieNative.a(str, str2, this.f32552b, this.f32554c, iArr, false, (int[]) pVar.f6384c, false, pVar.f6382a, this.f32579w);
        this.J0 = a2;
        this.E0 = 0;
        if (a2 == null && (file = this.f32575s0) != null) {
            file.delete();
        }
    }

    @Override
    public final void c() {
        RLottieNative rLottieNative = this.J0;
        if (rLottieNative != null) {
            rLottieNative.d();
            this.J0 = null;
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
        return this.f32554c;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f32552b;
    }

    @Override
    public final int getMinimumHeight() {
        return this.f32554c;
    }

    @Override
    public final int getMinimumWidth() {
        return this.f32552b;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final boolean i() {
        if (this.f32576t0) {
            if (this.D0 == null && !this.f32569o0) {
                return false;
            }
            return true;
        } else if (this.f32568n0 == null && !this.d) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final boolean isRunning() {
        return this.f32566l0;
    }

    public final void j() {
        AndroidUtilities.executeOnUIThread(new wi0(this, 6));
    }

    public final void k() {
        float f7;
        if (this.f32566l0 && !this.L0) {
            if (!this.O0) {
                float f10 = this.f32557e[1];
                if (this.f32555c0) {
                    f7 = 2.0f;
                } else {
                    f7 = 1.0f;
                }
                int round = Math.round((f10 / f7) * this.F);
                if (round > 0) {
                    if (this.f32557e[0] != 1 || this.K != 0) {
                        this.O0 = true;
                        this.K0 = 0;
                        yf.h.d().b(this.M0, round);
                        v();
                    }
                }
            }
        } else if (this.O0) {
            this.O0 = false;
            this.K0 = 0;
            yf.h.d().g(this.M0);
        }
    }

    public final void l() {
        wi0 wi0Var = this.P;
        if (wi0Var != null) {
            T0.cancelRunnable(wi0Var);
            yf.e.c();
            this.P = null;
        }
        if (!t() && this.S != null && this.Q != null) {
            this.Q = null;
            this.S = null;
        }
    }

    public final void m() {
        if (!this.f32551a0) {
            return;
        }
        this.f32551a0 = false;
        if (!this.f32566l0 && this.X) {
            if (this.f32553b0 <= 2) {
                this.f32553b0 = 0;
            }
            this.O = false;
            this.Y = false;
            if (!G()) {
                this.Z = true;
            }
        }
        v();
    }

    public void n() {
        if (this.W) {
            l();
            if (this.Q == null && this.P == null && this.f32568n0 != null) {
                B(true);
            }
        }
        if ((this.f32568n0 == null || this.f32569o0) && this.D0 == null) {
            C();
            return;
        }
        this.U = true;
        if (!t()) {
            stop();
        }
        if (this.f32566l0) {
            G();
        }
    }

    public final void o(Canvas canvas, Paint paint, boolean z10, long j3, int i10) {
        RectF rectF;
        float width;
        boolean z11;
        float f7;
        if (i() && !this.W) {
            if (!z10) {
                S(j3);
            }
            if (z10) {
                rectF = this.f32564j0[i10];
            } else {
                rectF = this.f32563i0;
            }
            if (paint == null) {
                if (z10) {
                    paint = this.f32565k0[i10];
                } else {
                    paint = getPaint();
                }
            }
            if (paint.getAlpha() != 0 && !this.f32571q0 && this.R != null) {
                boolean z12 = true;
                if (!z10) {
                    rectF.set(getBounds());
                    if (this.f32561g0) {
                        this.f32558e0 = rectF.width() / this.f32552b;
                        this.f32560f0 = rectF.height() / this.f32554c;
                        this.f32561g0 = false;
                        if (Math.abs(rectF.width() - this.f32552b) < AndroidUtilities.dp(1.0f) && Math.abs(rectF.height() - this.f32554c) < AndroidUtilities.dp(1.0f)) {
                            z12 = false;
                        }
                        this.f32562h0 = z12;
                    }
                    width = this.f32558e0;
                    f7 = this.f32560f0;
                    z11 = this.f32562h0;
                } else {
                    width = rectF.width() / this.f32552b;
                    float height = rectF.height() / this.f32554c;
                    if (Math.abs(rectF.width() - this.f32552b) < AndroidUtilities.dp(1.0f) && Math.abs(rectF.height() - this.f32554c) < AndroidUtilities.dp(1.0f)) {
                        z12 = false;
                    }
                    z11 = z12;
                    f7 = height;
                }
                if (!z11) {
                    canvas.drawBitmap(this.R, rectF.left, rectF.top, paint);
                    return;
                }
                canvas.save();
                canvas.translate(rectF.left, rectF.top);
                canvas.scale(width, f7);
                canvas.drawBitmap(this.R, 0.0f, 0.0f, paint);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f32561g0 = true;
    }

    public final long p() {
        int[] iArr = this.f32557e;
        return (iArr[0] / iArr[1]) * 1000.0f;
    }

    public final int q() {
        return this.f32557e[0];
    }

    public final float r() {
        return this.f32553b0 / this.f32557e[0];
    }

    public final boolean s() {
        if (!this.m0) {
            if ((this.R != null || this.S != null) && !this.f32571q0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void start() {
        if (!this.f32566l0) {
            if ((this.L < 2 || this.N == 0) && this.f32559f != this.f32553b0) {
                this.f32566l0 = true;
                this.L0 = false;
                if (this.f32570p0) {
                    this.f32571q0 = true;
                    if (this.Q != null) {
                        this.f32573r0 = true;
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
        this.f32566l0 = false;
        j();
    }

    public final boolean t() {
        if (this.J.isEmpty() && this.f32578v0 == null && getCallback() == null) {
            return false;
        }
        return true;
    }

    public boolean u() {
        if (this.R == null || this.f32557e[0] != 1) {
            return false;
        }
        return true;
    }

    public final void v() {
        if (!this.m0) {
            int size = this.J.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((ImageReceiver) this.J.get(i10)).invalidate();
            }
            View view = this.f32578v0;
            if (view != null) {
                view.invalidate();
            }
            if (getCallback() != null) {
                invalidateSelf();
            }
        }
    }

    public final boolean w() {
        if (this.P != null) {
            return true;
        }
        return false;
    }

    public boolean x() {
        return true;
    }

    public final boolean y() {
        if (this.f32553b0 != this.f32557e[0] - 1) {
            return false;
        }
        return true;
    }

    public int z() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xi0.z():int");
    }

    public xi0(int i10, int i11) {
        this.f32557e = new int[3];
        this.f32559f = -1;
        this.f32574s = new HashMap();
        this.v = new HashMap();
        this.f32579w = new HashMap();
        this.f32583y = false;
        this.E = true;
        this.F = 1.0f;
        this.J = new ArrayList();
        this.L = 1;
        this.M = -1;
        this.f32558e0 = 1.0f;
        this.f32560f0 = 1.0f;
        this.f32563i0 = new RectF();
        this.f32564j0 = new RectF[2];
        this.f32565k0 = new Paint[2];
        this.f32582x0 = new wi0(this, 1);
        this.f32584y0 = new wi0(this, 2);
        this.A0 = new wi0(this, 3);
        this.B0 = new wi0(this, 4);
        this.H0 = new wi0(this, 5);
        this.M0 = new c6(this, 2);
        this.f32552b = i10;
        this.f32554c = i11;
        this.G = false;
    }

    public xi0(int i10, int i11, int i12) {
        this(i10, i11, i12, true, null);
    }

    public xi0(int i10, int i11, int i12, boolean z10, int[] iArr) {
        int[] iArr2 = new int[3];
        this.f32557e = iArr2;
        this.f32559f = -1;
        this.f32574s = new HashMap();
        this.v = new HashMap();
        HashMap hashMap = new HashMap();
        this.f32579w = hashMap;
        this.f32583y = false;
        this.E = true;
        this.F = 1.0f;
        this.J = new ArrayList();
        this.L = 1;
        this.M = -1;
        this.f32558e0 = 1.0f;
        this.f32560f0 = 1.0f;
        this.f32563i0 = new RectF();
        this.f32564j0 = new RectF[2];
        this.f32565k0 = new Paint[2];
        this.f32582x0 = new wi0(this, 1);
        this.f32584y0 = new wi0(this, 2);
        this.A0 = new wi0(this, 3);
        this.B0 = new wi0(this, 4);
        this.H0 = new wi0(this, 5);
        this.M0 = new c6(this, 2);
        this.f32552b = i11;
        this.f32554c = i12;
        this.L = 0;
        getPaint().setFlags(2);
        ?? obj = new Object();
        this.f32580w0 = obj;
        obj.f6384c = iArr == null ? null : (int[]) iArr.clone();
        long find = ResLottieMeta.find(i10);
        if (find != -1) {
            this.d = true;
            obj.f6383b = i10;
            this.G = ResLottieMeta.isMonoColorOf(find);
            iArr2[0] = ResLottieMeta.frameCountOf(find);
            iArr2[1] = ResLottieMeta.fpsOf(find);
        } else {
            this.G = false;
            String readRes = AndroidUtilities.readRes(i10);
            if (TextUtils.isEmpty(readRes)) {
                this.f32580w0 = null;
                return;
            } else {
                obj.d = readRes;
                this.f32568n0 = RLottieNative.b(readRes, iArr2, (int[]) obj.f6384c, hashMap);
            }
        }
        if (this.G) {
            setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        if (z10) {
            H(true);
        }
    }
}
