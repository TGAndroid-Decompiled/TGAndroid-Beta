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
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.t01;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.g20;
public final class v3 extends View {
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
    public m3 f19839a;
    public final int[] f19840a0;
    public s3 f19841b;
    public final int[] f19842b0;
    public j3 f19843c;
    public final RectF f19844c0;
    public ValueAnimator d;
    public final RectF f19845d0;
    public float e;
    public final RectF f19846e0;
    public final org.telegram.ui.Components.e6 f19847f;
    public final Path f19848f0;
    public t01 f19849g0;
    public final OverScroller h;
    public boolean f19850h0;
    public org.telegram.ui.Cells.z f19851i0;
    public g20 f19852j0;
    public final int f19853n;
    public final int f19854r;
    public int f19855s;
    public final r3 v;
    public u3 f19856w;
    public boolean f19857x;
    public float f19858y;

    public v3(LaunchActivity launchActivity) {
        super(launchActivity);
        this.f19847f = new org.telegram.ui.Components.e6(this, 0L, 350L, rr.h);
        this.Q = new RectF();
        this.R = new ArrayList();
        this.f19840a0 = new int[2];
        this.f19842b0 = new int[2];
        this.f19844c0 = new RectF();
        this.f19845d0 = new RectF();
        this.f19846e0 = new RectF();
        this.f19848f0 = new Path();
        setWillNotDraw(false);
        this.h = new OverScroller(launchActivity);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(launchActivity);
        this.f19853n = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f19854r = viewConfiguration.getScaledMinimumFlingVelocity();
        r3 r3Var = new r3(this, this);
        this.v = r3Var;
        r0.i0.k(this, r3Var);
        setImportantForAccessibility(2);
        r0.a0.j(this, new n(this, 7));
    }

    public static void g(ViewGroup viewGroup, float f7, final ai.g3 g3Var) {
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
                    ai.g3 g3Var2 = ai.g3.this;
                    Bitmap bitmap = createBitmap;
                    Surface surface2 = surface;
                    SurfaceTexture surfaceTexture = b10;
                    if (i10 == 0) {
                        g3Var2.run(bitmap);
                    } else {
                        bitmap.recycle();
                        g3Var2.run(null);
                    }
                    surface2.release();
                    surfaceTexture.release();
                }
            }, new Handler());
            return;
        }
        g3Var.run(null);
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
        r3 r3Var = this.v;
        if (r3Var != null) {
            r3Var.i();
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
        m3 m3Var = this.f19839a;
        if (m3Var != null) {
            m3Var.f19627b = false;
            m3Var.invalidate();
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
        ofFloat.addUpdateListener(new n3(this, 0));
        this.W.addListener(new h(this, 4));
        this.W.setInterpolator(rr.h);
        this.W.setDuration(320L);
        this.W.start();
    }

    public final void b(s3 s3Var) {
        ValueAnimator valueAnimator;
        if (this.f19839a == null) {
            return;
        }
        if (this.f19841b != null && (valueAnimator = this.d) != null) {
            valueAnimator.end();
            this.d = null;
        }
        this.f19841b = s3Var;
        s3Var.setLastVisible(false);
        ValueAnimator valueAnimator2 = this.d;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        l3 a2 = s3Var.a();
        m3 m3Var = this.f19839a;
        ArrayList<l3> tabs = m3Var.getTabs();
        ArrayList<j3> tabDrawables = m3Var.getTabDrawables();
        j3 j3Var = new j3(m3Var, a2);
        j3Var.d.d(-1.0f, true);
        j3Var.e.d(0.0f, true);
        tabDrawables.add(j3Var);
        tabs.add(0, a2);
        for (int i10 = 0; i10 < tabDrawables.size(); i10++) {
            j3 j3Var2 = tabDrawables.get(i10);
            int indexOf = tabs.indexOf(j3Var2.f19474a);
            j3Var2.f19476c = indexOf;
            if (indexOf >= 0) {
                j3Var2.f19475b = indexOf;
            }
        }
        m3Var.n();
        m3Var.o(true);
        m3Var.invalidate();
        k3 k3Var = m3Var.e;
        if (k3Var != null) {
            k3Var.i();
        }
        this.f19843c = j3Var;
        post(new p(s3Var, 10));
        invalidate();
        this.e = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.d = ofFloat;
        ofFloat.addUpdateListener(new n3(this, 1));
        this.d.addListener(new q3(this, a2, s3Var));
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
        v3 v3Var = this;
        super.dispatchDraw(canvas);
        s3 s3Var = v3Var.f19841b;
        int[] iArr = v3Var.f19840a0;
        int[] iArr2 = v3Var.f19842b0;
        RectF rectF3 = v3Var.f19844c0;
        if (s3Var != null) {
            v3Var.getLocationOnScreen(iArr2);
            v3Var.f19839a.getLocationOnScreen(iArr);
            v3Var.f19839a.d(rectF3, 0.0f);
            rectF3.offset(iArr[0] - iArr2[0], iArr[1] - iArr2[1]);
            canvas.save();
            canvas.clipRect(0, 0, v3Var.getMeasuredWidth(), v3Var.getMeasuredHeight() - v3Var.f19855s);
            t3 mo37getWindowView = v3Var.f19841b.mo37getWindowView();
            float f18 = v3Var.e;
            RectF rectF4 = v3Var.f19846e0;
            float x10 = mo37getWindowView.x(canvas, rectF3, f18, rectF4, f18);
            if (v3Var.f19843c != null) {
                Path path = v3Var.f19848f0;
                path.rewind();
                path.addRoundRect(rectF4, x10, x10, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                float b10 = com.google.android.gms.internal.vision.e2.b(1.0f, v3Var.e, AndroidUtilities.dp(50.0f), rectF4.top);
                rectF3.set(rectF4.left, b10, rectF4.right, AndroidUtilities.dp(50.0f) + b10);
                v3Var.f19839a.setupTab(v3Var.f19843c);
                v3Var.f19843c.a(canvas, rectF3, x10, v3Var.e, 1.0f);
                rectF = rectF3;
                canvas.restore();
            } else {
                rectF = rectF3;
            }
            canvas.restore();
        } else {
            rectF = rectF3;
        }
        if (v3Var.V <= 0.0f) {
            return;
        }
        canvas.save();
        View view = v3Var.S;
        RectF rectF5 = v3Var.Q;
        if (view != null) {
            view.getLocationOnScreen(iArr);
            v3Var.getLocationOnScreen(iArr2);
            rectF5.set(iArr[0] - iArr2[0], iArr[1] - iArr2[1], v3Var.S.getWidth() + i13, v3Var.S.getHeight() + (iArr[1] - iArr2[1]));
        } else {
            iArr[1] = 0;
            iArr[0] = 0;
            rectF5.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        canvas.clipRect(rectF5);
        canvas.translate(rectF5.left, rectF5.top);
        float width = rectF5.width();
        float height = rectF5.height();
        if (v3Var.M != null) {
            v3Var.P.reset();
            float width2 = rectF5.width() / v3Var.M.getWidth();
            v3Var.P.postScale(width2, width2);
            v3Var.N.setLocalMatrix(v3Var.P);
            v3Var.O.setAlpha((int) (v3Var.V * 255.0f));
            canvas.drawRect(0.0f, 0.0f, width, height, v3Var.O);
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
            arrayList = v3Var.R;
            if (i15 >= arrayList.size()) {
                break;
            }
            if (((u3) arrayList.get(i15)).d.f19476c >= 0) {
                f17 = 1.0f;
            } else {
                f17 = 0.0f;
            }
            f22 += f17;
            i15++;
        }
        float d = v3Var.f19847f.d(f22, false);
        if (v3Var.getScrollWindow() <= 0.0f) {
            scrollMin = 0.0f;
        } else {
            scrollMin = ((v3Var.getScrollMin() - v3Var.getScrollOffset()) / (v3Var.getScrollWindow() * 0.15f)) * 0.2f;
        }
        float lerp = AndroidUtilities.lerp(0.0f, 1.0f - Utilities.clamp(scrollMin, 1.0f, 0.0f), v3Var.V);
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
                u3 u3Var = (u3) arrayList.get(i16);
                if (i16 < arrayList.size()) {
                    j3 j3Var = u3Var.d;
                }
                j3 j3Var2 = u3Var.d;
                float[] fArr = u3Var.f19810g;
                float f23 = dp;
                Matrix matrix = u3Var.f19809f;
                float[] fArr2 = u3Var.h;
                if (j3Var2 == null) {
                    f10 = 1.0f;
                } else {
                    f10 = lerp;
                }
                float c10 = (d - 1.0f) - j3Var2.c();
                f11 = dp2;
                i10 = i16;
                float max = (c10 - Math.max(v3Var.getScrollMin(), v3Var.getScrollOffset())) / v3Var.getScrollWindow();
                Math.max(max, 0.0f);
                Math.max(Math.min(max, 1.0f), -4.0f);
                float min2 = (Math.min(5.0f, c10) * AndroidUtilities.dp(6.0f)) + f23;
                float f24 = i14;
                float f25 = ((((f20 - f11) - (0.26f * f24)) - min2) * max) + min2;
                float f26 = min / 2.0f;
                i11 = min;
                RectF rectF6 = v3Var.f19845d0;
                rectF6.set(f21 - f26, f25, f21 + f26, f24 + f25);
                if ((rectF6.top > f20 || rectF6.bottom < 0.0f || lerp < 0.1f) && c10 < d - 3.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z11 = z10;
                v3Var.f19839a.d(rectF, Utilities.clamp(j3Var2.c(), 1.0f, 0.0f));
                rectF.offset(v3Var.f19839a.getX(), v3Var.f19839a.getY());
                AndroidUtilities.lerpCentered(rectF, rectF6, lerp, rectF6);
                m3 m3Var = v3Var.f19839a;
                if (m3Var != null) {
                    m3Var.setupTab(j3Var2);
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
                    u3Var.f19806a.set(rectF6);
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
                    matrix.setPolyToPoly(u3Var.f19810g, 0, u3Var.h, 0, 4);
                    canvas.concat(matrix);
                    float lerp2 = AndroidUtilities.lerp(j3Var2.b(), 1.0f, v3Var.V);
                    float lerp3 = AndroidUtilities.lerp(Utilities.clamp01((c10 - d) + 2.0f), 1.0f, Utilities.clamp01((f10 - 0.1f) / 0.8f));
                    RadialGradient radialGradient = u3Var.f19818p;
                    Paint paint = u3Var.f19817o;
                    Paint paint2 = u3Var.f19820r;
                    f12 = lerp;
                    Matrix matrix2 = u3Var.f19819q;
                    l3 l3Var = u3Var.f19808c;
                    f14 = d;
                    Path path2 = u3Var.f19816n;
                    arrayList2 = arrayList;
                    Paint paint3 = u3Var.e;
                    rectF2 = rectF;
                    RectF rectF7 = u3Var.f19815m;
                    i12 = i14;
                    Paint paint4 = u3Var.f19814l;
                    f15 = f20;
                    f13 = f19;
                    float clamp = Utilities.clamp(1.0f - ((Math.abs(u3Var.f19811i) - 0.3f) / 0.7f), 1.0f, 0.0f) * lerp2;
                    if (clamp > 0.0f) {
                        float f30 = f29 * 1.0f;
                        float lerp4 = AndroidUtilities.lerp(1.0f, 1.3f, f30);
                        float currentActionBarHeight = ((k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(50.0f)) * 0.0f;
                        canvas.save();
                        canvas.rotate(u3Var.f19811i * 20.0f, (u3Var.f19811i * AndroidUtilities.dp(50.0f)) + rectF6.centerX(), rectF6.bottom + AndroidUtilities.dp(350.0f));
                        float a2 = u3Var.f19813k.a(0.01f);
                        canvas.scale(a2, a2, rectF6.centerX(), rectF6.centerY());
                        float lerp5 = AndroidUtilities.lerp(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), f29);
                        if (z11) {
                            paint4.setColor(0);
                            paint4.setShadowLayer(AndroidUtilities.dp(30.0f), 0.0f, AndroidUtilities.dp(10.0f), h6.l1(clamp * f29 * 1.0f, 536870912));
                            canvas.drawRoundRect(rectF6, lerp5, lerp5, paint4);
                            paint3.setAlpha((int) (clamp * 255.0f));
                            canvas.drawRoundRect(rectF6, lerp5, lerp5, paint3);
                            canvas.restore();
                        } else {
                            path2.rewind();
                            path2.addRoundRect(rectF6, lerp5, lerp5, Path.Direction.CW);
                            canvas.save();
                            paint4.setColor(0);
                            paint4.setShadowLayer(AndroidUtilities.dp(30.0f), 0.0f, AndroidUtilities.dp(10.0f), h6.l1(clamp * f29 * 1.0f, 536870912));
                            canvas.drawPath(path2, paint4);
                            canvas.clipPath(path2);
                            float f31 = clamp * 255.0f * f29;
                            int i17 = (int) f31;
                            paint3.setAlpha(i17);
                            canvas.drawRoundRect(rectF6, lerp5, lerp5, paint3);
                            canvas.save();
                            canvas.translate(rectF6.left, org.telegram.ui.Cells.c1.b(AndroidUtilities.dp(50.0f), lerp4, rectF6.top, currentActionBarHeight));
                            canvas.scale(1.0f, AndroidUtilities.lerp(1.0f, 1.25f, f30));
                            if (l3Var != null && l3Var.f19592m != null) {
                                float width3 = rectF6.width() / l3Var.f19592m.getWidth();
                                canvas.scale(width3, width3);
                                paint.setAlpha(i17);
                                canvas.drawBitmap(l3Var.f19592m, 0.0f, 0.0f, paint);
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
                            u3Var.d.v = f29;
                            canvas.scale(1.0f, lerp4, rectF7.centerX(), rectF7.top);
                            f16 = f23;
                            u3Var.d.a(canvas, rectF7, lerp5, clamp * clamp, lerp3);
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
            v3Var = this;
        }
        float f32 = dp;
        float f33 = f19;
        canvas.save();
        if (this.f19852j0 == null) {
            this.f19852j0 = new g20();
        }
        RectF rectF8 = AndroidUtilities.rectTmp;
        rectF8.set(0.0f, 0.0f, f33, f32);
        this.f19852j0.b(canvas, rectF8, 1, this.V);
        canvas.restore();
        canvas.restore();
        if (this.f19849g0 == null) {
            this.f19849g0 = new t01(LocaleController.getString(R.string.BotCloseAllTabs), 14.0f, AndroidUtilities.bold());
        }
        if (this.f19851i0 == null || this.f19850h0 != h6.I.q()) {
            boolean q6 = h6.I.q();
            this.f19850h0 = q6;
            if (q6) {
                this.f19851i0 = h6.i0(64, 64, 64, 64, 553648127, 872415231, 872415231);
            } else {
                this.f19851i0 = h6.i0(64, 64, 64, 64, 771751936, 1140850688, 1140850688);
            }
            this.f19851i0.setCallback(this);
        }
        float dp3 = this.f19849g0.f28357c + AndroidUtilities.dp(24.0f);
        float f34 = (f33 - dp3) / 2.0f;
        this.f19851i0.setBounds((int) f34, (int) ((f32 - (AndroidUtilities.dp(95.0f) / 2.0f)) - AndroidUtilities.dp(14.0f)), (int) ((f33 + dp3) / 2.0f), (int) ((f32 - (AndroidUtilities.dp(95.0f) / 2.0f)) + AndroidUtilities.dp(14.0f)));
        this.f19851i0.setAlpha((int) (this.V * 255.0f));
        this.f19851i0.draw(canvas);
        this.f19849g0.c(f34 + AndroidUtilities.dp(12.0f), f32 - (AndroidUtilities.dp(95.0f) / 2.0f), this.V, -1, canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        r3 r3Var;
        if (this.V > 0.0f && (r3Var = this.v) != null && r3Var.f(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.v3.dispatchTouchEvent(android.view.MotionEvent):boolean");
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
            if (((u3) arrayList.get(i10)).d.f19476c >= 0) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            f10 += f7;
            i10++;
        }
        if (z10) {
            return this.f19847f.d(f10, false);
        }
        return f10;
    }

    public final void f() {
        float f7;
        j3 j3Var;
        m3 m3Var = this.f19839a;
        if (m3Var != null && (m3Var.getParent() instanceof View)) {
            HashSet hashSet = ei.k3.W0;
            if (!hashSet.isEmpty()) {
                Iterator it = new HashSet(hashSet).iterator();
                while (it.hasNext()) {
                    ((ei.k3) it.next()).k(true);
                }
                AndroidUtilities.runOnUIThread(new p(this, 11), 100L);
                return;
            }
            ValueAnimator valueAnimator = this.d;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.d = null;
            }
            View view = (View) this.f19839a.getParent();
            this.S = view;
            int[] iArr = this.f19840a0;
            if (view != null) {
                view.getLocationOnScreen(iArr);
            } else {
                iArr[1] = 0;
                iArr[0] = 0;
            }
            int[] iArr2 = this.f19842b0;
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
            if (h6.I.q()) {
                f7 = 0.08f;
            } else {
                f7 = 0.25f;
            }
            AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, f7);
            this.O.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            this.P = new Matrix();
            ArrayList arrayList = this.R;
            arrayList.clear();
            ArrayList<l3> tabs = this.f19839a.getTabs();
            ArrayList<j3> tabDrawables = this.f19839a.getTabDrawables();
            for (int size = tabs.size() - 1; size >= 0; size--) {
                l3 l3Var = tabs.get(size);
                int i12 = 0;
                while (true) {
                    if (i12 < tabDrawables.size()) {
                        j3Var = tabDrawables.get(i12);
                        if (j3Var.f19474a == l3Var) {
                            break;
                        }
                        i12++;
                    } else {
                        j3Var = null;
                        break;
                    }
                }
                if (j3Var != null) {
                    arrayList.add(new u3(this, l3Var, j3Var));
                }
            }
            this.f19847f.d(arrayList.size(), true);
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
        ofFloat.addUpdateListener(new n3(this, 2));
        this.T.setDuration(250L);
        this.T.setInterpolator(rr.h);
        this.T.start();
    }

    public void setScrollOffset(float f7) {
        this.L = f7;
    }

    public void setTabsView(m3 m3Var) {
        this.f19839a = m3Var;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f19851i0 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public void setSlowerDismiss(boolean z10) {
    }
}
