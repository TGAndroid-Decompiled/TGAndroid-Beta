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
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimatedFileDrawableStream;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.DispatchQueuePoolBackground;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class g6 extends BitmapDrawable implements Animatable, ag.h {
    public static final float[] V0 = new float[8];
    public static final ScheduledThreadPoolExecutor W0 = new ScheduledThreadPoolExecutor(8, new ThreadPoolExecutor.DiscardPolicy());
    public static final PorterDuffXfermode X0 = new PorterDuffXfermode(PorterDuff.Mode.SRC);
    public ag.j A0;
    public final e6 B0;
    public boolean C0;
    public e6 D0;
    public boolean E;
    public final e6 E0;
    public boolean F;
    public final e6 F0;
    public final File G;
    public int G0;
    public final long H;
    public final e6 H0;
    public final int I;
    public final e6 I0;
    public final int J;
    public e6 J0;
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
    public final f6 S0;
    public final int[] T;
    public boolean T0;
    public int[] U;
    public boolean U0;
    public final Matrix[] V;
    public final Path[] W;
    public float X;
    public float Y;
    public boolean Z;
    public boolean f28432a;
    public final RectF f28433a0;
    public boolean f28434b;
    public volatile boolean f28435b0;
    public int f28436c;
    public volatile boolean f28437c0;
    public final int[] d;
    public volatile AnimatedFileNative f28438d0;
    public e6 e;
    public boolean f28439e0;
    public boolean f28440f;
    public DispatchQueue f28441f0;
    public float f28442g0;
    public final ArrayList h;
    public float f28443h0;
    public int f28444i0;
    public int f28445j0;
    public final boolean f28446k0;
    public final boolean f28447l0;
    public float m0;
    public d6 f28448n;
    public boolean f28449n0;
    public final TLRPC.Document f28450o0;
    public final RectF[] f28451p0;
    public final Paint[] f28452q0;
    public d6 f28453r;
    public WeakReference f28454r0;
    public d6 f28455s;
    public final se.b f28456s0;
    public final se.b f28457t0;
    public AnimatedFileDrawableStream f28458u0;
    public d6 v;
    public boolean f28459v0;
    public boolean f28460w;
    public boolean f28461w0;
    public boolean f28462x;
    public boolean f28463x0;
    public boolean f28464y;
    public int f28465y0;
    public final ag.k f28466z0;

    public g6(File file, boolean z10, long j10, int i10, TLRPC.Document document, ImageLocation imageLocation, Object obj, long j11, int i11, boolean z11) {
        this(file, z10, j10, i10, document, imageLocation, obj, j11, i11, z11, 0, 0, null, document != null ? 1 : 0, true);
    }

    public final void A(boolean z10) {
        this.f28463x0 = z10;
        if (z10) {
            this.f28434b = false;
        }
    }

    public final void B(int[] iArr) {
        boolean isEmpty = this.f28456s0.isEmpty();
        int[] iArr2 = this.T;
        if (!isEmpty) {
            if (this.U == null) {
                this.U = new int[4];
            }
            int[] iArr3 = this.U;
            System.arraycopy(iArr2, 0, iArr3, 0, iArr3.length);
        }
        for (int i10 = 0; i10 < 4; i10++) {
            if (!this.f28461w0 && iArr[i10] != iArr2[i10]) {
                this.f28461w0 = true;
            }
            iArr2[i10] = iArr[i10];
        }
    }

    public final void C(long j10, long j11) {
        this.f28442g0 = ((float) j10) / 1000.0f;
        this.f28443h0 = ((float) j11) / 1000.0f;
        if (j10 >= 0 && o() < j10) {
            y(j10, true, false);
        }
    }

    public final void D(long j10) {
        boolean z10;
        this.Q0 = 0;
        if (this.R0) {
            this.R0 = false;
            AndroidUtilities.executeOnUIThread(new e6(this, 0));
        }
        if (!this.T0 && (this.f28435b0 || !this.f28464y)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (this.f28435b0) {
            d6 d6Var = this.f28448n;
            if (d6Var == null && this.f28453r == null) {
                x(false);
            } else if (this.f28453r != null) {
                if (d6Var == null || (z10 && !this.f28432a && this.M < 0)) {
                    d6 d6Var2 = this.f28448n;
                    if (d6Var2 != null) {
                        this.h.add(d6Var2);
                    }
                    this.f28448n = this.f28453r;
                    this.f28453r = this.f28455s;
                    this.f28455s = null;
                    this.T0 = false;
                    x(false);
                }
            }
        } else if (!this.f28435b0 && this.f28464y && z10 && this.f28453r != null) {
            d6 d6Var3 = this.f28448n;
            if (d6Var3 != null) {
                this.h.add(d6Var3);
            }
            this.f28448n = this.f28453r;
            this.f28453r = this.f28455s;
            this.f28455s = null;
            this.T0 = false;
            x(false);
        }
    }

    public final void E() {
        int i10;
        int i11;
        int[] iArr;
        int i12;
        int i13;
        if (!this.f28449n0 && (i10 = this.f28444i0) > 0 && (i11 = this.f28445j0) > 0 && (i12 = (iArr = this.d)[0]) > 0 && (i13 = iArr[1]) > 0) {
            float max = Math.max(i11 / i12, i10 / i13);
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
        int i10;
        if (this.N0 == null) {
            return -1;
        }
        Canvas canvas = new Canvas(bitmap);
        Bitmap bitmap2 = this.M0;
        int[] iArr = this.d;
        if (bitmap2 == null) {
            this.M0 = Bitmap.createBitmap(iArr[0], iArr[1], Bitmap.Config.ARGB_8888);
        }
        this.N0.c(this.M0, false, this.f28442g0, this.f28443h0, this.f28446k0);
        long j10 = this.L0;
        if (j10 != 0 && ((i10 = iArr[3]) == 0 || j10 > i10)) {
            return 0;
        }
        int i11 = this.P0;
        int i12 = iArr[3];
        if (i11 == i12) {
            int i13 = this.O0 + 1;
            this.O0 = i13;
            if (i13 > 5) {
                return 0;
            }
        }
        this.P0 = i12;
        bitmap.eraseColor(0);
        canvas.save();
        float width = this.f28445j0 / this.M0.getWidth();
        canvas.scale(width, width);
        canvas.drawBitmap(this.M0, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
        this.L0 = iArr[3];
        return 1;
    }

    @Override
    public final void b() {
        this.N0 = AnimatedFileNative.a(this.G.getAbsolutePath(), this.d, this.J, this.H, this.f28458u0, false);
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
        int i10;
        if (this.f28445j0 == 0 && this.f28444i0 == 0) {
            int[] iArr = this.d;
            int i11 = iArr[0];
            if (i11 <= 3000 && (i10 = iArr[1]) <= 3000) {
                if (i11 > 2200 || i10 > 2200) {
                    this.f28445j0 = i11 / 2;
                    this.f28444i0 = i10 / 2;
                    return;
                }
                return;
            }
            this.f28445j0 = i11 / 4;
            this.f28444i0 = iArr[1] / 4;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        l(canvas, false, System.currentTimeMillis(), 0);
    }

    public final void e(ImageReceiver imageReceiver) {
        if (this.f28457t0.add(imageReceiver) && this.f28435b0) {
            x(false);
        }
        h();
    }

    public final void f(View view) {
        if (view != null) {
            this.f28456s0.add(view);
        }
    }

    public final void finalize() {
        try {
            this.f28456s0.clear();
            u();
        } finally {
            super.finalize();
        }
    }

    public final boolean g() {
        if (this.f28447l0) {
            if (this.f28466z0 == null) {
                return false;
            }
            return true;
        } else if (this.f28438d0 == null && this.f28462x) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        int i10 = 0;
        if (this.f28462x) {
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
        return (int) (i10 * this.m0);
    }

    @Override
    public final int getIntrinsicWidth() {
        int i10 = 0;
        if (this.f28462x) {
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
        return (int) (i10 * this.m0);
    }

    @Override
    public final int getMinimumHeight() {
        int i10 = 0;
        if (this.f28462x) {
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
        if (this.f28462x) {
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
        e6 e6Var;
        if (this.f28466z0 != null) {
            boolean isEmpty = this.f28457t0.isEmpty();
            if (isEmpty && this.J0 == null) {
                e6 e6Var2 = new e6(this, 3);
                this.J0 = e6Var2;
                AndroidUtilities.runOnUIThread(e6Var2, 600L);
            } else if (!isEmpty && (e6Var = this.J0) != null) {
                AndroidUtilities.cancelRunOnUIThread(e6Var);
                this.J0 = null;
            }
        }
    }

    public final void i() {
        int i10;
        if (this.f28435b0 && !this.R0 && !this.f28440f) {
            if (!this.U0 && (i10 = this.d[5]) > 0) {
                this.U0 = true;
                this.Q0 = 0;
                ag.n.d().b(this.S0, i10);
            }
        } else if (this.U0) {
            this.U0 = false;
            this.Q0 = 0;
            ag.n.d().f(this.S0);
        }
    }

    @Override
    public final boolean isRunning() {
        return this.f28435b0;
    }

    public final void j() {
        se.b bVar = this.f28457t0;
        Iterator it = bVar.iterator();
        int i10 = 0;
        int i11 = 0;
        while (it.hasNext()) {
            ImageReceiver imageReceiver = (ImageReceiver) it.next();
            if (!imageReceiver.isAttachedToWindow()) {
                bVar.remove(imageReceiver);
            } else {
                i10++;
            }
            int i12 = imageReceiver.animatedFileDrawableRepeatMaxCount;
            if (i12 > 0 && this.f28465y0 >= i12) {
                i11++;
            }
        }
        if (i10 == i11) {
            stop();
        } else {
            start();
        }
    }

    public final void k() {
        if (!g()) {
            d6 d6Var = this.f28448n;
            if (d6Var != null) {
                d6Var.f27404b.recycle();
                Arrays.fill(d6Var.f27403a, (Object) null);
                this.f28448n = null;
            }
            d6 d6Var2 = this.v;
            if (d6Var2 != null) {
                d6Var2.f27404b.recycle();
                Arrays.fill(d6Var2.f27403a, (Object) null);
                this.v = null;
            }
            DispatchQueue dispatchQueue = this.f28441f0;
            if (dispatchQueue != null) {
                dispatchQueue.recycle();
                this.f28441f0 = null;
            }
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.h;
                if (i10 < arrayList.size()) {
                    d6 d6Var3 = (d6) arrayList.get(i10);
                    d6Var3.f27404b.recycle();
                    Arrays.fill(d6Var3.f27403a, (Object) null);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g6.l(android.graphics.Canvas, boolean, long, int):void");
    }

    public final Bitmap m() {
        d6 d6Var = this.f28448n;
        if (d6Var != null) {
            return d6Var.f27404b;
        }
        d6 d6Var2 = this.f28453r;
        if (d6Var2 != null) {
            return d6Var2.f27404b;
        }
        d6 d6Var3 = this.f28455s;
        if (d6Var3 != null) {
            return d6Var3.f27404b;
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
        int i10;
        if (this.M >= 0) {
            return (int) this.M;
        }
        d6 d6Var = this.f28453r;
        if (d6Var != null && (i10 = d6Var.e) != 0) {
            return i10;
        }
        d6 d6Var2 = this.f28448n;
        if (d6Var2 != null) {
            return d6Var2.e;
        }
        return 0;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.Z = true;
    }

    public final Bitmap p() {
        int i10 = this.f28445j0;
        int i11 = this.f28444i0;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap createBitmap = Bitmap.createBitmap(i10, i11, config);
        Canvas canvas = new Canvas(createBitmap);
        AnimatedFileNative a2 = AnimatedFileNative.a(this.G.getAbsolutePath(), this.d, this.J, this.H, this.f28458u0, false);
        if (a2 == null) {
            return createBitmap;
        }
        if (this.M0 == null) {
            int[] iArr = this.d;
            this.M0 = Bitmap.createBitmap(Math.max(1, iArr[0]), Math.max(1, iArr[1]), config);
        }
        a2.c(this.M0, false, this.f28442g0, this.f28443h0, true);
        a2.f();
        createBitmap.eraseColor(0);
        canvas.save();
        float width = this.f28445j0 / this.M0.getWidth();
        canvas.scale(width, width);
        canvas.drawBitmap(this.M0, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
        return createBitmap;
    }

    public final Bitmap q(long j10, boolean z10) {
        int c10;
        if (this.f28462x && this.f28438d0 != null) {
            AnimatedFileDrawableStream animatedFileDrawableStream = this.f28458u0;
            if (animatedFileDrawableStream != null) {
                animatedFileDrawableStream.cancel(false);
                this.f28458u0.reset();
            }
            if (!z10) {
                this.f28438d0.g(j10, z10);
            }
            int[] iArr = this.d;
            Bitmap createBitmap = Bitmap.createBitmap(iArr[0], iArr[1], Bitmap.Config.ARGB_8888);
            if (z10) {
                c10 = this.f28438d0.b(createBitmap, j10);
            } else {
                c10 = this.f28438d0.c(createBitmap, true, 0.0f, 0.0f, true);
            }
            if (c10 != 0) {
                return createBitmap;
            }
            createBitmap.recycle();
        }
        return null;
    }

    public final Bitmap r(boolean z10) {
        if (this.f28438d0 == null) {
            d6 d6Var = this.v;
            if (d6Var != null) {
                return d6Var.f27404b;
            }
            return null;
        }
        if (this.v == null) {
            if (!this.h.isEmpty()) {
                this.v = (d6) this.h.remove(0);
            } else {
                int[] iArr = this.d;
                float f7 = this.m0;
                this.v = new d6(Bitmap.createBitmap((int) (iArr[0] * f7), (int) (iArr[1] * f7), Bitmap.Config.ARGB_8888));
            }
        }
        this.f28438d0.c(this.v.f27404b, false, this.f28442g0, this.f28443h0, z10);
        return this.v.f27404b;
    }

    public final boolean s() {
        if (g()) {
            if (this.f28448n != null || this.f28453r != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void start() {
        if (!this.f28435b0 && !this.f28457t0.isEmpty()) {
            this.f28435b0 = true;
            this.R0 = false;
            x(false);
            AndroidUtilities.runOnUIThread(this.I0);
            AndroidUtilities.executeOnUIThread(new e6(this, 0));
        }
    }

    @Override
    public final void stop() {
        this.f28435b0 = false;
        AndroidUtilities.executeOnUIThread(new e6(this, 0));
    }

    public final void t() {
        Iterator it = this.f28457t0.iterator();
        while (it.hasNext()) {
            ((ImageReceiver) it.next()).invalidate();
        }
    }

    public final void u() {
        if (!this.f28456s0.isEmpty()) {
            this.K = true;
            return;
        }
        int i10 = 0;
        this.f28435b0 = false;
        this.f28437c0 = true;
        AndroidUtilities.executeOnUIThread(new e6(this, 0));
        if (this.D0 != null) {
            ag.k.c();
            xj0.T0.cancelRunnable(this.D0);
            this.D0 = null;
        }
        if (this.e == null) {
            if (this.f28438d0 != null) {
                this.f28438d0.f();
                this.f28438d0 = null;
            }
            ArrayList arrayList = new ArrayList();
            d6 d6Var = this.f28448n;
            if (d6Var != null) {
                arrayList.add(d6Var.f27404b);
            }
            d6 d6Var2 = this.f28453r;
            if (d6Var2 != null) {
                arrayList.add(d6Var2.f27404b);
            }
            d6 d6Var3 = this.f28455s;
            if (d6Var3 != null) {
                arrayList.add(d6Var3.f27404b);
            }
            d6 d6Var4 = this.v;
            if (d6Var4 != null) {
                arrayList.add(d6Var4.f27404b);
            }
            ArrayList arrayList2 = this.h;
            int size = arrayList2.size();
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                d6 d6Var5 = (d6) obj;
                if (d6Var5 != null) {
                    arrayList.add(d6Var5.f27404b);
                }
            }
            this.h.clear();
            this.f28448n = null;
            this.f28453r = null;
            this.f28455s = null;
            this.v = null;
            DispatchQueue dispatchQueue = this.f28441f0;
            if (dispatchQueue != null) {
                dispatchQueue.recycle();
                this.f28441f0 = null;
            }
            getPaint().setShader(null);
            AndroidUtilities.recycleBitmaps(arrayList);
        } else {
            this.f28460w = true;
        }
        AnimatedFileDrawableStream animatedFileDrawableStream = this.f28458u0;
        if (animatedFileDrawableStream != null) {
            animatedFileDrawableStream.cancel(true);
            this.f28458u0 = null;
        }
        AndroidUtilities.executeOnUIThread(new e6(this, 2));
    }

    public final void v(ImageReceiver imageReceiver) {
        se.b bVar = this.f28457t0;
        bVar.remove(imageReceiver);
        if (bVar.isEmpty()) {
            this.f28465y0 = 0;
        }
        h();
    }

    public final void w(View view) {
        se.b bVar = this.f28456s0;
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

    public final void x(boolean z10) {
        e6 e6Var;
        e6 e6Var2;
        if (this.e == null || z10) {
            if ((this.f28434b && (this.f28455s == null || (!this.K0 && this.M >= 0))) || this.f28453r == null) {
                if ((this.f28448n == null || !this.f28440f) && g() && !this.f28460w) {
                    if ((this.f28435b0 || (this.f28464y && !this.E)) && !this.f28457t0.isEmpty() && !this.C0) {
                        if (this.f28459v0) {
                            if (this.f28463x0) {
                                e6 e6Var3 = this.H0;
                                this.e = e6Var3;
                                DispatchQueuePoolBackground.execute(e6Var3);
                            } else {
                                if (z10 && (e6Var2 = this.e) != null) {
                                    W0.remove(e6Var2);
                                }
                                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = W0;
                                e6 e6Var4 = this.H0;
                                this.e = e6Var4;
                                scheduledThreadPoolExecutor.execute(e6Var4);
                            }
                        } else {
                            if (this.f28441f0 == null) {
                                this.f28441f0 = new DispatchQueue("decodeQueue" + this);
                            }
                            if (z10 && (e6Var = this.e) != null) {
                                this.f28441f0.cancelRunnable(e6Var);
                            }
                            DispatchQueue dispatchQueue = this.f28441f0;
                            e6 e6Var5 = this.H0;
                            this.e = e6Var5;
                            dispatchQueue.postRunnable(e6Var5, 0L);
                        }
                        this.K0 = true;
                    }
                }
            }
        }
    }

    public final void y(long j10, boolean z10, boolean z11) {
        AnimatedFileDrawableStream animatedFileDrawableStream;
        int i10;
        synchronized (this.Q) {
            try {
                this.L = j10;
                this.M = j10;
                this.K0 = false;
                if (this.f28438d0 != null) {
                    this.f28438d0.e();
                }
                if (this.f28462x && (animatedFileDrawableStream = this.f28458u0) != null) {
                    animatedFileDrawableStream.cancel(z10);
                    this.N = z10;
                    if (z10) {
                        i10 = 0;
                    } else {
                        i10 = 10;
                    }
                    this.O = i10;
                }
                if (z11 && this.f28464y) {
                    this.E = false;
                    if (this.e == null) {
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

    public final void z(float f7, float f10, float f11, float f12) {
        float f13 = f12 + f10;
        float f14 = f11 + f7;
        RectF rectF = this.S;
        if (rectF.left == f7 && rectF.top == f10 && rectF.right == f14 && rectF.bottom == f13) {
            return;
        }
        rectF.set(f7, f10, f14, f13);
        this.f28461w0 = true;
    }

    public g6(java.io.File r19, boolean r20, long r21, int r23, org.telegram.tgnet.TLRPC.Document r24, org.telegram.messenger.ImageLocation r25, java.lang.Object r26, long r27, int r29, boolean r30, int r31, int r32, ag.g r33, int r34, boolean r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g6.<init>(java.io.File, boolean, long, int, org.telegram.tgnet.TLRPC$Document, org.telegram.messenger.ImageLocation, java.lang.Object, long, int, boolean, int, int, ag.g, int, boolean):void");
    }
}
