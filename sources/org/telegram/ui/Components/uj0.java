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
public class uj0 extends BitmapDrawable implements Animatable, zf.c {
    public static final AtomicInteger P0 = new AtomicInteger();
    public static final AtomicInteger Q0 = new AtomicInteger();
    public static final ExecutorService R0 = Executors.newFixedThreadPool(4, new e2.l0(2));
    public static final ExecutorService S0 = Executors.newFixedThreadPool(2, new e2.l0(3));
    public static DispatchQueue T0;
    public Runnable A0;
    public zf.e B0;
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
    public final re.b I0;
    public int J;
    public RLottieNative J0;
    public int K;
    public int K0;
    public int L;
    public volatile boolean L0;
    public int M;
    public final zf.g M0;
    public volatile boolean N;
    public boolean N0;
    public tj0 O;
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
    public boolean f30975a;
    public int f30976a0;
    public final int f30977b;
    public final boolean f30978b0;
    public final int f30979c;
    public final boolean f30980c0;
    public boolean d;
    public float f30981d0;
    public final int[] e;
    public float f30982e0;
    public int f30983f;
    public boolean f30984f0;
    public boolean f30985g0;
    public boolean h;
    public final RectF f30986h0;
    public final RectF[] f30987i0;
    public final Paint[] f30988j0;
    public volatile boolean f30989k0;
    public volatile boolean f30990l0;
    public volatile RLottieNative m0;
    public int[] f30991n;
    public final boolean f30992n0;
    public boolean f30993o0;
    public boolean f30994p0;
    public boolean f30995q0;
    public int[] f30996r;
    public final File f30997r0;
    public final HashMap f30998s;
    public final boolean f30999s0;
    public Runnable f31000t0;
    public final com.google.firebase.messaging.n f31001u0;
    public final HashMap v;
    public final Runnable f31002v0;
    public final HashMap f31003w;
    public final Runnable f31004w0;
    public HashMap f31005x;
    public boolean f31006x0;
    public boolean f31007y;
    public final Runnable f31008y0;
    public final Runnable f31009z0;

    public uj0(java.io.File r21, java.lang.String r22, int r23, int r24, af.l r25, boolean r26, int r27, boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.uj0.<init>(java.io.File, java.lang.String, int, int, af.l, boolean, int, boolean):void");
    }

    public static void d(uj0 uj0Var) {
        if (uj0Var.O != null) {
            zf.e.c();
            uj0Var.O = null;
        }
        uj0Var.f31006x0 = false;
        uj0Var.p();
        Runnable runnable = uj0Var.A0;
        if (runnable != null) {
            runnable.run();
            uj0Var.A0 = null;
        }
    }

    public static void e(uj0 uj0Var) {
        if (!uj0Var.f30990l0 && !uj0Var.V && uj0Var.k() && uj0Var.O == null) {
            uj0Var.f31006x0 = true;
            if (T0 == null) {
                T0 = new DispatchQueue("cache generator queue");
            }
            zf.e.A++;
            DispatchQueue dispatchQueue = T0;
            tj0 tj0Var = new tj0(uj0Var, 0);
            uj0Var.O = tj0Var;
            dispatchQueue.postRunnable(tj0Var);
        }
    }

    public static void f(uj0 uj0Var) {
        int i10;
        Bitmap.Config config;
        Bitmap createBitmap;
        boolean z10;
        try {
            i10 = uj0Var.j();
            if (i10 == 1) {
                if (uj0Var.S != null) {
                    createBitmap = uj0Var.S;
                    z10 = true;
                } else {
                    if (uj0Var.G) {
                        config = Bitmap.Config.ALPHA_8;
                    } else {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    createBitmap = Bitmap.createBitmap(uj0Var.f30977b, uj0Var.f30979c, config);
                    uj0Var.S = createBitmap;
                    z10 = false;
                }
                int B = uj0Var.B(createBitmap, z10);
                if (B == 1) {
                    uj0Var.R = createBitmap;
                    uj0Var.i();
                }
                i10 = B;
            }
        } catch (Exception e) {
            FileLog.e(e);
            i10 = 2;
        }
        if (i10 == 1) {
            uj0Var.G0 = 0;
            AndroidUtilities.runOnUIThread(uj0Var.f31004w0);
        } else if (i10 == 2) {
            AndroidUtilities.runOnUIThread(uj0Var.f31002v0, uj0Var.G0);
            uj0Var.G0 = Math.min((Math.max(uj0Var.G0, 2) * 3) / 2, 2000);
        } else if (i10 == 3) {
            AndroidUtilities.runOnUIThread(uj0Var.f31002v0);
        }
        CountDownLatch countDownLatch = uj0Var.U;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    public static void g(uj0 uj0Var) {
        int i10 = uj0Var.K0 + 1;
        uj0Var.K0 = i10;
        if (i10 > 10) {
            uj0Var.L0 = true;
        }
        uj0Var.m();
        if (uj0Var.O0) {
            uj0Var.N0 = true;
            uj0Var.x();
        }
    }

    public static void h(uj0 uj0Var) {
        uj0Var.X = true;
        if ((!uj0Var.f30989k0 && uj0Var.W) || (uj0Var.Q == null && uj0Var.R != null)) {
            uj0Var.x();
        }
        uj0Var.p();
    }

    public final boolean A() {
        if (this.f30976a0 != this.e[0] - 1) {
            return false;
        }
        return true;
    }

    public int B(Bitmap bitmap, boolean z10) {
        int i10;
        int c10;
        zf.e eVar;
        RLottieNative b10;
        RLottieNative rLottieNative = this.m0;
        if (rLottieNative != null) {
            try {
                if (!this.v.isEmpty() || this.f30996r != null) {
                    this.f31003w.putAll(this.v);
                    int[] iArr = this.f30996r;
                    if (iArr != null) {
                        this.f31001u0.f7656c = (int[]) iArr.clone();
                    }
                    com.google.firebase.messaging.n nVar = this.f31001u0;
                    File file = (File) nVar.e;
                    if (file != null) {
                        String absolutePath = file.getAbsolutePath();
                        com.google.firebase.messaging.n nVar2 = this.f31001u0;
                        b10 = RLottieNative.a(absolutePath, (String) nVar2.d, this.e, (int[]) nVar2.f7656c, nVar2.f7654a, this.f31003w);
                    } else {
                        int i11 = nVar.f7655b;
                        if (i11 != 0 && ((String) nVar.d) == null) {
                            String readRes = AndroidUtilities.readRes(i11);
                            if (!TextUtils.isEmpty(readRes)) {
                                com.google.firebase.messaging.n nVar3 = this.f31001u0;
                                nVar3.d = readRes;
                                b10 = RLottieNative.b(readRes, this.e, (int[]) nVar3.f7656c, this.f31003w);
                            }
                        } else {
                            b10 = RLottieNative.b((String) nVar.d, this.e, (int[]) nVar.f7656c, this.f31003w);
                        }
                    }
                    if (b10 != null) {
                        this.m0 = b10;
                        rLottieNative.d();
                        this.v.clear();
                        this.f30996r = null;
                    }
                }
            } catch (Exception unused) {
            }
        }
        RLottieNative rLottieNative2 = this.m0;
        if (this.f30978b0) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        if (this.f30999s0 && (eVar = this.B0) != null) {
            c10 = 0;
            try {
                c10 = eVar.f(bitmap, this.f30976a0 / i10);
                if (!this.B0.g() && this.E0 && this.m0 != null) {
                    this.m0.d();
                    this.m0 = null;
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else {
            c10 = rLottieNative2.c(this.f30976a0, bitmap, z10);
        }
        zf.e eVar2 = this.B0;
        if (eVar2 != null && eVar2.g()) {
            if (!this.D0) {
                this.D0 = true;
                AndroidUtilities.runOnUIThread(this.f31008y0);
            }
            c10 = -1;
            if (this.E0) {
                if (this.m0 == null) {
                    String file2 = ((File) this.f31001u0.e).toString();
                    com.google.firebase.messaging.n nVar4 = this.f31001u0;
                    this.m0 = RLottieNative.a(file2, (String) nVar4.d, null, (int[]) nVar4.f7656c, nVar4.f7654a, this.f31003w);
                }
                if (this.m0 != null) {
                    c10 = this.m0.c(this.f30976a0, bitmap, z10);
                }
            }
        }
        if (c10 < 0) {
            return 2;
        }
        return 1;
    }

    public void C(boolean z10) {
        this.f30989k0 = false;
        this.f30990l0 = true;
        l();
        n();
        if (this.P == null && this.O == null && !this.f31006x0) {
            D(z10);
            zf.e eVar = this.B0;
            if (eVar != null) {
                RandomAccessFile randomAccessFile = eVar.f51551s;
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    eVar.f51551s = null;
                }
                eVar.f51550r = true;
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
            rc0 rc0Var = new rc0(rLottieNative, 15);
            if (z10) {
                DispatchQueuePoolBackground.execute(rc0Var);
            } else {
                Utilities.globalQueue.postRunnable(rc0Var);
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
        if (this.f31000t0 != null) {
            this.f31000t0 = null;
        }
    }

    public final void F(ImageReceiver imageReceiver) {
        View view;
        re.b bVar = this.I0;
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
                    tj0 tj0Var = this.O;
                    if (tj0Var != null) {
                        T0.cancelRunnable(tj0Var);
                        zf.e.c();
                        this.O = null;
                    }
                    this.f31006x0 = false;
                    this.D0 = false;
                }
            }
        }
    }

    public final void G() {
        if (!this.Z && !this.f30989k0 && this.W) {
            if (this.f30976a0 <= 2) {
                this.f30976a0 = 0;
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
        if (this.P == null && this.R == null && k() && !w() && !this.V && !this.f30990l0) {
            if (this.f30989k0 || (this.W && !this.X)) {
                if (!this.f31006x0 || this.E0) {
                    if (!this.f30998s.isEmpty()) {
                        this.v.putAll(this.f30998s);
                        this.f30998s.clear();
                    }
                    int[] iArr = this.f30991n;
                    if (iArr != null) {
                        this.f30996r = iArr;
                        this.f30991n = null;
                    }
                    Runnable runnable = this.F0;
                    this.P = runnable;
                    if (this.f30978b0) {
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
        if (this.K == 2 && i10 == 3 && this.f30976a0 != 0) {
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
            if (this.f30976a0 != i10 || z11) {
                this.f30976a0 = i10;
                this.N = false;
                this.X = false;
                if (this.f30993o0) {
                    this.f30994p0 = true;
                    if (this.P != null) {
                        this.f30995q0 = true;
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
                if (z11 && !this.f30989k0) {
                    this.f30989k0 = true;
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
        if (this.J == 2 && (weakReference2 = this.H) != null && this.f30976a0 - 1 >= this.I) {
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
        if (this.f30995q0) {
            this.f30995q0 = false;
        } else if (this.f30994p0) {
            this.f30994p0 = false;
        }
        this.X = true;
        this.T = false;
        if (z10 && this.Y) {
            this.X = false;
            this.Y = false;
        }
        if (this.J == 0 && (weakReference = this.H) != null && this.f30976a0 >= this.I && (runnable = (Runnable) weakReference.get()) != null) {
            runnable.run();
        }
        I();
    }

    public final boolean P(int i10) {
        if (this.f30983f == i10 || i10 > this.e[0]) {
            return false;
        }
        this.f30983f = i10;
        return true;
    }

    public final void Q(int i10, String str) {
        this.f30998s.put(str, Integer.valueOf(i10));
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

    public final void T(float r3, boolean r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.uj0.T(float, boolean):void");
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
        if (!this.N0 && (this.f30989k0 || !this.W)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (this.f30989k0) {
            if (this.Q == null && this.R == null) {
                I();
            } else if (this.R != null) {
                if (this.Q == null || (z10 && !this.f30975a)) {
                    HashMap hashMap = this.f31005x;
                    if (hashMap != null && this.E && (num = (Integer) hashMap.get(Integer.valueOf(this.f30976a0 - 1))) != null) {
                        try {
                            Activity activity = LaunchActivity.H1;
                            if (activity == null) {
                                activity = BubbleActivity.f21937a0;
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
        if (i11 >= rLottieNative.f24300a[0]) {
            return 0;
        }
        if (this.f30978b0) {
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
        com.google.firebase.messaging.n nVar = this.f31001u0;
        File file2 = (File) nVar.e;
        int[] iArr = null;
        if (file2 != null) {
            str = file2.toString();
        } else {
            str = null;
        }
        String str2 = (String) nVar.d;
        if (this.f30980c0) {
            iArr = this.e;
        }
        RLottieNative a2 = RLottieNative.a(str, str2, iArr, (int[]) nVar.f7656c, nVar.f7654a, this.f31003w);
        this.J0 = a2;
        this.C0 = 0;
        if (a2 == null && (file = this.f30997r0) != null) {
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
        return this.f30979c;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f30977b;
    }

    @Override
    public final int getMinimumHeight() {
        return this.f30979c;
    }

    @Override
    public final int getMinimumWidth() {
        return this.f30977b;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public void i() {
        int i10;
        if (this.f30978b0) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        int i11 = this.f30983f;
        if (i11 >= 0 && this.h) {
            int i12 = this.f30976a0;
            if (i12 > i11) {
                int i13 = i12 - i10;
                if (i13 >= i11) {
                    this.f30976a0 = i13;
                    this.N = false;
                    return;
                }
                this.N = true;
                Runnable runnable = this.f31000t0;
                if (runnable != null) {
                    runnable.run();
                    this.f31000t0 = null;
                    return;
                }
                return;
            }
            int i14 = i12 + i10;
            if (i14 < i11) {
                this.f30976a0 = i14;
                this.N = false;
                return;
            }
            this.N = true;
            Runnable runnable2 = this.f31000t0;
            if (runnable2 != null) {
                runnable2.run();
                this.f31000t0 = null;
                return;
            }
            return;
        }
        int i15 = this.f30976a0 + i10;
        if (i11 < 0) {
            i11 = this.e[0];
        }
        if (i15 < i11) {
            if (this.K == 3) {
                this.N = true;
                this.M++;
                return;
            }
            this.f30976a0 = i15;
            this.N = false;
            return;
        }
        int i16 = this.K;
        if (i16 == 1) {
            this.f30976a0 = 0;
            this.N = false;
            if (this.f31007y) {
                this.f31005x = null;
                this.f31007y = false;
            }
            int i17 = this.L;
            if (i17 > 0) {
                this.L = i17 - 1;
            }
        } else if (i16 == 2) {
            this.f30976a0 = 0;
            this.N = true;
            this.M++;
            if (this.f31007y) {
                this.f31005x = null;
                this.f31007y = false;
            }
        } else {
            this.N = true;
            Runnable runnable3 = this.f31000t0;
            if (runnable3 != null) {
                runnable3.run();
                this.f31000t0 = null;
            }
        }
    }

    @Override
    public final boolean isRunning() {
        return this.f30989k0;
    }

    public int j() {
        if (this.f30990l0) {
            return 3;
        }
        if (k()) {
            if (this.m0 == null && this.d) {
                String readRes = AndroidUtilities.readRes(this.f31001u0.f7655b);
                if (TextUtils.isEmpty(readRes)) {
                    return 2;
                }
                this.m0 = RLottieNative.b(readRes, this.e, (int[]) this.f31001u0.f7656c, this.f31003w);
                this.d = false;
                return 1;
            }
            return 1;
        }
        return 2;
    }

    public final boolean k() {
        if (this.f30999s0) {
            if (this.B0 == null && !this.f30992n0) {
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
        AndroidUtilities.executeOnUIThread(new tj0(this, 6));
    }

    public final void m() {
        float f7;
        if (this.f30989k0 && !this.L0) {
            if (!this.O0) {
                float f10 = this.e[1];
                if (this.f30978b0) {
                    f7 = 2.0f;
                } else {
                    f7 = 1.0f;
                }
                int round = Math.round((f10 / f7) * this.F);
                if (round > 0) {
                    if (this.e[0] != 1 || this.J != 0) {
                        this.O0 = true;
                        this.K0 = 0;
                        zf.h.d().b(this.M0, round);
                        x();
                    }
                }
            }
        } else if (this.O0) {
            this.O0 = false;
            this.K0 = 0;
            zf.h.d().g(this.M0);
        }
    }

    public final void n() {
        tj0 tj0Var = this.O;
        if (tj0Var != null) {
            T0.cancelRunnable(tj0Var);
            zf.e.c();
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
        if (!this.f30989k0 && this.W) {
            if (this.f30976a0 <= 2) {
                this.f30976a0 = 0;
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
        this.f30984f0 = true;
    }

    public void p() {
        if (this.V) {
            n();
            if (this.P == null && this.O == null && this.m0 != null) {
                D(true);
            }
        }
        if ((this.m0 == null || this.f30992n0) && this.B0 == null) {
            E();
            return;
        }
        this.T = true;
        if (!v()) {
            stop();
        }
        if (this.f30989k0) {
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
                rectF = this.f30987i0[i10];
            } else {
                rectF = this.f30986h0;
            }
            if (paint == null) {
                if (z10) {
                    paint = this.f30988j0[i10];
                } else {
                    paint = getPaint();
                }
            }
            if (paint.getAlpha() != 0 && !this.f30994p0 && this.Q != null) {
                boolean z12 = true;
                if (!z10) {
                    rectF.set(getBounds());
                    if (this.f30984f0) {
                        this.f30981d0 = rectF.width() / this.f30977b;
                        this.f30982e0 = rectF.height() / this.f30979c;
                        this.f30984f0 = false;
                        if (Math.abs(rectF.width() - this.f30977b) < AndroidUtilities.dp(1.0f) && Math.abs(rectF.height() - this.f30979c) < AndroidUtilities.dp(1.0f)) {
                            z12 = false;
                        }
                        this.f30985g0 = z12;
                    }
                    width = this.f30981d0;
                    f7 = this.f30982e0;
                    z11 = this.f30985g0;
                } else {
                    width = rectF.width() / this.f30977b;
                    float height = rectF.height() / this.f30979c;
                    if (Math.abs(rectF.width() - this.f30977b) < AndroidUtilities.dp(1.0f) && Math.abs(rectF.height() - this.f30979c) < AndroidUtilities.dp(1.0f)) {
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
        if (!this.f30989k0) {
            if ((this.K < 2 || this.M == 0) && this.f30983f != this.f30976a0) {
                this.f30989k0 = true;
                this.L0 = false;
                if (this.f30993o0) {
                    this.f30994p0 = true;
                    if (this.P != null) {
                        this.f30995q0 = true;
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
        this.f30989k0 = false;
        l();
    }

    public final float t() {
        return this.f30976a0 / this.e[0];
    }

    public final boolean u() {
        if (!this.f30990l0) {
            if ((this.Q != null || this.R != null) && !this.f30994p0) {
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
        if (!this.f30990l0) {
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

    public uj0(int i10, int i11) {
        this.e = new int[3];
        this.f30983f = -1;
        this.f30998s = new HashMap();
        this.v = new HashMap();
        this.f31003w = new HashMap();
        this.f31007y = false;
        this.E = true;
        this.F = 1.0f;
        this.K = 1;
        this.L = -1;
        this.f30981d0 = 1.0f;
        this.f30982e0 = 1.0f;
        this.f30986h0 = new RectF();
        this.f30987i0 = new RectF[2];
        this.f30988j0 = new Paint[2];
        this.f31002v0 = new tj0(this, 1);
        this.f31004w0 = new tj0(this, 2);
        this.f31008y0 = new tj0(this, 3);
        this.f31009z0 = new tj0(this, 4);
        this.F0 = new tj0(this, 5);
        this.I0 = new re.b(true, true);
        this.M0 = new d6(this, 2);
        this.f30977b = i10;
        this.f30979c = i11;
        this.G = false;
    }

    public uj0(int i10, int i11, int i12) {
        this(i10, i11, i12, true, null);
    }

    public uj0(int i10, int i11, int i12, boolean z10, int[] iArr) {
        int[] iArr2 = new int[3];
        this.e = iArr2;
        this.f30983f = -1;
        this.f30998s = new HashMap();
        this.v = new HashMap();
        HashMap hashMap = new HashMap();
        this.f31003w = hashMap;
        this.f31007y = false;
        this.E = true;
        this.F = 1.0f;
        this.K = 1;
        this.L = -1;
        this.f30981d0 = 1.0f;
        this.f30982e0 = 1.0f;
        this.f30986h0 = new RectF();
        this.f30987i0 = new RectF[2];
        this.f30988j0 = new Paint[2];
        this.f31002v0 = new tj0(this, 1);
        this.f31004w0 = new tj0(this, 2);
        this.f31008y0 = new tj0(this, 3);
        this.f31009z0 = new tj0(this, 4);
        this.F0 = new tj0(this, 5);
        this.I0 = new re.b(true, true);
        this.M0 = new d6(this, 2);
        this.f30977b = i11;
        this.f30979c = i12;
        this.K = 0;
        getPaint().setFlags(2);
        ?? obj = new Object();
        this.f31001u0 = obj;
        obj.f7656c = iArr == null ? null : (int[]) iArr.clone();
        long find = ResLottieMeta.find(i10);
        if (find != -1) {
            this.d = true;
            obj.f7655b = i10;
            this.G = ResLottieMeta.isMonoColorOf(find);
            iArr2[0] = ResLottieMeta.frameCountOf(find);
            iArr2[1] = ResLottieMeta.fpsOf(find);
        } else {
            this.G = false;
            String readRes = AndroidUtilities.readRes(i10);
            if (TextUtils.isEmpty(readRes)) {
                this.f31001u0 = null;
                return;
            } else {
                obj.d = readRes;
                this.m0 = RLottieNative.b(readRes, iArr2, (int[]) obj.f7656c, hashMap);
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
