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
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.pz0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.v10;

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

    public m3 f23883a;

    public final RectF f23884a0;

    public s3 f23885b;

    public final Path f23886b0;

    public j3 f23887c;

    public pz0 f23888c0;
    public ValueAnimator d;

    public boolean f23889d0;

    public float f23890e;

    public org.telegram.ui.Cells.z f23891e0;

    public final org.telegram.ui.Components.y5 f23892f;

    public v10 f23893f0;
    public final OverScroller h;

    public final int f23894n;

    public final int f23895r;

    public int f23896s;
    public final r3 v;

    public u3 f23897w;

    public boolean f23898x;

    public float f23899y;

    public v3(LaunchActivity launchActivity) {
        super(launchActivity);
        this.f23892f = new org.telegram.ui.Components.y5(this, 0L, 350L, er.h);
        this.M = new RectF();
        this.N = new ArrayList();
        this.T = new int[2];
        this.U = new int[2];
        this.V = new RectF();
        this.W = new RectF();
        this.f23884a0 = new RectF();
        this.f23886b0 = new Path();
        setWillNotDraw(false);
        this.h = new OverScroller(launchActivity);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(launchActivity);
        this.f23894n = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f23895r = viewConfiguration.getScaledMinimumFlingVelocity();
        r3 r3Var = new r3(this, this);
        this.v = r3Var;
        r0.j0.k(this, r3Var);
        setImportantForAccessibility(2);
        r0.b0.j(this, new n(this, 6));
    }

    public static void g(ViewGroup viewGroup, float f10, final gh.d1 d1Var) {
        if (viewGroup.getWidth() <= 0 || viewGroup.getHeight() <= 0) {
            d1Var.run(null);
            return;
        }
        final SurfaceTexture surfaceTextureB = org.telegram.messenger.v3.b();
        surfaceTextureB.setDefaultBufferSize(viewGroup.getWidth(), viewGroup.getHeight());
        final Surface surface = new Surface(surfaceTextureB);
        final Bitmap bitmapCreateBitmap = Bitmap.createBitmap(viewGroup.getWidth(), viewGroup.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvasLockHardwareCanvas = surface.lockHardwareCanvas();
        canvasLockHardwareCanvas.translate(0.0f, f10);
        viewGroup.draw(canvasLockHardwareCanvas);
        surface.unlockCanvasAndPost(canvasLockHardwareCanvas);
        PixelCopy.request(surface, bitmapCreateBitmap, new PixelCopy.OnPixelCopyFinishedListener() {
            @Override
            public final void onPixelCopyFinished(int i10) {
                gh.d1 d1Var2 = d1Var;
                Bitmap bitmap = bitmapCreateBitmap;
                Surface surface2 = surface;
                SurfaceTexture surfaceTexture = surfaceTextureB;
                if (i10 == 0) {
                    d1Var2.run(bitmap);
                } else {
                    bitmap.recycle();
                    d1Var2.run(null);
                }
                surface2.release();
                surfaceTexture.release();
            }
        }, new Handler());
    }

    private float getScrollStep() {
        return AndroidUtilities.dp(200.0f);
    }

    private void setModalAccessibility(boolean z10) {
        setImportantForAccessibility(z10 ? 1 : 2);
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) parent;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt != this) {
                    childAt.setImportantForAccessibility(z10 ? 4 : 0);
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
        if (this.Q == z10) {
            return;
        }
        ValueAnimator valueAnimator = this.S;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.Q = z10;
        m3 m3Var = this.f23883a;
        if (m3Var != null) {
            m3Var.f23658b = false;
            m3Var.invalidate();
        }
        setModalAccessibility(z10);
        invalidate();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.R, z10 ? 1.0f : 0.0f);
        this.S = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new n3(this, 0));
        this.S.addListener(new h(this, 4));
        this.S.setInterpolator(er.h);
        this.S.setDuration(320L);
        this.S.start();
    }

    public final void b(s3 s3Var) {
        ValueAnimator valueAnimator;
        if (this.f23883a == null) {
            return;
        }
        if (this.f23885b != null && (valueAnimator = this.d) != null) {
            valueAnimator.end();
            this.d = null;
        }
        this.f23885b = s3Var;
        s3Var.setLastVisible(false);
        ValueAnimator valueAnimator2 = this.d;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        l3 l3VarA = s3Var.a();
        m3 m3Var = this.f23883a;
        ArrayList<l3> tabs = m3Var.getTabs();
        ArrayList<j3> tabDrawables = m3Var.getTabDrawables();
        j3 j3Var = new j3(m3Var, l3VarA);
        j3Var.d.d(-1.0f, true);
        j3Var.f23531e.d(0.0f, true);
        tabDrawables.add(j3Var);
        tabs.add(0, l3VarA);
        for (int i10 = 0; i10 < tabDrawables.size(); i10++) {
            j3 j3Var2 = tabDrawables.get(i10);
            int iIndexOf = tabs.indexOf(j3Var2.f23528a);
            j3Var2.f23530c = iIndexOf;
            if (iIndexOf >= 0) {
                j3Var2.f23529b = iIndexOf;
            }
        }
        m3Var.n();
        m3Var.o(true);
        m3Var.invalidate();
        k3 k3Var = m3Var.f23660e;
        if (k3Var != null) {
            k3Var.i();
        }
        this.f23887c = j3Var;
        post(new p(s3Var, 10));
        invalidate();
        this.f23890e = 0.0f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.d = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new n3(this, 1));
        this.d.addListener(new q3(this, l3VarA, s3Var));
        AndroidUtilities.applySpring(this.d, 220.0d, 30.0d, 1.0d);
        ValueAnimator valueAnimator3 = this.d;
        valueAnimator3.setDuration((long) (valueAnimator3.getDuration() * 1.1f));
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
        ArrayList arrayList;
        float f10;
        float f11;
        int i10;
        int i11;
        v3 v3Var = this;
        super.dispatchDraw(canvas);
        s3 s3Var = v3Var.f23885b;
        int[] iArr = v3Var.T;
        int[] iArr2 = v3Var.U;
        RectF rectF = v3Var.V;
        if (s3Var != null) {
            v3Var.getLocationOnScreen(iArr2);
            v3Var.f23883a.getLocationOnScreen(iArr);
            v3Var.f23883a.d(rectF, 0.0f);
            rectF.offset(iArr[0] - iArr2[0], iArr[1] - iArr2[1]);
            canvas.save();
            canvas.clipRect(0, 0, v3Var.getMeasuredWidth(), v3Var.getMeasuredHeight() - v3Var.f23896s);
            t3 t3VarMo37getWindowView = v3Var.f23885b.mo37getWindowView();
            float f12 = v3Var.f23890e;
            RectF rectF2 = v3Var.f23884a0;
            float fZ = t3VarMo37getWindowView.z(canvas, rectF, f12, rectF2, f12);
            if (v3Var.f23887c != null) {
                Path path = v3Var.f23886b0;
                path.rewind();
                path.addRoundRect(rectF2, fZ, fZ, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                float fB = pa.b(1.0f, v3Var.f23890e, AndroidUtilities.dp(50.0f), rectF2.top);
                rectF.set(rectF2.left, fB, rectF2.right, AndroidUtilities.dp(50.0f) + fB);
                v3Var.f23883a.setupTab(v3Var.f23887c);
                v3Var.f23887c.a(canvas, rectF, fZ, v3Var.f23890e, 1.0f);
                canvas.restore();
            }
            canvas.restore();
        } else {
            rectF = rectF;
        }
        if (v3Var.R <= 0.0f) {
            return;
        }
        canvas.save();
        View view = v3Var.O;
        RectF rectF3 = v3Var.M;
        if (view != null) {
            view.getLocationOnScreen(iArr);
            v3Var.getLocationOnScreen(iArr2);
            int i12 = iArr[0] - iArr2[0];
            rectF3.set(i12, iArr[1] - iArr2[1], v3Var.O.getWidth() + i12, v3Var.O.getHeight() + (iArr[1] - iArr2[1]));
        } else {
            iArr[1] = 0;
            iArr[0] = 0;
            rectF3.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        canvas.clipRect(rectF3);
        canvas.translate(rectF3.left, rectF3.top);
        float fWidth = rectF3.width();
        float fHeight = rectF3.height();
        if (v3Var.I != null) {
            v3Var.L.reset();
            float fWidth2 = rectF3.width() / v3Var.I.getWidth();
            v3Var.L.postScale(fWidth2, fWidth2);
            v3Var.J.setLocalMatrix(v3Var.L);
            v3Var.K.setAlpha((int) (v3Var.R * 255.0f));
            canvas.drawRect(0.0f, 0.0f, fWidth, fHeight, v3Var.K);
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, fWidth, fHeight, 255, 31);
        float f13 = fWidth;
        float f14 = fHeight;
        float fDp = AndroidUtilities.dp(55.0f) + AndroidUtilities.dp(40.0f) + AndroidUtilities.statusBarHeight;
        float fDp2 = AndroidUtilities.dp(68.0f);
        int iMin = (int) Math.min(AndroidUtilities.dp(340.0f), 0.95f * f13);
        int iHeight = (int) (AndroidUtilities.isTablet() ? rectF3.height() * 0.5f : 0.75f * f14);
        float f15 = f13 / 2.0f;
        int i13 = 0;
        float f16 = 0.0f;
        while (true) {
            arrayList = v3Var.N;
            if (i13 >= arrayList.size()) {
                break;
            }
            f16 += ((u3) arrayList.get(i13)).d.f23530c >= 0 ? 1.0f : 0.0f;
            i13++;
        }
        float fD = v3Var.f23892f.d(f16, false);
        float fLerp = AndroidUtilities.lerp(0.0f, 1.0f - Utilities.clamp(v3Var.getScrollWindow() <= 0.0f ? 0.0f : ((v3Var.getScrollMin() - v3Var.getScrollOffset()) / (v3Var.getScrollWindow() * 0.15f)) * 0.2f, 1.0f, 0.0f), v3Var.R);
        int i14 = 0;
        while (i14 < arrayList.size() + 1) {
            if (i14 == arrayList.size()) {
                f10 = fDp;
                f11 = fDp2;
                i11 = iMin;
                i10 = i14;
            } else {
                u3 u3Var = (u3) arrayList.get(i14);
                if (i14 < arrayList.size()) {
                    j3 j3Var = u3Var.d;
                }
                j3 j3Var2 = u3Var.d;
                float[] fArr = u3Var.f23832g;
                f10 = fDp;
                Matrix matrix = u3Var.f23831f;
                float[] fArr2 = u3Var.h;
                float f17 = j3Var2 == null ? 1.0f : fLerp;
                float fC = (fD - 1.0f) - j3Var2.c();
                f11 = fDp2;
                i10 = i14;
                float fMax = (fC - Math.max(v3Var.getScrollMin(), v3Var.getScrollOffset())) / v3Var.getScrollWindow();
                Math.max(fMax, 0.0f);
                Math.max(Math.min(fMax, 1.0f), -4.0f);
                float fMin = (Math.min(5.0f, fC) * AndroidUtilities.dp(6.0f)) + f10;
                float f18 = iHeight;
                float f19 = ((((f14 - f11) - (0.26f * f18)) - fMin) * fMax) + fMin;
                float f20 = iMin / 2.0f;
                i11 = iMin;
                RectF rectF4 = v3Var.W;
                rectF4.set(f15 - f20, f19, f15 + f20, f18 + f19);
                boolean z10 = (rectF4.top > f14 || rectF4.bottom < 0.0f || fLerp < 0.1f) && fC < fD - 3.0f;
                v3Var.f23883a.d(rectF, Utilities.clamp(j3Var2.c(), 1.0f, 0.0f));
                rectF.offset(v3Var.f23883a.getX(), v3Var.f23883a.getY());
                AndroidUtilities.lerpCentered(rectF, rectF4, fLerp, rectF4);
                m3 m3Var = v3Var.f23883a;
                if (m3Var != null) {
                    m3Var.setupTab(j3Var2);
                }
                if (rectF4.top > f14 || rectF4.bottom < 0.0f) {
                    f10 = f10;
                } else {
                    canvas.save();
                    u3Var.f23827a.set(rectF4);
                    matrix.reset();
                    fArr[0] = rectF4.left;
                    float f21 = rectF4.top;
                    fArr[1] = f21;
                    float f22 = rectF4.right;
                    fArr[2] = f22;
                    fArr[3] = f21;
                    fArr[4] = f22;
                    fArr[5] = (rectF4.height() * 1.0f) + f21;
                    fArr[6] = rectF4.left;
                    fArr[7] = (rectF4.height() * 1.0f) + rectF4.top;
                    fArr2[0] = rectF4.left;
                    fArr2[1] = rectF4.top - AndroidUtilities.dp(0.0f);
                    fArr2[2] = rectF4.right;
                    fArr2[3] = rectF4.top - AndroidUtilities.dp(0.0f);
                    float f23 = f17 * 1.0f;
                    fArr2[4] = (AndroidUtilities.lerp(1.0f, 0.83f, f23) * (rectF4.width() / 2.0f)) + rectF4.centerX();
                    fArr2[5] = (AndroidUtilities.lerp(1.0f, 0.6f, f23) * ((rectF4.height() * 1.0f) + AndroidUtilities.dp(0.0f))) + (rectF4.top - AndroidUtilities.dp(0.0f));
                    fArr2[6] = rectF4.centerX() - (AndroidUtilities.lerp(1.0f, 0.83f, f23) * (rectF4.width() / 2.0f));
                    fArr2[7] = (AndroidUtilities.lerp(1.0f, 0.6f, f23) * ((rectF4.height() * 1.0f) + AndroidUtilities.dp(0.0f))) + (rectF4.top - AndroidUtilities.dp(0.0f));
                    matrix.setPolyToPoly(u3Var.f23832g, 0, u3Var.h, 0, 4);
                    canvas.concat(matrix);
                    float fLerp2 = AndroidUtilities.lerp(j3Var2.b(), 1.0f, v3Var.R);
                    float fLerp3 = AndroidUtilities.lerp(Utilities.clamp01((fC - fD) + 2.0f), 1.0f, Utilities.clamp01((f17 - 0.1f) / 0.8f));
                    RadialGradient radialGradient = u3Var.f23840p;
                    Paint paint = u3Var.f23839o;
                    Paint paint2 = u3Var.f23842r;
                    Matrix matrix2 = u3Var.f23841q;
                    l3 l3Var = u3Var.f23829c;
                    Path path2 = u3Var.f23838n;
                    Paint paint3 = u3Var.f23830e;
                    RectF rectF5 = u3Var.f23837m;
                    Paint paint4 = u3Var.f23836l;
                    float fClamp = Utilities.clamp(1.0f - ((Math.abs(u3Var.f23833i) - 0.3f) / 0.7f), 1.0f, 0.0f) * fLerp2;
                    if (fClamp > 0.0f) {
                        float f24 = f23 * 1.0f;
                        float fLerp4 = AndroidUtilities.lerp(1.0f, 1.3f, f24);
                        float currentActionBarHeight = ((k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(50.0f)) * 0.0f;
                        canvas.save();
                        canvas.rotate(u3Var.f23833i * 20.0f, (u3Var.f23833i * AndroidUtilities.dp(50.0f)) + rectF4.centerX(), rectF4.bottom + AndroidUtilities.dp(350.0f));
                        float fA = u3Var.f23835k.a(0.01f);
                        canvas.scale(fA, fA, rectF4.centerX(), rectF4.centerY());
                        float fLerp5 = AndroidUtilities.lerp(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), f23);
                        if (z10) {
                            paint4.setColor(0);
                            paint4.setShadowLayer(AndroidUtilities.dp(30.0f), 0.0f, AndroidUtilities.dp(10.0f), g6.l1(fClamp * f23 * 1.0f, 536870912));
                            canvas.drawRoundRect(rectF4, fLerp5, fLerp5, paint4);
                            paint3.setAlpha((int) (fClamp * 255.0f));
                            canvas.drawRoundRect(rectF4, fLerp5, fLerp5, paint3);
                            canvas.restore();
                        } else {
                            path2.rewind();
                            path2.addRoundRect(rectF4, fLerp5, fLerp5, Path.Direction.CW);
                            canvas.save();
                            paint4.setColor(0);
                            paint4.setShadowLayer(AndroidUtilities.dp(30.0f), 0.0f, AndroidUtilities.dp(10.0f), g6.l1(fClamp * f23 * 1.0f, 536870912));
                            canvas.drawPath(path2, paint4);
                            canvas.clipPath(path2);
                            float f25 = fClamp * 255.0f * f23;
                            int i15 = (int) f25;
                            paint3.setAlpha(i15);
                            canvas.drawRoundRect(rectF4, fLerp5, fLerp5, paint3);
                            canvas.save();
                            canvas.translate(rectF4.left, com.google.android.recaptcha.internal.a.d(AndroidUtilities.dp(50.0f), fLerp4, rectF4.top, currentActionBarHeight));
                            canvas.scale(1.0f, AndroidUtilities.lerp(1.0f, 1.25f, f24));
                            if (l3Var != null && l3Var.f23631k != null) {
                                float fWidth3 = rectF4.width() / l3Var.f23631k.getWidth();
                                canvas.scale(fWidth3, fWidth3);
                                paint.setAlpha(i15);
                                canvas.drawBitmap(l3Var.f23631k, 0.0f, 0.0f, paint);
                            }
                            canvas.restore();
                            canvas.save();
                            paint2.setAlpha((int) (f25 * 1.0f));
                            matrix2.reset();
                            float fHeight2 = rectF4.height() / 255.0f;
                            matrix2.postScale(fHeight2, fHeight2);
                            matrix2.postTranslate(rectF4.centerX(), rectF4.top);
                            radialGradient.setLocalMatrix(matrix2);
                            paint2.setShader(radialGradient);
                            canvas.drawRect(rectF4, paint2);
                            canvas.restore();
                            rectF5.set(rectF4);
                            rectF5.bottom = Math.min(rectF4.height(), AndroidUtilities.dp(50.0f)) + rectF5.top;
                            rectF5.offset(0.0f, currentActionBarHeight);
                            u3Var.d.v = f23;
                            canvas.scale(1.0f, fLerp4, rectF5.centerX(), rectF5.top);
                            u3Var.d.a(canvas, rectF5, fLerp5, fClamp * fClamp, fLerp3);
                            canvas.restore();
                            canvas.restore();
                        }
                    }
                    canvas.restore();
                }
            }
            i14 = i10 + 1;
            fDp = f10;
            fLerp = fLerp;
            fD = fD;
            arrayList = arrayList;
            rectF = rectF;
            iHeight = iHeight;
            fDp2 = f11;
            f14 = f14;
            iMin = i11;
            f13 = f13;
            v3Var = this;
        }
        float f26 = fDp;
        float f27 = f13;
        canvas.save();
        if (this.f23893f0 == null) {
            this.f23893f0 = new v10();
        }
        RectF rectF6 = AndroidUtilities.rectTmp;
        rectF6.set(0.0f, 0.0f, f27, f26);
        this.f23893f0.b(canvas, rectF6, 1, this.R);
        canvas.restore();
        canvas.restore();
        if (this.f23888c0 == null) {
            this.f23888c0 = new pz0(LocaleController.getString(R.string.BotCloseAllTabs), 14.0f, AndroidUtilities.bold());
        }
        if (this.f23891e0 == null || this.f23889d0 != g6.I.q()) {
            boolean zQ = g6.I.q();
            this.f23889d0 = zQ;
            if (zQ) {
                this.f23891e0 = g6.i0(64, 64, 64, 64, 553648127, 872415231, 872415231);
            } else {
                this.f23891e0 = g6.i0(64, 64, 64, 64, 771751936, 1140850688, 1140850688);
            }
            this.f23891e0.setCallback(this);
        }
        float fDp3 = this.f23888c0.f31697c + AndroidUtilities.dp(24.0f);
        float f28 = (f27 - fDp3) / 2.0f;
        this.f23891e0.setBounds((int) f28, (int) ((f26 - (AndroidUtilities.dp(95.0f) / 2.0f)) - AndroidUtilities.dp(14.0f)), (int) ((f27 + fDp3) / 2.0f), (int) ((f26 - (AndroidUtilities.dp(95.0f) / 2.0f)) + AndroidUtilities.dp(14.0f)));
        this.f23891e0.setAlpha((int) (this.R * 255.0f));
        this.f23891e0.draw(canvas);
        this.f23888c0.c(f28 + AndroidUtilities.dp(12.0f), f26 - (AndroidUtilities.dp(95.0f) / 2.0f), this.R, -1, canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        r3 r3Var;
        if (this.R <= 0.0f || (r3Var = this.v) == null || !r3Var.f(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object obj;
        boolean z10;
        ?? r10;
        u3 u3Var;
        if ((AndroidUtilities.isTablet() && motionEvent.getAction() == 0 && !this.M.contains(motionEvent.getX(), motionEvent.getY())) || this.R <= 0.0f) {
            return false;
        }
        if (this.E == null) {
            this.E = VelocityTracker.obtain();
        }
        this.E.addMovement(motionEvent);
        int action = motionEvent.getAction();
        OverScroller overScroller = this.h;
        Object obj2 = null;
        if (action == 0) {
            this.B = System.currentTimeMillis();
            this.A = motionEvent.getX();
            this.f23899y = motionEvent.getY();
            float x8 = motionEvent.getX();
            float y10 = motionEvent.getY();
            if (this.R >= 1.0f) {
                ArrayList arrayList = this.N;
                int size = arrayList.size() - 1;
                while (true) {
                    if (size < 0) {
                        u3Var = null;
                        break;
                    }
                    u3Var = (u3) arrayList.get(size);
                    if (Math.abs(u3Var.f23833i) < 0.4f && u3Var.f23827a.contains(x8, y10)) {
                        break;
                    }
                    size--;
                }
            } else {
                u3Var = null;
                break;
            }
            this.f23897w = u3Var;
            org.telegram.ui.Cells.z zVar = this.f23891e0;
            boolean z11 = zVar != null && zVar.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY());
            this.G = z11;
            if (z11) {
                this.f23897w = null;
            }
            org.telegram.ui.Cells.z zVar2 = this.f23891e0;
            if (zVar2 != null) {
                zVar2.setHotspot(motionEvent.getX(), motionEvent.getY());
                this.f23891e0.setState(this.G ? new int[]{16842919, 16842910} : new int[0]);
            }
            this.C = false;
            this.D = false;
            this.f23898x = false;
            u3 u3Var2 = this.f23897w;
            if (u3Var2 != null) {
                ValueAnimator valueAnimator = u3Var2.f23834j;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                boolean zContains = this.f23897w.d.f23536k.getBounds().contains((int) (motionEvent.getX() - this.f23897w.f23827a.left), (int) ((motionEvent.getY() - this.f23897w.f23827a.top) - AndroidUtilities.dp(24.0f)));
                this.f23898x = zContains;
                if (zContains) {
                    org.telegram.ui.Cells.z zVar3 = this.f23897w.d.f23536k;
                    float x10 = motionEvent.getX();
                    RectF rectF = this.V;
                    zVar3.setHotspot((int) (x10 - rectF.left), (int) (motionEvent.getY() - rectF.centerY()));
                }
                this.f23897w.f23835k.c(!this.f23898x);
                this.f23897w.d.f23536k.setState(this.f23898x ? new int[]{16842919, 16842910} : new int[0]);
            }
            this.F = motionEvent.getY();
            if (!overScroller.isFinished()) {
                overScroller.abortAnimation();
            }
            ValueAnimator valueAnimator2 = this.P;
            if (valueAnimator2 == null) {
                return true;
            }
            valueAnimator2.cancel();
            this.P = null;
            return true;
        }
        if (motionEvent.getAction() == 2) {
            u3 u3Var3 = this.f23897w;
            if (u3Var3 != null) {
                if (u3Var3.f23835k.h) {
                    if (!this.D && !this.C && h7.y.a(this.A, motionEvent.getY(), motionEvent.getX(), motionEvent.getY()) > AndroidUtilities.touchSlop) {
                        this.D = true;
                    }
                    if (!this.C && !this.D && h7.y.a(motionEvent.getX(), this.f23899y, motionEvent.getX(), motionEvent.getY()) > AndroidUtilities.touchSlop) {
                        if (!overScroller.isFinished()) {
                            overScroller.abortAnimation();
                        }
                        ValueAnimator valueAnimator3 = this.P;
                        if (valueAnimator3 != null) {
                            valueAnimator3.cancel();
                            this.P = null;
                        }
                        this.C = true;
                    }
                    if (this.f23883a != null && (this.C || this.D)) {
                        this.f23897w.f23835k.c(false);
                        ValueAnimator valueAnimator4 = this.f23897w.f23834j;
                        if (valueAnimator4 != null) {
                            valueAnimator4.cancel();
                        }
                    }
                } else {
                    if (!this.f23898x && !this.D && !this.C && h7.y.a(this.A, motionEvent.getY(), motionEvent.getX(), motionEvent.getY()) > AndroidUtilities.touchSlop) {
                        this.D = true;
                    }
                    if (!this.f23898x && !this.C && !this.D && h7.y.a(motionEvent.getX(), this.f23899y, motionEvent.getX(), motionEvent.getY()) > AndroidUtilities.touchSlop) {
                        if (!overScroller.isFinished()) {
                            overScroller.abortAnimation();
                        }
                        ValueAnimator valueAnimator5 = this.P;
                        if (valueAnimator5 != null) {
                            valueAnimator5.cancel();
                            this.P = null;
                        }
                        this.C = true;
                    }
                    if (this.f23898x) {
                        boolean zContains2 = this.f23897w.d.f23536k.getBounds().contains((int) (motionEvent.getX() - this.f23897w.f23827a.left), (int) ((motionEvent.getY() - this.f23897w.f23827a.top) - AndroidUtilities.dp(24.0f)));
                        this.f23898x = zContains2;
                        if (!zContains2) {
                            this.f23897w.d.f23536k.setState(new int[0]);
                        }
                    }
                }
                u3 u3Var4 = this.f23897w;
                if (!u3Var4.f23835k.h) {
                    if (this.D) {
                        u3Var4.f23833i = (motionEvent.getX() - this.A) / AndroidUtilities.dp(300.0f);
                    } else if (this.C) {
                        float y11 = motionEvent.getY() - this.F;
                        if (this.H < getScrollMin()) {
                            y11 *= 1.0f - (Utilities.clamp((getScrollMin() - this.H) / getScrollStep(), 1.0f, 0.0f) * 0.5f);
                        }
                        setScrollOffset(Utilities.clamp(((getScrollOffset() * getScrollStep()) - y11) / getScrollStep(), getScrollMax(), getScrollMin() - (getScrollStep() * 1.4f)));
                        invalidate();
                    }
                }
                invalidate();
            }
            org.telegram.ui.Cells.z zVar4 = this.f23891e0;
            if (zVar4 != null && this.G) {
                boolean z12 = this.f23897w == null && zVar4.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY());
                this.G = z12;
                if (!z12) {
                    this.f23891e0.setState(new int[0]);
                }
            }
            this.F = motionEvent.getY();
            return true;
        }
        if (motionEvent.getAction() != 1) {
            if (motionEvent.getAction() != 3) {
                return true;
            }
            u3 u3Var5 = this.f23897w;
            if (u3Var5 != null) {
                u3Var5.a(0.0f);
                this.f23897w.f23835k.c(false);
                this.f23897w.d.f23536k.setState(new int[0]);
            }
            this.f23897w = null;
            this.f23898x = false;
            VelocityTracker velocityTracker = this.E;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.E = null;
            }
            this.G = false;
            org.telegram.ui.Cells.z zVar5 = this.f23891e0;
            if (zVar5 == null) {
                return true;
            }
            zVar5.setState(new int[0]);
            return true;
        }
        u3 u3Var6 = this.f23897w;
        if (u3Var6 != null) {
            if (this.f23883a == null || Math.abs(u3Var6.f23833i) <= 0.4f) {
                this.f23897w.a(0.0f);
                if (this.f23883a == null || !this.f23897w.f23835k.h) {
                    if (this.C) {
                        if (this.H < getScrollMin() - (getScrollWindow() * 0.15f)) {
                            a(false);
                        } else {
                            if (this.H < getScrollMin()) {
                                h(getScrollMin());
                            } else {
                                this.E.computeCurrentVelocity(1000, this.f23894n);
                                float yVelocity = this.E.getYVelocity();
                                if (Math.abs(yVelocity) > this.f23895r) {
                                    z10 = true;
                                    overScroller.fling(0, (int) (getScrollOffset() * getScrollStep()), 0, (int) (-yVelocity), 0, 0, (int) (getScrollMin() * getScrollStep()), (int) (getScrollMax() * getScrollStep()), 0, (int) (getScrollStep() * 0.1f));
                                } else {
                                    z10 = true;
                                    overScroller.startScroll(0, (int) (getScrollOffset() * getScrollStep()), 0, 0, 0);
                                }
                            }
                            this.E.recycle();
                            this.E = obj2;
                            postInvalidateOnAnimation();
                        }
                        z10 = true;
                        this.E.recycle();
                        this.E = obj2;
                        postInvalidateOnAnimation();
                    }
                    this.f23897w.f23835k.c(false);
                    if (this.f23898x) {
                        this.f23898x = this.f23897w.d.f23536k.getBounds().contains((int) (motionEvent.getX() - this.f23897w.f23827a.left), (int) ((motionEvent.getY() - this.f23897w.f23827a.top) - AndroidUtilities.dp(24.0f)));
                    }
                    if (this.f23898x) {
                        final u3 u3Var7 = this.f23897w;
                        final int i10 = 1;
                        this.f23883a.g(u3Var7.f23829c, new Utilities.Callback(this) {

                            public final v3 f23699b;

                            {
                                this.f23699b = this;
                            }

                            @Override
                            public final void run(Object obj3) {
                                Boolean bool = (Boolean) obj3;
                                switch (i10) {
                                    case 0:
                                        v3 v3Var = this.f23699b;
                                        v3Var.getClass();
                                        boolean zBooleanValue = bool.booleanValue();
                                        u3 u3Var8 = u3Var7;
                                        if (!zBooleanValue) {
                                            u3Var8.a(0.0f);
                                        } else {
                                            u3Var8.a(u3Var8.f23833i < 0.0f ? -1.0f : 1.0f);
                                            v3Var.h(Utilities.clamp(v3Var.H, v3Var.c(false), v3Var.d(false)));
                                            if (v3Var.f23883a.getTabs().isEmpty()) {
                                                v3Var.a(false);
                                            }
                                        }
                                        break;
                                    default:
                                        v3 v3Var2 = this.f23699b;
                                        v3Var2.getClass();
                                        boolean zBooleanValue2 = bool.booleanValue();
                                        u3 u3Var9 = u3Var7;
                                        if (!zBooleanValue2) {
                                            u3Var9.a(0.0f);
                                        } else {
                                            u3Var9.a(1.0f);
                                            v3Var2.h(Utilities.clamp(v3Var2.H, v3Var2.c(false), v3Var2.d(false)));
                                            if (v3Var2.f23883a.getTabs().isEmpty()) {
                                                v3Var2.a(false);
                                            }
                                        }
                                        break;
                                }
                            }
                        });
                    }
                    this.f23897w.d.f23536k.setState(new int[0]);
                    r10 = obj2;
                } else {
                    a(false);
                    u3 u3Var8 = this.f23897w;
                    u3Var8.getClass();
                    this.f23883a.e(u3Var8.f23829c);
                }
            } else {
                final u3 u3Var9 = this.f23897w;
                final int i11 = 0;
                this.f23883a.g(u3Var9.f23829c, new Utilities.Callback(this) {

                    public final v3 f23699b;

                    {
                        this.f23699b = this;
                    }

                    @Override
                    public final void run(Object obj3) {
                        Boolean bool = (Boolean) obj3;
                        switch (i11) {
                            case 0:
                                v3 v3Var = this.f23699b;
                                v3Var.getClass();
                                boolean zBooleanValue = bool.booleanValue();
                                u3 u3Var10 = u3Var9;
                                if (!zBooleanValue) {
                                    u3Var10.a(0.0f);
                                } else {
                                    u3Var10.a(u3Var10.f23833i < 0.0f ? -1.0f : 1.0f);
                                    v3Var.h(Utilities.clamp(v3Var.H, v3Var.c(false), v3Var.d(false)));
                                    if (v3Var.f23883a.getTabs().isEmpty()) {
                                        v3Var.a(false);
                                    }
                                }
                                break;
                            default:
                                v3 v3Var2 = this.f23699b;
                                v3Var2.getClass();
                                boolean zBooleanValue2 = bool.booleanValue();
                                u3 u3Var11 = u3Var9;
                                if (!zBooleanValue2) {
                                    u3Var11.a(0.0f);
                                } else {
                                    u3Var11.a(1.0f);
                                    v3Var2.h(Utilities.clamp(v3Var2.H, v3Var2.c(false), v3Var2.d(false)));
                                    if (v3Var2.f23883a.getTabs().isEmpty()) {
                                        v3Var2.a(false);
                                    }
                                }
                                break;
                        }
                    }
                });
            }
            obj2 = null;
            z10 = true;
            this.f23897w.f23835k.c(false);
            if (this.f23898x) {
                this.f23898x = this.f23897w.d.f23536k.getBounds().contains((int) (motionEvent.getX() - this.f23897w.f23827a.left), (int) ((motionEvent.getY() - this.f23897w.f23827a.top) - AndroidUtilities.dp(24.0f)));
            }
            if (this.f23898x) {
                final u3 u3Var10 = this.f23897w;
                final int i12 = 1;
                this.f23883a.g(u3Var10.f23829c, new Utilities.Callback(this) {

                    public final v3 f23699b;

                    {
                        this.f23699b = this;
                    }

                    @Override
                    public final void run(Object obj3) {
                        Boolean bool = (Boolean) obj3;
                        switch (i12) {
                            case 0:
                                v3 v3Var = this.f23699b;
                                v3Var.getClass();
                                boolean zBooleanValue = bool.booleanValue();
                                u3 u3Var11 = u3Var10;
                                if (!zBooleanValue) {
                                    u3Var11.a(0.0f);
                                } else {
                                    u3Var11.a(u3Var11.f23833i < 0.0f ? -1.0f : 1.0f);
                                    v3Var.h(Utilities.clamp(v3Var.H, v3Var.c(false), v3Var.d(false)));
                                    if (v3Var.f23883a.getTabs().isEmpty()) {
                                        v3Var.a(false);
                                    }
                                }
                                break;
                            default:
                                v3 v3Var2 = this.f23699b;
                                v3Var2.getClass();
                                boolean zBooleanValue2 = bool.booleanValue();
                                u3 u3Var12 = u3Var10;
                                if (!zBooleanValue2) {
                                    u3Var12.a(0.0f);
                                } else {
                                    u3Var12.a(1.0f);
                                    v3Var2.h(Utilities.clamp(v3Var2.H, v3Var2.c(false), v3Var2.d(false)));
                                    if (v3Var2.f23883a.getTabs().isEmpty()) {
                                        v3Var2.a(false);
                                    }
                                }
                                break;
                        }
                    }
                });
            }
            this.f23897w.d.f23536k.setState(new int[0]);
            r10 = obj2;
        } else {
            obj = null;
            z10 = true;
            if (this.G) {
                this.f23883a.f();
                a(false);
                r10 = obj;
            } else if (h7.y.a(this.A, this.f23899y, motionEvent.getX(), motionEvent.getY()) <= AndroidUtilities.touchSlop && !this.C && !this.D && System.currentTimeMillis() - this.B <= ViewConfiguration.getTapTimeout() * 1.2f) {
                r10 = obj;
                r10 = obj;
                r10 = obj;
                r10 = obj;
                a(false);
                r10 = obj;
            }
        }
        r10 = obj;
        r10 = obj;
        r10 = obj;
        r10 = obj;
        r10 = obj;
        r10 = obj;
        r10 = obj;
        r10 = obj;
        r10 = obj;
        r10 = obj;
        this.f23897w = r10;
        this.f23898x = false;
        VelocityTracker velocityTracker2 = this.E;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            this.E = r10;
        }
        this.G = false;
        org.telegram.ui.Cells.z zVar6 = this.f23891e0;
        if (zVar6 == null) {
            return z10;
        }
        zVar6.setState(new int[0]);
        return z10;
    }

    public final float e(boolean z10) {
        int i10 = 0;
        float f10 = 0.0f;
        while (true) {
            ArrayList arrayList = this.N;
            if (i10 >= arrayList.size()) {
                break;
            }
            f10 += ((u3) arrayList.get(i10)).d.f23530c >= 0 ? 1.0f : 0.0f;
            i10++;
        }
        return z10 ? this.f23892f.d(f10, false) : f10;
    }

    public final void f() {
        j3 j3Var;
        m3 m3Var = this.f23883a;
        if (m3Var == null || !(m3Var.getParent() instanceof View)) {
            return;
        }
        HashSet hashSet = nh.b3.S0;
        if (!hashSet.isEmpty()) {
            Iterator it = new HashSet(hashSet).iterator();
            while (it.hasNext()) {
                ((nh.b3) it.next()).k(true);
            }
            AndroidUtilities.runOnUIThread(new p(this, 11), 100L);
            return;
        }
        ValueAnimator valueAnimator = this.d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.d = null;
        }
        View view = (View) this.f23883a.getParent();
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
        this.M.set(i10, iArr[1] - iArr2[1], this.O.getWidth() + i10, this.O.getHeight() + (iArr[1] - iArr2[1]));
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
        AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, g6.I.q() ? 0.08f : 0.25f);
        this.K.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        this.L = new Matrix();
        ArrayList arrayList = this.N;
        arrayList.clear();
        ArrayList<l3> tabs = this.f23883a.getTabs();
        ArrayList<j3> tabDrawables = this.f23883a.getTabDrawables();
        for (int size = tabs.size() - 1; size >= 0; size--) {
            l3 l3Var = tabs.get(size);
            int i11 = 0;
            while (true) {
                if (i11 >= tabDrawables.size()) {
                    j3Var = null;
                    break;
                }
                j3Var = tabDrawables.get(i11);
                if (j3Var.f23528a == l3Var) {
                    break;
                } else {
                    i11++;
                }
            }
            if (j3Var != null) {
                arrayList.add(new u3(this, l3Var, j3Var));
            }
        }
        this.f23892f.d(arrayList.size(), true);
        setScrollOffset(getScrollMax());
        a(true);
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

    public final void h(float f10) {
        ValueAnimator valueAnimator = this.P;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.P = null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.H, f10);
        this.P = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new n3(this, 2));
        this.P.setDuration(250L);
        this.P.setInterpolator(er.h);
        this.P.start();
    }

    public void setScrollOffset(float f10) {
        this.H = f10;
    }

    public void setTabsView(m3 m3Var) {
        this.f23883a = m3Var;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.f23891e0 || super.verifyDrawable(drawable);
    }

    public void setSlowerDismiss(boolean z10) {
    }
}
