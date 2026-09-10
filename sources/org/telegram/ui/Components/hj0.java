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
public class hj0 extends BitmapDrawable implements Animatable, xf.c {
    public static final AtomicInteger P0 = new AtomicInteger();
    public static final AtomicInteger Q0 = new AtomicInteger();
    public static final ExecutorService R0 = Executors.newFixedThreadPool(4, new e2.c0(1));
    public static final ExecutorService S0 = Executors.newFixedThreadPool(2, new e2.c0(2));
    public static DispatchQueue T0;
    public final Runnable A0;
    public final Runnable B0;
    public Runnable C0;
    public xf.e D0;
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
    public final xf.g M0;
    public int N;
    public boolean N0;
    public volatile boolean O;
    public boolean O0;
    public gj0 P;
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
    public boolean f23645a;
    public boolean f23646a0;
    public final int f23647b;
    public int f23648b0;
    public final int f23649c;
    public final boolean f23650c0;
    public boolean d;
    public final boolean f23651d0;
    public final int[] e;
    public float f23652e0;
    public int f23653f;
    public float f23654f0;
    public boolean f23655g0;
    public boolean h;
    public boolean f23656h0;
    public final RectF f23657i0;
    public final RectF[] f23658j0;
    public final Paint[] f23659k0;
    public volatile boolean f23660l0;
    public volatile boolean m0;
    public int[] f23661n;
    public volatile RLottieNative f23662n0;
    public final boolean f23663o0;
    public boolean f23664p0;
    public boolean f23665q0;
    public int[] f23666r;
    public boolean f23667r0;
    public final HashMap f23668s;
    public final File f23669s0;
    public final boolean f23670t0;
    public Runnable f23671u0;
    public final HashMap v;
    public View f23672v0;
    public final HashMap f23673w;
    public final com.google.firebase.messaging.p f23674w0;
    public HashMap f23675x;
    public final Runnable f23676x0;
    public boolean f23677y;
    public final Runnable f23678y0;
    public boolean f23679z0;

    public hj0(java.io.File r21, java.lang.String r22, int r23, int r24, b2.n1 r25, boolean r26, int r27, boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hj0.<init>(java.io.File, java.lang.String, int, int, b2.n1, boolean, int, boolean):void");
    }

    public static void d(hj0 hj0Var) {
        if (hj0Var.P != null) {
            xf.e.c();
            hj0Var.P = null;
        }
        hj0Var.f23679z0 = false;
        hj0Var.p();
        Runnable runnable = hj0Var.C0;
        if (runnable != null) {
            runnable.run();
            hj0Var.C0 = null;
        }
    }

    public static void e(hj0 hj0Var) {
        if (!hj0Var.m0 && !hj0Var.W && hj0Var.k() && hj0Var.P == null) {
            hj0Var.f23679z0 = true;
            if (T0 == null) {
                T0 = new DispatchQueue("cache generator queue");
            }
            xf.e.A++;
            DispatchQueue dispatchQueue = T0;
            gj0 gj0Var = new gj0(hj0Var, 0);
            hj0Var.P = gj0Var;
            dispatchQueue.postRunnable(gj0Var);
        }
    }

    public static void f(hj0 hj0Var) {
        int i10;
        Bitmap.Config config;
        Bitmap createBitmap;
        boolean z10;
        try {
            i10 = hj0Var.j();
            if (i10 == 1) {
                if (hj0Var.T != null) {
                    createBitmap = hj0Var.T;
                    z10 = true;
                } else {
                    if (hj0Var.G) {
                        config = Bitmap.Config.ALPHA_8;
                    } else {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    createBitmap = Bitmap.createBitmap(hj0Var.f23647b, hj0Var.f23649c, config);
                    hj0Var.T = createBitmap;
                    z10 = false;
                }
                int B = hj0Var.B(createBitmap, z10);
                if (B == 1) {
                    hj0Var.S = createBitmap;
                    hj0Var.i();
                }
                i10 = B;
            }
        } catch (Exception e) {
            FileLog.e(e);
            i10 = 2;
        }
        if (i10 == 1) {
            hj0Var.I0 = 0;
            AndroidUtilities.runOnUIThread(hj0Var.f23678y0);
        } else if (i10 == 2) {
            AndroidUtilities.runOnUIThread(hj0Var.f23676x0, hj0Var.I0);
            hj0Var.I0 = Math.min((Math.max(hj0Var.I0, 2) * 3) / 2, 2000);
        } else if (i10 == 3) {
            AndroidUtilities.runOnUIThread(hj0Var.f23676x0);
        }
        CountDownLatch countDownLatch = hj0Var.V;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    public static void g(hj0 hj0Var) {
        int i10 = hj0Var.K0 + 1;
        hj0Var.K0 = i10;
        if (i10 > 10) {
            hj0Var.L0 = true;
        }
        hj0Var.m();
        if (hj0Var.O0) {
            hj0Var.N0 = true;
            hj0Var.x();
        }
    }

    public static void h(hj0 hj0Var) {
        hj0Var.Y = true;
        if ((!hj0Var.f23660l0 && hj0Var.X) || (hj0Var.R == null && hj0Var.S != null)) {
            hj0Var.x();
        }
        hj0Var.p();
    }

    public final boolean A() {
        if (this.f23648b0 != this.e[0] - 1) {
            return false;
        }
        return true;
    }

    public int B(Bitmap bitmap, boolean z10) {
        RLottieNative b10;
        int i10;
        int c10;
        xf.e eVar;
        RLottieNative rLottieNative = this.f23662n0;
        if (rLottieNative != null) {
            try {
                if (!this.v.isEmpty() || this.f23666r != null) {
                    this.f23673w.putAll(this.v);
                    int[] iArr = this.f23666r;
                    if (iArr != null) {
                        this.f23674w0.f6112c = (int[]) iArr.clone();
                    }
                    com.google.firebase.messaging.p pVar = this.f23674w0;
                    File file = (File) pVar.e;
                    if (file != null) {
                        String absolutePath = file.getAbsolutePath();
                        com.google.firebase.messaging.p pVar2 = this.f23674w0;
                        b10 = RLottieNative.a(absolutePath, (String) pVar2.d, this.e, (int[]) pVar2.f6112c, pVar2.f6110a, this.f23673w);
                    } else {
                        int i11 = pVar.f6111b;
                        if (i11 != 0 && ((String) pVar.d) == null) {
                            String readRes = AndroidUtilities.readRes(i11);
                            if (!TextUtils.isEmpty(readRes)) {
                                com.google.firebase.messaging.p pVar3 = this.f23674w0;
                                pVar3.d = readRes;
                                b10 = RLottieNative.b(readRes, this.e, (int[]) pVar3.f6112c, this.f23673w);
                            }
                        } else {
                            b10 = RLottieNative.b((String) pVar.d, this.e, (int[]) pVar.f6112c, this.f23673w);
                        }
                    }
                    if (b10 != null) {
                        this.f23662n0 = b10;
                        rLottieNative.d();
                        this.v.clear();
                        this.f23666r = null;
                    }
                }
            } catch (Exception unused) {
            }
        }
        RLottieNative rLottieNative2 = this.f23662n0;
        if (this.f23650c0) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        if (this.f23670t0 && (eVar = this.D0) != null) {
            c10 = 0;
            try {
                c10 = eVar.f(bitmap, this.f23648b0 / i10);
                if (!this.D0.g() && this.G0 && this.f23662n0 != null) {
                    this.f23662n0.d();
                    this.f23662n0 = null;
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else {
            c10 = rLottieNative2.c(this.f23648b0, bitmap, z10);
        }
        xf.e eVar2 = this.D0;
        if (eVar2 != null && eVar2.g()) {
            if (!this.F0) {
                this.F0 = true;
                AndroidUtilities.runOnUIThread(this.A0);
            }
            c10 = -1;
            if (this.G0) {
                if (this.f23662n0 == null) {
                    String file2 = ((File) this.f23674w0.e).toString();
                    com.google.firebase.messaging.p pVar4 = this.f23674w0;
                    this.f23662n0 = RLottieNative.a(file2, (String) pVar4.d, null, (int[]) pVar4.f6112c, pVar4.f6110a, this.f23673w);
                }
                if (this.f23662n0 != null) {
                    c10 = this.f23662n0.c(this.f23648b0, bitmap, z10);
                }
            }
        }
        if (c10 < 0) {
            return 2;
        }
        return 1;
    }

    public void C(boolean z10) {
        this.f23660l0 = false;
        this.m0 = true;
        l();
        n();
        if (this.Q == null && this.P == null && !this.f23679z0) {
            D(z10);
            xf.e eVar = this.D0;
            if (eVar != null) {
                RandomAccessFile randomAccessFile = eVar.f45128s;
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    eVar.f45128s = null;
                }
                eVar.f45127r = true;
                this.D0 = null;
            }
            E();
            return;
        }
        this.W = true;
    }

    public void D(boolean z10) {
        RLottieNative rLottieNative = this.f23662n0;
        this.f23662n0 = null;
        if (rLottieNative != null) {
            kc0 kc0Var = new kc0(rLottieNative, 15);
            if (z10) {
                DispatchQueuePoolBackground.execute(kc0Var);
            } else {
                Utilities.globalQueue.postRunnable(kc0Var);
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
        AndroidUtilities.recycleBitmaps(arrayList);
        if (this.f23671u0 != null) {
            this.f23671u0 = null;
        }
    }

    public final void F(ImageReceiver imageReceiver) {
        ArrayList arrayList = this.J;
        arrayList.remove(imageReceiver);
        if (this.D0 != null && T0 != null && this.P != null && arrayList.isEmpty() && getCallback() == null) {
            View view = this.f23672v0;
            if (view == null || !view.isAttachedToWindow()) {
                gj0 gj0Var = this.P;
                if (gj0Var != null) {
                    T0.cancelRunnable(gj0Var);
                    xf.e.c();
                    this.P = null;
                }
                this.f23679z0 = false;
                this.F0 = false;
            }
        }
    }

    public final void G() {
        if (!this.f23646a0 && !this.f23660l0 && this.X) {
            if (this.f23648b0 <= 2) {
                this.f23648b0 = 0;
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
            if (this.f23660l0 || (this.X && !this.Y)) {
                if (!this.f23679z0 || this.G0) {
                    if (!this.f23668s.isEmpty()) {
                        this.v.putAll(this.f23668s);
                        this.f23668s.clear();
                    }
                    int[] iArr = this.f23661n;
                    if (iArr != null) {
                        this.f23666r = iArr;
                        this.f23661n = null;
                    }
                    Runnable runnable = this.H0;
                    this.Q = runnable;
                    if (this.f23650c0) {
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
        this.X = true;
        I();
    }

    public final void K(int i10) {
        if (this.L == 2 && i10 == 3 && this.f23648b0 != 0) {
            return;
        }
        this.L = i10;
    }

    public final void L() {
        N(85, false, false);
    }

    public final void M(int i10) {
        N(i10, true, false);
    }

    public final void N(int i10, boolean z10, boolean z11) {
        if (i10 >= 0 && i10 <= this.e[0]) {
            if (this.f23648b0 != i10 || z11) {
                this.f23648b0 = i10;
                this.O = false;
                this.Y = false;
                if (this.f23664p0) {
                    this.f23665q0 = true;
                    if (this.Q != null) {
                        this.f23667r0 = true;
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
                if (z11 && !this.f23660l0) {
                    this.f23660l0 = true;
                    l();
                }
                if (I()) {
                    if (!z10) {
                        try {
                            this.V.await();
                        } catch (Exception e) {
                            FileLog.e(e);
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
        this.N0 = false;
        if (this.K == 2 && (weakReference2 = this.H) != null && this.f23648b0 - 1 >= this.I) {
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
        if (this.f23667r0) {
            this.f23667r0 = false;
        } else if (this.f23665q0) {
            this.f23665q0 = false;
        }
        this.Y = true;
        this.U = false;
        if (z10 && this.Z) {
            this.Y = false;
            this.Z = false;
        }
        if (this.K == 0 && (weakReference = this.H) != null && this.f23648b0 >= this.I && (runnable = (Runnable) weakReference.get()) != null) {
            runnable.run();
        }
        I();
    }

    public final boolean P(int i10) {
        if (this.f23653f == i10 || i10 > this.e[0]) {
            return false;
        }
        this.f23653f = i10;
        return true;
    }

    public final void Q(int i10, String str) {
        this.f23668s.put(str, Integer.valueOf(i10));
        G();
    }

    public final void R(int i10, Runnable runnable) {
        if (runnable != null) {
            this.H = new WeakReference(runnable);
            this.I = i10;
        } else if (this.H != null) {
            this.H = null;
        }
    }

    public final void S(float f7, boolean z10) {
        if (f7 < 0.0f) {
            f7 = 0.0f;
        } else if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        N((int) (this.e[0] * f7), z10, false);
    }

    public final void T(long j3) {
        int i10;
        int[] iArr = this.e;
        if (iArr[0] != 0 && (i10 = iArr[1]) != 0) {
            N(Math.round(((float) Math.max(0L, j3)) / (1000.0f / i10)) % iArr[0], true, true);
        }
    }

    public final void U(long j3) {
        boolean z10;
        Integer num;
        int i10;
        this.K0 = 0;
        if (this.L0) {
            this.L0 = false;
            l();
        }
        if (!this.N0 && (this.f23660l0 || !this.X)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (this.f23660l0) {
            if (this.R == null && this.S == null) {
                I();
            } else if (this.S != null) {
                if (this.R == null || (z10 && !this.f23645a)) {
                    HashMap hashMap = this.f23675x;
                    if (hashMap != null && this.E && (num = (Integer) hashMap.get(Integer.valueOf(this.f23648b0 - 1))) != null) {
                        try {
                            Activity activity = LaunchActivity.G1;
                            if (activity == null) {
                                activity = BubbleActivity.f18849a0;
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
        } else if ((this.Z || (this.X && z10)) && this.S != null) {
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
        int i11 = this.E0;
        if (i11 >= rLottieNative.f21207a[0]) {
            return 0;
        }
        if (this.f23650c0) {
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
        this.E0 += i10;
        return 1;
    }

    @Override
    public final void b() {
        String str;
        File file;
        com.google.firebase.messaging.p pVar = this.f23674w0;
        File file2 = (File) pVar.e;
        int[] iArr = null;
        if (file2 != null) {
            str = file2.toString();
        } else {
            str = null;
        }
        String str2 = (String) pVar.d;
        if (this.f23651d0) {
            iArr = this.e;
        }
        RLottieNative a2 = RLottieNative.a(str, str2, iArr, (int[]) pVar.f6112c, pVar.f6110a, this.f23673w);
        this.J0 = a2;
        this.E0 = 0;
        if (a2 == null && (file = this.f23669s0) != null) {
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
        return this.f23649c;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f23647b;
    }

    @Override
    public final int getMinimumHeight() {
        return this.f23649c;
    }

    @Override
    public final int getMinimumWidth() {
        return this.f23647b;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public void i() {
        int i10;
        if (this.f23650c0) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        int i11 = this.f23653f;
        if (i11 >= 0 && this.h) {
            int i12 = this.f23648b0;
            if (i12 > i11) {
                int i13 = i12 - i10;
                if (i13 >= i11) {
                    this.f23648b0 = i13;
                    this.O = false;
                    return;
                }
                this.O = true;
                Runnable runnable = this.f23671u0;
                if (runnable != null) {
                    runnable.run();
                    this.f23671u0 = null;
                    return;
                }
                return;
            }
            int i14 = i12 + i10;
            if (i14 < i11) {
                this.f23648b0 = i14;
                this.O = false;
                return;
            }
            this.O = true;
            Runnable runnable2 = this.f23671u0;
            if (runnable2 != null) {
                runnable2.run();
                this.f23671u0 = null;
                return;
            }
            return;
        }
        int i15 = this.f23648b0 + i10;
        if (i11 < 0) {
            i11 = this.e[0];
        }
        if (i15 < i11) {
            if (this.L == 3) {
                this.O = true;
                this.N++;
                return;
            }
            this.f23648b0 = i15;
            this.O = false;
            return;
        }
        int i16 = this.L;
        if (i16 == 1) {
            this.f23648b0 = 0;
            this.O = false;
            if (this.f23677y) {
                this.f23675x = null;
                this.f23677y = false;
            }
            int i17 = this.M;
            if (i17 > 0) {
                this.M = i17 - 1;
            }
        } else if (i16 == 2) {
            this.f23648b0 = 0;
            this.O = true;
            this.N++;
            if (this.f23677y) {
                this.f23675x = null;
                this.f23677y = false;
            }
        } else {
            this.O = true;
            Runnable runnable3 = this.f23671u0;
            if (runnable3 != null) {
                runnable3.run();
                this.f23671u0 = null;
            }
        }
    }

    @Override
    public final boolean isRunning() {
        return this.f23660l0;
    }

    public int j() {
        if (this.m0) {
            return 3;
        }
        if (k()) {
            if (this.f23662n0 == null && this.d) {
                String readRes = AndroidUtilities.readRes(this.f23674w0.f6111b);
                if (TextUtils.isEmpty(readRes)) {
                    return 2;
                }
                this.f23662n0 = RLottieNative.b(readRes, this.e, (int[]) this.f23674w0.f6112c, this.f23673w);
                this.d = false;
                return 1;
            }
            return 1;
        }
        return 2;
    }

    public final boolean k() {
        if (this.f23670t0) {
            if (this.D0 == null && !this.f23663o0) {
                return false;
            }
            return true;
        } else if (this.f23662n0 == null && !this.d) {
            return false;
        } else {
            return true;
        }
    }

    public final void l() {
        AndroidUtilities.executeOnUIThread(new gj0(this, 6));
    }

    public final void m() {
        float f7;
        if (this.f23660l0 && !this.L0) {
            if (!this.O0) {
                float f10 = this.e[1];
                if (this.f23650c0) {
                    f7 = 2.0f;
                } else {
                    f7 = 1.0f;
                }
                int round = Math.round((f10 / f7) * this.F);
                if (round > 0) {
                    if (this.e[0] != 1 || this.K != 0) {
                        this.O0 = true;
                        this.K0 = 0;
                        xf.h.d().b(this.M0, round);
                        x();
                    }
                }
            }
        } else if (this.O0) {
            this.O0 = false;
            this.K0 = 0;
            xf.h.d().g(this.M0);
        }
    }

    public final void n() {
        gj0 gj0Var = this.P;
        if (gj0Var != null) {
            T0.cancelRunnable(gj0Var);
            xf.e.c();
            this.P = null;
        }
        if (!v() && this.S != null && this.Q != null) {
            this.Q = null;
            this.S = null;
        }
    }

    public final void o() {
        if (!this.f23646a0) {
            return;
        }
        this.f23646a0 = false;
        if (!this.f23660l0 && this.X) {
            if (this.f23648b0 <= 2) {
                this.f23648b0 = 0;
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
        this.f23655g0 = true;
    }

    public void p() {
        if (this.W) {
            n();
            if (this.Q == null && this.P == null && this.f23662n0 != null) {
                D(true);
            }
        }
        if ((this.f23662n0 == null || this.f23663o0) && this.D0 == null) {
            E();
            return;
        }
        this.U = true;
        if (!v()) {
            stop();
        }
        if (this.f23660l0) {
            I();
        }
    }

    public final void q(Canvas canvas, Paint paint, boolean z10, long j3, int i10) {
        RectF rectF;
        float width;
        boolean z11;
        float f7;
        if (k() && !this.W) {
            if (!z10) {
                U(j3);
            }
            if (z10) {
                rectF = this.f23658j0[i10];
            } else {
                rectF = this.f23657i0;
            }
            if (paint == null) {
                if (z10) {
                    paint = this.f23659k0[i10];
                } else {
                    paint = getPaint();
                }
            }
            if (paint.getAlpha() != 0 && !this.f23665q0 && this.R != null) {
                boolean z12 = true;
                if (!z10) {
                    rectF.set(getBounds());
                    if (this.f23655g0) {
                        this.f23652e0 = rectF.width() / this.f23647b;
                        this.f23654f0 = rectF.height() / this.f23649c;
                        this.f23655g0 = false;
                        if (Math.abs(rectF.width() - this.f23647b) < AndroidUtilities.dp(1.0f) && Math.abs(rectF.height() - this.f23649c) < AndroidUtilities.dp(1.0f)) {
                            z12 = false;
                        }
                        this.f23656h0 = z12;
                    }
                    width = this.f23652e0;
                    f7 = this.f23654f0;
                    z11 = this.f23656h0;
                } else {
                    width = rectF.width() / this.f23647b;
                    float height = rectF.height() / this.f23649c;
                    if (Math.abs(rectF.width() - this.f23647b) < AndroidUtilities.dp(1.0f) && Math.abs(rectF.height() - this.f23649c) < AndroidUtilities.dp(1.0f)) {
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

    public final long r() {
        int[] iArr = this.e;
        return (iArr[0] / iArr[1]) * 1000.0f;
    }

    public final int s() {
        return this.e[0];
    }

    @Override
    public final void start() {
        if (!this.f23660l0) {
            if ((this.L < 2 || this.N == 0) && this.f23653f != this.f23648b0) {
                this.f23660l0 = true;
                this.L0 = false;
                if (this.f23664p0) {
                    this.f23665q0 = true;
                    if (this.Q != null) {
                        this.f23667r0 = true;
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
        this.f23660l0 = false;
        l();
    }

    public final float t() {
        return this.f23648b0 / this.e[0];
    }

    public final boolean u() {
        if (!this.m0) {
            if ((this.R != null || this.S != null) && !this.f23665q0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean v() {
        if (this.J.isEmpty() && this.f23672v0 == null && getCallback() == null) {
            return false;
        }
        return true;
    }

    public boolean w() {
        if (this.R == null || this.e[0] != 1) {
            return false;
        }
        return true;
    }

    public final void x() {
        if (!this.m0) {
            int size = this.J.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((ImageReceiver) this.J.get(i10)).invalidate();
            }
            View view = this.f23672v0;
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

    public hj0(int i10, int i11) {
        this.e = new int[3];
        this.f23653f = -1;
        this.f23668s = new HashMap();
        this.v = new HashMap();
        this.f23673w = new HashMap();
        this.f23677y = false;
        this.E = true;
        this.F = 1.0f;
        this.J = new ArrayList();
        this.L = 1;
        this.M = -1;
        this.f23652e0 = 1.0f;
        this.f23654f0 = 1.0f;
        this.f23657i0 = new RectF();
        this.f23658j0 = new RectF[2];
        this.f23659k0 = new Paint[2];
        this.f23676x0 = new gj0(this, 1);
        this.f23678y0 = new gj0(this, 2);
        this.A0 = new gj0(this, 3);
        this.B0 = new gj0(this, 4);
        this.H0 = new gj0(this, 5);
        this.M0 = new b6(this, 2);
        this.f23647b = i10;
        this.f23649c = i11;
        this.G = false;
    }

    public hj0(int i10, int i11, int i12) {
        this(i10, i11, i12, true, null);
    }

    public hj0(int i10, int i11, int i12, boolean z10, int[] iArr) {
        int[] iArr2 = new int[3];
        this.e = iArr2;
        this.f23653f = -1;
        this.f23668s = new HashMap();
        this.v = new HashMap();
        HashMap hashMap = new HashMap();
        this.f23673w = hashMap;
        this.f23677y = false;
        this.E = true;
        this.F = 1.0f;
        this.J = new ArrayList();
        this.L = 1;
        this.M = -1;
        this.f23652e0 = 1.0f;
        this.f23654f0 = 1.0f;
        this.f23657i0 = new RectF();
        this.f23658j0 = new RectF[2];
        this.f23659k0 = new Paint[2];
        this.f23676x0 = new gj0(this, 1);
        this.f23678y0 = new gj0(this, 2);
        this.A0 = new gj0(this, 3);
        this.B0 = new gj0(this, 4);
        this.H0 = new gj0(this, 5);
        this.M0 = new b6(this, 2);
        this.f23647b = i11;
        this.f23649c = i12;
        this.L = 0;
        getPaint().setFlags(2);
        ?? obj = new Object();
        this.f23674w0 = obj;
        obj.f6112c = iArr == null ? null : (int[]) iArr.clone();
        long find = ResLottieMeta.find(i10);
        if (find != -1) {
            this.d = true;
            obj.f6111b = i10;
            this.G = ResLottieMeta.isMonoColorOf(find);
            iArr2[0] = ResLottieMeta.frameCountOf(find);
            iArr2[1] = ResLottieMeta.fpsOf(find);
        } else {
            this.G = false;
            String readRes = AndroidUtilities.readRes(i10);
            if (TextUtils.isEmpty(readRes)) {
                this.f23674w0 = null;
                return;
            } else {
                obj.d = readRes;
                this.f23662n0 = RLottieNative.b(readRes, iArr2, (int[]) obj.f6112c, hashMap);
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
