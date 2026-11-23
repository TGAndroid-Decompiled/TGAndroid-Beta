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
public class oh0 extends BitmapDrawable implements Animatable, bg.g {
    public static final AtomicInteger Q0 = new AtomicInteger();
    public static final AtomicInteger R0 = new AtomicInteger();
    public static final ExecutorService S0 = Executors.newFixedThreadPool(4, new ai.z0(2));
    public static final ExecutorService T0 = Executors.newFixedThreadPool(2, new ai.z0(3));
    public static org.telegram.messenger.r5 U0;
    public final Runnable A0;
    public Runnable B0;
    public bg.i C0;
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
    public final xe.b J0;
    public int K;
    public RLottieNative K0;
    public int L;
    public int L0;
    public int M;
    public volatile boolean M0;
    public int N;
    public final b6 N0;
    public volatile boolean O;
    public boolean O0;
    public nh0 P;
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
    public boolean f38203a;
    public boolean f38204a0;
    public final int f38205b;
    public int f38206b0;
    public final int f38207c;
    public final boolean f38208c0;
    public boolean d;
    public final boolean f38209d0;
    public final int[] f38210e;
    public float f38211e0;
    public int f38212f;
    public float f38213f0;
    public boolean f38214g0;
    public boolean h;
    public boolean f38215h0;
    public final RectF f38216i0;
    public final RectF[] f38217j0;
    public final Paint[] f38218k0;
    public volatile boolean f38219l0;
    public volatile boolean m0;
    public int[] f38220n;
    public volatile RLottieNative f38221n0;
    public final boolean f38222o0;
    public boolean f38223p0;
    public boolean f38224q0;
    public int[] f38225r;
    public boolean f38226r0;
    public final HashMap f38227s;
    public final File f38228s0;
    public final boolean f38229t0;
    public Runnable f38230u0;
    public final ab.v f38231v0;
    public final HashMap f38232w;
    public final Runnable f38233w0;
    public final HashMap f38234x;
    public final Runnable f38235x0;
    public HashMap f38236y;
    public boolean f38237y0;
    public final Runnable f38238z0;

    public oh0(java.io.File r21, java.lang.String r22, int r23, int r24, bg.f r25, boolean r26, int r27, boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.oh0.<init>(java.io.File, java.lang.String, int, int, bg.f, boolean, int, boolean):void");
    }

    public static void d(oh0 oh0Var) {
        if (oh0Var.P != null) {
            bg.i.c();
            oh0Var.P = null;
        }
        oh0Var.f38237y0 = false;
        oh0Var.p();
        Runnable runnable = oh0Var.B0;
        if (runnable != null) {
            runnable.run();
            oh0Var.B0 = null;
        }
    }

    public static void e(oh0 oh0Var) {
        if (!oh0Var.m0 && !oh0Var.W && oh0Var.k() && oh0Var.P == null) {
            oh0Var.f38237y0 = true;
            if (U0 == null) {
                U0 = new org.telegram.messenger.r5("cache generator queue", true);
            }
            bg.i.A++;
            org.telegram.messenger.r5 r5Var = U0;
            nh0 nh0Var = new nh0(oh0Var, 0);
            oh0Var.P = nh0Var;
            r5Var.postRunnable(nh0Var);
        }
    }

    public static void f(oh0 oh0Var) {
        int i7;
        Bitmap.Config config;
        Bitmap createBitmap;
        boolean z10;
        try {
            i7 = oh0Var.j();
            if (i7 == 1) {
                if (oh0Var.T != null) {
                    createBitmap = oh0Var.T;
                    z10 = true;
                } else {
                    if (oh0Var.H) {
                        config = Bitmap.Config.ALPHA_8;
                    } else {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    createBitmap = Bitmap.createBitmap(oh0Var.f38205b, oh0Var.f38207c, config);
                    oh0Var.T = createBitmap;
                    z10 = false;
                }
                int B = oh0Var.B(createBitmap, z10);
                if (B == 1) {
                    oh0Var.S = createBitmap;
                    oh0Var.i();
                }
                i7 = B;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            i7 = 2;
        }
        if (i7 == 1) {
            oh0Var.H0 = 0;
            org.telegram.messenger.g0.g3(oh0Var.f38235x0);
        } else if (i7 == 2) {
            org.telegram.messenger.g0.h3(oh0Var.f38233w0, oh0Var.H0);
            oh0Var.H0 = Math.min((Math.max(oh0Var.H0, 2) * 3) / 2, 2000);
        } else if (i7 == 3) {
            org.telegram.messenger.g0.g3(oh0Var.f38233w0);
        }
        CountDownLatch countDownLatch = oh0Var.V;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    public static void g(oh0 oh0Var) {
        int i7 = oh0Var.L0 + 1;
        oh0Var.L0 = i7;
        if (i7 > 10) {
            oh0Var.M0 = true;
        }
        oh0Var.m();
        if (oh0Var.P0) {
            oh0Var.O0 = true;
            oh0Var.x();
        }
    }

    public static void h(oh0 oh0Var) {
        oh0Var.Y = true;
        if ((!oh0Var.f38219l0 && oh0Var.X) || (oh0Var.R == null && oh0Var.S != null)) {
            oh0Var.x();
        }
        oh0Var.p();
    }

    public final boolean A() {
        if (this.f38206b0 != this.f38210e[0] - 1) {
            return false;
        }
        return true;
    }

    public int B(Bitmap bitmap, boolean z10) {
        int i7;
        int c10;
        bg.i iVar;
        RLottieNative b10;
        RLottieNative rLottieNative = this.f38221n0;
        if (rLottieNative != null) {
            try {
                if (!this.f38232w.isEmpty() || this.f38225r != null) {
                    this.f38234x.putAll(this.f38232w);
                    int[] iArr = this.f38225r;
                    if (iArr != null) {
                        this.f38231v0.f1002c = (int[]) iArr.clone();
                    }
                    ab.v vVar = this.f38231v0;
                    File file = (File) vVar.f1003e;
                    if (file != null) {
                        String absolutePath = file.getAbsolutePath();
                        ab.v vVar2 = this.f38231v0;
                        b10 = RLottieNative.a(absolutePath, (String) vVar2.d, this.f38210e, (int[]) vVar2.f1002c, vVar2.f1000a, this.f38234x);
                    } else {
                        int i10 = vVar.f1001b;
                        if (i10 != 0 && ((String) vVar.d) == null) {
                            String y22 = org.telegram.messenger.g0.y2(null, i10);
                            if (!TextUtils.isEmpty(y22)) {
                                ab.v vVar3 = this.f38231v0;
                                vVar3.d = y22;
                                b10 = RLottieNative.b(y22, this.f38210e, (int[]) vVar3.f1002c, this.f38234x);
                            }
                        } else {
                            b10 = RLottieNative.b((String) vVar.d, this.f38210e, (int[]) vVar.f1002c, this.f38234x);
                        }
                    }
                    if (b10 != null) {
                        this.f38221n0 = b10;
                        rLottieNative.d();
                        this.f38232w.clear();
                        this.f38225r = null;
                    }
                }
            } catch (Exception unused) {
            }
        }
        RLottieNative rLottieNative2 = this.f38221n0;
        if (this.f38208c0) {
            i7 = 2;
        } else {
            i7 = 1;
        }
        if (this.f38229t0 && (iVar = this.C0) != null) {
            c10 = 0;
            try {
                c10 = iVar.f(this.f38206b0 / i7, bitmap);
                if (!this.C0.g() && this.F0 && this.f38221n0 != null) {
                    this.f38221n0.d();
                    this.f38221n0 = null;
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        } else {
            c10 = rLottieNative2.c(this.f38206b0, bitmap, z10);
        }
        bg.i iVar2 = this.C0;
        if (iVar2 != null && iVar2.g()) {
            if (!this.E0) {
                this.E0 = true;
                org.telegram.messenger.g0.g3(this.f38238z0);
            }
            c10 = -1;
            if (this.F0) {
                if (this.f38221n0 == null) {
                    String file2 = ((File) this.f38231v0.f1003e).toString();
                    ab.v vVar4 = this.f38231v0;
                    this.f38221n0 = RLottieNative.a(file2, (String) vVar4.d, null, (int[]) vVar4.f1002c, vVar4.f1000a, this.f38234x);
                }
                if (this.f38221n0 != null) {
                    c10 = this.f38221n0.c(this.f38206b0, bitmap, z10);
                }
            }
        }
        if (c10 < 0) {
            return 2;
        }
        return 1;
    }

    public void C(boolean z10) {
        this.f38219l0 = false;
        this.m0 = true;
        l();
        n();
        if (this.Q == null && this.P == null && !this.f38237y0) {
            D(z10);
            bg.i iVar = this.C0;
            if (iVar != null) {
                RandomAccessFile randomAccessFile = iVar.f3284s;
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (IOException e10) {
                        e10.printStackTrace();
                    }
                    iVar.f3284s = null;
                }
                iVar.f3283r = true;
                this.C0 = null;
            }
            E();
            return;
        }
        this.W = true;
    }

    public void D(boolean z10) {
        RLottieNative rLottieNative = this.f38221n0;
        this.f38221n0 = null;
        if (rLottieNative != null) {
            hb0 hb0Var = new hb0(rLottieNative, 12);
            if (z10) {
                org.telegram.messenger.s5.a(hb0Var);
            } else {
                Utilities.f22810e.c(hb0Var);
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
        if (this.f38230u0 != null) {
            this.f38230u0 = null;
        }
    }

    public final void F(ImageReceiver imageReceiver) {
        View view;
        xe.b bVar = this.J0;
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
                    nh0 nh0Var = this.P;
                    if (nh0Var != null) {
                        U0.cancelRunnable(nh0Var);
                        bg.i.c();
                        this.P = null;
                    }
                    this.f38237y0 = false;
                    this.E0 = false;
                }
            }
        }
    }

    public final void G() {
        if (!this.f38204a0 && !this.f38219l0 && this.X) {
            if (this.f38206b0 <= 2) {
                this.f38206b0 = 0;
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
            if (this.f38219l0 || (this.X && !this.Y)) {
                if (!this.f38237y0 || this.F0) {
                    if (!this.f38227s.isEmpty()) {
                        this.f38232w.putAll(this.f38227s);
                        this.f38227s.clear();
                    }
                    int[] iArr = this.f38220n;
                    if (iArr != null) {
                        this.f38225r = iArr;
                        this.f38220n = null;
                    }
                    Runnable runnable = this.G0;
                    this.Q = runnable;
                    if (this.f38208c0) {
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

    public final void K(int i7) {
        if (this.L == 2 && i7 == 3 && this.f38206b0 != 0) {
            return;
        }
        this.L = i7;
    }

    public final void L() {
        N(85, false, false);
    }

    public final void M(int i7) {
        N(i7, true, false);
    }

    public final void N(int i7, boolean z10, boolean z11) {
        if (i7 >= 0 && i7 <= this.f38210e[0]) {
            if (this.f38206b0 != i7 || z11) {
                this.f38206b0 = i7;
                this.O = false;
                this.Y = false;
                if (this.f38223p0) {
                    this.f38224q0 = true;
                    if (this.Q != null) {
                        this.f38226r0 = true;
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
                if (z11 && !this.f38219l0) {
                    this.f38219l0 = true;
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
        if (this.K == 2 && (weakReference2 = this.I) != null && this.f38206b0 - 1 >= this.J) {
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
        if (this.f38226r0) {
            this.f38226r0 = false;
        } else if (this.f38224q0) {
            this.f38224q0 = false;
        }
        this.Y = true;
        this.U = false;
        if (z10 && this.Z) {
            this.Y = false;
            this.Z = false;
        }
        if (this.K == 0 && (weakReference = this.I) != null && this.f38206b0 >= this.J && (runnable = (Runnable) weakReference.get()) != null) {
            runnable.run();
        }
        I();
    }

    public final boolean P(int i7) {
        if (this.f38212f == i7 || i7 > this.f38210e[0]) {
            return false;
        }
        this.f38212f = i7;
        return true;
    }

    public final void Q(int i7, String str) {
        this.f38227s.put(str, Integer.valueOf(i7));
        G();
    }

    public final void R(View view) {
        this.I0 = new WeakReference(view);
    }

    public final void S(int i7, Runnable runnable) {
        if (runnable != null) {
            this.I = new WeakReference(runnable);
            this.J = i7;
        } else if (this.I != null) {
            this.I = null;
        }
    }

    public final void T(boolean r3, float r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.oh0.T(boolean, float):void");
    }

    public final void U(long j3) {
        int i7;
        int[] iArr = this.f38210e;
        if (iArr[0] != 0 && (i7 = iArr[1]) != 0) {
            N(Math.round(((float) Math.max(0L, j3)) / (1000.0f / i7)) % iArr[0], true, true);
        }
    }

    public final void V(long j3) {
        boolean z10;
        Integer num;
        int i7;
        this.L0 = 0;
        if (this.M0) {
            this.M0 = false;
            l();
        }
        if (!this.O0 && (this.f38219l0 || !this.X)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (this.f38219l0) {
            if (this.R == null && this.S == null) {
                I();
            } else if (this.S != null) {
                if (this.R == null || (z10 && !this.f38203a)) {
                    HashMap hashMap = this.f38236y;
                    if (hashMap != null && this.F && (num = (Integer) hashMap.get(Integer.valueOf(this.f38206b0 - 1))) != null) {
                        try {
                            Activity activity = LaunchActivity.H1;
                            if (activity == null) {
                                activity = BubbleActivity.f30369b0;
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
        } else if ((this.Z || (this.X && z10)) && this.S != null) {
            O(true);
        }
    }

    @Override
    public final int a(Bitmap bitmap) {
        int i7;
        RLottieNative rLottieNative = this.K0;
        if (rLottieNative == null) {
            return -1;
        }
        int i10 = this.D0;
        if (i10 >= rLottieNative.f33085a[0]) {
            return 0;
        }
        if (this.f38208c0) {
            i7 = 2;
        } else {
            i7 = 1;
        }
        if (rLottieNative.c(i10, bitmap, true) == -5) {
            return -1;
        }
        this.D0 += i7;
        return 1;
    }

    @Override
    public final void b() {
        String str;
        File file;
        ab.v vVar = this.f38231v0;
        File file2 = (File) vVar.f1003e;
        int[] iArr = null;
        if (file2 != null) {
            str = file2.toString();
        } else {
            str = null;
        }
        String str2 = (String) vVar.d;
        if (this.f38209d0) {
            iArr = this.f38210e;
        }
        RLottieNative a10 = RLottieNative.a(str, str2, iArr, (int[]) vVar.f1002c, vVar.f1000a, this.f38234x);
        this.K0 = a10;
        this.D0 = 0;
        if (a10 == null && (file = this.f38228s0) != null) {
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
        return this.f38207c;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f38205b;
    }

    @Override
    public final int getMinimumHeight() {
        return this.f38207c;
    }

    @Override
    public final int getMinimumWidth() {
        return this.f38205b;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public void i() {
        int i7;
        if (this.f38208c0) {
            i7 = 2;
        } else {
            i7 = 1;
        }
        int i10 = this.f38212f;
        if (i10 >= 0 && this.h) {
            int i11 = this.f38206b0;
            if (i11 > i10) {
                int i12 = i11 - i7;
                if (i12 >= i10) {
                    this.f38206b0 = i12;
                    this.O = false;
                    return;
                }
                this.O = true;
                Runnable runnable = this.f38230u0;
                if (runnable != null) {
                    runnable.run();
                    this.f38230u0 = null;
                    return;
                }
                return;
            }
            int i13 = i11 + i7;
            if (i13 < i10) {
                this.f38206b0 = i13;
                this.O = false;
                return;
            }
            this.O = true;
            Runnable runnable2 = this.f38230u0;
            if (runnable2 != null) {
                runnable2.run();
                this.f38230u0 = null;
                return;
            }
            return;
        }
        int i14 = this.f38206b0 + i7;
        if (i10 < 0) {
            i10 = this.f38210e[0];
        }
        if (i14 < i10) {
            if (this.L == 3) {
                this.O = true;
                this.N++;
                return;
            }
            this.f38206b0 = i14;
            this.O = false;
            return;
        }
        int i15 = this.L;
        if (i15 == 1) {
            this.f38206b0 = 0;
            this.O = false;
            if (this.E) {
                this.f38236y = null;
                this.E = false;
            }
            int i16 = this.M;
            if (i16 > 0) {
                this.M = i16 - 1;
            }
        } else if (i15 == 2) {
            this.f38206b0 = 0;
            this.O = true;
            this.N++;
            if (this.E) {
                this.f38236y = null;
                this.E = false;
            }
        } else {
            this.O = true;
            Runnable runnable3 = this.f38230u0;
            if (runnable3 != null) {
                runnable3.run();
                this.f38230u0 = null;
            }
        }
    }

    @Override
    public final boolean isRunning() {
        return this.f38219l0;
    }

    public int j() {
        if (this.m0) {
            return 3;
        }
        if (k()) {
            if (this.f38221n0 == null && this.d) {
                String y22 = org.telegram.messenger.g0.y2(null, this.f38231v0.f1001b);
                if (TextUtils.isEmpty(y22)) {
                    return 2;
                }
                this.f38221n0 = RLottieNative.b(y22, this.f38210e, (int[]) this.f38231v0.f1002c, this.f38234x);
                this.d = false;
                return 1;
            }
            return 1;
        }
        return 2;
    }

    public final boolean k() {
        if (this.f38229t0) {
            if (this.C0 == null && !this.f38222o0) {
                return false;
            }
            return true;
        } else if (this.f38221n0 == null && !this.d) {
            return false;
        } else {
            return true;
        }
    }

    public final void l() {
        nh0 nh0Var = new nh0(this, 6);
        Typeface typeface = org.telegram.messenger.g0.f24018a;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            org.telegram.messenger.g0.g3(nh0Var);
        } else {
            nh0Var.run();
        }
    }

    public final void m() {
        float f10;
        if (this.f38219l0 && !this.M0) {
            if (!this.P0) {
                float f11 = this.f38210e[1];
                if (this.f38208c0) {
                    f10 = 2.0f;
                } else {
                    f10 = 1.0f;
                }
                int round = Math.round((f11 / f10) * this.G);
                if (round > 0) {
                    if (this.f38210e[0] != 1 || this.K != 0) {
                        this.P0 = true;
                        this.L0 = 0;
                        bg.k.d().b(this.N0, round);
                        x();
                    }
                }
            }
        } else if (this.P0) {
            this.P0 = false;
            this.L0 = 0;
            bg.k.d().g(this.N0);
        }
    }

    public final void n() {
        nh0 nh0Var = this.P;
        if (nh0Var != null) {
            U0.cancelRunnable(nh0Var);
            bg.i.c();
            this.P = null;
        }
        if (!v() && this.S != null && this.Q != null) {
            this.Q = null;
            this.S = null;
        }
    }

    public final void o() {
        if (!this.f38204a0) {
            return;
        }
        this.f38204a0 = false;
        if (!this.f38219l0 && this.X) {
            if (this.f38206b0 <= 2) {
                this.f38206b0 = 0;
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
        this.f38214g0 = true;
    }

    public void p() {
        if (this.W) {
            n();
            if (this.Q == null && this.P == null && this.f38221n0 != null) {
                D(true);
            }
        }
        if ((this.f38221n0 == null || this.f38222o0) && this.C0 == null) {
            E();
            return;
        }
        this.U = true;
        if (!v()) {
            stop();
        }
        if (this.f38219l0) {
            I();
        }
    }

    public final void q(Canvas canvas, Paint paint, boolean z10, long j3, int i7) {
        RectF rectF;
        float width;
        boolean z11;
        float f10;
        if (k() && !this.W) {
            if (!z10) {
                V(j3);
            }
            if (z10) {
                rectF = this.f38217j0[i7];
            } else {
                rectF = this.f38216i0;
            }
            if (paint == null) {
                if (z10) {
                    paint = this.f38218k0[i7];
                } else {
                    paint = getPaint();
                }
            }
            if (paint.getAlpha() != 0 && !this.f38224q0 && this.R != null) {
                boolean z12 = true;
                if (!z10) {
                    rectF.set(getBounds());
                    if (this.f38214g0) {
                        this.f38211e0 = rectF.width() / this.f38205b;
                        this.f38213f0 = rectF.height() / this.f38207c;
                        this.f38214g0 = false;
                        if (Math.abs(rectF.width() - this.f38205b) < org.telegram.messenger.g0.L(1.0f) && Math.abs(rectF.height() - this.f38207c) < org.telegram.messenger.g0.L(1.0f)) {
                            z12 = false;
                        }
                        this.f38215h0 = z12;
                    }
                    width = this.f38211e0;
                    f10 = this.f38213f0;
                    z11 = this.f38215h0;
                } else {
                    width = rectF.width() / this.f38205b;
                    float height = rectF.height() / this.f38207c;
                    if (Math.abs(rectF.width() - this.f38205b) < org.telegram.messenger.g0.L(1.0f) && Math.abs(rectF.height() - this.f38207c) < org.telegram.messenger.g0.L(1.0f)) {
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
        int[] iArr = this.f38210e;
        return (iArr[0] / iArr[1]) * 1000.0f;
    }

    public final int s() {
        return this.f38210e[0];
    }

    @Override
    public final void start() {
        if (!this.f38219l0) {
            if ((this.L < 2 || this.N == 0) && this.f38212f != this.f38206b0) {
                this.f38219l0 = true;
                this.M0 = false;
                if (this.f38223p0) {
                    this.f38224q0 = true;
                    if (this.Q != null) {
                        this.f38226r0 = true;
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
        this.f38219l0 = false;
        l();
    }

    public final float t() {
        return this.f38206b0 / this.f38210e[0];
    }

    public final boolean u() {
        if (!this.m0) {
            if ((this.R != null || this.S != null) && !this.f38224q0) {
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
        if (this.R == null || this.f38210e[0] != 1) {
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

    public oh0(int i7, int i10) {
        this.f38210e = new int[3];
        this.f38212f = -1;
        this.f38227s = new HashMap();
        this.f38232w = new HashMap();
        this.f38234x = new HashMap();
        this.E = false;
        this.F = true;
        this.G = 1.0f;
        this.L = 1;
        this.M = -1;
        this.f38211e0 = 1.0f;
        this.f38213f0 = 1.0f;
        this.f38216i0 = new RectF();
        this.f38217j0 = new RectF[2];
        this.f38218k0 = new Paint[2];
        this.f38233w0 = new nh0(this, 1);
        this.f38235x0 = new nh0(this, 2);
        this.f38238z0 = new nh0(this, 3);
        this.A0 = new nh0(this, 4);
        this.G0 = new nh0(this, 5);
        this.J0 = new xe.b(true, true);
        this.N0 = new b6(this, 2);
        this.f38205b = i7;
        this.f38207c = i10;
        this.H = false;
    }

    public oh0(int i7, int i10, int i11) {
        this(i7, i10, i11, true, null);
    }

    public oh0(int i7, int i10, int i11, boolean z10, int[] iArr) {
        long j3;
        this.f38210e = new int[3];
        this.f38212f = -1;
        this.f38227s = new HashMap();
        this.f38232w = new HashMap();
        this.f38234x = new HashMap();
        this.E = false;
        this.F = true;
        this.G = 1.0f;
        this.L = 1;
        this.M = -1;
        this.f38211e0 = 1.0f;
        this.f38213f0 = 1.0f;
        this.f38216i0 = new RectF();
        this.f38217j0 = new RectF[2];
        this.f38218k0 = new Paint[2];
        this.f38233w0 = new nh0(this, 1);
        this.f38235x0 = new nh0(this, 2);
        this.f38238z0 = new nh0(this, 3);
        this.A0 = new nh0(this, 4);
        this.G0 = new nh0(this, 5);
        this.J0 = new xe.b(true, true);
        this.N0 = new b6(this, 2);
        this.f38205b = i10;
        this.f38207c = i11;
        this.L = 0;
        getPaint().setFlags(2);
        ?? obj = new Object();
        this.f38231v0 = obj;
        obj.f1002c = iArr == null ? null : (int[]) iArr.clone();
        long[] jArr = org.telegram.messenger.pt.f26349a;
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
            this.f38231v0.f1001b = i7;
            this.H = (8388608 & j3) != 0;
            int[] iArr2 = this.f38210e;
            iArr2[0] = (int) (8388607 & j3);
            iArr2[1] = (int) ((j3 >>> 24) & 255);
        } else {
            this.H = false;
            String y22 = org.telegram.messenger.g0.y2(null, i7);
            if (TextUtils.isEmpty(y22)) {
                this.f38231v0 = null;
                return;
            }
            ab.v vVar = this.f38231v0;
            vVar.d = y22;
            this.f38221n0 = RLottieNative.b(y22, this.f38210e, (int[]) vVar.f1002c, this.f38234x);
        }
        if (this.H) {
            setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        if (z10) {
            J(true);
        }
    }
}
