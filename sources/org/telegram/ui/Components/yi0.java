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
import java.util.Iterator;
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
public class yi0 extends BitmapDrawable implements Animatable, yf.c {
    public static final AtomicInteger P0 = new AtomicInteger();
    public static final AtomicInteger Q0 = new AtomicInteger();
    public static final ExecutorService R0 = Executors.newFixedThreadPool(4, new e2.c0(1));
    public static final ExecutorService S0 = Executors.newFixedThreadPool(2, new e2.c0(2));
    public static DispatchQueue T0;
    public Runnable A0;
    public yf.e B0;
    public int C0;
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
    public final pe.b I0;
    public int J;
    public RLottieNative J0;
    public int K;
    public int K0;
    public int L;
    public volatile boolean L0;
    public int M;
    public final yf.g M0;
    public volatile boolean N;
    public boolean N0;
    public xi0 O;
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
    public boolean f30257a;
    public int f30258a0;
    public final int f30259b;
    public final boolean f30260b0;
    public final int f30261c;
    public final boolean f30262c0;
    public boolean d;
    public float f30263d0;
    public final int[] e;
    public float f30264e0;
    public int f30265f;
    public boolean f30266f0;
    public boolean f30267g0;
    public boolean h;
    public final RectF f30268h0;
    public final RectF[] f30269i0;
    public final Paint[] f30270j0;
    public volatile boolean f30271k0;
    public volatile boolean f30272l0;
    public volatile RLottieNative m0;
    public int[] f30273n;
    public final boolean f30274n0;
    public boolean f30275o0;
    public boolean f30276p0;
    public boolean f30277q0;
    public int[] f30278r;
    public final File f30279r0;
    public final HashMap f30280s;
    public final boolean f30281s0;
    public Runnable f30282t0;
    public final com.google.firebase.messaging.p f30283u0;
    public final HashMap v;
    public final Runnable f30284v0;
    public final HashMap f30285w;
    public final Runnable f30286w0;
    public HashMap f30287x;
    public boolean f30288x0;
    public boolean f30289y;
    public final Runnable f30290y0;
    public final Runnable f30291z0;

    public yi0(java.io.File r21, java.lang.String r22, int r23, int r24, b2.n1 r25, boolean r26, int r27, boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yi0.<init>(java.io.File, java.lang.String, int, int, b2.n1, boolean, int, boolean):void");
    }

    public static void d(yi0 yi0Var) {
        if (yi0Var.O != null) {
            yf.e.c();
            yi0Var.O = null;
        }
        yi0Var.f30288x0 = false;
        yi0Var.p();
        Runnable runnable = yi0Var.A0;
        if (runnable != null) {
            runnable.run();
            yi0Var.A0 = null;
        }
    }

    public static void e(yi0 yi0Var) {
        if (!yi0Var.f30272l0 && !yi0Var.V && yi0Var.k() && yi0Var.O == null) {
            yi0Var.f30288x0 = true;
            if (T0 == null) {
                T0 = new DispatchQueue("cache generator queue");
            }
            yf.e.A++;
            DispatchQueue dispatchQueue = T0;
            xi0 xi0Var = new xi0(yi0Var, 0);
            yi0Var.O = xi0Var;
            dispatchQueue.postRunnable(xi0Var);
        }
    }

    public static void f(yi0 yi0Var) {
        int i10;
        Bitmap.Config config;
        Bitmap createBitmap;
        boolean z10;
        try {
            i10 = yi0Var.j();
            if (i10 == 1) {
                if (yi0Var.S != null) {
                    createBitmap = yi0Var.S;
                    z10 = true;
                } else {
                    if (yi0Var.G) {
                        config = Bitmap.Config.ALPHA_8;
                    } else {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    createBitmap = Bitmap.createBitmap(yi0Var.f30259b, yi0Var.f30261c, config);
                    yi0Var.S = createBitmap;
                    z10 = false;
                }
                int B = yi0Var.B(createBitmap, z10);
                if (B == 1) {
                    yi0Var.R = createBitmap;
                    yi0Var.i();
                }
                i10 = B;
            }
        } catch (Exception e) {
            FileLog.e(e);
            i10 = 2;
        }
        if (i10 == 1) {
            yi0Var.G0 = 0;
            AndroidUtilities.runOnUIThread(yi0Var.f30286w0);
        } else if (i10 == 2) {
            AndroidUtilities.runOnUIThread(yi0Var.f30284v0, yi0Var.G0);
            yi0Var.G0 = Math.min((Math.max(yi0Var.G0, 2) * 3) / 2, 2000);
        } else if (i10 == 3) {
            AndroidUtilities.runOnUIThread(yi0Var.f30284v0);
        }
        CountDownLatch countDownLatch = yi0Var.U;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    public static void g(yi0 yi0Var) {
        int i10 = yi0Var.K0 + 1;
        yi0Var.K0 = i10;
        if (i10 > 10) {
            yi0Var.L0 = true;
        }
        yi0Var.m();
        if (yi0Var.O0) {
            yi0Var.N0 = true;
            yi0Var.x();
        }
    }

    public static void h(yi0 yi0Var) {
        yi0Var.X = true;
        if ((!yi0Var.f30271k0 && yi0Var.W) || (yi0Var.Q == null && yi0Var.R != null)) {
            yi0Var.x();
        }
        yi0Var.p();
    }

    public final boolean A() {
        if (this.f30258a0 != this.e[0] - 1) {
            return false;
        }
        return true;
    }

    public int B(Bitmap bitmap, boolean z10) {
        RLottieNative b10;
        int i10;
        int c10;
        yf.e eVar;
        RLottieNative rLottieNative = this.m0;
        if (rLottieNative != null) {
            try {
                if (!this.v.isEmpty() || this.f30278r != null) {
                    this.f30285w.putAll(this.v);
                    int[] iArr = this.f30278r;
                    if (iArr != null) {
                        this.f30283u0.f7328c = (int[]) iArr.clone();
                    }
                    com.google.firebase.messaging.p pVar = this.f30283u0;
                    File file = (File) pVar.e;
                    if (file != null) {
                        String absolutePath = file.getAbsolutePath();
                        com.google.firebase.messaging.p pVar2 = this.f30283u0;
                        b10 = RLottieNative.a(absolutePath, (String) pVar2.d, this.e, (int[]) pVar2.f7328c, pVar2.f7326a, this.f30285w);
                    } else {
                        int i11 = pVar.f7327b;
                        if (i11 != 0 && ((String) pVar.d) == null) {
                            String readRes = AndroidUtilities.readRes(i11);
                            if (!TextUtils.isEmpty(readRes)) {
                                com.google.firebase.messaging.p pVar3 = this.f30283u0;
                                pVar3.d = readRes;
                                b10 = RLottieNative.b(readRes, this.e, (int[]) pVar3.f7328c, this.f30285w);
                            }
                        } else {
                            b10 = RLottieNative.b((String) pVar.d, this.e, (int[]) pVar.f7328c, this.f30285w);
                        }
                    }
                    if (b10 != null) {
                        this.m0 = b10;
                        rLottieNative.d();
                        this.v.clear();
                        this.f30278r = null;
                    }
                }
            } catch (Exception unused) {
            }
        }
        RLottieNative rLottieNative2 = this.m0;
        if (this.f30260b0) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        if (this.f30281s0 && (eVar = this.B0) != null) {
            c10 = 0;
            try {
                c10 = eVar.f(bitmap, this.f30258a0 / i10);
                if (!this.B0.g() && this.E0 && this.m0 != null) {
                    this.m0.d();
                    this.m0 = null;
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else {
            c10 = rLottieNative2.c(this.f30258a0, bitmap, z10);
        }
        yf.e eVar2 = this.B0;
        if (eVar2 != null && eVar2.g()) {
            if (!this.D0) {
                this.D0 = true;
                AndroidUtilities.runOnUIThread(this.f30290y0);
            }
            c10 = -1;
            if (this.E0) {
                if (this.m0 == null) {
                    String file2 = ((File) this.f30283u0.e).toString();
                    com.google.firebase.messaging.p pVar4 = this.f30283u0;
                    this.m0 = RLottieNative.a(file2, (String) pVar4.d, null, (int[]) pVar4.f7328c, pVar4.f7326a, this.f30285w);
                }
                if (this.m0 != null) {
                    c10 = this.m0.c(this.f30258a0, bitmap, z10);
                }
            }
        }
        if (c10 < 0) {
            return 2;
        }
        return 1;
    }

    public void C(boolean z10) {
        this.f30271k0 = false;
        this.f30272l0 = true;
        l();
        n();
        if (this.P == null && this.O == null && !this.f30288x0) {
            D(z10);
            yf.e eVar = this.B0;
            if (eVar != null) {
                RandomAccessFile randomAccessFile = eVar.f46765s;
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    eVar.f46765s = null;
                }
                eVar.f46764r = true;
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
            ac0 ac0Var = new ac0(rLottieNative, 15);
            if (z10) {
                DispatchQueuePoolBackground.execute(ac0Var);
            } else {
                Utilities.globalQueue.postRunnable(ac0Var);
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
        AndroidUtilities.recycleBitmaps(arrayList);
        if (this.f30282t0 != null) {
            this.f30282t0 = null;
        }
    }

    public final void F(ImageReceiver imageReceiver) {
        View view;
        pe.b bVar = this.I0;
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
                    xi0 xi0Var = this.O;
                    if (xi0Var != null) {
                        T0.cancelRunnable(xi0Var);
                        yf.e.c();
                        this.O = null;
                    }
                    this.f30288x0 = false;
                    this.D0 = false;
                }
            }
        }
    }

    public final void G() {
        if (!this.Z && !this.f30271k0 && this.W) {
            if (this.f30258a0 <= 2) {
                this.f30258a0 = 0;
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
        if (this.P == null && this.R == null && k() && !w() && !this.V && !this.f30272l0) {
            if (this.f30271k0 || (this.W && !this.X)) {
                if (!this.f30288x0 || this.E0) {
                    if (!this.f30280s.isEmpty()) {
                        this.v.putAll(this.f30280s);
                        this.f30280s.clear();
                    }
                    int[] iArr = this.f30273n;
                    if (iArr != null) {
                        this.f30278r = iArr;
                        this.f30273n = null;
                    }
                    Runnable runnable = this.F0;
                    this.P = runnable;
                    if (this.f30260b0) {
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
        if (this.K == 2 && i10 == 3 && this.f30258a0 != 0) {
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
            if (this.f30258a0 != i10 || z11) {
                this.f30258a0 = i10;
                this.N = false;
                this.X = false;
                if (this.f30275o0) {
                    this.f30276p0 = true;
                    if (this.P != null) {
                        this.f30277q0 = true;
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
                if (z11 && !this.f30271k0) {
                    this.f30271k0 = true;
                    l();
                }
                if (I()) {
                    if (!z10) {
                        try {
                            this.U.await();
                        } catch (Exception e) {
                            FileLog.e(e);
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
        if (this.J == 2 && (weakReference2 = this.H) != null && this.f30258a0 - 1 >= this.I) {
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
        if (this.f30277q0) {
            this.f30277q0 = false;
        } else if (this.f30276p0) {
            this.f30276p0 = false;
        }
        this.X = true;
        this.T = false;
        if (z10 && this.Y) {
            this.X = false;
            this.Y = false;
        }
        if (this.J == 0 && (weakReference = this.H) != null && this.f30258a0 >= this.I && (runnable = (Runnable) weakReference.get()) != null) {
            runnable.run();
        }
        I();
    }

    public final boolean P(int i10) {
        if (this.f30265f == i10 || i10 > this.e[0]) {
            return false;
        }
        this.f30265f = i10;
        return true;
    }

    public final void Q(int i10, String str) {
        this.f30280s.put(str, Integer.valueOf(i10));
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

    public final void T(float f7, boolean z10) {
        if (f7 < 0.0f) {
            f7 = 0.0f;
        } else if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        N((int) (this.e[0] * f7), z10, false);
    }

    public final void U(long j3) {
        int i10;
        int[] iArr = this.e;
        if (iArr[0] != 0 && (i10 = iArr[1]) != 0) {
            N(Math.round(((float) Math.max(0L, j3)) / (1000.0f / i10)) % iArr[0], true, true);
        }
    }

    public final void V(long j3) {
        boolean z10;
        Integer num;
        int i10;
        this.K0 = 0;
        if (this.L0) {
            this.L0 = false;
            l();
        }
        if (!this.N0 && (this.f30271k0 || !this.W)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (this.f30271k0) {
            if (this.Q == null && this.R == null) {
                I();
            } else if (this.R != null) {
                if (this.Q == null || (z10 && !this.f30257a)) {
                    HashMap hashMap = this.f30287x;
                    if (hashMap != null && this.E && (num = (Integer) hashMap.get(Integer.valueOf(this.f30258a0 - 1))) != null) {
                        try {
                            Activity activity = LaunchActivity.G1;
                            if (activity == null) {
                                activity = BubbleActivity.f19732a0;
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
        if (i11 >= rLottieNative.f22093a[0]) {
            return 0;
        }
        if (this.f30260b0) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        if (rLottieNative.c(i11, bitmap, true) == -5) {
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return a(bitmap);
        }
        this.C0 += i10;
        return 1;
    }

    @Override
    public final void b() {
        String str;
        File file;
        com.google.firebase.messaging.p pVar = this.f30283u0;
        File file2 = (File) pVar.e;
        int[] iArr = null;
        if (file2 != null) {
            str = file2.toString();
        } else {
            str = null;
        }
        String str2 = (String) pVar.d;
        if (this.f30262c0) {
            iArr = this.e;
        }
        RLottieNative a2 = RLottieNative.a(str, str2, iArr, (int[]) pVar.f7328c, pVar.f7326a, this.f30285w);
        this.J0 = a2;
        this.C0 = 0;
        if (a2 == null && (file = this.f30279r0) != null) {
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
        return this.f30261c;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f30259b;
    }

    @Override
    public final int getMinimumHeight() {
        return this.f30261c;
    }

    @Override
    public final int getMinimumWidth() {
        return this.f30259b;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public void i() {
        int i10;
        if (this.f30260b0) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        int i11 = this.f30265f;
        if (i11 >= 0 && this.h) {
            int i12 = this.f30258a0;
            if (i12 > i11) {
                int i13 = i12 - i10;
                if (i13 >= i11) {
                    this.f30258a0 = i13;
                    this.N = false;
                    return;
                }
                this.N = true;
                Runnable runnable = this.f30282t0;
                if (runnable != null) {
                    runnable.run();
                    this.f30282t0 = null;
                    return;
                }
                return;
            }
            int i14 = i12 + i10;
            if (i14 < i11) {
                this.f30258a0 = i14;
                this.N = false;
                return;
            }
            this.N = true;
            Runnable runnable2 = this.f30282t0;
            if (runnable2 != null) {
                runnable2.run();
                this.f30282t0 = null;
                return;
            }
            return;
        }
        int i15 = this.f30258a0 + i10;
        if (i11 < 0) {
            i11 = this.e[0];
        }
        if (i15 < i11) {
            if (this.K == 3) {
                this.N = true;
                this.M++;
                return;
            }
            this.f30258a0 = i15;
            this.N = false;
            return;
        }
        int i16 = this.K;
        if (i16 == 1) {
            this.f30258a0 = 0;
            this.N = false;
            if (this.f30289y) {
                this.f30287x = null;
                this.f30289y = false;
            }
            int i17 = this.L;
            if (i17 > 0) {
                this.L = i17 - 1;
            }
        } else if (i16 == 2) {
            this.f30258a0 = 0;
            this.N = true;
            this.M++;
            if (this.f30289y) {
                this.f30287x = null;
                this.f30289y = false;
            }
        } else {
            this.N = true;
            Runnable runnable3 = this.f30282t0;
            if (runnable3 != null) {
                runnable3.run();
                this.f30282t0 = null;
            }
        }
    }

    @Override
    public final boolean isRunning() {
        return this.f30271k0;
    }

    public int j() {
        if (this.f30272l0) {
            return 3;
        }
        if (k()) {
            if (this.m0 == null && this.d) {
                String readRes = AndroidUtilities.readRes(this.f30283u0.f7327b);
                if (TextUtils.isEmpty(readRes)) {
                    return 2;
                }
                this.m0 = RLottieNative.b(readRes, this.e, (int[]) this.f30283u0.f7328c, this.f30285w);
                this.d = false;
                return 1;
            }
            return 1;
        }
        return 2;
    }

    public final boolean k() {
        if (this.f30281s0) {
            if (this.B0 == null && !this.f30274n0) {
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
        AndroidUtilities.executeOnUIThread(new xi0(this, 6));
    }

    public final void m() {
        float f7;
        if (this.f30271k0 && !this.L0) {
            if (!this.O0) {
                float f10 = this.e[1];
                if (this.f30260b0) {
                    f7 = 2.0f;
                } else {
                    f7 = 1.0f;
                }
                int round = Math.round((f10 / f7) * this.F);
                if (round > 0) {
                    if (this.e[0] != 1 || this.J != 0) {
                        this.O0 = true;
                        this.K0 = 0;
                        yf.h.d().b(this.M0, round);
                        x();
                    }
                }
            }
        } else if (this.O0) {
            this.O0 = false;
            this.K0 = 0;
            yf.h.d().g(this.M0);
        }
    }

    public final void n() {
        xi0 xi0Var = this.O;
        if (xi0Var != null) {
            T0.cancelRunnable(xi0Var);
            yf.e.c();
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
        if (!this.f30271k0 && this.W) {
            if (this.f30258a0 <= 2) {
                this.f30258a0 = 0;
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
        this.f30266f0 = true;
    }

    public void p() {
        if (this.V) {
            n();
            if (this.P == null && this.O == null && this.m0 != null) {
                D(true);
            }
        }
        if ((this.m0 == null || this.f30274n0) && this.B0 == null) {
            E();
            return;
        }
        this.T = true;
        if (!v()) {
            stop();
        }
        if (this.f30271k0) {
            I();
        }
    }

    public final void q(Canvas canvas, Paint paint, boolean z10, long j3, int i10) {
        RectF rectF;
        float width;
        boolean z11;
        float f7;
        if (k() && !this.V) {
            if (!z10) {
                V(j3);
            }
            if (z10) {
                rectF = this.f30269i0[i10];
            } else {
                rectF = this.f30268h0;
            }
            if (paint == null) {
                if (z10) {
                    paint = this.f30270j0[i10];
                } else {
                    paint = getPaint();
                }
            }
            if (paint.getAlpha() != 0 && !this.f30276p0 && this.Q != null) {
                boolean z12 = true;
                if (!z10) {
                    rectF.set(getBounds());
                    if (this.f30266f0) {
                        this.f30263d0 = rectF.width() / this.f30259b;
                        this.f30264e0 = rectF.height() / this.f30261c;
                        this.f30266f0 = false;
                        if (Math.abs(rectF.width() - this.f30259b) < AndroidUtilities.dp(1.0f) && Math.abs(rectF.height() - this.f30261c) < AndroidUtilities.dp(1.0f)) {
                            z12 = false;
                        }
                        this.f30267g0 = z12;
                    }
                    width = this.f30263d0;
                    f7 = this.f30264e0;
                    z11 = this.f30267g0;
                } else {
                    width = rectF.width() / this.f30259b;
                    float height = rectF.height() / this.f30261c;
                    if (Math.abs(rectF.width() - this.f30259b) < AndroidUtilities.dp(1.0f) && Math.abs(rectF.height() - this.f30261c) < AndroidUtilities.dp(1.0f)) {
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
        if (!this.f30271k0) {
            if ((this.K < 2 || this.M == 0) && this.f30265f != this.f30258a0) {
                this.f30271k0 = true;
                this.L0 = false;
                if (this.f30275o0) {
                    this.f30276p0 = true;
                    if (this.P != null) {
                        this.f30277q0 = true;
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
        this.f30271k0 = false;
        l();
    }

    public final float t() {
        return this.f30258a0 / this.e[0];
    }

    public final boolean u() {
        if (!this.f30272l0) {
            if ((this.Q != null || this.R != null) && !this.f30276p0) {
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
        if (!this.f30272l0) {
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

    public yi0(int i10, int i11) {
        this.e = new int[3];
        this.f30265f = -1;
        this.f30280s = new HashMap();
        this.v = new HashMap();
        this.f30285w = new HashMap();
        this.f30289y = false;
        this.E = true;
        this.F = 1.0f;
        this.K = 1;
        this.L = -1;
        this.f30263d0 = 1.0f;
        this.f30264e0 = 1.0f;
        this.f30268h0 = new RectF();
        this.f30269i0 = new RectF[2];
        this.f30270j0 = new Paint[2];
        this.f30284v0 = new xi0(this, 1);
        this.f30286w0 = new xi0(this, 2);
        this.f30290y0 = new xi0(this, 3);
        this.f30291z0 = new xi0(this, 4);
        this.F0 = new xi0(this, 5);
        this.I0 = new pe.b(true);
        this.M0 = new c6(this, 2);
        this.f30259b = i10;
        this.f30261c = i11;
        this.G = false;
    }

    public yi0(int i10, int i11, int i12) {
        this(i10, i11, i12, true, null);
    }

    public yi0(int i10, int i11, int i12, boolean z10, int[] iArr) {
        int[] iArr2 = new int[3];
        this.e = iArr2;
        this.f30265f = -1;
        this.f30280s = new HashMap();
        this.v = new HashMap();
        HashMap hashMap = new HashMap();
        this.f30285w = hashMap;
        this.f30289y = false;
        this.E = true;
        this.F = 1.0f;
        this.K = 1;
        this.L = -1;
        this.f30263d0 = 1.0f;
        this.f30264e0 = 1.0f;
        this.f30268h0 = new RectF();
        this.f30269i0 = new RectF[2];
        this.f30270j0 = new Paint[2];
        this.f30284v0 = new xi0(this, 1);
        this.f30286w0 = new xi0(this, 2);
        this.f30290y0 = new xi0(this, 3);
        this.f30291z0 = new xi0(this, 4);
        this.F0 = new xi0(this, 5);
        this.I0 = new pe.b(true);
        this.M0 = new c6(this, 2);
        this.f30259b = i11;
        this.f30261c = i12;
        this.K = 0;
        getPaint().setFlags(2);
        ?? obj = new Object();
        this.f30283u0 = obj;
        obj.f7328c = iArr == null ? null : (int[]) iArr.clone();
        long find = ResLottieMeta.find(i10);
        if (find != -1) {
            this.d = true;
            obj.f7327b = i10;
            this.G = ResLottieMeta.isMonoColorOf(find);
            iArr2[0] = ResLottieMeta.frameCountOf(find);
            iArr2[1] = ResLottieMeta.fpsOf(find);
        } else {
            this.G = false;
            String readRes = AndroidUtilities.readRes(i10);
            if (TextUtils.isEmpty(readRes)) {
                this.f30283u0 = null;
                return;
            } else {
                obj.d = readRes;
                this.m0 = RLottieNative.b(readRes, iArr2, (int[]) obj.f7328c, hashMap);
            }
        }
        if (this.G) {
            setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        if (z10) {
            J(true);
        }
    }
}
