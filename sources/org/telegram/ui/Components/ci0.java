package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.LaunchActivity;
public class ci0 extends BitmapDrawable implements Animatable, rf.c {
    public static final AtomicInteger P0 = new AtomicInteger();
    public static final AtomicInteger Q0 = new AtomicInteger();
    public static final ExecutorService R0 = Executors.newFixedThreadPool(4, new di.n(6));
    public static final ExecutorService S0 = Executors.newFixedThreadPool(2, new di.n(7));
    public static org.telegram.messenger.s5 T0;
    public Runnable A0;
    public rf.e B0;
    public int C0;
    public boolean D;
    public boolean D0;
    public boolean E;
    public boolean E0;
    public float F;
    public final Runnable F0;
    public final boolean G;
    public int G0;
    public WeakReference H;
    public WeakReference H0;
    public int I;
    public final je.b I0;
    public int J;
    public RLottieNative J0;
    public int K;
    public int K0;
    public int L;
    public volatile boolean L0;
    public int M;
    public final r5 M0;
    public volatile boolean N;
    public boolean N0;
    public bi0 O;
    public boolean O0;
    public Runnable P;
    public volatile Bitmap Q;
    public volatile Bitmap R;
    public volatile Bitmap S;
    public boolean T;
    public CountDownLatch U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public boolean f25130a;
    public int f25131a0;
    public final int f25132b;
    public final boolean f25133b0;
    public final int f25134c;
    public final boolean f25135c0;
    public boolean d;
    public float f25136d0;
    public final int[] e;
    public float f25137e0;
    public int f25138f;
    public boolean f25139f0;
    public boolean f25140g0;
    public boolean h;
    public final RectF f25141h0;
    public final RectF[] f25142i0;
    public final Paint[] f25143j0;
    public volatile boolean f25144k0;
    public volatile boolean f25145l0;
    public volatile RLottieNative m0;
    public int[] f25146n;
    public final boolean f25147n0;
    public boolean f25148o0;
    public boolean f25149p0;
    public boolean f25150q0;
    public int[] f25151r;
    public final File f25152r0;
    public final HashMap f25153s;
    public final boolean f25154s0;
    public Runnable f25155t0;
    public final org.telegram.ui.ActionBar.p4 f25156u0;
    public final Runnable f25157v0;
    public final HashMap f25158w;
    public final Runnable f25159w0;
    public final HashMap f25160x;
    public boolean f25161x0;
    public HashMap f25162y;
    public final Runnable f25163y0;
    public final Runnable f25164z0;

    public ci0(java.io.File r21, java.lang.String r22, int r23, int r24, b2.r1 r25, boolean r26, int r27, boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ci0.<init>(java.io.File, java.lang.String, int, int, b2.r1, boolean, int, boolean):void");
    }

    public static void d(ci0 ci0Var) {
        if (ci0Var.O != null) {
            rf.e.c();
            ci0Var.O = null;
        }
        ci0Var.f25161x0 = false;
        ci0Var.p();
        Runnable runnable = ci0Var.A0;
        if (runnable != null) {
            runnable.run();
            ci0Var.A0 = null;
        }
    }

    public static void e(ci0 ci0Var) {
        if (!ci0Var.f25145l0 && !ci0Var.V && ci0Var.k() && ci0Var.O == null) {
            ci0Var.f25161x0 = true;
            if (T0 == null) {
                T0 = new org.telegram.messenger.s5("cache generator queue", true);
            }
            rf.e.A++;
            org.telegram.messenger.s5 s5Var = T0;
            bi0 bi0Var = new bi0(ci0Var, 0);
            ci0Var.O = bi0Var;
            s5Var.postRunnable(bi0Var);
        }
    }

    public static void f(ci0 ci0Var) {
        int i10;
        Bitmap.Config config;
        Bitmap createBitmap;
        boolean z10;
        try {
            i10 = ci0Var.j();
            if (i10 == 1) {
                if (ci0Var.S != null) {
                    createBitmap = ci0Var.S;
                    z10 = true;
                } else {
                    if (ci0Var.G) {
                        config = Bitmap.Config.ALPHA_8;
                    } else {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    createBitmap = Bitmap.createBitmap(ci0Var.f25132b, ci0Var.f25134c, config);
                    ci0Var.S = createBitmap;
                    z10 = false;
                }
                int B = ci0Var.B(createBitmap, z10);
                if (B == 1) {
                    ci0Var.R = createBitmap;
                    ci0Var.i();
                }
                i10 = B;
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
            i10 = 2;
        }
        if (i10 == 1) {
            ci0Var.G0 = 0;
            org.telegram.messenger.i0.g3(ci0Var.f25159w0);
        } else if (i10 == 2) {
            org.telegram.messenger.i0.h3(ci0Var.f25157v0, ci0Var.G0);
            ci0Var.G0 = Math.min((Math.max(ci0Var.G0, 2) * 3) / 2, 2000);
        } else if (i10 == 3) {
            org.telegram.messenger.i0.g3(ci0Var.f25157v0);
        }
        CountDownLatch countDownLatch = ci0Var.U;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    public static void g(ci0 ci0Var) {
        int i10 = ci0Var.K0 + 1;
        ci0Var.K0 = i10;
        if (i10 > 10) {
            ci0Var.L0 = true;
        }
        ci0Var.m();
        if (ci0Var.O0) {
            ci0Var.N0 = true;
            ci0Var.x();
        }
    }

    public static void h(ci0 ci0Var) {
        ci0Var.X = true;
        if ((!ci0Var.f25144k0 && ci0Var.W) || (ci0Var.Q == null && ci0Var.R != null)) {
            ci0Var.x();
        }
        ci0Var.p();
    }

    public final boolean A() {
        if (this.f25131a0 != this.e[0] - 1) {
            return false;
        }
        return true;
    }

    public int B(Bitmap bitmap, boolean z10) {
        int i10;
        int c10;
        rf.e eVar;
        RLottieNative b10;
        RLottieNative rLottieNative = this.m0;
        if (rLottieNative != null) {
            try {
                if (!this.f25158w.isEmpty() || this.f25151r != null) {
                    this.f25160x.putAll(this.f25158w);
                    int[] iArr = this.f25151r;
                    if (iArr != null) {
                        this.f25156u0.f20654c = (int[]) iArr.clone();
                    }
                    org.telegram.ui.ActionBar.p4 p4Var = this.f25156u0;
                    File file = (File) p4Var.d;
                    if (file != null) {
                        String absolutePath = file.getAbsolutePath();
                        org.telegram.ui.ActionBar.p4 p4Var2 = this.f25156u0;
                        b10 = RLottieNative.a(absolutePath, (String) p4Var2.e, this.e, (int[]) p4Var2.f20654c, p4Var2.f20652a, this.f25160x);
                    } else {
                        int i11 = p4Var.f20653b;
                        if (i11 != 0 && ((String) p4Var.e) == null) {
                            String y22 = org.telegram.messenger.i0.y2(null, i11);
                            if (!TextUtils.isEmpty(y22)) {
                                org.telegram.ui.ActionBar.p4 p4Var3 = this.f25156u0;
                                p4Var3.e = y22;
                                b10 = RLottieNative.b(y22, this.e, (int[]) p4Var3.f20654c, this.f25160x);
                            }
                        } else {
                            b10 = RLottieNative.b((String) p4Var.e, this.e, (int[]) p4Var.f20654c, this.f25160x);
                        }
                    }
                    if (b10 != null) {
                        this.m0 = b10;
                        rLottieNative.d();
                        this.f25158w.clear();
                        this.f25151r = null;
                    }
                }
            } catch (Exception unused) {
            }
        }
        RLottieNative rLottieNative2 = this.m0;
        if (this.f25133b0) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        if (this.f25154s0 && (eVar = this.B0) != null) {
            c10 = 0;
            try {
                c10 = eVar.f(bitmap, this.f25131a0 / i10);
                if (!this.B0.g() && this.E0 && this.m0 != null) {
                    this.m0.d();
                    this.m0 = null;
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        } else {
            c10 = rLottieNative2.c(this.f25131a0, bitmap, z10);
        }
        rf.e eVar2 = this.B0;
        if (eVar2 != null && eVar2.g()) {
            if (!this.D0) {
                this.D0 = true;
                org.telegram.messenger.i0.g3(this.f25163y0);
            }
            c10 = -1;
            if (this.E0) {
                if (this.m0 == null) {
                    String file2 = ((File) this.f25156u0.d).toString();
                    org.telegram.ui.ActionBar.p4 p4Var4 = this.f25156u0;
                    this.m0 = RLottieNative.a(file2, (String) p4Var4.e, null, (int[]) p4Var4.f20654c, p4Var4.f20652a, this.f25160x);
                }
                if (this.m0 != null) {
                    c10 = this.m0.c(this.f25131a0, bitmap, z10);
                }
            }
        }
        if (c10 < 0) {
            return 2;
        }
        return 1;
    }

    public void C(boolean z10) {
        this.f25144k0 = false;
        this.f25145l0 = true;
        l();
        n();
        if (this.P == null && this.O == null && !this.f25161x0) {
            D(z10);
            rf.e eVar = this.B0;
            if (eVar != null) {
                RandomAccessFile randomAccessFile = eVar.f46534s;
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    eVar.f46534s = null;
                }
                eVar.f46533r = true;
                this.B0 = null;
            }
            E();
            return;
        }
        this.V = true;
    }

    public void D(boolean z10) {
        RLottieNative rLottieNative = this.m0;
        this.m0 = null;
        if (rLottieNative != null) {
            eb0 eb0Var = new eb0(rLottieNative, 15);
            if (z10) {
                org.telegram.messenger.t5.a(eb0Var);
            } else {
                Utilities.e.c(eb0Var);
            }
        }
    }

    public final void E() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.Q);
        arrayList.add(this.S);
        arrayList.add(this.R);
        this.R = null;
        this.Q = null;
        this.S = null;
        org.telegram.messenger.i0.A2(arrayList);
        if (this.f25155t0 != null) {
            this.f25155t0 = null;
        }
    }

    public final void F(ImageReceiver imageReceiver) {
        View view;
        je.b bVar = this.I0;
        bVar.remove(imageReceiver);
        if (this.B0 != null && T0 != null && this.O != null) {
            WeakReference weakReference = this.H0;
            if (weakReference != null) {
                view = (View) weakReference.get();
            } else {
                view = null;
            }
            if (bVar.isEmpty() && getCallback() == null) {
                if (view == null || !view.isAttachedToWindow()) {
                    bi0 bi0Var = this.O;
                    if (bi0Var != null) {
                        T0.cancelRunnable(bi0Var);
                        rf.e.c();
                        this.O = null;
                    }
                    this.f25161x0 = false;
                    this.D0 = false;
                }
            }
        }
    }

    public final void G() {
        if (!this.Z && !this.f25144k0 && this.W) {
            if (this.f25131a0 <= 2) {
                this.f25131a0 = 0;
            }
            this.N = false;
            this.X = false;
            if (!I()) {
                this.Y = true;
            }
        }
        x();
    }

    public final boolean H(boolean z10) {
        if (!z10 && ((this.K < 2 || this.M == 0) && this.L < 0)) {
            return false;
        }
        this.M = 0;
        this.K = 2;
        start();
        return true;
    }

    public final boolean I() {
        ExecutorService executorService;
        if (this.P == null && this.R == null && k() && !w() && !this.V && !this.f25145l0) {
            if (this.f25144k0 || (this.W && !this.X)) {
                if (!this.f25161x0 || this.E0) {
                    if (!this.f25153s.isEmpty()) {
                        this.f25158w.putAll(this.f25153s);
                        this.f25153s.clear();
                    }
                    int[] iArr = this.f25146n;
                    if (iArr != null) {
                        this.f25151r = iArr;
                        this.f25146n = null;
                    }
                    Runnable runnable = this.F0;
                    this.P = runnable;
                    if (this.f25133b0) {
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

    public final void J(boolean z10) {
        this.W = true;
        I();
    }

    public final void K(int i10) {
        if (this.K == 2 && i10 == 3 && this.f25131a0 != 0) {
            return;
        }
        this.K = i10;
    }

    public final void L() {
        N(85, false, false);
    }

    public final void M(int i10) {
        N(i10, true, false);
    }

    public final void N(int i10, boolean z10, boolean z11) {
        if (i10 >= 0 && i10 <= this.e[0]) {
            if (this.f25131a0 != i10 || z11) {
                this.f25131a0 = i10;
                this.N = false;
                this.X = false;
                if (this.f25148o0) {
                    this.f25149p0 = true;
                    if (this.P != null) {
                        this.f25150q0 = true;
                    }
                }
                if ((!z10 || z11) && this.T && this.R != null) {
                    this.S = this.R;
                    this.R = null;
                    this.P = null;
                    this.T = false;
                }
                if (!z10 && this.P == null) {
                    this.U = new CountDownLatch(1);
                }
                if (z11 && !this.f25144k0) {
                    this.f25144k0 = true;
                    l();
                }
                if (I()) {
                    if (!z10) {
                        try {
                            this.U.await();
                        } catch (Exception e) {
                            org.telegram.messenger.f8.g(e, true);
                        }
                        this.U = null;
                    }
                } else {
                    this.Y = true;
                }
                invalidateSelf();
            }
        }
    }

    public final void O(boolean z10) {
        WeakReference weakReference;
        Runnable runnable;
        WeakReference weakReference2;
        this.S = this.Q;
        this.Q = this.R;
        this.R = null;
        this.N0 = false;
        if (this.J == 2 && (weakReference2 = this.H) != null && this.f25131a0 - 1 >= this.I) {
            Runnable runnable2 = (Runnable) weakReference2.get();
            if (runnable2 != null) {
                runnable2.run();
            }
            this.H = null;
        }
        if (this.N || (this.L == 0 && this.K == 1)) {
            stop();
        }
        this.P = null;
        if (this.f25150q0) {
            this.f25150q0 = false;
        } else if (this.f25149p0) {
            this.f25149p0 = false;
        }
        this.X = true;
        this.T = false;
        if (z10 && this.Y) {
            this.X = false;
            this.Y = false;
        }
        if (this.J == 0 && (weakReference = this.H) != null && this.f25131a0 >= this.I && (runnable = (Runnable) weakReference.get()) != null) {
            runnable.run();
        }
        I();
    }

    public final boolean P(int i10) {
        if (this.f25138f == i10 || i10 > this.e[0]) {
            return false;
        }
        this.f25138f = i10;
        return true;
    }

    public final void Q(int i10, String str) {
        this.f25153s.put(str, Integer.valueOf(i10));
        G();
    }

    public final void R(View view) {
        this.H0 = new WeakReference(view);
    }

    public final void S(int i10, Runnable runnable) {
        if (runnable != null) {
            this.H = new WeakReference(runnable);
            this.I = i10;
        } else if (this.H != null) {
            this.H = null;
        }
    }

    public final void T(boolean r3, float r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ci0.T(boolean, float):void");
    }

    public final void U(long j10) {
        int i10;
        int[] iArr = this.e;
        if (iArr[0] != 0 && (i10 = iArr[1]) != 0) {
            N(Math.round(((float) Math.max(0L, j10)) / (1000.0f / i10)) % iArr[0], true, true);
        }
    }

    public final void V(long j10) {
        boolean z10;
        Integer num;
        int i10;
        this.K0 = 0;
        if (this.L0) {
            this.L0 = false;
            l();
        }
        if (!this.N0 && (this.f25144k0 || !this.W)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (this.f25144k0) {
            if (this.Q == null && this.R == null) {
                I();
            } else if (this.R != null) {
                if (this.Q == null || (z10 && !this.f25130a)) {
                    HashMap hashMap = this.f25162y;
                    if (hashMap != null && this.E && (num = (Integer) hashMap.get(Integer.valueOf(this.f25131a0 - 1))) != null) {
                        try {
                            Activity activity = LaunchActivity.I1;
                            if (activity == null) {
                                activity = BubbleActivity.f21641a0;
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
                    O(false);
                }
            }
        } else if ((this.Y || (this.W && z10)) && this.R != null) {
            O(true);
        }
    }

    @Override
    public final int a(Bitmap bitmap) {
        int i10;
        RLottieNative rLottieNative = this.J0;
        if (rLottieNative == null) {
            return -1;
        }
        int i11 = this.C0;
        if (i11 >= rLottieNative.f24121a[0]) {
            return 0;
        }
        if (this.f25133b0) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        if (rLottieNative.c(i11, bitmap, true) == -5) {
            return -1;
        }
        this.C0 += i10;
        return 1;
    }

    @Override
    public final void b() {
        String str;
        File file;
        org.telegram.ui.ActionBar.p4 p4Var = this.f25156u0;
        File file2 = (File) p4Var.d;
        int[] iArr = null;
        if (file2 != null) {
            str = file2.toString();
        } else {
            str = null;
        }
        String str2 = (String) p4Var.e;
        if (this.f25135c0) {
            iArr = this.e;
        }
        RLottieNative a2 = RLottieNative.a(str, str2, iArr, (int[]) p4Var.f20654c, p4Var.f20652a, this.f25160x);
        this.J0 = a2;
        this.C0 = 0;
        if (a2 == null && (file = this.f25152r0) != null) {
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
        q(canvas, null, false, 0L, 0);
    }

    public final void finalize() {
        try {
            C(false);
        } finally {
            super.finalize();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f25134c;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f25132b;
    }

    @Override
    public final int getMinimumHeight() {
        return this.f25134c;
    }

    @Override
    public final int getMinimumWidth() {
        return this.f25132b;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public void i() {
        int i10;
        if (this.f25133b0) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        int i11 = this.f25138f;
        if (i11 >= 0 && this.h) {
            int i12 = this.f25131a0;
            if (i12 > i11) {
                int i13 = i12 - i10;
                if (i13 >= i11) {
                    this.f25131a0 = i13;
                    this.N = false;
                    return;
                }
                this.N = true;
                Runnable runnable = this.f25155t0;
                if (runnable != null) {
                    runnable.run();
                    this.f25155t0 = null;
                    return;
                }
                return;
            }
            int i14 = i12 + i10;
            if (i14 < i11) {
                this.f25131a0 = i14;
                this.N = false;
                return;
            }
            this.N = true;
            Runnable runnable2 = this.f25155t0;
            if (runnable2 != null) {
                runnable2.run();
                this.f25155t0 = null;
                return;
            }
            return;
        }
        int i15 = this.f25131a0 + i10;
        if (i11 < 0) {
            i11 = this.e[0];
        }
        if (i15 < i11) {
            if (this.K == 3) {
                this.N = true;
                this.M++;
                return;
            }
            this.f25131a0 = i15;
            this.N = false;
            return;
        }
        int i16 = this.K;
        if (i16 == 1) {
            this.f25131a0 = 0;
            this.N = false;
            if (this.D) {
                this.f25162y = null;
                this.D = false;
            }
            int i17 = this.L;
            if (i17 > 0) {
                this.L = i17 - 1;
            }
        } else if (i16 == 2) {
            this.f25131a0 = 0;
            this.N = true;
            this.M++;
            if (this.D) {
                this.f25162y = null;
                this.D = false;
            }
        } else {
            this.N = true;
            Runnable runnable3 = this.f25155t0;
            if (runnable3 != null) {
                runnable3.run();
                this.f25155t0 = null;
            }
        }
    }

    @Override
    public final boolean isRunning() {
        return this.f25144k0;
    }

    public int j() {
        if (this.f25145l0) {
            return 3;
        }
        if (k()) {
            if (this.m0 == null && this.d) {
                String y22 = org.telegram.messenger.i0.y2(null, this.f25156u0.f20653b);
                if (TextUtils.isEmpty(y22)) {
                    return 2;
                }
                this.m0 = RLottieNative.b(y22, this.e, (int[]) this.f25156u0.f20654c, this.f25160x);
                this.d = false;
                return 1;
            }
            return 1;
        }
        return 2;
    }

    public final boolean k() {
        if (this.f25154s0) {
            if (this.B0 == null && !this.f25147n0) {
                return false;
            }
            return true;
        } else if (this.m0 == null && !this.d) {
            return false;
        } else {
            return true;
        }
    }

    public final void l() {
        bi0 bi0Var = new bi0(this, 6);
        Typeface typeface = org.telegram.messenger.i0.f16145a;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            org.telegram.messenger.i0.g3(bi0Var);
        } else {
            bi0Var.run();
        }
    }

    public final void m() {
        float f7;
        if (this.f25144k0 && !this.L0) {
            if (!this.O0) {
                float f10 = this.e[1];
                if (this.f25133b0) {
                    f7 = 2.0f;
                } else {
                    f7 = 1.0f;
                }
                int round = Math.round((f10 / f7) * this.F);
                if (round > 0) {
                    if (this.e[0] != 1 || this.J != 0) {
                        this.O0 = true;
                        this.K0 = 0;
                        rf.g.d().b(this.M0, round);
                        x();
                    }
                }
            }
        } else if (this.O0) {
            this.O0 = false;
            this.K0 = 0;
            rf.g.d().g(this.M0);
        }
    }

    public final void n() {
        bi0 bi0Var = this.O;
        if (bi0Var != null) {
            T0.cancelRunnable(bi0Var);
            rf.e.c();
            this.O = null;
        }
        if (!v() && this.R != null && this.P != null) {
            this.P = null;
            this.R = null;
        }
    }

    public final void o() {
        if (!this.Z) {
            return;
        }
        this.Z = false;
        if (!this.f25144k0 && this.W) {
            if (this.f25131a0 <= 2) {
                this.f25131a0 = 0;
            }
            this.N = false;
            this.X = false;
            if (!I()) {
                this.Y = true;
            }
        }
        x();
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f25139f0 = true;
    }

    public void p() {
        if (this.V) {
            n();
            if (this.P == null && this.O == null && this.m0 != null) {
                D(true);
            }
        }
        if ((this.m0 == null || this.f25147n0) && this.B0 == null) {
            E();
            return;
        }
        this.T = true;
        if (!v()) {
            stop();
        }
        if (this.f25144k0) {
            I();
        }
    }

    public final void q(Canvas canvas, Paint paint, boolean z10, long j10, int i10) {
        RectF rectF;
        float width;
        boolean z11;
        float f7;
        if (k() && !this.V) {
            if (!z10) {
                V(j10);
            }
            if (z10) {
                rectF = this.f25142i0[i10];
            } else {
                rectF = this.f25141h0;
            }
            if (paint == null) {
                if (z10) {
                    paint = this.f25143j0[i10];
                } else {
                    paint = getPaint();
                }
            }
            if (paint.getAlpha() != 0 && !this.f25149p0 && this.Q != null) {
                boolean z12 = true;
                if (!z10) {
                    rectF.set(getBounds());
                    if (this.f25139f0) {
                        this.f25136d0 = rectF.width() / this.f25132b;
                        this.f25137e0 = rectF.height() / this.f25134c;
                        this.f25139f0 = false;
                        if (Math.abs(rectF.width() - this.f25132b) < org.telegram.messenger.i0.L(1.0f) && Math.abs(rectF.height() - this.f25134c) < org.telegram.messenger.i0.L(1.0f)) {
                            z12 = false;
                        }
                        this.f25140g0 = z12;
                    }
                    width = this.f25136d0;
                    f7 = this.f25137e0;
                    z11 = this.f25140g0;
                } else {
                    width = rectF.width() / this.f25132b;
                    float height = rectF.height() / this.f25134c;
                    if (Math.abs(rectF.width() - this.f25132b) < org.telegram.messenger.i0.L(1.0f) && Math.abs(rectF.height() - this.f25134c) < org.telegram.messenger.i0.L(1.0f)) {
                        z12 = false;
                    }
                    z11 = z12;
                    f7 = height;
                }
                if (!z11) {
                    canvas.drawBitmap(this.Q, rectF.left, rectF.top, paint);
                    return;
                }
                canvas.save();
                canvas.translate(rectF.left, rectF.top);
                canvas.scale(width, f7);
                canvas.drawBitmap(this.Q, 0.0f, 0.0f, paint);
                canvas.restore();
            }
        }
    }

    public final long r() {
        int[] iArr = this.e;
        return (iArr[0] / iArr[1]) * 1000.0f;
    }

    public final int s() {
        return this.e[0];
    }

    @Override
    public final void start() {
        if (!this.f25144k0) {
            if ((this.K < 2 || this.M == 0) && this.f25138f != this.f25131a0) {
                this.f25144k0 = true;
                this.L0 = false;
                if (this.f25148o0) {
                    this.f25149p0 = true;
                    if (this.P != null) {
                        this.f25150q0 = true;
                    }
                }
                I();
                x();
                l();
            }
        }
    }

    @Override
    public final void stop() {
        this.f25144k0 = false;
        l();
    }

    public final float t() {
        return this.f25131a0 / this.e[0];
    }

    public final boolean u() {
        if (!this.f25145l0) {
            if ((this.Q != null || this.R != null) && !this.f25149p0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean v() {
        if (this.I0.isEmpty()) {
            WeakReference weakReference = this.H0;
            if ((weakReference == null || weakReference.get() == null) && getCallback() == null) {
                return false;
            }
            return true;
        }
        return true;
    }

    public boolean w() {
        if (this.Q == null || this.e[0] != 1) {
            return false;
        }
        return true;
    }

    public final void x() {
        View view;
        if (!this.f25145l0) {
            Iterator it = this.I0.iterator();
            while (it.hasNext()) {
                ((ImageReceiver) it.next()).invalidate();
            }
            WeakReference weakReference = this.H0;
            if (weakReference != null) {
                view = (View) weakReference.get();
            } else {
                view = null;
            }
            if (view != null) {
                view.invalidate();
            }
            if (getCallback() != null) {
                invalidateSelf();
            }
        }
    }

    public final boolean y() {
        if (this.O != null) {
            return true;
        }
        return false;
    }

    public boolean z() {
        return true;
    }

    public ci0(int i10, int i11) {
        this.e = new int[3];
        this.f25138f = -1;
        this.f25153s = new HashMap();
        this.f25158w = new HashMap();
        this.f25160x = new HashMap();
        this.D = false;
        this.E = true;
        this.F = 1.0f;
        this.K = 1;
        this.L = -1;
        this.f25136d0 = 1.0f;
        this.f25137e0 = 1.0f;
        this.f25141h0 = new RectF();
        this.f25142i0 = new RectF[2];
        this.f25143j0 = new Paint[2];
        this.f25157v0 = new bi0(this, 1);
        this.f25159w0 = new bi0(this, 2);
        this.f25163y0 = new bi0(this, 3);
        this.f25164z0 = new bi0(this, 4);
        this.F0 = new bi0(this, 5);
        this.I0 = new je.b(true, true);
        this.M0 = new r5(this, 2);
        this.f25132b = i10;
        this.f25134c = i11;
        this.G = false;
    }

    public ci0(int i10, int i11, int i12) {
        this(i10, i11, i12, true, null);
    }

    public ci0(int i10, int i11, int i12, boolean z10, int[] iArr) {
        long j10;
        this.e = new int[3];
        this.f25138f = -1;
        this.f25153s = new HashMap();
        this.f25158w = new HashMap();
        this.f25160x = new HashMap();
        this.D = false;
        this.E = true;
        this.F = 1.0f;
        this.K = 1;
        this.L = -1;
        this.f25136d0 = 1.0f;
        this.f25137e0 = 1.0f;
        this.f25141h0 = new RectF();
        this.f25142i0 = new RectF[2];
        this.f25143j0 = new Paint[2];
        this.f25157v0 = new bi0(this, 1);
        this.f25159w0 = new bi0(this, 2);
        this.f25163y0 = new bi0(this, 3);
        this.f25164z0 = new bi0(this, 4);
        this.F0 = new bi0(this, 5);
        this.I0 = new je.b(true, true);
        this.M0 = new r5(this, 2);
        this.f25132b = i11;
        this.f25134c = i12;
        this.K = 0;
        getPaint().setFlags(2);
        ?? obj = new Object();
        this.f25156u0 = obj;
        obj.f20654c = iArr == null ? null : (int[]) iArr.clone();
        long[] jArr = org.telegram.messenger.gu.f15964a;
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
            this.f25156u0.f20653b = i10;
            this.G = (8388608 & j10) != 0;
            int[] iArr2 = this.e;
            iArr2[0] = (int) (8388607 & j10);
            iArr2[1] = (int) ((j10 >>> 24) & 255);
        } else {
            this.G = false;
            String y22 = org.telegram.messenger.i0.y2(null, i10);
            if (TextUtils.isEmpty(y22)) {
                this.f25156u0 = null;
                return;
            }
            org.telegram.ui.ActionBar.p4 p4Var = this.f25156u0;
            p4Var.e = y22;
            this.m0 = RLottieNative.b(y22, this.e, (int[]) p4Var.f20654c, this.f25160x);
        }
        if (this.G) {
            setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        if (z10) {
            J(true);
        }
    }
}
