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
public final class x5 extends BitmapDrawable implements Animatable, ff.f {
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
    public boolean f34506a;
    public boolean f34507a0;
    public boolean f34508b;
    public DispatchQueue f34509b0;
    public int f34510c;
    public float f34511c0;
    public final int[] d;
    public float f34512d0;
    public v5 f34513e;
    public int f34514e0;
    public boolean f34515f;
    public int f34516f0;
    public final boolean f34517g0;
    public final ArrayList h;
    public final boolean f34518h0;
    public float f34519i0;
    public boolean f34520j0;
    public final TLRPC.Document f34521k0;
    public final RectF[] f34522l0;
    public final Paint[] m0;
    public u5 f34523n;
    public View f34524n0;
    public final ArrayList f34525o0;
    public final ArrayList f34526p0;
    public AnimatedFileDrawableStream f34527q0;
    public u5 f34528r;
    public boolean f34529r0;
    public u5 f34530s;
    public boolean f34531s0;
    public boolean f34532t0;
    public int f34533u0;
    public u5 v;
    public final ff.h f34534v0;
    public boolean f34535w;
    public com.google.android.gms.internal.cast.a f34536w0;
    public boolean f34537x;
    public final v5 f34538x0;
    public boolean f34539y;
    public boolean f34540y0;
    public v5 f34541z0;

    public x5(File file, boolean z10, long j10, int i9, TLRPC.Document document, ImageLocation imageLocation, Object obj, long j11, int i10, boolean z11) {
        this(file, z10, j10, i9, document, imageLocation, obj, j11, i10, z11, 0, 0, null, document != null ? 1 : 0, true);
    }

    public final void A(boolean z10) {
        this.f34532t0 = z10;
        if (z10) {
            this.f34508b = false;
        }
    }

    public final void B(int[] iArr) {
        boolean isEmpty = this.f34525o0.isEmpty();
        int[] iArr2 = this.P;
        if (!isEmpty) {
            if (this.Q == null) {
                this.Q = new int[4];
            }
            int[] iArr3 = this.Q;
            System.arraycopy(iArr2, 0, iArr3, 0, iArr3.length);
        }
        for (int i9 = 0; i9 < 4; i9++) {
            if (!this.f34531s0 && iArr[i9] != iArr2[i9]) {
                this.f34531s0 = true;
            }
            iArr2[i9] = iArr[i9];
        }
    }

    public final void C(long j10, long j11) {
        this.f34511c0 = ((float) j10) / 1000.0f;
        this.f34512d0 = ((float) j11) / 1000.0f;
        if (j10 >= 0 && o() < j10) {
            y(j10, true, false);
        }
    }

    public final void D(long j10) {
        boolean z10;
        this.M0 = 0;
        if (this.N0) {
            this.N0 = false;
            AndroidUtilities.executeOnUIThread(new v5(this, 0));
        }
        if (!this.P0 && (this.X || !this.f34539y)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (this.X) {
            u5 u5Var = this.f34523n;
            if (u5Var == null && this.f34528r == null) {
                x(false);
            } else if (this.f34528r != null) {
                if (u5Var == null || (z10 && !this.f34506a && this.I < 0)) {
                    u5 u5Var2 = this.f34523n;
                    if (u5Var2 != null) {
                        this.h.add(u5Var2);
                    }
                    this.f34523n = this.f34528r;
                    this.f34528r = this.f34530s;
                    this.f34530s = null;
                    this.P0 = false;
                    x(false);
                }
            }
        } else if (!this.X && this.f34539y && z10 && this.f34528r != null) {
            u5 u5Var3 = this.f34523n;
            if (u5Var3 != null) {
                this.h.add(u5Var3);
            }
            this.f34523n = this.f34528r;
            this.f34528r = this.f34530s;
            this.f34530s = null;
            this.P0 = false;
            x(false);
        }
    }

    public final void E() {
        int i9;
        int i10;
        int[] iArr;
        int i11;
        int i12;
        if (!this.f34520j0 && (i9 = this.f34514e0) > 0 && (i10 = this.f34516f0) > 0 && (i11 = (iArr = this.d)[0]) > 0 && (i12 = iArr[1]) > 0) {
            float max = Math.max(i10 / i11, i9 / i12);
            this.f34519i0 = max;
            if (max > 0.0f && max <= 0.7d) {
                return;
            }
            this.f34519i0 = 1.0f;
            return;
        }
        this.f34519i0 = 1.0f;
    }

    @Override
    public final int a(Bitmap bitmap) {
        int i9;
        if (this.J0 == null) {
            return -1;
        }
        Canvas canvas = new Canvas(bitmap);
        Bitmap bitmap2 = this.I0;
        int[] iArr = this.d;
        if (bitmap2 == null) {
            this.I0 = Bitmap.createBitmap(iArr[0], iArr[1], Bitmap.Config.ARGB_8888);
        }
        this.J0.c(this.I0, false, this.f34511c0, this.f34512d0, this.f34517g0);
        long j10 = this.H0;
        if (j10 != 0 && ((i9 = iArr[3]) == 0 || j10 > i9)) {
            return 0;
        }
        int i10 = this.L0;
        int i11 = iArr[3];
        if (i10 == i11) {
            int i12 = this.K0 + 1;
            this.K0 = i12;
            if (i12 > 5) {
                return 0;
            }
        }
        this.L0 = i11;
        bitmap.eraseColor(0);
        canvas.save();
        float width = this.f34516f0 / this.I0.getWidth();
        canvas.scale(width, width);
        canvas.drawBitmap(this.I0, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
        this.H0 = iArr[3];
        return 1;
    }

    @Override
    public final void b() {
        this.J0 = AnimatedFileNative.a(this.C.getAbsolutePath(), this.d, this.F, this.D, this.f34527q0, false);
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
        int i9;
        if (this.f34516f0 == 0 && this.f34514e0 == 0) {
            int[] iArr = this.d;
            int i10 = iArr[0];
            if (i10 <= 3000 && (i9 = iArr[1]) <= 3000) {
                if (i10 > 2200 || i9 > 2200) {
                    this.f34516f0 = i10 / 2;
                    this.f34514e0 = i9 / 2;
                    return;
                }
                return;
            }
            this.f34516f0 = i10 / 4;
            this.f34514e0 = iArr[1] / 4;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        l(canvas, false, System.currentTimeMillis(), 0);
    }

    public final void e(ImageReceiver imageReceiver) {
        if (!this.f34526p0.contains(imageReceiver)) {
            this.f34526p0.add(imageReceiver);
            if (this.X) {
                x(false);
            }
        }
        h();
    }

    public final void f(View view) {
        if (view != null) {
            ArrayList arrayList = this.f34525o0;
            if (!arrayList.contains(view)) {
                arrayList.add(view);
            }
        }
    }

    public final void finalize() {
        try {
            this.f34525o0.clear();
            u();
        } finally {
            super.finalize();
        }
    }

    public final boolean g() {
        if (this.f34518h0) {
            if (this.f34534v0 == null) {
                return false;
            }
            return true;
        } else if (this.Z == null && this.f34537x) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        int i9 = 0;
        if (this.f34537x) {
            int[] iArr = this.d;
            int i10 = iArr[2];
            if (i10 != 90 && i10 != 270) {
                i9 = iArr[1];
            } else {
                i9 = iArr[0];
            }
        }
        if (i9 == 0) {
            return AndroidUtilities.dp(100.0f);
        }
        return (int) (i9 * this.f34519i0);
    }

    @Override
    public final int getIntrinsicWidth() {
        int i9 = 0;
        if (this.f34537x) {
            int[] iArr = this.d;
            int i10 = iArr[2];
            if (i10 != 90 && i10 != 270) {
                i9 = iArr[0];
            } else {
                i9 = iArr[1];
            }
        }
        if (i9 == 0) {
            return AndroidUtilities.dp(100.0f);
        }
        return (int) (i9 * this.f34519i0);
    }

    @Override
    public final int getMinimumHeight() {
        int i9 = 0;
        if (this.f34537x) {
            int[] iArr = this.d;
            int i10 = iArr[2];
            if (i10 != 90 && i10 != 270) {
                i9 = iArr[1];
            } else {
                i9 = iArr[0];
            }
        }
        if (i9 == 0) {
            return AndroidUtilities.dp(100.0f);
        }
        return i9;
    }

    @Override
    public final int getMinimumWidth() {
        int i9 = 0;
        if (this.f34537x) {
            int[] iArr = this.d;
            int i10 = iArr[2];
            if (i10 != 90 && i10 != 270) {
                i9 = iArr[0];
            } else {
                i9 = iArr[1];
            }
        }
        if (i9 == 0) {
            return AndroidUtilities.dp(100.0f);
        }
        return i9;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h() {
        v5 v5Var;
        if (this.f34534v0 != null) {
            boolean isEmpty = this.f34526p0.isEmpty();
            if (isEmpty && this.F0 == null) {
                v5 v5Var2 = new v5(this, 1);
                this.F0 = v5Var2;
                AndroidUtilities.runOnUIThread(v5Var2, 600L);
            } else if (!isEmpty && (v5Var = this.F0) != null) {
                AndroidUtilities.cancelRunOnUIThread(v5Var);
                this.F0 = null;
            }
        }
    }

    public final void i() {
        int i9;
        if (this.X && !this.N0 && !this.f34515f) {
            if (!this.Q0 && (i9 = this.d[5]) > 0) {
                this.Q0 = true;
                this.M0 = 0;
                ff.k.d().b(this.O0, i9);
            }
        } else if (this.Q0) {
            this.Q0 = false;
            this.M0 = 0;
            ff.k.d().f(this.O0);
        }
    }

    @Override
    public final boolean isRunning() {
        return this.X;
    }

    public final void j() {
        ArrayList arrayList;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            arrayList = this.f34526p0;
            if (i9 >= arrayList.size()) {
                break;
            }
            ImageReceiver imageReceiver = (ImageReceiver) arrayList.get(i9);
            if (!imageReceiver.isAttachedToWindow()) {
                arrayList.remove(i9);
                i9--;
            }
            int i11 = imageReceiver.animatedFileDrawableRepeatMaxCount;
            if (i11 > 0 && this.f34533u0 >= i11) {
                i10++;
            }
            i9++;
        }
        if (arrayList.size() == i10) {
            stop();
        } else {
            start();
        }
    }

    public final void k() {
        if (!g()) {
            u5 u5Var = this.f34523n;
            if (u5Var != null) {
                u5Var.f32920b.recycle();
                Arrays.fill(u5Var.f32919a, (Object) null);
                this.f34523n = null;
            }
            u5 u5Var2 = this.v;
            if (u5Var2 != null) {
                u5Var2.f32920b.recycle();
                Arrays.fill(u5Var2.f32919a, (Object) null);
                this.v = null;
            }
            DispatchQueue dispatchQueue = this.f34509b0;
            if (dispatchQueue != null) {
                dispatchQueue.recycle();
                this.f34509b0 = null;
            }
            int i9 = 0;
            while (true) {
                ArrayList arrayList = this.h;
                if (i9 < arrayList.size()) {
                    u5 u5Var3 = (u5) arrayList.get(i9);
                    u5Var3.f32920b.recycle();
                    Arrays.fill(u5Var3.f32919a, (Object) null);
                    i9++;
                } else {
                    arrayList.clear();
                    t();
                    return;
                }
            }
        }
    }

    public final void l(android.graphics.Canvas r20, boolean r21, long r22, int r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.x5.l(android.graphics.Canvas, boolean, long, int):void");
    }

    public final Bitmap m() {
        u5 u5Var = this.f34523n;
        if (u5Var != null) {
            return u5Var.f32920b;
        }
        u5 u5Var2 = this.f34528r;
        if (u5Var2 != null) {
            return u5Var2.f32920b;
        }
        u5 u5Var3 = this.f34530s;
        if (u5Var3 != null) {
            return u5Var3.f32920b;
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
        int i9;
        if (this.I >= 0) {
            return (int) this.I;
        }
        u5 u5Var = this.f34528r;
        if (u5Var != null && (i9 = u5Var.f32922e) != 0) {
            return i9;
        }
        u5 u5Var2 = this.f34523n;
        if (u5Var2 != null) {
            return u5Var2.f32922e;
        }
        return 0;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.V = true;
    }

    public final Bitmap p() {
        int i9 = this.f34516f0;
        int i10 = this.f34514e0;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap createBitmap = Bitmap.createBitmap(i9, i10, config);
        Canvas canvas = new Canvas(createBitmap);
        AnimatedFileNative a2 = AnimatedFileNative.a(this.C.getAbsolutePath(), this.d, this.F, this.D, this.f34527q0, false);
        if (a2 == null) {
            return createBitmap;
        }
        if (this.I0 == null) {
            int[] iArr = this.d;
            this.I0 = Bitmap.createBitmap(Math.max(1, iArr[0]), Math.max(1, iArr[1]), config);
        }
        a2.c(this.I0, false, this.f34511c0, this.f34512d0, true);
        a2.f();
        createBitmap.eraseColor(0);
        canvas.save();
        float width = this.f34516f0 / this.I0.getWidth();
        canvas.scale(width, width);
        canvas.drawBitmap(this.I0, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
        return createBitmap;
    }

    public final Bitmap q(long j10, boolean z10) {
        int c10;
        if (this.f34537x && this.Z != null) {
            AnimatedFileDrawableStream animatedFileDrawableStream = this.f34527q0;
            if (animatedFileDrawableStream != null) {
                animatedFileDrawableStream.cancel(false);
                this.f34527q0.reset();
            }
            if (!z10) {
                this.Z.g(j10, z10);
            }
            int[] iArr = this.d;
            Bitmap createBitmap = Bitmap.createBitmap(iArr[0], iArr[1], Bitmap.Config.ARGB_8888);
            if (z10) {
                c10 = this.Z.b(createBitmap, j10);
            } else {
                c10 = this.Z.c(createBitmap, true, 0.0f, 0.0f, true);
            }
            if (c10 != 0) {
                return createBitmap;
            }
            createBitmap.recycle();
        }
        return null;
    }

    public final Bitmap r(boolean z10) {
        if (this.Z == null) {
            u5 u5Var = this.v;
            if (u5Var != null) {
                return u5Var.f32920b;
            }
            return null;
        }
        if (this.v == null) {
            if (!this.h.isEmpty()) {
                this.v = (u5) this.h.remove(0);
            } else {
                int[] iArr = this.d;
                float f10 = this.f34519i0;
                this.v = new u5(Bitmap.createBitmap((int) (iArr[0] * f10), (int) (iArr[1] * f10), Bitmap.Config.ARGB_8888));
            }
        }
        this.Z.c(this.v.f32920b, false, this.f34511c0, this.f34512d0, z10);
        return this.v.f32920b;
    }

    public final boolean s() {
        if (g()) {
            if (this.f34523n != null || this.f34528r != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void start() {
        if (!this.X && !this.f34526p0.isEmpty()) {
            this.X = true;
            this.N0 = false;
            x(false);
            AndroidUtilities.runOnUIThread(this.E0);
            AndroidUtilities.executeOnUIThread(new v5(this, 0));
        }
    }

    @Override
    public final void stop() {
        this.X = false;
        AndroidUtilities.executeOnUIThread(new v5(this, 0));
    }

    public final void t() {
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.f34526p0;
            if (i9 < arrayList.size()) {
                ((ImageReceiver) arrayList.get(i9)).invalidate();
                i9++;
            } else {
                return;
            }
        }
    }

    public final void u() {
        if (!this.f34525o0.isEmpty()) {
            this.G = true;
            return;
        }
        int i9 = 0;
        this.X = false;
        this.Y = true;
        AndroidUtilities.executeOnUIThread(new v5(this, 0));
        if (this.f34541z0 != null) {
            ff.h.c();
            mi0.P0.cancelRunnable(this.f34541z0);
            this.f34541z0 = null;
        }
        if (this.f34513e == null) {
            if (this.Z != null) {
                this.Z.f();
                this.Z = null;
            }
            ArrayList arrayList = new ArrayList();
            u5 u5Var = this.f34523n;
            if (u5Var != null) {
                arrayList.add(u5Var.f32920b);
            }
            u5 u5Var2 = this.f34528r;
            if (u5Var2 != null) {
                arrayList.add(u5Var2.f32920b);
            }
            u5 u5Var3 = this.f34530s;
            if (u5Var3 != null) {
                arrayList.add(u5Var3.f32920b);
            }
            u5 u5Var4 = this.v;
            if (u5Var4 != null) {
                arrayList.add(u5Var4.f32920b);
            }
            ArrayList arrayList2 = this.h;
            int size = arrayList2.size();
            while (i9 < size) {
                Object obj = arrayList2.get(i9);
                i9++;
                u5 u5Var5 = (u5) obj;
                if (u5Var5 != null) {
                    arrayList.add(u5Var5.f32920b);
                }
            }
            this.h.clear();
            this.f34523n = null;
            this.f34528r = null;
            this.f34530s = null;
            this.v = null;
            DispatchQueue dispatchQueue = this.f34509b0;
            if (dispatchQueue != null) {
                dispatchQueue.recycle();
                this.f34509b0 = null;
            }
            getPaint().setShader(null);
            AndroidUtilities.recycleBitmaps(arrayList);
        } else {
            this.f34535w = true;
        }
        AnimatedFileDrawableStream animatedFileDrawableStream = this.f34527q0;
        if (animatedFileDrawableStream != null) {
            animatedFileDrawableStream.cancel(true);
            this.f34527q0 = null;
        }
        t();
    }

    public final void v(ImageReceiver imageReceiver) {
        ArrayList arrayList = this.f34526p0;
        arrayList.remove(imageReceiver);
        if (arrayList.isEmpty()) {
            this.f34533u0 = 0;
        }
        h();
    }

    public final void w(View view) {
        ArrayList arrayList = this.f34525o0;
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
        if (this.f34513e == null || z10) {
            if ((this.f34508b && (this.f34530s == null || (!this.G0 && this.I >= 0))) || this.f34528r == null) {
                if ((this.f34523n == null || !this.f34515f) && g() && !this.f34535w) {
                    if ((this.X || (this.f34539y && !this.A)) && !this.f34526p0.isEmpty() && !this.f34540y0) {
                        if (this.f34529r0) {
                            if (this.f34532t0) {
                                v5 v5Var3 = this.D0;
                                this.f34513e = v5Var3;
                                DispatchQueuePoolBackground.execute(v5Var3);
                            } else {
                                if (z10 && (v5Var2 = this.f34513e) != null) {
                                    S0.remove(v5Var2);
                                }
                                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = S0;
                                v5 v5Var4 = this.D0;
                                this.f34513e = v5Var4;
                                scheduledThreadPoolExecutor.execute(v5Var4);
                            }
                        } else {
                            if (this.f34509b0 == null) {
                                this.f34509b0 = new DispatchQueue("decodeQueue" + this);
                            }
                            if (z10 && (v5Var = this.f34513e) != null) {
                                this.f34509b0.cancelRunnable(v5Var);
                            }
                            DispatchQueue dispatchQueue = this.f34509b0;
                            v5 v5Var5 = this.D0;
                            this.f34513e = v5Var5;
                            dispatchQueue.postRunnable(v5Var5, 0L);
                        }
                        this.G0 = true;
                    }
                }
            }
        }
    }

    public final void y(long j10, boolean z10, boolean z11) {
        AnimatedFileDrawableStream animatedFileDrawableStream;
        int i9;
        synchronized (this.M) {
            try {
                this.H = j10;
                this.I = j10;
                this.G0 = false;
                if (this.Z != null) {
                    this.Z.e();
                }
                if (this.f34537x && (animatedFileDrawableStream = this.f34527q0) != null) {
                    animatedFileDrawableStream.cancel(z10);
                    this.J = z10;
                    if (z10) {
                        i9 = 0;
                    } else {
                        i9 = 10;
                    }
                    this.K = i9;
                }
                if (z11 && this.f34539y) {
                    this.A = false;
                    if (this.f34513e == null) {
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
        this.f34531s0 = true;
    }

    public x5(java.io.File r19, boolean r20, long r21, int r23, org.telegram.tgnet.TLRPC.Document r24, org.telegram.messenger.ImageLocation r25, java.lang.Object r26, long r27, int r29, boolean r30, int r31, int r32, fe.i r33, int r34, boolean r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.x5.<init>(java.io.File, boolean, long, int, org.telegram.tgnet.TLRPC$Document, org.telegram.messenger.ImageLocation, java.lang.Object, long, int, boolean, int, int, fe.i, int, boolean):void");
    }
}
