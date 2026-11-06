package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.os.Looper;
import android.view.View;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import org.telegram.messenger.AnimatedFileDrawableStream;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class v5 extends BitmapDrawable implements Animatable, bg.g {
    public static final float[] V0 = new float[8];
    public static final ScheduledThreadPoolExecutor W0 = new ScheduledThreadPoolExecutor(8, new ThreadPoolExecutor.DiscardPolicy());
    public static final PorterDuffXfermode X0 = new PorterDuffXfermode(PorterDuff.Mode.SRC);
    public b7.l A0;
    public final t5 B0;
    public boolean C0;
    public boolean D;
    public t5 D0;
    public boolean E;
    public final t5 E0;
    public boolean F;
    public final t5 F0;
    public final File G;
    public int G0;
    public final long H;
    public final t5 H0;
    public final int I;
    public final t5 I0;
    public final int J;
    public t5 J0;
    public boolean K;
    public boolean K0;
    public volatile long L;
    public long L0;
    public volatile long M;
    public Bitmap M0;
    public boolean N;
    public AnimatedFileNative N0;
    public int O;
    public int O0;
    public boolean P;
    public int P0;
    public final Object Q;
    public int Q0;
    public boolean R;
    public volatile boolean R0;
    public final RectF S;
    public final u5 S0;
    public final int[] T;
    public boolean T0;
    public int[] U;
    public boolean U0;
    public final Matrix[] V;
    public final Path[] W;
    public float X;
    public float Y;
    public boolean Z;
    public boolean f38830a;
    public final RectF f38831a0;
    public boolean f38832b;
    public volatile boolean f38833b0;
    public int f38834c;
    public volatile boolean f38835c0;
    public final int[] d;
    public volatile AnimatedFileNative f38836d0;
    public t5 f38837e;
    public boolean f38838e0;
    public boolean f38839f;
    public org.telegram.messenger.q5 f38840f0;
    public float f38841g0;
    public final ArrayList h;
    public float f38842h0;
    public int f38843i0;
    public int f38844j0;
    public final boolean f38845k0;
    public final boolean f38846l0;
    public float m0;
    public s5 f38847n;
    public boolean f38848n0;
    public final TLRPC.Document f38849o0;
    public final RectF[] f38850p0;
    public final Paint[] f38851q0;
    public s5 f38852r;
    public WeakReference f38853r0;
    public s5 f38854s;
    public final xe.b f38855s0;
    public final xe.b f38856t0;
    public AnimatedFileDrawableStream f38857u0;
    public boolean f38858v0;
    public s5 f38859w;
    public boolean f38860w0;
    public boolean f38861x;
    public boolean f38862x0;
    public boolean f38863y;
    public int f38864y0;
    public final bg.i f38865z0;

    public v5(File file, boolean z9, long j3, int i7, TLRPC.Document document, org.telegram.messenger.hc hcVar, Object obj, long j10, int i10, boolean z10) {
        this(file, z9, j3, i7, document, hcVar, obj, j10, i10, z10, 0, 0, null, document != null ? 1 : 0, true);
    }

    public final void A(boolean z9) {
        this.f38862x0 = z9;
        if (z9) {
            this.f38832b = false;
        }
    }

    public final void B(int[] iArr) {
        boolean isEmpty = this.f38855s0.isEmpty();
        int[] iArr2 = this.T;
        if (!isEmpty) {
            if (this.U == null) {
                this.U = new int[4];
            }
            int[] iArr3 = this.U;
            System.arraycopy(iArr2, 0, iArr3, 0, iArr3.length);
        }
        for (int i7 = 0; i7 < 4; i7++) {
            if (!this.f38860w0 && iArr[i7] != iArr2[i7]) {
                this.f38860w0 = true;
            }
            iArr2[i7] = iArr[i7];
        }
    }

    public final void C(long j3, long j10) {
        this.f38841g0 = ((float) j3) / 1000.0f;
        this.f38842h0 = ((float) j10) / 1000.0f;
        if (j3 >= 0 && o() < j3) {
            y(j3, true, false);
        }
    }

    public final void D(long j3) {
        boolean z9;
        this.Q0 = 0;
        if (this.R0) {
            this.R0 = false;
            t5 t5Var = new t5(this, 0);
            Typeface typeface = org.telegram.messenger.g0.f22509a;
            if (Looper.myLooper() != Looper.getMainLooper()) {
                org.telegram.messenger.g0.h3(t5Var);
            } else {
                t5Var.run();
            }
        }
        if (!this.T0 && (this.f38833b0 || !this.D)) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (this.f38833b0) {
            s5 s5Var = this.f38847n;
            if (s5Var == null && this.f38852r == null) {
                x(false);
            } else if (this.f38852r != null) {
                if (s5Var == null || (z9 && !this.f38830a && this.M < 0)) {
                    s5 s5Var2 = this.f38847n;
                    if (s5Var2 != null) {
                        this.h.add(s5Var2);
                    }
                    this.f38847n = this.f38852r;
                    this.f38852r = this.f38854s;
                    this.f38854s = null;
                    this.T0 = false;
                    x(false);
                }
            }
        } else if (!this.f38833b0 && this.D && z9 && this.f38852r != null) {
            s5 s5Var3 = this.f38847n;
            if (s5Var3 != null) {
                this.h.add(s5Var3);
            }
            this.f38847n = this.f38852r;
            this.f38852r = this.f38854s;
            this.f38854s = null;
            this.T0 = false;
            x(false);
        }
    }

    public final void E() {
        int i7;
        int i10;
        int[] iArr;
        int i11;
        int i12;
        if (!this.f38848n0 && (i7 = this.f38843i0) > 0 && (i10 = this.f38844j0) > 0 && (i11 = (iArr = this.d)[0]) > 0 && (i12 = iArr[1]) > 0) {
            float max = Math.max(i10 / i11, i7 / i12);
            this.m0 = max;
            if (max > 0.0f && max <= 0.7d) {
                return;
            }
            this.m0 = 1.0f;
            return;
        }
        this.m0 = 1.0f;
    }

    @Override
    public final int a(Bitmap bitmap) {
        int i7;
        if (this.N0 == null) {
            return -1;
        }
        Canvas canvas = new Canvas(bitmap);
        Bitmap bitmap2 = this.M0;
        int[] iArr = this.d;
        if (bitmap2 == null) {
            this.M0 = Bitmap.createBitmap(iArr[0], iArr[1], Bitmap.Config.ARGB_8888);
        }
        this.N0.c(this.M0, false, this.f38841g0, this.f38842h0, this.f38845k0);
        long j3 = this.L0;
        if (j3 != 0 && ((i7 = iArr[3]) == 0 || j3 > i7)) {
            return 0;
        }
        int i10 = this.P0;
        int i11 = iArr[3];
        if (i10 == i11) {
            int i12 = this.O0 + 1;
            this.O0 = i12;
            if (i12 > 5) {
                return 0;
            }
        }
        this.P0 = i11;
        bitmap.eraseColor(0);
        canvas.save();
        float width = this.f38844j0 / this.M0.getWidth();
        canvas.scale(width, width);
        canvas.drawBitmap(this.M0, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
        this.L0 = iArr[3];
        return 1;
    }

    @Override
    public final void b() {
        this.N0 = AnimatedFileNative.a(this.G.getAbsolutePath(), this.d, this.J, this.H, this.f38857u0, false);
    }

    @Override
    public final void c() {
        AnimatedFileNative animatedFileNative = this.N0;
        if (animatedFileNative != null) {
            animatedFileNative.f();
            this.N0 = null;
        }
    }

    public final void d() {
        int i7;
        if (this.f38844j0 == 0 && this.f38843i0 == 0) {
            int[] iArr = this.d;
            int i10 = iArr[0];
            if (i10 <= 3000 && (i7 = iArr[1]) <= 3000) {
                if (i10 > 2200 || i7 > 2200) {
                    this.f38844j0 = i10 / 2;
                    this.f38843i0 = i7 / 2;
                    return;
                }
                return;
            }
            this.f38844j0 = i10 / 4;
            this.f38843i0 = iArr[1] / 4;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        l(canvas, false, System.currentTimeMillis(), 0);
    }

    public final void e(ImageReceiver imageReceiver) {
        if (imageReceiver != null && this.f38856t0.add(imageReceiver) && this.f38833b0) {
            x(false);
        }
        h();
    }

    public final void f(View view) {
        if (view != null) {
            this.f38855s0.add(view);
        }
    }

    public final void finalize() {
        try {
            this.f38855s0.clear();
            u();
        } finally {
            super.finalize();
        }
    }

    public final boolean g() {
        if (this.f38846l0) {
            if (this.f38865z0 == null) {
                return false;
            }
            return true;
        } else if (this.f38836d0 == null && this.f38863y) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        int i7 = 0;
        if (this.f38863y) {
            int[] iArr = this.d;
            int i10 = iArr[2];
            if (i10 != 90 && i10 != 270) {
                i7 = iArr[1];
            } else {
                i7 = iArr[0];
            }
        }
        if (i7 == 0) {
            return org.telegram.messenger.g0.L(100.0f);
        }
        return (int) (i7 * this.m0);
    }

    @Override
    public final int getIntrinsicWidth() {
        int i7 = 0;
        if (this.f38863y) {
            int[] iArr = this.d;
            int i10 = iArr[2];
            if (i10 != 90 && i10 != 270) {
                i7 = iArr[0];
            } else {
                i7 = iArr[1];
            }
        }
        if (i7 == 0) {
            return org.telegram.messenger.g0.L(100.0f);
        }
        return (int) (i7 * this.m0);
    }

    @Override
    public final int getMinimumHeight() {
        int i7 = 0;
        if (this.f38863y) {
            int[] iArr = this.d;
            int i10 = iArr[2];
            if (i10 != 90 && i10 != 270) {
                i7 = iArr[1];
            } else {
                i7 = iArr[0];
            }
        }
        if (i7 == 0) {
            return org.telegram.messenger.g0.L(100.0f);
        }
        return i7;
    }

    @Override
    public final int getMinimumWidth() {
        int i7 = 0;
        if (this.f38863y) {
            int[] iArr = this.d;
            int i10 = iArr[2];
            if (i10 != 90 && i10 != 270) {
                i7 = iArr[0];
            } else {
                i7 = iArr[1];
            }
        }
        if (i7 == 0) {
            return org.telegram.messenger.g0.L(100.0f);
        }
        return i7;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h() {
        t5 t5Var;
        if (this.f38865z0 != null) {
            boolean isEmpty = this.f38856t0.isEmpty();
            if (isEmpty && this.J0 == null) {
                t5 t5Var2 = new t5(this, 3);
                this.J0 = t5Var2;
                org.telegram.messenger.g0.i3(t5Var2, 600L);
            } else if (!isEmpty && (t5Var = this.J0) != null) {
                org.telegram.messenger.g0.r(t5Var);
                this.J0 = null;
            }
        }
    }

    public final void i() {
        int i7;
        if (this.f38833b0 && !this.R0 && !this.f38839f) {
            if (!this.U0 && (i7 = this.d[5]) > 0) {
                this.U0 = true;
                this.Q0 = 0;
                bg.k.d().b(this.S0, i7);
            }
        } else if (this.U0) {
            this.U0 = false;
            this.Q0 = 0;
            bg.k.d().g(this.S0);
        }
    }

    @Override
    public final boolean isRunning() {
        return this.f38833b0;
    }

    public final void j() {
        xe.b bVar = this.f38856t0;
        Iterator it = bVar.iterator();
        int i7 = 0;
        int i10 = 0;
        while (it.hasNext()) {
            ImageReceiver imageReceiver = (ImageReceiver) it.next();
            if (!imageReceiver.f21228x1) {
                bVar.remove(imageReceiver);
            } else {
                i7++;
            }
            int i11 = imageReceiver.C1;
            if (i11 > 0 && this.f38864y0 >= i11) {
                i10++;
            }
        }
        if (i7 == i10) {
            stop();
        } else {
            start();
        }
    }

    public final void k() {
        if (!g()) {
            s5 s5Var = this.f38847n;
            if (s5Var != null) {
                s5Var.f37942b.recycle();
                Arrays.fill(s5Var.f37941a, (Object) null);
                this.f38847n = null;
            }
            s5 s5Var2 = this.f38859w;
            if (s5Var2 != null) {
                s5Var2.f37942b.recycle();
                Arrays.fill(s5Var2.f37941a, (Object) null);
                this.f38859w = null;
            }
            org.telegram.messenger.q5 q5Var = this.f38840f0;
            if (q5Var != null) {
                q5Var.recycle();
                this.f38840f0 = null;
            }
            int i7 = 0;
            while (true) {
                ArrayList arrayList = this.h;
                if (i7 < arrayList.size()) {
                    s5 s5Var3 = (s5) arrayList.get(i7);
                    s5Var3.f37942b.recycle();
                    Arrays.fill(s5Var3.f37941a, (Object) null);
                    i7++;
                } else {
                    arrayList.clear();
                    t();
                    return;
                }
            }
        }
    }

    public final void l(android.graphics.Canvas r20, boolean r21, long r22, int r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.v5.l(android.graphics.Canvas, boolean, long, int):void");
    }

    public final Bitmap m() {
        s5 s5Var = this.f38847n;
        if (s5Var != null) {
            return s5Var.f37942b;
        }
        s5 s5Var2 = this.f38852r;
        if (s5Var2 != null) {
            return s5Var2.f37942b;
        }
        s5 s5Var3 = this.f38854s;
        if (s5Var3 != null) {
            return s5Var3.f37942b;
        }
        return null;
    }

    public final float n() {
        if (this.d[4] == 0) {
            return 0.0f;
        }
        if (this.M >= 0) {
            return ((float) this.M) / this.d[4];
        }
        int[] iArr = this.d;
        return iArr[3] / iArr[4];
    }

    public final int o() {
        int i7;
        if (this.M >= 0) {
            return (int) this.M;
        }
        s5 s5Var = this.f38852r;
        if (s5Var != null && (i7 = s5Var.f37944e) != 0) {
            return i7;
        }
        s5 s5Var2 = this.f38847n;
        if (s5Var2 != null) {
            return s5Var2.f37944e;
        }
        return 0;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.Z = true;
    }

    public final Bitmap p() {
        int i7 = this.f38844j0;
        int i10 = this.f38843i0;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap createBitmap = Bitmap.createBitmap(i7, i10, config);
        Canvas canvas = new Canvas(createBitmap);
        AnimatedFileNative a10 = AnimatedFileNative.a(this.G.getAbsolutePath(), this.d, this.J, this.H, this.f38857u0, false);
        if (a10 == null) {
            return createBitmap;
        }
        if (this.M0 == null) {
            int[] iArr = this.d;
            this.M0 = Bitmap.createBitmap(Math.max(1, iArr[0]), Math.max(1, iArr[1]), config);
        }
        a10.c(this.M0, false, this.f38841g0, this.f38842h0, true);
        a10.f();
        createBitmap.eraseColor(0);
        canvas.save();
        float width = this.f38844j0 / this.M0.getWidth();
        canvas.scale(width, width);
        canvas.drawBitmap(this.M0, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
        return createBitmap;
    }

    public final Bitmap q(long j3, boolean z9) {
        int c10;
        if (this.f38863y && this.f38836d0 != null) {
            AnimatedFileDrawableStream animatedFileDrawableStream = this.f38857u0;
            if (animatedFileDrawableStream != null) {
                animatedFileDrawableStream.b(false);
                this.f38857u0.d();
            }
            if (!z9) {
                this.f38836d0.g(j3, z9);
            }
            int[] iArr = this.d;
            Bitmap createBitmap = Bitmap.createBitmap(iArr[0], iArr[1], Bitmap.Config.ARGB_8888);
            if (z9) {
                c10 = this.f38836d0.b(j3, createBitmap);
            } else {
                c10 = this.f38836d0.c(createBitmap, true, 0.0f, 0.0f, true);
            }
            if (c10 != 0) {
                return createBitmap;
            }
            createBitmap.recycle();
        }
        return null;
    }

    public final Bitmap r(boolean z9) {
        if (this.f38836d0 == null) {
            s5 s5Var = this.f38859w;
            if (s5Var != null) {
                return s5Var.f37942b;
            }
            return null;
        }
        if (this.f38859w == null) {
            if (!this.h.isEmpty()) {
                this.f38859w = (s5) this.h.remove(0);
            } else {
                int[] iArr = this.d;
                float f10 = this.m0;
                this.f38859w = new s5(Bitmap.createBitmap((int) (iArr[0] * f10), (int) (iArr[1] * f10), Bitmap.Config.ARGB_8888));
            }
        }
        this.f38836d0.c(this.f38859w.f37942b, false, this.f38841g0, this.f38842h0, z9);
        return this.f38859w.f37942b;
    }

    public final boolean s() {
        if (g()) {
            if (this.f38847n != null || this.f38852r != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void start() {
        if (!this.f38833b0 && !this.f38856t0.isEmpty()) {
            this.f38833b0 = true;
            this.R0 = false;
            x(false);
            org.telegram.messenger.g0.h3(this.I0);
            t5 t5Var = new t5(this, 0);
            if (Looper.myLooper() != Looper.getMainLooper()) {
                org.telegram.messenger.g0.h3(t5Var);
            } else {
                t5Var.run();
            }
        }
    }

    @Override
    public final void stop() {
        this.f38833b0 = false;
        t5 t5Var = new t5(this, 0);
        Typeface typeface = org.telegram.messenger.g0.f22509a;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            org.telegram.messenger.g0.h3(t5Var);
        } else {
            t5Var.run();
        }
    }

    public final void t() {
        Iterator it = this.f38856t0.iterator();
        while (it.hasNext()) {
            ((ImageReceiver) it.next()).invalidate();
        }
    }

    public final void u() {
        if (!this.f38855s0.isEmpty()) {
            this.K = true;
            return;
        }
        int i7 = 0;
        this.f38833b0 = false;
        this.f38835c0 = true;
        t5 t5Var = new t5(this, 0);
        Typeface typeface = org.telegram.messenger.g0.f22509a;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            org.telegram.messenger.g0.h3(t5Var);
        } else {
            t5Var.run();
        }
        if (this.D0 != null) {
            bg.i.c();
            zg0.T0.cancelRunnable(this.D0);
            this.D0 = null;
        }
        if (this.f38837e == null) {
            if (this.f38836d0 != null) {
                this.f38836d0.f();
                this.f38836d0 = null;
            }
            ArrayList arrayList = new ArrayList();
            s5 s5Var = this.f38847n;
            if (s5Var != null) {
                arrayList.add(s5Var.f37942b);
            }
            s5 s5Var2 = this.f38852r;
            if (s5Var2 != null) {
                arrayList.add(s5Var2.f37942b);
            }
            s5 s5Var3 = this.f38854s;
            if (s5Var3 != null) {
                arrayList.add(s5Var3.f37942b);
            }
            s5 s5Var4 = this.f38859w;
            if (s5Var4 != null) {
                arrayList.add(s5Var4.f37942b);
            }
            ArrayList arrayList2 = this.h;
            int size = arrayList2.size();
            while (i7 < size) {
                Object obj = arrayList2.get(i7);
                i7++;
                s5 s5Var5 = (s5) obj;
                if (s5Var5 != null) {
                    arrayList.add(s5Var5.f37942b);
                }
            }
            this.h.clear();
            this.f38847n = null;
            this.f38852r = null;
            this.f38854s = null;
            this.f38859w = null;
            org.telegram.messenger.q5 q5Var = this.f38840f0;
            if (q5Var != null) {
                q5Var.recycle();
                this.f38840f0 = null;
            }
            getPaint().setShader(null);
            org.telegram.messenger.g0.A2(arrayList);
        } else {
            this.f38861x = true;
        }
        AnimatedFileDrawableStream animatedFileDrawableStream = this.f38857u0;
        if (animatedFileDrawableStream != null) {
            animatedFileDrawableStream.b(true);
            this.f38857u0 = null;
        }
        t5 t5Var2 = new t5(this, 2);
        if (Looper.myLooper() != Looper.getMainLooper()) {
            org.telegram.messenger.g0.h3(t5Var2);
        } else {
            t5Var2.run();
        }
    }

    public final void v(ImageReceiver imageReceiver) {
        xe.b bVar = this.f38856t0;
        bVar.remove(imageReceiver);
        if (bVar.isEmpty()) {
            this.f38864y0 = 0;
        }
        h();
    }

    public final void w(View view) {
        xe.b bVar = this.f38855s0;
        bVar.remove(view);
        if (bVar.isEmpty()) {
            if (this.K) {
                u();
                return;
            }
            int[] iArr = this.U;
            if (iArr != null) {
                B(iArr);
            }
        }
    }

    public final void x(boolean z9) {
        t5 t5Var;
        t5 t5Var2;
        if (this.f38837e == null || z9) {
            if ((this.f38832b && (this.f38854s == null || (!this.K0 && this.M >= 0))) || this.f38852r == null) {
                if ((this.f38847n == null || !this.f38839f) && g() && !this.f38861x) {
                    if ((this.f38833b0 || (this.D && !this.E)) && !this.f38856t0.isEmpty() && !this.C0) {
                        if (this.f38858v0) {
                            if (this.f38862x0) {
                                t5 t5Var3 = this.H0;
                                this.f38837e = t5Var3;
                                org.telegram.messenger.r5.a(t5Var3);
                            } else {
                                if (z9 && (t5Var2 = this.f38837e) != null) {
                                    W0.remove(t5Var2);
                                }
                                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = W0;
                                t5 t5Var4 = this.H0;
                                this.f38837e = t5Var4;
                                scheduledThreadPoolExecutor.execute(t5Var4);
                            }
                        } else {
                            if (this.f38840f0 == null) {
                                this.f38840f0 = new org.telegram.messenger.q5("decodeQueue" + this, true);
                            }
                            if (z9 && (t5Var = this.f38837e) != null) {
                                this.f38840f0.cancelRunnable(t5Var);
                            }
                            org.telegram.messenger.q5 q5Var = this.f38840f0;
                            t5 t5Var5 = this.H0;
                            this.f38837e = t5Var5;
                            q5Var.postRunnable(t5Var5, 0L);
                        }
                        this.K0 = true;
                    }
                }
            }
        }
    }

    public final void y(long j3, boolean z9, boolean z10) {
        AnimatedFileDrawableStream animatedFileDrawableStream;
        int i7;
        synchronized (this.Q) {
            try {
                this.L = j3;
                this.M = j3;
                this.K0 = false;
                if (this.f38836d0 != null) {
                    this.f38836d0.e();
                }
                if (this.f38863y && (animatedFileDrawableStream = this.f38857u0) != null) {
                    animatedFileDrawableStream.b(z9);
                    this.N = z9;
                    if (z9) {
                        i7 = 0;
                    } else {
                        i7 = 10;
                    }
                    this.O = i7;
                }
                if (z10 && this.D) {
                    this.E = false;
                    if (this.f38837e == null) {
                        x(true);
                    } else {
                        this.F = true;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void z(float f10, float f11, float f12, float f13) {
        float f14 = f13 + f11;
        float f15 = f12 + f10;
        RectF rectF = this.S;
        if (rectF.left == f10 && rectF.top == f11 && rectF.right == f15 && rectF.bottom == f14) {
            return;
        }
        rectF.set(f10, f11, f15, f14);
        this.f38860w0 = true;
    }

    public v5(java.io.File r19, boolean r20, long r21, int r23, org.telegram.tgnet.TLRPC.Document r24, org.telegram.messenger.hc r25, java.lang.Object r26, long r27, int r29, boolean r30, int r31, int r32, bg.f r33, int r34, boolean r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.v5.<init>(java.io.File, boolean, long, int, org.telegram.tgnet.TLRPC$Document, org.telegram.messenger.hc, java.lang.Object, long, int, boolean, int, int, bg.f, int, boolean):void");
    }
}
