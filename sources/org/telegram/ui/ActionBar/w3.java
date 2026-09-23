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
import org.telegram.ui.Components.f01;
import org.telegram.ui.Components.rr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.i20;
public final class w3 extends View {
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
    public n3 f19626a;
    public final int[] f19627a0;
    public t3 f19628b;
    public final int[] f19629b0;
    public k3 f19630c;
    public final RectF f19631c0;
    public ValueAnimator d;
    public final RectF f19632d0;
    public float e;
    public final RectF f19633e0;
    public final org.telegram.ui.Components.e6 f19634f;
    public final Path f19635f0;
    public f01 f19636g0;
    public final OverScroller h;
    public boolean f19637h0;
    public org.telegram.ui.Cells.z f19638i0;
    public i20 f19639j0;
    public final int f19640n;
    public final int f19641r;
    public int f19642s;
    public final s3 v;
    public v3 f19643w;
    public boolean f19644x;
    public float f19645y;

    public w3(LaunchActivity launchActivity) {
        super(launchActivity);
        this.f19634f = new org.telegram.ui.Components.e6(this, 0L, 350L, rr.h);
        this.Q = new RectF();
        this.R = new ArrayList();
        this.f19627a0 = new int[2];
        this.f19629b0 = new int[2];
        this.f19631c0 = new RectF();
        this.f19632d0 = new RectF();
        this.f19633e0 = new RectF();
        this.f19635f0 = new Path();
        setWillNotDraw(false);
        this.h = new OverScroller(launchActivity);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(launchActivity);
        this.f19640n = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f19641r = viewConfiguration.getScaledMinimumFlingVelocity();
        s3 s3Var = new s3(this, this);
        this.v = s3Var;
        r0.i0.k(this, s3Var);
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
        s3 s3Var = this.v;
        if (s3Var != null) {
            s3Var.i();
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
        n3 n3Var = this.f19626a;
        if (n3Var != null) {
            n3Var.f19413b = false;
            n3Var.invalidate();
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
        ofFloat.addUpdateListener(new o3(this, 0));
        this.W.addListener(new h(this, 4));
        this.W.setInterpolator(rr.h);
        this.W.setDuration(320L);
        this.W.start();
    }

    public final void b(t3 t3Var) {
        ValueAnimator valueAnimator;
        if (this.f19626a == null) {
            return;
        }
        if (this.f19628b != null && (valueAnimator = this.d) != null) {
            valueAnimator.end();
            this.d = null;
        }
        this.f19628b = t3Var;
        t3Var.setLastVisible(false);
        ValueAnimator valueAnimator2 = this.d;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        m3 a2 = t3Var.a();
        n3 n3Var = this.f19626a;
        ArrayList<m3> tabs = n3Var.getTabs();
        ArrayList<k3> tabDrawables = n3Var.getTabDrawables();
        k3 k3Var = new k3(n3Var, a2);
        k3Var.d.d(-1.0f, true);
        k3Var.e.d(0.0f, true);
        tabDrawables.add(k3Var);
        tabs.add(0, a2);
        for (int i10 = 0; i10 < tabDrawables.size(); i10++) {
            k3 k3Var2 = tabDrawables.get(i10);
            int indexOf = tabs.indexOf(k3Var2.f19323a);
            k3Var2.f19325c = indexOf;
            if (indexOf >= 0) {
                k3Var2.f19324b = indexOf;
            }
        }
        n3Var.n();
        n3Var.o(true);
        n3Var.invalidate();
        l3 l3Var = n3Var.e;
        if (l3Var != null) {
            l3Var.i();
        }
        this.f19630c = k3Var;
        post(new q(t3Var, 10));
        invalidate();
        this.e = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.d = ofFloat;
        ofFloat.addUpdateListener(new o3(this, 1));
        this.d.addListener(new r3(this, a2, t3Var));
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
        w3 w3Var = this;
        super.dispatchDraw(canvas);
        t3 t3Var = w3Var.f19628b;
        int[] iArr = w3Var.f19627a0;
        int[] iArr2 = w3Var.f19629b0;
        RectF rectF3 = w3Var.f19631c0;
        if (t3Var != null) {
            w3Var.getLocationOnScreen(iArr2);
            w3Var.f19626a.getLocationOnScreen(iArr);
            w3Var.f19626a.d(rectF3, 0.0f);
            rectF3.offset(iArr[0] - iArr2[0], iArr[1] - iArr2[1]);
            canvas.save();
            canvas.clipRect(0, 0, w3Var.getMeasuredWidth(), w3Var.getMeasuredHeight() - w3Var.f19642s);
            u3 mo37getWindowView = w3Var.f19628b.mo37getWindowView();
            float f18 = w3Var.e;
            RectF rectF4 = w3Var.f19633e0;
            float x10 = mo37getWindowView.x(canvas, rectF3, f18, rectF4, f18);
            if (w3Var.f19630c != null) {
                Path path = w3Var.f19635f0;
                path.rewind();
                path.addRoundRect(rectF4, x10, x10, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                float b10 = com.google.android.gms.internal.vision.e2.b(1.0f, w3Var.e, AndroidUtilities.dp(50.0f), rectF4.top);
                rectF3.set(rectF4.left, b10, rectF4.right, AndroidUtilities.dp(50.0f) + b10);
                w3Var.f19626a.setupTab(w3Var.f19630c);
                w3Var.f19630c.a(canvas, rectF3, x10, w3Var.e, 1.0f);
                rectF = rectF3;
                canvas.restore();
            } else {
                rectF = rectF3;
            }
            canvas.restore();
        } else {
            rectF = rectF3;
        }
        if (w3Var.V <= 0.0f) {
            return;
        }
        canvas.save();
        View view = w3Var.S;
        RectF rectF5 = w3Var.Q;
        if (view != null) {
            view.getLocationOnScreen(iArr);
            w3Var.getLocationOnScreen(iArr2);
            rectF5.set(iArr[0] - iArr2[0], iArr[1] - iArr2[1], w3Var.S.getWidth() + i13, w3Var.S.getHeight() + (iArr[1] - iArr2[1]));
        } else {
            iArr[1] = 0;
            iArr[0] = 0;
            rectF5.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        canvas.clipRect(rectF5);
        canvas.translate(rectF5.left, rectF5.top);
        float width = rectF5.width();
        float height = rectF5.height();
        if (w3Var.M != null) {
            w3Var.P.reset();
            float width2 = rectF5.width() / w3Var.M.getWidth();
            w3Var.P.postScale(width2, width2);
            w3Var.N.setLocalMatrix(w3Var.P);
            w3Var.O.setAlpha((int) (w3Var.V * 255.0f));
            canvas.drawRect(0.0f, 0.0f, width, height, w3Var.O);
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
            arrayList = w3Var.R;
            if (i15 >= arrayList.size()) {
                break;
            }
            if (((v3) arrayList.get(i15)).d.f19325c >= 0) {
                f17 = 1.0f;
            } else {
                f17 = 0.0f;
            }
            f22 += f17;
            i15++;
        }
        float d = w3Var.f19634f.d(f22, false);
        if (w3Var.getScrollWindow() <= 0.0f) {
            scrollMin = 0.0f;
        } else {
            scrollMin = ((w3Var.getScrollMin() - w3Var.getScrollOffset()) / (w3Var.getScrollWindow() * 0.15f)) * 0.2f;
        }
        float lerp = AndroidUtilities.lerp(0.0f, 1.0f - Utilities.clamp(scrollMin, 1.0f, 0.0f), w3Var.V);
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
                v3 v3Var = (v3) arrayList.get(i16);
                if (i16 < arrayList.size()) {
                    k3 k3Var = v3Var.d;
                }
                k3 k3Var2 = v3Var.d;
                float[] fArr = v3Var.f19597g;
                float f23 = dp;
                Matrix matrix = v3Var.f19596f;
                float[] fArr2 = v3Var.h;
                if (k3Var2 == null) {
                    f10 = 1.0f;
                } else {
                    f10 = lerp;
                }
                float c10 = (d - 1.0f) - k3Var2.c();
                f11 = dp2;
                i10 = i16;
                float max = (c10 - Math.max(w3Var.getScrollMin(), w3Var.getScrollOffset())) / w3Var.getScrollWindow();
                Math.max(max, 0.0f);
                Math.max(Math.min(max, 1.0f), -4.0f);
                float min2 = (Math.min(5.0f, c10) * AndroidUtilities.dp(6.0f)) + f23;
                float f24 = i14;
                float f25 = ((((f20 - f11) - (0.26f * f24)) - min2) * max) + min2;
                float f26 = min / 2.0f;
                i11 = min;
                RectF rectF6 = w3Var.f19632d0;
                rectF6.set(f21 - f26, f25, f21 + f26, f24 + f25);
                if ((rectF6.top > f20 || rectF6.bottom < 0.0f || lerp < 0.1f) && c10 < d - 3.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z11 = z10;
                w3Var.f19626a.d(rectF, Utilities.clamp(k3Var2.c(), 1.0f, 0.0f));
                rectF.offset(w3Var.f19626a.getX(), w3Var.f19626a.getY());
                AndroidUtilities.lerpCentered(rectF, rectF6, lerp, rectF6);
                n3 n3Var = w3Var.f19626a;
                if (n3Var != null) {
                    n3Var.setupTab(k3Var2);
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
                    v3Var.f19593a.set(rectF6);
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
                    matrix.setPolyToPoly(v3Var.f19597g, 0, v3Var.h, 0, 4);
                    canvas.concat(matrix);
                    float lerp2 = AndroidUtilities.lerp(k3Var2.b(), 1.0f, w3Var.V);
                    float lerp3 = AndroidUtilities.lerp(Utilities.clamp01((c10 - d) + 2.0f), 1.0f, Utilities.clamp01((f10 - 0.1f) / 0.8f));
                    RadialGradient radialGradient = v3Var.f19605p;
                    Paint paint = v3Var.f19604o;
                    Paint paint2 = v3Var.f19607r;
                    f12 = lerp;
                    Matrix matrix2 = v3Var.f19606q;
                    m3 m3Var = v3Var.f19595c;
                    f14 = d;
                    Path path2 = v3Var.f19603n;
                    arrayList2 = arrayList;
                    Paint paint3 = v3Var.e;
                    rectF2 = rectF;
                    RectF rectF7 = v3Var.f19602m;
                    i12 = i14;
                    Paint paint4 = v3Var.f19601l;
                    f15 = f20;
                    f13 = f19;
                    float clamp = Utilities.clamp(1.0f - ((Math.abs(v3Var.f19598i) - 0.3f) / 0.7f), 1.0f, 0.0f) * lerp2;
                    if (clamp > 0.0f) {
                        float f30 = f29 * 1.0f;
                        float lerp4 = AndroidUtilities.lerp(1.0f, 1.3f, f30);
                        float currentActionBarHeight = ((k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(50.0f)) * 0.0f;
                        canvas.save();
                        canvas.rotate(v3Var.f19598i * 20.0f, (v3Var.f19598i * AndroidUtilities.dp(50.0f)) + rectF6.centerX(), rectF6.bottom + AndroidUtilities.dp(350.0f));
                        float a2 = v3Var.f19600k.a(0.01f);
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
                            canvas.translate(rectF6.left, org.telegram.ui.Cells.q3.a(AndroidUtilities.dp(50.0f), lerp4, rectF6.top, currentActionBarHeight));
                            canvas.scale(1.0f, AndroidUtilities.lerp(1.0f, 1.25f, f30));
                            if (m3Var != null && m3Var.f19379m != null) {
                                float width3 = rectF6.width() / m3Var.f19379m.getWidth();
                                canvas.scale(width3, width3);
                                paint.setAlpha(i17);
                                canvas.drawBitmap(m3Var.f19379m, 0.0f, 0.0f, paint);
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
                            v3Var.d.v = f29;
                            canvas.scale(1.0f, lerp4, rectF7.centerX(), rectF7.top);
                            f16 = f23;
                            v3Var.d.a(canvas, rectF7, lerp5, clamp * clamp, lerp3);
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
            w3Var = this;
        }
        float f32 = dp;
        float f33 = f19;
        canvas.save();
        if (this.f19639j0 == null) {
            this.f19639j0 = new i20();
        }
        RectF rectF8 = AndroidUtilities.rectTmp;
        rectF8.set(0.0f, 0.0f, f33, f32);
        this.f19639j0.b(canvas, rectF8, 1, this.V);
        canvas.restore();
        canvas.restore();
        if (this.f19636g0 == null) {
            this.f19636g0 = new f01(LocaleController.getString(R.string.BotCloseAllTabs), 14.0f, AndroidUtilities.bold());
        }
        if (this.f19638i0 == null || this.f19637h0 != h6.I.q()) {
            boolean q6 = h6.I.q();
            this.f19637h0 = q6;
            if (q6) {
                this.f19638i0 = h6.i0(64, 64, 64, 64, 553648127, 872415231, 872415231);
            } else {
                this.f19638i0 = h6.i0(64, 64, 64, 64, 771751936, 1140850688, 1140850688);
            }
            this.f19638i0.setCallback(this);
        }
        float dp3 = this.f19636g0.f23785c + AndroidUtilities.dp(24.0f);
        float f34 = (f33 - dp3) / 2.0f;
        this.f19638i0.setBounds((int) f34, (int) ((f32 - (AndroidUtilities.dp(95.0f) / 2.0f)) - AndroidUtilities.dp(14.0f)), (int) ((f33 + dp3) / 2.0f), (int) ((f32 - (AndroidUtilities.dp(95.0f) / 2.0f)) + AndroidUtilities.dp(14.0f)));
        this.f19638i0.setAlpha((int) (this.V * 255.0f));
        this.f19638i0.draw(canvas);
        this.f19636g0.c(f34 + AndroidUtilities.dp(12.0f), f32 - (AndroidUtilities.dp(95.0f) / 2.0f), this.V, -1, canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        s3 s3Var;
        if (this.V > 0.0f && (s3Var = this.v) != null && s3Var.f(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.w3.dispatchTouchEvent(android.view.MotionEvent):boolean");
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
            if (((v3) arrayList.get(i10)).d.f19325c >= 0) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            f10 += f7;
            i10++;
        }
        if (z10) {
            return this.f19634f.d(f10, false);
        }
        return f10;
    }

    public final void f() {
        float f7;
        k3 k3Var;
        n3 n3Var = this.f19626a;
        if (n3Var != null && (n3Var.getParent() instanceof View)) {
            HashSet hashSet = ei.k3.W0;
            if (!hashSet.isEmpty()) {
                Iterator it = new HashSet(hashSet).iterator();
                while (it.hasNext()) {
                    ((ei.k3) it.next()).k(true);
                }
                AndroidUtilities.runOnUIThread(new q(this, 11), 100L);
                return;
            }
            ValueAnimator valueAnimator = this.d;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.d = null;
            }
            View view = (View) this.f19626a.getParent();
            this.S = view;
            int[] iArr = this.f19627a0;
            if (view != null) {
                view.getLocationOnScreen(iArr);
            } else {
                iArr[1] = 0;
                iArr[0] = 0;
            }
            int[] iArr2 = this.f19629b0;
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
            ArrayList<m3> tabs = this.f19626a.getTabs();
            ArrayList<k3> tabDrawables = this.f19626a.getTabDrawables();
            for (int size = tabs.size() - 1; size >= 0; size--) {
                m3 m3Var = tabs.get(size);
                int i12 = 0;
                while (true) {
                    if (i12 < tabDrawables.size()) {
                        k3Var = tabDrawables.get(i12);
                        if (k3Var.f19323a == m3Var) {
                            break;
                        }
                        i12++;
                    } else {
                        k3Var = null;
                        break;
                    }
                }
                if (k3Var != null) {
                    arrayList.add(new v3(this, m3Var, k3Var));
                }
            }
            this.f19634f.d(arrayList.size(), true);
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
        ofFloat.addUpdateListener(new o3(this, 2));
        this.T.setDuration(250L);
        this.T.setInterpolator(rr.h);
        this.T.start();
    }

    public void setScrollOffset(float f7) {
        this.L = f7;
    }

    public void setTabsView(n3 n3Var) {
        this.f19626a = n3Var;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f19638i0 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public void setSlowerDismiss(boolean z10) {
    }
}
