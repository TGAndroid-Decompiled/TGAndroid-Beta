package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.OverScroller;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cd;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.qz0;
import org.telegram.ui.LaunchActivity;
public final class q3 extends View {
    public float D;
    public float E;
    public long F;
    public boolean G;
    public boolean H;
    public VelocityTracker I;
    public float J;
    public boolean K;
    public float L;
    public Bitmap M;
    public BitmapShader N;
    public Paint O;
    public Matrix P;
    public final RectF Q;
    public final ArrayList R;
    public View S;
    public ValueAnimator T;
    public boolean U;
    public float V;
    public ValueAnimator W;
    public i3 f20661a;
    public final int[] f20662a0;
    public n3 f20663b;
    public final int[] f20664b0;
    public f3 f20665c;
    public final RectF f20666c0;
    public ValueAnimator d;
    public final RectF f20667d0;
    public float e;
    public final RectF f20668e0;
    public final org.telegram.ui.Components.t5 f20669f;
    public final Path f20670f0;
    public qz0 f20671g0;
    public final OverScroller h;
    public boolean f20672h0;
    public org.telegram.ui.Cells.y f20673i0;
    public li.k f20674j0;
    public final int f20675n;
    public final int f20676r;
    public int f20677s;
    public final m3 f20678w;
    public p3 f20679x;
    public boolean f20680y;

    public q3(LaunchActivity launchActivity) {
        super(launchActivity);
        this.f20669f = new org.telegram.ui.Components.t5(this, 0L, 350L, gr.h);
        this.Q = new RectF();
        this.R = new ArrayList();
        this.f20662a0 = new int[2];
        this.f20664b0 = new int[2];
        this.f20666c0 = new RectF();
        this.f20667d0 = new RectF();
        this.f20668e0 = new RectF();
        this.f20670f0 = new Path();
        setWillNotDraw(false);
        this.h = new OverScroller(launchActivity);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(launchActivity);
        this.f20675n = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f20676r = viewConfiguration.getScaledMinimumFlingVelocity();
        m3 m3Var = new m3(this, this);
        this.f20678w = m3Var;
        r0.h0.j(this, m3Var);
        setImportantForAccessibility(2);
        r0.z.i(this, new mg.l(this, 12));
    }

    public static void g(ViewGroup viewGroup, float f7, final ag.e0 e0Var) {
        if (viewGroup.getWidth() > 0 && viewGroup.getHeight() > 0) {
            final SurfaceTexture d = c9.b.d();
            d.setDefaultBufferSize(viewGroup.getWidth(), viewGroup.getHeight());
            final Surface surface = new Surface(d);
            final Bitmap createBitmap = Bitmap.createBitmap(viewGroup.getWidth(), viewGroup.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas lockHardwareCanvas = surface.lockHardwareCanvas();
            lockHardwareCanvas.translate(0.0f, f7);
            viewGroup.draw(lockHardwareCanvas);
            surface.unlockCanvasAndPost(lockHardwareCanvas);
            PixelCopy.request(surface, createBitmap, new PixelCopy.OnPixelCopyFinishedListener() {
                @Override
                public final void onPixelCopyFinished(int i10) {
                    ag.e0 e0Var2 = ag.e0.this;
                    Bitmap bitmap = createBitmap;
                    Surface surface2 = surface;
                    SurfaceTexture surfaceTexture = d;
                    if (i10 == 0) {
                        e0Var2.a(bitmap);
                    } else {
                        bitmap.recycle();
                        e0Var2.a(null);
                    }
                    surface2.release();
                    surfaceTexture.release();
                }
            }, new Handler());
            return;
        }
        e0Var.a(null);
    }

    private float getScrollStep() {
        return org.telegram.messenger.i0.L(200.0f);
    }

    private void setModalAccessibility(boolean z10) {
        int i10;
        int i11;
        if (z10) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        setImportantForAccessibility(i10);
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) parent;
            for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                View childAt = viewGroup.getChildAt(i12);
                if (childAt != this) {
                    if (z10) {
                        i11 = 4;
                    } else {
                        i11 = 0;
                    }
                    childAt.setImportantForAccessibility(i11);
                }
            }
        }
        m3 m3Var = this.f20678w;
        if (m3Var != null) {
            m3Var.i();
        }
        if (z10) {
            sendAccessibilityEvent(32);
        }
    }

    public final void a(boolean z10) {
        float f7;
        if (this.U == z10) {
            return;
        }
        ValueAnimator valueAnimator = this.W;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.U = z10;
        i3 i3Var = this.f20661a;
        if (i3Var != null) {
            i3Var.f20393b = false;
            i3Var.invalidate();
        }
        setModalAccessibility(z10);
        invalidate();
        float f10 = this.V;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.W = ofFloat;
        ofFloat.addUpdateListener(new j3(this, 0));
        this.W.addListener(new bg.e(this, 22));
        this.W.setInterpolator(gr.h);
        this.W.setDuration(320L);
        this.W.start();
    }

    public final void b(n3 n3Var) {
        ValueAnimator valueAnimator;
        if (this.f20661a == null) {
            return;
        }
        if (this.f20663b != null && (valueAnimator = this.d) != null) {
            valueAnimator.end();
            this.d = null;
        }
        this.f20663b = n3Var;
        n3Var.b(false);
        ValueAnimator valueAnimator2 = this.d;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        h3 c10 = n3Var.c();
        i3 i3Var = this.f20661a;
        ArrayList<h3> tabs = i3Var.getTabs();
        ArrayList<f3> tabDrawables = i3Var.getTabDrawables();
        f3 f3Var = new f3(i3Var, c10);
        f3Var.e.e(true, -1.0f);
        f3Var.f20301f.e(true, 0.0f);
        tabDrawables.add(f3Var);
        tabs.add(0, c10);
        for (int i10 = 0; i10 < tabDrawables.size(); i10++) {
            f3 f3Var2 = tabDrawables.get(i10);
            int indexOf = tabs.indexOf(f3Var2.f20298a);
            f3Var2.d = indexOf;
            if (indexOf >= 0) {
                f3Var2.f20300c = indexOf;
            }
        }
        i3Var.n();
        i3Var.o(true);
        i3Var.invalidate();
        g3 g3Var = i3Var.e;
        if (g3Var != null) {
            g3Var.i();
        }
        this.f20665c = f3Var;
        post(new lg.s(n3Var, 23));
        invalidate();
        this.e = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.d = ofFloat;
        ofFloat.addUpdateListener(new j3(this, 2));
        this.d.addListener(new g1(this, c10, n3Var, 1));
        org.telegram.messenger.i0.n(this.d, 220.0d, 30.0d);
        ValueAnimator valueAnimator3 = this.d;
        valueAnimator3.setDuration(((float) valueAnimator3.getDuration()) * 1.1f);
        this.d.start();
    }

    public final float c(boolean z10) {
        return (e(z10) - Math.min(3.0f, e(z10))) - (Utilities.i(4.0f - e(z10), 0.5f, 0.0f) * (Math.min(3.0f, e(z10)) / 3.0f));
    }

    @Override
    public final void computeScroll() {
        OverScroller overScroller = this.h;
        if (overScroller.computeScrollOffset()) {
            setScrollOffset(overScroller.getCurrY() / getScrollStep());
            postInvalidateOnAnimation();
        }
    }

    public final float d(boolean z10) {
        return Utilities.i(e(z10), 1.0f, 0.0f) * ((-getScrollWindow()) / 3.0f);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF;
        float f7;
        ArrayList arrayList;
        float f10;
        float scrollMin;
        int i10;
        float f11;
        float f12;
        int i11;
        int i12;
        int i13;
        float f13;
        float f14;
        ArrayList arrayList2;
        float f15;
        RectF rectF2;
        int i14;
        float f16;
        float f17;
        float f18;
        int i15;
        q3 q3Var = this;
        super.dispatchDraw(canvas);
        n3 n3Var = q3Var.f20663b;
        float f19 = 1.0f;
        int i16 = 1;
        int[] iArr = q3Var.f20662a0;
        int[] iArr2 = q3Var.f20664b0;
        int i17 = 0;
        RectF rectF3 = q3Var.f20666c0;
        if (n3Var != null) {
            q3Var.getLocationOnScreen(iArr2);
            q3Var.f20661a.getLocationOnScreen(iArr);
            q3Var.f20661a.d(rectF3, 0.0f);
            rectF3.offset(iArr[0] - iArr2[0], iArr[1] - iArr2[1]);
            canvas.save();
            canvas.clipRect(0, 0, q3Var.getMeasuredWidth(), q3Var.getMeasuredHeight() - q3Var.f20677s);
            o3 mo30d = q3Var.f20663b.mo30d();
            float f20 = q3Var.e;
            RectF rectF4 = q3Var.f20668e0;
            float x10 = mo30d.x(canvas, rectF3, f20, rectF4, f20);
            if (q3Var.f20665c != null) {
                Path path = q3Var.f20670f0;
                path.rewind();
                path.addRoundRect(rectF4, x10, x10, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                float z10 = sc.e.z(1.0f, q3Var.e, org.telegram.messenger.i0.L(50.0f), rectF4.top);
                rectF3.set(rectF4.left, z10, rectF4.right, org.telegram.messenger.i0.L(50.0f) + z10);
                q3Var.f20661a.setupTab(q3Var.f20665c);
                q3Var.f20665c.a(canvas, rectF3, x10, q3Var.e, 1.0f);
                rectF = rectF3;
                canvas.restore();
            } else {
                rectF = rectF3;
            }
            canvas.restore();
        } else {
            rectF = rectF3;
        }
        if (q3Var.V <= 0.0f) {
            return;
        }
        canvas.save();
        View view = q3Var.S;
        RectF rectF5 = q3Var.Q;
        if (view != null) {
            view.getLocationOnScreen(iArr);
            q3Var.getLocationOnScreen(iArr2);
            rectF5.set(iArr[0] - iArr2[0], iArr[1] - iArr2[1], q3Var.S.getWidth() + i15, q3Var.S.getHeight() + (iArr[1] - iArr2[1]));
        } else {
            iArr[1] = 0;
            iArr[0] = 0;
            rectF5.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        canvas.clipRect(rectF5);
        canvas.translate(rectF5.left, rectF5.top);
        float width = rectF5.width();
        float height = rectF5.height();
        float f21 = 255.0f;
        if (q3Var.M != null) {
            q3Var.P.reset();
            float width2 = rectF5.width() / q3Var.M.getWidth();
            q3Var.P.postScale(width2, width2);
            q3Var.N.setLocalMatrix(q3Var.P);
            q3Var.O.setAlpha((int) (q3Var.V * 255.0f));
            canvas.drawRect(0.0f, 0.0f, width, height, q3Var.O);
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, width, height, 255, 31);
        float f22 = width;
        float L = org.telegram.messenger.i0.L(55.0f) + org.telegram.messenger.i0.L(40.0f) + org.telegram.messenger.i0.f16020m;
        float L2 = org.telegram.messenger.i0.L(68.0f);
        int min = (int) Math.min(org.telegram.messenger.i0.L(340.0f), 0.95f * f22);
        if (org.telegram.messenger.i0.Q1()) {
            f7 = rectF5.height() * 0.5f;
        } else {
            f7 = 0.75f * height;
        }
        int i18 = (int) f7;
        float f23 = f22 / 2.0f;
        float f24 = 0.0f;
        int i19 = 0;
        while (true) {
            arrayList = q3Var.R;
            f10 = f21;
            if (i19 >= arrayList.size()) {
                break;
            }
            if (((p3) arrayList.get(i19)).d.d >= 0) {
                f18 = 1.0f;
            } else {
                f18 = 0.0f;
            }
            f24 += f18;
            i19++;
            f21 = f10;
        }
        float e = q3Var.f20669f.e(false, f24);
        if (q3Var.getScrollWindow() <= 0.0f) {
            scrollMin = 0.0f;
        } else {
            scrollMin = ((q3Var.getScrollMin() - q3Var.getScrollOffset()) / (q3Var.getScrollWindow() * 0.15f)) * 0.2f;
        }
        float T1 = org.telegram.messenger.i0.T1(0.0f, 1.0f - Utilities.i(scrollMin, 1.0f, 0.0f), q3Var.V);
        int i20 = 0;
        while (true) {
            i10 = i16;
            if (i20 >= arrayList.size() + 1) {
                break;
            }
            if (i20 == arrayList.size()) {
                f16 = L;
                f12 = L2;
                i12 = min;
                f13 = T1;
                i11 = i20;
                f14 = f22;
                arrayList2 = arrayList;
                f15 = e;
                rectF2 = rectF;
                i14 = i18;
                f17 = f19;
            } else {
                p3 p3Var = (p3) arrayList.get(i20);
                int i21 = i17;
                if (i20 < arrayList.size()) {
                    f3 f3Var = p3Var.d;
                }
                f3 f3Var2 = p3Var.d;
                float f25 = f19;
                float[] fArr = p3Var.f20640g;
                Matrix matrix = p3Var.f20639f;
                float f26 = L;
                float[] fArr2 = p3Var.h;
                if (f3Var2 == null) {
                    f11 = f25;
                } else {
                    f11 = T1;
                }
                float c10 = (e - f25) - f3Var2.c();
                f12 = L2;
                i11 = i20;
                float max = (c10 - Math.max(q3Var.getScrollMin(), q3Var.getScrollOffset())) / q3Var.getScrollWindow();
                Math.max(max, 0.0f);
                Math.max(Math.min(max, f25), -4.0f);
                float min2 = (Math.min(5.0f, c10) * org.telegram.messenger.i0.L(6.0f)) + f26;
                float f27 = i18;
                float f28 = ((((height - f12) - (0.26f * f27)) - min2) * max) + min2;
                float f29 = min / 2.0f;
                i12 = min;
                RectF rectF6 = q3Var.f20667d0;
                rectF6.set(f23 - f29, f28, f23 + f29, f27 + f28);
                if ((rectF6.top > height || rectF6.bottom < 0.0f || T1 < 0.1f) && c10 < e - 3.0f) {
                    i13 = i10;
                } else {
                    i13 = i21;
                }
                int i22 = i13;
                q3Var.f20661a.d(rectF, Utilities.i(f3Var2.c(), 1.0f, 0.0f));
                rectF.offset(q3Var.f20661a.getX(), q3Var.f20661a.getY());
                org.telegram.messenger.i0.c2(rectF, rectF6, T1, rectF6);
                i3 i3Var = q3Var.f20661a;
                if (i3Var != null) {
                    i3Var.setupTab(f3Var2);
                }
                if (rectF6.top > height || rectF6.bottom < 0.0f) {
                    f13 = T1;
                    f14 = f22;
                    arrayList2 = arrayList;
                    f15 = e;
                    rectF2 = rectF;
                    i14 = i18;
                    f16 = f26;
                    f17 = 1.0f;
                } else {
                    canvas.save();
                    p3Var.f20636a.set(rectF6);
                    matrix.reset();
                    fArr[i21] = rectF6.left;
                    float f30 = rectF6.top;
                    fArr[i10] = f30;
                    float f31 = rectF6.right;
                    fArr[2] = f31;
                    fArr[3] = f30;
                    fArr[4] = f31;
                    fArr[5] = (rectF6.height() * 1.0f) + f30;
                    fArr[6] = rectF6.left;
                    fArr[7] = (rectF6.height() * 1.0f) + rectF6.top;
                    fArr2[i21] = rectF6.left;
                    fArr2[i10] = rectF6.top - org.telegram.messenger.i0.L(0.0f);
                    fArr2[2] = rectF6.right;
                    fArr2[3] = rectF6.top - org.telegram.messenger.i0.L(0.0f);
                    float f32 = f11 * 1.0f;
                    fArr2[4] = (org.telegram.messenger.i0.T1(1.0f, 0.83f, f32) * (rectF6.width() / 2.0f)) + rectF6.centerX();
                    fArr2[5] = (org.telegram.messenger.i0.T1(1.0f, 0.6f, f32) * ((rectF6.height() * 1.0f) + org.telegram.messenger.i0.L(0.0f))) + (rectF6.top - org.telegram.messenger.i0.L(0.0f));
                    fArr2[6] = rectF6.centerX() - (org.telegram.messenger.i0.T1(1.0f, 0.83f, f32) * (rectF6.width() / 2.0f));
                    fArr2[7] = (org.telegram.messenger.i0.T1(1.0f, 0.6f, f32) * ((rectF6.height() * 1.0f) + org.telegram.messenger.i0.L(0.0f))) + (rectF6.top - org.telegram.messenger.i0.L(0.0f));
                    matrix.setPolyToPoly(p3Var.f20640g, 0, p3Var.h, 0, 4);
                    canvas.concat(matrix);
                    float T12 = org.telegram.messenger.i0.T1(f3Var2.b(), 1.0f, q3Var.V);
                    float T13 = org.telegram.messenger.i0.T1(Utilities.l((c10 - e) + 2.0f), 1.0f, Utilities.l((f11 - 0.1f) / 0.8f));
                    RadialGradient radialGradient = p3Var.f20648p;
                    Paint paint = p3Var.f20647o;
                    Paint paint2 = p3Var.f20650r;
                    Matrix matrix2 = p3Var.f20649q;
                    h3 h3Var = p3Var.f20638c;
                    f13 = T1;
                    Path path2 = p3Var.f20646n;
                    arrayList2 = arrayList;
                    Paint paint3 = p3Var.e;
                    f15 = e;
                    RectF rectF7 = p3Var.f20645m;
                    rectF2 = rectF;
                    Paint paint4 = p3Var.f20644l;
                    i14 = i18;
                    f14 = f22;
                    f17 = 1.0f;
                    float i23 = Utilities.i(1.0f - ((Math.abs(p3Var.f20641i) - 0.3f) / 0.7f), 1.0f, 0.0f) * T12;
                    if (i23 <= 0.0f) {
                        f16 = f26;
                    } else {
                        float f33 = f32 * 1.0f;
                        float T14 = org.telegram.messenger.i0.T1(1.0f, 1.3f, f33);
                        float currentActionBarHeight = ((l.getCurrentActionBarHeight() + org.telegram.messenger.i0.f16020m) - org.telegram.messenger.i0.L(50.0f)) * 0.0f;
                        canvas.save();
                        canvas.rotate(p3Var.f20641i * 20.0f, (p3Var.f20641i * org.telegram.messenger.i0.L(50.0f)) + rectF6.centerX(), rectF6.bottom + org.telegram.messenger.i0.L(350.0f));
                        float a2 = p3Var.f20643k.a(0.01f);
                        canvas.scale(a2, a2, rectF6.centerX(), rectF6.centerY());
                        float W1 = org.telegram.messenger.i0.W1(f32, org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(18.0f));
                        if (i22 != 0) {
                            paint4.setColor(i21);
                            paint4.setShadowLayer(org.telegram.messenger.i0.L(30.0f), 0.0f, org.telegram.messenger.i0.L(10.0f), t6.r1(i23 * f32 * 1.0f, 536870912));
                            canvas.drawRoundRect(rectF6, W1, W1, paint4);
                            paint3.setAlpha((int) (i23 * f10));
                            canvas.drawRoundRect(rectF6, W1, W1, paint3);
                            canvas.restore();
                            f16 = f26;
                            f17 = 1.0f;
                        } else {
                            path2.rewind();
                            path2.addRoundRect(rectF6, W1, W1, Path.Direction.CW);
                            canvas.save();
                            paint4.setColor(0);
                            paint4.setShadowLayer(org.telegram.messenger.i0.L(30.0f), 0.0f, org.telegram.messenger.i0.L(10.0f), t6.r1(i23 * f32 * 1.0f, 536870912));
                            canvas.drawPath(path2, paint4);
                            canvas.clipPath(path2);
                            float f34 = i23 * f10 * f32;
                            int i24 = (int) f34;
                            paint3.setAlpha(i24);
                            canvas.drawRoundRect(rectF6, W1, W1, paint3);
                            canvas.save();
                            canvas.translate(rectF6.left, sc.e.d(org.telegram.messenger.i0.L(50.0f), T14, rectF6.top, currentActionBarHeight));
                            canvas.scale(1.0f, org.telegram.messenger.i0.T1(1.0f, 1.25f, f33));
                            if (h3Var != null && h3Var.f20363m != null) {
                                float width3 = rectF6.width() / h3Var.f20363m.getWidth();
                                canvas.scale(width3, width3);
                                paint.setAlpha(i24);
                                canvas.drawBitmap(h3Var.f20363m, 0.0f, 0.0f, paint);
                            }
                            canvas.restore();
                            canvas.save();
                            paint2.setAlpha((int) (f34 * 1.0f));
                            matrix2.reset();
                            float height2 = rectF6.height() / f10;
                            matrix2.postScale(height2, height2);
                            matrix2.postTranslate(rectF6.centerX(), rectF6.top);
                            radialGradient.setLocalMatrix(matrix2);
                            paint2.setShader(radialGradient);
                            canvas.drawRect(rectF6, paint2);
                            canvas.restore();
                            rectF7.set(rectF6);
                            rectF7.bottom = Math.min(rectF6.height(), org.telegram.messenger.i0.L(50.0f)) + rectF7.top;
                            rectF7.offset(0.0f, currentActionBarHeight);
                            p3Var.d.f20316w = f32;
                            f17 = 1.0f;
                            canvas.scale(1.0f, T14, rectF7.centerX(), rectF7.top);
                            f16 = f26;
                            p3Var.d.a(canvas, rectF7, W1, i23 * i23, T13);
                            canvas.restore();
                            canvas.restore();
                        }
                    }
                    canvas.restore();
                }
            }
            i20 = i11 + 1;
            L = f16;
            f19 = f17;
            i16 = i10;
            T1 = f13;
            arrayList = arrayList2;
            e = f15;
            rectF = rectF2;
            i18 = i14;
            L2 = f12;
            min = i12;
            f22 = f14;
            i17 = 0;
            q3Var = this;
        }
        float f35 = L;
        float f36 = f22;
        canvas.save();
        if (this.f20674j0 == null) {
            this.f20674j0 = new li.k(23);
        }
        RectF rectF8 = org.telegram.messenger.i0.P;
        rectF8.set(0.0f, 0.0f, f36, f35);
        this.f20674j0.o(canvas, rectF8, i10, this.V);
        canvas.restore();
        canvas.restore();
        if (this.f20671g0 == null) {
            this.f20671g0 = new qz0(cd.L0(2131753099, null), 14.0f, org.telegram.messenger.i0.o());
        }
        if (this.f20673i0 == null || this.f20672h0 != t6.I.q()) {
            boolean q6 = t6.I.q();
            this.f20672h0 = q6;
            if (q6) {
                this.f20673i0 = t6.k0(64, 64, 64, 64, 553648127, 872415231, 872415231);
            } else {
                this.f20673i0 = t6.k0(64, 64, 64, 64, 771751936, 1140850688, 1140850688);
            }
            this.f20673i0.setCallback(this);
        }
        float L3 = this.f20671g0.f29774c + org.telegram.messenger.i0.L(24.0f);
        float f37 = (f36 - L3) / 2.0f;
        this.f20673i0.setBounds((int) f37, (int) ((f35 - (org.telegram.messenger.i0.L(95.0f) / 2.0f)) - org.telegram.messenger.i0.L(14.0f)), (int) ((f36 + L3) / 2.0f), (int) ((f35 - (org.telegram.messenger.i0.L(95.0f) / 2.0f)) + org.telegram.messenger.i0.L(14.0f)));
        this.f20673i0.setAlpha((int) (this.V * f10));
        this.f20673i0.draw(canvas);
        this.f20671g0.c(f37 + org.telegram.messenger.i0.L(12.0f), f35 - (org.telegram.messenger.i0.L(95.0f) / 2.0f), this.V, -1, canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        m3 m3Var;
        if (this.V > 0.0f && (m3Var = this.f20678w) != null && m3Var.f(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.q3.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public final float e(boolean z10) {
        float f7;
        float f10 = 0.0f;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.R;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (((p3) arrayList.get(i10)).d.d >= 0) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            f10 += f7;
            i10++;
        }
        if (z10) {
            return this.f20669f.e(false, f10);
        }
        return f10;
    }

    public final void f() {
        float f7;
        f3 f3Var;
        i3 i3Var = this.f20661a;
        if (i3Var != null && (i3Var.getParent() instanceof View)) {
            HashSet hashSet = xh.m2.f53871a1;
            if (!hashSet.isEmpty()) {
                Iterator it = new HashSet(hashSet).iterator();
                while (it.hasNext()) {
                    ((xh.m2) it.next()).o(true);
                }
                org.telegram.messenger.i0.h3(new lg.s(this, 24), 100L);
                return;
            }
            ValueAnimator valueAnimator = this.d;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.d = null;
            }
            View view = (View) this.f20661a.getParent();
            this.S = view;
            int[] iArr = this.f20662a0;
            if (view != null) {
                view.getLocationOnScreen(iArr);
            } else {
                iArr[1] = 0;
                iArr[0] = 0;
            }
            int[] iArr2 = this.f20664b0;
            getLocationOnScreen(iArr2);
            int i10 = iArr[0] - iArr2[0];
            int i11 = iArr[1] - iArr2[1];
            this.Q.set(i10, iArr[1] - iArr2[1], this.S.getWidth() + i10, this.S.getHeight() + i11);
            View view2 = this.S;
            org.telegram.messenger.i0.m0 = true;
            this.M = org.telegram.messenger.i0.j2(14.0f, 14, view2);
            org.telegram.messenger.i0.m0 = false;
            Paint paint = new Paint(1);
            this.O = paint;
            Bitmap bitmap = this.M;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            this.N = bitmapShader;
            paint.setShader(bitmapShader);
            ColorMatrix colorMatrix = new ColorMatrix();
            if (t6.I.q()) {
                f7 = 0.08f;
            } else {
                f7 = 0.25f;
            }
            org.telegram.messenger.i0.i(colorMatrix, f7);
            this.O.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            this.P = new Matrix();
            ArrayList arrayList = this.R;
            arrayList.clear();
            ArrayList<h3> tabs = this.f20661a.getTabs();
            ArrayList<f3> tabDrawables = this.f20661a.getTabDrawables();
            for (int size = tabs.size() - 1; size >= 0; size--) {
                h3 h3Var = tabs.get(size);
                int i12 = 0;
                while (true) {
                    if (i12 < tabDrawables.size()) {
                        f3Var = tabDrawables.get(i12);
                        if (f3Var.f20298a == h3Var) {
                            break;
                        }
                        i12++;
                    } else {
                        f3Var = null;
                        break;
                    }
                }
                if (f3Var != null) {
                    arrayList.add(new p3(this, h3Var, f3Var));
                }
            }
            this.f20669f.e(true, arrayList.size());
            setScrollOffset(getScrollMax());
            a(true);
        }
    }

    public float getScrollMax() {
        return c(true);
    }

    public float getScrollMin() {
        return d(true);
    }

    public float getScrollOffset() {
        return this.L;
    }

    public float getScrollRange() {
        return e(true);
    }

    public float getScrollWindow() {
        return Math.min(3.0f, getScrollRange());
    }

    public final void h(float f7) {
        ValueAnimator valueAnimator = this.T;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.T = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.L, f7);
        this.T = ofFloat;
        ofFloat.addUpdateListener(new j3(this, 1));
        this.T.setDuration(250L);
        this.T.setInterpolator(gr.h);
        this.T.start();
    }

    public void setScrollOffset(float f7) {
        this.L = f7;
    }

    public void setTabsView(i3 i3Var) {
        this.f20661a = i3Var;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f20673i0 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public void setSlowerDismiss(boolean z10) {
    }
}
