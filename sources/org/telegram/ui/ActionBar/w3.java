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
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.m11;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.j20;
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
    public n3 f21651a;
    public final int[] f21652a0;
    public t3 f21653b;
    public final int[] f21654b0;
    public k3 f21655c;
    public final RectF f21656c0;
    public ValueAnimator d;
    public final RectF f21657d0;
    public float f21658e;
    public final RectF f21659e0;
    public final org.telegram.ui.Components.g6 f21660f;
    public final Path f21661f0;
    public m11 f21662g0;
    public final OverScroller h;
    public boolean f21663h0;
    public org.telegram.ui.Cells.z f21664i0;
    public j20 f21665j0;
    public final int f21666n;
    public final int f21667r;
    public int f21668s;
    public final s3 v;
    public v3 f21669w;
    public boolean f21670x;
    public float f21671y;

    public w3(LaunchActivity launchActivity) {
        super(launchActivity);
        this.f21660f = new org.telegram.ui.Components.g6(this, 0L, 350L, is.h);
        this.Q = new RectF();
        this.R = new ArrayList();
        this.f21652a0 = new int[2];
        this.f21654b0 = new int[2];
        this.f21656c0 = new RectF();
        this.f21657d0 = new RectF();
        this.f21659e0 = new RectF();
        this.f21661f0 = new Path();
        setWillNotDraw(false);
        this.h = new OverScroller(launchActivity);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(launchActivity);
        this.f21666n = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f21667r = viewConfiguration.getScaledMinimumFlingVelocity();
        s3 s3Var = new s3(this, this);
        this.v = s3Var;
        r0.i0.j(this, s3Var);
        setImportantForAccessibility(2);
        r0.a0.i(this, new n(this, 7));
    }

    public static void g(ViewGroup viewGroup, float f7, final ai.h3 h3Var) {
        if (viewGroup.getWidth() > 0 && viewGroup.getHeight() > 0) {
            final SurfaceTexture b10 = org.telegram.messenger.v3.b();
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
                    ai.h3 h3Var2 = ai.h3.this;
                    Bitmap bitmap = createBitmap;
                    Surface surface2 = surface;
                    SurfaceTexture surfaceTexture = b10;
                    if (i10 == 0) {
                        h3Var2.run(bitmap);
                    } else {
                        bitmap.recycle();
                        h3Var2.run(null);
                    }
                    surface2.release();
                    surfaceTexture.release();
                }
            }, new Handler());
            return;
        }
        h3Var.run(null);
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
        n3 n3Var = this.f21651a;
        if (n3Var != null) {
            n3Var.f21425b = false;
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
        this.W.setInterpolator(is.h);
        this.W.setDuration(320L);
        this.W.start();
    }

    public final void b(t3 t3Var) {
        ValueAnimator valueAnimator;
        if (this.f21651a == null) {
            return;
        }
        if (this.f21653b != null && (valueAnimator = this.d) != null) {
            valueAnimator.end();
            this.d = null;
        }
        this.f21653b = t3Var;
        t3Var.setLastVisible(false);
        ValueAnimator valueAnimator2 = this.d;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        m3 a2 = t3Var.a();
        n3 n3Var = this.f21651a;
        ArrayList<m3> tabs = n3Var.getTabs();
        ArrayList<k3> tabDrawables = n3Var.getTabDrawables();
        k3 k3Var = new k3(n3Var, a2);
        k3Var.f21320e.d(-1.0f, true);
        k3Var.f21321f.d(0.0f, true);
        tabDrawables.add(k3Var);
        tabs.add(0, a2);
        for (int i10 = 0; i10 < tabDrawables.size(); i10++) {
            k3 k3Var2 = tabDrawables.get(i10);
            int indexOf = tabs.indexOf(k3Var2.f21317a);
            k3Var2.d = indexOf;
            if (indexOf >= 0) {
                k3Var2.f21319c = indexOf;
            }
        }
        n3Var.n();
        n3Var.o(true);
        n3Var.invalidate();
        l3 l3Var = n3Var.f21427e;
        if (l3Var != null) {
            l3Var.i();
        }
        this.f21655c = k3Var;
        post(new q(t3Var, 10));
        invalidate();
        this.f21658e = 0.0f;
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
        w3 w3Var = this;
        super.dispatchDraw(canvas);
        t3 t3Var = w3Var.f21653b;
        float f18 = 1.0f;
        int i16 = 1;
        int[] iArr = w3Var.f21652a0;
        int[] iArr2 = w3Var.f21654b0;
        int i17 = 0;
        RectF rectF3 = w3Var.f21656c0;
        if (t3Var != null) {
            w3Var.getLocationOnScreen(iArr2);
            w3Var.f21651a.getLocationOnScreen(iArr);
            w3Var.f21651a.d(rectF3, 0.0f);
            rectF3.offset(iArr[0] - iArr2[0], iArr[1] - iArr2[1]);
            canvas.save();
            canvas.clipRect(0, 0, w3Var.getMeasuredWidth(), w3Var.getMeasuredHeight() - w3Var.f21668s);
            u3 mo36getWindowView = w3Var.f21653b.mo36getWindowView();
            float f19 = w3Var.f21658e;
            RectF rectF4 = w3Var.f21659e0;
            float x10 = mo36getWindowView.x(canvas, rectF3, f19, rectF4, f19);
            if (w3Var.f21655c != null) {
                Path path = w3Var.f21661f0;
                path.rewind();
                path.addRoundRect(rectF4, x10, x10, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                float b10 = com.google.android.gms.internal.vision.e2.b(1.0f, w3Var.f21658e, AndroidUtilities.dp(50.0f), rectF4.top);
                rectF3.set(rectF4.left, b10, rectF4.right, AndroidUtilities.dp(50.0f) + b10);
                w3Var.f21651a.setupTab(w3Var.f21655c);
                w3Var.f21655c.a(canvas, rectF3, x10, w3Var.f21658e, 1.0f);
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
            rectF5.set(iArr[0] - iArr2[0], iArr[1] - iArr2[1], w3Var.S.getWidth() + i15, w3Var.S.getHeight() + (iArr[1] - iArr2[1]));
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
            arrayList = w3Var.R;
            i10 = i16;
            if (i19 >= arrayList.size()) {
                break;
            }
            if (((v3) arrayList.get(i19)).d.d >= 0) {
                f17 = 1.0f;
            } else {
                f17 = 0.0f;
            }
            f23 += f17;
            i19++;
            i16 = i10;
        }
        float d = w3Var.f21660f.d(f23, false);
        if (w3Var.getScrollWindow() <= 0.0f) {
            scrollMin = 0.0f;
        } else {
            scrollMin = ((w3Var.getScrollMin() - w3Var.getScrollOffset()) / (w3Var.getScrollWindow() * 0.15f)) * 0.2f;
        }
        float lerp = AndroidUtilities.lerp(0.0f, 1.0f - Utilities.clamp(scrollMin, 1.0f, 0.0f), w3Var.V);
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
                f14 = d;
                arrayList2 = arrayList;
                rectF2 = rectF;
                i14 = i18;
                f15 = f21;
            } else {
                v3 v3Var = (v3) arrayList.get(i20);
                float f24 = f18;
                if (i20 < arrayList.size()) {
                    k3 k3Var = v3Var.d;
                }
                k3 k3Var2 = v3Var.d;
                float[] fArr = v3Var.f21621g;
                float f25 = dp;
                Matrix matrix = v3Var.f21620f;
                float[] fArr2 = v3Var.h;
                if (k3Var2 == null) {
                    f10 = f24;
                } else {
                    f10 = lerp;
                }
                float c10 = (d - f24) - k3Var2.c();
                f11 = dp2;
                i11 = i20;
                float max = (c10 - Math.max(w3Var.getScrollMin(), w3Var.getScrollOffset())) / w3Var.getScrollWindow();
                Math.max(max, 0.0f);
                Math.max(Math.min(max, f24), -4.0f);
                float min2 = (Math.min(5.0f, c10) * AndroidUtilities.dp(6.0f)) + f25;
                float f26 = i18;
                float f27 = ((((f21 - f11) - (0.26f * f26)) - min2) * max) + min2;
                float f28 = min / 2.0f;
                i12 = min;
                RectF rectF6 = w3Var.f21657d0;
                rectF6.set(f22 - f28, f27, f22 + f28, f26 + f27);
                if ((rectF6.top > f21 || rectF6.bottom < 0.0f || lerp < 0.1f) && c10 < d - 3.0f) {
                    i13 = i10;
                } else {
                    i13 = i21;
                }
                int i22 = i13;
                w3Var.f21651a.d(rectF, Utilities.clamp(k3Var2.c(), 1.0f, 0.0f));
                rectF.offset(w3Var.f21651a.getX(), w3Var.f21651a.getY());
                AndroidUtilities.lerpCentered(rectF, rectF6, lerp, rectF6);
                n3 n3Var = w3Var.f21651a;
                if (n3Var != null) {
                    n3Var.setupTab(k3Var2);
                }
                if (rectF6.top > f21 || rectF6.bottom < 0.0f) {
                    f12 = lerp;
                    f13 = f20;
                    f14 = d;
                    arrayList2 = arrayList;
                    rectF2 = rectF;
                    i14 = i18;
                    f15 = f21;
                    f16 = f25;
                } else {
                    canvas.save();
                    v3Var.f21616a.set(rectF6);
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
                    matrix.setPolyToPoly(v3Var.f21621g, 0, v3Var.h, 0, 4);
                    canvas.concat(matrix);
                    float lerp2 = AndroidUtilities.lerp(k3Var2.b(), 1.0f, w3Var.V);
                    float lerp3 = AndroidUtilities.lerp(Utilities.clamp01((c10 - d) + 2.0f), 1.0f, Utilities.clamp01((f10 - 0.1f) / 0.8f));
                    RadialGradient radialGradient = v3Var.f21629p;
                    Paint paint = v3Var.f21628o;
                    Paint paint2 = v3Var.f21631r;
                    f12 = lerp;
                    Matrix matrix2 = v3Var.f21630q;
                    m3 m3Var = v3Var.f21618c;
                    f14 = d;
                    Path path2 = v3Var.f21627n;
                    arrayList2 = arrayList;
                    Paint paint3 = v3Var.f21619e;
                    rectF2 = rectF;
                    RectF rectF7 = v3Var.f21626m;
                    i14 = i18;
                    Paint paint4 = v3Var.f21625l;
                    f15 = f21;
                    f13 = f20;
                    float clamp = Utilities.clamp(1.0f - ((Math.abs(v3Var.f21622i) - 0.3f) / 0.7f), 1.0f, 0.0f) * lerp2;
                    if (clamp > 0.0f) {
                        float f32 = f31 * 1.0f;
                        float lerp4 = AndroidUtilities.lerp(1.0f, 1.3f, f32);
                        float currentActionBarHeight = ((k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(50.0f)) * 0.0f;
                        canvas.save();
                        canvas.rotate(v3Var.f21622i * 20.0f, (v3Var.f21622i * AndroidUtilities.dp(50.0f)) + rectF6.centerX(), rectF6.bottom + AndroidUtilities.dp(350.0f));
                        float a2 = v3Var.f21624k.a(0.01f);
                        canvas.scale(a2, a2, rectF6.centerX(), rectF6.centerY());
                        float lerp5 = AndroidUtilities.lerp(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), f31);
                        if (i22 != 0) {
                            paint4.setColor(0);
                            paint4.setShadowLayer(AndroidUtilities.dp(30.0f), 0.0f, AndroidUtilities.dp(10.0f), i6.m1(clamp * f31 * 1.0f, 536870912));
                            canvas.drawRoundRect(rectF6, lerp5, lerp5, paint4);
                            paint3.setAlpha((int) (clamp * 255.0f));
                            canvas.drawRoundRect(rectF6, lerp5, lerp5, paint3);
                            canvas.restore();
                        } else {
                            path2.rewind();
                            path2.addRoundRect(rectF6, lerp5, lerp5, Path.Direction.CW);
                            canvas.save();
                            paint4.setColor(0);
                            paint4.setShadowLayer(AndroidUtilities.dp(30.0f), 0.0f, AndroidUtilities.dp(10.0f), i6.m1(clamp * f31 * 1.0f, 536870912));
                            canvas.drawPath(path2, paint4);
                            canvas.clipPath(path2);
                            float f33 = clamp * 255.0f * f31;
                            int i23 = (int) f33;
                            paint3.setAlpha(i23);
                            canvas.drawRoundRect(rectF6, lerp5, lerp5, paint3);
                            canvas.save();
                            canvas.translate(rectF6.left, sc.v.d(AndroidUtilities.dp(50.0f), lerp4, rectF6.top, currentActionBarHeight));
                            canvas.scale(1.0f, AndroidUtilities.lerp(1.0f, 1.25f, f32));
                            if (m3Var != null && m3Var.f21389m != null) {
                                float width3 = rectF6.width() / m3Var.f21389m.getWidth();
                                canvas.scale(width3, width3);
                                paint.setAlpha(i23);
                                canvas.drawBitmap(m3Var.f21389m, 0.0f, 0.0f, paint);
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
                            v3Var.d.f21336w = f31;
                            canvas.scale(1.0f, lerp4, rectF7.centerX(), rectF7.top);
                            f16 = f25;
                            v3Var.d.a(canvas, rectF7, lerp5, clamp * clamp, lerp3);
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
            d = f14;
            arrayList = arrayList2;
            rectF = rectF2;
            i18 = i14;
            dp2 = f11;
            f21 = f15;
            min = i12;
            f20 = f13;
            f18 = 1.0f;
            w3Var = this;
        }
        float f34 = dp;
        float f35 = f20;
        canvas.save();
        if (this.f21665j0 == null) {
            this.f21665j0 = new j20();
        }
        RectF rectF8 = AndroidUtilities.rectTmp;
        rectF8.set(0.0f, 0.0f, f35, f34);
        this.f21665j0.b(canvas, rectF8, i10, this.V);
        canvas.restore();
        canvas.restore();
        if (this.f21662g0 == null) {
            this.f21662g0 = new m11(LocaleController.getString(R.string.BotCloseAllTabs), 14.0f, AndroidUtilities.bold());
        }
        if (this.f21664i0 == null || this.f21663h0 != i6.I.q()) {
            boolean q6 = i6.I.q();
            this.f21663h0 = q6;
            if (q6) {
                this.f21664i0 = i6.j0(64, 64, 64, 64, 553648127, 872415231, 872415231);
            } else {
                this.f21664i0 = i6.j0(64, 64, 64, 64, 771751936, 1140850688, 1140850688);
            }
            this.f21664i0.setCallback(this);
        }
        float dp3 = this.f21662g0.f28602c + AndroidUtilities.dp(24.0f);
        float f36 = (f35 - dp3) / 2.0f;
        this.f21664i0.setBounds((int) f36, (int) ((f34 - (AndroidUtilities.dp(95.0f) / 2.0f)) - AndroidUtilities.dp(14.0f)), (int) ((f35 + dp3) / 2.0f), (int) ((f34 - (AndroidUtilities.dp(95.0f) / 2.0f)) + AndroidUtilities.dp(14.0f)));
        this.f21664i0.setAlpha((int) (this.V * 255.0f));
        this.f21664i0.draw(canvas);
        this.f21662g0.c(f36 + AndroidUtilities.dp(12.0f), f34 - (AndroidUtilities.dp(95.0f) / 2.0f), this.V, -1, canvas);
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
        float f10 = 0.0f;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.R;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (((v3) arrayList.get(i10)).d.d >= 0) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            f10 += f7;
            i10++;
        }
        if (z10) {
            return this.f21660f.d(f10, false);
        }
        return f10;
    }

    public final void f() {
        float f7;
        k3 k3Var;
        n3 n3Var = this.f21651a;
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
            View view = (View) this.f21651a.getParent();
            this.S = view;
            int[] iArr = this.f21652a0;
            if (view != null) {
                view.getLocationOnScreen(iArr);
            } else {
                iArr[1] = 0;
                iArr[0] = 0;
            }
            int[] iArr2 = this.f21654b0;
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
            if (i6.I.q()) {
                f7 = 0.08f;
            } else {
                f7 = 0.25f;
            }
            AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, f7);
            this.O.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            this.P = new Matrix();
            ArrayList arrayList = this.R;
            arrayList.clear();
            ArrayList<m3> tabs = this.f21651a.getTabs();
            ArrayList<k3> tabDrawables = this.f21651a.getTabDrawables();
            for (int size = tabs.size() - 1; size >= 0; size--) {
                m3 m3Var = tabs.get(size);
                int i12 = 0;
                while (true) {
                    if (i12 < tabDrawables.size()) {
                        k3Var = tabDrawables.get(i12);
                        if (k3Var.f21317a == m3Var) {
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
            this.f21660f.d(arrayList.size(), true);
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
        this.T.setInterpolator(is.h);
        this.T.start();
    }

    public void setScrollOffset(float f7) {
        this.L = f7;
    }

    public void setTabsView(n3 n3Var) {
        this.f21651a = n3Var;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f21664i0 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public void setSlowerDismiss(boolean z10) {
    }
}
