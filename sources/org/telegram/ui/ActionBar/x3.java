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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.p6;
import org.telegram.ui.Components.f01;
import org.telegram.ui.Components.pr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.l20;
public final class x3 extends View {
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
    public o3 f21483a;
    public final int[] f21484a0;
    public u3 f21485b;
    public final int[] f21486b0;
    public l3 f21487c;
    public final RectF f21488c0;
    public ValueAnimator d;
    public final RectF f21489d0;
    public float f21490e;
    public final RectF f21491e0;
    public final org.telegram.ui.Components.e6 f21492f;
    public final Path f21493f0;
    public f01 f21494g0;
    public final OverScroller h;
    public boolean f21495h0;
    public org.telegram.ui.Cells.z f21496i0;
    public l20 f21497j0;
    public final int f21498n;
    public final int f21499r;
    public int f21500s;
    public final t3 v;
    public w3 f21501w;
    public boolean f21502x;
    public float f21503y;

    public x3(LaunchActivity launchActivity) {
        super(launchActivity);
        this.f21492f = new org.telegram.ui.Components.e6(this, 0L, 350L, pr.h);
        this.Q = new RectF();
        this.R = new ArrayList();
        this.f21484a0 = new int[2];
        this.f21486b0 = new int[2];
        this.f21488c0 = new RectF();
        this.f21489d0 = new RectF();
        this.f21491e0 = new RectF();
        this.f21493f0 = new Path();
        setWillNotDraw(false);
        this.h = new OverScroller(launchActivity);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(launchActivity);
        this.f21498n = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f21499r = viewConfiguration.getScaledMinimumFlingVelocity();
        t3 t3Var = new t3(this, this);
        this.v = t3Var;
        r0.i0.k(this, t3Var);
        setImportantForAccessibility(2);
        r0.a0.j(this, new n(this, 7));
    }

    public static void g(ViewGroup viewGroup, float f7, final di.m2 m2Var) {
        if (viewGroup.getWidth() > 0 && viewGroup.getHeight() > 0) {
            final SurfaceTexture b10 = org.telegram.messenger.u3.b();
            b10.setDefaultBufferSize(viewGroup.getWidth(), viewGroup.getHeight());
            final Surface surface = new Surface(b10);
            final Bitmap createBitmap = Bitmap.createBitmap(viewGroup.getWidth(), viewGroup.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas lockHardwareCanvas = surface.lockHardwareCanvas();
            lockHardwareCanvas.translate(0.0f, f7);
            viewGroup.draw(lockHardwareCanvas);
            surface.unlockCanvasAndPost(lockHardwareCanvas);
            PixelCopy.request(surface, createBitmap, new PixelCopy.OnPixelCopyFinishedListener() {
                @Override
                public final void onPixelCopyFinished(int i10) {
                    di.m2 m2Var2 = di.m2.this;
                    Bitmap bitmap = createBitmap;
                    Surface surface2 = surface;
                    SurfaceTexture surfaceTexture = b10;
                    if (i10 == 0) {
                        m2Var2.run(bitmap);
                    } else {
                        bitmap.recycle();
                        m2Var2.run(null);
                    }
                    surface2.release();
                    surfaceTexture.release();
                }
            }, new Handler());
            return;
        }
        m2Var.run(null);
    }

    private float getScrollStep() {
        return AndroidUtilities.dp(200.0f);
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
        t3 t3Var = this.v;
        if (t3Var != null) {
            t3Var.i();
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
        o3 o3Var = this.f21483a;
        if (o3Var != null) {
            o3Var.f21254b = false;
            o3Var.invalidate();
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
        ofFloat.addUpdateListener(new p3(this, 0));
        this.W.addListener(new h(this, 4));
        this.W.setInterpolator(pr.h);
        this.W.setDuration(320L);
        this.W.start();
    }

    public final void b(u3 u3Var) {
        ValueAnimator valueAnimator;
        if (this.f21483a == null) {
            return;
        }
        if (this.f21485b != null && (valueAnimator = this.d) != null) {
            valueAnimator.end();
            this.d = null;
        }
        this.f21485b = u3Var;
        u3Var.setLastVisible(false);
        ValueAnimator valueAnimator2 = this.d;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        n3 a2 = u3Var.a();
        o3 o3Var = this.f21483a;
        ArrayList<n3> tabs = o3Var.getTabs();
        ArrayList<l3> tabDrawables = o3Var.getTabDrawables();
        l3 l3Var = new l3(o3Var, a2);
        l3Var.d.d(-1.0f, true);
        l3Var.f21149e.d(0.0f, true);
        tabDrawables.add(l3Var);
        tabs.add(0, a2);
        for (int i10 = 0; i10 < tabDrawables.size(); i10++) {
            l3 l3Var2 = tabDrawables.get(i10);
            int indexOf = tabs.indexOf(l3Var2.f21146a);
            l3Var2.f21148c = indexOf;
            if (indexOf >= 0) {
                l3Var2.f21147b = indexOf;
            }
        }
        o3Var.n();
        o3Var.o(true);
        o3Var.invalidate();
        m3 m3Var = o3Var.f21256e;
        if (m3Var != null) {
            m3Var.i();
        }
        this.f21487c = l3Var;
        post(new q(u3Var, 10));
        invalidate();
        this.f21490e = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.d = ofFloat;
        ofFloat.addUpdateListener(new p3(this, 1));
        this.d.addListener(new s3(this, a2, u3Var));
        AndroidUtilities.applySpring(this.d, 220.0d, 30.0d, 1.0d);
        ValueAnimator valueAnimator3 = this.d;
        valueAnimator3.setDuration(((float) valueAnimator3.getDuration()) * 1.1f);
        this.d.start();
    }

    public final float c(boolean z10) {
        return (e(z10) - Math.min(3.0f, e(z10))) - (Utilities.clamp(4.0f - e(z10), 0.5f, 0.0f) * (Math.min(3.0f, e(z10)) / 3.0f));
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
        return Utilities.clamp(e(z10), 1.0f, 0.0f) * ((-getScrollWindow()) / 3.0f);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF;
        float f7;
        ArrayList arrayList;
        float scrollMin;
        float f10;
        float f11;
        int i10;
        int i11;
        boolean z10;
        float f12;
        float f13;
        float f14;
        ArrayList arrayList2;
        RectF rectF2;
        int i12;
        float f15;
        float f16;
        float f17;
        int i13;
        x3 x3Var = this;
        super.dispatchDraw(canvas);
        u3 u3Var = x3Var.f21485b;
        int[] iArr = x3Var.f21484a0;
        int[] iArr2 = x3Var.f21486b0;
        RectF rectF3 = x3Var.f21488c0;
        if (u3Var != null) {
            x3Var.getLocationOnScreen(iArr2);
            x3Var.f21483a.getLocationOnScreen(iArr);
            x3Var.f21483a.d(rectF3, 0.0f);
            rectF3.offset(iArr[0] - iArr2[0], iArr[1] - iArr2[1]);
            canvas.save();
            canvas.clipRect(0, 0, x3Var.getMeasuredWidth(), x3Var.getMeasuredHeight() - x3Var.f21500s);
            v3 mo37getWindowView = x3Var.f21485b.mo37getWindowView();
            float f18 = x3Var.f21490e;
            RectF rectF4 = x3Var.f21491e0;
            float z11 = mo37getWindowView.z(canvas, rectF3, f18, rectF4, f18);
            if (x3Var.f21487c != null) {
                Path path = x3Var.f21493f0;
                path.rewind();
                path.addRoundRect(rectF4, z11, z11, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                float b10 = com.google.android.gms.internal.vision.e2.b(1.0f, x3Var.f21490e, AndroidUtilities.dp(50.0f), rectF4.top);
                rectF3.set(rectF4.left, b10, rectF4.right, AndroidUtilities.dp(50.0f) + b10);
                x3Var.f21483a.setupTab(x3Var.f21487c);
                x3Var.f21487c.a(canvas, rectF3, z11, x3Var.f21490e, 1.0f);
                rectF = rectF3;
                canvas.restore();
            } else {
                rectF = rectF3;
            }
            canvas.restore();
        } else {
            rectF = rectF3;
        }
        if (x3Var.V <= 0.0f) {
            return;
        }
        canvas.save();
        View view = x3Var.S;
        RectF rectF5 = x3Var.Q;
        if (view != null) {
            view.getLocationOnScreen(iArr);
            x3Var.getLocationOnScreen(iArr2);
            rectF5.set(iArr[0] - iArr2[0], iArr[1] - iArr2[1], x3Var.S.getWidth() + i13, x3Var.S.getHeight() + (iArr[1] - iArr2[1]));
        } else {
            iArr[1] = 0;
            iArr[0] = 0;
            rectF5.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        canvas.clipRect(rectF5);
        canvas.translate(rectF5.left, rectF5.top);
        float width = rectF5.width();
        float height = rectF5.height();
        if (x3Var.M != null) {
            x3Var.P.reset();
            float width2 = rectF5.width() / x3Var.M.getWidth();
            x3Var.P.postScale(width2, width2);
            x3Var.N.setLocalMatrix(x3Var.P);
            x3Var.O.setAlpha((int) (x3Var.V * 255.0f));
            canvas.drawRect(0.0f, 0.0f, width, height, x3Var.O);
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, width, height, 255, 31);
        float f19 = width;
        float f20 = height;
        float dp = AndroidUtilities.dp(55.0f) + AndroidUtilities.dp(40.0f) + AndroidUtilities.statusBarHeight;
        float dp2 = AndroidUtilities.dp(68.0f);
        int min = (int) Math.min(AndroidUtilities.dp(340.0f), 0.95f * f19);
        if (AndroidUtilities.isTablet()) {
            f7 = rectF5.height() * 0.5f;
        } else {
            f7 = 0.75f * f20;
        }
        int i14 = (int) f7;
        float f21 = f19 / 2.0f;
        int i15 = 0;
        float f22 = 0.0f;
        while (true) {
            arrayList = x3Var.R;
            if (i15 >= arrayList.size()) {
                break;
            }
            if (((w3) arrayList.get(i15)).d.f21148c >= 0) {
                f17 = 1.0f;
            } else {
                f17 = 0.0f;
            }
            f22 += f17;
            i15++;
        }
        float d = x3Var.f21492f.d(f22, false);
        if (x3Var.getScrollWindow() <= 0.0f) {
            scrollMin = 0.0f;
        } else {
            scrollMin = ((x3Var.getScrollMin() - x3Var.getScrollOffset()) / (x3Var.getScrollWindow() * 0.15f)) * 0.2f;
        }
        float lerp = AndroidUtilities.lerp(0.0f, 1.0f - Utilities.clamp(scrollMin, 1.0f, 0.0f), x3Var.V);
        int i16 = 0;
        while (i16 < arrayList.size() + 1) {
            if (i16 == arrayList.size()) {
                f16 = dp;
                f11 = dp2;
                i11 = min;
                f12 = lerp;
                i10 = i16;
                f13 = f19;
                f14 = d;
                arrayList2 = arrayList;
                rectF2 = rectF;
                i12 = i14;
                f15 = f20;
            } else {
                w3 w3Var = (w3) arrayList.get(i16);
                if (i16 < arrayList.size()) {
                    l3 l3Var = w3Var.d;
                }
                l3 l3Var2 = w3Var.d;
                float[] fArr = w3Var.f21458g;
                float f23 = dp;
                Matrix matrix = w3Var.f21457f;
                float[] fArr2 = w3Var.h;
                if (l3Var2 == null) {
                    f10 = 1.0f;
                } else {
                    f10 = lerp;
                }
                float c10 = (d - 1.0f) - l3Var2.c();
                f11 = dp2;
                i10 = i16;
                float max = (c10 - Math.max(x3Var.getScrollMin(), x3Var.getScrollOffset())) / x3Var.getScrollWindow();
                Math.max(max, 0.0f);
                Math.max(Math.min(max, 1.0f), -4.0f);
                float min2 = (Math.min(5.0f, c10) * AndroidUtilities.dp(6.0f)) + f23;
                float f24 = i14;
                float f25 = ((((f20 - f11) - (0.26f * f24)) - min2) * max) + min2;
                float f26 = min / 2.0f;
                i11 = min;
                RectF rectF6 = x3Var.f21489d0;
                rectF6.set(f21 - f26, f25, f21 + f26, f24 + f25);
                if ((rectF6.top > f20 || rectF6.bottom < 0.0f || lerp < 0.1f) && c10 < d - 3.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z12 = z10;
                x3Var.f21483a.d(rectF, Utilities.clamp(l3Var2.c(), 1.0f, 0.0f));
                rectF.offset(x3Var.f21483a.getX(), x3Var.f21483a.getY());
                AndroidUtilities.lerpCentered(rectF, rectF6, lerp, rectF6);
                o3 o3Var = x3Var.f21483a;
                if (o3Var != null) {
                    o3Var.setupTab(l3Var2);
                }
                if (rectF6.top > f20 || rectF6.bottom < 0.0f) {
                    f12 = lerp;
                    f13 = f19;
                    f14 = d;
                    arrayList2 = arrayList;
                    rectF2 = rectF;
                    i12 = i14;
                    f15 = f20;
                    f16 = f23;
                } else {
                    canvas.save();
                    w3Var.f21453a.set(rectF6);
                    matrix.reset();
                    fArr[0] = rectF6.left;
                    float f27 = rectF6.top;
                    fArr[1] = f27;
                    float f28 = rectF6.right;
                    fArr[2] = f28;
                    fArr[3] = f27;
                    fArr[4] = f28;
                    fArr[5] = (rectF6.height() * 1.0f) + f27;
                    fArr[6] = rectF6.left;
                    fArr[7] = (rectF6.height() * 1.0f) + rectF6.top;
                    fArr2[0] = rectF6.left;
                    fArr2[1] = rectF6.top - AndroidUtilities.dp(0.0f);
                    fArr2[2] = rectF6.right;
                    fArr2[3] = rectF6.top - AndroidUtilities.dp(0.0f);
                    float f29 = f10 * 1.0f;
                    fArr2[4] = (AndroidUtilities.lerp(1.0f, 0.83f, f29) * (rectF6.width() / 2.0f)) + rectF6.centerX();
                    fArr2[5] = (AndroidUtilities.lerp(1.0f, 0.6f, f29) * ((rectF6.height() * 1.0f) + AndroidUtilities.dp(0.0f))) + (rectF6.top - AndroidUtilities.dp(0.0f));
                    fArr2[6] = rectF6.centerX() - (AndroidUtilities.lerp(1.0f, 0.83f, f29) * (rectF6.width() / 2.0f));
                    fArr2[7] = (AndroidUtilities.lerp(1.0f, 0.6f, f29) * ((rectF6.height() * 1.0f) + AndroidUtilities.dp(0.0f))) + (rectF6.top - AndroidUtilities.dp(0.0f));
                    matrix.setPolyToPoly(w3Var.f21458g, 0, w3Var.h, 0, 4);
                    canvas.concat(matrix);
                    float lerp2 = AndroidUtilities.lerp(l3Var2.b(), 1.0f, x3Var.V);
                    float lerp3 = AndroidUtilities.lerp(Utilities.clamp01((c10 - d) + 2.0f), 1.0f, Utilities.clamp01((f10 - 0.1f) / 0.8f));
                    RadialGradient radialGradient = w3Var.f21466p;
                    Paint paint = w3Var.f21465o;
                    Paint paint2 = w3Var.f21468r;
                    f12 = lerp;
                    Matrix matrix2 = w3Var.f21467q;
                    n3 n3Var = w3Var.f21455c;
                    f14 = d;
                    Path path2 = w3Var.f21464n;
                    arrayList2 = arrayList;
                    Paint paint3 = w3Var.f21456e;
                    rectF2 = rectF;
                    RectF rectF7 = w3Var.f21463m;
                    i12 = i14;
                    Paint paint4 = w3Var.f21462l;
                    f15 = f20;
                    f13 = f19;
                    float clamp = Utilities.clamp(1.0f - ((Math.abs(w3Var.f21459i) - 0.3f) / 0.7f), 1.0f, 0.0f) * lerp2;
                    if (clamp > 0.0f) {
                        float f30 = f29 * 1.0f;
                        float lerp4 = AndroidUtilities.lerp(1.0f, 1.3f, f30);
                        float currentActionBarHeight = ((k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(50.0f)) * 0.0f;
                        canvas.save();
                        canvas.rotate(w3Var.f21459i * 20.0f, (w3Var.f21459i * AndroidUtilities.dp(50.0f)) + rectF6.centerX(), rectF6.bottom + AndroidUtilities.dp(350.0f));
                        float a2 = w3Var.f21461k.a(0.01f);
                        canvas.scale(a2, a2, rectF6.centerX(), rectF6.centerY());
                        float lerp5 = AndroidUtilities.lerp(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), f29);
                        if (z12) {
                            paint4.setColor(0);
                            paint4.setShadowLayer(AndroidUtilities.dp(30.0f), 0.0f, AndroidUtilities.dp(10.0f), j6.l1(clamp * f29 * 1.0f, 536870912));
                            canvas.drawRoundRect(rectF6, lerp5, lerp5, paint4);
                            paint3.setAlpha((int) (clamp * 255.0f));
                            canvas.drawRoundRect(rectF6, lerp5, lerp5, paint3);
                            canvas.restore();
                        } else {
                            path2.rewind();
                            path2.addRoundRect(rectF6, lerp5, lerp5, Path.Direction.CW);
                            canvas.save();
                            paint4.setColor(0);
                            paint4.setShadowLayer(AndroidUtilities.dp(30.0f), 0.0f, AndroidUtilities.dp(10.0f), j6.l1(clamp * f29 * 1.0f, 536870912));
                            canvas.drawPath(path2, paint4);
                            canvas.clipPath(path2);
                            float f31 = clamp * 255.0f * f29;
                            int i17 = (int) f31;
                            paint3.setAlpha(i17);
                            canvas.drawRoundRect(rectF6, lerp5, lerp5, paint3);
                            canvas.save();
                            canvas.translate(rectF6.left, p6.a(AndroidUtilities.dp(50.0f), lerp4, rectF6.top, currentActionBarHeight));
                            canvas.scale(1.0f, AndroidUtilities.lerp(1.0f, 1.25f, f30));
                            if (n3Var != null && n3Var.f21226m != null) {
                                float width3 = rectF6.width() / n3Var.f21226m.getWidth();
                                canvas.scale(width3, width3);
                                paint.setAlpha(i17);
                                canvas.drawBitmap(n3Var.f21226m, 0.0f, 0.0f, paint);
                            }
                            canvas.restore();
                            canvas.save();
                            paint2.setAlpha((int) (f31 * 1.0f));
                            matrix2.reset();
                            float height2 = rectF6.height() / 255.0f;
                            matrix2.postScale(height2, height2);
                            matrix2.postTranslate(rectF6.centerX(), rectF6.top);
                            radialGradient.setLocalMatrix(matrix2);
                            paint2.setShader(radialGradient);
                            canvas.drawRect(rectF6, paint2);
                            canvas.restore();
                            rectF7.set(rectF6);
                            rectF7.bottom = Math.min(rectF6.height(), AndroidUtilities.dp(50.0f)) + rectF7.top;
                            rectF7.offset(0.0f, currentActionBarHeight);
                            w3Var.d.v = f29;
                            canvas.scale(1.0f, lerp4, rectF7.centerX(), rectF7.top);
                            f16 = f23;
                            w3Var.d.a(canvas, rectF7, lerp5, clamp * clamp, lerp3);
                            canvas.restore();
                            canvas.restore();
                            canvas.restore();
                        }
                    }
                    f16 = f23;
                    canvas.restore();
                }
            }
            i16 = i10 + 1;
            dp = f16;
            lerp = f12;
            d = f14;
            arrayList = arrayList2;
            rectF = rectF2;
            i14 = i12;
            dp2 = f11;
            f20 = f15;
            min = i11;
            f19 = f13;
            x3Var = this;
        }
        float f32 = dp;
        float f33 = f19;
        canvas.save();
        if (this.f21497j0 == null) {
            this.f21497j0 = new l20();
        }
        RectF rectF8 = AndroidUtilities.rectTmp;
        rectF8.set(0.0f, 0.0f, f33, f32);
        this.f21497j0.b(canvas, rectF8, 1, this.V);
        canvas.restore();
        canvas.restore();
        if (this.f21494g0 == null) {
            this.f21494g0 = new f01(LocaleController.getString(R.string.BotCloseAllTabs), 14.0f, AndroidUtilities.bold());
        }
        if (this.f21496i0 == null || this.f21495h0 != j6.I.q()) {
            boolean q6 = j6.I.q();
            this.f21495h0 = q6;
            if (q6) {
                this.f21496i0 = j6.i0(64, 64, 64, 64, 553648127, 872415231, 872415231);
            } else {
                this.f21496i0 = j6.i0(64, 64, 64, 64, 771751936, 1140850688, 1140850688);
            }
            this.f21496i0.setCallback(this);
        }
        float dp3 = this.f21494g0.f25847c + AndroidUtilities.dp(24.0f);
        float f34 = (f33 - dp3) / 2.0f;
        this.f21496i0.setBounds((int) f34, (int) ((f32 - (AndroidUtilities.dp(95.0f) / 2.0f)) - AndroidUtilities.dp(14.0f)), (int) ((f33 + dp3) / 2.0f), (int) ((f32 - (AndroidUtilities.dp(95.0f) / 2.0f)) + AndroidUtilities.dp(14.0f)));
        this.f21496i0.setAlpha((int) (this.V * 255.0f));
        this.f21496i0.draw(canvas);
        this.f21494g0.c(f34 + AndroidUtilities.dp(12.0f), f32 - (AndroidUtilities.dp(95.0f) / 2.0f), this.V, -1, canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        t3 t3Var;
        if (this.V > 0.0f && (t3Var = this.v) != null && t3Var.f(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.x3.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public final float e(boolean z10) {
        float f7;
        int i10 = 0;
        float f10 = 0.0f;
        while (true) {
            ArrayList arrayList = this.R;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (((w3) arrayList.get(i10)).d.f21148c >= 0) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            f10 += f7;
            i10++;
        }
        if (z10) {
            return this.f21492f.d(f10, false);
        }
        return f10;
    }

    public final void f() {
        float f7;
        l3 l3Var;
        o3 o3Var = this.f21483a;
        if (o3Var != null && (o3Var.getParent() instanceof View)) {
            HashSet hashSet = fi.k3.W0;
            if (!hashSet.isEmpty()) {
                Iterator it = new HashSet(hashSet).iterator();
                while (it.hasNext()) {
                    ((fi.k3) it.next()).k(true);
                }
                AndroidUtilities.runOnUIThread(new q(this, 11), 100L);
                return;
            }
            ValueAnimator valueAnimator = this.d;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.d = null;
            }
            View view = (View) this.f21483a.getParent();
            this.S = view;
            int[] iArr = this.f21484a0;
            if (view != null) {
                view.getLocationOnScreen(iArr);
            } else {
                iArr[1] = 0;
                iArr[0] = 0;
            }
            int[] iArr2 = this.f21486b0;
            getLocationOnScreen(iArr2);
            int i10 = iArr[0] - iArr2[0];
            int i11 = iArr[1] - iArr2[1];
            this.Q.set(i10, iArr[1] - iArr2[1], this.S.getWidth() + i10, this.S.getHeight() + i11);
            View view2 = this.S;
            AndroidUtilities.makingGlobalBlurBitmap = true;
            this.M = AndroidUtilities.makeBlurBitmap(view2, 14.0f, 14);
            AndroidUtilities.makingGlobalBlurBitmap = false;
            Paint paint = new Paint(1);
            this.O = paint;
            Bitmap bitmap = this.M;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            this.N = bitmapShader;
            paint.setShader(bitmapShader);
            ColorMatrix colorMatrix = new ColorMatrix();
            if (j6.I.q()) {
                f7 = 0.08f;
            } else {
                f7 = 0.25f;
            }
            AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, f7);
            this.O.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            this.P = new Matrix();
            ArrayList arrayList = this.R;
            arrayList.clear();
            ArrayList<n3> tabs = this.f21483a.getTabs();
            ArrayList<l3> tabDrawables = this.f21483a.getTabDrawables();
            for (int size = tabs.size() - 1; size >= 0; size--) {
                n3 n3Var = tabs.get(size);
                int i12 = 0;
                while (true) {
                    if (i12 < tabDrawables.size()) {
                        l3Var = tabDrawables.get(i12);
                        if (l3Var.f21146a == n3Var) {
                            break;
                        }
                        i12++;
                    } else {
                        l3Var = null;
                        break;
                    }
                }
                if (l3Var != null) {
                    arrayList.add(new w3(this, n3Var, l3Var));
                }
            }
            this.f21492f.d(arrayList.size(), true);
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
        ofFloat.addUpdateListener(new p3(this, 2));
        this.T.setDuration(250L);
        this.T.setInterpolator(pr.h);
        this.T.start();
    }

    public void setScrollOffset(float f7) {
        this.L = f7;
    }

    public void setTabsView(o3 o3Var) {
        this.f21483a = o3Var;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f21496i0 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public void setSlowerDismiss(boolean z10) {
    }
}
