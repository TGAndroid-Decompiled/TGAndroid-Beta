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
import org.telegram.messenger.hd;
import org.telegram.messenger.z8;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.LaunchActivity;
public final class k3 extends View {
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
    public d3 f27711a;
    public final int[] f27712a0;
    public h3 f27713b;
    public final int[] f27714b0;
    public a3 f27715c;
    public final RectF f27716c0;
    public ValueAnimator d;
    public final RectF f27717d0;
    public float f27718e;
    public final RectF f27719e0;
    public final org.telegram.ui.Components.w5 f27720f;
    public final Path f27721f0;
    public ly0 f27722g0;
    public final OverScroller h;
    public boolean f27723h0;
    public org.telegram.ui.Cells.y f27724i0;
    public h6.m f27725j0;
    public final int f27726n;
    public final int f27727r;
    public int f27728s;
    public final fi.f6 f27729w;
    public j3 f27730x;
    public boolean f27731y;

    public k3(LaunchActivity launchActivity) {
        super(launchActivity);
        this.f27720f = new org.telegram.ui.Components.w5(this, 0L, 350L, xq.h);
        this.Q = new RectF();
        this.R = new ArrayList();
        this.f27712a0 = new int[2];
        this.f27714b0 = new int[2];
        this.f27716c0 = new RectF();
        this.f27717d0 = new RectF();
        this.f27719e0 = new RectF();
        this.f27721f0 = new Path();
        setWillNotDraw(false);
        this.h = new OverScroller(launchActivity);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(launchActivity);
        this.f27726n = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f27727r = viewConfiguration.getScaledMinimumFlingVelocity();
        fi.f6 f6Var = new fi.f6(this, this);
        this.f27729w = f6Var;
        r0.i0.j(this, f6Var);
        setImportantForAccessibility(2);
        r0.a0.i(this, new l2.y(this, 29));
    }

    public static void g(ViewGroup viewGroup, float f10, final org.telegram.messenger.voip.k kVar) {
        if (viewGroup.getWidth() > 0 && viewGroup.getHeight() > 0) {
            final SurfaceTexture c10 = z8.c();
            c10.setDefaultBufferSize(viewGroup.getWidth(), viewGroup.getHeight());
            final Surface surface = new Surface(c10);
            final Bitmap createBitmap = Bitmap.createBitmap(viewGroup.getWidth(), viewGroup.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas lockHardwareCanvas = surface.lockHardwareCanvas();
            lockHardwareCanvas.translate(0.0f, f10);
            viewGroup.draw(lockHardwareCanvas);
            surface.unlockCanvasAndPost(lockHardwareCanvas);
            PixelCopy.request(surface, createBitmap, new PixelCopy.OnPixelCopyFinishedListener() {
                @Override
                public final void onPixelCopyFinished(int i7) {
                    org.telegram.messenger.voip.k kVar2 = org.telegram.messenger.voip.k.this;
                    Bitmap bitmap = createBitmap;
                    Surface surface2 = surface;
                    SurfaceTexture surfaceTexture = c10;
                    if (i7 == 0) {
                        kVar2.a(bitmap);
                    } else {
                        bitmap.recycle();
                        kVar2.a(null);
                    }
                    surface2.release();
                    surfaceTexture.release();
                }
            }, new Handler());
            return;
        }
        kVar.a(null);
    }

    private float getScrollStep() {
        return org.telegram.messenger.g0.L(200.0f);
    }

    private void setModalAccessibility(boolean z9) {
        int i7;
        int i10;
        if (z9) {
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
                    if (z9) {
                        i10 = 4;
                    } else {
                        i10 = 0;
                    }
                    childAt.setImportantForAccessibility(i10);
                }
            }
        }
        fi.f6 f6Var = this.f27729w;
        if (f6Var != null) {
            f6Var.i();
        }
        if (z9) {
            sendAccessibilityEvent(32);
        }
    }

    public final void a(boolean z9) {
        float f10;
        if (this.U == z9) {
            return;
        }
        ValueAnimator valueAnimator = this.W;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.U = z9;
        d3 d3Var = this.f27711a;
        if (d3Var != null) {
            d3Var.f27425b = false;
            d3Var.invalidate();
        }
        setModalAccessibility(z9);
        invalidate();
        float f11 = this.V;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.W = ofFloat;
        ofFloat.addUpdateListener(new e3(this, 0));
        this.W.addListener(new m.a(this, 11));
        this.W.setInterpolator(xq.h);
        this.W.setDuration(320L);
        this.W.start();
    }

    public final void b(h3 h3Var) {
        ValueAnimator valueAnimator;
        if (this.f27711a == null) {
            return;
        }
        if (this.f27713b != null && (valueAnimator = this.d) != null) {
            valueAnimator.end();
            this.d = null;
        }
        this.f27713b = h3Var;
        h3Var.b(false);
        ValueAnimator valueAnimator2 = this.d;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        c3 c10 = h3Var.c();
        d3 d3Var = this.f27711a;
        ArrayList<c3> tabs = d3Var.getTabs();
        ArrayList<a3> tabDrawables = d3Var.getTabDrawables();
        a3 a3Var = new a3(d3Var, c10);
        a3Var.f27305e.e(true, -1.0f);
        a3Var.f27306f.e(true, 0.0f);
        tabDrawables.add(a3Var);
        tabs.add(0, c10);
        for (int i7 = 0; i7 < tabDrawables.size(); i7++) {
            a3 a3Var2 = tabDrawables.get(i7);
            int indexOf = tabs.indexOf(a3Var2.f27302a);
            a3Var2.d = indexOf;
            if (indexOf >= 0) {
                a3Var2.f27304c = indexOf;
            }
        }
        d3Var.n();
        d3Var.o(true);
        d3Var.invalidate();
        b3 b3Var = d3Var.f27427e;
        if (b3Var != null) {
            b3Var.i();
        }
        this.f27715c = a3Var;
        post(new l2.w(h3Var, 24));
        invalidate();
        this.f27718e = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.d = ofFloat;
        ofFloat.addUpdateListener(new e3(this, 2));
        this.d.addListener(new di.h3(this, c10, h3Var, 2));
        org.telegram.messenger.g0.n(this.d, 220.0d, 30.0d);
        ValueAnimator valueAnimator3 = this.d;
        valueAnimator3.setDuration(((float) valueAnimator3.getDuration()) * 1.1f);
        this.d.start();
    }

    public final float c(boolean z9) {
        return (e(z9) - Math.min(3.0f, e(z9))) - (Utilities.i(4.0f - e(z9), 0.5f, 0.0f) * (Math.min(3.0f, e(z9)) / 3.0f));
    }

    @Override
    public final void computeScroll() {
        OverScroller overScroller = this.h;
        if (overScroller.computeScrollOffset()) {
            setScrollOffset(overScroller.getCurrY() / getScrollStep());
            postInvalidateOnAnimation();
        }
    }

    public final float d(boolean z9) {
        return Utilities.i(e(z9), 1.0f, 0.0f) * ((-getScrollWindow()) / 3.0f);
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
        k3 k3Var = this;
        super.dispatchDraw(canvas);
        h3 h3Var = k3Var.f27713b;
        float f20 = 1.0f;
        int i15 = 1;
        int[] iArr = k3Var.f27712a0;
        int[] iArr2 = k3Var.f27714b0;
        int i16 = 0;
        RectF rectF3 = k3Var.f27716c0;
        if (h3Var != null) {
            k3Var.getLocationOnScreen(iArr2);
            k3Var.f27711a.getLocationOnScreen(iArr);
            k3Var.f27711a.d(rectF3, 0.0f);
            rectF3.offset(iArr[0] - iArr2[0], iArr[1] - iArr2[1]);
            canvas.save();
            canvas.clipRect(0, 0, k3Var.getMeasuredWidth(), k3Var.getMeasuredHeight() - k3Var.f27728s);
            i3 mo25d = k3Var.f27713b.mo25d();
            float f21 = k3Var.f27718e;
            RectF rectF4 = k3Var.f27719e0;
            float z9 = mo25d.z(canvas, rectF3, f21, rectF4, f21);
            if (k3Var.f27715c != null) {
                Path path = k3Var.f27721f0;
                path.rewind();
                path.addRoundRect(rectF4, z9, z9, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                float v = com.google.android.recaptcha.internal.a.v(1.0f, k3Var.f27718e, org.telegram.messenger.g0.L(50.0f), rectF4.top);
                rectF3.set(rectF4.left, v, rectF4.right, org.telegram.messenger.g0.L(50.0f) + v);
                k3Var.f27711a.setupTab(k3Var.f27715c);
                k3Var.f27715c.a(canvas, rectF3, z9, k3Var.f27718e, 1.0f);
                rectF = rectF3;
                canvas.restore();
            } else {
                rectF = rectF3;
            }
            canvas.restore();
        } else {
            rectF = rectF3;
        }
        if (k3Var.V <= 0.0f) {
            return;
        }
        canvas.save();
        View view = k3Var.S;
        RectF rectF5 = k3Var.Q;
        if (view != null) {
            view.getLocationOnScreen(iArr);
            k3Var.getLocationOnScreen(iArr2);
            rectF5.set(iArr[0] - iArr2[0], iArr[1] - iArr2[1], k3Var.S.getWidth() + i14, k3Var.S.getHeight() + (iArr[1] - iArr2[1]));
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
        if (k3Var.M != null) {
            k3Var.P.reset();
            float width2 = rectF5.width() / k3Var.M.getWidth();
            k3Var.P.postScale(width2, width2);
            k3Var.N.setLocalMatrix(k3Var.P);
            k3Var.O.setAlpha((int) (k3Var.V * 255.0f));
            canvas.drawRect(0.0f, 0.0f, width, height, k3Var.O);
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, width, height, 255, 31);
        float f23 = width;
        float L = org.telegram.messenger.g0.L(55.0f) + org.telegram.messenger.g0.L(40.0f) + org.telegram.messenger.g0.f22531m;
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
            arrayList = k3Var.R;
            f11 = f22;
            if (i18 >= arrayList.size()) {
                break;
            }
            if (((j3) arrayList.get(i18)).d.d >= 0) {
                f19 = 1.0f;
            } else {
                f19 = 0.0f;
            }
            f25 += f19;
            i18++;
            f22 = f11;
        }
        float e10 = k3Var.f27720f.e(false, f25);
        if (k3Var.getScrollWindow() <= 0.0f) {
            scrollMin = 0.0f;
        } else {
            scrollMin = ((k3Var.getScrollMin() - k3Var.getScrollOffset()) / (k3Var.getScrollWindow() * 0.15f)) * 0.2f;
        }
        float T1 = org.telegram.messenger.g0.T1(0.0f, 1.0f - Utilities.i(scrollMin, 1.0f, 0.0f), k3Var.V);
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
                j3 j3Var = (j3) arrayList.get(i19);
                int i20 = i16;
                if (i19 < arrayList.size()) {
                    a3 a3Var = j3Var.d;
                }
                a3 a3Var2 = j3Var.d;
                float f26 = f20;
                float[] fArr = j3Var.f27614g;
                Matrix matrix = j3Var.f27613f;
                float f27 = L;
                float[] fArr2 = j3Var.h;
                if (a3Var2 == null) {
                    f12 = f26;
                } else {
                    f12 = T1;
                }
                float c10 = (e10 - f26) - a3Var2.c();
                f13 = L2;
                i10 = i19;
                float max = (c10 - Math.max(k3Var.getScrollMin(), k3Var.getScrollOffset())) / k3Var.getScrollWindow();
                Math.max(max, 0.0f);
                Math.max(Math.min(max, f26), -4.0f);
                float min2 = (Math.min(5.0f, c10) * org.telegram.messenger.g0.L(6.0f)) + f27;
                float f28 = i17;
                float f29 = ((((height - f13) - (0.26f * f28)) - min2) * max) + min2;
                float f30 = min / 2.0f;
                i11 = min;
                RectF rectF6 = k3Var.f27717d0;
                rectF6.set(f24 - f30, f29, f24 + f30, f28 + f29);
                if ((rectF6.top > height || rectF6.bottom < 0.0f || T1 < 0.1f) && c10 < e10 - 3.0f) {
                    i12 = i7;
                } else {
                    i12 = i20;
                }
                int i21 = i12;
                k3Var.f27711a.d(rectF, Utilities.i(a3Var2.c(), 1.0f, 0.0f));
                rectF.offset(k3Var.f27711a.getX(), k3Var.f27711a.getY());
                org.telegram.messenger.g0.c2(rectF, rectF6, T1, rectF6);
                d3 d3Var = k3Var.f27711a;
                if (d3Var != null) {
                    d3Var.setupTab(a3Var2);
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
                    j3Var.f27609a.set(rectF6);
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
                    matrix.setPolyToPoly(j3Var.f27614g, 0, j3Var.h, 0, 4);
                    canvas.concat(matrix);
                    float T12 = org.telegram.messenger.g0.T1(a3Var2.b(), 1.0f, k3Var.V);
                    float T13 = org.telegram.messenger.g0.T1(Utilities.l((c10 - e10) + 2.0f), 1.0f, Utilities.l((f12 - 0.1f) / 0.8f));
                    RadialGradient radialGradient = j3Var.f27622p;
                    Paint paint = j3Var.f27621o;
                    Paint paint2 = j3Var.f27624r;
                    Matrix matrix2 = j3Var.f27623q;
                    c3 c3Var = j3Var.f27611c;
                    f14 = T1;
                    Path path2 = j3Var.f27620n;
                    arrayList2 = arrayList;
                    Paint paint3 = j3Var.f27612e;
                    f16 = e10;
                    RectF rectF7 = j3Var.f27619m;
                    rectF2 = rectF;
                    Paint paint4 = j3Var.f27618l;
                    i13 = i17;
                    f15 = f23;
                    f18 = 1.0f;
                    float i22 = Utilities.i(1.0f - ((Math.abs(j3Var.f27615i) - 0.3f) / 0.7f), 1.0f, 0.0f) * T12;
                    if (i22 <= 0.0f) {
                        f17 = f27;
                    } else {
                        float f34 = f33 * 1.0f;
                        float T14 = org.telegram.messenger.g0.T1(1.0f, 1.3f, f34);
                        float currentActionBarHeight = ((k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f22531m) - org.telegram.messenger.g0.L(50.0f)) * 0.0f;
                        canvas.save();
                        canvas.rotate(j3Var.f27615i * 20.0f, (j3Var.f27615i * org.telegram.messenger.g0.L(50.0f)) + rectF6.centerX(), rectF6.bottom + org.telegram.messenger.g0.L(350.0f));
                        float a10 = j3Var.f27617k.a(0.01f);
                        canvas.scale(a10, a10, rectF6.centerX(), rectF6.centerY());
                        float W1 = org.telegram.messenger.g0.W1(f33, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f));
                        if (i21 != 0) {
                            paint4.setColor(i20);
                            paint4.setShadowLayer(org.telegram.messenger.g0.L(30.0f), 0.0f, org.telegram.messenger.g0.L(10.0f), k6.r1(i22 * f33 * 1.0f, 536870912));
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
                            paint4.setShadowLayer(org.telegram.messenger.g0.L(30.0f), 0.0f, org.telegram.messenger.g0.L(10.0f), k6.r1(i22 * f33 * 1.0f, 536870912));
                            canvas.drawPath(path2, paint4);
                            canvas.clipPath(path2);
                            float f35 = i22 * f11 * f33;
                            int i23 = (int) f35;
                            paint3.setAlpha(i23);
                            canvas.drawRoundRect(rectF6, W1, W1, paint3);
                            canvas.save();
                            canvas.translate(rectF6.left, rf.b.d(org.telegram.messenger.g0.L(50.0f), T14, rectF6.top, currentActionBarHeight));
                            canvas.scale(1.0f, org.telegram.messenger.g0.T1(1.0f, 1.25f, f34));
                            if (c3Var != null && c3Var.f27380m != null) {
                                float width3 = rectF6.width() / c3Var.f27380m.getWidth();
                                canvas.scale(width3, width3);
                                paint.setAlpha(i23);
                                canvas.drawBitmap(c3Var.f27380m, 0.0f, 0.0f, paint);
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
                            j3Var.d.f27321w = f33;
                            f18 = 1.0f;
                            canvas.scale(1.0f, T14, rectF7.centerX(), rectF7.top);
                            f17 = f27;
                            j3Var.d.a(canvas, rectF7, W1, i22 * i22, T13);
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
            k3Var = this;
        }
        float f36 = L;
        float f37 = f23;
        canvas.save();
        if (this.f27725j0 == null) {
            this.f27725j0 = new h6.m(28);
        }
        RectF rectF8 = org.telegram.messenger.g0.P;
        rectF8.set(0.0f, 0.0f, f37, f36);
        this.f27725j0.m(canvas, rectF8, i7, this.V);
        canvas.restore();
        canvas.restore();
        if (this.f27722g0 == null) {
            this.f27722g0 = new ly0(hd.M0(2131753099, null), 14.0f, org.telegram.messenger.g0.o());
        }
        if (this.f27724i0 == null || this.f27723h0 != k6.I.q()) {
            boolean q10 = k6.I.q();
            this.f27723h0 = q10;
            if (q10) {
                this.f27724i0 = k6.k0(64, 64, 64, 64, 553648127, 872415231, 872415231);
            } else {
                this.f27724i0 = k6.k0(64, 64, 64, 64, 771751936, 1140850688, 1140850688);
            }
            this.f27724i0.setCallback(this);
        }
        float L3 = this.f27722g0.f35782c + org.telegram.messenger.g0.L(24.0f);
        float f38 = (f37 - L3) / 2.0f;
        this.f27724i0.setBounds((int) f38, (int) ((f36 - (org.telegram.messenger.g0.L(95.0f) / 2.0f)) - org.telegram.messenger.g0.L(14.0f)), (int) ((f37 + L3) / 2.0f), (int) ((f36 - (org.telegram.messenger.g0.L(95.0f) / 2.0f)) + org.telegram.messenger.g0.L(14.0f)));
        this.f27724i0.setAlpha((int) (this.V * f11));
        this.f27724i0.draw(canvas);
        this.f27722g0.c(f38 + org.telegram.messenger.g0.L(12.0f), f36 - (org.telegram.messenger.g0.L(95.0f) / 2.0f), this.V, -1, canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        fi.f6 f6Var;
        if (this.V > 0.0f && (f6Var = this.f27729w) != null && f6Var.f(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.k3.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public final float e(boolean z9) {
        float f10;
        float f11 = 0.0f;
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.R;
            if (i7 >= arrayList.size()) {
                break;
            }
            if (((j3) arrayList.get(i7)).d.d >= 0) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            f11 += f10;
            i7++;
        }
        if (z9) {
            return this.f27720f.e(false, f11);
        }
        return f11;
    }

    public final void f() {
        float f10;
        a3 a3Var;
        d3 d3Var = this.f27711a;
        if (d3Var != null && (d3Var.getParent() instanceof View)) {
            HashSet hashSet = hi.a3.f14507a1;
            if (!hashSet.isEmpty()) {
                Iterator it = new HashSet(hashSet).iterator();
                while (it.hasNext()) {
                    ((hi.a3) it.next()).o(true);
                }
                org.telegram.messenger.g0.i3(new l2.w(this, 25), 100L);
                return;
            }
            ValueAnimator valueAnimator = this.d;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.d = null;
            }
            View view = (View) this.f27711a.getParent();
            this.S = view;
            int[] iArr = this.f27712a0;
            if (view != null) {
                view.getLocationOnScreen(iArr);
            } else {
                iArr[1] = 0;
                iArr[0] = 0;
            }
            int[] iArr2 = this.f27714b0;
            getLocationOnScreen(iArr2);
            int i7 = iArr[0] - iArr2[0];
            int i10 = iArr[1] - iArr2[1];
            this.Q.set(i7, iArr[1] - iArr2[1], this.S.getWidth() + i7, this.S.getHeight() + i10);
            View view2 = this.S;
            org.telegram.messenger.g0.m0 = true;
            this.M = org.telegram.messenger.g0.j2(14.0f, 14, view2);
            org.telegram.messenger.g0.m0 = false;
            Paint paint = new Paint(1);
            this.O = paint;
            Bitmap bitmap = this.M;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            this.N = bitmapShader;
            paint.setShader(bitmapShader);
            ColorMatrix colorMatrix = new ColorMatrix();
            if (k6.I.q()) {
                f10 = 0.08f;
            } else {
                f10 = 0.25f;
            }
            org.telegram.messenger.g0.i(colorMatrix, f10);
            this.O.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            this.P = new Matrix();
            ArrayList arrayList = this.R;
            arrayList.clear();
            ArrayList<c3> tabs = this.f27711a.getTabs();
            ArrayList<a3> tabDrawables = this.f27711a.getTabDrawables();
            for (int size = tabs.size() - 1; size >= 0; size--) {
                c3 c3Var = tabs.get(size);
                int i11 = 0;
                while (true) {
                    if (i11 < tabDrawables.size()) {
                        a3Var = tabDrawables.get(i11);
                        if (a3Var.f27302a == c3Var) {
                            break;
                        }
                        i11++;
                    } else {
                        a3Var = null;
                        break;
                    }
                }
                if (a3Var != null) {
                    arrayList.add(new j3(this, c3Var, a3Var));
                }
            }
            this.f27720f.e(true, arrayList.size());
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

    public final void h(float f10) {
        ValueAnimator valueAnimator = this.T;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.T = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.L, f10);
        this.T = ofFloat;
        ofFloat.addUpdateListener(new e3(this, 1));
        this.T.setDuration(250L);
        this.T.setInterpolator(xq.h);
        this.T.start();
    }

    public void setScrollOffset(float f10) {
        this.L = f10;
    }

    public void setTabsView(d3 d3Var) {
        this.f27711a = d3Var;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f27724i0 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public void setSlowerDismiss(boolean z9) {
    }
}
