package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
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
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;

public final class x5 extends BitmapDrawable implements Animatable, gf.f {
    public static final float[] R0 = new float[8];
    public static final ScheduledThreadPoolExecutor S0 = new ScheduledThreadPoolExecutor(8, new ThreadPoolExecutor.DiscardPolicy());
    public static final PorterDuffXfermode T0 = new PorterDuffXfermode(PorterDuff.Mode.SRC);
    public boolean A;
    public final v5 A0;
    public boolean B;
    public final v5 B0;
    public final File C;
    public int C0;
    public final long D;
    public final v5 D0;
    public final int E;
    public final v5 E0;
    public final int F;
    public v5 F0;
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
    public final w5 O0;
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

    public boolean f34467a;

    public boolean f34468a0;

    public boolean f34469b;

    public DispatchQueue f34470b0;

    public int f34471c;

    public float f34472c0;
    public final int[] d;

    public float f34473d0;

    public v5 f34474e;

    public int f34475e0;

    public boolean f34476f;

    public int f34477f0;

    public final boolean f34478g0;
    public final ArrayList h;

    public final boolean f34479h0;

    public float f34480i0;

    public boolean f34481j0;

    public final TLRPC.Document f34482k0;

    public final RectF[] f34483l0;
    public final Paint[] m0;

    public u5 f34484n;

    public View f34485n0;

    public final ArrayList f34486o0;

    public final ArrayList f34487p0;

    public AnimatedFileDrawableStream f34488q0;

    public u5 f34489r;

    public boolean f34490r0;

    public u5 f34491s;

    public boolean f34492s0;

    public boolean f34493t0;

    public int f34494u0;
    public u5 v;

    public final gf.h f34495v0;

    public boolean f34496w;

    public com.google.android.gms.internal.cast.a f34497w0;

    public boolean f34498x;

    public final v5 f34499x0;

    public boolean f34500y;

    public boolean f34501y0;

    public v5 f34502z0;

    public x5(File file, boolean z10, long j10, int i10, TLRPC.Document document, ImageLocation imageLocation, Object obj, long j11, int i11, boolean z11) {
        this(file, z10, j10, i10, document, imageLocation, obj, j11, i11, z11, 0, 0, null, document != null ? 1 : 0, true);
    }

    public final void A(boolean z10) {
        this.f34493t0 = z10;
        if (z10) {
            this.f34469b = false;
        }
    }

    public final void B(int[] iArr) {
        boolean zIsEmpty = this.f34486o0.isEmpty();
        int[] iArr2 = this.P;
        if (!zIsEmpty) {
            if (this.Q == null) {
                this.Q = new int[4];
            }
            int[] iArr3 = this.Q;
            System.arraycopy(iArr2, 0, iArr3, 0, iArr3.length);
        }
        for (int i10 = 0; i10 < 4; i10++) {
            if (!this.f34492s0 && iArr[i10] != iArr2[i10]) {
                this.f34492s0 = true;
            }
            iArr2[i10] = iArr[i10];
        }
    }

    public final void C(long j10, long j11) {
        this.f34472c0 = j10 / 1000.0f;
        this.f34473d0 = j11 / 1000.0f;
        if (j10 < 0 || o() >= j10) {
            return;
        }
        y(j10, true, false);
    }

    public final void D(long j10) {
        this.M0 = 0;
        if (this.N0) {
            this.N0 = false;
            AndroidUtilities.executeOnUIThread(new v5(this, 0));
        }
        boolean z10 = this.P0 || (!this.X && this.f34500y);
        if (!this.X) {
            if (this.X || !this.f34500y || !z10 || this.f34489r == null) {
                return;
            }
            u5 u5Var = this.f34484n;
            if (u5Var != null) {
                this.h.add(u5Var);
            }
            this.f34484n = this.f34489r;
            this.f34489r = this.f34491s;
            this.f34491s = null;
            this.P0 = false;
            x(false);
            return;
        }
        u5 u5Var2 = this.f34484n;
        if (u5Var2 == null && this.f34489r == null) {
            x(false);
            return;
        }
        if (this.f34489r != null) {
            if (u5Var2 == null || (z10 && !this.f34467a && this.I < 0)) {
                u5 u5Var3 = this.f34484n;
                if (u5Var3 != null) {
                    this.h.add(u5Var3);
                }
                this.f34484n = this.f34489r;
                this.f34489r = this.f34491s;
                this.f34491s = null;
                this.P0 = false;
                x(false);
            }
        }
    }

    public final void E() {
        int i10;
        int i11;
        int[] iArr;
        int i12;
        int i13;
        if (this.f34481j0 || (i10 = this.f34475e0) <= 0 || (i11 = this.f34477f0) <= 0 || (i12 = (iArr = this.d)[0]) <= 0 || (i13 = iArr[1]) <= 0) {
            this.f34480i0 = 1.0f;
            return;
        }
        float fMax = Math.max(i11 / i12, i10 / i13);
        this.f34480i0 = fMax;
        if (fMax <= 0.0f || fMax > 0.7d) {
            this.f34480i0 = 1.0f;
        }
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
        this.J0.c(this.I0, false, this.f34472c0, this.f34473d0, this.f34478g0);
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
        float width = this.f34477f0 / this.I0.getWidth();
        canvas.scale(width, width);
        canvas.drawBitmap(this.I0, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
        this.H0 = iArr[3];
        return 1;
    }

    @Override
    public final void b() {
        this.J0 = AnimatedFileNative.a(this.C.getAbsolutePath(), this.d, this.F, this.D, this.f34488q0, false);
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
        if (this.f34477f0 == 0 && this.f34475e0 == 0) {
            int[] iArr = this.d;
            int i11 = iArr[0];
            if (i11 > 3000 || (i10 = iArr[1]) > 3000) {
                this.f34477f0 = i11 / 4;
                this.f34475e0 = iArr[1] / 4;
            } else if (i11 > 2200 || i10 > 2200) {
                this.f34477f0 = i11 / 2;
                this.f34475e0 = i10 / 2;
            }
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        l(canvas, false, System.currentTimeMillis(), 0);
    }

    public final void e(ImageReceiver imageReceiver) {
        if (!this.f34487p0.contains(imageReceiver)) {
            this.f34487p0.add(imageReceiver);
            if (this.X) {
                x(false);
            }
        }
        h();
    }

    public final void f(View view) {
        if (view != null) {
            ArrayList arrayList = this.f34486o0;
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
        }
    }

    public final void finalize() throws Throwable {
        try {
            this.f34486o0.clear();
            u();
        } finally {
            super.finalize();
        }
    }

    public final boolean g() {
        if (this.f34479h0) {
            return this.f34495v0 != null;
        }
        return (this.Z == null && this.f34498x) ? false : true;
    }

    @Override
    public final int getIntrinsicHeight() {
        int i10 = 0;
        if (this.f34498x) {
            int[] iArr = this.d;
            int i11 = iArr[2];
            i10 = (i11 == 90 || i11 == 270) ? iArr[0] : iArr[1];
        }
        return i10 == 0 ? AndroidUtilities.dp(100.0f) : (int) (i10 * this.f34480i0);
    }

    @Override
    public final int getIntrinsicWidth() {
        int i10 = 0;
        if (this.f34498x) {
            int[] iArr = this.d;
            int i11 = iArr[2];
            i10 = (i11 == 90 || i11 == 270) ? iArr[1] : iArr[0];
        }
        return i10 == 0 ? AndroidUtilities.dp(100.0f) : (int) (i10 * this.f34480i0);
    }

    @Override
    public final int getMinimumHeight() {
        int i10 = 0;
        if (this.f34498x) {
            int[] iArr = this.d;
            int i11 = iArr[2];
            i10 = (i11 == 90 || i11 == 270) ? iArr[0] : iArr[1];
        }
        return i10 == 0 ? AndroidUtilities.dp(100.0f) : i10;
    }

    @Override
    public final int getMinimumWidth() {
        int i10 = 0;
        if (this.f34498x) {
            int[] iArr = this.d;
            int i11 = iArr[2];
            i10 = (i11 == 90 || i11 == 270) ? iArr[1] : iArr[0];
        }
        return i10 == 0 ? AndroidUtilities.dp(100.0f) : i10;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h() {
        v5 v5Var;
        if (this.f34495v0 == null) {
            return;
        }
        boolean zIsEmpty = this.f34487p0.isEmpty();
        if (zIsEmpty && this.F0 == null) {
            v5 v5Var2 = new v5(this, 1);
            this.F0 = v5Var2;
            AndroidUtilities.runOnUIThread(v5Var2, 600L);
        } else {
            if (zIsEmpty || (v5Var = this.F0) == null) {
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(v5Var);
            this.F0 = null;
        }
    }

    public final void i() {
        int i10;
        if (!this.X || this.N0 || this.f34476f) {
            if (this.Q0) {
                this.Q0 = false;
                this.M0 = 0;
                gf.k.d().f(this.O0);
                return;
            }
            return;
        }
        if (this.Q0 || (i10 = this.d[5]) <= 0) {
            return;
        }
        this.Q0 = true;
        this.M0 = 0;
        gf.k.d().b(this.O0, i10);
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
            arrayList = this.f34487p0;
            if (i10 >= arrayList.size()) {
                break;
            }
            ImageReceiver imageReceiver = (ImageReceiver) arrayList.get(i10);
            if (!imageReceiver.isAttachedToWindow()) {
                arrayList.remove(i10);
                i10--;
            }
            int i12 = imageReceiver.animatedFileDrawableRepeatMaxCount;
            if (i12 > 0 && this.f34494u0 >= i12) {
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
        if (g()) {
            return;
        }
        u5 u5Var = this.f34484n;
        if (u5Var != null) {
            u5Var.f32971b.recycle();
            Arrays.fill(u5Var.f32970a, (Object) null);
            this.f34484n = null;
        }
        u5 u5Var2 = this.v;
        if (u5Var2 != null) {
            u5Var2.f32971b.recycle();
            Arrays.fill(u5Var2.f32970a, (Object) null);
            this.v = null;
        }
        DispatchQueue dispatchQueue = this.f34470b0;
        if (dispatchQueue != null) {
            dispatchQueue.recycle();
            this.f34470b0 = null;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 >= arrayList.size()) {
                arrayList.clear();
                t();
                return;
            } else {
                u5 u5Var3 = (u5) arrayList.get(i10);
                u5Var3.f32971b.recycle();
                Arrays.fill(u5Var3.f32970a, (Object) null);
                i10++;
            }
        }
    }

    public final void l(Canvas canvas, boolean z10, long j10, int i10) {
        boolean z11;
        float fWidth;
        float fHeight;
        int i11;
        int i12;
        u5 u5Var;
        BitmapShader[] bitmapShaderArr;
        Matrix[] matrixArr;
        Matrix matrix;
        int i13;
        Path[] pathArr;
        Path path;
        boolean z12;
        RectF rectF;
        int i14;
        int length;
        float[] fArr;
        RectF rectF2;
        int i15;
        int i16;
        int i17;
        if (!g() || this.f34496w) {
            return;
        }
        long jCurrentTimeMillis = j10 == 0 ? System.currentTimeMillis() : j10;
        RectF rectF3 = z10 ? this.f34483l0[i10] : this.W;
        Paint paint = z10 ? this.m0[i10] : getPaint();
        if (!z10) {
            D(jCurrentTimeMillis);
        }
        if (this.f34484n == null) {
            return;
        }
        int[] iArr = this.P;
        int length2 = iArr.length;
        int i18 = 0;
        while (true) {
            if (i18 >= length2) {
                z11 = false;
                break;
            } else {
                if (iArr[i18] != 0) {
                    z11 = true;
                    break;
                }
                i18++;
            }
        }
        if (!z10) {
            PorterDuffXfermode porterDuffXfermode = (!z11 && this.f34484n.f32974f && paint.getAlpha() == 255) ? T0 : null;
            if (paint.getXfermode() != porterDuffXfermode) {
                paint.setXfermode(porterDuffXfermode);
            }
        }
        float f10 = this.T;
        float f11 = this.U;
        int[] iArr2 = this.d;
        if (!z10) {
            if (this.V) {
                u5 u5Var2 = this.f34484n;
                int i19 = u5Var2.f32972c;
                int i20 = u5Var2.d;
                int i21 = iArr2[2];
                if (i21 == 90 || i21 == 270) {
                    i19 = i20;
                    i20 = i19;
                }
                rectF3.set(getBounds());
                fWidth = rectF3.width() / i19;
                this.T = fWidth;
                fHeight = rectF3.height() / i20;
                this.U = fHeight;
                this.V = false;
            }
            if (z11) {
                canvas.save();
                canvas.translate(rectF3.left, rectF3.top);
                i11 = iArr2[2];
                if (i11 == 90) {
                    canvas.rotate(90.0f);
                    canvas.translate(0.0f, -rectF3.width());
                } else if (i11 == 180) {
                    canvas.rotate(180.0f);
                    canvas.translate(-rectF3.width(), -rectF3.height());
                } else if (i11 == 270) {
                    canvas.rotate(270.0f);
                    canvas.translate(-rectF3.height(), 0.0f);
                }
                canvas.scale(f10, f11);
                canvas.drawBitmap(this.f34484n.f32971b, 0.0f, 0.0f, paint);
                canvas.restore();
                return;
            }
            if (z10) {
                i12 = i10 + 1;
            } else {
                i12 = 0;
            }
            u5Var = this.f34484n;
            bitmapShaderArr = u5Var.f32970a;
            if (bitmapShaderArr[i12] == null) {
                Bitmap bitmap = u5Var.f32971b;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                bitmapShaderArr[i12] = new BitmapShader(bitmap, tileMode, tileMode);
            }
            BitmapShader bitmapShader = bitmapShaderArr[i12];
            paint.setShader(bitmapShader);
            matrixArr = this.R;
            matrix = matrixArr[i12];
            if (matrix == null) {
                matrix = new Matrix();
                matrixArr[i12] = matrix;
            }
            matrix.reset();
            matrix.setTranslate(rectF3.left, rectF3.top);
            i13 = iArr2[2];
            if (i13 == 90) {
                matrix.preRotate(90.0f);
                matrix.preTranslate(0.0f, -rectF3.width());
            } else if (i13 == 180) {
                matrix.preRotate(180.0f);
                matrix.preTranslate(-rectF3.width(), -rectF3.height());
            } else if (i13 == 270) {
                matrix.preRotate(270.0f);
                matrix.preTranslate(-rectF3.height(), 0.0f);
            }
            matrix.preScale(f10, f11);
            bitmapShader.setLocalMatrix(matrix);
            pathArr = this.S;
            path = pathArr[i12];
            if (path == null) {
                path = new Path();
                pathArr[i12] = path;
            }
            z12 = this.f34492s0;
            rectF = this.O;
            if (z12 || z10) {
                if (!z10) {
                    this.f34492s0 = false;
                }
                i14 = 0;
                while (true) {
                    length = iArr.length;
                    fArr = R0;
                    if (i14 >= length) {
                        break;
                    }
                    int i22 = i14 * 2;
                    float f12 = iArr[i14];
                    fArr[i22] = f12;
                    fArr[i22 + 1] = f12;
                    i14++;
                }
                path.rewind();
                if (z10) {
                    rectF2 = rectF3;
                } else {
                    rectF2 = rectF;
                }
                path.addRoundRect(rectF2, fArr, Path.Direction.CW);
            }
            i15 = iArr[0];
            i16 = iArr[1];
            if (i15 == i16 || i16 != (i17 = iArr[2]) || i17 != iArr[3]) {
                canvas.drawPath(path, paint);
            }
            if (!z10) {
                rectF3 = rectF;
            }
            float f13 = i15;
            canvas.drawRoundRect(rectF3, f13, f13, paint);
            return;
        }
        u5 u5Var3 = this.f34484n;
        int i23 = u5Var3.f32972c;
        int i24 = u5Var3.d;
        int i25 = iArr2[2];
        if (i25 == 90 || i25 == 270) {
            i23 = i24;
            i24 = i23;
        }
        fWidth = rectF3.width() / i23;
        fHeight = rectF3.height() / i24;
        float f14 = fWidth;
        f11 = fHeight;
        f10 = f14;
        if (z11) {
            canvas.save();
            canvas.translate(rectF3.left, rectF3.top);
            i11 = iArr2[2];
            if (i11 == 90) {
                canvas.rotate(90.0f);
                canvas.translate(0.0f, -rectF3.width());
            } else if (i11 == 180) {
                canvas.rotate(180.0f);
                canvas.translate(-rectF3.width(), -rectF3.height());
            } else if (i11 == 270) {
                canvas.rotate(270.0f);
                canvas.translate(-rectF3.height(), 0.0f);
            }
            canvas.scale(f10, f11);
            canvas.drawBitmap(this.f34484n.f32971b, 0.0f, 0.0f, paint);
            canvas.restore();
            return;
        }
        if (z10) {
            i12 = i10 + 1;
        } else {
            i12 = 0;
        }
        u5Var = this.f34484n;
        bitmapShaderArr = u5Var.f32970a;
        if (bitmapShaderArr[i12] == null) {
            Bitmap bitmap2 = u5Var.f32971b;
            Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
            bitmapShaderArr[i12] = new BitmapShader(bitmap2, tileMode2, tileMode2);
        }
        BitmapShader bitmapShader2 = bitmapShaderArr[i12];
        paint.setShader(bitmapShader2);
        matrixArr = this.R;
        matrix = matrixArr[i12];
        if (matrix == null) {
            matrix = new Matrix();
            matrixArr[i12] = matrix;
        }
        matrix.reset();
        matrix.setTranslate(rectF3.left, rectF3.top);
        i13 = iArr2[2];
        if (i13 == 90) {
            matrix.preRotate(90.0f);
            matrix.preTranslate(0.0f, -rectF3.width());
        } else if (i13 == 180) {
            matrix.preRotate(180.0f);
            matrix.preTranslate(-rectF3.width(), -rectF3.height());
        } else if (i13 == 270) {
            matrix.preRotate(270.0f);
            matrix.preTranslate(-rectF3.height(), 0.0f);
        }
        matrix.preScale(f10, f11);
        bitmapShader2.setLocalMatrix(matrix);
        pathArr = this.S;
        path = pathArr[i12];
        if (path == null) {
            path = new Path();
            pathArr[i12] = path;
        }
        z12 = this.f34492s0;
        rectF = this.O;
        if (z12) {
            if (!z10) {
                this.f34492s0 = false;
            }
            i14 = 0;
            while (true) {
                length = iArr.length;
                fArr = R0;
                if (i14 >= length) {
                    break;
                    break;
                }
                int i26 = i14 * 2;
                float f15 = iArr[i14];
                fArr[i26] = f15;
                fArr[i26 + 1] = f15;
                i14++;
            }
            path.rewind();
            if (z10) {
                rectF2 = rectF3;
            } else {
                rectF2 = rectF;
            }
            path.addRoundRect(rectF2, fArr, Path.Direction.CW);
        } else {
            if (!z10) {
                this.f34492s0 = false;
            }
            i14 = 0;
            while (true) {
                length = iArr.length;
                fArr = R0;
                if (i14 >= length) {
                    break;
                    break;
                }
                int i27 = i14 * 2;
                float f16 = iArr[i14];
                fArr[i27] = f16;
                fArr[i27 + 1] = f16;
                i14++;
            }
            path.rewind();
            if (z10) {
                rectF2 = rectF3;
            } else {
                rectF2 = rectF;
            }
            path.addRoundRect(rectF2, fArr, Path.Direction.CW);
        }
        i15 = iArr[0];
        i16 = iArr[1];
        if (i15 == i16) {
        }
        canvas.drawPath(path, paint);
    }

    public final Bitmap m() {
        u5 u5Var = this.f34484n;
        if (u5Var != null) {
            return u5Var.f32971b;
        }
        u5 u5Var2 = this.f34489r;
        if (u5Var2 != null) {
            return u5Var2.f32971b;
        }
        u5 u5Var3 = this.f34491s;
        if (u5Var3 != null) {
            return u5Var3.f32971b;
        }
        return null;
    }

    public final float n() {
        if (this.d[4] == 0) {
            return 0.0f;
        }
        if (this.I >= 0) {
            return this.I / this.d[4];
        }
        int[] iArr = this.d;
        return iArr[3] / iArr[4];
    }

    public final int o() {
        int i10;
        if (this.I >= 0) {
            return (int) this.I;
        }
        u5 u5Var = this.f34489r;
        if (u5Var != null && (i10 = u5Var.f32973e) != 0) {
            return i10;
        }
        u5 u5Var2 = this.f34484n;
        if (u5Var2 != null) {
            return u5Var2.f32973e;
        }
        return 0;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.V = true;
    }

    public final Bitmap p() {
        int i10 = this.f34477f0;
        int i11 = this.f34475e0;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        AnimatedFileNative animatedFileNativeA = AnimatedFileNative.a(this.C.getAbsolutePath(), this.d, this.F, this.D, this.f34488q0, false);
        if (animatedFileNativeA == null) {
            return bitmapCreateBitmap;
        }
        if (this.I0 == null) {
            int[] iArr = this.d;
            this.I0 = Bitmap.createBitmap(Math.max(1, iArr[0]), Math.max(1, iArr[1]), config);
        }
        animatedFileNativeA.c(this.I0, false, this.f34472c0, this.f34473d0, true);
        animatedFileNativeA.f();
        bitmapCreateBitmap.eraseColor(0);
        canvas.save();
        float width = this.f34477f0 / this.I0.getWidth();
        canvas.scale(width, width);
        canvas.drawBitmap(this.I0, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
        return bitmapCreateBitmap;
    }

    public final Bitmap q(long j10, boolean z10) {
        if (this.f34498x && this.Z != null) {
            AnimatedFileDrawableStream animatedFileDrawableStream = this.f34488q0;
            if (animatedFileDrawableStream != null) {
                animatedFileDrawableStream.cancel(false);
                this.f34488q0.reset();
            }
            if (!z10) {
                this.Z.g(j10, z10);
            }
            int[] iArr = this.d;
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr[0], iArr[1], Bitmap.Config.ARGB_8888);
            if ((z10 ? this.Z.b(bitmapCreateBitmap, j10) : this.Z.c(bitmapCreateBitmap, true, 0.0f, 0.0f, true)) != 0) {
                return bitmapCreateBitmap;
            }
            bitmapCreateBitmap.recycle();
        }
        return null;
    }

    public final Bitmap r(boolean z10) {
        if (this.Z == null) {
            u5 u5Var = this.v;
            if (u5Var != null) {
                return u5Var.f32971b;
            }
            return null;
        }
        if (this.v == null) {
            if (this.h.isEmpty()) {
                int[] iArr = this.d;
                float f10 = iArr[0];
                float f11 = this.f34480i0;
                this.v = new u5(Bitmap.createBitmap((int) (f10 * f11), (int) (iArr[1] * f11), Bitmap.Config.ARGB_8888));
            } else {
                this.v = (u5) this.h.remove(0);
            }
        }
        this.Z.c(this.v.f32971b, false, this.f34472c0, this.f34473d0, z10);
        return this.v.f32971b;
    }

    public final boolean s() {
        if (g()) {
            return (this.f34484n == null && this.f34489r == null) ? false : true;
        }
        return false;
    }

    @Override
    public final void start() {
        if (this.X || this.f34487p0.isEmpty()) {
            return;
        }
        this.X = true;
        this.N0 = false;
        x(false);
        AndroidUtilities.runOnUIThread(this.E0);
        AndroidUtilities.executeOnUIThread(new v5(this, 0));
    }

    @Override
    public final void stop() {
        this.X = false;
        AndroidUtilities.executeOnUIThread(new v5(this, 0));
    }

    public final void t() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f34487p0;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((ImageReceiver) arrayList.get(i10)).invalidate();
            i10++;
        }
    }

    public final void u() {
        if (!this.f34486o0.isEmpty()) {
            this.G = true;
            return;
        }
        int i10 = 0;
        this.X = false;
        this.Y = true;
        AndroidUtilities.executeOnUIThread(new v5(this, 0));
        if (this.f34502z0 != null) {
            gf.h.c();
            oi0.P0.cancelRunnable(this.f34502z0);
            this.f34502z0 = null;
        }
        if (this.f34474e == null) {
            if (this.Z != null) {
                this.Z.f();
                this.Z = null;
            }
            ArrayList arrayList = new ArrayList();
            u5 u5Var = this.f34484n;
            if (u5Var != null) {
                arrayList.add(u5Var.f32971b);
            }
            u5 u5Var2 = this.f34489r;
            if (u5Var2 != null) {
                arrayList.add(u5Var2.f32971b);
            }
            u5 u5Var3 = this.f34491s;
            if (u5Var3 != null) {
                arrayList.add(u5Var3.f32971b);
            }
            u5 u5Var4 = this.v;
            if (u5Var4 != null) {
                arrayList.add(u5Var4.f32971b);
            }
            ArrayList arrayList2 = this.h;
            int size = arrayList2.size();
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                u5 u5Var5 = (u5) obj;
                if (u5Var5 != null) {
                    arrayList.add(u5Var5.f32971b);
                }
            }
            this.h.clear();
            this.f34484n = null;
            this.f34489r = null;
            this.f34491s = null;
            this.v = null;
            DispatchQueue dispatchQueue = this.f34470b0;
            if (dispatchQueue != null) {
                dispatchQueue.recycle();
                this.f34470b0 = null;
            }
            getPaint().setShader(null);
            AndroidUtilities.recycleBitmaps(arrayList);
        } else {
            this.f34496w = true;
        }
        AnimatedFileDrawableStream animatedFileDrawableStream = this.f34488q0;
        if (animatedFileDrawableStream != null) {
            animatedFileDrawableStream.cancel(true);
            this.f34488q0 = null;
        }
        t();
    }

    public final void v(ImageReceiver imageReceiver) {
        ArrayList arrayList = this.f34487p0;
        arrayList.remove(imageReceiver);
        if (arrayList.isEmpty()) {
            this.f34494u0 = 0;
        }
        h();
    }

    public final void w(View view) {
        ArrayList arrayList = this.f34486o0;
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
        v5 v5Var;
        v5 v5Var2;
        if (this.f34474e == null || z10) {
            if ((!this.f34469b || (this.f34491s != null && (this.G0 || this.I < 0))) && this.f34489r != null) {
                return;
            }
            if ((this.f34484n == null || !this.f34476f) && g() && !this.f34496w) {
                if ((!this.X && (!this.f34500y || this.A)) || this.f34487p0.isEmpty() || this.f34501y0) {
                    return;
                }
                if (!this.f34490r0) {
                    if (this.f34470b0 == null) {
                        this.f34470b0 = new DispatchQueue("decodeQueue" + this);
                    }
                    if (z10 && (v5Var = this.f34474e) != null) {
                        this.f34470b0.cancelRunnable(v5Var);
                    }
                    DispatchQueue dispatchQueue = this.f34470b0;
                    v5 v5Var3 = this.D0;
                    this.f34474e = v5Var3;
                    dispatchQueue.postRunnable(v5Var3, 0L);
                } else if (this.f34493t0) {
                    v5 v5Var4 = this.D0;
                    this.f34474e = v5Var4;
                    DispatchQueuePoolBackground.execute(v5Var4);
                } else {
                    if (z10 && (v5Var2 = this.f34474e) != null) {
                        S0.remove(v5Var2);
                    }
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = S0;
                    v5 v5Var5 = this.D0;
                    this.f34474e = v5Var5;
                    scheduledThreadPoolExecutor.execute(v5Var5);
                }
                this.G0 = true;
            }
        }
    }

    public final void y(long j10, boolean z10, boolean z11) {
        AnimatedFileDrawableStream animatedFileDrawableStream;
        synchronized (this.M) {
            try {
                this.H = j10;
                this.I = j10;
                this.G0 = false;
                if (this.Z != null) {
                    this.Z.e();
                }
                if (this.f34498x && (animatedFileDrawableStream = this.f34488q0) != null) {
                    animatedFileDrawableStream.cancel(z10);
                    this.J = z10;
                    this.K = z10 ? 0 : 10;
                }
                if (z11 && this.f34500y) {
                    this.A = false;
                    if (this.f34474e == null) {
                        x(true);
                    } else {
                        this.B = true;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void z(float f10, float f11, float f12, float f13) {
        float f14 = f13 + f11;
        float f15 = f12 + f10;
        RectF rectF = this.O;
        if (rectF.left == f10 && rectF.top == f11 && rectF.right == f15 && rectF.bottom == f14) {
            return;
        }
        rectF.set(f10, f11, f15, f14);
        this.f34492s0 = true;
    }

    public x5(File file, boolean z10, long j10, int i10, TLRPC.Document document, ImageLocation imageLocation, Object obj, long j11, int i11, boolean z11, int i12, int i13, ge.i iVar, int i14, boolean z12) {
        char c10;
        char c11;
        boolean z13;
        int[] iArr = new int[8];
        this.d = iArr;
        this.h = new ArrayList();
        this.H = -1L;
        this.I = -1L;
        this.M = new Object();
        this.O = new RectF();
        this.P = new int[4];
        this.R = new Matrix[3];
        this.S = new Path[3];
        this.T = 1.0f;
        this.U = 1.0f;
        this.W = new RectF();
        this.f34480i0 = 1.0f;
        this.f34483l0 = new RectF[2];
        this.m0 = new Paint[2];
        this.f34486o0 = new ArrayList();
        this.f34487p0 = new ArrayList();
        this.f34492s0 = true;
        this.f34499x0 = new v5(this, 2);
        this.A0 = new v5(this, 3);
        this.B0 = new v5(this, 4);
        this.C0 = 0;
        this.D0 = new v5(this, 5);
        this.E0 = new v5(this, 6);
        this.O0 = new w5(this, 0);
        this.C = file;
        this.f34469b = SharedConfig.deviceIsAboveAverage();
        this.D = j10;
        this.E = i10;
        this.F = i11;
        this.f34475e0 = i13;
        this.f34477f0 = i12;
        this.f34478g0 = z12;
        boolean z14 = iVar != null && i12 > 0 && i13 > 0;
        this.f34479h0 = z14;
        this.f34482k0 = document;
        getPaint().setFlags(3);
        if (j10 == 0 || (document == null && imageLocation == null)) {
            c10 = 0;
        } else {
            c10 = 0;
            this.f34488q0 = new AnimatedFileDrawableStream(document, imageLocation, obj, i11, z11, i10, i14);
        }
        gf.h hVar = null;
        if (!z10 || z14) {
            c11 = 1;
        } else {
            c11 = 1;
            this.Z = AnimatedFileNative.a(file.getAbsolutePath(), iArr, i11, j10, this.f34488q0, z11);
            this.f34468a0 = this.Z == null && (!this.f34481j0 || this.C0 > 15);
            if (this.Z != null && (iArr[c10] > 3840 || iArr[1] > 3840)) {
                this.Z.f();
                this.Z = null;
            }
            d();
            E();
            this.f34498x = true;
        }
        if (z14) {
            this.Z = AnimatedFileNative.a(file.getAbsolutePath(), iArr, i11, j10, this.f34488q0, z11);
            this.f34468a0 = this.Z == null && (!this.f34481j0 || this.C0 > 15);
            if (this.Z == null || (iArr[c10] <= 3840 && iArr[c11] <= 3840)) {
                z13 = false;
                hVar = new gf.h(file, this, iVar, this.f34477f0, this.f34475e0, !this.f34493t0, 0);
            } else {
                this.Z.f();
                this.Z = null;
                z13 = false;
            }
        } else {
            z13 = false;
        }
        this.f34495v0 = hVar;
        if (j11 != 0) {
            y(j11, z13, z13);
        }
    }
}
