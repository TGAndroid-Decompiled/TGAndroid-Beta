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
import org.telegram.ui.Components.l01;
import org.telegram.ui.Components.pr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.h20;
import org.telegram.ui.yh;
public final class x3 extends View {
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
    public o3 f22405a;
    public final RectF f22406a0;
    public u3 f22407b;
    public final RectF f22408b0;
    public l3 f22409c;
    public final Path f22410c0;
    public ValueAnimator d;
    public l01 f22411d0;
    public float f22412e;
    public boolean f22413e0;
    public final org.telegram.ui.Components.z5 f22414f;
    public org.telegram.ui.Cells.z f22415f0;
    public h20 f22416g0;
    public final OverScroller h;
    public final int f22417n;
    public final int f22418r;
    public int f22419s;
    public final t3 v;
    public w3 f22420w;
    public boolean f22421x;
    public float f22422y;

    public x3(LaunchActivity launchActivity) {
        super(launchActivity);
        this.f22414f = new org.telegram.ui.Components.z5(this, 0L, 350L, pr.h);
        this.N = new RectF();
        this.O = new ArrayList();
        this.U = new int[2];
        this.V = new int[2];
        this.W = new RectF();
        this.f22406a0 = new RectF();
        this.f22408b0 = new RectF();
        this.f22410c0 = new Path();
        setWillNotDraw(false);
        this.h = new OverScroller(launchActivity);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(launchActivity);
        this.f22417n = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f22418r = viewConfiguration.getScaledMinimumFlingVelocity();
        t3 t3Var = new t3(this, this);
        this.v = t3Var;
        r0.j0.k(this, t3Var);
        setImportantForAccessibility(2);
        r0.b0.j(this, new n(this, 6));
    }

    public static void g(ViewGroup viewGroup, float f10, final lh.a1 a1Var) {
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
                    lh.a1 a1Var2 = lh.a1.this;
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
        t3 t3Var = this.v;
        if (t3Var != null) {
            t3Var.i();
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
        o3 o3Var = this.f22405a;
        if (o3Var != null) {
            o3Var.f22193b = false;
            o3Var.invalidate();
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
        ofFloat.addUpdateListener(new p3(this, 0));
        this.T.addListener(new h(this, 4));
        this.T.setInterpolator(pr.h);
        this.T.setDuration(320L);
        this.T.start();
    }

    public final void b(u3 u3Var) {
        ValueAnimator valueAnimator;
        if (this.f22405a == null) {
            return;
        }
        if (this.f22407b != null && (valueAnimator = this.d) != null) {
            valueAnimator.end();
            this.d = null;
        }
        this.f22407b = u3Var;
        u3Var.setLastVisible(false);
        ValueAnimator valueAnimator2 = this.d;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        n3 a2 = u3Var.a();
        o3 o3Var = this.f22405a;
        ArrayList<n3> tabs = o3Var.getTabs();
        ArrayList<l3> tabDrawables = o3Var.getTabDrawables();
        l3 l3Var = new l3(o3Var, a2);
        l3Var.d.d(-1.0f, true);
        l3Var.f22068e.d(0.0f, true);
        tabDrawables.add(l3Var);
        tabs.add(0, a2);
        for (int i10 = 0; i10 < tabDrawables.size(); i10++) {
            l3 l3Var2 = tabDrawables.get(i10);
            int indexOf = tabs.indexOf(l3Var2.f22065a);
            l3Var2.f22067c = indexOf;
            if (indexOf >= 0) {
                l3Var2.f22066b = indexOf;
            }
        }
        o3Var.n();
        o3Var.o(true);
        o3Var.invalidate();
        m3 m3Var = o3Var.f22195e;
        if (m3Var != null) {
            m3Var.i();
        }
        this.f22409c = l3Var;
        post(new p(u3Var, 10));
        invalidate();
        this.f22412e = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.d = ofFloat;
        ofFloat.addUpdateListener(new p3(this, 1));
        this.d.addListener(new s3(this, a2, u3Var));
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
        x3 x3Var = this;
        super.dispatchDraw(canvas);
        u3 u3Var = x3Var.f22407b;
        int[] iArr = x3Var.U;
        int[] iArr2 = x3Var.V;
        RectF rectF3 = x3Var.W;
        if (u3Var != null) {
            x3Var.getLocationOnScreen(iArr2);
            x3Var.f22405a.getLocationOnScreen(iArr);
            x3Var.f22405a.d(rectF3, 0.0f);
            rectF3.offset(iArr[0] - iArr2[0], iArr[1] - iArr2[1]);
            canvas.save();
            canvas.clipRect(0, 0, x3Var.getMeasuredWidth(), x3Var.getMeasuredHeight() - x3Var.f22419s);
            v3 mo36getWindowView = x3Var.f22407b.mo36getWindowView();
            float f19 = x3Var.f22412e;
            RectF rectF4 = x3Var.f22408b0;
            float z10 = mo36getWindowView.z(canvas, rectF3, f19, rectF4, f19);
            if (x3Var.f22409c != null) {
                Path path = x3Var.f22410c0;
                path.rewind();
                path.addRoundRect(rectF4, z10, z10, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                float c3 = yh.c(1.0f, x3Var.f22412e, AndroidUtilities.dp(50.0f), rectF4.top);
                rectF3.set(rectF4.left, c3, rectF4.right, AndroidUtilities.dp(50.0f) + c3);
                x3Var.f22405a.setupTab(x3Var.f22409c);
                x3Var.f22409c.a(canvas, rectF3, z10, x3Var.f22412e, 1.0f);
                rectF = rectF3;
                canvas.restore();
            } else {
                rectF = rectF3;
            }
            canvas.restore();
        } else {
            rectF = rectF3;
        }
        if (x3Var.S <= 0.0f) {
            return;
        }
        canvas.save();
        View view = x3Var.P;
        RectF rectF5 = x3Var.N;
        if (view != null) {
            view.getLocationOnScreen(iArr);
            x3Var.getLocationOnScreen(iArr2);
            rectF5.set(iArr[0] - iArr2[0], iArr[1] - iArr2[1], x3Var.P.getWidth() + i13, x3Var.P.getHeight() + (iArr[1] - iArr2[1]));
        } else {
            iArr[1] = 0;
            iArr[0] = 0;
            rectF5.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        canvas.clipRect(rectF5);
        canvas.translate(rectF5.left, rectF5.top);
        float width = rectF5.width();
        float height = rectF5.height();
        if (x3Var.J != null) {
            x3Var.M.reset();
            float width2 = rectF5.width() / x3Var.J.getWidth();
            x3Var.M.postScale(width2, width2);
            x3Var.K.setLocalMatrix(x3Var.M);
            x3Var.L.setAlpha((int) (x3Var.S * 255.0f));
            canvas.drawRect(0.0f, 0.0f, width, height, x3Var.L);
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
            arrayList = x3Var.O;
            if (i15 >= arrayList.size()) {
                break;
            }
            if (((w3) arrayList.get(i15)).d.f22067c >= 0) {
                f18 = 1.0f;
            } else {
                f18 = 0.0f;
            }
            f23 += f18;
            i15++;
        }
        float d = x3Var.f22414f.d(f23, false);
        if (x3Var.getScrollWindow() <= 0.0f) {
            scrollMin = 0.0f;
        } else {
            scrollMin = ((x3Var.getScrollMin() - x3Var.getScrollOffset()) / (x3Var.getScrollWindow() * 0.15f)) * 0.2f;
        }
        float lerp = AndroidUtilities.lerp(0.0f, 1.0f - Utilities.clamp(scrollMin, 1.0f, 0.0f), x3Var.S);
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
                w3 w3Var = (w3) arrayList.get(i16);
                if (i16 < arrayList.size()) {
                    l3 l3Var = w3Var.d;
                }
                l3 l3Var2 = w3Var.d;
                float[] fArr = w3Var.f22379g;
                float f24 = dp;
                Matrix matrix = w3Var.f22378f;
                float[] fArr2 = w3Var.h;
                if (l3Var2 == null) {
                    f11 = 1.0f;
                } else {
                    f11 = lerp;
                }
                float c10 = (d - 1.0f) - l3Var2.c();
                f12 = dp2;
                i10 = i16;
                float max = (c10 - Math.max(x3Var.getScrollMin(), x3Var.getScrollOffset())) / x3Var.getScrollWindow();
                Math.max(max, 0.0f);
                Math.max(Math.min(max, 1.0f), -4.0f);
                float min2 = (Math.min(5.0f, c10) * AndroidUtilities.dp(6.0f)) + f24;
                float f25 = i14;
                float f26 = ((((f21 - f12) - (0.26f * f25)) - min2) * max) + min2;
                float f27 = min / 2.0f;
                i11 = min;
                RectF rectF6 = x3Var.f22406a0;
                rectF6.set(f22 - f27, f26, f22 + f27, f25 + f26);
                if ((rectF6.top > f21 || rectF6.bottom < 0.0f || lerp < 0.1f) && c10 < d - 3.0f) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolean z11 = z4;
                x3Var.f22405a.d(rectF, Utilities.clamp(l3Var2.c(), 1.0f, 0.0f));
                rectF.offset(x3Var.f22405a.getX(), x3Var.f22405a.getY());
                AndroidUtilities.lerpCentered(rectF, rectF6, lerp, rectF6);
                o3 o3Var = x3Var.f22405a;
                if (o3Var != null) {
                    o3Var.setupTab(l3Var2);
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
                    w3Var.f22374a.set(rectF6);
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
                    matrix.setPolyToPoly(w3Var.f22379g, 0, w3Var.h, 0, 4);
                    canvas.concat(matrix);
                    float lerp2 = AndroidUtilities.lerp(l3Var2.b(), 1.0f, x3Var.S);
                    float lerp3 = AndroidUtilities.lerp(Utilities.clamp01((c10 - d) + 2.0f), 1.0f, Utilities.clamp01((f11 - 0.1f) / 0.8f));
                    RadialGradient radialGradient = w3Var.f22387p;
                    Paint paint = w3Var.f22386o;
                    Paint paint2 = w3Var.f22389r;
                    f13 = lerp;
                    Matrix matrix2 = w3Var.f22388q;
                    n3 n3Var = w3Var.f22376c;
                    f15 = d;
                    Path path2 = w3Var.f22385n;
                    arrayList2 = arrayList;
                    Paint paint3 = w3Var.f22377e;
                    rectF2 = rectF;
                    RectF rectF7 = w3Var.f22384m;
                    i12 = i14;
                    Paint paint4 = w3Var.f22383l;
                    f16 = f21;
                    f14 = f20;
                    float clamp = Utilities.clamp(1.0f - ((Math.abs(w3Var.f22380i) - 0.3f) / 0.7f), 1.0f, 0.0f) * lerp2;
                    if (clamp > 0.0f) {
                        float f31 = f30 * 1.0f;
                        float lerp4 = AndroidUtilities.lerp(1.0f, 1.3f, f31);
                        float currentActionBarHeight = ((k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(50.0f)) * 0.0f;
                        canvas.save();
                        canvas.rotate(w3Var.f22380i * 20.0f, (w3Var.f22380i * AndroidUtilities.dp(50.0f)) + rectF6.centerX(), rectF6.bottom + AndroidUtilities.dp(350.0f));
                        float a2 = w3Var.f22382k.a(0.01f);
                        canvas.scale(a2, a2, rectF6.centerX(), rectF6.centerY());
                        float lerp5 = AndroidUtilities.lerp(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), f30);
                        if (z11) {
                            paint4.setColor(0);
                            paint4.setShadowLayer(AndroidUtilities.dp(30.0f), 0.0f, AndroidUtilities.dp(10.0f), k6.l1(clamp * f30 * 1.0f, 536870912));
                            canvas.drawRoundRect(rectF6, lerp5, lerp5, paint4);
                            paint3.setAlpha((int) (clamp * 255.0f));
                            canvas.drawRoundRect(rectF6, lerp5, lerp5, paint3);
                            canvas.restore();
                        } else {
                            path2.rewind();
                            path2.addRoundRect(rectF6, lerp5, lerp5, Path.Direction.CW);
                            canvas.save();
                            paint4.setColor(0);
                            paint4.setShadowLayer(AndroidUtilities.dp(30.0f), 0.0f, AndroidUtilities.dp(10.0f), k6.l1(clamp * f30 * 1.0f, 536870912));
                            canvas.drawPath(path2, paint4);
                            canvas.clipPath(path2);
                            float f32 = clamp * 255.0f * f30;
                            int i17 = (int) f32;
                            paint3.setAlpha(i17);
                            canvas.drawRoundRect(rectF6, lerp5, lerp5, paint3);
                            canvas.save();
                            canvas.translate(rectF6.left, e2.c.A(AndroidUtilities.dp(50.0f), lerp4, rectF6.top, currentActionBarHeight));
                            canvas.scale(1.0f, AndroidUtilities.lerp(1.0f, 1.25f, f31));
                            if (n3Var != null && n3Var.f22168k != null) {
                                float width3 = rectF6.width() / n3Var.f22168k.getWidth();
                                canvas.scale(width3, width3);
                                paint.setAlpha(i17);
                                canvas.drawBitmap(n3Var.f22168k, 0.0f, 0.0f, paint);
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
                            w3Var.d.v = f30;
                            canvas.scale(1.0f, lerp4, rectF7.centerX(), rectF7.top);
                            f17 = f24;
                            w3Var.d.a(canvas, rectF7, lerp5, clamp * clamp, lerp3);
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
            x3Var = this;
        }
        float f33 = dp;
        float f34 = f20;
        canvas.save();
        if (this.f22416g0 == null) {
            this.f22416g0 = new h20();
        }
        RectF rectF8 = AndroidUtilities.rectTmp;
        rectF8.set(0.0f, 0.0f, f34, f33);
        this.f22416g0.b(canvas, rectF8, 1, this.S);
        canvas.restore();
        canvas.restore();
        if (this.f22411d0 == null) {
            this.f22411d0 = new l01(LocaleController.getString(R.string.BotCloseAllTabs), 14.0f, AndroidUtilities.bold());
        }
        if (this.f22415f0 == null || this.f22413e0 != k6.I.q()) {
            boolean q10 = k6.I.q();
            this.f22413e0 = q10;
            if (q10) {
                this.f22415f0 = k6.i0(64, 64, 64, 64, 553648127, 872415231, 872415231);
            } else {
                this.f22415f0 = k6.i0(64, 64, 64, 64, 771751936, 1140850688, 1140850688);
            }
            this.f22415f0.setCallback(this);
        }
        float dp3 = this.f22411d0.f28521c + AndroidUtilities.dp(24.0f);
        float f35 = (f34 - dp3) / 2.0f;
        this.f22415f0.setBounds((int) f35, (int) ((f33 - (AndroidUtilities.dp(95.0f) / 2.0f)) - AndroidUtilities.dp(14.0f)), (int) ((f34 + dp3) / 2.0f), (int) ((f33 - (AndroidUtilities.dp(95.0f) / 2.0f)) + AndroidUtilities.dp(14.0f)));
        this.f22415f0.setAlpha((int) (this.S * 255.0f));
        this.f22415f0.draw(canvas);
        this.f22411d0.c(f35 + AndroidUtilities.dp(12.0f), f33 - (AndroidUtilities.dp(95.0f) / 2.0f), this.S, -1, canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        t3 t3Var;
        if (this.S > 0.0f && (t3Var = this.v) != null && t3Var.f(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.x3.dispatchTouchEvent(android.view.MotionEvent):boolean");
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
            if (((w3) arrayList.get(i10)).d.f22067c >= 0) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            f11 += f10;
            i10++;
        }
        if (z4) {
            return this.f22414f.d(f11, false);
        }
        return f11;
    }

    public final void f() {
        float f10;
        l3 l3Var;
        o3 o3Var = this.f22405a;
        if (o3Var != null && (o3Var.getParent() instanceof View)) {
            HashSet hashSet = sh.p2.T0;
            if (!hashSet.isEmpty()) {
                Iterator it = new HashSet(hashSet).iterator();
                while (it.hasNext()) {
                    ((sh.p2) it.next()).k(true);
                }
                AndroidUtilities.runOnUIThread(new p(this, 11), 100L);
                return;
            }
            ValueAnimator valueAnimator = this.d;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.d = null;
            }
            View view = (View) this.f22405a.getParent();
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
            if (k6.I.q()) {
                f10 = 0.08f;
            } else {
                f10 = 0.25f;
            }
            AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, f10);
            this.L.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            this.M = new Matrix();
            ArrayList arrayList = this.O;
            arrayList.clear();
            ArrayList<n3> tabs = this.f22405a.getTabs();
            ArrayList<l3> tabDrawables = this.f22405a.getTabDrawables();
            for (int size = tabs.size() - 1; size >= 0; size--) {
                n3 n3Var = tabs.get(size);
                int i12 = 0;
                while (true) {
                    if (i12 < tabDrawables.size()) {
                        l3Var = tabDrawables.get(i12);
                        if (l3Var.f22065a == n3Var) {
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
            this.f22414f.d(arrayList.size(), true);
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
        ofFloat.addUpdateListener(new p3(this, 2));
        this.Q.setDuration(250L);
        this.Q.setInterpolator(pr.h);
        this.Q.start();
    }

    public void setScrollOffset(float f10) {
        this.I = f10;
    }

    public void setTabsView(o3 o3Var) {
        this.f22405a = o3Var;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f22415f0 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public void setSlowerDismiss(boolean z4) {
    }
}
