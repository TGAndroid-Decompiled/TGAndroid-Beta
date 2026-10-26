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
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.q11;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.w10;
public final class b4 extends View {
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
    public s3 f22430a;
    public final int[] f22431a0;
    public y3 f22432b;
    public final int[] f22433b0;
    public p3 f22434c;
    public final RectF f22435c0;
    public ValueAnimator d;
    public final RectF f22436d0;
    public float e;
    public final RectF f22437e0;
    public final org.telegram.ui.Components.h6 f22438f;
    public final Path f22439f0;
    public q11 f22440g0;
    public final OverScroller h;
    public boolean f22441h0;
    public org.telegram.ui.Cells.y f22442i0;
    public w10 f22443j0;
    public final int f22444n;
    public final int f22445r;
    public int f22446s;
    public final x3 v;
    public a4 f22447w;
    public boolean f22448x;
    public float f22449y;

    public b4(LaunchActivity launchActivity) {
        super(launchActivity);
        this.f22438f = new org.telegram.ui.Components.h6(this, 0L, 350L, ds.h);
        this.Q = new RectF();
        this.R = new ArrayList();
        this.f22431a0 = new int[2];
        this.f22433b0 = new int[2];
        this.f22435c0 = new RectF();
        this.f22436d0 = new RectF();
        this.f22437e0 = new RectF();
        this.f22439f0 = new Path();
        setWillNotDraw(false);
        this.h = new OverScroller(launchActivity);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(launchActivity);
        this.f22444n = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f22445r = viewConfiguration.getScaledMinimumFlingVelocity();
        x3 x3Var = new x3(this, this);
        this.v = x3Var;
        r0.i0.k(this, x3Var);
        setImportantForAccessibility(2);
        r0.a0.i(this, new p(this, 6));
    }

    public static void g(ViewGroup viewGroup, float f7, final li.s2 s2Var) {
        if (viewGroup.getWidth() > 0 && viewGroup.getHeight() > 0) {
            final SurfaceTexture b10 = org.telegram.messenger.b4.b();
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
                    li.s2 s2Var2 = li.s2.this;
                    Bitmap bitmap = createBitmap;
                    Surface surface2 = surface;
                    SurfaceTexture surfaceTexture = b10;
                    if (i10 == 0) {
                        s2Var2.run(bitmap);
                    } else {
                        bitmap.recycle();
                        s2Var2.run(null);
                    }
                    surface2.release();
                    surfaceTexture.release();
                }
            }, new Handler());
            return;
        }
        s2Var.run(null);
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
        x3 x3Var = this.v;
        if (x3Var != null) {
            x3Var.i();
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
        s3 s3Var = this.f22430a;
        if (s3Var != null) {
            s3Var.f23073b = false;
            s3Var.invalidate();
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
        ofFloat.addUpdateListener(new t3(this, 0));
        this.W.addListener(new h(this, 4));
        this.W.setInterpolator(ds.h);
        this.W.setDuration(320L);
        this.W.start();
    }

    public final void b(y3 y3Var) {
        ValueAnimator valueAnimator;
        if (this.f22430a == null) {
            return;
        }
        if (this.f22432b != null && (valueAnimator = this.d) != null) {
            valueAnimator.end();
            this.d = null;
        }
        this.f22432b = y3Var;
        y3Var.setLastVisible(false);
        ValueAnimator valueAnimator2 = this.d;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        r3 a2 = y3Var.a();
        s3 s3Var = this.f22430a;
        ArrayList<r3> tabs = s3Var.getTabs();
        ArrayList<p3> tabDrawables = s3Var.getTabDrawables();
        p3 p3Var = new p3(s3Var, a2);
        p3Var.e.d(-1.0f, true);
        p3Var.f22934f.d(0.0f, true);
        tabDrawables.add(p3Var);
        tabs.add(0, a2);
        for (int i10 = 0; i10 < tabDrawables.size(); i10++) {
            p3 p3Var2 = tabDrawables.get(i10);
            int indexOf = tabs.indexOf(p3Var2.f22931a);
            p3Var2.d = indexOf;
            if (indexOf >= 0) {
                p3Var2.f22933c = indexOf;
            }
        }
        s3Var.n();
        s3Var.o(true);
        s3Var.invalidate();
        q3 q3Var = s3Var.e;
        if (q3Var != null) {
            q3Var.i();
        }
        this.f22434c = p3Var;
        post(new q(y3Var, 10));
        invalidate();
        this.e = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.d = ofFloat;
        ofFloat.addUpdateListener(new t3(this, 1));
        this.d.addListener(new w3(this, a2, y3Var));
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
        int i10;
        float scrollMin;
        float f10;
        float f11;
        int i11;
        int i12;
        int i13;
        float f12;
        float f13;
        float f14;
        ArrayList arrayList2;
        RectF rectF2;
        int i14;
        float f15;
        float f16;
        float f17;
        int i15;
        b4 b4Var = this;
        super.dispatchDraw(canvas);
        y3 y3Var = b4Var.f22432b;
        float f18 = 1.0f;
        int i16 = 1;
        int[] iArr = b4Var.f22431a0;
        int[] iArr2 = b4Var.f22433b0;
        int i17 = 0;
        RectF rectF3 = b4Var.f22435c0;
        if (y3Var != null) {
            b4Var.getLocationOnScreen(iArr2);
            b4Var.f22430a.getLocationOnScreen(iArr);
            b4Var.f22430a.d(rectF3, 0.0f);
            rectF3.offset(iArr[0] - iArr2[0], iArr[1] - iArr2[1]);
            canvas.save();
            canvas.clipRect(0, 0, b4Var.getMeasuredWidth(), b4Var.getMeasuredHeight() - b4Var.f22446s);
            z3 mo36getWindowView = b4Var.f22432b.mo36getWindowView();
            float f19 = b4Var.e;
            RectF rectF4 = b4Var.f22437e0;
            float y3 = mo36getWindowView.y(canvas, rectF3, f19, rectF4, f19);
            if (b4Var.f22434c != null) {
                Path path = b4Var.f22439f0;
                path.rewind();
                path.addRoundRect(rectF4, y3, y3, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                float d = ic.a.d(1.0f, b4Var.e, AndroidUtilities.dp(50.0f), rectF4.top);
                rectF3.set(rectF4.left, d, rectF4.right, AndroidUtilities.dp(50.0f) + d);
                b4Var.f22430a.setupTab(b4Var.f22434c);
                b4Var.f22434c.a(canvas, rectF3, y3, b4Var.e, 1.0f);
                rectF = rectF3;
                canvas.restore();
            } else {
                rectF = rectF3;
            }
            canvas.restore();
        } else {
            rectF = rectF3;
        }
        if (b4Var.V <= 0.0f) {
            return;
        }
        canvas.save();
        View view = b4Var.S;
        RectF rectF5 = b4Var.Q;
        if (view != null) {
            view.getLocationOnScreen(iArr);
            b4Var.getLocationOnScreen(iArr2);
            rectF5.set(iArr[0] - iArr2[0], iArr[1] - iArr2[1], b4Var.S.getWidth() + i15, b4Var.S.getHeight() + (iArr[1] - iArr2[1]));
        } else {
            iArr[1] = 0;
            iArr[0] = 0;
            rectF5.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        canvas.clipRect(rectF5);
        canvas.translate(rectF5.left, rectF5.top);
        float width = rectF5.width();
        float height = rectF5.height();
        if (b4Var.M != null) {
            b4Var.P.reset();
            float width2 = rectF5.width() / b4Var.M.getWidth();
            b4Var.P.postScale(width2, width2);
            b4Var.N.setLocalMatrix(b4Var.P);
            b4Var.O.setAlpha((int) (b4Var.V * 255.0f));
            canvas.drawRect(0.0f, 0.0f, width, height, b4Var.O);
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, width, height, 255, 31);
        float f20 = width;
        float f21 = height;
        float dp = AndroidUtilities.dp(55.0f) + AndroidUtilities.dp(40.0f) + AndroidUtilities.statusBarHeight;
        float dp2 = AndroidUtilities.dp(68.0f);
        int min = (int) Math.min(AndroidUtilities.dp(340.0f), 0.95f * f20);
        if (AndroidUtilities.isTablet()) {
            f7 = rectF5.height() * 0.5f;
        } else {
            f7 = 0.75f * f21;
        }
        int i18 = (int) f7;
        float f22 = f20 / 2.0f;
        float f23 = 0.0f;
        int i19 = 0;
        while (true) {
            arrayList = b4Var.R;
            i10 = i16;
            if (i19 >= arrayList.size()) {
                break;
            }
            if (((a4) arrayList.get(i19)).d.d >= 0) {
                f17 = 1.0f;
            } else {
                f17 = 0.0f;
            }
            f23 += f17;
            i19++;
            i16 = i10;
        }
        float d10 = b4Var.f22438f.d(f23, false);
        if (b4Var.getScrollWindow() <= 0.0f) {
            scrollMin = 0.0f;
        } else {
            scrollMin = ((b4Var.getScrollMin() - b4Var.getScrollOffset()) / (b4Var.getScrollWindow() * 0.15f)) * 0.2f;
        }
        float lerp = AndroidUtilities.lerp(0.0f, 1.0f - Utilities.clamp(scrollMin, 1.0f, 0.0f), b4Var.V);
        int i20 = 0;
        while (true) {
            int i21 = i17;
            if (i20 >= arrayList.size() + 1) {
                break;
            }
            if (i20 == arrayList.size()) {
                f16 = dp;
                f11 = dp2;
                i12 = min;
                f12 = lerp;
                i11 = i20;
                f13 = f20;
                f14 = d10;
                arrayList2 = arrayList;
                rectF2 = rectF;
                i14 = i18;
                f15 = f21;
            } else {
                a4 a4Var = (a4) arrayList.get(i20);
                float f24 = f18;
                if (i20 < arrayList.size()) {
                    p3 p3Var = a4Var.d;
                }
                p3 p3Var2 = a4Var.d;
                float[] fArr = a4Var.f22386g;
                float f25 = dp;
                Matrix matrix = a4Var.f22385f;
                float[] fArr2 = a4Var.h;
                if (p3Var2 == null) {
                    f10 = f24;
                } else {
                    f10 = lerp;
                }
                float c10 = (d10 - f24) - p3Var2.c();
                f11 = dp2;
                i11 = i20;
                float max = (c10 - Math.max(b4Var.getScrollMin(), b4Var.getScrollOffset())) / b4Var.getScrollWindow();
                Math.max(max, 0.0f);
                Math.max(Math.min(max, f24), -4.0f);
                float min2 = (Math.min(5.0f, c10) * AndroidUtilities.dp(6.0f)) + f25;
                float f26 = i18;
                float f27 = ((((f21 - f11) - (0.26f * f26)) - min2) * max) + min2;
                float f28 = min / 2.0f;
                i12 = min;
                RectF rectF6 = b4Var.f22436d0;
                rectF6.set(f22 - f28, f27, f22 + f28, f26 + f27);
                if ((rectF6.top > f21 || rectF6.bottom < 0.0f || lerp < 0.1f) && c10 < d10 - 3.0f) {
                    i13 = i10;
                } else {
                    i13 = i21;
                }
                int i22 = i13;
                b4Var.f22430a.d(rectF, Utilities.clamp(p3Var2.c(), 1.0f, 0.0f));
                rectF.offset(b4Var.f22430a.getX(), b4Var.f22430a.getY());
                AndroidUtilities.lerpCentered(rectF, rectF6, lerp, rectF6);
                s3 s3Var = b4Var.f22430a;
                if (s3Var != null) {
                    s3Var.setupTab(p3Var2);
                }
                if (rectF6.top > f21 || rectF6.bottom < 0.0f) {
                    f12 = lerp;
                    f13 = f20;
                    f14 = d10;
                    arrayList2 = arrayList;
                    rectF2 = rectF;
                    i14 = i18;
                    f15 = f21;
                    f16 = f25;
                } else {
                    canvas.save();
                    a4Var.f22382a.set(rectF6);
                    matrix.reset();
                    fArr[i21] = rectF6.left;
                    float f29 = rectF6.top;
                    fArr[i10] = f29;
                    float f30 = rectF6.right;
                    fArr[2] = f30;
                    fArr[3] = f29;
                    fArr[4] = f30;
                    fArr[5] = (rectF6.height() * 1.0f) + f29;
                    fArr[6] = rectF6.left;
                    fArr[7] = (rectF6.height() * 1.0f) + rectF6.top;
                    fArr2[i21] = rectF6.left;
                    fArr2[i10] = rectF6.top - AndroidUtilities.dp(0.0f);
                    fArr2[2] = rectF6.right;
                    fArr2[3] = rectF6.top - AndroidUtilities.dp(0.0f);
                    float f31 = f10 * 1.0f;
                    fArr2[4] = (AndroidUtilities.lerp(1.0f, 0.83f, f31) * (rectF6.width() / 2.0f)) + rectF6.centerX();
                    fArr2[5] = (AndroidUtilities.lerp(1.0f, 0.6f, f31) * ((rectF6.height() * 1.0f) + AndroidUtilities.dp(0.0f))) + (rectF6.top - AndroidUtilities.dp(0.0f));
                    fArr2[6] = rectF6.centerX() - (AndroidUtilities.lerp(1.0f, 0.83f, f31) * (rectF6.width() / 2.0f));
                    fArr2[7] = (AndroidUtilities.lerp(1.0f, 0.6f, f31) * ((rectF6.height() * 1.0f) + AndroidUtilities.dp(0.0f))) + (rectF6.top - AndroidUtilities.dp(0.0f));
                    matrix.setPolyToPoly(a4Var.f22386g, 0, a4Var.h, 0, 4);
                    canvas.concat(matrix);
                    float lerp2 = AndroidUtilities.lerp(p3Var2.b(), 1.0f, b4Var.V);
                    float lerp3 = AndroidUtilities.lerp(Utilities.clamp01((c10 - d10) + 2.0f), 1.0f, Utilities.clamp01((f10 - 0.1f) / 0.8f));
                    RadialGradient radialGradient = a4Var.f22394p;
                    Paint paint = a4Var.f22393o;
                    Paint paint2 = a4Var.f22396r;
                    f12 = lerp;
                    Matrix matrix2 = a4Var.f22395q;
                    r3 r3Var = a4Var.f22384c;
                    f14 = d10;
                    Path path2 = a4Var.f22392n;
                    arrayList2 = arrayList;
                    Paint paint3 = a4Var.e;
                    rectF2 = rectF;
                    RectF rectF7 = a4Var.f22391m;
                    i14 = i18;
                    Paint paint4 = a4Var.f22390l;
                    f15 = f21;
                    f13 = f20;
                    float clamp = Utilities.clamp(1.0f - ((Math.abs(a4Var.f22387i) - 0.3f) / 0.7f), 1.0f, 0.0f) * lerp2;
                    if (clamp > 0.0f) {
                        float f32 = f31 * 1.0f;
                        float lerp4 = AndroidUtilities.lerp(1.0f, 1.3f, f32);
                        float currentActionBarHeight = ((k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(50.0f)) * 0.0f;
                        canvas.save();
                        canvas.rotate(a4Var.f22387i * 20.0f, (a4Var.f22387i * AndroidUtilities.dp(50.0f)) + rectF6.centerX(), rectF6.bottom + AndroidUtilities.dp(350.0f));
                        float a2 = a4Var.f22389k.a(0.01f);
                        canvas.scale(a2, a2, rectF6.centerX(), rectF6.centerY());
                        float lerp5 = AndroidUtilities.lerp(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), f31);
                        if (i22 != 0) {
                            paint4.setColor(0);
                            paint4.setShadowLayer(AndroidUtilities.dp(30.0f), 0.0f, AndroidUtilities.dp(10.0f), y6.o1(clamp * f31 * 1.0f, 536870912));
                            canvas.drawRoundRect(rectF6, lerp5, lerp5, paint4);
                            paint3.setAlpha((int) (clamp * 255.0f));
                            canvas.drawRoundRect(rectF6, lerp5, lerp5, paint3);
                            canvas.restore();
                        } else {
                            path2.rewind();
                            path2.addRoundRect(rectF6, lerp5, lerp5, Path.Direction.CW);
                            canvas.save();
                            paint4.setColor(0);
                            paint4.setShadowLayer(AndroidUtilities.dp(30.0f), 0.0f, AndroidUtilities.dp(10.0f), y6.o1(clamp * f31 * 1.0f, 536870912));
                            canvas.drawPath(path2, paint4);
                            canvas.clipPath(path2);
                            float f33 = clamp * 255.0f * f31;
                            int i23 = (int) f33;
                            paint3.setAlpha(i23);
                            canvas.drawRoundRect(rectF6, lerp5, lerp5, paint3);
                            canvas.save();
                            canvas.translate(rectF6.left, b10.e(AndroidUtilities.dp(50.0f), lerp4, rectF6.top, currentActionBarHeight));
                            canvas.scale(1.0f, AndroidUtilities.lerp(1.0f, 1.25f, f32));
                            if (r3Var != null && r3Var.f23013m != null) {
                                float width3 = rectF6.width() / r3Var.f23013m.getWidth();
                                canvas.scale(width3, width3);
                                paint.setAlpha(i23);
                                canvas.drawBitmap(r3Var.f23013m, 0.0f, 0.0f, paint);
                            }
                            canvas.restore();
                            canvas.save();
                            paint2.setAlpha((int) (f33 * 1.0f));
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
                            a4Var.d.f22949w = f31;
                            canvas.scale(1.0f, lerp4, rectF7.centerX(), rectF7.top);
                            f16 = f25;
                            a4Var.d.a(canvas, rectF7, lerp5, clamp * clamp, lerp3);
                            canvas.restore();
                            canvas.restore();
                            canvas.restore();
                        }
                    }
                    f16 = f25;
                    canvas.restore();
                }
            }
            i20 = i11 + 1;
            dp = f16;
            i17 = i21;
            lerp = f12;
            d10 = f14;
            arrayList = arrayList2;
            rectF = rectF2;
            i18 = i14;
            dp2 = f11;
            f21 = f15;
            min = i12;
            f20 = f13;
            f18 = 1.0f;
            b4Var = this;
        }
        float f34 = dp;
        float f35 = f20;
        canvas.save();
        if (this.f22443j0 == null) {
            this.f22443j0 = new w10();
        }
        RectF rectF8 = AndroidUtilities.rectTmp;
        rectF8.set(0.0f, 0.0f, f35, f34);
        this.f22443j0.b(canvas, rectF8, i10, this.V);
        canvas.restore();
        canvas.restore();
        if (this.f22440g0 == null) {
            this.f22440g0 = new q11(LocaleController.getString(R.string.BotCloseAllTabs), 14.0f, AndroidUtilities.bold());
        }
        if (this.f22442i0 == null || this.f22441h0 != y6.I.q()) {
            boolean q5 = y6.I.q();
            this.f22441h0 = q5;
            if (q5) {
                this.f22442i0 = y6.j0(64, 64, 64, 64, 553648127, 872415231, 872415231);
            } else {
                this.f22442i0 = y6.j0(64, 64, 64, 64, 771751936, 1140850688, 1140850688);
            }
            this.f22442i0.setCallback(this);
        }
        float dp3 = this.f22440g0.f31790c + AndroidUtilities.dp(24.0f);
        float f36 = (f35 - dp3) / 2.0f;
        this.f22442i0.setBounds((int) f36, (int) ((f34 - (AndroidUtilities.dp(95.0f) / 2.0f)) - AndroidUtilities.dp(14.0f)), (int) ((f35 + dp3) / 2.0f), (int) ((f34 - (AndroidUtilities.dp(95.0f) / 2.0f)) + AndroidUtilities.dp(14.0f)));
        this.f22442i0.setAlpha((int) (this.V * 255.0f));
        this.f22442i0.draw(canvas);
        this.f22440g0.c(f36 + AndroidUtilities.dp(12.0f), f34 - (AndroidUtilities.dp(95.0f) / 2.0f), this.V, -1, canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        x3 x3Var;
        if (this.V > 0.0f && (x3Var = this.v) != null && x3Var.f(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.b4.dispatchTouchEvent(android.view.MotionEvent):boolean");
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
            if (((a4) arrayList.get(i10)).d.d >= 0) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            f10 += f7;
            i10++;
        }
        if (z10) {
            return this.f22438f.d(f10, false);
        }
        return f10;
    }

    public final void f() {
        float f7;
        p3 p3Var;
        s3 s3Var = this.f22430a;
        if (s3Var != null && (s3Var.getParent() instanceof View)) {
            HashSet hashSet = hi.m3.f13098a1;
            if (!hashSet.isEmpty()) {
                Iterator it = new HashSet(hashSet).iterator();
                while (it.hasNext()) {
                    ((hi.m3) it.next()).k(true);
                }
                AndroidUtilities.runOnUIThread(new q(this, 11), 100L);
                return;
            }
            ValueAnimator valueAnimator = this.d;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.d = null;
            }
            View view = (View) this.f22430a.getParent();
            this.S = view;
            int[] iArr = this.f22431a0;
            if (view != null) {
                view.getLocationOnScreen(iArr);
            } else {
                iArr[1] = 0;
                iArr[0] = 0;
            }
            int[] iArr2 = this.f22433b0;
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
            if (y6.I.q()) {
                f7 = 0.08f;
            } else {
                f7 = 0.25f;
            }
            AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, f7);
            this.O.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            this.P = new Matrix();
            ArrayList arrayList = this.R;
            arrayList.clear();
            ArrayList<r3> tabs = this.f22430a.getTabs();
            ArrayList<p3> tabDrawables = this.f22430a.getTabDrawables();
            for (int size = tabs.size() - 1; size >= 0; size--) {
                r3 r3Var = tabs.get(size);
                int i12 = 0;
                while (true) {
                    if (i12 < tabDrawables.size()) {
                        p3Var = tabDrawables.get(i12);
                        if (p3Var.f22931a == r3Var) {
                            break;
                        }
                        i12++;
                    } else {
                        p3Var = null;
                        break;
                    }
                }
                if (p3Var != null) {
                    arrayList.add(new a4(this, r3Var, p3Var));
                }
            }
            this.f22438f.d(arrayList.size(), true);
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
        ofFloat.addUpdateListener(new t3(this, 2));
        this.T.setDuration(250L);
        this.T.setInterpolator(ds.h);
        this.T.start();
    }

    public void setScrollOffset(float f7) {
        this.L = f7;
    }

    public void setTabsView(s3 s3Var) {
        this.f22430a = s3Var;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f22442i0 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public void setSlowerDismiss(boolean z10) {
    }
}
