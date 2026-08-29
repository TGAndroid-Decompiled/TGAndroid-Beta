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
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.zz0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.th;
import org.telegram.ui.u10;
public final class v3 extends View {
    public float A;
    public long B;
    public boolean C;
    public boolean D;
    public VelocityTracker E;
    public float F;
    public boolean G;
    public float H;
    public Bitmap I;
    public BitmapShader J;
    public Paint K;
    public Matrix L;
    public final RectF M;
    public final ArrayList N;
    public View O;
    public ValueAnimator P;
    public boolean Q;
    public float R;
    public ValueAnimator S;
    public final int[] T;
    public final int[] U;
    public final RectF V;
    public final RectF W;
    public m3 f23873a;
    public final RectF f23874a0;
    public s3 f23875b;
    public final Path f23876b0;
    public j3 f23877c;
    public zz0 f23878c0;
    public ValueAnimator d;
    public boolean f23879d0;
    public float f23880e;
    public org.telegram.ui.Cells.z f23881e0;
    public final org.telegram.ui.Components.d6 f23882f;
    public u10 f23883f0;
    public final OverScroller h;
    public final int f23884n;
    public final int f23885r;
    public int f23886s;
    public final r3 v;
    public u3 f23887w;
    public boolean f23888x;
    public float f23889y;

    public v3(LaunchActivity launchActivity) {
        super(launchActivity);
        this.f23882f = new org.telegram.ui.Components.d6(this, 0L, 350L, jr.h);
        this.M = new RectF();
        this.N = new ArrayList();
        this.T = new int[2];
        this.U = new int[2];
        this.V = new RectF();
        this.W = new RectF();
        this.f23874a0 = new RectF();
        this.f23876b0 = new Path();
        setWillNotDraw(false);
        this.h = new OverScroller(launchActivity);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(launchActivity);
        this.f23884n = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f23885r = viewConfiguration.getScaledMinimumFlingVelocity();
        r3 r3Var = new r3(this, this);
        this.v = r3Var;
        r0.j0.k(this, r3Var);
        setImportantForAccessibility(2);
        r0.b0.j(this, new o(this, 6));
    }

    public static void g(ViewGroup viewGroup, float f9, final ih.b1 b1Var) {
        if (viewGroup.getWidth() > 0 && viewGroup.getHeight() > 0) {
            final SurfaceTexture b10 = org.telegram.messenger.u3.b();
            b10.setDefaultBufferSize(viewGroup.getWidth(), viewGroup.getHeight());
            final Surface surface = new Surface(b10);
            final Bitmap createBitmap = Bitmap.createBitmap(viewGroup.getWidth(), viewGroup.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas lockHardwareCanvas = surface.lockHardwareCanvas();
            lockHardwareCanvas.translate(0.0f, f9);
            viewGroup.draw(lockHardwareCanvas);
            surface.unlockCanvasAndPost(lockHardwareCanvas);
            PixelCopy.request(surface, createBitmap, new PixelCopy.OnPixelCopyFinishedListener() {
                @Override
                public final void onPixelCopyFinished(int i10) {
                    ih.b1 b1Var2 = ih.b1.this;
                    Bitmap bitmap = createBitmap;
                    Surface surface2 = surface;
                    SurfaceTexture surfaceTexture = b10;
                    if (i10 == 0) {
                        b1Var2.run(bitmap);
                    } else {
                        bitmap.recycle();
                        b1Var2.run(null);
                    }
                    surface2.release();
                    surfaceTexture.release();
                }
            }, new Handler());
            return;
        }
        b1Var.run(null);
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
        float f9;
        if (this.Q == z10) {
            return;
        }
        ValueAnimator valueAnimator = this.S;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.Q = z10;
        m3 m3Var = this.f23873a;
        if (m3Var != null) {
            m3Var.f23678b = false;
            m3Var.invalidate();
        }
        setModalAccessibility(z10);
        invalidate();
        float f10 = this.R;
        if (z10) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f9);
        this.S = ofFloat;
        ofFloat.addUpdateListener(new n3(this, 0));
        this.S.addListener(new i(this, 4));
        this.S.setInterpolator(jr.h);
        this.S.setDuration(320L);
        this.S.start();
    }

    public final void b(s3 s3Var) {
        ValueAnimator valueAnimator;
        if (this.f23873a == null) {
            return;
        }
        if (this.f23875b != null && (valueAnimator = this.d) != null) {
            valueAnimator.end();
            this.d = null;
        }
        this.f23875b = s3Var;
        s3Var.setLastVisible(false);
        ValueAnimator valueAnimator2 = this.d;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        l3 a2 = s3Var.a();
        m3 m3Var = this.f23873a;
        ArrayList<l3> tabs = m3Var.getTabs();
        ArrayList<j3> tabDrawables = m3Var.getTabDrawables();
        j3 j3Var = new j3(m3Var, a2);
        j3Var.d.d(-1.0f, true);
        j3Var.f23554e.d(0.0f, true);
        tabDrawables.add(j3Var);
        tabs.add(0, a2);
        for (int i10 = 0; i10 < tabDrawables.size(); i10++) {
            j3 j3Var2 = tabDrawables.get(i10);
            int indexOf = tabs.indexOf(j3Var2.f23551a);
            j3Var2.f23553c = indexOf;
            if (indexOf >= 0) {
                j3Var2.f23552b = indexOf;
            }
        }
        m3Var.n();
        m3Var.o(true);
        m3Var.invalidate();
        k3 k3Var = m3Var.f23680e;
        if (k3Var != null) {
            k3Var.i();
        }
        this.f23877c = j3Var;
        post(new q(s3Var, 10));
        invalidate();
        this.f23880e = 0.0f;
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
        float f9;
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
        s3 s3Var = v3Var.f23875b;
        int[] iArr = v3Var.T;
        int[] iArr2 = v3Var.U;
        RectF rectF3 = v3Var.V;
        if (s3Var != null) {
            v3Var.getLocationOnScreen(iArr2);
            v3Var.f23873a.getLocationOnScreen(iArr);
            v3Var.f23873a.d(rectF3, 0.0f);
            rectF3.offset(iArr[0] - iArr2[0], iArr[1] - iArr2[1]);
            canvas.save();
            canvas.clipRect(0, 0, v3Var.getMeasuredWidth(), v3Var.getMeasuredHeight() - v3Var.f23886s);
            t3 mo37getWindowView = v3Var.f23875b.mo37getWindowView();
            float f18 = v3Var.f23880e;
            RectF rectF4 = v3Var.f23874a0;
            float z11 = mo37getWindowView.z(canvas, rectF3, f18, rectF4, f18);
            if (v3Var.f23877c != null) {
                Path path = v3Var.f23876b0;
                path.rewind();
                path.addRoundRect(rectF4, z11, z11, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                float b10 = th.b(1.0f, v3Var.f23880e, AndroidUtilities.dp(50.0f), rectF4.top);
                rectF3.set(rectF4.left, b10, rectF4.right, AndroidUtilities.dp(50.0f) + b10);
                v3Var.f23873a.setupTab(v3Var.f23877c);
                v3Var.f23877c.a(canvas, rectF3, z11, v3Var.f23880e, 1.0f);
                rectF = rectF3;
                canvas.restore();
            } else {
                rectF = rectF3;
            }
            canvas.restore();
        } else {
            rectF = rectF3;
        }
        if (v3Var.R <= 0.0f) {
            return;
        }
        canvas.save();
        View view = v3Var.O;
        RectF rectF5 = v3Var.M;
        if (view != null) {
            view.getLocationOnScreen(iArr);
            v3Var.getLocationOnScreen(iArr2);
            rectF5.set(iArr[0] - iArr2[0], iArr[1] - iArr2[1], v3Var.O.getWidth() + i13, v3Var.O.getHeight() + (iArr[1] - iArr2[1]));
        } else {
            iArr[1] = 0;
            iArr[0] = 0;
            rectF5.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        canvas.clipRect(rectF5);
        canvas.translate(rectF5.left, rectF5.top);
        float width = rectF5.width();
        float height = rectF5.height();
        if (v3Var.I != null) {
            v3Var.L.reset();
            float width2 = rectF5.width() / v3Var.I.getWidth();
            v3Var.L.postScale(width2, width2);
            v3Var.J.setLocalMatrix(v3Var.L);
            v3Var.K.setAlpha((int) (v3Var.R * 255.0f));
            canvas.drawRect(0.0f, 0.0f, width, height, v3Var.K);
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, width, height, 255, 31);
        float f19 = width;
        float f20 = height;
        float dp = AndroidUtilities.dp(55.0f) + AndroidUtilities.dp(40.0f) + AndroidUtilities.statusBarHeight;
        float dp2 = AndroidUtilities.dp(68.0f);
        int min = (int) Math.min(AndroidUtilities.dp(340.0f), 0.95f * f19);
        if (AndroidUtilities.isTablet()) {
            f9 = rectF5.height() * 0.5f;
        } else {
            f9 = 0.75f * f20;
        }
        int i14 = (int) f9;
        float f21 = f19 / 2.0f;
        int i15 = 0;
        float f22 = 0.0f;
        while (true) {
            arrayList = v3Var.N;
            if (i15 >= arrayList.size()) {
                break;
            }
            if (((u3) arrayList.get(i15)).d.f23553c >= 0) {
                f17 = 1.0f;
            } else {
                f17 = 0.0f;
            }
            f22 += f17;
            i15++;
        }
        float d = v3Var.f23882f.d(f22, false);
        if (v3Var.getScrollWindow() <= 0.0f) {
            scrollMin = 0.0f;
        } else {
            scrollMin = ((v3Var.getScrollMin() - v3Var.getScrollOffset()) / (v3Var.getScrollWindow() * 0.15f)) * 0.2f;
        }
        float lerp = AndroidUtilities.lerp(0.0f, 1.0f - Utilities.clamp(scrollMin, 1.0f, 0.0f), v3Var.R);
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
                float[] fArr = u3Var.f23839g;
                float f23 = dp;
                Matrix matrix = u3Var.f23838f;
                float[] fArr2 = u3Var.h;
                if (j3Var2 == null) {
                    f10 = 1.0f;
                } else {
                    f10 = lerp;
                }
                float c3 = (d - 1.0f) - j3Var2.c();
                f11 = dp2;
                i10 = i16;
                float max = (c3 - Math.max(v3Var.getScrollMin(), v3Var.getScrollOffset())) / v3Var.getScrollWindow();
                Math.max(max, 0.0f);
                Math.max(Math.min(max, 1.0f), -4.0f);
                float min2 = (Math.min(5.0f, c3) * AndroidUtilities.dp(6.0f)) + f23;
                float f24 = i14;
                float f25 = ((((f20 - f11) - (0.26f * f24)) - min2) * max) + min2;
                float f26 = min / 2.0f;
                i11 = min;
                RectF rectF6 = v3Var.W;
                rectF6.set(f21 - f26, f25, f21 + f26, f24 + f25);
                if ((rectF6.top > f20 || rectF6.bottom < 0.0f || lerp < 0.1f) && c3 < d - 3.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z12 = z10;
                v3Var.f23873a.d(rectF, Utilities.clamp(j3Var2.c(), 1.0f, 0.0f));
                rectF.offset(v3Var.f23873a.getX(), v3Var.f23873a.getY());
                AndroidUtilities.lerpCentered(rectF, rectF6, lerp, rectF6);
                m3 m3Var = v3Var.f23873a;
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
                    u3Var.f23834a.set(rectF6);
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
                    matrix.setPolyToPoly(u3Var.f23839g, 0, u3Var.h, 0, 4);
                    canvas.concat(matrix);
                    float lerp2 = AndroidUtilities.lerp(j3Var2.b(), 1.0f, v3Var.R);
                    float lerp3 = AndroidUtilities.lerp(Utilities.clamp01((c3 - d) + 2.0f), 1.0f, Utilities.clamp01((f10 - 0.1f) / 0.8f));
                    RadialGradient radialGradient = u3Var.f23847p;
                    Paint paint = u3Var.f23846o;
                    Paint paint2 = u3Var.f23849r;
                    f12 = lerp;
                    Matrix matrix2 = u3Var.f23848q;
                    l3 l3Var = u3Var.f23836c;
                    f14 = d;
                    Path path2 = u3Var.f23845n;
                    arrayList2 = arrayList;
                    Paint paint3 = u3Var.f23837e;
                    rectF2 = rectF;
                    RectF rectF7 = u3Var.f23844m;
                    i12 = i14;
                    Paint paint4 = u3Var.f23843l;
                    f15 = f20;
                    f13 = f19;
                    float clamp = Utilities.clamp(1.0f - ((Math.abs(u3Var.f23840i) - 0.3f) / 0.7f), 1.0f, 0.0f) * lerp2;
                    if (clamp > 0.0f) {
                        float f30 = f29 * 1.0f;
                        float lerp4 = AndroidUtilities.lerp(1.0f, 1.3f, f30);
                        float currentActionBarHeight = ((l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(50.0f)) * 0.0f;
                        canvas.save();
                        canvas.rotate(u3Var.f23840i * 20.0f, (u3Var.f23840i * AndroidUtilities.dp(50.0f)) + rectF6.centerX(), rectF6.bottom + AndroidUtilities.dp(350.0f));
                        float a2 = u3Var.f23842k.a(0.01f);
                        canvas.scale(a2, a2, rectF6.centerX(), rectF6.centerY());
                        float lerp5 = AndroidUtilities.lerp(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), f29);
                        if (z12) {
                            paint4.setColor(0);
                            paint4.setShadowLayer(AndroidUtilities.dp(30.0f), 0.0f, AndroidUtilities.dp(10.0f), g6.l1(clamp * f29 * 1.0f, 536870912));
                            canvas.drawRoundRect(rectF6, lerp5, lerp5, paint4);
                            paint3.setAlpha((int) (clamp * 255.0f));
                            canvas.drawRoundRect(rectF6, lerp5, lerp5, paint3);
                            canvas.restore();
                        } else {
                            path2.rewind();
                            path2.addRoundRect(rectF6, lerp5, lerp5, Path.Direction.CW);
                            canvas.save();
                            paint4.setColor(0);
                            paint4.setShadowLayer(AndroidUtilities.dp(30.0f), 0.0f, AndroidUtilities.dp(10.0f), g6.l1(clamp * f29 * 1.0f, 536870912));
                            canvas.drawPath(path2, paint4);
                            canvas.clipPath(path2);
                            float f31 = clamp * 255.0f * f29;
                            int i17 = (int) f31;
                            paint3.setAlpha(i17);
                            canvas.drawRoundRect(rectF6, lerp5, lerp5, paint3);
                            canvas.save();
                            canvas.translate(rectF6.left, com.google.android.recaptcha.internal.a.d(AndroidUtilities.dp(50.0f), lerp4, rectF6.top, currentActionBarHeight));
                            canvas.scale(1.0f, AndroidUtilities.lerp(1.0f, 1.25f, f30));
                            if (l3Var != null && l3Var.f23649k != null) {
                                float width3 = rectF6.width() / l3Var.f23649k.getWidth();
                                canvas.scale(width3, width3);
                                paint.setAlpha(i17);
                                canvas.drawBitmap(l3Var.f23649k, 0.0f, 0.0f, paint);
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
        if (this.f23883f0 == null) {
            this.f23883f0 = new u10();
        }
        RectF rectF8 = AndroidUtilities.rectTmp;
        rectF8.set(0.0f, 0.0f, f33, f32);
        this.f23883f0.b(canvas, rectF8, 1, this.R);
        canvas.restore();
        canvas.restore();
        if (this.f23878c0 == null) {
            this.f23878c0 = new zz0(LocaleController.getString(R.string.BotCloseAllTabs), 14.0f, AndroidUtilities.bold());
        }
        if (this.f23881e0 == null || this.f23879d0 != g6.I.q()) {
            boolean q6 = g6.I.q();
            this.f23879d0 = q6;
            if (q6) {
                this.f23881e0 = g6.i0(64, 64, 64, 64, 553648127, 872415231, 872415231);
            } else {
                this.f23881e0 = g6.i0(64, 64, 64, 64, 771751936, 1140850688, 1140850688);
            }
            this.f23881e0.setCallback(this);
        }
        float dp3 = this.f23878c0.f35462c + AndroidUtilities.dp(24.0f);
        float f34 = (f33 - dp3) / 2.0f;
        this.f23881e0.setBounds((int) f34, (int) ((f32 - (AndroidUtilities.dp(95.0f) / 2.0f)) - AndroidUtilities.dp(14.0f)), (int) ((f33 + dp3) / 2.0f), (int) ((f32 - (AndroidUtilities.dp(95.0f) / 2.0f)) + AndroidUtilities.dp(14.0f)));
        this.f23881e0.setAlpha((int) (this.R * 255.0f));
        this.f23881e0.draw(canvas);
        this.f23878c0.c(f34 + AndroidUtilities.dp(12.0f), f32 - (AndroidUtilities.dp(95.0f) / 2.0f), this.R, -1, canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        r3 r3Var;
        if (this.R > 0.0f && (r3Var = this.v) != null && r3Var.f(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.v3.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public final float e(boolean z10) {
        float f9;
        int i10 = 0;
        float f10 = 0.0f;
        while (true) {
            ArrayList arrayList = this.N;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (((u3) arrayList.get(i10)).d.f23553c >= 0) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            f10 += f9;
            i10++;
        }
        if (z10) {
            return this.f23882f.d(f10, false);
        }
        return f10;
    }

    public final void f() {
        float f9;
        j3 j3Var;
        m3 m3Var = this.f23873a;
        if (m3Var != null && (m3Var.getParent() instanceof View)) {
            HashSet hashSet = ph.p2.S0;
            if (!hashSet.isEmpty()) {
                Iterator it = new HashSet(hashSet).iterator();
                while (it.hasNext()) {
                    ((ph.p2) it.next()).k(true);
                }
                AndroidUtilities.runOnUIThread(new q(this, 11), 100L);
                return;
            }
            ValueAnimator valueAnimator = this.d;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.d = null;
            }
            View view = (View) this.f23873a.getParent();
            this.O = view;
            int[] iArr = this.T;
            if (view != null) {
                view.getLocationOnScreen(iArr);
            } else {
                iArr[1] = 0;
                iArr[0] = 0;
            }
            int[] iArr2 = this.U;
            getLocationOnScreen(iArr2);
            int i10 = iArr[0] - iArr2[0];
            int i11 = iArr[1] - iArr2[1];
            this.M.set(i10, iArr[1] - iArr2[1], this.O.getWidth() + i10, this.O.getHeight() + i11);
            View view2 = this.O;
            AndroidUtilities.makingGlobalBlurBitmap = true;
            this.I = AndroidUtilities.makeBlurBitmap(view2, 14.0f, 14);
            AndroidUtilities.makingGlobalBlurBitmap = false;
            Paint paint = new Paint(1);
            this.K = paint;
            Bitmap bitmap = this.I;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            this.J = bitmapShader;
            paint.setShader(bitmapShader);
            ColorMatrix colorMatrix = new ColorMatrix();
            if (g6.I.q()) {
                f9 = 0.08f;
            } else {
                f9 = 0.25f;
            }
            AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, f9);
            this.K.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            this.L = new Matrix();
            ArrayList arrayList = this.N;
            arrayList.clear();
            ArrayList<l3> tabs = this.f23873a.getTabs();
            ArrayList<j3> tabDrawables = this.f23873a.getTabDrawables();
            for (int size = tabs.size() - 1; size >= 0; size--) {
                l3 l3Var = tabs.get(size);
                int i12 = 0;
                while (true) {
                    if (i12 < tabDrawables.size()) {
                        j3Var = tabDrawables.get(i12);
                        if (j3Var.f23551a == l3Var) {
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
            this.f23882f.d(arrayList.size(), true);
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
        return this.H;
    }

    public float getScrollRange() {
        return e(true);
    }

    public float getScrollWindow() {
        return Math.min(3.0f, getScrollRange());
    }

    public final void h(float f9) {
        ValueAnimator valueAnimator = this.P;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.P = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.H, f9);
        this.P = ofFloat;
        ofFloat.addUpdateListener(new n3(this, 2));
        this.P.setDuration(250L);
        this.P.setInterpolator(jr.h);
        this.P.start();
    }

    public void setScrollOffset(float f9) {
        this.H = f9;
    }

    public void setTabsView(m3 m3Var) {
        this.f23873a = m3Var;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f23881e0 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public void setSlowerDismiss(boolean z10) {
    }
}
