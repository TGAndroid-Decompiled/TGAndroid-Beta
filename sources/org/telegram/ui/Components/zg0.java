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
public class zg0 extends BitmapDrawable implements Animatable, bg.g {
    public static final AtomicInteger P0 = new AtomicInteger();
    public static final AtomicInteger Q0 = new AtomicInteger();
    public static final ExecutorService R0 = Executors.newFixedThreadPool(4, new h2.l0(2));
    public static final ExecutorService S0 = Executors.newFixedThreadPool(2, new h2.l0(3));
    public static org.telegram.messenger.q5 T0;
    public Runnable A0;
    public bg.i B0;
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
    public final xe.b I0;
    public int J;
    public RLottieNative J0;
    public int K;
    public int K0;
    public int L;
    public volatile boolean L0;
    public int M;
    public final u5 M0;
    public volatile boolean N;
    public boolean N0;
    public yg0 O;
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
    public boolean f40949a;
    public int f40950a0;
    public final int f40951b;
    public final boolean f40952b0;
    public final int f40953c;
    public final boolean f40954c0;
    public boolean d;
    public float f40955d0;
    public final int[] f40956e;
    public float f40957e0;
    public int f40958f;
    public boolean f40959f0;
    public boolean f40960g0;
    public boolean h;
    public final RectF f40961h0;
    public final RectF[] f40962i0;
    public final Paint[] f40963j0;
    public volatile boolean f40964k0;
    public volatile boolean f40965l0;
    public volatile RLottieNative m0;
    public int[] f40966n;
    public final boolean f40967n0;
    public boolean f40968o0;
    public boolean f40969p0;
    public boolean f40970q0;
    public int[] f40971r;
    public final File f40972r0;
    public final HashMap f40973s;
    public final boolean f40974s0;
    public Runnable f40975t0;
    public final ab.v f40976u0;
    public final Runnable f40977v0;
    public final HashMap f40978w;
    public final Runnable f40979w0;
    public final HashMap f40980x;
    public boolean f40981x0;
    public HashMap f40982y;
    public final Runnable f40983y0;
    public final Runnable f40984z0;

    public zg0(java.io.File r21, java.lang.String r22, int r23, int r24, bg.f r25, boolean r26, int r27, boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zg0.<init>(java.io.File, java.lang.String, int, int, bg.f, boolean, int, boolean):void");
    }

    public static void d(zg0 zg0Var) {
        if (zg0Var.O != null) {
            bg.i.c();
            zg0Var.O = null;
        }
        zg0Var.f40981x0 = false;
        zg0Var.p();
        Runnable runnable = zg0Var.A0;
        if (runnable != null) {
            runnable.run();
            zg0Var.A0 = null;
        }
    }

    public static void e(zg0 zg0Var) {
        if (!zg0Var.f40965l0 && !zg0Var.V && zg0Var.k() && zg0Var.O == null) {
            zg0Var.f40981x0 = true;
            if (T0 == null) {
                T0 = new org.telegram.messenger.q5("cache generator queue", true);
            }
            bg.i.A++;
            org.telegram.messenger.q5 q5Var = T0;
            yg0 yg0Var = new yg0(zg0Var, 0);
            zg0Var.O = yg0Var;
            q5Var.postRunnable(yg0Var);
        }
    }

    public static void f(zg0 zg0Var) {
        int i7;
        Bitmap.Config config;
        Bitmap createBitmap;
        boolean z9;
        try {
            i7 = zg0Var.j();
            if (i7 == 1) {
                if (zg0Var.S != null) {
                    createBitmap = zg0Var.S;
                    z9 = true;
                } else {
                    if (zg0Var.G) {
                        config = Bitmap.Config.ALPHA_8;
                    } else {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    createBitmap = Bitmap.createBitmap(zg0Var.f40951b, zg0Var.f40953c, config);
                    zg0Var.S = createBitmap;
                    z9 = false;
                }
                int B = zg0Var.B(createBitmap, z9);
                if (B == 1) {
                    zg0Var.R = createBitmap;
                    zg0Var.i();
                }
                i7 = B;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            i7 = 2;
        }
        if (i7 == 1) {
            zg0Var.G0 = 0;
            org.telegram.messenger.g0.h3(zg0Var.f40979w0);
        } else if (i7 == 2) {
            org.telegram.messenger.g0.i3(zg0Var.f40977v0, zg0Var.G0);
            zg0Var.G0 = Math.min((Math.max(zg0Var.G0, 2) * 3) / 2, 2000);
        } else if (i7 == 3) {
            org.telegram.messenger.g0.h3(zg0Var.f40977v0);
        }
        CountDownLatch countDownLatch = zg0Var.U;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    public static void g(zg0 zg0Var) {
        int i7 = zg0Var.K0 + 1;
        zg0Var.K0 = i7;
        if (i7 > 10) {
            zg0Var.L0 = true;
        }
        zg0Var.m();
        if (zg0Var.O0) {
            zg0Var.N0 = true;
            zg0Var.x();
        }
    }

    public static void h(zg0 zg0Var) {
        zg0Var.X = true;
        if ((!zg0Var.f40964k0 && zg0Var.W) || (zg0Var.Q == null && zg0Var.R != null)) {
            zg0Var.x();
        }
        zg0Var.p();
    }

    public final boolean A() {
        if (this.f40950a0 != this.f40956e[0] - 1) {
            return false;
        }
        return true;
    }

    public int B(Bitmap bitmap, boolean z9) {
        int i7;
        int c10;
        bg.i iVar;
        RLottieNative b10;
        RLottieNative rLottieNative = this.m0;
        if (rLottieNative != null) {
            try {
                if (!this.f40978w.isEmpty() || this.f40971r != null) {
                    this.f40980x.putAll(this.f40978w);
                    int[] iArr = this.f40971r;
                    if (iArr != null) {
                        this.f40976u0.f1004c = (int[]) iArr.clone();
                    }
                    ab.v vVar = this.f40976u0;
                    File file = (File) vVar.f1005e;
                    if (file != null) {
                        String absolutePath = file.getAbsolutePath();
                        ab.v vVar2 = this.f40976u0;
                        b10 = RLottieNative.a(absolutePath, (String) vVar2.d, this.f40956e, (int[]) vVar2.f1004c, vVar2.f1002a, this.f40980x);
                    } else {
                        int i10 = vVar.f1003b;
                        if (i10 != 0 && ((String) vVar.d) == null) {
                            String y22 = org.telegram.messenger.g0.y2(null, i10);
                            if (!TextUtils.isEmpty(y22)) {
                                ab.v vVar3 = this.f40976u0;
                                vVar3.d = y22;
                                b10 = RLottieNative.b(y22, this.f40956e, (int[]) vVar3.f1004c, this.f40980x);
                            }
                        } else {
                            b10 = RLottieNative.b((String) vVar.d, this.f40956e, (int[]) vVar.f1004c, this.f40980x);
                        }
                    }
                    if (b10 != null) {
                        this.m0 = b10;
                        rLottieNative.d();
                        this.f40978w.clear();
                        this.f40971r = null;
                    }
                }
            } catch (Exception unused) {
            }
        }
        RLottieNative rLottieNative2 = this.m0;
        if (this.f40952b0) {
            i7 = 2;
        } else {
            i7 = 1;
        }
        if (this.f40974s0 && (iVar = this.B0) != null) {
            c10 = 0;
            try {
                c10 = iVar.f(bitmap, this.f40950a0 / i7);
                if (!this.B0.g() && this.E0 && this.m0 != null) {
                    this.m0.d();
                    this.m0 = null;
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        } else {
            c10 = rLottieNative2.c(this.f40950a0, bitmap, z9);
        }
        bg.i iVar2 = this.B0;
        if (iVar2 != null && iVar2.g()) {
            if (!this.D0) {
                this.D0 = true;
                org.telegram.messenger.g0.h3(this.f40983y0);
            }
            c10 = -1;
            if (this.E0) {
                if (this.m0 == null) {
                    String file2 = ((File) this.f40976u0.f1005e).toString();
                    ab.v vVar4 = this.f40976u0;
                    this.m0 = RLottieNative.a(file2, (String) vVar4.d, null, (int[]) vVar4.f1004c, vVar4.f1002a, this.f40980x);
                }
                if (this.m0 != null) {
                    c10 = this.m0.c(this.f40950a0, bitmap, z9);
                }
            }
        }
        if (c10 < 0) {
            return 2;
        }
        return 1;
    }

    public void C(boolean z9) {
        this.f40964k0 = false;
        this.f40965l0 = true;
        l();
        n();
        if (this.P == null && this.O == null && !this.f40981x0) {
            D(z9);
            bg.i iVar = this.B0;
            if (iVar != null) {
                RandomAccessFile randomAccessFile = iVar.f3316s;
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (IOException e10) {
                        e10.printStackTrace();
                    }
                    iVar.f3316s = null;
                }
                iVar.f3315r = true;
                this.B0 = null;
            }
            E();
            return;
        }
        this.V = true;
    }

    public void D(boolean z9) {
        RLottieNative rLottieNative = this.m0;
        this.m0 = null;
        if (rLottieNative != null) {
            ob0 ob0Var = new ob0(rLottieNative, 10);
            if (z9) {
                org.telegram.messenger.r5.a(ob0Var);
            } else {
                Utilities.f21333e.c(ob0Var);
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
        org.telegram.messenger.g0.A2(arrayList);
        if (this.f40975t0 != null) {
            this.f40975t0 = null;
        }
    }

    public final void F(ImageReceiver imageReceiver) {
        View view;
        xe.b bVar = this.I0;
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
                    yg0 yg0Var = this.O;
                    if (yg0Var != null) {
                        T0.cancelRunnable(yg0Var);
                        bg.i.c();
                        this.O = null;
                    }
                    this.f40981x0 = false;
                    this.D0 = false;
                }
            }
        }
    }

    public final void G() {
        if (!this.Z && !this.f40964k0 && this.W) {
            if (this.f40950a0 <= 2) {
                this.f40950a0 = 0;
            }
            this.N = false;
            this.X = false;
            if (!I()) {
                this.Y = true;
            }
        }
        x();
    }

    public final boolean H(boolean z9) {
        if (!z9 && ((this.K < 2 || this.M == 0) && this.L < 0)) {
            return false;
        }
        this.M = 0;
        this.K = 2;
        start();
        return true;
    }

    public final boolean I() {
        ExecutorService executorService;
        if (this.P == null && this.R == null && k() && !w() && !this.V && !this.f40965l0) {
            if (this.f40964k0 || (this.W && !this.X)) {
                if (!this.f40981x0 || this.E0) {
                    if (!this.f40973s.isEmpty()) {
                        this.f40978w.putAll(this.f40973s);
                        this.f40973s.clear();
                    }
                    int[] iArr = this.f40966n;
                    if (iArr != null) {
                        this.f40971r = iArr;
                        this.f40966n = null;
                    }
                    Runnable runnable = this.F0;
                    this.P = runnable;
                    if (this.f40952b0) {
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

    public final void J(boolean z9) {
        this.W = true;
        I();
    }

    public final void K(int i7) {
        if (this.K == 2 && i7 == 3 && this.f40950a0 != 0) {
            return;
        }
        this.K = i7;
    }

    public final void L() {
        N(85, false, false);
    }

    public final void M(int i7) {
        N(i7, true, false);
    }

    public final void N(int i7, boolean z9, boolean z10) {
        if (i7 >= 0 && i7 <= this.f40956e[0]) {
            if (this.f40950a0 != i7 || z10) {
                this.f40950a0 = i7;
                this.N = false;
                this.X = false;
                if (this.f40968o0) {
                    this.f40969p0 = true;
                    if (this.P != null) {
                        this.f40970q0 = true;
                    }
                }
                if ((!z9 || z10) && this.T && this.R != null) {
                    this.S = this.R;
                    this.R = null;
                    this.P = null;
                    this.T = false;
                }
                if (!z9 && this.P == null) {
                    this.U = new CountDownLatch(1);
                }
                if (z10 && !this.f40964k0) {
                    this.f40964k0 = true;
                    l();
                }
                if (I()) {
                    if (!z9) {
                        try {
                            this.U.await();
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
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

    public final void O(boolean z9) {
        WeakReference weakReference;
        Runnable runnable;
        WeakReference weakReference2;
        this.S = this.Q;
        this.Q = this.R;
        this.R = null;
        this.N0 = false;
        if (this.J == 2 && (weakReference2 = this.H) != null && this.f40950a0 - 1 >= this.I) {
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
        if (this.f40970q0) {
            this.f40970q0 = false;
        } else if (this.f40969p0) {
            this.f40969p0 = false;
        }
        this.X = true;
        this.T = false;
        if (z9 && this.Y) {
            this.X = false;
            this.Y = false;
        }
        if (this.J == 0 && (weakReference = this.H) != null && this.f40950a0 >= this.I && (runnable = (Runnable) weakReference.get()) != null) {
            runnable.run();
        }
        I();
    }

    public final boolean P(int i7) {
        if (this.f40958f == i7 || i7 > this.f40956e[0]) {
            return false;
        }
        this.f40958f = i7;
        return true;
    }

    public final void Q(int i7, String str) {
        this.f40973s.put(str, Integer.valueOf(i7));
        G();
    }

    public final void R(View view) {
        this.H0 = new WeakReference(view);
    }

    public final void S(int i7, Runnable runnable) {
        if (runnable != null) {
            this.H = new WeakReference(runnable);
            this.I = i7;
        } else if (this.H != null) {
            this.H = null;
        }
    }

    public final void T(boolean r3, float r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zg0.T(boolean, float):void");
    }

    public final void U(long j3) {
        int i7;
        int[] iArr = this.f40956e;
        if (iArr[0] != 0 && (i7 = iArr[1]) != 0) {
            N(Math.round(((float) Math.max(0L, j3)) / (1000.0f / i7)) % iArr[0], true, true);
        }
    }

    public final void V(long j3) {
        boolean z9;
        Integer num;
        int i7;
        this.K0 = 0;
        if (this.L0) {
            this.L0 = false;
            l();
        }
        if (!this.N0 && (this.f40964k0 || !this.W)) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (this.f40964k0) {
            if (this.Q == null && this.R == null) {
                I();
            } else if (this.R != null) {
                if (this.Q == null || (z9 && !this.f40949a)) {
                    HashMap hashMap = this.f40982y;
                    if (hashMap != null && this.E && (num = (Integer) hashMap.get(Integer.valueOf(this.f40950a0 - 1))) != null) {
                        try {
                            Activity activity = LaunchActivity.G1;
                            if (activity == null) {
                                activity = BubbleActivity.f28846a0;
                            }
                            View decorView = activity.getWindow().getDecorView();
                            if (num.intValue() == 1) {
                                i7 = 0;
                            } else {
                                i7 = 3;
                            }
                            decorView.performHapticFeedback(i7, 2);
                        } catch (Exception unused) {
                        }
                    }
                    O(false);
                }
            }
        } else if ((this.Y || (this.W && z9)) && this.R != null) {
            O(true);
        }
    }

    @Override
    public final int a(Bitmap bitmap) {
        int i7;
        RLottieNative rLottieNative = this.J0;
        if (rLottieNative == null) {
            return -1;
        }
        int i10 = this.C0;
        if (i10 >= rLottieNative.f31468a[0]) {
            return 0;
        }
        if (this.f40952b0) {
            i7 = 2;
        } else {
            i7 = 1;
        }
        if (rLottieNative.c(i10, bitmap, true) == -5) {
            return -1;
        }
        this.C0 += i7;
        return 1;
    }

    @Override
    public final void b() {
        String str;
        File file;
        ab.v vVar = this.f40976u0;
        File file2 = (File) vVar.f1005e;
        int[] iArr = null;
        if (file2 != null) {
            str = file2.toString();
        } else {
            str = null;
        }
        String str2 = (String) vVar.d;
        if (this.f40954c0) {
            iArr = this.f40956e;
        }
        RLottieNative a10 = RLottieNative.a(str, str2, iArr, (int[]) vVar.f1004c, vVar.f1002a, this.f40980x);
        this.J0 = a10;
        this.C0 = 0;
        if (a10 == null && (file = this.f40972r0) != null) {
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
        return this.f40953c;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f40951b;
    }

    @Override
    public final int getMinimumHeight() {
        return this.f40953c;
    }

    @Override
    public final int getMinimumWidth() {
        return this.f40951b;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public void i() {
        int i7;
        if (this.f40952b0) {
            i7 = 2;
        } else {
            i7 = 1;
        }
        int i10 = this.f40958f;
        if (i10 >= 0 && this.h) {
            int i11 = this.f40950a0;
            if (i11 > i10) {
                int i12 = i11 - i7;
                if (i12 >= i10) {
                    this.f40950a0 = i12;
                    this.N = false;
                    return;
                }
                this.N = true;
                Runnable runnable = this.f40975t0;
                if (runnable != null) {
                    runnable.run();
                    this.f40975t0 = null;
                    return;
                }
                return;
            }
            int i13 = i11 + i7;
            if (i13 < i10) {
                this.f40950a0 = i13;
                this.N = false;
                return;
            }
            this.N = true;
            Runnable runnable2 = this.f40975t0;
            if (runnable2 != null) {
                runnable2.run();
                this.f40975t0 = null;
                return;
            }
            return;
        }
        int i14 = this.f40950a0 + i7;
        if (i10 < 0) {
            i10 = this.f40956e[0];
        }
        if (i14 < i10) {
            if (this.K == 3) {
                this.N = true;
                this.M++;
                return;
            }
            this.f40950a0 = i14;
            this.N = false;
            return;
        }
        int i15 = this.K;
        if (i15 == 1) {
            this.f40950a0 = 0;
            this.N = false;
            if (this.D) {
                this.f40982y = null;
                this.D = false;
            }
            int i16 = this.L;
            if (i16 > 0) {
                this.L = i16 - 1;
            }
        } else if (i15 == 2) {
            this.f40950a0 = 0;
            this.N = true;
            this.M++;
            if (this.D) {
                this.f40982y = null;
                this.D = false;
            }
        } else {
            this.N = true;
            Runnable runnable3 = this.f40975t0;
            if (runnable3 != null) {
                runnable3.run();
                this.f40975t0 = null;
            }
        }
    }

    @Override
    public final boolean isRunning() {
        return this.f40964k0;
    }

    public int j() {
        if (this.f40965l0) {
            return 3;
        }
        if (k()) {
            if (this.m0 == null && this.d) {
                String y22 = org.telegram.messenger.g0.y2(null, this.f40976u0.f1003b);
                if (TextUtils.isEmpty(y22)) {
                    return 2;
                }
                this.m0 = RLottieNative.b(y22, this.f40956e, (int[]) this.f40976u0.f1004c, this.f40980x);
                this.d = false;
                return 1;
            }
            return 1;
        }
        return 2;
    }

    public final boolean k() {
        if (this.f40974s0) {
            if (this.B0 == null && !this.f40967n0) {
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
        yg0 yg0Var = new yg0(this, 6);
        Typeface typeface = org.telegram.messenger.g0.f22509a;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            org.telegram.messenger.g0.h3(yg0Var);
        } else {
            yg0Var.run();
        }
    }

    public final void m() {
        float f10;
        if (this.f40964k0 && !this.L0) {
            if (!this.O0) {
                float f11 = this.f40956e[1];
                if (this.f40952b0) {
                    f10 = 2.0f;
                } else {
                    f10 = 1.0f;
                }
                int round = Math.round((f11 / f10) * this.F);
                if (round > 0) {
                    if (this.f40956e[0] != 1 || this.J != 0) {
                        this.O0 = true;
                        this.K0 = 0;
                        bg.k.d().b(this.M0, round);
                        x();
                    }
                }
            }
        } else if (this.O0) {
            this.O0 = false;
            this.K0 = 0;
            bg.k.d().g(this.M0);
        }
    }

    public final void n() {
        yg0 yg0Var = this.O;
        if (yg0Var != null) {
            T0.cancelRunnable(yg0Var);
            bg.i.c();
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
        if (!this.f40964k0 && this.W) {
            if (this.f40950a0 <= 2) {
                this.f40950a0 = 0;
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
        this.f40959f0 = true;
    }

    public void p() {
        if (this.V) {
            n();
            if (this.P == null && this.O == null && this.m0 != null) {
                D(true);
            }
        }
        if ((this.m0 == null || this.f40967n0) && this.B0 == null) {
            E();
            return;
        }
        this.T = true;
        if (!v()) {
            stop();
        }
        if (this.f40964k0) {
            I();
        }
    }

    public final void q(Canvas canvas, Paint paint, boolean z9, long j3, int i7) {
        RectF rectF;
        float width;
        boolean z10;
        float f10;
        if (k() && !this.V) {
            if (!z9) {
                V(j3);
            }
            if (z9) {
                rectF = this.f40962i0[i7];
            } else {
                rectF = this.f40961h0;
            }
            if (paint == null) {
                if (z9) {
                    paint = this.f40963j0[i7];
                } else {
                    paint = getPaint();
                }
            }
            if (paint.getAlpha() != 0 && !this.f40969p0 && this.Q != null) {
                boolean z11 = true;
                if (!z9) {
                    rectF.set(getBounds());
                    if (this.f40959f0) {
                        this.f40955d0 = rectF.width() / this.f40951b;
                        this.f40957e0 = rectF.height() / this.f40953c;
                        this.f40959f0 = false;
                        if (Math.abs(rectF.width() - this.f40951b) < org.telegram.messenger.g0.L(1.0f) && Math.abs(rectF.height() - this.f40953c) < org.telegram.messenger.g0.L(1.0f)) {
                            z11 = false;
                        }
                        this.f40960g0 = z11;
                    }
                    width = this.f40955d0;
                    f10 = this.f40957e0;
                    z10 = this.f40960g0;
                } else {
                    width = rectF.width() / this.f40951b;
                    float height = rectF.height() / this.f40953c;
                    if (Math.abs(rectF.width() - this.f40951b) < org.telegram.messenger.g0.L(1.0f) && Math.abs(rectF.height() - this.f40953c) < org.telegram.messenger.g0.L(1.0f)) {
                        z11 = false;
                    }
                    z10 = z11;
                    f10 = height;
                }
                if (!z10) {
                    canvas.drawBitmap(this.Q, rectF.left, rectF.top, paint);
                    return;
                }
                canvas.save();
                canvas.translate(rectF.left, rectF.top);
                canvas.scale(width, f10);
                canvas.drawBitmap(this.Q, 0.0f, 0.0f, paint);
                canvas.restore();
            }
        }
    }

    public final long r() {
        int[] iArr = this.f40956e;
        return (iArr[0] / iArr[1]) * 1000.0f;
    }

    public final int s() {
        return this.f40956e[0];
    }

    @Override
    public final void start() {
        if (!this.f40964k0) {
            if ((this.K < 2 || this.M == 0) && this.f40958f != this.f40950a0) {
                this.f40964k0 = true;
                this.L0 = false;
                if (this.f40968o0) {
                    this.f40969p0 = true;
                    if (this.P != null) {
                        this.f40970q0 = true;
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
        this.f40964k0 = false;
        l();
    }

    public final float t() {
        return this.f40950a0 / this.f40956e[0];
    }

    public final boolean u() {
        if (!this.f40965l0) {
            if ((this.Q != null || this.R != null) && !this.f40969p0) {
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
        if (this.Q == null || this.f40956e[0] != 1) {
            return false;
        }
        return true;
    }

    public final void x() {
        View view;
        if (!this.f40965l0) {
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

    public zg0(int i7, int i10) {
        this.f40956e = new int[3];
        this.f40958f = -1;
        this.f40973s = new HashMap();
        this.f40978w = new HashMap();
        this.f40980x = new HashMap();
        this.D = false;
        this.E = true;
        this.F = 1.0f;
        this.K = 1;
        this.L = -1;
        this.f40955d0 = 1.0f;
        this.f40957e0 = 1.0f;
        this.f40961h0 = new RectF();
        this.f40962i0 = new RectF[2];
        this.f40963j0 = new Paint[2];
        this.f40977v0 = new yg0(this, 1);
        this.f40979w0 = new yg0(this, 2);
        this.f40983y0 = new yg0(this, 3);
        this.f40984z0 = new yg0(this, 4);
        this.F0 = new yg0(this, 5);
        this.I0 = new xe.b(true, true);
        this.M0 = new u5(this, 2);
        this.f40951b = i7;
        this.f40953c = i10;
        this.G = false;
    }

    public zg0(int i7, int i10, int i11) {
        this(i7, i10, i11, true, null);
    }

    public zg0(int i7, int i10, int i11, boolean z9, int[] iArr) {
        long j3;
        this.f40956e = new int[3];
        this.f40958f = -1;
        this.f40973s = new HashMap();
        this.f40978w = new HashMap();
        this.f40980x = new HashMap();
        this.D = false;
        this.E = true;
        this.F = 1.0f;
        this.K = 1;
        this.L = -1;
        this.f40955d0 = 1.0f;
        this.f40957e0 = 1.0f;
        this.f40961h0 = new RectF();
        this.f40962i0 = new RectF[2];
        this.f40963j0 = new Paint[2];
        this.f40977v0 = new yg0(this, 1);
        this.f40979w0 = new yg0(this, 2);
        this.f40983y0 = new yg0(this, 3);
        this.f40984z0 = new yg0(this, 4);
        this.F0 = new yg0(this, 5);
        this.I0 = new xe.b(true, true);
        this.M0 = new u5(this, 2);
        this.f40951b = i10;
        this.f40953c = i11;
        this.K = 0;
        getPaint().setFlags(2);
        ?? obj = new Object();
        this.f40976u0 = obj;
        obj.f1004c = iArr == null ? null : (int[]) iArr.clone();
        long[] jArr = org.telegram.messenger.ut.f25885a;
        int length = jArr.length - 1;
        int i12 = 0;
        while (true) {
            if (i12 > length) {
                j3 = -1;
                break;
            }
            int i13 = (i12 + length) >>> 1;
            j3 = jArr[i13];
            int i14 = (int) (j3 >>> 32);
            if (i14 >= i7) {
                if (i14 <= i7) {
                    break;
                }
                length = i13 - 1;
            } else {
                i12 = i13 + 1;
            }
        }
        if (j3 != -1) {
            this.d = true;
            this.f40976u0.f1003b = i7;
            this.G = (8388608 & j3) != 0;
            int[] iArr2 = this.f40956e;
            iArr2[0] = (int) (8388607 & j3);
            iArr2[1] = (int) ((j3 >>> 24) & 255);
        } else {
            this.G = false;
            String y22 = org.telegram.messenger.g0.y2(null, i7);
            if (TextUtils.isEmpty(y22)) {
                this.f40976u0 = null;
                return;
            }
            ab.v vVar = this.f40976u0;
            vVar.d = y22;
            this.m0 = RLottieNative.b(y22, this.f40956e, (int[]) vVar.f1004c, this.f40980x);
        }
        if (this.G) {
            setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        if (z9) {
            J(true);
        }
    }
}
