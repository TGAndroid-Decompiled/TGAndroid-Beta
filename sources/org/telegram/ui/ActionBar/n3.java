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
import org.telegram.messenger.gd;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.vy0;
import org.telegram.ui.LaunchActivity;
public final class n3 extends View {
    public float E;
    public float F;
    public long G;
    public boolean H;
    public boolean I;
    public VelocityTracker J;
    public float K;
    public boolean L;
    public float M;
    public Bitmap N;
    public BitmapShader O;
    public Paint P;
    public Matrix Q;
    public final RectF R;
    public final ArrayList S;
    public View T;
    public ValueAnimator U;
    public boolean V;
    public float W;
    public g3 f29270a;
    public ValueAnimator f29271a0;
    public k3 f29272b;
    public final int[] f29273b0;
    public d3 f29274c;
    public final int[] f29275c0;
    public ValueAnimator d;
    public final RectF f29276d0;
    public float f29277e;
    public final RectF f29278e0;
    public final org.telegram.ui.Components.c6 f29279f;
    public final RectF f29280f0;
    public final Path f29281g0;
    public final OverScroller h;
    public vy0 f29282h0;
    public boolean f29283i0;
    public org.telegram.ui.Cells.y f29284j0;
    public h6.m f29285k0;
    public final int f29286n;
    public final int f29287r;
    public int f29288s;
    public final hi.d6 f29289w;
    public m3 f29290x;
    public boolean f29291y;

    public n3(LaunchActivity launchActivity) {
        super(launchActivity);
        this.f29279f = new org.telegram.ui.Components.c6(this, 0L, 350L, lr.h);
        this.R = new RectF();
        this.S = new ArrayList();
        this.f29273b0 = new int[2];
        this.f29275c0 = new int[2];
        this.f29276d0 = new RectF();
        this.f29278e0 = new RectF();
        this.f29280f0 = new RectF();
        this.f29281g0 = new Path();
        setWillNotDraw(false);
        this.h = new OverScroller(launchActivity);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(launchActivity);
        this.f29286n = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f29287r = viewConfiguration.getScaledMinimumFlingVelocity();
        hi.d6 d6Var = new hi.d6(this, this);
        this.f29289w = d6Var;
        r0.i0.j(this, d6Var);
        setImportantForAccessibility(2);
        r0.a0.i(this, new p(this, 4));
    }

    public static void g(ViewGroup viewGroup, float f10, final c3 c3Var) {
        if (viewGroup.getWidth() > 0 && viewGroup.getHeight() > 0) {
            final SurfaceTexture d = f9.b.d();
            d.setDefaultBufferSize(viewGroup.getWidth(), viewGroup.getHeight());
            final Surface surface = new Surface(d);
            final Bitmap createBitmap = Bitmap.createBitmap(viewGroup.getWidth(), viewGroup.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas lockHardwareCanvas = surface.lockHardwareCanvas();
            lockHardwareCanvas.translate(0.0f, f10);
            viewGroup.draw(lockHardwareCanvas);
            surface.unlockCanvasAndPost(lockHardwareCanvas);
            PixelCopy.request(surface, createBitmap, new PixelCopy.OnPixelCopyFinishedListener() {
                @Override
                public final void onPixelCopyFinished(int i7) {
                    c3 c3Var2 = c3.this;
                    Bitmap bitmap = createBitmap;
                    Surface surface2 = surface;
                    SurfaceTexture surfaceTexture = d;
                    if (i7 == 0) {
                        c3Var2.a(bitmap);
                    } else {
                        bitmap.recycle();
                        c3Var2.a(null);
                    }
                    surface2.release();
                    surfaceTexture.release();
                }
            }, new Handler());
            return;
        }
        c3Var.a(null);
    }

    private float getScrollStep() {
        return org.telegram.messenger.g0.L(200.0f);
    }

    private void setModalAccessibility(boolean z10) {
        int i7;
        int i10;
        if (z10) {
            i7 = 1;
        } else {
            i7 = 2;
        }
        setImportantForAccessibility(i7);
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) parent;
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                View childAt = viewGroup.getChildAt(i11);
                if (childAt != this) {
                    if (z10) {
                        i10 = 4;
                    } else {
                        i10 = 0;
                    }
                    childAt.setImportantForAccessibility(i10);
                }
            }
        }
        hi.d6 d6Var = this.f29289w;
        if (d6Var != null) {
            d6Var.i();
        }
        if (z10) {
            sendAccessibilityEvent(32);
        }
    }

    public final void a(boolean z10) {
        float f10;
        if (this.V == z10) {
            return;
        }
        ValueAnimator valueAnimator = this.f29271a0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.V = z10;
        g3 g3Var = this.f29270a;
        if (g3Var != null) {
            g3Var.f28962b = false;
            g3Var.invalidate();
        }
        setModalAccessibility(z10);
        invalidate();
        float f11 = this.W;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f29271a0 = ofFloat;
        ofFloat.addUpdateListener(new h3(this, 0));
        this.f29271a0.addListener(new ki.n3(this, 12));
        this.f29271a0.setInterpolator(lr.h);
        this.f29271a0.setDuration(320L);
        this.f29271a0.start();
    }

    public final void b(k3 k3Var) {
        ValueAnimator valueAnimator;
        if (this.f29270a == null) {
            return;
        }
        if (this.f29272b != null && (valueAnimator = this.d) != null) {
            valueAnimator.end();
            this.d = null;
        }
        this.f29272b = k3Var;
        k3Var.b(false);
        ValueAnimator valueAnimator2 = this.d;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        f3 c10 = k3Var.c();
        g3 g3Var = this.f29270a;
        ArrayList<f3> tabs = g3Var.getTabs();
        ArrayList<d3> tabDrawables = g3Var.getTabDrawables();
        d3 d3Var = new d3(g3Var, c10);
        d3Var.f28837e.e(true, -1.0f);
        d3Var.f28838f.e(true, 0.0f);
        tabDrawables.add(d3Var);
        tabs.add(0, c10);
        for (int i7 = 0; i7 < tabDrawables.size(); i7++) {
            d3 d3Var2 = tabDrawables.get(i7);
            int indexOf = tabs.indexOf(d3Var2.f28834a);
            d3Var2.d = indexOf;
            if (indexOf >= 0) {
                d3Var2.f28836c = indexOf;
            }
        }
        g3Var.n();
        g3Var.o(true);
        g3Var.invalidate();
        e3 e3Var = g3Var.f28964e;
        if (e3Var != null) {
            e3Var.i();
        }
        this.f29274c = d3Var;
        post(new oi.a2(k3Var, 10));
        invalidate();
        this.f29277e = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.d = ofFloat;
        ofFloat.addUpdateListener(new h3(this, 2));
        this.d.addListener(new fi.a3(this, c10, k3Var, 2));
        org.telegram.messenger.g0.n(this.d, 220.0d, 30.0d);
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
        float f10;
        ArrayList arrayList;
        float f11;
        float scrollMin;
        int i7;
        float f12;
        float f13;
        int i10;
        int i11;
        int i12;
        float f14;
        float f15;
        ArrayList arrayList2;
        float f16;
        RectF rectF2;
        int i13;
        float f17;
        float f18;
        float f19;
        int i14;
        n3 n3Var = this;
        super.dispatchDraw(canvas);
        k3 k3Var = n3Var.f29272b;
        float f20 = 1.0f;
        int i15 = 1;
        int[] iArr = n3Var.f29273b0;
        int[] iArr2 = n3Var.f29275c0;
        int i16 = 0;
        RectF rectF3 = n3Var.f29276d0;
        if (k3Var != null) {
            n3Var.getLocationOnScreen(iArr2);
            n3Var.f29270a.getLocationOnScreen(iArr);
            n3Var.f29270a.d(rectF3, 0.0f);
            rectF3.offset(iArr[0] - iArr2[0], iArr[1] - iArr2[1]);
            canvas.save();
            canvas.clipRect(0, 0, n3Var.getMeasuredWidth(), n3Var.getMeasuredHeight() - n3Var.f29288s);
            l3 mo25d = n3Var.f29272b.mo25d();
            float f21 = n3Var.f29277e;
            RectF rectF4 = n3Var.f29280f0;
            float z10 = mo25d.z(canvas, rectF3, f21, rectF4, f21);
            if (n3Var.f29274c != null) {
                Path path = n3Var.f29281g0;
                path.rewind();
                path.addRoundRect(rectF4, z10, z10, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                float t6 = com.google.android.gms.internal.vision.e2.t(1.0f, n3Var.f29277e, org.telegram.messenger.g0.L(50.0f), rectF4.top);
                rectF3.set(rectF4.left, t6, rectF4.right, org.telegram.messenger.g0.L(50.0f) + t6);
                n3Var.f29270a.setupTab(n3Var.f29274c);
                n3Var.f29274c.a(canvas, rectF3, z10, n3Var.f29277e, 1.0f);
                rectF = rectF3;
                canvas.restore();
            } else {
                rectF = rectF3;
            }
            canvas.restore();
        } else {
            rectF = rectF3;
        }
        if (n3Var.W <= 0.0f) {
            return;
        }
        canvas.save();
        View view = n3Var.T;
        RectF rectF5 = n3Var.R;
        if (view != null) {
            view.getLocationOnScreen(iArr);
            n3Var.getLocationOnScreen(iArr2);
            rectF5.set(iArr[0] - iArr2[0], iArr[1] - iArr2[1], n3Var.T.getWidth() + i14, n3Var.T.getHeight() + (iArr[1] - iArr2[1]));
        } else {
            iArr[1] = 0;
            iArr[0] = 0;
            rectF5.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        canvas.clipRect(rectF5);
        canvas.translate(rectF5.left, rectF5.top);
        float width = rectF5.width();
        float height = rectF5.height();
        float f22 = 255.0f;
        if (n3Var.N != null) {
            n3Var.Q.reset();
            float width2 = rectF5.width() / n3Var.N.getWidth();
            n3Var.Q.postScale(width2, width2);
            n3Var.O.setLocalMatrix(n3Var.Q);
            n3Var.P.setAlpha((int) (n3Var.W * 255.0f));
            canvas.drawRect(0.0f, 0.0f, width, height, n3Var.P);
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, width, height, 255, 31);
        float f23 = width;
        float L = org.telegram.messenger.g0.L(55.0f) + org.telegram.messenger.g0.L(40.0f) + org.telegram.messenger.g0.f24112m;
        float L2 = org.telegram.messenger.g0.L(68.0f);
        int min = (int) Math.min(org.telegram.messenger.g0.L(340.0f), 0.95f * f23);
        if (org.telegram.messenger.g0.Q1()) {
            f10 = rectF5.height() * 0.5f;
        } else {
            f10 = 0.75f * height;
        }
        int i17 = (int) f10;
        float f24 = f23 / 2.0f;
        float f25 = 0.0f;
        int i18 = 0;
        while (true) {
            arrayList = n3Var.S;
            f11 = f22;
            if (i18 >= arrayList.size()) {
                break;
            }
            if (((m3) arrayList.get(i18)).d.d >= 0) {
                f19 = 1.0f;
            } else {
                f19 = 0.0f;
            }
            f25 += f19;
            i18++;
            f22 = f11;
        }
        float e10 = n3Var.f29279f.e(false, f25);
        if (n3Var.getScrollWindow() <= 0.0f) {
            scrollMin = 0.0f;
        } else {
            scrollMin = ((n3Var.getScrollMin() - n3Var.getScrollOffset()) / (n3Var.getScrollWindow() * 0.15f)) * 0.2f;
        }
        float T1 = org.telegram.messenger.g0.T1(0.0f, 1.0f - Utilities.i(scrollMin, 1.0f, 0.0f), n3Var.W);
        int i19 = 0;
        while (true) {
            i7 = i15;
            if (i19 >= arrayList.size() + 1) {
                break;
            }
            if (i19 == arrayList.size()) {
                f17 = L;
                f13 = L2;
                i11 = min;
                f14 = T1;
                i10 = i19;
                f15 = f23;
                arrayList2 = arrayList;
                f16 = e10;
                rectF2 = rectF;
                i13 = i17;
                f18 = f20;
            } else {
                m3 m3Var = (m3) arrayList.get(i19);
                int i20 = i16;
                if (i19 < arrayList.size()) {
                    d3 d3Var = m3Var.d;
                }
                d3 d3Var2 = m3Var.d;
                float f26 = f20;
                float[] fArr = m3Var.f29220g;
                Matrix matrix = m3Var.f29219f;
                float f27 = L;
                float[] fArr2 = m3Var.h;
                if (d3Var2 == null) {
                    f12 = f26;
                } else {
                    f12 = T1;
                }
                float c10 = (e10 - f26) - d3Var2.c();
                f13 = L2;
                i10 = i19;
                float max = (c10 - Math.max(n3Var.getScrollMin(), n3Var.getScrollOffset())) / n3Var.getScrollWindow();
                Math.max(max, 0.0f);
                Math.max(Math.min(max, f26), -4.0f);
                float min2 = (Math.min(5.0f, c10) * org.telegram.messenger.g0.L(6.0f)) + f27;
                float f28 = i17;
                float f29 = ((((height - f13) - (0.26f * f28)) - min2) * max) + min2;
                float f30 = min / 2.0f;
                i11 = min;
                RectF rectF6 = n3Var.f29278e0;
                rectF6.set(f24 - f30, f29, f24 + f30, f28 + f29);
                if ((rectF6.top > height || rectF6.bottom < 0.0f || T1 < 0.1f) && c10 < e10 - 3.0f) {
                    i12 = i7;
                } else {
                    i12 = i20;
                }
                int i21 = i12;
                n3Var.f29270a.d(rectF, Utilities.i(d3Var2.c(), 1.0f, 0.0f));
                rectF.offset(n3Var.f29270a.getX(), n3Var.f29270a.getY());
                org.telegram.messenger.g0.c2(rectF, rectF6, T1, rectF6);
                g3 g3Var = n3Var.f29270a;
                if (g3Var != null) {
                    g3Var.setupTab(d3Var2);
                }
                if (rectF6.top > height || rectF6.bottom < 0.0f) {
                    f14 = T1;
                    f15 = f23;
                    arrayList2 = arrayList;
                    f16 = e10;
                    rectF2 = rectF;
                    i13 = i17;
                    f17 = f27;
                    f18 = 1.0f;
                } else {
                    canvas.save();
                    m3Var.f29215a.set(rectF6);
                    matrix.reset();
                    fArr[i20] = rectF6.left;
                    float f31 = rectF6.top;
                    fArr[i7] = f31;
                    float f32 = rectF6.right;
                    fArr[2] = f32;
                    fArr[3] = f31;
                    fArr[4] = f32;
                    fArr[5] = (rectF6.height() * 1.0f) + f31;
                    fArr[6] = rectF6.left;
                    fArr[7] = (rectF6.height() * 1.0f) + rectF6.top;
                    fArr2[i20] = rectF6.left;
                    fArr2[i7] = rectF6.top - org.telegram.messenger.g0.L(0.0f);
                    fArr2[2] = rectF6.right;
                    fArr2[3] = rectF6.top - org.telegram.messenger.g0.L(0.0f);
                    float f33 = f12 * 1.0f;
                    fArr2[4] = (org.telegram.messenger.g0.T1(1.0f, 0.83f, f33) * (rectF6.width() / 2.0f)) + rectF6.centerX();
                    fArr2[5] = (org.telegram.messenger.g0.T1(1.0f, 0.6f, f33) * ((rectF6.height() * 1.0f) + org.telegram.messenger.g0.L(0.0f))) + (rectF6.top - org.telegram.messenger.g0.L(0.0f));
                    fArr2[6] = rectF6.centerX() - (org.telegram.messenger.g0.T1(1.0f, 0.83f, f33) * (rectF6.width() / 2.0f));
                    fArr2[7] = (org.telegram.messenger.g0.T1(1.0f, 0.6f, f33) * ((rectF6.height() * 1.0f) + org.telegram.messenger.g0.L(0.0f))) + (rectF6.top - org.telegram.messenger.g0.L(0.0f));
                    matrix.setPolyToPoly(m3Var.f29220g, 0, m3Var.h, 0, 4);
                    canvas.concat(matrix);
                    float T12 = org.telegram.messenger.g0.T1(d3Var2.b(), 1.0f, n3Var.W);
                    float T13 = org.telegram.messenger.g0.T1(Utilities.l((c10 - e10) + 2.0f), 1.0f, Utilities.l((f12 - 0.1f) / 0.8f));
                    RadialGradient radialGradient = m3Var.f29228p;
                    Paint paint = m3Var.f29227o;
                    Paint paint2 = m3Var.f29230r;
                    Matrix matrix2 = m3Var.f29229q;
                    f3 f3Var = m3Var.f29217c;
                    f14 = T1;
                    Path path2 = m3Var.f29226n;
                    arrayList2 = arrayList;
                    Paint paint3 = m3Var.f29218e;
                    f16 = e10;
                    RectF rectF7 = m3Var.f29225m;
                    rectF2 = rectF;
                    Paint paint4 = m3Var.f29224l;
                    i13 = i17;
                    f15 = f23;
                    f18 = 1.0f;
                    float i22 = Utilities.i(1.0f - ((Math.abs(m3Var.f29221i) - 0.3f) / 0.7f), 1.0f, 0.0f) * T12;
                    if (i22 <= 0.0f) {
                        f17 = f27;
                    } else {
                        float f34 = f33 * 1.0f;
                        float T14 = org.telegram.messenger.g0.T1(1.0f, 1.3f, f34);
                        float currentActionBarHeight = ((k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f24112m) - org.telegram.messenger.g0.L(50.0f)) * 0.0f;
                        canvas.save();
                        canvas.rotate(m3Var.f29221i * 20.0f, (m3Var.f29221i * org.telegram.messenger.g0.L(50.0f)) + rectF6.centerX(), rectF6.bottom + org.telegram.messenger.g0.L(350.0f));
                        float a10 = m3Var.f29223k.a(0.01f);
                        canvas.scale(a10, a10, rectF6.centerX(), rectF6.centerY());
                        float W1 = org.telegram.messenger.g0.W1(f33, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f));
                        if (i21 != 0) {
                            paint4.setColor(i20);
                            paint4.setShadowLayer(org.telegram.messenger.g0.L(30.0f), 0.0f, org.telegram.messenger.g0.L(10.0f), n6.r1(i22 * f33 * 1.0f, 536870912));
                            canvas.drawRoundRect(rectF6, W1, W1, paint4);
                            paint3.setAlpha((int) (i22 * f11));
                            canvas.drawRoundRect(rectF6, W1, W1, paint3);
                            canvas.restore();
                            f17 = f27;
                            f18 = 1.0f;
                        } else {
                            path2.rewind();
                            path2.addRoundRect(rectF6, W1, W1, Path.Direction.CW);
                            canvas.save();
                            paint4.setColor(0);
                            paint4.setShadowLayer(org.telegram.messenger.g0.L(30.0f), 0.0f, org.telegram.messenger.g0.L(10.0f), n6.r1(i22 * f33 * 1.0f, 536870912));
                            canvas.drawPath(path2, paint4);
                            canvas.clipPath(path2);
                            float f35 = i22 * f11 * f33;
                            int i23 = (int) f35;
                            paint3.setAlpha(i23);
                            canvas.drawRoundRect(rectF6, W1, W1, paint3);
                            canvas.save();
                            canvas.translate(rectF6.left, p5.c.e(org.telegram.messenger.g0.L(50.0f), T14, rectF6.top, currentActionBarHeight));
                            canvas.scale(1.0f, org.telegram.messenger.g0.T1(1.0f, 1.25f, f34));
                            if (f3Var != null && f3Var.f28935m != null) {
                                float width3 = rectF6.width() / f3Var.f28935m.getWidth();
                                canvas.scale(width3, width3);
                                paint.setAlpha(i23);
                                canvas.drawBitmap(f3Var.f28935m, 0.0f, 0.0f, paint);
                            }
                            canvas.restore();
                            canvas.save();
                            paint2.setAlpha((int) (f35 * 1.0f));
                            matrix2.reset();
                            float height2 = rectF6.height() / f11;
                            matrix2.postScale(height2, height2);
                            matrix2.postTranslate(rectF6.centerX(), rectF6.top);
                            radialGradient.setLocalMatrix(matrix2);
                            paint2.setShader(radialGradient);
                            canvas.drawRect(rectF6, paint2);
                            canvas.restore();
                            rectF7.set(rectF6);
                            rectF7.bottom = Math.min(rectF6.height(), org.telegram.messenger.g0.L(50.0f)) + rectF7.top;
                            rectF7.offset(0.0f, currentActionBarHeight);
                            m3Var.d.f28853w = f33;
                            f18 = 1.0f;
                            canvas.scale(1.0f, T14, rectF7.centerX(), rectF7.top);
                            f17 = f27;
                            m3Var.d.a(canvas, rectF7, W1, i22 * i22, T13);
                            canvas.restore();
                            canvas.restore();
                        }
                    }
                    canvas.restore();
                }
            }
            i19 = i10 + 1;
            L = f17;
            f20 = f18;
            i15 = i7;
            T1 = f14;
            arrayList = arrayList2;
            e10 = f16;
            rectF = rectF2;
            i17 = i13;
            L2 = f13;
            min = i11;
            f23 = f15;
            i16 = 0;
            n3Var = this;
        }
        float f36 = L;
        float f37 = f23;
        canvas.save();
        if (this.f29285k0 == null) {
            this.f29285k0 = new h6.m(29);
        }
        RectF rectF8 = org.telegram.messenger.g0.P;
        rectF8.set(0.0f, 0.0f, f37, f36);
        this.f29285k0.n(canvas, rectF8, i7, this.W);
        canvas.restore();
        canvas.restore();
        if (this.f29282h0 == null) {
            this.f29282h0 = new vy0(gd.M0(2131753097, null), 14.0f, org.telegram.messenger.g0.o());
        }
        if (this.f29284j0 == null || this.f29283i0 != n6.I.q()) {
            boolean q10 = n6.I.q();
            this.f29283i0 = q10;
            if (q10) {
                this.f29284j0 = n6.k0(64, 64, 64, 64, 553648127, 872415231, 872415231);
            } else {
                this.f29284j0 = n6.k0(64, 64, 64, 64, 771751936, 1140850688, 1140850688);
            }
            this.f29284j0.setCallback(this);
        }
        float L3 = this.f29282h0.f41482c + org.telegram.messenger.g0.L(24.0f);
        float f38 = (f37 - L3) / 2.0f;
        this.f29284j0.setBounds((int) f38, (int) ((f36 - (org.telegram.messenger.g0.L(95.0f) / 2.0f)) - org.telegram.messenger.g0.L(14.0f)), (int) ((f37 + L3) / 2.0f), (int) ((f36 - (org.telegram.messenger.g0.L(95.0f) / 2.0f)) + org.telegram.messenger.g0.L(14.0f)));
        this.f29284j0.setAlpha((int) (this.W * f11));
        this.f29284j0.draw(canvas);
        this.f29282h0.c(f38 + org.telegram.messenger.g0.L(12.0f), f36 - (org.telegram.messenger.g0.L(95.0f) / 2.0f), this.W, -1, canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        hi.d6 d6Var;
        if (this.W > 0.0f && (d6Var = this.f29289w) != null && d6Var.f(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.n3.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public final float e(boolean z10) {
        float f10;
        float f11 = 0.0f;
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.S;
            if (i7 >= arrayList.size()) {
                break;
            }
            if (((m3) arrayList.get(i7)).d.d >= 0) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            f11 += f10;
            i7++;
        }
        if (z10) {
            return this.f29279f.e(false, f11);
        }
        return f11;
    }

    public final void f() {
        float f10;
        d3 d3Var;
        g3 g3Var = this.f29270a;
        if (g3Var != null && (g3Var.getParent() instanceof View)) {
            HashSet hashSet = ki.t2.f18914b1;
            if (!hashSet.isEmpty()) {
                Iterator it = new HashSet(hashSet).iterator();
                while (it.hasNext()) {
                    ((ki.t2) it.next()).o(true);
                }
                org.telegram.messenger.g0.h3(new oi.a2(this, 11), 100L);
                return;
            }
            ValueAnimator valueAnimator = this.d;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.d = null;
            }
            View view = (View) this.f29270a.getParent();
            this.T = view;
            int[] iArr = this.f29273b0;
            if (view != null) {
                view.getLocationOnScreen(iArr);
            } else {
                iArr[1] = 0;
                iArr[0] = 0;
            }
            int[] iArr2 = this.f29275c0;
            getLocationOnScreen(iArr2);
            int i7 = iArr[0] - iArr2[0];
            int i10 = iArr[1] - iArr2[1];
            this.R.set(i7, iArr[1] - iArr2[1], this.T.getWidth() + i7, this.T.getHeight() + i10);
            View view2 = this.T;
            org.telegram.messenger.g0.m0 = true;
            this.N = org.telegram.messenger.g0.j2(14.0f, 14, view2);
            org.telegram.messenger.g0.m0 = false;
            Paint paint = new Paint(1);
            this.P = paint;
            Bitmap bitmap = this.N;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            this.O = bitmapShader;
            paint.setShader(bitmapShader);
            ColorMatrix colorMatrix = new ColorMatrix();
            if (n6.I.q()) {
                f10 = 0.08f;
            } else {
                f10 = 0.25f;
            }
            org.telegram.messenger.g0.i(colorMatrix, f10);
            this.P.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            this.Q = new Matrix();
            ArrayList arrayList = this.S;
            arrayList.clear();
            ArrayList<f3> tabs = this.f29270a.getTabs();
            ArrayList<d3> tabDrawables = this.f29270a.getTabDrawables();
            for (int size = tabs.size() - 1; size >= 0; size--) {
                f3 f3Var = tabs.get(size);
                int i11 = 0;
                while (true) {
                    if (i11 < tabDrawables.size()) {
                        d3Var = tabDrawables.get(i11);
                        if (d3Var.f28834a == f3Var) {
                            break;
                        }
                        i11++;
                    } else {
                        d3Var = null;
                        break;
                    }
                }
                if (d3Var != null) {
                    arrayList.add(new m3(this, f3Var, d3Var));
                }
            }
            this.f29279f.e(true, arrayList.size());
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
        return this.M;
    }

    public float getScrollRange() {
        return e(true);
    }

    public float getScrollWindow() {
        return Math.min(3.0f, getScrollRange());
    }

    public final void h(float f10) {
        ValueAnimator valueAnimator = this.U;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.U = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.M, f10);
        this.U = ofFloat;
        ofFloat.addUpdateListener(new h3(this, 1));
        this.U.setDuration(250L);
        this.U.setInterpolator(lr.h);
        this.U.start();
    }

    public void setScrollOffset(float f10) {
        this.M = f10;
    }

    public void setTabsView(g3 g3Var) {
        this.f29270a = g3Var;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f29284j0 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public void setSlowerDismiss(boolean z10) {
    }
}
