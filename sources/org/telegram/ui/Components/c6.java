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
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimatedFileDrawableStream;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.DispatchQueuePoolBackground;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class c6 extends BitmapDrawable implements Animatable, jf.e {
    public static final float[] R0 = new float[8];
    public static final ScheduledThreadPoolExecutor S0 = new ScheduledThreadPoolExecutor(8, new ThreadPoolExecutor.DiscardPolicy());
    public static final PorterDuffXfermode T0 = new PorterDuffXfermode(PorterDuff.Mode.SRC);
    public boolean A;
    public final a6 A0;
    public boolean B;
    public final a6 B0;
    public final File C;
    public int C0;
    public final long D;
    public final a6 D0;
    public final int E;
    public final a6 E0;
    public final int F;
    public a6 F0;
    public boolean G;
    public boolean G0;
    public volatile long H;
    public long H0;
    public volatile long I;
    public Bitmap I0;
    public boolean J;
    public AnimatedFileNative J0;
    public int K;
    public int K0;
    public boolean L;
    public int L0;
    public final Object M;
    public int M0;
    public boolean N;
    public volatile boolean N0;
    public final RectF O;
    public final b6 O0;
    public final int[] P;
    public boolean P0;
    public int[] Q;
    public boolean Q0;
    public final Matrix[] R;
    public final Path[] S;
    public float T;
    public float U;
    public boolean V;
    public final RectF W;
    public volatile boolean X;
    public volatile boolean Y;
    public volatile AnimatedFileNative Z;
    public boolean f27313a;
    public boolean f27314a0;
    public boolean f27315b;
    public DispatchQueue f27316b0;
    public int f27317c;
    public float f27318c0;
    public final int[] d;
    public float f27319d0;
    public a6 f27320e;
    public int f27321e0;
    public boolean f27322f;
    public int f27323f0;
    public final boolean f27324g0;
    public final ArrayList h;
    public final boolean f27325h0;
    public float f27326i0;
    public boolean f27327j0;
    public final TLRPC.Document f27328k0;
    public final RectF[] f27329l0;
    public final Paint[] m0;
    public z5 f27330n;
    public View f27331n0;
    public final ArrayList f27332o0;
    public final ArrayList f27333p0;
    public AnimatedFileDrawableStream f27334q0;
    public z5 f27335r;
    public boolean f27336r0;
    public z5 f27337s;
    public boolean f27338s0;
    public boolean f27339t0;
    public int f27340u0;
    public z5 v;
    public final jf.g f27341v0;
    public boolean f27342w;
    public a5.c f27343w0;
    public boolean f27344x;
    public final a6 f27345x0;
    public boolean f27346y;
    public boolean f27347y0;
    public a6 f27348z0;

    public c6(File file, boolean z10, long j10, int i10, TLRPC.Document document, ImageLocation imageLocation, Object obj, long j11, int i11, boolean z11) {
        this(file, z10, j10, i10, document, imageLocation, obj, j11, i11, z11, 0, 0, null, document != null ? 1 : 0, true);
    }

    public final void A(boolean z10) {
        this.f27339t0 = z10;
        if (z10) {
            this.f27315b = false;
        }
    }

    public final void B(int[] iArr) {
        boolean isEmpty = this.f27332o0.isEmpty();
        int[] iArr2 = this.P;
        if (!isEmpty) {
            if (this.Q == null) {
                this.Q = new int[4];
            }
            int[] iArr3 = this.Q;
            System.arraycopy(iArr2, 0, iArr3, 0, iArr3.length);
        }
        for (int i10 = 0; i10 < 4; i10++) {
            if (!this.f27338s0 && iArr[i10] != iArr2[i10]) {
                this.f27338s0 = true;
            }
            iArr2[i10] = iArr[i10];
        }
    }

    public final void C(long j10, long j11) {
        this.f27318c0 = ((float) j10) / 1000.0f;
        this.f27319d0 = ((float) j11) / 1000.0f;
        if (j10 >= 0 && o() < j10) {
            y(j10, true, false);
        }
    }

    public final void D(long j10) {
        boolean z10;
        this.M0 = 0;
        if (this.N0) {
            this.N0 = false;
            AndroidUtilities.executeOnUIThread(new a6(this, 0));
        }
        if (!this.P0 && (this.X || !this.f27346y)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (this.X) {
            z5 z5Var = this.f27330n;
            if (z5Var == null && this.f27335r == null) {
                x(false);
            } else if (this.f27335r != null) {
                if (z5Var == null || (z10 && !this.f27313a && this.I < 0)) {
                    z5 z5Var2 = this.f27330n;
                    if (z5Var2 != null) {
                        this.h.add(z5Var2);
                    }
                    this.f27330n = this.f27335r;
                    this.f27335r = this.f27337s;
                    this.f27337s = null;
                    this.P0 = false;
                    x(false);
                }
            }
        } else if (!this.X && this.f27346y && z10 && this.f27335r != null) {
            z5 z5Var3 = this.f27330n;
            if (z5Var3 != null) {
                this.h.add(z5Var3);
            }
            this.f27330n = this.f27335r;
            this.f27335r = this.f27337s;
            this.f27337s = null;
            this.P0 = false;
            x(false);
        }
    }

    public final void E() {
        int i10;
        int i11;
        int[] iArr;
        int i12;
        int i13;
        if (!this.f27327j0 && (i10 = this.f27321e0) > 0 && (i11 = this.f27323f0) > 0 && (i12 = (iArr = this.d)[0]) > 0 && (i13 = iArr[1]) > 0) {
            float max = Math.max(i11 / i12, i10 / i13);
            this.f27326i0 = max;
            if (max > 0.0f && max <= 0.7d) {
                return;
            }
            this.f27326i0 = 1.0f;
            return;
        }
        this.f27326i0 = 1.0f;
    }

    @Override
    public final int a(Bitmap bitmap) {
        int i10;
        if (this.J0 == null) {
            return -1;
        }
        Canvas canvas = new Canvas(bitmap);
        Bitmap bitmap2 = this.I0;
        int[] iArr = this.d;
        if (bitmap2 == null) {
            this.I0 = Bitmap.createBitmap(iArr[0], iArr[1], Bitmap.Config.ARGB_8888);
        }
        this.J0.c(this.I0, false, this.f27318c0, this.f27319d0, this.f27324g0);
        long j10 = this.H0;
        if (j10 != 0 && ((i10 = iArr[3]) == 0 || j10 > i10)) {
            return 0;
        }
        int i11 = this.L0;
        int i12 = iArr[3];
        if (i11 == i12) {
            int i13 = this.K0 + 1;
            this.K0 = i13;
            if (i13 > 5) {
                return 0;
            }
        }
        this.L0 = i12;
        bitmap.eraseColor(0);
        canvas.save();
        float width = this.f27323f0 / this.I0.getWidth();
        canvas.scale(width, width);
        canvas.drawBitmap(this.I0, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
        this.H0 = iArr[3];
        return 1;
    }

    @Override
    public final void b() {
        this.J0 = AnimatedFileNative.a(this.C.getAbsolutePath(), this.d, this.F, this.D, this.f27334q0, false);
    }

    @Override
    public final void c() {
        AnimatedFileNative animatedFileNative = this.J0;
        if (animatedFileNative != null) {
            animatedFileNative.f();
            this.J0 = null;
        }
    }

    public final void d() {
        int i10;
        if (this.f27323f0 == 0 && this.f27321e0 == 0) {
            int[] iArr = this.d;
            int i11 = iArr[0];
            if (i11 <= 3000 && (i10 = iArr[1]) <= 3000) {
                if (i11 > 2200 || i10 > 2200) {
                    this.f27323f0 = i11 / 2;
                    this.f27321e0 = i10 / 2;
                    return;
                }
                return;
            }
            this.f27323f0 = i11 / 4;
            this.f27321e0 = iArr[1] / 4;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        l(canvas, false, System.currentTimeMillis(), 0);
    }

    public final void e(ImageReceiver imageReceiver) {
        if (!this.f27333p0.contains(imageReceiver)) {
            this.f27333p0.add(imageReceiver);
            if (this.X) {
                x(false);
            }
        }
        h();
    }

    public final void f(View view) {
        if (view != null) {
            ArrayList arrayList = this.f27332o0;
            if (!arrayList.contains(view)) {
                arrayList.add(view);
            }
        }
    }

    public final void finalize() {
        try {
            this.f27332o0.clear();
            u();
        } finally {
            super.finalize();
        }
    }

    public final boolean g() {
        if (this.f27325h0) {
            if (this.f27341v0 == null) {
                return false;
            }
            return true;
        } else if (this.Z == null && this.f27344x) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        int i10 = 0;
        if (this.f27344x) {
            int[] iArr = this.d;
            int i11 = iArr[2];
            if (i11 != 90 && i11 != 270) {
                i10 = iArr[1];
            } else {
                i10 = iArr[0];
            }
        }
        if (i10 == 0) {
            return AndroidUtilities.dp(100.0f);
        }
        return (int) (i10 * this.f27326i0);
    }

    @Override
    public final int getIntrinsicWidth() {
        int i10 = 0;
        if (this.f27344x) {
            int[] iArr = this.d;
            int i11 = iArr[2];
            if (i11 != 90 && i11 != 270) {
                i10 = iArr[0];
            } else {
                i10 = iArr[1];
            }
        }
        if (i10 == 0) {
            return AndroidUtilities.dp(100.0f);
        }
        return (int) (i10 * this.f27326i0);
    }

    @Override
    public final int getMinimumHeight() {
        int i10 = 0;
        if (this.f27344x) {
            int[] iArr = this.d;
            int i11 = iArr[2];
            if (i11 != 90 && i11 != 270) {
                i10 = iArr[1];
            } else {
                i10 = iArr[0];
            }
        }
        if (i10 == 0) {
            return AndroidUtilities.dp(100.0f);
        }
        return i10;
    }

    @Override
    public final int getMinimumWidth() {
        int i10 = 0;
        if (this.f27344x) {
            int[] iArr = this.d;
            int i11 = iArr[2];
            if (i11 != 90 && i11 != 270) {
                i10 = iArr[0];
            } else {
                i10 = iArr[1];
            }
        }
        if (i10 == 0) {
            return AndroidUtilities.dp(100.0f);
        }
        return i10;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h() {
        a6 a6Var;
        if (this.f27341v0 != null) {
            boolean isEmpty = this.f27333p0.isEmpty();
            if (isEmpty && this.F0 == null) {
                a6 a6Var2 = new a6(this, 1);
                this.F0 = a6Var2;
                AndroidUtilities.runOnUIThread(a6Var2, 600L);
            } else if (!isEmpty && (a6Var = this.F0) != null) {
                AndroidUtilities.cancelRunOnUIThread(a6Var);
                this.F0 = null;
            }
        }
    }

    public final void i() {
        int i10;
        if (this.X && !this.N0 && !this.f27322f) {
            if (!this.Q0 && (i10 = this.d[5]) > 0) {
                this.Q0 = true;
                this.M0 = 0;
                jf.j.d().b(this.O0, i10);
            }
        } else if (this.Q0) {
            this.Q0 = false;
            this.M0 = 0;
            jf.j.d().g(this.O0);
        }
    }

    @Override
    public final boolean isRunning() {
        return this.X;
    }

    public final void j() {
        ArrayList arrayList;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            arrayList = this.f27333p0;
            if (i10 >= arrayList.size()) {
                break;
            }
            ImageReceiver imageReceiver = (ImageReceiver) arrayList.get(i10);
            if (!imageReceiver.isAttachedToWindow()) {
                arrayList.remove(i10);
                i10--;
            }
            int i12 = imageReceiver.animatedFileDrawableRepeatMaxCount;
            if (i12 > 0 && this.f27340u0 >= i12) {
                i11++;
            }
            i10++;
        }
        if (arrayList.size() == i11) {
            stop();
        } else {
            start();
        }
    }

    public final void k() {
        if (!g()) {
            z5 z5Var = this.f27330n;
            if (z5Var != null) {
                z5Var.f35217b.recycle();
                Arrays.fill(z5Var.f35216a, (Object) null);
                this.f27330n = null;
            }
            z5 z5Var2 = this.v;
            if (z5Var2 != null) {
                z5Var2.f35217b.recycle();
                Arrays.fill(z5Var2.f35216a, (Object) null);
                this.v = null;
            }
            DispatchQueue dispatchQueue = this.f27316b0;
            if (dispatchQueue != null) {
                dispatchQueue.recycle();
                this.f27316b0 = null;
            }
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.h;
                if (i10 < arrayList.size()) {
                    z5 z5Var3 = (z5) arrayList.get(i10);
                    z5Var3.f35217b.recycle();
                    Arrays.fill(z5Var3.f35216a, (Object) null);
                    i10++;
                } else {
                    arrayList.clear();
                    t();
                    return;
                }
            }
        }
    }

    public final void l(android.graphics.Canvas r20, boolean r21, long r22, int r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.c6.l(android.graphics.Canvas, boolean, long, int):void");
    }

    public final Bitmap m() {
        z5 z5Var = this.f27330n;
        if (z5Var != null) {
            return z5Var.f35217b;
        }
        z5 z5Var2 = this.f27335r;
        if (z5Var2 != null) {
            return z5Var2.f35217b;
        }
        z5 z5Var3 = this.f27337s;
        if (z5Var3 != null) {
            return z5Var3.f35217b;
        }
        return null;
    }

    public final float n() {
        if (this.d[4] == 0) {
            return 0.0f;
        }
        if (this.I >= 0) {
            return ((float) this.I) / this.d[4];
        }
        int[] iArr = this.d;
        return iArr[3] / iArr[4];
    }

    public final int o() {
        int i10;
        if (this.I >= 0) {
            return (int) this.I;
        }
        z5 z5Var = this.f27335r;
        if (z5Var != null && (i10 = z5Var.f35219e) != 0) {
            return i10;
        }
        z5 z5Var2 = this.f27330n;
        if (z5Var2 != null) {
            return z5Var2.f35219e;
        }
        return 0;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.V = true;
    }

    public final Bitmap p() {
        int i10 = this.f27323f0;
        int i11 = this.f27321e0;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap createBitmap = Bitmap.createBitmap(i10, i11, config);
        Canvas canvas = new Canvas(createBitmap);
        AnimatedFileNative a2 = AnimatedFileNative.a(this.C.getAbsolutePath(), this.d, this.F, this.D, this.f27334q0, false);
        if (a2 == null) {
            return createBitmap;
        }
        if (this.I0 == null) {
            int[] iArr = this.d;
            this.I0 = Bitmap.createBitmap(Math.max(1, iArr[0]), Math.max(1, iArr[1]), config);
        }
        a2.c(this.I0, false, this.f27318c0, this.f27319d0, true);
        a2.f();
        createBitmap.eraseColor(0);
        canvas.save();
        float width = this.f27323f0 / this.I0.getWidth();
        canvas.scale(width, width);
        canvas.drawBitmap(this.I0, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
        return createBitmap;
    }

    public final Bitmap q(long j10, boolean z10) {
        int c3;
        if (this.f27344x && this.Z != null) {
            AnimatedFileDrawableStream animatedFileDrawableStream = this.f27334q0;
            if (animatedFileDrawableStream != null) {
                animatedFileDrawableStream.cancel(false);
                this.f27334q0.reset();
            }
            if (!z10) {
                this.Z.g(j10, z10);
            }
            int[] iArr = this.d;
            Bitmap createBitmap = Bitmap.createBitmap(iArr[0], iArr[1], Bitmap.Config.ARGB_8888);
            if (z10) {
                c3 = this.Z.b(createBitmap, j10);
            } else {
                c3 = this.Z.c(createBitmap, true, 0.0f, 0.0f, true);
            }
            if (c3 != 0) {
                return createBitmap;
            }
            createBitmap.recycle();
        }
        return null;
    }

    public final Bitmap r(boolean z10) {
        if (this.Z == null) {
            z5 z5Var = this.v;
            if (z5Var != null) {
                return z5Var.f35217b;
            }
            return null;
        }
        if (this.v == null) {
            if (!this.h.isEmpty()) {
                this.v = (z5) this.h.remove(0);
            } else {
                int[] iArr = this.d;
                float f9 = this.f27326i0;
                this.v = new z5(Bitmap.createBitmap((int) (iArr[0] * f9), (int) (iArr[1] * f9), Bitmap.Config.ARGB_8888));
            }
        }
        this.Z.c(this.v.f35217b, false, this.f27318c0, this.f27319d0, z10);
        return this.v.f35217b;
    }

    public final boolean s() {
        if (g()) {
            if (this.f27330n != null || this.f27335r != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void start() {
        if (!this.X && !this.f27333p0.isEmpty()) {
            this.X = true;
            this.N0 = false;
            x(false);
            AndroidUtilities.runOnUIThread(this.E0);
            AndroidUtilities.executeOnUIThread(new a6(this, 0));
        }
    }

    @Override
    public final void stop() {
        this.X = false;
        AndroidUtilities.executeOnUIThread(new a6(this, 0));
    }

    public final void t() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f27333p0;
            if (i10 < arrayList.size()) {
                ((ImageReceiver) arrayList.get(i10)).invalidate();
                i10++;
            } else {
                return;
            }
        }
    }

    public final void u() {
        if (!this.f27332o0.isEmpty()) {
            this.G = true;
            return;
        }
        int i10 = 0;
        this.X = false;
        this.Y = true;
        AndroidUtilities.executeOnUIThread(new a6(this, 0));
        if (this.f27348z0 != null) {
            jf.g.c();
            xi0.P0.cancelRunnable(this.f27348z0);
            this.f27348z0 = null;
        }
        if (this.f27320e == null) {
            if (this.Z != null) {
                this.Z.f();
                this.Z = null;
            }
            ArrayList arrayList = new ArrayList();
            z5 z5Var = this.f27330n;
            if (z5Var != null) {
                arrayList.add(z5Var.f35217b);
            }
            z5 z5Var2 = this.f27335r;
            if (z5Var2 != null) {
                arrayList.add(z5Var2.f35217b);
            }
            z5 z5Var3 = this.f27337s;
            if (z5Var3 != null) {
                arrayList.add(z5Var3.f35217b);
            }
            z5 z5Var4 = this.v;
            if (z5Var4 != null) {
                arrayList.add(z5Var4.f35217b);
            }
            ArrayList arrayList2 = this.h;
            int size = arrayList2.size();
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                z5 z5Var5 = (z5) obj;
                if (z5Var5 != null) {
                    arrayList.add(z5Var5.f35217b);
                }
            }
            this.h.clear();
            this.f27330n = null;
            this.f27335r = null;
            this.f27337s = null;
            this.v = null;
            DispatchQueue dispatchQueue = this.f27316b0;
            if (dispatchQueue != null) {
                dispatchQueue.recycle();
                this.f27316b0 = null;
            }
            getPaint().setShader(null);
            AndroidUtilities.recycleBitmaps(arrayList);
        } else {
            this.f27342w = true;
        }
        AnimatedFileDrawableStream animatedFileDrawableStream = this.f27334q0;
        if (animatedFileDrawableStream != null) {
            animatedFileDrawableStream.cancel(true);
            this.f27334q0 = null;
        }
        t();
    }

    public final void v(ImageReceiver imageReceiver) {
        ArrayList arrayList = this.f27333p0;
        arrayList.remove(imageReceiver);
        if (arrayList.isEmpty()) {
            this.f27340u0 = 0;
        }
        h();
    }

    public final void w(View view) {
        ArrayList arrayList = this.f27332o0;
        arrayList.remove(view);
        if (arrayList.isEmpty()) {
            if (this.G) {
                u();
                return;
            }
            int[] iArr = this.Q;
            if (iArr != null) {
                B(iArr);
            }
        }
    }

    public final void x(boolean z10) {
        a6 a6Var;
        a6 a6Var2;
        if (this.f27320e == null || z10) {
            if ((this.f27315b && (this.f27337s == null || (!this.G0 && this.I >= 0))) || this.f27335r == null) {
                if ((this.f27330n == null || !this.f27322f) && g() && !this.f27342w) {
                    if ((this.X || (this.f27346y && !this.A)) && !this.f27333p0.isEmpty() && !this.f27347y0) {
                        if (this.f27336r0) {
                            if (this.f27339t0) {
                                a6 a6Var3 = this.D0;
                                this.f27320e = a6Var3;
                                DispatchQueuePoolBackground.execute(a6Var3);
                            } else {
                                if (z10 && (a6Var2 = this.f27320e) != null) {
                                    S0.remove(a6Var2);
                                }
                                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = S0;
                                a6 a6Var4 = this.D0;
                                this.f27320e = a6Var4;
                                scheduledThreadPoolExecutor.execute(a6Var4);
                            }
                        } else {
                            if (this.f27316b0 == null) {
                                this.f27316b0 = new DispatchQueue("decodeQueue" + this);
                            }
                            if (z10 && (a6Var = this.f27320e) != null) {
                                this.f27316b0.cancelRunnable(a6Var);
                            }
                            DispatchQueue dispatchQueue = this.f27316b0;
                            a6 a6Var5 = this.D0;
                            this.f27320e = a6Var5;
                            dispatchQueue.postRunnable(a6Var5, 0L);
                        }
                        this.G0 = true;
                    }
                }
            }
        }
    }

    public final void y(long j10, boolean z10, boolean z11) {
        AnimatedFileDrawableStream animatedFileDrawableStream;
        int i10;
        synchronized (this.M) {
            try {
                this.H = j10;
                this.I = j10;
                this.G0 = false;
                if (this.Z != null) {
                    this.Z.e();
                }
                if (this.f27344x && (animatedFileDrawableStream = this.f27334q0) != null) {
                    animatedFileDrawableStream.cancel(z10);
                    this.J = z10;
                    if (z10) {
                        i10 = 0;
                    } else {
                        i10 = 10;
                    }
                    this.K = i10;
                }
                if (z11 && this.f27346y) {
                    this.A = false;
                    if (this.f27320e == null) {
                        x(true);
                    } else {
                        this.B = true;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void z(float f9, float f10, float f11, float f12) {
        float f13 = f12 + f10;
        float f14 = f11 + f9;
        RectF rectF = this.O;
        if (rectF.left == f9 && rectF.top == f10 && rectF.right == f14 && rectF.bottom == f13) {
            return;
        }
        rectF.set(f9, f10, f14, f13);
        this.f27338s0 = true;
    }

    public c6(java.io.File r19, boolean r20, long r21, int r23, org.telegram.tgnet.TLRPC.Document r24, org.telegram.messenger.ImageLocation r25, java.lang.Object r26, long r27, int r29, boolean r30, int r31, int r32, ie.i r33, int r34, boolean r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.c6.<init>(java.io.File, boolean, long, int, org.telegram.tgnet.TLRPC$Document, org.telegram.messenger.ImageLocation, java.lang.Object, long, int, boolean, int, int, ie.i, int, boolean):void");
    }
}
