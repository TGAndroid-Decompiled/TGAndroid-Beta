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
public final class y5 extends BitmapDrawable implements Animatable, lf.e {
    public static final float[] S0 = new float[8];
    public static final ScheduledThreadPoolExecutor T0 = new ScheduledThreadPoolExecutor(8, new ThreadPoolExecutor.DiscardPolicy());
    public static final PorterDuffXfermode U0 = new PorterDuffXfermode(PorterDuff.Mode.SRC);
    public w5 A0;
    public boolean B;
    public final w5 B0;
    public boolean C;
    public final w5 C0;
    public final File D;
    public int D0;
    public final long E;
    public final w5 E0;
    public final int F;
    public final w5 F0;
    public final int G;
    public w5 G0;
    public boolean H;
    public boolean H0;
    public volatile long I;
    public long I0;
    public volatile long J;
    public Bitmap J0;
    public boolean K;
    public AnimatedFileNative K0;
    public int L;
    public int L0;
    public boolean M;
    public int M0;
    public final Object N;
    public int N0;
    public boolean O;
    public volatile boolean O0;
    public final RectF P;
    public final x5 P0;
    public final int[] Q;
    public boolean Q0;
    public int[] R;
    public boolean R0;
    public final Matrix[] S;
    public final Path[] T;
    public float U;
    public float V;
    public boolean W;
    public final RectF X;
    public volatile boolean Y;
    public volatile boolean Z;
    public boolean f30849a;
    public volatile AnimatedFileNative f30850a0;
    public boolean f30851b;
    public boolean f30852b0;
    public int f30853c;
    public DispatchQueue f30854c0;
    public final int[] d;
    public float f30855d0;
    public w5 e;
    public float f30856e0;
    public boolean f30857f;
    public int f30858f0;
    public int f30859g0;
    public final ArrayList h;
    public final boolean f30860h0;
    public final boolean f30861i0;
    public float f30862j0;
    public boolean f30863k0;
    public final TLRPC.Document f30864l0;
    public final RectF[] m0;
    public v5 f30865n;
    public final Paint[] f30866n0;
    public View f30867o0;
    public final ArrayList f30868p0;
    public final ArrayList f30869q0;
    public v5 f30870r;
    public AnimatedFileDrawableStream f30871r0;
    public v5 f30872s;
    public boolean f30873s0;
    public boolean f30874t0;
    public boolean f30875u0;
    public v5 v;
    public int f30876v0;
    public boolean f30877w;
    public final lf.g f30878w0;
    public boolean f30879x;
    public c5.c f30880x0;
    public boolean f30881y;
    public final w5 f30882y0;
    public boolean f30883z0;

    public y5(File file, boolean z4, long j10, int i10, TLRPC.Document document, ImageLocation imageLocation, Object obj, long j11, int i11, boolean z10) {
        this(file, z4, j10, i10, document, imageLocation, obj, j11, i11, z10, 0, 0, null, document != null ? 1 : 0, true);
    }

    public final void A(boolean z4) {
        this.f30875u0 = z4;
        if (z4) {
            this.f30851b = false;
        }
    }

    public final void B(int[] iArr) {
        boolean isEmpty = this.f30868p0.isEmpty();
        int[] iArr2 = this.Q;
        if (!isEmpty) {
            if (this.R == null) {
                this.R = new int[4];
            }
            int[] iArr3 = this.R;
            System.arraycopy(iArr2, 0, iArr3, 0, iArr3.length);
        }
        for (int i10 = 0; i10 < 4; i10++) {
            if (!this.f30874t0 && iArr[i10] != iArr2[i10]) {
                this.f30874t0 = true;
            }
            iArr2[i10] = iArr[i10];
        }
    }

    public final void C(long j10, long j11) {
        this.f30855d0 = ((float) j10) / 1000.0f;
        this.f30856e0 = ((float) j11) / 1000.0f;
        if (j10 >= 0 && o() < j10) {
            y(j10, true, false);
        }
    }

    public final void D(long j10) {
        boolean z4;
        this.N0 = 0;
        if (this.O0) {
            this.O0 = false;
            AndroidUtilities.executeOnUIThread(new w5(this, 0));
        }
        if (!this.Q0 && (this.Y || !this.f30881y)) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (this.Y) {
            v5 v5Var = this.f30865n;
            if (v5Var == null && this.f30870r == null) {
                x(false);
            } else if (this.f30870r != null) {
                if (v5Var == null || (z4 && !this.f30849a && this.J < 0)) {
                    v5 v5Var2 = this.f30865n;
                    if (v5Var2 != null) {
                        this.h.add(v5Var2);
                    }
                    this.f30865n = this.f30870r;
                    this.f30870r = this.f30872s;
                    this.f30872s = null;
                    this.Q0 = false;
                    x(false);
                }
            }
        } else if (!this.Y && this.f30881y && z4 && this.f30870r != null) {
            v5 v5Var3 = this.f30865n;
            if (v5Var3 != null) {
                this.h.add(v5Var3);
            }
            this.f30865n = this.f30870r;
            this.f30870r = this.f30872s;
            this.f30872s = null;
            this.Q0 = false;
            x(false);
        }
    }

    public final void E() {
        int i10;
        int i11;
        int[] iArr;
        int i12;
        int i13;
        if (!this.f30863k0 && (i10 = this.f30858f0) > 0 && (i11 = this.f30859g0) > 0 && (i12 = (iArr = this.d)[0]) > 0 && (i13 = iArr[1]) > 0) {
            float max = Math.max(i11 / i12, i10 / i13);
            this.f30862j0 = max;
            if (max > 0.0f && max <= 0.7d) {
                return;
            }
            this.f30862j0 = 1.0f;
            return;
        }
        this.f30862j0 = 1.0f;
    }

    @Override
    public final int a(Bitmap bitmap) {
        int i10;
        if (this.K0 == null) {
            return -1;
        }
        Canvas canvas = new Canvas(bitmap);
        Bitmap bitmap2 = this.J0;
        int[] iArr = this.d;
        if (bitmap2 == null) {
            this.J0 = Bitmap.createBitmap(iArr[0], iArr[1], Bitmap.Config.ARGB_8888);
        }
        this.K0.c(this.J0, false, this.f30855d0, this.f30856e0, this.f30860h0);
        long j10 = this.I0;
        if (j10 != 0 && ((i10 = iArr[3]) == 0 || j10 > i10)) {
            return 0;
        }
        int i11 = this.M0;
        int i12 = iArr[3];
        if (i11 == i12) {
            int i13 = this.L0 + 1;
            this.L0 = i13;
            if (i13 > 5) {
                return 0;
            }
        }
        this.M0 = i12;
        bitmap.eraseColor(0);
        canvas.save();
        float width = this.f30859g0 / this.J0.getWidth();
        canvas.scale(width, width);
        canvas.drawBitmap(this.J0, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
        this.I0 = iArr[3];
        return 1;
    }

    @Override
    public final void b() {
        this.K0 = AnimatedFileNative.a(this.D.getAbsolutePath(), this.d, this.G, this.E, this.f30871r0, false);
    }

    @Override
    public final void c() {
        AnimatedFileNative animatedFileNative = this.K0;
        if (animatedFileNative != null) {
            animatedFileNative.f();
            this.K0 = null;
        }
    }

    public final void d() {
        int i10;
        if (this.f30859g0 == 0 && this.f30858f0 == 0) {
            int[] iArr = this.d;
            int i11 = iArr[0];
            if (i11 <= 3000 && (i10 = iArr[1]) <= 3000) {
                if (i11 > 2200 || i10 > 2200) {
                    this.f30859g0 = i11 / 2;
                    this.f30858f0 = i10 / 2;
                    return;
                }
                return;
            }
            this.f30859g0 = i11 / 4;
            this.f30858f0 = iArr[1] / 4;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        l(canvas, false, System.currentTimeMillis(), 0);
    }

    public final void e(ImageReceiver imageReceiver) {
        if (!this.f30869q0.contains(imageReceiver)) {
            this.f30869q0.add(imageReceiver);
            if (this.Y) {
                x(false);
            }
        }
        h();
    }

    public final void f(View view) {
        if (view != null) {
            ArrayList arrayList = this.f30868p0;
            if (!arrayList.contains(view)) {
                arrayList.add(view);
            }
        }
    }

    public final void finalize() {
        try {
            this.f30868p0.clear();
            u();
        } finally {
            super.finalize();
        }
    }

    public final boolean g() {
        if (this.f30861i0) {
            if (this.f30878w0 == null) {
                return false;
            }
            return true;
        } else if (this.f30850a0 == null && this.f30879x) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        int i10 = 0;
        if (this.f30879x) {
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
        return (int) (i10 * this.f30862j0);
    }

    @Override
    public final int getIntrinsicWidth() {
        int i10 = 0;
        if (this.f30879x) {
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
        return (int) (i10 * this.f30862j0);
    }

    @Override
    public final int getMinimumHeight() {
        int i10 = 0;
        if (this.f30879x) {
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
        if (this.f30879x) {
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
        w5 w5Var;
        if (this.f30878w0 != null) {
            boolean isEmpty = this.f30869q0.isEmpty();
            if (isEmpty && this.G0 == null) {
                w5 w5Var2 = new w5(this, 1);
                this.G0 = w5Var2;
                AndroidUtilities.runOnUIThread(w5Var2, 600L);
            } else if (!isEmpty && (w5Var = this.G0) != null) {
                AndroidUtilities.cancelRunOnUIThread(w5Var);
                this.G0 = null;
            }
        }
    }

    public final void i() {
        int i10;
        if (this.Y && !this.O0 && !this.f30857f) {
            if (!this.R0 && (i10 = this.d[5]) > 0) {
                this.R0 = true;
                this.N0 = 0;
                lf.j.d().b(this.P0, i10);
            }
        } else if (this.R0) {
            this.R0 = false;
            this.N0 = 0;
            lf.j.d().g(this.P0);
        }
    }

    @Override
    public final boolean isRunning() {
        return this.Y;
    }

    public final void j() {
        ArrayList arrayList;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            arrayList = this.f30869q0;
            if (i10 >= arrayList.size()) {
                break;
            }
            ImageReceiver imageReceiver = (ImageReceiver) arrayList.get(i10);
            if (!imageReceiver.isAttachedToWindow()) {
                arrayList.remove(i10);
                i10--;
            }
            int i12 = imageReceiver.animatedFileDrawableRepeatMaxCount;
            if (i12 > 0 && this.f30876v0 >= i12) {
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
            v5 v5Var = this.f30865n;
            if (v5Var != null) {
                v5Var.f29363b.recycle();
                Arrays.fill(v5Var.f29362a, (Object) null);
                this.f30865n = null;
            }
            v5 v5Var2 = this.v;
            if (v5Var2 != null) {
                v5Var2.f29363b.recycle();
                Arrays.fill(v5Var2.f29362a, (Object) null);
                this.v = null;
            }
            DispatchQueue dispatchQueue = this.f30854c0;
            if (dispatchQueue != null) {
                dispatchQueue.recycle();
                this.f30854c0 = null;
            }
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.h;
                if (i10 < arrayList.size()) {
                    v5 v5Var3 = (v5) arrayList.get(i10);
                    v5Var3.f29363b.recycle();
                    Arrays.fill(v5Var3.f29362a, (Object) null);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.y5.l(android.graphics.Canvas, boolean, long, int):void");
    }

    public final Bitmap m() {
        v5 v5Var = this.f30865n;
        if (v5Var != null) {
            return v5Var.f29363b;
        }
        v5 v5Var2 = this.f30870r;
        if (v5Var2 != null) {
            return v5Var2.f29363b;
        }
        v5 v5Var3 = this.f30872s;
        if (v5Var3 != null) {
            return v5Var3.f29363b;
        }
        return null;
    }

    public final float n() {
        if (this.d[4] == 0) {
            return 0.0f;
        }
        if (this.J >= 0) {
            return ((float) this.J) / this.d[4];
        }
        int[] iArr = this.d;
        return iArr[3] / iArr[4];
    }

    public final int o() {
        int i10;
        if (this.J >= 0) {
            return (int) this.J;
        }
        v5 v5Var = this.f30870r;
        if (v5Var != null && (i10 = v5Var.e) != 0) {
            return i10;
        }
        v5 v5Var2 = this.f30865n;
        if (v5Var2 != null) {
            return v5Var2.e;
        }
        return 0;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.W = true;
    }

    public final Bitmap p() {
        int i10 = this.f30859g0;
        int i11 = this.f30858f0;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap createBitmap = Bitmap.createBitmap(i10, i11, config);
        Canvas canvas = new Canvas(createBitmap);
        AnimatedFileNative a2 = AnimatedFileNative.a(this.D.getAbsolutePath(), this.d, this.G, this.E, this.f30871r0, false);
        if (a2 == null) {
            return createBitmap;
        }
        if (this.J0 == null) {
            int[] iArr = this.d;
            this.J0 = Bitmap.createBitmap(Math.max(1, iArr[0]), Math.max(1, iArr[1]), config);
        }
        a2.c(this.J0, false, this.f30855d0, this.f30856e0, true);
        a2.f();
        createBitmap.eraseColor(0);
        canvas.save();
        float width = this.f30859g0 / this.J0.getWidth();
        canvas.scale(width, width);
        canvas.drawBitmap(this.J0, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
        return createBitmap;
    }

    public final Bitmap q(long j10, boolean z4) {
        int c3;
        if (this.f30879x && this.f30850a0 != null) {
            AnimatedFileDrawableStream animatedFileDrawableStream = this.f30871r0;
            if (animatedFileDrawableStream != null) {
                animatedFileDrawableStream.cancel(false);
                this.f30871r0.reset();
            }
            if (!z4) {
                this.f30850a0.g(j10, z4);
            }
            int[] iArr = this.d;
            Bitmap createBitmap = Bitmap.createBitmap(iArr[0], iArr[1], Bitmap.Config.ARGB_8888);
            if (z4) {
                c3 = this.f30850a0.b(createBitmap, j10);
            } else {
                c3 = this.f30850a0.c(createBitmap, true, 0.0f, 0.0f, true);
            }
            if (c3 != 0) {
                return createBitmap;
            }
            createBitmap.recycle();
        }
        return null;
    }

    public final Bitmap r(boolean z4) {
        if (this.f30850a0 == null) {
            v5 v5Var = this.v;
            if (v5Var != null) {
                return v5Var.f29363b;
            }
            return null;
        }
        if (this.v == null) {
            if (!this.h.isEmpty()) {
                this.v = (v5) this.h.remove(0);
            } else {
                int[] iArr = this.d;
                float f10 = this.f30862j0;
                this.v = new v5(Bitmap.createBitmap((int) (iArr[0] * f10), (int) (iArr[1] * f10), Bitmap.Config.ARGB_8888));
            }
        }
        this.f30850a0.c(this.v.f29363b, false, this.f30855d0, this.f30856e0, z4);
        return this.v.f29363b;
    }

    public final boolean s() {
        if (g()) {
            if (this.f30865n != null || this.f30870r != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void start() {
        if (!this.Y && !this.f30869q0.isEmpty()) {
            this.Y = true;
            this.O0 = false;
            x(false);
            AndroidUtilities.runOnUIThread(this.F0);
            AndroidUtilities.executeOnUIThread(new w5(this, 0));
        }
    }

    @Override
    public final void stop() {
        this.Y = false;
        AndroidUtilities.executeOnUIThread(new w5(this, 0));
    }

    public final void t() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f30869q0;
            if (i10 < arrayList.size()) {
                ((ImageReceiver) arrayList.get(i10)).invalidate();
                i10++;
            } else {
                return;
            }
        }
    }

    public final void u() {
        if (!this.f30868p0.isEmpty()) {
            this.H = true;
            return;
        }
        int i10 = 0;
        this.Y = false;
        this.Z = true;
        AndroidUtilities.executeOnUIThread(new w5(this, 0));
        if (this.A0 != null) {
            lf.g.c();
            gj0.Q0.cancelRunnable(this.A0);
            this.A0 = null;
        }
        if (this.e == null) {
            if (this.f30850a0 != null) {
                this.f30850a0.f();
                this.f30850a0 = null;
            }
            ArrayList arrayList = new ArrayList();
            v5 v5Var = this.f30865n;
            if (v5Var != null) {
                arrayList.add(v5Var.f29363b);
            }
            v5 v5Var2 = this.f30870r;
            if (v5Var2 != null) {
                arrayList.add(v5Var2.f29363b);
            }
            v5 v5Var3 = this.f30872s;
            if (v5Var3 != null) {
                arrayList.add(v5Var3.f29363b);
            }
            v5 v5Var4 = this.v;
            if (v5Var4 != null) {
                arrayList.add(v5Var4.f29363b);
            }
            ArrayList arrayList2 = this.h;
            int size = arrayList2.size();
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                v5 v5Var5 = (v5) obj;
                if (v5Var5 != null) {
                    arrayList.add(v5Var5.f29363b);
                }
            }
            this.h.clear();
            this.f30865n = null;
            this.f30870r = null;
            this.f30872s = null;
            this.v = null;
            DispatchQueue dispatchQueue = this.f30854c0;
            if (dispatchQueue != null) {
                dispatchQueue.recycle();
                this.f30854c0 = null;
            }
            getPaint().setShader(null);
            AndroidUtilities.recycleBitmaps(arrayList);
        } else {
            this.f30877w = true;
        }
        AnimatedFileDrawableStream animatedFileDrawableStream = this.f30871r0;
        if (animatedFileDrawableStream != null) {
            animatedFileDrawableStream.cancel(true);
            this.f30871r0 = null;
        }
        t();
    }

    public final void v(ImageReceiver imageReceiver) {
        ArrayList arrayList = this.f30869q0;
        arrayList.remove(imageReceiver);
        if (arrayList.isEmpty()) {
            this.f30876v0 = 0;
        }
        h();
    }

    public final void w(View view) {
        ArrayList arrayList = this.f30868p0;
        arrayList.remove(view);
        if (arrayList.isEmpty()) {
            if (this.H) {
                u();
                return;
            }
            int[] iArr = this.R;
            if (iArr != null) {
                B(iArr);
            }
        }
    }

    public final void x(boolean z4) {
        w5 w5Var;
        w5 w5Var2;
        if (this.e == null || z4) {
            if ((this.f30851b && (this.f30872s == null || (!this.H0 && this.J >= 0))) || this.f30870r == null) {
                if ((this.f30865n == null || !this.f30857f) && g() && !this.f30877w) {
                    if ((this.Y || (this.f30881y && !this.B)) && !this.f30869q0.isEmpty() && !this.f30883z0) {
                        if (this.f30873s0) {
                            if (this.f30875u0) {
                                w5 w5Var3 = this.E0;
                                this.e = w5Var3;
                                DispatchQueuePoolBackground.execute(w5Var3);
                            } else {
                                if (z4 && (w5Var2 = this.e) != null) {
                                    T0.remove(w5Var2);
                                }
                                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = T0;
                                w5 w5Var4 = this.E0;
                                this.e = w5Var4;
                                scheduledThreadPoolExecutor.execute(w5Var4);
                            }
                        } else {
                            if (this.f30854c0 == null) {
                                this.f30854c0 = new DispatchQueue("decodeQueue" + this);
                            }
                            if (z4 && (w5Var = this.e) != null) {
                                this.f30854c0.cancelRunnable(w5Var);
                            }
                            DispatchQueue dispatchQueue = this.f30854c0;
                            w5 w5Var5 = this.E0;
                            this.e = w5Var5;
                            dispatchQueue.postRunnable(w5Var5, 0L);
                        }
                        this.H0 = true;
                    }
                }
            }
        }
    }

    public final void y(long j10, boolean z4, boolean z10) {
        AnimatedFileDrawableStream animatedFileDrawableStream;
        int i10;
        synchronized (this.N) {
            try {
                this.I = j10;
                this.J = j10;
                this.H0 = false;
                if (this.f30850a0 != null) {
                    this.f30850a0.e();
                }
                if (this.f30879x && (animatedFileDrawableStream = this.f30871r0) != null) {
                    animatedFileDrawableStream.cancel(z4);
                    this.K = z4;
                    if (z4) {
                        i10 = 0;
                    } else {
                        i10 = 10;
                    }
                    this.L = i10;
                }
                if (z10 && this.f30881y) {
                    this.B = false;
                    if (this.e == null) {
                        x(true);
                    } else {
                        this.C = true;
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
        RectF rectF = this.P;
        if (rectF.left == f10 && rectF.top == f11 && rectF.right == f15 && rectF.bottom == f14) {
            return;
        }
        rectF.set(f10, f11, f15, f14);
        this.f30874t0 = true;
    }

    public y5(java.io.File r19, boolean r20, long r21, int r23, org.telegram.tgnet.TLRPC.Document r24, org.telegram.messenger.ImageLocation r25, java.lang.Object r26, long r27, int r29, boolean r30, int r31, int r32, ke.i r33, int r34, boolean r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.y5.<init>(java.io.File, boolean, long, int, org.telegram.tgnet.TLRPC$Document, org.telegram.messenger.ImageLocation, java.lang.Object, long, int, boolean, int, int, ke.i, int, boolean):void");
    }
}
