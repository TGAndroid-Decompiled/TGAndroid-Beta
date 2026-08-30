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
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.nr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.g20;
import org.telegram.ui.yh;
public final class w3 extends View {
    public float B;
    public long C;
    public boolean D;
    public boolean E;
    public VelocityTracker F;
    public float G;
    public boolean H;
    public float I;
    public Bitmap J;
    public BitmapShader K;
    public Paint L;
    public Matrix M;
    public final RectF N;
    public final ArrayList O;
    public View P;
    public ValueAnimator Q;
    public boolean R;
    public float S;
    public ValueAnimator T;
    public final int[] U;
    public final int[] V;
    public final RectF W;
    public n3 f20679a;
    public final RectF f20680a0;
    public t3 f20681b;
    public final RectF f20682b0;
    public k3 f20683c;
    public final Path f20684c0;
    public ValueAnimator d;
    public k01 f20685d0;
    public float e;
    public boolean f20686e0;
    public final org.telegram.ui.Components.z5 f20687f;
    public org.telegram.ui.Cells.z f20688f0;
    public g20 f20689g0;
    public final OverScroller h;
    public final int f20690n;
    public final int f20691r;
    public int f20692s;
    public final s3 v;
    public v3 f20693w;
    public boolean f20694x;
    public float f20695y;

    public w3(LaunchActivity launchActivity) {
        super(launchActivity);
        this.f20687f = new org.telegram.ui.Components.z5(this, 0L, 350L, nr.h);
        this.N = new RectF();
        this.O = new ArrayList();
        this.U = new int[2];
        this.V = new int[2];
        this.W = new RectF();
        this.f20680a0 = new RectF();
        this.f20682b0 = new RectF();
        this.f20684c0 = new Path();
        setWillNotDraw(false);
        this.h = new OverScroller(launchActivity);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(launchActivity);
        this.f20690n = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f20691r = viewConfiguration.getScaledMinimumFlingVelocity();
        s3 s3Var = new s3(this, this);
        this.v = s3Var;
        r0.j0.k(this, s3Var);
        setImportantForAccessibility(2);
        r0.b0.j(this, new n(this, 6));
    }

    public static void g(ViewGroup viewGroup, float f10, final kh.a1 a1Var) {
        if (viewGroup.getWidth() > 0 && viewGroup.getHeight() > 0) {
            final SurfaceTexture b10 = org.telegram.messenger.v3.b();
            b10.setDefaultBufferSize(viewGroup.getWidth(), viewGroup.getHeight());
            final Surface surface = new Surface(b10);
            final Bitmap createBitmap = Bitmap.createBitmap(viewGroup.getWidth(), viewGroup.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas lockHardwareCanvas = surface.lockHardwareCanvas();
            lockHardwareCanvas.translate(0.0f, f10);
            viewGroup.draw(lockHardwareCanvas);
            surface.unlockCanvasAndPost(lockHardwareCanvas);
            PixelCopy.request(surface, createBitmap, new PixelCopy.OnPixelCopyFinishedListener() {
                @Override
                public final void onPixelCopyFinished(int i10) {
                    kh.a1 a1Var2 = kh.a1.this;
                    Bitmap bitmap = createBitmap;
                    Surface surface2 = surface;
                    SurfaceTexture surfaceTexture = b10;
                    if (i10 == 0) {
                        a1Var2.run(bitmap);
                    } else {
                        bitmap.recycle();
                        a1Var2.run(null);
                    }
                    surface2.release();
                    surfaceTexture.release();
                }
            }, new Handler());
            return;
        }
        a1Var.run(null);
    }

    private float getScrollStep() {
        return AndroidUtilities.dp(200.0f);
    }

    private void setModalAccessibility(boolean z4) {
        int i10;
        int i11;
        if (z4) {
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
                    if (z4) {
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
        if (z4) {
            sendAccessibilityEvent(32);
        }
    }

    public final void a(boolean z4) {
        float f10;
        if (this.R == z4) {
            return;
        }
        ValueAnimator valueAnimator = this.T;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.R = z4;
        n3 n3Var = this.f20679a;
        if (n3Var != null) {
            n3Var.f20482b = false;
            n3Var.invalidate();
        }
        setModalAccessibility(z4);
        invalidate();
        float f11 = this.S;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.T = ofFloat;
        ofFloat.addUpdateListener(new o3(this, 0));
        this.T.addListener(new h(this, 4));
        this.T.setInterpolator(nr.h);
        this.T.setDuration(320L);
        this.T.start();
    }

    public final void b(t3 t3Var) {
        ValueAnimator valueAnimator;
        if (this.f20679a == null) {
            return;
        }
        if (this.f20681b != null && (valueAnimator = this.d) != null) {
            valueAnimator.end();
            this.d = null;
        }
        this.f20681b = t3Var;
        t3Var.setLastVisible(false);
        ValueAnimator valueAnimator2 = this.d;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        m3 a2 = t3Var.a();
        n3 n3Var = this.f20679a;
        ArrayList<m3> tabs = n3Var.getTabs();
        ArrayList<k3> tabDrawables = n3Var.getTabDrawables();
        k3 k3Var = new k3(n3Var, a2);
        k3Var.d.d(-1.0f, true);
        k3Var.e.d(0.0f, true);
        tabDrawables.add(k3Var);
        tabs.add(0, a2);
        for (int i10 = 0; i10 < tabDrawables.size(); i10++) {
            k3 k3Var2 = tabDrawables.get(i10);
            int indexOf = tabs.indexOf(k3Var2.f20360a);
            k3Var2.f20362c = indexOf;
            if (indexOf >= 0) {
                k3Var2.f20361b = indexOf;
            }
        }
        n3Var.n();
        n3Var.o(true);
        n3Var.invalidate();
        l3 l3Var = n3Var.e;
        if (l3Var != null) {
            l3Var.i();
        }
        this.f20683c = k3Var;
        post(new p(t3Var, 10));
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

    public final float c(boolean z4) {
        return (e(z4) - Math.min(3.0f, e(z4))) - (Utilities.clamp(4.0f - e(z4), 0.5f, 0.0f) * (Math.min(3.0f, e(z4)) / 3.0f));
    }

    @Override
    public final void computeScroll() {
        OverScroller overScroller = this.h;
        if (overScroller.computeScrollOffset()) {
            setScrollOffset(overScroller.getCurrY() / getScrollStep());
            postInvalidateOnAnimation();
        }
    }

    public final float d(boolean z4) {
        return Utilities.clamp(e(z4), 1.0f, 0.0f) * ((-getScrollWindow()) / 3.0f);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF;
        float f10;
        ArrayList arrayList;
        float scrollMin;
        float f11;
        float f12;
        int i10;
        int i11;
        boolean z4;
        float f13;
        float f14;
        float f15;
        ArrayList arrayList2;
        RectF rectF2;
        int i12;
        float f16;
        float f17;
        float f18;
        int i13;
        w3 w3Var = this;
        super.dispatchDraw(canvas);
        t3 t3Var = w3Var.f20681b;
        int[] iArr = w3Var.U;
        int[] iArr2 = w3Var.V;
        RectF rectF3 = w3Var.W;
        if (t3Var != null) {
            w3Var.getLocationOnScreen(iArr2);
            w3Var.f20679a.getLocationOnScreen(iArr);
            w3Var.f20679a.d(rectF3, 0.0f);
            rectF3.offset(iArr[0] - iArr2[0], iArr[1] - iArr2[1]);
            canvas.save();
            canvas.clipRect(0, 0, w3Var.getMeasuredWidth(), w3Var.getMeasuredHeight() - w3Var.f20692s);
            u3 mo37getWindowView = w3Var.f20681b.mo37getWindowView();
            float f19 = w3Var.e;
            RectF rectF4 = w3Var.f20682b0;
            float z10 = mo37getWindowView.z(canvas, rectF3, f19, rectF4, f19);
            if (w3Var.f20683c != null) {
                Path path = w3Var.f20684c0;
                path.rewind();
                path.addRoundRect(rectF4, z10, z10, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                float c3 = yh.c(1.0f, w3Var.e, AndroidUtilities.dp(50.0f), rectF4.top);
                rectF3.set(rectF4.left, c3, rectF4.right, AndroidUtilities.dp(50.0f) + c3);
                w3Var.f20679a.setupTab(w3Var.f20683c);
                w3Var.f20683c.a(canvas, rectF3, z10, w3Var.e, 1.0f);
                rectF = rectF3;
                canvas.restore();
            } else {
                rectF = rectF3;
            }
            canvas.restore();
        } else {
            rectF = rectF3;
        }
        if (w3Var.S <= 0.0f) {
            return;
        }
        canvas.save();
        View view = w3Var.P;
        RectF rectF5 = w3Var.N;
        if (view != null) {
            view.getLocationOnScreen(iArr);
            w3Var.getLocationOnScreen(iArr2);
            rectF5.set(iArr[0] - iArr2[0], iArr[1] - iArr2[1], w3Var.P.getWidth() + i13, w3Var.P.getHeight() + (iArr[1] - iArr2[1]));
        } else {
            iArr[1] = 0;
            iArr[0] = 0;
            rectF5.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        canvas.clipRect(rectF5);
        canvas.translate(rectF5.left, rectF5.top);
        float width = rectF5.width();
        float height = rectF5.height();
        if (w3Var.J != null) {
            w3Var.M.reset();
            float width2 = rectF5.width() / w3Var.J.getWidth();
            w3Var.M.postScale(width2, width2);
            w3Var.K.setLocalMatrix(w3Var.M);
            w3Var.L.setAlpha((int) (w3Var.S * 255.0f));
            canvas.drawRect(0.0f, 0.0f, width, height, w3Var.L);
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, width, height, 255, 31);
        float f20 = width;
        float f21 = height;
        float dp = AndroidUtilities.dp(55.0f) + AndroidUtilities.dp(40.0f) + AndroidUtilities.statusBarHeight;
        float dp2 = AndroidUtilities.dp(68.0f);
        int min = (int) Math.min(AndroidUtilities.dp(340.0f), 0.95f * f20);
        if (AndroidUtilities.isTablet()) {
            f10 = rectF5.height() * 0.5f;
        } else {
            f10 = 0.75f * f21;
        }
        int i14 = (int) f10;
        float f22 = f20 / 2.0f;
        int i15 = 0;
        float f23 = 0.0f;
        while (true) {
            arrayList = w3Var.O;
            if (i15 >= arrayList.size()) {
                break;
            }
            if (((v3) arrayList.get(i15)).d.f20362c >= 0) {
                f18 = 1.0f;
            } else {
                f18 = 0.0f;
            }
            f23 += f18;
            i15++;
        }
        float d = w3Var.f20687f.d(f23, false);
        if (w3Var.getScrollWindow() <= 0.0f) {
            scrollMin = 0.0f;
        } else {
            scrollMin = ((w3Var.getScrollMin() - w3Var.getScrollOffset()) / (w3Var.getScrollWindow() * 0.15f)) * 0.2f;
        }
        float lerp = AndroidUtilities.lerp(0.0f, 1.0f - Utilities.clamp(scrollMin, 1.0f, 0.0f), w3Var.S);
        int i16 = 0;
        while (i16 < arrayList.size() + 1) {
            if (i16 == arrayList.size()) {
                f17 = dp;
                f12 = dp2;
                i11 = min;
                f13 = lerp;
                i10 = i16;
                f14 = f20;
                f15 = d;
                arrayList2 = arrayList;
                rectF2 = rectF;
                i12 = i14;
                f16 = f21;
            } else {
                v3 v3Var = (v3) arrayList.get(i16);
                if (i16 < arrayList.size()) {
                    k3 k3Var = v3Var.d;
                }
                k3 k3Var2 = v3Var.d;
                float[] fArr = v3Var.f20620g;
                float f24 = dp;
                Matrix matrix = v3Var.f20619f;
                float[] fArr2 = v3Var.h;
                if (k3Var2 == null) {
                    f11 = 1.0f;
                } else {
                    f11 = lerp;
                }
                float c10 = (d - 1.0f) - k3Var2.c();
                f12 = dp2;
                i10 = i16;
                float max = (c10 - Math.max(w3Var.getScrollMin(), w3Var.getScrollOffset())) / w3Var.getScrollWindow();
                Math.max(max, 0.0f);
                Math.max(Math.min(max, 1.0f), -4.0f);
                float min2 = (Math.min(5.0f, c10) * AndroidUtilities.dp(6.0f)) + f24;
                float f25 = i14;
                float f26 = ((((f21 - f12) - (0.26f * f25)) - min2) * max) + min2;
                float f27 = min / 2.0f;
                i11 = min;
                RectF rectF6 = w3Var.f20680a0;
                rectF6.set(f22 - f27, f26, f22 + f27, f25 + f26);
                if ((rectF6.top > f21 || rectF6.bottom < 0.0f || lerp < 0.1f) && c10 < d - 3.0f) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolean z11 = z4;
                w3Var.f20679a.d(rectF, Utilities.clamp(k3Var2.c(), 1.0f, 0.0f));
                rectF.offset(w3Var.f20679a.getX(), w3Var.f20679a.getY());
                AndroidUtilities.lerpCentered(rectF, rectF6, lerp, rectF6);
                n3 n3Var = w3Var.f20679a;
                if (n3Var != null) {
                    n3Var.setupTab(k3Var2);
                }
                if (rectF6.top > f21 || rectF6.bottom < 0.0f) {
                    f13 = lerp;
                    f14 = f20;
                    f15 = d;
                    arrayList2 = arrayList;
                    rectF2 = rectF;
                    i12 = i14;
                    f16 = f21;
                    f17 = f24;
                } else {
                    canvas.save();
                    v3Var.f20616a.set(rectF6);
                    matrix.reset();
                    fArr[0] = rectF6.left;
                    float f28 = rectF6.top;
                    fArr[1] = f28;
                    float f29 = rectF6.right;
                    fArr[2] = f29;
                    fArr[3] = f28;
                    fArr[4] = f29;
                    fArr[5] = (rectF6.height() * 1.0f) + f28;
                    fArr[6] = rectF6.left;
                    fArr[7] = (rectF6.height() * 1.0f) + rectF6.top;
                    fArr2[0] = rectF6.left;
                    fArr2[1] = rectF6.top - AndroidUtilities.dp(0.0f);
                    fArr2[2] = rectF6.right;
                    fArr2[3] = rectF6.top - AndroidUtilities.dp(0.0f);
                    float f30 = f11 * 1.0f;
                    fArr2[4] = (AndroidUtilities.lerp(1.0f, 0.83f, f30) * (rectF6.width() / 2.0f)) + rectF6.centerX();
                    fArr2[5] = (AndroidUtilities.lerp(1.0f, 0.6f, f30) * ((rectF6.height() * 1.0f) + AndroidUtilities.dp(0.0f))) + (rectF6.top - AndroidUtilities.dp(0.0f));
                    fArr2[6] = rectF6.centerX() - (AndroidUtilities.lerp(1.0f, 0.83f, f30) * (rectF6.width() / 2.0f));
                    fArr2[7] = (AndroidUtilities.lerp(1.0f, 0.6f, f30) * ((rectF6.height() * 1.0f) + AndroidUtilities.dp(0.0f))) + (rectF6.top - AndroidUtilities.dp(0.0f));
                    matrix.setPolyToPoly(v3Var.f20620g, 0, v3Var.h, 0, 4);
                    canvas.concat(matrix);
                    float lerp2 = AndroidUtilities.lerp(k3Var2.b(), 1.0f, w3Var.S);
                    float lerp3 = AndroidUtilities.lerp(Utilities.clamp01((c10 - d) + 2.0f), 1.0f, Utilities.clamp01((f11 - 0.1f) / 0.8f));
                    RadialGradient radialGradient = v3Var.f20628p;
                    Paint paint = v3Var.f20627o;
                    Paint paint2 = v3Var.f20630r;
                    f13 = lerp;
                    Matrix matrix2 = v3Var.f20629q;
                    m3 m3Var = v3Var.f20618c;
                    f15 = d;
                    Path path2 = v3Var.f20626n;
                    arrayList2 = arrayList;
                    Paint paint3 = v3Var.e;
                    rectF2 = rectF;
                    RectF rectF7 = v3Var.f20625m;
                    i12 = i14;
                    Paint paint4 = v3Var.f20624l;
                    f16 = f21;
                    f14 = f20;
                    float clamp = Utilities.clamp(1.0f - ((Math.abs(v3Var.f20621i) - 0.3f) / 0.7f), 1.0f, 0.0f) * lerp2;
                    if (clamp > 0.0f) {
                        float f31 = f30 * 1.0f;
                        float lerp4 = AndroidUtilities.lerp(1.0f, 1.3f, f31);
                        float currentActionBarHeight = ((k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(50.0f)) * 0.0f;
                        canvas.save();
                        canvas.rotate(v3Var.f20621i * 20.0f, (v3Var.f20621i * AndroidUtilities.dp(50.0f)) + rectF6.centerX(), rectF6.bottom + AndroidUtilities.dp(350.0f));
                        float a2 = v3Var.f20623k.a(0.01f);
                        canvas.scale(a2, a2, rectF6.centerX(), rectF6.centerY());
                        float lerp5 = AndroidUtilities.lerp(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), f30);
                        if (z11) {
                            paint4.setColor(0);
                            paint4.setShadowLayer(AndroidUtilities.dp(30.0f), 0.0f, AndroidUtilities.dp(10.0f), j6.l1(clamp * f30 * 1.0f, 536870912));
                            canvas.drawRoundRect(rectF6, lerp5, lerp5, paint4);
                            paint3.setAlpha((int) (clamp * 255.0f));
                            canvas.drawRoundRect(rectF6, lerp5, lerp5, paint3);
                            canvas.restore();
                        } else {
                            path2.rewind();
                            path2.addRoundRect(rectF6, lerp5, lerp5, Path.Direction.CW);
                            canvas.save();
                            paint4.setColor(0);
                            paint4.setShadowLayer(AndroidUtilities.dp(30.0f), 0.0f, AndroidUtilities.dp(10.0f), j6.l1(clamp * f30 * 1.0f, 536870912));
                            canvas.drawPath(path2, paint4);
                            canvas.clipPath(path2);
                            float f32 = clamp * 255.0f * f30;
                            int i17 = (int) f32;
                            paint3.setAlpha(i17);
                            canvas.drawRoundRect(rectF6, lerp5, lerp5, paint3);
                            canvas.save();
                            canvas.translate(rectF6.left, e2.c.A(AndroidUtilities.dp(50.0f), lerp4, rectF6.top, currentActionBarHeight));
                            canvas.scale(1.0f, AndroidUtilities.lerp(1.0f, 1.25f, f31));
                            if (m3Var != null && m3Var.f20455k != null) {
                                float width3 = rectF6.width() / m3Var.f20455k.getWidth();
                                canvas.scale(width3, width3);
                                paint.setAlpha(i17);
                                canvas.drawBitmap(m3Var.f20455k, 0.0f, 0.0f, paint);
                            }
                            canvas.restore();
                            canvas.save();
                            paint2.setAlpha((int) (f32 * 1.0f));
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
                            v3Var.d.v = f30;
                            canvas.scale(1.0f, lerp4, rectF7.centerX(), rectF7.top);
                            f17 = f24;
                            v3Var.d.a(canvas, rectF7, lerp5, clamp * clamp, lerp3);
                            canvas.restore();
                            canvas.restore();
                            canvas.restore();
                        }
                    }
                    f17 = f24;
                    canvas.restore();
                }
            }
            i16 = i10 + 1;
            dp = f17;
            lerp = f13;
            d = f15;
            arrayList = arrayList2;
            rectF = rectF2;
            i14 = i12;
            dp2 = f12;
            f21 = f16;
            min = i11;
            f20 = f14;
            w3Var = this;
        }
        float f33 = dp;
        float f34 = f20;
        canvas.save();
        if (this.f20689g0 == null) {
            this.f20689g0 = new g20();
        }
        RectF rectF8 = AndroidUtilities.rectTmp;
        rectF8.set(0.0f, 0.0f, f34, f33);
        this.f20689g0.b(canvas, rectF8, 1, this.S);
        canvas.restore();
        canvas.restore();
        if (this.f20685d0 == null) {
            this.f20685d0 = new k01(LocaleController.getString(R.string.BotCloseAllTabs), 14.0f, AndroidUtilities.bold());
        }
        if (this.f20688f0 == null || this.f20686e0 != j6.I.q()) {
            boolean q10 = j6.I.q();
            this.f20686e0 = q10;
            if (q10) {
                this.f20688f0 = j6.i0(64, 64, 64, 64, 553648127, 872415231, 872415231);
            } else {
                this.f20688f0 = j6.i0(64, 64, 64, 64, 771751936, 1140850688, 1140850688);
            }
            this.f20688f0.setCallback(this);
        }
        float dp3 = this.f20685d0.f26084c + AndroidUtilities.dp(24.0f);
        float f35 = (f34 - dp3) / 2.0f;
        this.f20688f0.setBounds((int) f35, (int) ((f33 - (AndroidUtilities.dp(95.0f) / 2.0f)) - AndroidUtilities.dp(14.0f)), (int) ((f34 + dp3) / 2.0f), (int) ((f33 - (AndroidUtilities.dp(95.0f) / 2.0f)) + AndroidUtilities.dp(14.0f)));
        this.f20688f0.setAlpha((int) (this.S * 255.0f));
        this.f20688f0.draw(canvas);
        this.f20685d0.c(f35 + AndroidUtilities.dp(12.0f), f33 - (AndroidUtilities.dp(95.0f) / 2.0f), this.S, -1, canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        s3 s3Var;
        if (this.S > 0.0f && (s3Var = this.v) != null && s3Var.f(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.w3.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public final float e(boolean z4) {
        float f10;
        int i10 = 0;
        float f11 = 0.0f;
        while (true) {
            ArrayList arrayList = this.O;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (((v3) arrayList.get(i10)).d.f20362c >= 0) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            f11 += f10;
            i10++;
        }
        if (z4) {
            return this.f20687f.d(f11, false);
        }
        return f11;
    }

    public final void f() {
        float f10;
        k3 k3Var;
        n3 n3Var = this.f20679a;
        if (n3Var != null && (n3Var.getParent() instanceof View)) {
            HashSet hashSet = rh.q2.T0;
            if (!hashSet.isEmpty()) {
                Iterator it = new HashSet(hashSet).iterator();
                while (it.hasNext()) {
                    ((rh.q2) it.next()).k(true);
                }
                AndroidUtilities.runOnUIThread(new p(this, 11), 100L);
                return;
            }
            ValueAnimator valueAnimator = this.d;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.d = null;
            }
            View view = (View) this.f20679a.getParent();
            this.P = view;
            int[] iArr = this.U;
            if (view != null) {
                view.getLocationOnScreen(iArr);
            } else {
                iArr[1] = 0;
                iArr[0] = 0;
            }
            int[] iArr2 = this.V;
            getLocationOnScreen(iArr2);
            int i10 = iArr[0] - iArr2[0];
            int i11 = iArr[1] - iArr2[1];
            this.N.set(i10, iArr[1] - iArr2[1], this.P.getWidth() + i10, this.P.getHeight() + i11);
            View view2 = this.P;
            AndroidUtilities.makingGlobalBlurBitmap = true;
            this.J = AndroidUtilities.makeBlurBitmap(view2, 14.0f, 14);
            AndroidUtilities.makingGlobalBlurBitmap = false;
            Paint paint = new Paint(1);
            this.L = paint;
            Bitmap bitmap = this.J;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            this.K = bitmapShader;
            paint.setShader(bitmapShader);
            ColorMatrix colorMatrix = new ColorMatrix();
            if (j6.I.q()) {
                f10 = 0.08f;
            } else {
                f10 = 0.25f;
            }
            AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, f10);
            this.L.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            this.M = new Matrix();
            ArrayList arrayList = this.O;
            arrayList.clear();
            ArrayList<m3> tabs = this.f20679a.getTabs();
            ArrayList<k3> tabDrawables = this.f20679a.getTabDrawables();
            for (int size = tabs.size() - 1; size >= 0; size--) {
                m3 m3Var = tabs.get(size);
                int i12 = 0;
                while (true) {
                    if (i12 < tabDrawables.size()) {
                        k3Var = tabDrawables.get(i12);
                        if (k3Var.f20360a == m3Var) {
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
            this.f20687f.d(arrayList.size(), true);
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
        return this.I;
    }

    public float getScrollRange() {
        return e(true);
    }

    public float getScrollWindow() {
        return Math.min(3.0f, getScrollRange());
    }

    public final void h(float f10) {
        ValueAnimator valueAnimator = this.Q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.Q = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.I, f10);
        this.Q = ofFloat;
        ofFloat.addUpdateListener(new o3(this, 2));
        this.Q.setDuration(250L);
        this.Q.setInterpolator(nr.h);
        this.Q.start();
    }

    public void setScrollOffset(float f10) {
        this.I = f10;
    }

    public void setTabsView(n3 n3Var) {
        this.f20679a = n3Var;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f20688f0 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public void setSlowerDismiss(boolean z4) {
    }
}
