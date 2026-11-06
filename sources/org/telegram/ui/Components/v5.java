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
    public boolean f38822a;
    public final RectF f38823a0;
    public boolean f38824b;
    public volatile boolean f38825b0;
    public int f38826c;
    public volatile boolean f38827c0;
    public final int[] d;
    public volatile AnimatedFileNative f38828d0;
    public t5 f38829e;
    public boolean f38830e0;
    public boolean f38831f;
    public org.telegram.messenger.q5 f38832f0;
    public float f38833g0;
    public final ArrayList h;
    public float f38834h0;
    public int f38835i0;
    public int f38836j0;
    public final boolean f38837k0;
    public final boolean f38838l0;
    public float m0;
    public s5 f38839n;
    public boolean f38840n0;
    public final TLRPC.Document f38841o0;
    public final RectF[] f38842p0;
    public final Paint[] f38843q0;
    public s5 f38844r;
    public WeakReference f38845r0;
    public s5 f38846s;
    public final xe.b f38847s0;
    public final xe.b f38848t0;
    public AnimatedFileDrawableStream f38849u0;
    public boolean f38850v0;
    public s5 f38851w;
    public boolean f38852w0;
    public boolean f38853x;
    public boolean f38854x0;
    public boolean f38855y;
    public int f38856y0;
    public final bg.i f38857z0;

    public v5(File file, boolean z9, long j3, int i7, TLRPC.Document document, org.telegram.messenger.hc hcVar, Object obj, long j10, int i10, boolean z10) {
        this(file, z9, j3, i7, document, hcVar, obj, j10, i10, z10, 0, 0, null, document != null ? 1 : 0, true);
    }

    public final void A(boolean z9) {
        this.f38854x0 = z9;
        if (z9) {
            this.f38824b = false;
        }
    }

    public final void B(int[] iArr) {
        boolean isEmpty = this.f38847s0.isEmpty();
        int[] iArr2 = this.T;
        if (!isEmpty) {
            if (this.U == null) {
                this.U = new int[4];
            }
            int[] iArr3 = this.U;
            System.arraycopy(iArr2, 0, iArr3, 0, iArr3.length);
        }
        for (int i7 = 0; i7 < 4; i7++) {
            if (!this.f38852w0 && iArr[i7] != iArr2[i7]) {
                this.f38852w0 = true;
            }
            iArr2[i7] = iArr[i7];
        }
    }

    public final void C(long j3, long j10) {
        this.f38833g0 = ((float) j3) / 1000.0f;
        this.f38834h0 = ((float) j10) / 1000.0f;
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
            Typeface typeface = org.telegram.messenger.g0.f22516a;
            if (Looper.myLooper() != Looper.getMainLooper()) {
                org.telegram.messenger.g0.h3(t5Var);
            } else {
                t5Var.run();
            }
        }
        if (!this.T0 && (this.f38825b0 || !this.D)) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (this.f38825b0) {
            s5 s5Var = this.f38839n;
            if (s5Var == null && this.f38844r == null) {
                x(false);
            } else if (this.f38844r != null) {
                if (s5Var == null || (z9 && !this.f38822a && this.M < 0)) {
                    s5 s5Var2 = this.f38839n;
                    if (s5Var2 != null) {
                        this.h.add(s5Var2);
                    }
                    this.f38839n = this.f38844r;
                    this.f38844r = this.f38846s;
                    this.f38846s = null;
                    this.T0 = false;
                    x(false);
                }
            }
        } else if (!this.f38825b0 && this.D && z9 && this.f38844r != null) {
            s5 s5Var3 = this.f38839n;
            if (s5Var3 != null) {
                this.h.add(s5Var3);
            }
            this.f38839n = this.f38844r;
            this.f38844r = this.f38846s;
            this.f38846s = null;
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
        if (!this.f38840n0 && (i7 = this.f38835i0) > 0 && (i10 = this.f38836j0) > 0 && (i11 = (iArr = this.d)[0]) > 0 && (i12 = iArr[1]) > 0) {
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
        this.N0.c(this.M0, false, this.f38833g0, this.f38834h0, this.f38837k0);
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
        float width = this.f38836j0 / this.M0.getWidth();
        canvas.scale(width, width);
        canvas.drawBitmap(this.M0, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
        this.L0 = iArr[3];
        return 1;
    }

    @Override
    public final void b() {
        this.N0 = AnimatedFileNative.a(this.G.getAbsolutePath(), this.d, this.J, this.H, this.f38849u0, false);
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
        if (this.f38836j0 == 0 && this.f38835i0 == 0) {
            int[] iArr = this.d;
            int i10 = iArr[0];
            if (i10 <= 3000 && (i7 = iArr[1]) <= 3000) {
                if (i10 > 2200 || i7 > 2200) {
                    this.f38836j0 = i10 / 2;
                    this.f38835i0 = i7 / 2;
                    return;
                }
                return;
            }
            this.f38836j0 = i10 / 4;
            this.f38835i0 = iArr[1] / 4;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        l(canvas, false, System.currentTimeMillis(), 0);
    }

    public final void e(ImageReceiver imageReceiver) {
        if (imageReceiver != null && this.f38848t0.add(imageReceiver) && this.f38825b0) {
            x(false);
        }
        h();
    }

    public final void f(View view) {
        if (view != null) {
            this.f38847s0.add(view);
        }
    }

    public final void finalize() {
        try {
            this.f38847s0.clear();
            u();
        } finally {
            super.finalize();
        }
    }

    public final boolean g() {
        if (this.f38838l0) {
            if (this.f38857z0 == null) {
                return false;
            }
            return true;
        } else if (this.f38828d0 == null && this.f38855y) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        int i7 = 0;
        if (this.f38855y) {
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
        if (this.f38855y) {
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
        if (this.f38855y) {
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
        if (this.f38855y) {
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
        if (this.f38857z0 != null) {
            boolean isEmpty = this.f38848t0.isEmpty();
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
        if (this.f38825b0 && !this.R0 && !this.f38831f) {
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
        return this.f38825b0;
    }

    public final void j() {
        xe.b bVar = this.f38848t0;
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
            if (i11 > 0 && this.f38856y0 >= i11) {
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
            s5 s5Var = this.f38839n;
            if (s5Var != null) {
                s5Var.f37906b.recycle();
                Arrays.fill(s5Var.f37905a, (Object) null);
                this.f38839n = null;
            }
            s5 s5Var2 = this.f38851w;
            if (s5Var2 != null) {
                s5Var2.f37906b.recycle();
                Arrays.fill(s5Var2.f37905a, (Object) null);
                this.f38851w = null;
            }
            org.telegram.messenger.q5 q5Var = this.f38832f0;
            if (q5Var != null) {
                q5Var.recycle();
                this.f38832f0 = null;
            }
            int i7 = 0;
            while (true) {
                ArrayList arrayList = this.h;
                if (i7 < arrayList.size()) {
                    s5 s5Var3 = (s5) arrayList.get(i7);
                    s5Var3.f37906b.recycle();
                    Arrays.fill(s5Var3.f37905a, (Object) null);
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
        s5 s5Var = this.f38839n;
        if (s5Var != null) {
            return s5Var.f37906b;
        }
        s5 s5Var2 = this.f38844r;
        if (s5Var2 != null) {
            return s5Var2.f37906b;
        }
        s5 s5Var3 = this.f38846s;
        if (s5Var3 != null) {
            return s5Var3.f37906b;
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
        s5 s5Var = this.f38844r;
        if (s5Var != null && (i7 = s5Var.f37908e) != 0) {
            return i7;
        }
        s5 s5Var2 = this.f38839n;
        if (s5Var2 != null) {
            return s5Var2.f37908e;
        }
        return 0;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.Z = true;
    }

    public final Bitmap p() {
        int i7 = this.f38836j0;
        int i10 = this.f38835i0;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap createBitmap = Bitmap.createBitmap(i7, i10, config);
        Canvas canvas = new Canvas(createBitmap);
        AnimatedFileNative a10 = AnimatedFileNative.a(this.G.getAbsolutePath(), this.d, this.J, this.H, this.f38849u0, false);
        if (a10 == null) {
            return createBitmap;
        }
        if (this.M0 == null) {
            int[] iArr = this.d;
            this.M0 = Bitmap.createBitmap(Math.max(1, iArr[0]), Math.max(1, iArr[1]), config);
        }
        a10.c(this.M0, false, this.f38833g0, this.f38834h0, true);
        a10.f();
        createBitmap.eraseColor(0);
        canvas.save();
        float width = this.f38836j0 / this.M0.getWidth();
        canvas.scale(width, width);
        canvas.drawBitmap(this.M0, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
        return createBitmap;
    }

    public final Bitmap q(long j3, boolean z9) {
        int c10;
        if (this.f38855y && this.f38828d0 != null) {
            AnimatedFileDrawableStream animatedFileDrawableStream = this.f38849u0;
            if (animatedFileDrawableStream != null) {
                animatedFileDrawableStream.b(false);
                this.f38849u0.d();
            }
            if (!z9) {
                this.f38828d0.g(j3, z9);
            }
            int[] iArr = this.d;
            Bitmap createBitmap = Bitmap.createBitmap(iArr[0], iArr[1], Bitmap.Config.ARGB_8888);
            if (z9) {
                c10 = this.f38828d0.b(j3, createBitmap);
            } else {
                c10 = this.f38828d0.c(createBitmap, true, 0.0f, 0.0f, true);
            }
            if (c10 != 0) {
                return createBitmap;
            }
            createBitmap.recycle();
        }
        return null;
    }

    public final Bitmap r(boolean z9) {
        if (this.f38828d0 == null) {
            s5 s5Var = this.f38851w;
            if (s5Var != null) {
                return s5Var.f37906b;
            }
            return null;
        }
        if (this.f38851w == null) {
            if (!this.h.isEmpty()) {
                this.f38851w = (s5) this.h.remove(0);
            } else {
                int[] iArr = this.d;
                float f10 = this.m0;
                this.f38851w = new s5(Bitmap.createBitmap((int) (iArr[0] * f10), (int) (iArr[1] * f10), Bitmap.Config.ARGB_8888));
            }
        }
        this.f38828d0.c(this.f38851w.f37906b, false, this.f38833g0, this.f38834h0, z9);
        return this.f38851w.f37906b;
    }

    public final boolean s() {
        if (g()) {
            if (this.f38839n != null || this.f38844r != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void start() {
        if (!this.f38825b0 && !this.f38848t0.isEmpty()) {
            this.f38825b0 = true;
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
        this.f38825b0 = false;
        t5 t5Var = new t5(this, 0);
        Typeface typeface = org.telegram.messenger.g0.f22516a;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            org.telegram.messenger.g0.h3(t5Var);
        } else {
            t5Var.run();
        }
    }

    public final void t() {
        Iterator it = this.f38848t0.iterator();
        while (it.hasNext()) {
            ((ImageReceiver) it.next()).invalidate();
        }
    }

    public final void u() {
        if (!this.f38847s0.isEmpty()) {
            this.K = true;
            return;
        }
        int i7 = 0;
        this.f38825b0 = false;
        this.f38827c0 = true;
        t5 t5Var = new t5(this, 0);
        Typeface typeface = org.telegram.messenger.g0.f22516a;
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
        if (this.f38829e == null) {
            if (this.f38828d0 != null) {
                this.f38828d0.f();
                this.f38828d0 = null;
            }
            ArrayList arrayList = new ArrayList();
            s5 s5Var = this.f38839n;
            if (s5Var != null) {
                arrayList.add(s5Var.f37906b);
            }
            s5 s5Var2 = this.f38844r;
            if (s5Var2 != null) {
                arrayList.add(s5Var2.f37906b);
            }
            s5 s5Var3 = this.f38846s;
            if (s5Var3 != null) {
                arrayList.add(s5Var3.f37906b);
            }
            s5 s5Var4 = this.f38851w;
            if (s5Var4 != null) {
                arrayList.add(s5Var4.f37906b);
            }
            ArrayList arrayList2 = this.h;
            int size = arrayList2.size();
            while (i7 < size) {
                Object obj = arrayList2.get(i7);
                i7++;
                s5 s5Var5 = (s5) obj;
                if (s5Var5 != null) {
                    arrayList.add(s5Var5.f37906b);
                }
            }
            this.h.clear();
            this.f38839n = null;
            this.f38844r = null;
            this.f38846s = null;
            this.f38851w = null;
            org.telegram.messenger.q5 q5Var = this.f38832f0;
            if (q5Var != null) {
                q5Var.recycle();
                this.f38832f0 = null;
            }
            getPaint().setShader(null);
            org.telegram.messenger.g0.A2(arrayList);
        } else {
            this.f38853x = true;
        }
        AnimatedFileDrawableStream animatedFileDrawableStream = this.f38849u0;
        if (animatedFileDrawableStream != null) {
            animatedFileDrawableStream.b(true);
            this.f38849u0 = null;
        }
        t5 t5Var2 = new t5(this, 2);
        if (Looper.myLooper() != Looper.getMainLooper()) {
            org.telegram.messenger.g0.h3(t5Var2);
        } else {
            t5Var2.run();
        }
    }

    public final void v(ImageReceiver imageReceiver) {
        xe.b bVar = this.f38848t0;
        bVar.remove(imageReceiver);
        if (bVar.isEmpty()) {
            this.f38856y0 = 0;
        }
        h();
    }

    public final void w(View view) {
        xe.b bVar = this.f38847s0;
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
        if (this.f38829e == null || z9) {
            if ((this.f38824b && (this.f38846s == null || (!this.K0 && this.M >= 0))) || this.f38844r == null) {
                if ((this.f38839n == null || !this.f38831f) && g() && !this.f38853x) {
                    if ((this.f38825b0 || (this.D && !this.E)) && !this.f38848t0.isEmpty() && !this.C0) {
                        if (this.f38850v0) {
                            if (this.f38854x0) {
                                t5 t5Var3 = this.H0;
                                this.f38829e = t5Var3;
                                org.telegram.messenger.r5.a(t5Var3);
                            } else {
                                if (z9 && (t5Var2 = this.f38829e) != null) {
                                    W0.remove(t5Var2);
                                }
                                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = W0;
                                t5 t5Var4 = this.H0;
                                this.f38829e = t5Var4;
                                scheduledThreadPoolExecutor.execute(t5Var4);
                            }
                        } else {
                            if (this.f38832f0 == null) {
                                this.f38832f0 = new org.telegram.messenger.q5("decodeQueue" + this, true);
                            }
                            if (z9 && (t5Var = this.f38829e) != null) {
                                this.f38832f0.cancelRunnable(t5Var);
                            }
                            org.telegram.messenger.q5 q5Var = this.f38832f0;
                            t5 t5Var5 = this.H0;
                            this.f38829e = t5Var5;
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
                if (this.f38828d0 != null) {
                    this.f38828d0.e();
                }
                if (this.f38855y && (animatedFileDrawableStream = this.f38849u0) != null) {
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
                    if (this.f38829e == null) {
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
        this.f38852w0 = true;
    }

    public v5(java.io.File r19, boolean r20, long r21, int r23, org.telegram.tgnet.TLRPC.Document r24, org.telegram.messenger.hc r25, java.lang.Object r26, long r27, int r29, boolean r30, int r31, int r32, bg.f r33, int r34, boolean r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.v5.<init>(java.io.File, boolean, long, int, org.telegram.tgnet.TLRPC$Document, org.telegram.messenger.hc, java.lang.Object, long, int, boolean, int, int, bg.f, int, boolean):void");
    }
}
