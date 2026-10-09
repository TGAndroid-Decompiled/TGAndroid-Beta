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
public final class f6 extends BitmapDrawable implements Animatable, yf.c {
    public static final float[] V0 = new float[8];
    public static final ScheduledThreadPoolExecutor W0 = new ScheduledThreadPoolExecutor(8, new ThreadPoolExecutor.DiscardPolicy());
    public static final PorterDuffXfermode X0 = new PorterDuffXfermode(PorterDuff.Mode.SRC);
    public com.google.android.gms.internal.cast.a A0;
    public final d6 B0;
    public boolean C0;
    public d6 D0;
    public boolean E;
    public final d6 E0;
    public boolean F;
    public final d6 F0;
    public final File G;
    public int G0;
    public final long H;
    public final d6 H0;
    public final int I;
    public final d6 I0;
    public final int J;
    public d6 J0;
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
    public final e6 S0;
    public final int[] T;
    public boolean T0;
    public int[] U;
    public boolean U0;
    public final Matrix[] V;
    public final Path[] W;
    public float X;
    public float Y;
    public boolean Z;
    public boolean f26247a;
    public final RectF f26248a0;
    public boolean f26249b;
    public volatile boolean f26250b0;
    public int f26251c;
    public volatile boolean f26252c0;
    public final int[] d;
    public volatile AnimatedFileNative f26253d0;
    public d6 f26254e;
    public boolean f26255e0;
    public boolean f26256f;
    public DispatchQueue f26257f0;
    public float f26258g0;
    public final ArrayList h;
    public float f26259h0;
    public int f26260i0;
    public int f26261j0;
    public final boolean f26262k0;
    public final boolean f26263l0;
    public float m0;
    public c6 f26264n;
    public boolean f26265n0;
    public final TLRPC.Document f26266o0;
    public final RectF[] f26267p0;
    public final Paint[] f26268q0;
    public c6 f26269r;
    public WeakReference f26270r0;
    public c6 f26271s;
    public final qe.b f26272s0;
    public final qe.b f26273t0;
    public AnimatedFileDrawableStream f26274u0;
    public c6 v;
    public boolean f26275v0;
    public boolean f26276w;
    public boolean f26277w0;
    public boolean f26278x;
    public boolean f26279x0;
    public boolean f26280y;
    public int f26281y0;
    public final yf.e f26282z0;

    public f6(File file, boolean z10, long j3, int i10, TLRPC.Document document, ImageLocation imageLocation, Object obj, long j10, int i11, boolean z11) {
        this(file, z10, j3, i10, document, imageLocation, obj, j10, i11, z11, 0, 0, null, document != null ? 1 : 0, true);
    }

    public final void A(boolean z10) {
        this.f26279x0 = z10;
        if (z10) {
            this.f26249b = false;
        }
    }

    public final void B(int[] iArr) {
        boolean isEmpty = this.f26272s0.isEmpty();
        int[] iArr2 = this.T;
        if (!isEmpty) {
            if (this.U == null) {
                this.U = new int[4];
            }
            int[] iArr3 = this.U;
            System.arraycopy(iArr2, 0, iArr3, 0, iArr3.length);
        }
        for (int i10 = 0; i10 < 4; i10++) {
            if (!this.f26277w0 && iArr[i10] != iArr2[i10]) {
                this.f26277w0 = true;
            }
            iArr2[i10] = iArr[i10];
        }
    }

    public final void C(long j3, long j10) {
        this.f26258g0 = ((float) j3) / 1000.0f;
        this.f26259h0 = ((float) j10) / 1000.0f;
        if (j3 >= 0 && o() < j3) {
            y(j3, true, false);
        }
    }

    public final void D(long j3) {
        boolean z10;
        this.Q0 = 0;
        if (this.R0) {
            this.R0 = false;
            AndroidUtilities.executeOnUIThread(new d6(this, 0));
        }
        if (!this.T0 && (this.f26250b0 || !this.f26280y)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (this.f26250b0) {
            c6 c6Var = this.f26264n;
            if (c6Var == null && this.f26269r == null) {
                x(false);
            } else if (this.f26269r != null) {
                if (c6Var == null || (z10 && !this.f26247a && this.M < 0)) {
                    c6 c6Var2 = this.f26264n;
                    if (c6Var2 != null) {
                        this.h.add(c6Var2);
                    }
                    this.f26264n = this.f26269r;
                    this.f26269r = this.f26271s;
                    this.f26271s = null;
                    this.T0 = false;
                    x(false);
                }
            }
        } else if (!this.f26250b0 && this.f26280y && z10 && this.f26269r != null) {
            c6 c6Var3 = this.f26264n;
            if (c6Var3 != null) {
                this.h.add(c6Var3);
            }
            this.f26264n = this.f26269r;
            this.f26269r = this.f26271s;
            this.f26271s = null;
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
        if (!this.f26265n0 && (i10 = this.f26260i0) > 0 && (i11 = this.f26261j0) > 0 && (i12 = (iArr = this.d)[0]) > 0 && (i13 = iArr[1]) > 0) {
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
        this.N0.c(this.M0, false, this.f26258g0, this.f26259h0, this.f26262k0);
        long j3 = this.L0;
        if (j3 != 0 && ((i10 = iArr[3]) == 0 || j3 > i10)) {
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
        float width = this.f26261j0 / this.M0.getWidth();
        canvas.scale(width, width);
        canvas.drawBitmap(this.M0, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
        this.L0 = iArr[3];
        return 1;
    }

    @Override
    public final void b() {
        this.N0 = AnimatedFileNative.a(this.G.getAbsolutePath(), this.d, this.J, this.H, this.f26274u0, false);
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
        if (this.f26261j0 == 0 && this.f26260i0 == 0) {
            int[] iArr = this.d;
            int i11 = iArr[0];
            if (i11 <= 3000 && (i10 = iArr[1]) <= 3000) {
                if (i11 > 2200 || i10 > 2200) {
                    this.f26261j0 = i11 / 2;
                    this.f26260i0 = i10 / 2;
                    return;
                }
                return;
            }
            this.f26261j0 = i11 / 4;
            this.f26260i0 = iArr[1] / 4;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        l(canvas, false, System.currentTimeMillis(), 0);
    }

    public final void e(ImageReceiver imageReceiver) {
        if (this.f26273t0.add(imageReceiver) && this.f26250b0) {
            x(false);
        }
        h();
    }

    public final void f(View view) {
        if (view != null) {
            this.f26272s0.add(view);
        }
    }

    public final void finalize() {
        try {
            this.f26272s0.clear();
            u();
        } finally {
            super.finalize();
        }
    }

    public final boolean g() {
        if (this.f26263l0) {
            if (this.f26282z0 == null) {
                return false;
            }
            return true;
        } else if (this.f26253d0 == null && this.f26278x) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        int i10 = 0;
        if (this.f26278x) {
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
        if (this.f26278x) {
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
        if (this.f26278x) {
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
        if (this.f26278x) {
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
        d6 d6Var;
        if (this.f26282z0 != null) {
            boolean isEmpty = this.f26273t0.isEmpty();
            if (isEmpty && this.J0 == null) {
                d6 d6Var2 = new d6(this, 1);
                this.J0 = d6Var2;
                AndroidUtilities.runOnUIThread(d6Var2, 600L);
            } else if (!isEmpty && (d6Var = this.J0) != null) {
                AndroidUtilities.cancelRunOnUIThread(d6Var);
                this.J0 = null;
            }
        }
    }

    public final void i() {
        int i10;
        if (this.f26250b0 && !this.R0 && !this.f26256f) {
            if (!this.U0 && (i10 = this.d[5]) > 0) {
                this.U0 = true;
                this.Q0 = 0;
                yf.h.d().b(this.S0, i10);
            }
        } else if (this.U0) {
            this.U0 = false;
            this.Q0 = 0;
            yf.h.d().g(this.S0);
        }
    }

    @Override
    public final boolean isRunning() {
        return this.f26250b0;
    }

    public final void j() {
        qe.b bVar = this.f26273t0;
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
            if (i12 > 0 && this.f26281y0 >= i12) {
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
            c6 c6Var = this.f26264n;
            if (c6Var != null) {
                c6Var.f25264b.recycle();
                Arrays.fill(c6Var.f25263a, (Object) null);
                this.f26264n = null;
            }
            c6 c6Var2 = this.v;
            if (c6Var2 != null) {
                c6Var2.f25264b.recycle();
                Arrays.fill(c6Var2.f25263a, (Object) null);
                this.v = null;
            }
            DispatchQueue dispatchQueue = this.f26257f0;
            if (dispatchQueue != null) {
                dispatchQueue.recycle();
                this.f26257f0 = null;
            }
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.h;
                if (i10 < arrayList.size()) {
                    c6 c6Var3 = (c6) arrayList.get(i10);
                    c6Var3.f25264b.recycle();
                    Arrays.fill(c6Var3.f25263a, (Object) null);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.f6.l(android.graphics.Canvas, boolean, long, int):void");
    }

    public final Bitmap m() {
        c6 c6Var = this.f26264n;
        if (c6Var != null) {
            return c6Var.f25264b;
        }
        c6 c6Var2 = this.f26269r;
        if (c6Var2 != null) {
            return c6Var2.f25264b;
        }
        c6 c6Var3 = this.f26271s;
        if (c6Var3 != null) {
            return c6Var3.f25264b;
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
        c6 c6Var = this.f26269r;
        if (c6Var != null && (i10 = c6Var.f25266e) != 0) {
            return i10;
        }
        c6 c6Var2 = this.f26264n;
        if (c6Var2 != null) {
            return c6Var2.f25266e;
        }
        return 0;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.Z = true;
    }

    public final Bitmap p() {
        int i10 = this.f26261j0;
        int i11 = this.f26260i0;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap createBitmap = Bitmap.createBitmap(i10, i11, config);
        Canvas canvas = new Canvas(createBitmap);
        AnimatedFileNative a2 = AnimatedFileNative.a(this.G.getAbsolutePath(), this.d, this.J, this.H, this.f26274u0, false);
        if (a2 == null) {
            return createBitmap;
        }
        if (this.M0 == null) {
            int[] iArr = this.d;
            this.M0 = Bitmap.createBitmap(Math.max(1, iArr[0]), Math.max(1, iArr[1]), config);
        }
        a2.c(this.M0, false, this.f26258g0, this.f26259h0, true);
        a2.f();
        createBitmap.eraseColor(0);
        canvas.save();
        float width = this.f26261j0 / this.M0.getWidth();
        canvas.scale(width, width);
        canvas.drawBitmap(this.M0, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
        return createBitmap;
    }

    public final Bitmap q(long j3, boolean z10) {
        int c10;
        if (this.f26278x && this.f26253d0 != null) {
            AnimatedFileDrawableStream animatedFileDrawableStream = this.f26274u0;
            if (animatedFileDrawableStream != null) {
                animatedFileDrawableStream.cancel(false);
                this.f26274u0.reset();
            }
            if (!z10) {
                this.f26253d0.g(j3, z10);
            }
            int[] iArr = this.d;
            Bitmap createBitmap = Bitmap.createBitmap(iArr[0], iArr[1], Bitmap.Config.ARGB_8888);
            if (z10) {
                c10 = this.f26253d0.b(createBitmap, j3);
            } else {
                c10 = this.f26253d0.c(createBitmap, true, 0.0f, 0.0f, true);
            }
            if (c10 != 0) {
                return createBitmap;
            }
            createBitmap.recycle();
        }
        return null;
    }

    public final Bitmap r(boolean z10) {
        if (this.f26253d0 == null) {
            c6 c6Var = this.v;
            if (c6Var != null) {
                return c6Var.f25264b;
            }
            return null;
        }
        if (this.v == null) {
            if (!this.h.isEmpty()) {
                this.v = (c6) this.h.remove(0);
            } else {
                int[] iArr = this.d;
                float f7 = this.m0;
                this.v = new c6(Bitmap.createBitmap((int) (iArr[0] * f7), (int) (iArr[1] * f7), Bitmap.Config.ARGB_8888));
            }
        }
        this.f26253d0.c(this.v.f25264b, false, this.f26258g0, this.f26259h0, z10);
        return this.v.f25264b;
    }

    public final boolean s() {
        if (g()) {
            if (this.f26264n != null || this.f26269r != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void start() {
        if (!this.f26250b0 && !this.f26273t0.isEmpty()) {
            this.f26250b0 = true;
            this.R0 = false;
            x(false);
            AndroidUtilities.runOnUIThread(this.I0);
            AndroidUtilities.executeOnUIThread(new d6(this, 0));
        }
    }

    @Override
    public final void stop() {
        this.f26250b0 = false;
        AndroidUtilities.executeOnUIThread(new d6(this, 0));
    }

    public final void t() {
        Iterator it = this.f26273t0.iterator();
        while (it.hasNext()) {
            ((ImageReceiver) it.next()).invalidate();
        }
    }

    public final void u() {
        if (!this.f26272s0.isEmpty()) {
            this.K = true;
            return;
        }
        int i10 = 0;
        this.f26250b0 = false;
        this.f26252c0 = true;
        AndroidUtilities.executeOnUIThread(new d6(this, 0));
        if (this.D0 != null) {
            yf.e.c();
            ck0.T0.cancelRunnable(this.D0);
            this.D0 = null;
        }
        if (this.f26254e == null) {
            if (this.f26253d0 != null) {
                this.f26253d0.f();
                this.f26253d0 = null;
            }
            ArrayList arrayList = new ArrayList();
            c6 c6Var = this.f26264n;
            if (c6Var != null) {
                arrayList.add(c6Var.f25264b);
            }
            c6 c6Var2 = this.f26269r;
            if (c6Var2 != null) {
                arrayList.add(c6Var2.f25264b);
            }
            c6 c6Var3 = this.f26271s;
            if (c6Var3 != null) {
                arrayList.add(c6Var3.f25264b);
            }
            c6 c6Var4 = this.v;
            if (c6Var4 != null) {
                arrayList.add(c6Var4.f25264b);
            }
            ArrayList arrayList2 = this.h;
            int size = arrayList2.size();
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                c6 c6Var5 = (c6) obj;
                if (c6Var5 != null) {
                    arrayList.add(c6Var5.f25264b);
                }
            }
            this.h.clear();
            this.f26264n = null;
            this.f26269r = null;
            this.f26271s = null;
            this.v = null;
            DispatchQueue dispatchQueue = this.f26257f0;
            if (dispatchQueue != null) {
                dispatchQueue.recycle();
                this.f26257f0 = null;
            }
            getPaint().setShader(null);
            AndroidUtilities.recycleBitmaps(arrayList);
        } else {
            this.f26276w = true;
        }
        AnimatedFileDrawableStream animatedFileDrawableStream = this.f26274u0;
        if (animatedFileDrawableStream != null) {
            animatedFileDrawableStream.cancel(true);
            this.f26274u0 = null;
        }
        t();
    }

    public final void v(ImageReceiver imageReceiver) {
        qe.b bVar = this.f26273t0;
        bVar.remove(imageReceiver);
        if (bVar.isEmpty()) {
            this.f26281y0 = 0;
        }
        h();
    }

    public final void w(View view) {
        qe.b bVar = this.f26272s0;
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
        d6 d6Var;
        d6 d6Var2;
        if (this.f26254e == null || z10) {
            if ((this.f26249b && (this.f26271s == null || (!this.K0 && this.M >= 0))) || this.f26269r == null) {
                if ((this.f26264n == null || !this.f26256f) && g() && !this.f26276w) {
                    if ((this.f26250b0 || (this.f26280y && !this.E)) && !this.f26273t0.isEmpty() && !this.C0) {
                        if (this.f26275v0) {
                            if (this.f26279x0) {
                                d6 d6Var3 = this.H0;
                                this.f26254e = d6Var3;
                                DispatchQueuePoolBackground.execute(d6Var3);
                            } else {
                                if (z10 && (d6Var2 = this.f26254e) != null) {
                                    W0.remove(d6Var2);
                                }
                                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = W0;
                                d6 d6Var4 = this.H0;
                                this.f26254e = d6Var4;
                                scheduledThreadPoolExecutor.execute(d6Var4);
                            }
                        } else {
                            if (this.f26257f0 == null) {
                                this.f26257f0 = new DispatchQueue("decodeQueue" + this);
                            }
                            if (z10 && (d6Var = this.f26254e) != null) {
                                this.f26257f0.cancelRunnable(d6Var);
                            }
                            DispatchQueue dispatchQueue = this.f26257f0;
                            d6 d6Var5 = this.H0;
                            this.f26254e = d6Var5;
                            dispatchQueue.postRunnable(d6Var5, 0L);
                        }
                        this.K0 = true;
                    }
                }
            }
        }
    }

    public final void y(long j3, boolean z10, boolean z11) {
        AnimatedFileDrawableStream animatedFileDrawableStream;
        int i10;
        synchronized (this.Q) {
            try {
                this.L = j3;
                this.M = j3;
                this.K0 = false;
                if (this.f26253d0 != null) {
                    this.f26253d0.e();
                }
                if (this.f26278x && (animatedFileDrawableStream = this.f26274u0) != null) {
                    animatedFileDrawableStream.cancel(z10);
                    this.N = z10;
                    if (z10) {
                        i10 = 0;
                    } else {
                        i10 = 10;
                    }
                    this.O = i10;
                }
                if (z11 && this.f26280y) {
                    this.E = false;
                    if (this.f26254e == null) {
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
        this.f26277w0 = true;
    }

    public f6(java.io.File r19, boolean r20, long r21, int r23, org.telegram.tgnet.TLRPC.Document r24, org.telegram.messenger.ImageLocation r25, java.lang.Object r26, long r27, int r29, boolean r30, int r31, int r32, b2.n1 r33, int r34, boolean r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.f6.<init>(java.io.File, boolean, long, int, org.telegram.tgnet.TLRPC$Document, org.telegram.messenger.ImageLocation, java.lang.Object, long, int, boolean, int, int, b2.n1, int, boolean):void");
    }
}
