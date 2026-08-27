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
import android.util.JsonReader;
import android.view.View;
import java.io.File;
import java.io.FileReader;
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

public class oi0 extends BitmapDrawable implements Animatable, gf.f {
    public static final AtomicInteger L0 = new AtomicInteger();
    public static final AtomicInteger M0 = new AtomicInteger();
    public static final ExecutorService N0;
    public static final ExecutorService O0;
    public static DispatchQueue P0;
    public boolean A;
    public int A0;
    public float B;
    public boolean B0;
    public final boolean C;
    public boolean C0;
    public WeakReference D;
    public final Runnable D0;
    public int E;
    public int E0;
    public final ArrayList F;
    public RLottieNative F0;
    public int G;
    public int G0;
    public int H;
    public volatile boolean H0;
    public int I;
    public final gf.j I0;
    public int J;
    public boolean J0;
    public volatile boolean K;
    public boolean K0;
    public li0 L;
    public Runnable M;
    public volatile Bitmap N;
    public volatile Bitmap O;
    public volatile Bitmap P;
    public boolean Q;
    public CountDownLatch R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public int X;
    public final boolean Y;
    public final boolean Z;

    public boolean f31305a;

    public float f31306a0;

    public final int f31307b;

    public float f31308b0;

    public final int f31309c;

    public boolean f31310c0;
    public boolean d;

    public boolean f31311d0;

    public final int[] f31312e;

    public final RectF f31313e0;

    public int f31314f;

    public final RectF[] f31315f0;

    public final Paint[] f31316g0;
    public boolean h;

    public volatile boolean f31317h0;

    public volatile boolean f31318i0;

    public volatile RLottieNative f31319j0;

    public final boolean f31320k0;

    public boolean f31321l0;
    public boolean m0;

    public int[] f31322n;

    public boolean f31323n0;

    public final File f31324o0;

    public final boolean f31325p0;

    public Runnable f31326q0;

    public int[] f31327r;

    public View f31328r0;

    public final HashMap f31329s;

    public final ni0 f31330s0;

    public final Runnable f31331t0;

    public final Runnable f31332u0;
    public final HashMap v;

    public boolean f31333v0;

    public final HashMap f31334w;

    public final Runnable f31335w0;

    public HashMap f31336x;

    public final Runnable f31337x0;

    public boolean f31338y;

    public Runnable f31339y0;

    public gf.h f31340z0;

    static {
        final int i10 = 0;
        N0 = Executors.newFixedThreadPool(4, new ThreadFactory() {
            @Override
            public final Thread newThread(Runnable runnable) {
                switch (i10) {
                    case 0:
                        return new Thread(runnable, "Lottie-" + oi0.L0.getAndIncrement());
                    default:
                        return new Thread(runnable, "LottieLow-" + oi0.M0.getAndIncrement());
                }
            }
        });
        final int i11 = 1;
        O0 = Executors.newFixedThreadPool(2, new ThreadFactory() {
            @Override
            public final Thread newThread(Runnable runnable) {
                switch (i11) {
                    case 0:
                        return new Thread(runnable, "Lottie-" + oi0.L0.getAndIncrement());
                    default:
                        return new Thread(runnable, "LottieLow-" + oi0.M0.getAndIncrement());
                }
            }
        });
    }

    public oi0(File file, String str, int i10, int i11, ge.i iVar, boolean z10, int i12, boolean z11) throws Throwable {
        int i13;
        char c10;
        RLottieNative rLottieNativeA;
        int[] iArr = new int[3];
        this.f31312e = iArr;
        this.f31314f = -1;
        this.f31329s = new HashMap();
        this.v = new HashMap();
        HashMap map = new HashMap();
        this.f31334w = map;
        this.f31338y = false;
        this.A = true;
        this.B = 1.0f;
        this.F = new ArrayList();
        this.H = 1;
        this.I = -1;
        this.f31306a0 = 1.0f;
        this.f31308b0 = 1.0f;
        this.f31313e0 = new RectF();
        this.f31315f0 = new RectF[2];
        this.f31316g0 = new Paint[2];
        this.f31331t0 = new li0(this, 1);
        this.f31332u0 = new li0(this, 2);
        this.f31335w0 = new li0(this, 3);
        this.f31337x0 = new li0(this, 4);
        this.D0 = new li0(this, 5);
        this.I0 = new w5(this, 2);
        this.f31307b = i10;
        this.f31309c = i11;
        this.Y = z10;
        this.C = z11;
        boolean z12 = iVar != null;
        this.f31325p0 = z12;
        this.f31320k0 = str == null && iVar != null && iVar.f6886b;
        boolean z13 = iVar != null && iVar.f6887c;
        this.Z = z13;
        ni0 ni0Var = new ni0();
        this.f31330s0 = ni0Var;
        ni0Var.d = file.getAbsoluteFile();
        ni0Var.f30979e = str;
        ni0Var.f30976a = null;
        ni0Var.f30977b = i12;
        getPaint().setFlags(2);
        if (str == null) {
            this.f31324o0 = file;
        }
        if (z12 && P0 == null) {
            P0 = new DispatchQueue("cache generator queue");
        }
        if (!z12) {
            this.f31319j0 = RLottieNative.a(file.getAbsolutePath(), str, i10, i11, iArr, z12, ni0Var.f30976a, z10, i12, map);
            if (this.f31319j0 == null) {
                FileLog.d("RLottieDrawable nativePtr == 0 " + file.getAbsolutePath() + " remove file");
                file.delete();
            }
            if (!z10 || iArr[1] >= 60) {
                return;
            }
            this.Y = false;
            return;
        }
        if (z13) {
            return;
        }
        try {
            try {
                JsonReader jsonReader = new JsonReader(new FileReader(file.getAbsoluteFile()));
                try {
                    jsonReader.beginObject();
                    double dNextDouble = 0.0d;
                    double dNextDouble2 = 30.0d;
                    double dNextDouble3 = 0.0d;
                    while (jsonReader.hasNext()) {
                        String strNextName = jsonReader.nextName();
                        try {
                            int iHashCode = strNextName.hashCode();
                            if (iHashCode != 3276) {
                                if (iHashCode != 3367) {
                                    if (iHashCode == 3553 && strNextName.equals("op")) {
                                        dNextDouble = jsonReader.nextDouble();
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                } else if (strNextName.equals("ip")) {
                                    dNextDouble3 = jsonReader.nextDouble();
                                } else {
                                    jsonReader.skipValue();
                                }
                            } else if (strNextName.equals("fr")) {
                                dNextDouble2 = jsonReader.nextDouble();
                            } else {
                                jsonReader.skipValue();
                            }
                        } catch (Throwable th) {
                            th = th;
                            Throwable th2 = th;
                            try {
                                jsonReader.close();
                                throw th2;
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                                throw th2;
                            }
                        }
                    }
                    jsonReader.endObject();
                    jsonReader.close();
                    iArr[0] = (int) (dNextDouble - dNextDouble3);
                    iArr[1] = (int) dNextDouble2;
                    i13 = 60;
                    c10 = 1;
                    if (this.Y && this.f31312e[c10] < i13) {
                        this.Y = false;
                    }
                    this.f31340z0 = new gf.h(file, this, iVar, i10, i11, !z10, i12);
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (Exception e9) {
                e = e9;
                FileLog.e((Throwable) e, false);
                String absolutePath = file.getAbsolutePath();
                int i14 = this.f31307b;
                int i15 = this.f31309c;
                ni0 ni0Var2 = this.f31330s0;
                i13 = 60;
                c10 = 1;
                rLottieNativeA = RLottieNative.a(absolutePath, str, i14, i15, iArr, false, ni0Var2.f30976a, this.Y, ni0Var2.f30977b, this.f31334w);
                if (rLottieNativeA != null) {
                    rLottieNativeA.d();
                }
            }
        } catch (Exception e10) {
            e = e10;
            FileLog.e((Throwable) e, false);
            String absolutePath2 = file.getAbsolutePath();
            int i16 = this.f31307b;
            int i17 = this.f31309c;
            ni0 ni0Var3 = this.f31330s0;
            i13 = 60;
            c10 = 1;
            rLottieNativeA = RLottieNative.a(absolutePath2, str, i16, i17, iArr, false, ni0Var3.f30976a, this.Y, ni0Var3.f30977b, this.f31334w);
            if (rLottieNativeA != null) {
                rLottieNativeA.d();
            }
        }
    }

    public static void d(oi0 oi0Var) {
        if (oi0Var.L != null) {
            gf.h.c();
            oi0Var.L = null;
        }
        oi0Var.f31333v0 = false;
        oi0Var.n();
        Runnable runnable = oi0Var.f31339y0;
        if (runnable != null) {
            runnable.run();
            oi0Var.f31339y0 = null;
        }
    }

    public static void e(oi0 oi0Var) {
        if (oi0Var.f31318i0 || oi0Var.S || !oi0Var.i() || oi0Var.L != null) {
            return;
        }
        oi0Var.f31333v0 = true;
        if (P0 == null) {
            P0 = new DispatchQueue("cache generator queue");
        }
        gf.h.A++;
        DispatchQueue dispatchQueue = P0;
        li0 li0Var = new li0(oi0Var, 0);
        oi0Var.L = li0Var;
        dispatchQueue.postRunnable(li0Var);
    }

    public static void f(oi0 oi0Var) {
        Runnable runnable = oi0Var.f31331t0;
        int iZ = oi0Var.z();
        if (iZ == 1) {
            oi0Var.E0 = 0;
            AndroidUtilities.runOnUIThread(oi0Var.f31332u0);
        } else if (iZ == 2) {
            AndroidUtilities.runOnUIThread(runnable, oi0Var.E0);
            oi0Var.E0 = Math.min((Math.max(oi0Var.E0, 2) * 3) / 2, 2000);
        } else if (iZ == 3) {
            AndroidUtilities.runOnUIThread(runnable);
        }
        CountDownLatch countDownLatch = oi0Var.R;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    public static void g(oi0 oi0Var) {
        int i10 = oi0Var.G0 + 1;
        oi0Var.G0 = i10;
        if (i10 > 10) {
            oi0Var.H0 = true;
        }
        oi0Var.k();
        if (oi0Var.K0) {
            oi0Var.J0 = true;
            oi0Var.v();
        }
    }

    public static void h(oi0 oi0Var) {
        oi0Var.U = true;
        if ((!oi0Var.f31317h0 && oi0Var.T) || (oi0Var.N == null && oi0Var.O != null)) {
            oi0Var.v();
        }
        oi0Var.n();
    }

    public void A(boolean z10) {
        this.f31317h0 = false;
        this.f31318i0 = true;
        j();
        l();
        if (this.M != null || this.L != null || this.f31333v0) {
            this.S = true;
            return;
        }
        B(z10);
        gf.h hVar = this.f31340z0;
        if (hVar != null) {
            RandomAccessFile randomAccessFile = hVar.f6996s;
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (IOException e9) {
                    e9.printStackTrace();
                }
                hVar.f6996s = null;
            }
            hVar.f6995r = true;
            this.f31340z0 = null;
        }
        C();
    }

    public void B(boolean z10) {
        RLottieNative rLottieNative = this.f31319j0;
        this.f31319j0 = null;
        if (rLottieNative != null) {
            mb0 mb0Var = new mb0(rLottieNative, 15);
            if (z10) {
                DispatchQueuePoolBackground.execute(mb0Var);
            } else {
                Utilities.globalQueue.postRunnable(mb0Var);
            }
        }
    }

    public final void C() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.N);
        arrayList.add(this.P);
        arrayList.add(this.O);
        this.O = null;
        this.N = null;
        this.P = null;
        AndroidUtilities.recycleBitmaps(arrayList);
        if (this.f31326q0 != null) {
            this.f31326q0 = null;
        }
    }

    public final void D(ImageReceiver imageReceiver) {
        ArrayList arrayList = this.F;
        arrayList.remove(imageReceiver);
        if (this.f31340z0 == null || P0 == null || this.L == null || !arrayList.isEmpty() || getCallback() != null) {
            return;
        }
        View view = this.f31328r0;
        if (view == null || !view.isAttachedToWindow()) {
            li0 li0Var = this.L;
            if (li0Var != null) {
                P0.cancelRunnable(li0Var);
                gf.h.c();
                this.L = null;
            }
            this.f31333v0 = false;
            this.B0 = false;
        }
    }

    public final void E() {
        if (!this.W && !this.f31317h0 && this.T) {
            if (this.X <= 2) {
                this.X = 0;
            }
            this.K = false;
            this.U = false;
            if (!G()) {
                this.V = true;
            }
        }
        v();
    }

    public final boolean F(boolean z10) {
        if (!z10 && ((this.H < 2 || this.J == 0) && this.I < 0)) {
            return false;
        }
        this.J = 0;
        this.H = 2;
        start();
        return true;
    }

    public final boolean G() {
        if (this.M != null || this.O != null || !i() || u() || this.S || this.f31318i0) {
            return false;
        }
        if (!this.f31317h0 && (!this.T || this.U)) {
            return false;
        }
        if (this.f31333v0 && !this.C0) {
            return false;
        }
        if (!this.f31329s.isEmpty()) {
            this.v.putAll(this.f31329s);
            this.f31329s.clear();
        }
        int[] iArr = this.f31322n;
        if (iArr != null) {
            this.f31327r = iArr;
            this.f31322n = null;
        }
        Runnable runnable = this.D0;
        this.M = runnable;
        (this.Y ? O0 : N0).execute(runnable);
        return true;
    }

    public final void H(boolean z10) {
        this.T = true;
        G();
    }

    public final void I(int i10) {
        if (this.H == 2 && i10 == 3 && this.X != 0) {
            return;
        }
        this.H = i10;
    }

    public final void J() {
        L(85, false, false);
    }

    public final void K(int i10) {
        L(i10, true, false);
    }

    public final void L(int i10, boolean z10, boolean z11) {
        if (i10 < 0 || i10 > this.f31312e[0]) {
            return;
        }
        if (this.X != i10 || z11) {
            this.X = i10;
            this.K = false;
            this.U = false;
            if (this.f31321l0) {
                this.m0 = true;
                if (this.M != null) {
                    this.f31323n0 = true;
                }
            }
            if ((!z10 || z11) && this.Q && this.O != null) {
                this.P = this.O;
                this.O = null;
                this.M = null;
                this.Q = false;
            }
            if (!z10 && this.M == null) {
                this.R = new CountDownLatch(1);
            }
            if (z11 && !this.f31317h0) {
                this.f31317h0 = true;
                j();
            }
            if (!G()) {
                this.V = true;
            } else if (!z10) {
                try {
                    this.R.await();
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
                this.R = null;
            }
            invalidateSelf();
        }
    }

    public final void M(boolean z10) {
        WeakReference weakReference;
        Runnable runnable;
        WeakReference weakReference2;
        this.P = this.N;
        this.N = this.O;
        this.O = null;
        this.J0 = false;
        if (this.G == 2 && (weakReference2 = this.D) != null && this.X - 1 >= this.E) {
            Runnable runnable2 = (Runnable) weakReference2.get();
            if (runnable2 != null) {
                runnable2.run();
            }
            this.D = null;
        }
        if (this.K || (this.I == 0 && this.H == 1)) {
            stop();
        }
        this.M = null;
        if (this.f31323n0) {
            this.f31323n0 = false;
        } else if (this.m0) {
            this.m0 = false;
        }
        this.U = true;
        this.Q = false;
        if (z10 && this.V) {
            this.U = false;
            this.V = false;
        }
        if (this.G == 0 && (weakReference = this.D) != null && this.X >= this.E && (runnable = (Runnable) weakReference.get()) != null) {
            runnable.run();
        }
        G();
    }

    public final boolean N(int i10) {
        if (this.f31314f == i10 || i10 > this.f31312e[0]) {
            return false;
        }
        this.f31314f = i10;
        return true;
    }

    public final void O(int i10, String str) {
        this.f31329s.put(str, Integer.valueOf(i10));
        E();
    }

    public final void P(int i10, Runnable runnable) {
        if (runnable != null) {
            this.D = new WeakReference(runnable);
            this.E = i10;
        } else if (this.D != null) {
            this.D = null;
        }
    }

    public final void Q(float f10, boolean z10) {
        if (f10 < 0.0f) {
            f10 = 0.0f;
        } else if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        L((int) (this.f31312e[0] * f10), z10, false);
    }

    public final void R(long j10) {
        int i10;
        int[] iArr = this.f31312e;
        if (iArr[0] == 0 || (i10 = iArr[1]) == 0) {
            return;
        }
        L(Math.round(Math.max(0L, j10) / (1000.0f / i10)) % iArr[0], true, true);
    }

    public final void S(long j10) {
        Integer num;
        this.G0 = 0;
        if (this.H0) {
            this.H0 = false;
            j();
        }
        if (j10 == 0) {
            System.currentTimeMillis();
        }
        boolean z10 = this.J0 || (!this.f31317h0 && this.T);
        if (!this.f31317h0) {
            if ((this.V || (this.T && z10)) && this.O != null) {
                M(true);
                return;
            }
            return;
        }
        if (this.N == null && this.O == null) {
            G();
            return;
        }
        if (this.O != null) {
            if (this.N == null || (z10 && !this.f31305a)) {
                HashMap map = this.f31336x;
                if (map != null && this.A && (num = (Integer) map.get(Integer.valueOf(this.X - 1))) != null) {
                    try {
                        Activity activity = LaunchActivity.C1;
                        if (activity == null) {
                            activity = BubbleActivity.W;
                        }
                        activity.getWindow().getDecorView().performHapticFeedback(num.intValue() == 1 ? 0 : 3, 2);
                    } catch (Exception unused) {
                    }
                }
                M(false);
            }
        }
    }

    @Override
    public final int a(Bitmap bitmap) {
        RLottieNative rLottieNative = this.F0;
        if (rLottieNative == null) {
            return -1;
        }
        int i10 = this.A0;
        if (i10 >= rLottieNative.f26461a[0]) {
            return 0;
        }
        int i11 = this.Y ? 2 : 1;
        if (rLottieNative.c(i10, bitmap, true) != -5) {
            this.A0 += i11;
            return 1;
        }
        try {
            Thread.sleep(100L);
        } catch (InterruptedException e9) {
            e9.printStackTrace();
        }
        return a(bitmap);
    }

    @Override
    public final void b() {
        File file;
        ni0 ni0Var = this.f31330s0;
        File file2 = ni0Var.d;
        RLottieNative rLottieNativeA = RLottieNative.a(file2 != null ? file2.toString() : null, ni0Var.f30979e, this.f31307b, this.f31309c, this.Z ? this.f31312e : null, false, ni0Var.f30976a, false, ni0Var.f30977b, this.f31334w);
        this.F0 = rLottieNativeA;
        this.A0 = 0;
        if (rLottieNativeA != null || (file = this.f31324o0) == null) {
            return;
        }
        file.delete();
    }

    @Override
    public final void c() {
        RLottieNative rLottieNative = this.F0;
        if (rLottieNative != null) {
            rLottieNative.d();
            this.F0 = null;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        o(canvas, null, false, 0L, 0);
    }

    public final void finalize() throws Throwable {
        try {
            A(false);
        } finally {
            super.finalize();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f31309c;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f31307b;
    }

    @Override
    public final int getMinimumHeight() {
        return this.f31309c;
    }

    @Override
    public final int getMinimumWidth() {
        return this.f31307b;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final boolean i() {
        if (this.f31325p0) {
            return this.f31340z0 != null || this.f31320k0;
        }
        return this.f31319j0 != null || this.d;
    }

    @Override
    public final boolean isRunning() {
        return this.f31317h0;
    }

    public final void j() {
        AndroidUtilities.executeOnUIThread(new li0(this, 6));
    }

    public final void k() {
        if (!this.f31317h0 || this.H0) {
            if (this.K0) {
                this.K0 = false;
                this.G0 = 0;
                gf.k.d().f(this.I0);
                return;
            }
            return;
        }
        if (this.K0) {
            return;
        }
        int iRound = Math.round((this.f31312e[1] / (this.Y ? 2.0f : 1.0f)) * this.B);
        if (iRound > 0) {
            if (this.f31312e[0] == 1 && this.G == 0) {
                return;
            }
            this.K0 = true;
            this.G0 = 0;
            gf.k.d().b(this.I0, iRound);
            v();
        }
    }

    public final void l() {
        li0 li0Var = this.L;
        if (li0Var != null) {
            P0.cancelRunnable(li0Var);
            gf.h.c();
            this.L = null;
        }
        if (t() || this.O == null || this.M == null) {
            return;
        }
        this.M = null;
        this.O = null;
    }

    public final void m() {
        if (this.W) {
            this.W = false;
            if (!this.f31317h0 && this.T) {
                if (this.X <= 2) {
                    this.X = 0;
                }
                this.K = false;
                this.U = false;
                if (!G()) {
                    this.V = true;
                }
            }
            v();
        }
    }

    public void n() {
        if (this.S) {
            l();
            if (this.M == null && this.L == null && this.f31319j0 != null) {
                B(true);
            }
        }
        if ((this.f31319j0 == null || this.f31320k0) && this.f31340z0 == null) {
            C();
            return;
        }
        this.Q = true;
        if (!t()) {
            stop();
        }
        if (this.f31317h0) {
            G();
        }
    }

    public final void o(Canvas canvas, Paint paint, boolean z10, long j10, int i10) {
        float fWidth;
        boolean z11;
        float f10;
        if (!i() || this.S) {
            return;
        }
        if (!z10) {
            S(j10);
        }
        RectF rectF = z10 ? this.f31315f0[i10] : this.f31313e0;
        if (paint == null) {
            paint = z10 ? this.f31316g0[i10] : getPaint();
        }
        if (paint.getAlpha() == 0 || this.m0 || this.N == null) {
            return;
        }
        boolean z12 = true;
        if (z10) {
            fWidth = rectF.width() / this.f31307b;
            float fHeight = rectF.height() / this.f31309c;
            if (Math.abs(rectF.width() - this.f31307b) < AndroidUtilities.dp(1.0f) && Math.abs(rectF.height() - this.f31309c) < AndroidUtilities.dp(1.0f)) {
                z12 = false;
            }
            z11 = z12;
            f10 = fHeight;
        } else {
            rectF.set(getBounds());
            if (this.f31310c0) {
                this.f31306a0 = rectF.width() / this.f31307b;
                this.f31308b0 = rectF.height() / this.f31309c;
                this.f31310c0 = false;
                if (Math.abs(rectF.width() - this.f31307b) < AndroidUtilities.dp(1.0f) && Math.abs(rectF.height() - this.f31309c) < AndroidUtilities.dp(1.0f)) {
                    z12 = false;
                }
                this.f31311d0 = z12;
            }
            fWidth = this.f31306a0;
            f10 = this.f31308b0;
            z11 = this.f31311d0;
        }
        if (!z11) {
            canvas.drawBitmap(this.N, rectF.left, rectF.top, paint);
            return;
        }
        canvas.save();
        canvas.translate(rectF.left, rectF.top);
        canvas.scale(fWidth, f10);
        canvas.drawBitmap(this.N, 0.0f, 0.0f, paint);
        canvas.restore();
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f31310c0 = true;
    }

    public final long p() {
        int[] iArr = this.f31312e;
        return (long) ((iArr[0] / iArr[1]) * 1000.0f);
    }

    public final int q() {
        return this.f31312e[0];
    }

    public final float r() {
        return this.X / this.f31312e[0];
    }

    public final boolean s() {
        if (this.f31318i0) {
            return false;
        }
        return ((this.N == null && this.O == null) || this.m0) ? false : true;
    }

    @Override
    public final void start() {
        if (this.f31317h0) {
            return;
        }
        if ((this.H < 2 || this.J == 0) && this.f31314f != this.X) {
            this.f31317h0 = true;
            this.H0 = false;
            if (this.f31321l0) {
                this.m0 = true;
                if (this.M != null) {
                    this.f31323n0 = true;
                }
            }
            G();
            v();
            j();
        }
    }

    @Override
    public final void stop() {
        this.f31317h0 = false;
        j();
    }

    public final boolean t() {
        return (this.F.isEmpty() && this.f31328r0 == null && getCallback() == null) ? false : true;
    }

    public boolean u() {
        return this.N != null && this.f31312e[0] == 1;
    }

    public final void v() {
        if (this.f31318i0) {
            return;
        }
        int size = this.F.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((ImageReceiver) this.F.get(i10)).invalidate();
        }
        View view = this.f31328r0;
        if (view != null) {
            view.invalidate();
        }
        if (getCallback() != null) {
            invalidateSelf();
        }
    }

    public final boolean w() {
        return this.L != null;
    }

    public boolean x() {
        return true;
    }

    public final boolean y() {
        return this.X == this.f31312e[0] - 1;
    }

    public int z() {
        boolean z10;
        int i10;
        RLottieNative rLottieNativeB;
        int iC;
        gf.h hVar;
        if (this.f31318i0) {
            return 3;
        }
        if (i()) {
            if (this.f31319j0 == null && this.d) {
                String res = AndroidUtilities.readRes(this.f31330s0.f30978c);
                if (!TextUtils.isEmpty(res)) {
                    ni0 ni0Var = this.f31330s0;
                    this.f31319j0 = RLottieNative.b(res, ni0Var.f30980f, this.f31312e, ni0Var.f30976a, this.f31334w);
                    this.d = false;
                }
            }
            if (this.P == null) {
                try {
                    this.P = Bitmap.createBitmap(this.f31307b, this.f31309c, this.C ? Bitmap.Config.ALPHA_8 : Bitmap.Config.ARGB_8888);
                    z10 = false;
                } catch (Throwable th) {
                    FileLog.e(th);
                    z10 = true;
                }
            } else {
                z10 = true;
            }
            if (this.P != null) {
                RLottieNative rLottieNative = this.f31319j0;
                if (rLottieNative == null) {
                    i10 = 2;
                } else {
                    try {
                        if (this.v.isEmpty() && this.f31327r == null) {
                            i10 = 2;
                        } else {
                            this.f31334w.putAll(this.v);
                            int[] iArr = this.f31327r;
                            if (iArr != null) {
                                this.f31330s0.f30976a = (int[]) iArr.clone();
                            }
                            ni0 ni0Var2 = this.f31330s0;
                            File file = ni0Var2.d;
                            try {
                                if (file != null) {
                                    String absolutePath = file.getAbsolutePath();
                                    ni0 ni0Var3 = this.f31330s0;
                                    i10 = 2;
                                    rLottieNativeB = RLottieNative.a(absolutePath, ni0Var3.f30979e, this.f31307b, this.f31309c, this.f31312e, false, ni0Var3.f30976a, this.Y, ni0Var3.f30977b, this.f31334w);
                                } else {
                                    i10 = 2;
                                    int i11 = ni0Var2.f30978c;
                                    if (i11 == 0 || ni0Var2.f30979e != null) {
                                        rLottieNativeB = RLottieNative.b(ni0Var2.f30979e, ni0Var2.f30980f, this.f31312e, ni0Var2.f30976a, this.f31334w);
                                    } else {
                                        String res2 = AndroidUtilities.readRes(i11);
                                        if (!TextUtils.isEmpty(res2)) {
                                            ni0 ni0Var4 = this.f31330s0;
                                            ni0Var4.f30979e = res2;
                                            rLottieNativeB = RLottieNative.b(res2, ni0Var4.f30980f, this.f31312e, ni0Var4.f30976a, this.f31334w);
                                        }
                                    }
                                }
                                if (rLottieNativeB != null) {
                                    this.f31319j0 = rLottieNativeB;
                                    rLottieNative.d();
                                    this.v.clear();
                                    this.f31327r = null;
                                }
                            } catch (Exception unused) {
                            }
                        }
                    } catch (Exception unused2) {
                    }
                }
                try {
                    RLottieNative rLottieNative2 = this.f31319j0;
                    int i12 = this.Y ? 2 : 1;
                    if (!this.f31325p0 || (hVar = this.f31340z0) == null) {
                        iC = rLottieNative2.c(this.X, this.P, z10);
                    } else {
                        try {
                            iC = hVar.f(this.P, this.X / i12);
                            try {
                                if (!this.f31340z0.g() && this.C0 && this.f31319j0 != null) {
                                    this.f31319j0.d();
                                    this.f31319j0 = null;
                                }
                            } catch (Exception e9) {
                                e = e9;
                                FileLog.e(e);
                            }
                        } catch (Exception e10) {
                            e = e10;
                            iC = 0;
                        }
                    }
                    gf.h hVar2 = this.f31340z0;
                    if (hVar2 != null && hVar2.g()) {
                        if (!this.B0) {
                            this.B0 = true;
                            AndroidUtilities.runOnUIThread(this.f31335w0);
                        }
                        iC = -1;
                        if (this.C0) {
                            if (this.f31319j0 == null) {
                                String string = this.f31330s0.d.toString();
                                ni0 ni0Var5 = this.f31330s0;
                                this.f31319j0 = RLottieNative.a(string, ni0Var5.f30979e, this.f31307b, this.f31309c, null, false, ni0Var5.f30976a, false, ni0Var5.f30977b, this.f31334w);
                            }
                            if (this.f31319j0 != null) {
                                iC = this.f31319j0.c(this.X, this.P, z10);
                            }
                        }
                    }
                    if (iC < 0) {
                        return i10;
                    }
                    this.O = this.P;
                    int i13 = this.f31314f;
                    if (i13 < 0 || !this.h) {
                        int i14 = this.X + i12;
                        if (i13 < 0) {
                            i13 = this.f31312e[0];
                        }
                        if (i14 >= i13) {
                            int i15 = this.H;
                            if (i15 == 1) {
                                this.X = 0;
                                this.K = false;
                                if (this.f31338y) {
                                    this.f31336x = null;
                                    this.f31338y = false;
                                }
                                int i16 = this.I;
                                if (i16 > 0) {
                                    this.I = i16 - 1;
                                }
                            } else if (i15 == 2) {
                                this.X = 0;
                                this.K = true;
                                this.J++;
                                if (this.f31338y) {
                                    this.f31336x = null;
                                    this.f31338y = false;
                                }
                            } else {
                                this.K = true;
                                Runnable runnable = this.f31326q0;
                                if (runnable != null) {
                                    runnable.run();
                                    this.f31326q0 = null;
                                }
                            }
                        } else if (this.H == 3) {
                            this.K = true;
                            this.J++;
                        } else {
                            this.X = i14;
                            this.K = false;
                        }
                    } else {
                        int i17 = this.X;
                        if (i17 > i13) {
                            int i18 = i17 - i12;
                            if (i18 >= i13) {
                                this.X = i18;
                                this.K = false;
                            } else {
                                this.K = true;
                                Runnable runnable2 = this.f31326q0;
                                if (runnable2 != null) {
                                    runnable2.run();
                                    this.f31326q0 = null;
                                }
                            }
                        } else {
                            int i19 = i17 + i12;
                            if (i19 < i13) {
                                this.X = i19;
                                this.K = false;
                            } else {
                                this.K = true;
                                Runnable runnable3 = this.f31326q0;
                                if (runnable3 != null) {
                                    runnable3.run();
                                    this.f31326q0 = null;
                                }
                            }
                        }
                    }
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
            }
            return 1;
        }
        return 2;
    }

    public oi0(int i10, int i11) {
        this.f31312e = new int[3];
        this.f31314f = -1;
        this.f31329s = new HashMap();
        this.v = new HashMap();
        this.f31334w = new HashMap();
        this.f31338y = false;
        this.A = true;
        this.B = 1.0f;
        this.F = new ArrayList();
        this.H = 1;
        this.I = -1;
        this.f31306a0 = 1.0f;
        this.f31308b0 = 1.0f;
        this.f31313e0 = new RectF();
        this.f31315f0 = new RectF[2];
        this.f31316g0 = new Paint[2];
        this.f31331t0 = new li0(this, 1);
        this.f31332u0 = new li0(this, 2);
        this.f31335w0 = new li0(this, 3);
        this.f31337x0 = new li0(this, 4);
        this.D0 = new li0(this, 5);
        this.I0 = new w5(this, 2);
        this.f31307b = i10;
        this.f31309c = i11;
        this.C = false;
    }

    public oi0(int i10, int i11, String str, int i12) {
        this(i10, str, i11, i12, true, null);
    }

    public oi0(int i10, String str, int i11, int i12, boolean z10, int[] iArr) {
        long j10;
        long j11;
        this.f31312e = new int[3];
        this.f31314f = -1;
        this.f31329s = new HashMap();
        this.v = new HashMap();
        this.f31334w = new HashMap();
        this.f31338y = false;
        this.A = true;
        this.B = 1.0f;
        this.F = new ArrayList();
        this.H = 1;
        this.I = -1;
        this.f31306a0 = 1.0f;
        this.f31308b0 = 1.0f;
        this.f31313e0 = new RectF();
        this.f31315f0 = new RectF[2];
        this.f31316g0 = new Paint[2];
        this.f31331t0 = new li0(this, 1);
        this.f31332u0 = new li0(this, 2);
        this.f31335w0 = new li0(this, 3);
        this.f31337x0 = new li0(this, 4);
        this.D0 = new li0(this, 5);
        this.I0 = new w5(this, 2);
        this.f31307b = i11;
        this.f31309c = i12;
        this.H = 0;
        getPaint().setFlags(2);
        ni0 ni0Var = new ni0();
        this.f31330s0 = ni0Var;
        ni0Var.f30980f = str;
        ni0Var.f30976a = iArr == null ? null : (int[]) iArr.clone();
        long[] jArr = qe.b.f46225a;
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
                } else {
                    length = i14 - 1;
                }
            } else {
                i13 = i14 + 1;
            }
        }
        if (j11 != j10) {
            this.d = true;
            this.f31330s0.f30978c = i10;
            this.C = (8388608 & j11) != 0;
            int[] iArr2 = this.f31312e;
            iArr2[0] = (int) (8388607 & j11);
            iArr2[1] = (int) ((j11 >>> 24) & 255);
        } else {
            this.C = false;
            String res = AndroidUtilities.readRes(i10);
            if (TextUtils.isEmpty(res)) {
                this.f31330s0 = null;
                return;
            } else {
                ni0 ni0Var2 = this.f31330s0;
                ni0Var2.f30979e = res;
                this.f31319j0 = RLottieNative.b(res, str, this.f31312e, ni0Var2.f30976a, this.f31334w);
            }
        }
        if (this.C) {
            setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        if (z10) {
            H(true);
        }
    }
}
