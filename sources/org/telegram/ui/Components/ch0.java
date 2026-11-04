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
public class ch0 extends BitmapDrawable implements Animatable, cg.f {
    public static final AtomicInteger Q0 = new AtomicInteger();
    public static final AtomicInteger R0 = new AtomicInteger();
    public static final ExecutorService S0 = Executors.newFixedThreadPool(4, new g2.m0(2));
    public static final ExecutorService T0 = Executors.newFixedThreadPool(2, new g2.m0(3));
    public static org.telegram.messenger.q5 U0;
    public final Runnable A0;
    public Runnable B0;
    public cg.h C0;
    public int D0;
    public boolean E;
    public boolean E0;
    public boolean F;
    public boolean F0;
    public float G;
    public final Runnable G0;
    public final boolean H;
    public int H0;
    public WeakReference I;
    public WeakReference I0;
    public int J;
    public final ue.b J0;
    public int K;
    public RLottieNative K0;
    public int L;
    public int L0;
    public int M;
    public volatile boolean M0;
    public int N;
    public final s5 N0;
    public volatile boolean O;
    public boolean O0;
    public bh0 P;
    public boolean P0;
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
    public boolean f32718a;
    public boolean f32719a0;
    public final int f32720b;
    public int f32721b0;
    public final int f32722c;
    public final boolean f32723c0;
    public boolean d;
    public final boolean f32724d0;
    public final int[] f32725e;
    public float f32726e0;
    public int f32727f;
    public float f32728f0;
    public boolean f32729g0;
    public boolean h;
    public boolean f32730h0;
    public final RectF f32731i0;
    public final RectF[] f32732j0;
    public final Paint[] f32733k0;
    public volatile boolean f32734l0;
    public volatile boolean m0;
    public int[] f32735n;
    public volatile RLottieNative f32736n0;
    public final boolean f32737o0;
    public boolean f32738p0;
    public boolean f32739q0;
    public int[] f32740r;
    public boolean f32741r0;
    public final HashMap f32742s;
    public final File f32743s0;
    public final boolean f32744t0;
    public Runnable f32745u0;
    public final org.telegram.ui.ActionBar.h4 f32746v0;
    public final HashMap f32747w;
    public final Runnable f32748w0;
    public final HashMap f32749x;
    public final Runnable f32750x0;
    public HashMap f32751y;
    public boolean f32752y0;
    public final Runnable f32753z0;

    public ch0(java.io.File r21, java.lang.String r22, int r23, int r24, bd.i r25, boolean r26, int r27, boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ch0.<init>(java.io.File, java.lang.String, int, int, bd.i, boolean, int, boolean):void");
    }

    public static void d(ch0 ch0Var) {
        if (ch0Var.P != null) {
            cg.h.c();
            ch0Var.P = null;
        }
        ch0Var.f32752y0 = false;
        ch0Var.p();
        Runnable runnable = ch0Var.B0;
        if (runnable != null) {
            runnable.run();
            ch0Var.B0 = null;
        }
    }

    public static void e(ch0 ch0Var) {
        if (!ch0Var.m0 && !ch0Var.W && ch0Var.k() && ch0Var.P == null) {
            ch0Var.f32752y0 = true;
            if (U0 == null) {
                U0 = new org.telegram.messenger.q5("cache generator queue", true);
            }
            cg.h.A++;
            org.telegram.messenger.q5 q5Var = U0;
            bh0 bh0Var = new bh0(ch0Var, 0);
            ch0Var.P = bh0Var;
            q5Var.postRunnable(bh0Var);
        }
    }

    public static void f(ch0 ch0Var) {
        int i3;
        Bitmap.Config config;
        Bitmap createBitmap;
        boolean z10;
        try {
            i3 = ch0Var.j();
            if (i3 == 1) {
                if (ch0Var.T != null) {
                    createBitmap = ch0Var.T;
                    z10 = true;
                } else {
                    if (ch0Var.H) {
                        config = Bitmap.Config.ALPHA_8;
                    } else {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    createBitmap = Bitmap.createBitmap(ch0Var.f32720b, ch0Var.f32722c, config);
                    ch0Var.T = createBitmap;
                    z10 = false;
                }
                int B = ch0Var.B(createBitmap, z10);
                if (B == 1) {
                    ch0Var.S = createBitmap;
                    ch0Var.i();
                }
                i3 = B;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            i3 = 2;
        }
        if (i3 == 1) {
            ch0Var.H0 = 0;
            org.telegram.messenger.g0.h3(ch0Var.f32750x0);
        } else if (i3 == 2) {
            org.telegram.messenger.g0.i3(ch0Var.f32748w0, ch0Var.H0);
            ch0Var.H0 = Math.min((Math.max(ch0Var.H0, 2) * 3) / 2, 2000);
        } else if (i3 == 3) {
            org.telegram.messenger.g0.h3(ch0Var.f32748w0);
        }
        CountDownLatch countDownLatch = ch0Var.V;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    public static void g(ch0 ch0Var) {
        int i3 = ch0Var.L0 + 1;
        ch0Var.L0 = i3;
        if (i3 > 10) {
            ch0Var.M0 = true;
        }
        ch0Var.m();
        if (ch0Var.P0) {
            ch0Var.O0 = true;
            ch0Var.x();
        }
    }

    public static void h(ch0 ch0Var) {
        ch0Var.Y = true;
        if ((!ch0Var.f32734l0 && ch0Var.X) || (ch0Var.R == null && ch0Var.S != null)) {
            ch0Var.x();
        }
        ch0Var.p();
    }

    public final boolean A() {
        if (this.f32721b0 != this.f32725e[0] - 1) {
            return false;
        }
        return true;
    }

    public int B(Bitmap bitmap, boolean z10) {
        int i3;
        int c2;
        cg.h hVar;
        RLottieNative b10;
        RLottieNative rLottieNative = this.f32736n0;
        if (rLottieNative != null) {
            try {
                if (!this.f32747w.isEmpty() || this.f32740r != null) {
                    this.f32749x.putAll(this.f32747w);
                    int[] iArr = this.f32740r;
                    if (iArr != null) {
                        this.f32746v0.f27575c = (int[]) iArr.clone();
                    }
                    org.telegram.ui.ActionBar.h4 h4Var = this.f32746v0;
                    File file = (File) h4Var.d;
                    if (file != null) {
                        String absolutePath = file.getAbsolutePath();
                        org.telegram.ui.ActionBar.h4 h4Var2 = this.f32746v0;
                        b10 = RLottieNative.a(absolutePath, (String) h4Var2.f27576e, this.f32725e, (int[]) h4Var2.f27575c, h4Var2.f27573a, this.f32749x);
                    } else {
                        int i10 = h4Var.f27574b;
                        if (i10 != 0 && ((String) h4Var.f27576e) == null) {
                            String y22 = org.telegram.messenger.g0.y2(null, i10);
                            if (!TextUtils.isEmpty(y22)) {
                                org.telegram.ui.ActionBar.h4 h4Var3 = this.f32746v0;
                                h4Var3.f27576e = y22;
                                b10 = RLottieNative.b(y22, this.f32725e, (int[]) h4Var3.f27575c, this.f32749x);
                            }
                        } else {
                            b10 = RLottieNative.b((String) h4Var.f27576e, this.f32725e, (int[]) h4Var.f27575c, this.f32749x);
                        }
                    }
                    if (b10 != null) {
                        this.f32736n0 = b10;
                        rLottieNative.d();
                        this.f32747w.clear();
                        this.f32740r = null;
                    }
                }
            } catch (Exception unused) {
            }
        }
        RLottieNative rLottieNative2 = this.f32736n0;
        if (this.f32723c0) {
            i3 = 2;
        } else {
            i3 = 1;
        }
        if (this.f32744t0 && (hVar = this.C0) != null) {
            c2 = 0;
            try {
                c2 = hVar.f(bitmap, this.f32721b0 / i3);
                if (!this.C0.g() && this.F0 && this.f32736n0 != null) {
                    this.f32736n0.d();
                    this.f32736n0 = null;
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        } else {
            c2 = rLottieNative2.c(this.f32721b0, bitmap, z10);
        }
        cg.h hVar2 = this.C0;
        if (hVar2 != null && hVar2.g()) {
            if (!this.E0) {
                this.E0 = true;
                org.telegram.messenger.g0.h3(this.f32753z0);
            }
            c2 = -1;
            if (this.F0) {
                if (this.f32736n0 == null) {
                    String file2 = ((File) this.f32746v0.d).toString();
                    org.telegram.ui.ActionBar.h4 h4Var4 = this.f32746v0;
                    this.f32736n0 = RLottieNative.a(file2, (String) h4Var4.f27576e, null, (int[]) h4Var4.f27575c, h4Var4.f27573a, this.f32749x);
                }
                if (this.f32736n0 != null) {
                    c2 = this.f32736n0.c(this.f32721b0, bitmap, z10);
                }
            }
        }
        if (c2 < 0) {
            return 2;
        }
        return 1;
    }

    public void C(boolean z10) {
        this.f32734l0 = false;
        this.m0 = true;
        l();
        n();
        if (this.Q == null && this.P == null && !this.f32752y0) {
            D(z10);
            cg.h hVar = this.C0;
            if (hVar != null) {
                RandomAccessFile randomAccessFile = hVar.f4681s;
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (IOException e10) {
                        e10.printStackTrace();
                    }
                    hVar.f4681s = null;
                }
                hVar.f4680r = true;
                this.C0 = null;
            }
            E();
            return;
        }
        this.W = true;
    }

    public void D(boolean z10) {
        RLottieNative rLottieNative = this.f32736n0;
        this.f32736n0 = null;
        if (rLottieNative != null) {
            jb0 jb0Var = new jb0(rLottieNative, 12);
            if (z10) {
                org.telegram.messenger.r5.a(jb0Var);
            } else {
                Utilities.f21387e.c(jb0Var);
            }
        }
    }

    public final void E() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.R);
        arrayList.add(this.T);
        arrayList.add(this.S);
        this.S = null;
        this.R = null;
        this.T = null;
        org.telegram.messenger.g0.A2(arrayList);
        if (this.f32745u0 != null) {
            this.f32745u0 = null;
        }
    }

    public final void F(ImageReceiver imageReceiver) {
        View view;
        ue.b bVar = this.J0;
        bVar.remove(imageReceiver);
        if (this.C0 != null && U0 != null && this.P != null) {
            WeakReference weakReference = this.I0;
            if (weakReference != null) {
                view = (View) weakReference.get();
            } else {
                view = null;
            }
            if (bVar.isEmpty() && getCallback() == null) {
                if (view == null || !view.isAttachedToWindow()) {
                    bh0 bh0Var = this.P;
                    if (bh0Var != null) {
                        U0.cancelRunnable(bh0Var);
                        cg.h.c();
                        this.P = null;
                    }
                    this.f32752y0 = false;
                    this.E0 = false;
                }
            }
        }
    }

    public final void G() {
        if (!this.f32719a0 && !this.f32734l0 && this.X) {
            if (this.f32721b0 <= 2) {
                this.f32721b0 = 0;
            }
            this.O = false;
            this.Y = false;
            if (!I()) {
                this.Z = true;
            }
        }
        x();
    }

    public final boolean H(boolean z10) {
        if (!z10 && ((this.L < 2 || this.N == 0) && this.M < 0)) {
            return false;
        }
        this.N = 0;
        this.L = 2;
        start();
        return true;
    }

    public final boolean I() {
        ExecutorService executorService;
        if (this.Q == null && this.S == null && k() && !w() && !this.W && !this.m0) {
            if (this.f32734l0 || (this.X && !this.Y)) {
                if (!this.f32752y0 || this.F0) {
                    if (!this.f32742s.isEmpty()) {
                        this.f32747w.putAll(this.f32742s);
                        this.f32742s.clear();
                    }
                    int[] iArr = this.f32735n;
                    if (iArr != null) {
                        this.f32740r = iArr;
                        this.f32735n = null;
                    }
                    Runnable runnable = this.G0;
                    this.Q = runnable;
                    if (this.f32723c0) {
                        executorService = T0;
                    } else {
                        executorService = S0;
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
        this.X = true;
        I();
    }

    public final void K(int i3) {
        if (this.L == 2 && i3 == 3 && this.f32721b0 != 0) {
            return;
        }
        this.L = i3;
    }

    public final void L() {
        N(85, false, false);
    }

    public final void M(int i3) {
        N(i3, true, false);
    }

    public final void N(int i3, boolean z10, boolean z11) {
        if (i3 >= 0 && i3 <= this.f32725e[0]) {
            if (this.f32721b0 != i3 || z11) {
                this.f32721b0 = i3;
                this.O = false;
                this.Y = false;
                if (this.f32738p0) {
                    this.f32739q0 = true;
                    if (this.Q != null) {
                        this.f32741r0 = true;
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
                if (z11 && !this.f32734l0) {
                    this.f32734l0 = true;
                    l();
                }
                if (I()) {
                    if (!z10) {
                        try {
                            this.V.await();
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
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

    public final void O(boolean z10) {
        WeakReference weakReference;
        Runnable runnable;
        WeakReference weakReference2;
        this.T = this.R;
        this.R = this.S;
        this.S = null;
        this.O0 = false;
        if (this.K == 2 && (weakReference2 = this.I) != null && this.f32721b0 - 1 >= this.J) {
            Runnable runnable2 = (Runnable) weakReference2.get();
            if (runnable2 != null) {
                runnable2.run();
            }
            this.I = null;
        }
        if (this.O || (this.M == 0 && this.L == 1)) {
            stop();
        }
        this.Q = null;
        if (this.f32741r0) {
            this.f32741r0 = false;
        } else if (this.f32739q0) {
            this.f32739q0 = false;
        }
        this.Y = true;
        this.U = false;
        if (z10 && this.Z) {
            this.Y = false;
            this.Z = false;
        }
        if (this.K == 0 && (weakReference = this.I) != null && this.f32721b0 >= this.J && (runnable = (Runnable) weakReference.get()) != null) {
            runnable.run();
        }
        I();
    }

    public final boolean P(int i3) {
        if (this.f32727f == i3 || i3 > this.f32725e[0]) {
            return false;
        }
        this.f32727f = i3;
        return true;
    }

    public final void Q(int i3, String str) {
        this.f32742s.put(str, Integer.valueOf(i3));
        G();
    }

    public final void R(View view) {
        this.I0 = new WeakReference(view);
    }

    public final void S(int i3, Runnable runnable) {
        if (runnable != null) {
            this.I = new WeakReference(runnable);
            this.J = i3;
        } else if (this.I != null) {
            this.I = null;
        }
    }

    public final void T(boolean r3, float r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ch0.T(boolean, float):void");
    }

    public final void U(long j10) {
        int i3;
        int[] iArr = this.f32725e;
        if (iArr[0] != 0 && (i3 = iArr[1]) != 0) {
            N(Math.round(((float) Math.max(0L, j10)) / (1000.0f / i3)) % iArr[0], true, true);
        }
    }

    public final void V(long j10) {
        boolean z10;
        Integer num;
        int i3;
        this.L0 = 0;
        if (this.M0) {
            this.M0 = false;
            l();
        }
        if (!this.O0 && (this.f32734l0 || !this.X)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (this.f32734l0) {
            if (this.R == null && this.S == null) {
                I();
            } else if (this.S != null) {
                if (this.R == null || (z10 && !this.f32718a)) {
                    HashMap hashMap = this.f32751y;
                    if (hashMap != null && this.F && (num = (Integer) hashMap.get(Integer.valueOf(this.f32721b0 - 1))) != null) {
                        try {
                            Activity activity = LaunchActivity.K1;
                            if (activity == null) {
                                activity = BubbleActivity.f28907b0;
                            }
                            View decorView = activity.getWindow().getDecorView();
                            if (num.intValue() == 1) {
                                i3 = 0;
                            } else {
                                i3 = 3;
                            }
                            decorView.performHapticFeedback(i3, 2);
                        } catch (Exception unused) {
                        }
                    }
                    O(false);
                }
            }
        } else if ((this.Z || (this.X && z10)) && this.S != null) {
            O(true);
        }
    }

    @Override
    public final int a(Bitmap bitmap) {
        int i3;
        RLottieNative rLottieNative = this.K0;
        if (rLottieNative == null) {
            return -1;
        }
        int i10 = this.D0;
        if (i10 >= rLottieNative.f31545a[0]) {
            return 0;
        }
        if (this.f32723c0) {
            i3 = 2;
        } else {
            i3 = 1;
        }
        if (rLottieNative.c(i10, bitmap, true) == -5) {
            return -1;
        }
        this.D0 += i3;
        return 1;
    }

    @Override
    public final void b() {
        String str;
        File file;
        org.telegram.ui.ActionBar.h4 h4Var = this.f32746v0;
        File file2 = (File) h4Var.d;
        int[] iArr = null;
        if (file2 != null) {
            str = file2.toString();
        } else {
            str = null;
        }
        String str2 = (String) h4Var.f27576e;
        if (this.f32724d0) {
            iArr = this.f32725e;
        }
        RLottieNative a10 = RLottieNative.a(str, str2, iArr, (int[]) h4Var.f27575c, h4Var.f27573a, this.f32749x);
        this.K0 = a10;
        this.D0 = 0;
        if (a10 == null && (file = this.f32743s0) != null) {
            file.delete();
        }
    }

    @Override
    public final void c() {
        RLottieNative rLottieNative = this.K0;
        if (rLottieNative != null) {
            rLottieNative.d();
            this.K0 = null;
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
        return this.f32722c;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f32720b;
    }

    @Override
    public final int getMinimumHeight() {
        return this.f32722c;
    }

    @Override
    public final int getMinimumWidth() {
        return this.f32720b;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public void i() {
        int i3;
        if (this.f32723c0) {
            i3 = 2;
        } else {
            i3 = 1;
        }
        int i10 = this.f32727f;
        if (i10 >= 0 && this.h) {
            int i11 = this.f32721b0;
            if (i11 > i10) {
                int i12 = i11 - i3;
                if (i12 >= i10) {
                    this.f32721b0 = i12;
                    this.O = false;
                    return;
                }
                this.O = true;
                Runnable runnable = this.f32745u0;
                if (runnable != null) {
                    runnable.run();
                    this.f32745u0 = null;
                    return;
                }
                return;
            }
            int i13 = i11 + i3;
            if (i13 < i10) {
                this.f32721b0 = i13;
                this.O = false;
                return;
            }
            this.O = true;
            Runnable runnable2 = this.f32745u0;
            if (runnable2 != null) {
                runnable2.run();
                this.f32745u0 = null;
                return;
            }
            return;
        }
        int i14 = this.f32721b0 + i3;
        if (i10 < 0) {
            i10 = this.f32725e[0];
        }
        if (i14 < i10) {
            if (this.L == 3) {
                this.O = true;
                this.N++;
                return;
            }
            this.f32721b0 = i14;
            this.O = false;
            return;
        }
        int i15 = this.L;
        if (i15 == 1) {
            this.f32721b0 = 0;
            this.O = false;
            if (this.E) {
                this.f32751y = null;
                this.E = false;
            }
            int i16 = this.M;
            if (i16 > 0) {
                this.M = i16 - 1;
            }
        } else if (i15 == 2) {
            this.f32721b0 = 0;
            this.O = true;
            this.N++;
            if (this.E) {
                this.f32751y = null;
                this.E = false;
            }
        } else {
            this.O = true;
            Runnable runnable3 = this.f32745u0;
            if (runnable3 != null) {
                runnable3.run();
                this.f32745u0 = null;
            }
        }
    }

    @Override
    public final boolean isRunning() {
        return this.f32734l0;
    }

    public int j() {
        if (this.m0) {
            return 3;
        }
        if (k()) {
            if (this.f32736n0 == null && this.d) {
                String y22 = org.telegram.messenger.g0.y2(null, this.f32746v0.f27574b);
                if (TextUtils.isEmpty(y22)) {
                    return 2;
                }
                this.f32736n0 = RLottieNative.b(y22, this.f32725e, (int[]) this.f32746v0.f27575c, this.f32749x);
                this.d = false;
                return 1;
            }
            return 1;
        }
        return 2;
    }

    public final boolean k() {
        if (this.f32744t0) {
            if (this.C0 == null && !this.f32737o0) {
                return false;
            }
            return true;
        } else if (this.f32736n0 == null && !this.d) {
            return false;
        } else {
            return true;
        }
    }

    public final void l() {
        bh0 bh0Var = new bh0(this, 6);
        Typeface typeface = org.telegram.messenger.g0.f22580a;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            org.telegram.messenger.g0.h3(bh0Var);
        } else {
            bh0Var.run();
        }
    }

    public final void m() {
        float f10;
        if (this.f32734l0 && !this.M0) {
            if (!this.P0) {
                float f11 = this.f32725e[1];
                if (this.f32723c0) {
                    f10 = 2.0f;
                } else {
                    f10 = 1.0f;
                }
                int round = Math.round((f11 / f10) * this.G);
                if (round > 0) {
                    if (this.f32725e[0] != 1 || this.K != 0) {
                        this.P0 = true;
                        this.L0 = 0;
                        cg.j.d().b(this.N0, round);
                        x();
                    }
                }
            }
        } else if (this.P0) {
            this.P0 = false;
            this.L0 = 0;
            cg.j.d().g(this.N0);
        }
    }

    public final void n() {
        bh0 bh0Var = this.P;
        if (bh0Var != null) {
            U0.cancelRunnable(bh0Var);
            cg.h.c();
            this.P = null;
        }
        if (!v() && this.S != null && this.Q != null) {
            this.Q = null;
            this.S = null;
        }
    }

    public final void o() {
        if (!this.f32719a0) {
            return;
        }
        this.f32719a0 = false;
        if (!this.f32734l0 && this.X) {
            if (this.f32721b0 <= 2) {
                this.f32721b0 = 0;
            }
            this.O = false;
            this.Y = false;
            if (!I()) {
                this.Z = true;
            }
        }
        x();
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f32729g0 = true;
    }

    public void p() {
        if (this.W) {
            n();
            if (this.Q == null && this.P == null && this.f32736n0 != null) {
                D(true);
            }
        }
        if ((this.f32736n0 == null || this.f32737o0) && this.C0 == null) {
            E();
            return;
        }
        this.U = true;
        if (!v()) {
            stop();
        }
        if (this.f32734l0) {
            I();
        }
    }

    public final void q(Canvas canvas, Paint paint, boolean z10, long j10, int i3) {
        RectF rectF;
        float width;
        boolean z11;
        float f10;
        if (k() && !this.W) {
            if (!z10) {
                V(j10);
            }
            if (z10) {
                rectF = this.f32732j0[i3];
            } else {
                rectF = this.f32731i0;
            }
            if (paint == null) {
                if (z10) {
                    paint = this.f32733k0[i3];
                } else {
                    paint = getPaint();
                }
            }
            if (paint.getAlpha() != 0 && !this.f32739q0 && this.R != null) {
                boolean z12 = true;
                if (!z10) {
                    rectF.set(getBounds());
                    if (this.f32729g0) {
                        this.f32726e0 = rectF.width() / this.f32720b;
                        this.f32728f0 = rectF.height() / this.f32722c;
                        this.f32729g0 = false;
                        if (Math.abs(rectF.width() - this.f32720b) < org.telegram.messenger.g0.L(1.0f) && Math.abs(rectF.height() - this.f32722c) < org.telegram.messenger.g0.L(1.0f)) {
                            z12 = false;
                        }
                        this.f32730h0 = z12;
                    }
                    width = this.f32726e0;
                    f10 = this.f32728f0;
                    z11 = this.f32730h0;
                } else {
                    width = rectF.width() / this.f32720b;
                    float height = rectF.height() / this.f32722c;
                    if (Math.abs(rectF.width() - this.f32720b) < org.telegram.messenger.g0.L(1.0f) && Math.abs(rectF.height() - this.f32722c) < org.telegram.messenger.g0.L(1.0f)) {
                        z12 = false;
                    }
                    z11 = z12;
                    f10 = height;
                }
                if (!z11) {
                    canvas.drawBitmap(this.R, rectF.left, rectF.top, paint);
                    return;
                }
                canvas.save();
                canvas.translate(rectF.left, rectF.top);
                canvas.scale(width, f10);
                canvas.drawBitmap(this.R, 0.0f, 0.0f, paint);
                canvas.restore();
            }
        }
    }

    public final long r() {
        int[] iArr = this.f32725e;
        return (iArr[0] / iArr[1]) * 1000.0f;
    }

    public final int s() {
        return this.f32725e[0];
    }

    @Override
    public final void start() {
        if (!this.f32734l0) {
            if ((this.L < 2 || this.N == 0) && this.f32727f != this.f32721b0) {
                this.f32734l0 = true;
                this.M0 = false;
                if (this.f32738p0) {
                    this.f32739q0 = true;
                    if (this.Q != null) {
                        this.f32741r0 = true;
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
        this.f32734l0 = false;
        l();
    }

    public final float t() {
        return this.f32721b0 / this.f32725e[0];
    }

    public final boolean u() {
        if (!this.m0) {
            if ((this.R != null || this.S != null) && !this.f32739q0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean v() {
        if (this.J0.isEmpty()) {
            WeakReference weakReference = this.I0;
            if ((weakReference == null || weakReference.get() == null) && getCallback() == null) {
                return false;
            }
            return true;
        }
        return true;
    }

    public boolean w() {
        if (this.R == null || this.f32725e[0] != 1) {
            return false;
        }
        return true;
    }

    public final void x() {
        View view;
        if (!this.m0) {
            Iterator it = this.J0.iterator();
            while (it.hasNext()) {
                ((ImageReceiver) it.next()).invalidate();
            }
            WeakReference weakReference = this.I0;
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
        if (this.P != null) {
            return true;
        }
        return false;
    }

    public boolean z() {
        return true;
    }

    public ch0(int i3, int i10) {
        this.f32725e = new int[3];
        this.f32727f = -1;
        this.f32742s = new HashMap();
        this.f32747w = new HashMap();
        this.f32749x = new HashMap();
        this.E = false;
        this.F = true;
        this.G = 1.0f;
        this.L = 1;
        this.M = -1;
        this.f32726e0 = 1.0f;
        this.f32728f0 = 1.0f;
        this.f32731i0 = new RectF();
        this.f32732j0 = new RectF[2];
        this.f32733k0 = new Paint[2];
        this.f32748w0 = new bh0(this, 1);
        this.f32750x0 = new bh0(this, 2);
        this.f32753z0 = new bh0(this, 3);
        this.A0 = new bh0(this, 4);
        this.G0 = new bh0(this, 5);
        this.J0 = new ue.b(true, true);
        this.N0 = new s5(this, 2);
        this.f32720b = i3;
        this.f32722c = i10;
        this.H = false;
    }

    public ch0(int i3, int i10, int i11) {
        this(i3, i10, i11, true, null);
    }

    public ch0(int i3, int i10, int i11, boolean z10, int[] iArr) {
        long j10;
        this.f32725e = new int[3];
        this.f32727f = -1;
        this.f32742s = new HashMap();
        this.f32747w = new HashMap();
        this.f32749x = new HashMap();
        this.E = false;
        this.F = true;
        this.G = 1.0f;
        this.L = 1;
        this.M = -1;
        this.f32726e0 = 1.0f;
        this.f32728f0 = 1.0f;
        this.f32731i0 = new RectF();
        this.f32732j0 = new RectF[2];
        this.f32733k0 = new Paint[2];
        this.f32748w0 = new bh0(this, 1);
        this.f32750x0 = new bh0(this, 2);
        this.f32753z0 = new bh0(this, 3);
        this.A0 = new bh0(this, 4);
        this.G0 = new bh0(this, 5);
        this.J0 = new ue.b(true, true);
        this.N0 = new s5(this, 2);
        this.f32720b = i10;
        this.f32722c = i11;
        this.L = 0;
        getPaint().setFlags(2);
        ?? obj = new Object();
        this.f32746v0 = obj;
        obj.f27575c = iArr == null ? null : (int[]) iArr.clone();
        long[] jArr = org.telegram.messenger.mt.f24263a;
        int length = jArr.length - 1;
        int i12 = 0;
        while (true) {
            if (i12 > length) {
                j10 = -1;
                break;
            }
            int i13 = (i12 + length) >>> 1;
            j10 = jArr[i13];
            int i14 = (int) (j10 >>> 32);
            if (i14 >= i3) {
                if (i14 <= i3) {
                    break;
                }
                length = i13 - 1;
            } else {
                i12 = i13 + 1;
            }
        }
        if (j10 != -1) {
            this.d = true;
            this.f32746v0.f27574b = i3;
            this.H = (8388608 & j10) != 0;
            int[] iArr2 = this.f32725e;
            iArr2[0] = (int) (8388607 & j10);
            iArr2[1] = (int) ((j10 >>> 24) & 255);
        } else {
            this.H = false;
            String y22 = org.telegram.messenger.g0.y2(null, i3);
            if (TextUtils.isEmpty(y22)) {
                this.f32746v0 = null;
                return;
            }
            org.telegram.ui.ActionBar.h4 h4Var = this.f32746v0;
            h4Var.f27576e = y22;
            this.f32736n0 = RLottieNative.b(y22, this.f32725e, (int[]) h4Var.f27575c, this.f32749x);
        }
        if (this.H) {
            setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        if (z10) {
            J(true);
        }
    }
}
