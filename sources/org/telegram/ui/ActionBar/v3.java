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
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.nz0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.s10;
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
    public m3 f23853a;
    public final RectF f23854a0;
    public s3 f23855b;
    public final Path f23856b0;
    public j3 f23857c;
    public nz0 f23858c0;
    public ValueAnimator d;
    public boolean f23859d0;
    public float f23860e;
    public org.telegram.ui.Cells.z f23861e0;
    public final org.telegram.ui.Components.y5 f23862f;
    public s10 f23863f0;
    public final OverScroller h;
    public final int f23864n;
    public final int f23865r;
    public int f23866s;
    public final r3 v;
    public u3 f23867w;
    public boolean f23868x;
    public float f23869y;

    public v3(LaunchActivity launchActivity) {
        super(launchActivity);
        this.f23862f = new org.telegram.ui.Components.y5(this, 0L, 350L, gr.h);
        this.M = new RectF();
        this.N = new ArrayList();
        this.T = new int[2];
        this.U = new int[2];
        this.V = new RectF();
        this.W = new RectF();
        this.f23854a0 = new RectF();
        this.f23856b0 = new Path();
        setWillNotDraw(false);
        this.h = new OverScroller(launchActivity);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(launchActivity);
        this.f23864n = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f23865r = viewConfiguration.getScaledMinimumFlingVelocity();
        r3 r3Var = new r3(this, this);
        this.v = r3Var;
        r0.j0.k(this, r3Var);
        setImportantForAccessibility(2);
        r0.b0.j(this, new n(this, 6));
    }

    public static void g(ViewGroup viewGroup, float f10, final fh.f1 f1Var) {
        if (viewGroup.getWidth() > 0 && viewGroup.getHeight() > 0) {
            final SurfaceTexture b10 = org.telegram.messenger.t3.b();
            b10.setDefaultBufferSize(viewGroup.getWidth(), viewGroup.getHeight());
            final Surface surface = new Surface(b10);
            final Bitmap createBitmap = Bitmap.createBitmap(viewGroup.getWidth(), viewGroup.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas lockHardwareCanvas = surface.lockHardwareCanvas();
            lockHardwareCanvas.translate(0.0f, f10);
            viewGroup.draw(lockHardwareCanvas);
            surface.unlockCanvasAndPost(lockHardwareCanvas);
            PixelCopy.request(surface, createBitmap, new PixelCopy.OnPixelCopyFinishedListener() {
                @Override
                public final void onPixelCopyFinished(int i9) {
                    fh.f1 f1Var2 = fh.f1.this;
                    Bitmap bitmap = createBitmap;
                    Surface surface2 = surface;
                    SurfaceTexture surfaceTexture = b10;
                    if (i9 == 0) {
                        f1Var2.run(bitmap);
                    } else {
                        bitmap.recycle();
                        f1Var2.run(null);
                    }
                    surface2.release();
                    surfaceTexture.release();
                }
            }, new Handler());
            return;
        }
        f1Var.run(null);
    }

    private float getScrollStep() {
        return AndroidUtilities.dp(200.0f);
    }

    private void setModalAccessibility(boolean z10) {
        int i9;
        int i10;
        if (z10) {
            i9 = 1;
        } else {
            i9 = 2;
        }
        setImportantForAccessibility(i9);
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) parent;
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                View childAt = viewGroup.getChildAt(i11);
                if (childAt != this) {
                    if (z10) {
                        i10 = 4;
                    } else {
                        i10 = 0;
                    }
                    childAt.setImportantForAccessibility(i10);
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
        float f10;
        if (this.Q == z10) {
            return;
        }
        ValueAnimator valueAnimator = this.S;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.Q = z10;
        m3 m3Var = this.f23853a;
        if (m3Var != null) {
            m3Var.f23658b = false;
            m3Var.invalidate();
        }
        setModalAccessibility(z10);
        invalidate();
        float f11 = this.R;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.S = ofFloat;
        ofFloat.addUpdateListener(new n3(this, 0));
        this.S.addListener(new h(this, 4));
        this.S.setInterpolator(gr.h);
        this.S.setDuration(320L);
        this.S.start();
    }

    public final void b(s3 s3Var) {
        ValueAnimator valueAnimator;
        if (this.f23853a == null) {
            return;
        }
        if (this.f23855b != null && (valueAnimator = this.d) != null) {
            valueAnimator.end();
            this.d = null;
        }
        this.f23855b = s3Var;
        s3Var.setLastVisible(false);
        ValueAnimator valueAnimator2 = this.d;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        l3 a2 = s3Var.a();
        m3 m3Var = this.f23853a;
        ArrayList<l3> tabs = m3Var.getTabs();
        ArrayList<j3> tabDrawables = m3Var.getTabDrawables();
        j3 j3Var = new j3(m3Var, a2);
        j3Var.d.d(-1.0f, true);
        j3Var.f23530e.d(0.0f, true);
        tabDrawables.add(j3Var);
        tabs.add(0, a2);
        for (int i9 = 0; i9 < tabDrawables.size(); i9++) {
            j3 j3Var2 = tabDrawables.get(i9);
            int indexOf = tabs.indexOf(j3Var2.f23527a);
            j3Var2.f23529c = indexOf;
            if (indexOf >= 0) {
                j3Var2.f23528b = indexOf;
            }
        }
        m3Var.n();
        m3Var.o(true);
        m3Var.invalidate();
        k3 k3Var = m3Var.f23660e;
        if (k3Var != null) {
            k3Var.i();
        }
        this.f23857c = j3Var;
        post(new p(s3Var, 10));
        invalidate();
        this.f23860e = 0.0f;
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
        float f10;
        ArrayList arrayList;
        float scrollMin;
        float f11;
        float f12;
        int i9;
        int i10;
        boolean z10;
        float f13;
        float f14;
        float f15;
        ArrayList arrayList2;
        RectF rectF2;
        int i11;
        float f16;
        float f17;
        float f18;
        int i12;
        v3 v3Var = this;
        super.dispatchDraw(canvas);
        s3 s3Var = v3Var.f23855b;
        int[] iArr = v3Var.T;
        int[] iArr2 = v3Var.U;
        RectF rectF3 = v3Var.V;
        if (s3Var != null) {
            v3Var.getLocationOnScreen(iArr2);
            v3Var.f23853a.getLocationOnScreen(iArr);
            v3Var.f23853a.d(rectF3, 0.0f);
            rectF3.offset(iArr[0] - iArr2[0], iArr[1] - iArr2[1]);
            canvas.save();
            canvas.clipRect(0, 0, v3Var.getMeasuredWidth(), v3Var.getMeasuredHeight() - v3Var.f23866s);
            t3 mo37getWindowView = v3Var.f23855b.mo37getWindowView();
            float f19 = v3Var.f23860e;
            RectF rectF4 = v3Var.f23854a0;
            float z11 = mo37getWindowView.z(canvas, rectF3, f19, rectF4, f19);
            if (v3Var.f23857c != null) {
                Path path = v3Var.f23856b0;
                path.rewind();
                path.addRoundRect(rectF4, z11, z11, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                float C = j3.r0.C(1.0f, v3Var.f23860e, AndroidUtilities.dp(50.0f), rectF4.top);
                rectF3.set(rectF4.left, C, rectF4.right, AndroidUtilities.dp(50.0f) + C);
                v3Var.f23853a.setupTab(v3Var.f23857c);
                v3Var.f23857c.a(canvas, rectF3, z11, v3Var.f23860e, 1.0f);
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
            rectF5.set(iArr[0] - iArr2[0], iArr[1] - iArr2[1], v3Var.O.getWidth() + i12, v3Var.O.getHeight() + (iArr[1] - iArr2[1]));
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
        int i13 = (int) f10;
        float f22 = f20 / 2.0f;
        int i14 = 0;
        float f23 = 0.0f;
        while (true) {
            arrayList = v3Var.N;
            if (i14 >= arrayList.size()) {
                break;
            }
            if (((u3) arrayList.get(i14)).d.f23529c >= 0) {
                f18 = 1.0f;
            } else {
                f18 = 0.0f;
            }
            f23 += f18;
            i14++;
        }
        float d = v3Var.f23862f.d(f23, false);
        if (v3Var.getScrollWindow() <= 0.0f) {
            scrollMin = 0.0f;
        } else {
            scrollMin = ((v3Var.getScrollMin() - v3Var.getScrollOffset()) / (v3Var.getScrollWindow() * 0.15f)) * 0.2f;
        }
        float lerp = AndroidUtilities.lerp(0.0f, 1.0f - Utilities.clamp(scrollMin, 1.0f, 0.0f), v3Var.R);
        int i15 = 0;
        while (i15 < arrayList.size() + 1) {
            if (i15 == arrayList.size()) {
                f17 = dp;
                f12 = dp2;
                i10 = min;
                f13 = lerp;
                i9 = i15;
                f14 = f20;
                f15 = d;
                arrayList2 = arrayList;
                rectF2 = rectF;
                i11 = i13;
                f16 = f21;
            } else {
                u3 u3Var = (u3) arrayList.get(i15);
                if (i15 < arrayList.size()) {
                    j3 j3Var = u3Var.d;
                }
                j3 j3Var2 = u3Var.d;
                float[] fArr = u3Var.f23821g;
                float f24 = dp;
                Matrix matrix = u3Var.f23820f;
                float[] fArr2 = u3Var.h;
                if (j3Var2 == null) {
                    f11 = 1.0f;
                } else {
                    f11 = lerp;
                }
                float c10 = (d - 1.0f) - j3Var2.c();
                f12 = dp2;
                i9 = i15;
                float max = (c10 - Math.max(v3Var.getScrollMin(), v3Var.getScrollOffset())) / v3Var.getScrollWindow();
                Math.max(max, 0.0f);
                Math.max(Math.min(max, 1.0f), -4.0f);
                float min2 = (Math.min(5.0f, c10) * AndroidUtilities.dp(6.0f)) + f24;
                float f25 = i13;
                float f26 = ((((f21 - f12) - (0.26f * f25)) - min2) * max) + min2;
                float f27 = min / 2.0f;
                i10 = min;
                RectF rectF6 = v3Var.W;
                rectF6.set(f22 - f27, f26, f22 + f27, f25 + f26);
                if ((rectF6.top > f21 || rectF6.bottom < 0.0f || lerp < 0.1f) && c10 < d - 3.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z12 = z10;
                v3Var.f23853a.d(rectF, Utilities.clamp(j3Var2.c(), 1.0f, 0.0f));
                rectF.offset(v3Var.f23853a.getX(), v3Var.f23853a.getY());
                AndroidUtilities.lerpCentered(rectF, rectF6, lerp, rectF6);
                m3 m3Var = v3Var.f23853a;
                if (m3Var != null) {
                    m3Var.setupTab(j3Var2);
                }
                if (rectF6.top > f21 || rectF6.bottom < 0.0f) {
                    f13 = lerp;
                    f14 = f20;
                    f15 = d;
                    arrayList2 = arrayList;
                    rectF2 = rectF;
                    i11 = i13;
                    f16 = f21;
                    f17 = f24;
                } else {
                    canvas.save();
                    u3Var.f23816a.set(rectF6);
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
                    matrix.setPolyToPoly(u3Var.f23821g, 0, u3Var.h, 0, 4);
                    canvas.concat(matrix);
                    float lerp2 = AndroidUtilities.lerp(j3Var2.b(), 1.0f, v3Var.R);
                    float lerp3 = AndroidUtilities.lerp(Utilities.clamp01((c10 - d) + 2.0f), 1.0f, Utilities.clamp01((f11 - 0.1f) / 0.8f));
                    RadialGradient radialGradient = u3Var.f23829p;
                    Paint paint = u3Var.f23828o;
                    Paint paint2 = u3Var.f23831r;
                    f13 = lerp;
                    Matrix matrix2 = u3Var.f23830q;
                    l3 l3Var = u3Var.f23818c;
                    f15 = d;
                    Path path2 = u3Var.f23827n;
                    arrayList2 = arrayList;
                    Paint paint3 = u3Var.f23819e;
                    rectF2 = rectF;
                    RectF rectF7 = u3Var.f23826m;
                    i11 = i13;
                    Paint paint4 = u3Var.f23825l;
                    f16 = f21;
                    f14 = f20;
                    float clamp = Utilities.clamp(1.0f - ((Math.abs(u3Var.f23822i) - 0.3f) / 0.7f), 1.0f, 0.0f) * lerp2;
                    if (clamp > 0.0f) {
                        float f31 = f30 * 1.0f;
                        float lerp4 = AndroidUtilities.lerp(1.0f, 1.3f, f31);
                        float currentActionBarHeight = ((k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(50.0f)) * 0.0f;
                        canvas.save();
                        canvas.rotate(u3Var.f23822i * 20.0f, (u3Var.f23822i * AndroidUtilities.dp(50.0f)) + rectF6.centerX(), rectF6.bottom + AndroidUtilities.dp(350.0f));
                        float a2 = u3Var.f23824k.a(0.01f);
                        canvas.scale(a2, a2, rectF6.centerX(), rectF6.centerY());
                        float lerp5 = AndroidUtilities.lerp(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), f30);
                        if (z12) {
                            paint4.setColor(0);
                            paint4.setShadowLayer(AndroidUtilities.dp(30.0f), 0.0f, AndroidUtilities.dp(10.0f), f6.l1(clamp * f30 * 1.0f, 536870912));
                            canvas.drawRoundRect(rectF6, lerp5, lerp5, paint4);
                            paint3.setAlpha((int) (clamp * 255.0f));
                            canvas.drawRoundRect(rectF6, lerp5, lerp5, paint3);
                            canvas.restore();
                        } else {
                            path2.rewind();
                            path2.addRoundRect(rectF6, lerp5, lerp5, Path.Direction.CW);
                            canvas.save();
                            paint4.setColor(0);
                            paint4.setShadowLayer(AndroidUtilities.dp(30.0f), 0.0f, AndroidUtilities.dp(10.0f), f6.l1(clamp * f30 * 1.0f, 536870912));
                            canvas.drawPath(path2, paint4);
                            canvas.clipPath(path2);
                            float f32 = clamp * 255.0f * f30;
                            int i16 = (int) f32;
                            paint3.setAlpha(i16);
                            canvas.drawRoundRect(rectF6, lerp5, lerp5, paint3);
                            canvas.save();
                            canvas.translate(rectF6.left, aa.d.w(AndroidUtilities.dp(50.0f), lerp4, rectF6.top, currentActionBarHeight));
                            canvas.scale(1.0f, AndroidUtilities.lerp(1.0f, 1.25f, f31));
                            if (l3Var != null && l3Var.f23627k != null) {
                                float width3 = rectF6.width() / l3Var.f23627k.getWidth();
                                canvas.scale(width3, width3);
                                paint.setAlpha(i16);
                                canvas.drawBitmap(l3Var.f23627k, 0.0f, 0.0f, paint);
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
                            u3Var.d.v = f30;
                            canvas.scale(1.0f, lerp4, rectF7.centerX(), rectF7.top);
                            f17 = f24;
                            u3Var.d.a(canvas, rectF7, lerp5, clamp * clamp, lerp3);
                            canvas.restore();
                            canvas.restore();
                            canvas.restore();
                        }
                    }
                    f17 = f24;
                    canvas.restore();
                }
            }
            i15 = i9 + 1;
            dp = f17;
            lerp = f13;
            d = f15;
            arrayList = arrayList2;
            rectF = rectF2;
            i13 = i11;
            dp2 = f12;
            f21 = f16;
            min = i10;
            f20 = f14;
            v3Var = this;
        }
        float f33 = dp;
        float f34 = f20;
        canvas.save();
        if (this.f23863f0 == null) {
            this.f23863f0 = new s10();
        }
        RectF rectF8 = AndroidUtilities.rectTmp;
        rectF8.set(0.0f, 0.0f, f34, f33);
        this.f23863f0.b(canvas, rectF8, 1, this.R);
        canvas.restore();
        canvas.restore();
        if (this.f23858c0 == null) {
            this.f23858c0 = new nz0(LocaleController.getString(R.string.BotCloseAllTabs), 14.0f, AndroidUtilities.bold());
        }
        if (this.f23861e0 == null || this.f23859d0 != f6.I.q()) {
            boolean q10 = f6.I.q();
            this.f23859d0 = q10;
            if (q10) {
                this.f23861e0 = f6.i0(64, 64, 64, 64, 553648127, 872415231, 872415231);
            } else {
                this.f23861e0 = f6.i0(64, 64, 64, 64, 771751936, 1140850688, 1140850688);
            }
            this.f23861e0.setCallback(this);
        }
        float dp3 = this.f23858c0.f31223c + AndroidUtilities.dp(24.0f);
        float f35 = (f34 - dp3) / 2.0f;
        this.f23861e0.setBounds((int) f35, (int) ((f33 - (AndroidUtilities.dp(95.0f) / 2.0f)) - AndroidUtilities.dp(14.0f)), (int) ((f34 + dp3) / 2.0f), (int) ((f33 - (AndroidUtilities.dp(95.0f) / 2.0f)) + AndroidUtilities.dp(14.0f)));
        this.f23861e0.setAlpha((int) (this.R * 255.0f));
        this.f23861e0.draw(canvas);
        this.f23858c0.c(f35 + AndroidUtilities.dp(12.0f), f33 - (AndroidUtilities.dp(95.0f) / 2.0f), this.R, -1, canvas);
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
        float f10;
        int i9 = 0;
        float f11 = 0.0f;
        while (true) {
            ArrayList arrayList = this.N;
            if (i9 >= arrayList.size()) {
                break;
            }
            if (((u3) arrayList.get(i9)).d.f23529c >= 0) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            f11 += f10;
            i9++;
        }
        if (z10) {
            return this.f23862f.d(f11, false);
        }
        return f11;
    }

    public final void f() {
        float f10;
        j3 j3Var;
        m3 m3Var = this.f23853a;
        if (m3Var != null && (m3Var.getParent() instanceof View)) {
            HashSet hashSet = mh.c3.S0;
            if (!hashSet.isEmpty()) {
                Iterator it = new HashSet(hashSet).iterator();
                while (it.hasNext()) {
                    ((mh.c3) it.next()).k(true);
                }
                AndroidUtilities.runOnUIThread(new p(this, 11), 100L);
                return;
            }
            ValueAnimator valueAnimator = this.d;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.d = null;
            }
            View view = (View) this.f23853a.getParent();
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
            int i9 = iArr[0] - iArr2[0];
            int i10 = iArr[1] - iArr2[1];
            this.M.set(i9, iArr[1] - iArr2[1], this.O.getWidth() + i9, this.O.getHeight() + i10);
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
            if (f6.I.q()) {
                f10 = 0.08f;
            } else {
                f10 = 0.25f;
            }
            AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, f10);
            this.K.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            this.L = new Matrix();
            ArrayList arrayList = this.N;
            arrayList.clear();
            ArrayList<l3> tabs = this.f23853a.getTabs();
            ArrayList<j3> tabDrawables = this.f23853a.getTabDrawables();
            for (int size = tabs.size() - 1; size >= 0; size--) {
                l3 l3Var = tabs.get(size);
                int i11 = 0;
                while (true) {
                    if (i11 < tabDrawables.size()) {
                        j3Var = tabDrawables.get(i11);
                        if (j3Var.f23527a == l3Var) {
                            break;
                        }
                        i11++;
                    } else {
                        j3Var = null;
                        break;
                    }
                }
                if (j3Var != null) {
                    arrayList.add(new u3(this, l3Var, j3Var));
                }
            }
            this.f23862f.d(arrayList.size(), true);
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

    public final void h(float f10) {
        ValueAnimator valueAnimator = this.P;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.P = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.H, f10);
        this.P = ofFloat;
        ofFloat.addUpdateListener(new n3(this, 2));
        this.P.setDuration(250L);
        this.P.setInterpolator(gr.h);
        this.P.start();
    }

    public void setScrollOffset(float f10) {
        this.H = f10;
    }

    public void setTabsView(m3 m3Var) {
        this.f23853a = m3Var;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f23861e0 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public void setSlowerDismiss(boolean z10) {
    }
}
