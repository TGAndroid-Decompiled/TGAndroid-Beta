package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.SharedConfig;

public class zu0 extends FrameLayout implements org.telegram.ui.ActionBar.x5 {

    public static DispatchQueue f35364q0;

    public static boolean f35365r0;
    public int A;
    public boolean B;
    public final org.telegram.ui.ActionBar.b5 C;
    public org.telegram.ui.ActionBar.p1 D;
    public int E;
    public boolean F;
    public kv0 G;
    public ag.s0 H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public vu0 M;
    public vu0 N;
    public final ArrayList O;
    public final ArrayList P;
    public final Matrix Q;
    public final Matrix R;
    public final Paint S;
    public final Paint T;
    public final Paint U;
    public final Paint V;
    public Paint W;

    public final Rect f35366a;

    public Paint f35367a0;

    public Drawable f35368b;

    public float f35369b0;

    public boolean f35370c;

    public ValueAnimator f35371c0;
    public Drawable d;

    public boolean f35372d0;

    public boolean f35373e;

    public int f35374e0;

    public int f35375f;

    public int f35376f0;

    public int f35377g0;
    public int h;

    public float f35378h0;

    public final androidx.activity.g f35379i0;

    public float f35380j0;

    public float f35381k0;

    public RenderNode[] f35382l0;
    public final boolean[] m0;

    public yu0 f35383n;

    public final boolean[] f35384n0;

    public final ArrayList f35385o0;

    public final ArrayList f35386p0;

    public final ArrayList f35387r;

    public boolean f35388s;
    public s71 v;

    public float f35389w;

    public float f35390x;

    public float f35391y;

    public zu0(Context context, org.telegram.ui.ActionBar.b5 b5Var) {
        super(context);
        this.f35366a = new Rect();
        this.f35387r = new ArrayList();
        this.f35388s = true;
        this.f35391y = 1.0f;
        this.B = true;
        this.O = new ArrayList(10);
        this.P = new ArrayList();
        this.Q = new Matrix();
        this.R = new Matrix();
        this.S = new Paint();
        this.T = new Paint();
        this.U = new Paint();
        this.V = new Paint();
        this.f35378h0 = 1.0f;
        this.f35379i0 = new androidx.activity.g(this);
        this.m0 = new boolean[2];
        this.f35384n0 = new boolean[2];
        this.f35385o0 = new ArrayList();
        this.f35386p0 = new ArrayList();
        setWillNotDraw(false);
        this.C = b5Var;
        this.D = null;
    }

    public static boolean F() {
        return Build.VERSION.SDK_INT >= 31 && SharedConfig.useNewBlur;
    }

    public static void G(zu0 zu0Var, Canvas canvas) {
        if (zu0Var.H != null && org.telegram.ui.ActionBar.g6.G1 && LiteMode.isEnabled(32)) {
            if (zu0Var.G == null) {
                kv0 kv0Var = new kv0(1);
                zu0Var.G = kv0Var;
                kv0Var.f30196g = -1;
                kv0Var.c();
            }
            zu0Var.G.b(canvas, zu0Var.H);
        }
    }

    public static float getBlurRadius() {
        int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
        if (devicePerformanceClass != 1) {
            return devicePerformanceClass != 2 ? 3.0f : 60.0f;
        }
        return 4.0f;
    }

    public static float getRenderNodeScale() {
        int iDp;
        int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
        if (devicePerformanceClass == 1) {
            iDp = AndroidUtilities.dp(12.0f);
        } else {
            if (devicePerformanceClass == 2) {
                return AndroidUtilities.density;
            }
            iDp = AndroidUtilities.dp(15.0f);
        }
        return iDp;
    }

    public final void I() {
        if (!this.f35373e && !this.f35370c) {
            s71 s71Var = this.v;
            if (s71Var != null) {
                s71Var.c(false);
                this.v = null;
                this.f35391y = 1.0f;
                this.f35389w = 0.0f;
                this.f35390x = 0.0f;
                return;
            }
            return;
        }
        if (this.v == null) {
            s71 s71Var2 = new s71(getContext());
            this.v = s71Var2;
            s71Var2.f32355n = new vu(this, 21);
            if (getMeasuredWidth() != 0 && getMeasuredHeight() != 0) {
                s71 s71Var3 = this.v;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                s71Var3.getClass();
                this.f35391y = s71.a(measuredWidth, measuredHeight);
            }
        }
        if (this.B) {
            return;
        }
        this.v.c(true);
    }

    public void J(Canvas canvas, float f10, Rect rect, Paint paint, boolean z10) {
        K(canvas, f10, rect, paint, z10, Color.alpha(org.telegram.ui.ActionBar.g6.v0((F() && SharedConfig.getDevicePerformanceClass() == 2) ? org.telegram.ui.ActionBar.g6.f23414xf : org.telegram.ui.ActionBar.g6.f23432yf, getResourceProvider())));
    }

    public final void K(Canvas canvas, float f10, Rect rect, Paint paint, boolean z10, int i10) {
        float f11;
        float f12;
        boolean z11;
        float f13;
        boolean z12;
        float translationY = f10;
        if (!SharedConfig.chatBlurEnabled()) {
            canvas.drawRect(rect, paint);
            return;
        }
        if (!F()) {
            if (this.M == null) {
                canvas.drawRect(rect, paint);
                return;
            }
            this.W = z10 ? this.S : this.U;
            this.f35367a0 = z10 ? this.T : this.V;
            if (z10) {
                translationY += getTranslationY();
            }
            if (this.W.getShader() != null) {
                Matrix matrix = this.Q;
                matrix.reset();
                Matrix matrix2 = this.R;
                matrix2.reset();
                if (z10) {
                    float f14 = -translationY;
                    matrix.setTranslate(0.0f, (f14 - this.M.f34057a) - 34.0f);
                    vu0 vu0Var = this.M;
                    matrix.preScale(vu0Var.d, vu0Var.f34060e);
                    vu0 vu0Var2 = this.N;
                    if (vu0Var2 != null) {
                        matrix2.setTranslate(0.0f, (f14 - vu0Var2.f34057a) - 34.0f);
                        vu0 vu0Var3 = this.N;
                        matrix2.preScale(vu0Var3.d, vu0Var3.f34060e);
                    }
                } else {
                    vu0 vu0Var4 = this.M;
                    vu0Var4.getClass();
                    float f15 = (-translationY) + 0.0f;
                    matrix.setTranslate(0.0f, ((f15 - vu0Var4.f34057a) - 34.0f) - (0.0f - (getListTranslationY() + getBottomOffset())));
                    this.M.getClass();
                    matrix.preScale(0.0f, 0.0f);
                    vu0 vu0Var5 = this.N;
                    if (vu0Var5 != null) {
                        matrix2.setTranslate(0.0f, ((f15 - vu0Var5.f34057a) - 34.0f) - (0.0f - (getListTranslationY() + getBottomOffset())));
                        this.N.getClass();
                        matrix2.preScale(0.0f, 0.0f);
                    }
                }
                this.W.getShader().setLocalMatrix(matrix);
                if (this.f35367a0.getShader() != null) {
                    this.f35367a0.getShader().setLocalMatrix(matrix);
                }
            }
            paint.setAlpha(255);
            if (this.f35369b0 == 1.0f || this.f35367a0.getShader() == null) {
                canvas.drawRect(rect, paint);
                canvas.drawRect(rect, this.W);
            } else {
                canvas.drawRect(rect, paint);
                canvas.drawRect(rect, this.f35367a0);
                canvas.saveLayerAlpha(rect.left, rect.top, rect.right, rect.bottom, (int) (this.f35369b0 * 255.0f), 31);
                canvas.drawRect(rect, paint);
                canvas.drawRect(rect, this.W);
                canvas.restore();
            }
            paint.setAlpha(i10);
            canvas.drawRect(rect, paint);
            return;
        }
        if (!canvas.isHardwareAccelerated()) {
            canvas.drawRect(rect, paint);
            return;
        }
        if (this.f35382l0 == null) {
            this.f35382l0 = new RenderNode[2];
        }
        float renderNodeScale = getRenderNodeScale();
        int i11 = !z10 ? 1 : 0;
        boolean[] zArr = this.f35384n0;
        if (!z10 && !zArr[i11] && Math.abs(getBottomOffset() - this.f35380j0) > 0.1f) {
            zArr[i11] = true;
        }
        int iDp = AndroidUtilities.dp(36.0f);
        if (i10 >= 255 || !zArr[i11]) {
            f11 = 255.0f;
            f12 = 1.0f;
            z11 = true;
        } else {
            boolean[] zArr2 = this.m0;
            if (zArr2[i11]) {
                f11 = 255.0f;
                f12 = 1.0f;
                z11 = true;
            } else {
                f11 = 255.0f;
                RenderNode[] renderNodeArr = this.f35382l0;
                if (renderNodeArr[i11] == null) {
                    f12 = 1.0f;
                    z11 = true;
                    renderNodeArr[i11] = new RenderNode("blurNode" + i11);
                    ColorMatrix colorMatrix = new ColorMatrix();
                    colorMatrix.setSaturation(2.0f);
                    this.f35382l0[i11].setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(getBlurRadiusInternal(), getBlurRadiusInternal(), Shader.TileMode.DECAL), RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix))));
                } else {
                    f12 = 1.0f;
                    z11 = true;
                }
                int measuredWidth = getMeasuredWidth();
                int iDp2 = AndroidUtilities.dp(100.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
                int i12 = 0;
                this.f35382l0[i11].setPosition(0, 0, (int) (measuredWidth / renderNodeScale), (int) (((iDp * 2) + iDp2) / renderNodeScale));
                RecordingCanvas recordingCanvasBeginRecording = this.f35382l0[i11].beginRecording();
                f35365r0 = z11;
                float f16 = f12 / renderNodeScale;
                recordingCanvasBeginRecording.scale(f16, f16);
                recordingCanvasBeginRecording.drawPaint(paint);
                recordingCanvasBeginRecording.translate(0.0f, iDp);
                if (!z10) {
                    float bottomOffset = getBottomOffset();
                    this.f35380j0 = bottomOffset;
                    float f17 = bottomOffset - iDp2;
                    this.f35381k0 = f17;
                    recordingCanvasBeginRecording.translate(0.0f, -f17);
                }
                if (O()) {
                    ArrayList arrayList = this.f35385o0;
                    arrayList.clear();
                    ArrayList arrayList2 = this.f35386p0;
                    arrayList.addAll(arrayList2);
                    arrayList2.clear();
                    L(recordingCanvasBeginRecording, arrayList2);
                    z12 = false;
                    for (int size = arrayList.size(); i12 < size; size = size) {
                        Object obj = arrayList.get(i12);
                        i12++;
                        ((wu0) obj).g(null);
                    }
                    int i13 = 0;
                    for (int size2 = arrayList2.size(); i13 < size2; size2 = size2) {
                        Object obj2 = arrayList2.get(i13);
                        i13++;
                        ((wu0) obj2).g(new up0(this, 7));
                    }
                } else {
                    L(recordingCanvasBeginRecording, null);
                    z12 = false;
                }
                f35365r0 = z12;
                this.f35382l0[i11].endRecording();
                zArr2[i11] = z11;
                zArr[i11] = z12;
            }
        }
        if (!O()) {
            zArr[i11] = z11;
            N();
        }
        canvas.save();
        canvas.drawRect(rect, paint);
        canvas.clipRect(rect);
        RenderNode renderNode = this.f35382l0[i11];
        if (renderNode != null && i10 < 255) {
            renderNode.setAlpha(f12 - (i10 / f11));
            if (z10) {
                f13 = 0.0f;
                canvas.translate(0.0f, (-translationY) - getTranslationY());
            } else {
                f13 = 0.0f;
                canvas.translate(0.0f, ((-translationY) + this.f35381k0) - (this.f35380j0 - (getListTranslationY() + getBottomOffset())));
            }
            canvas.translate(f13, -iDp);
            canvas.scale(renderNodeScale, renderNodeScale);
            canvas.drawRenderNode(this.f35382l0[i11]);
        }
        canvas.restore();
    }

    public void M() {
        if (SharedConfig.chatBlurEnabled()) {
            this.f35372d0 = true;
            if (!this.K || this.L) {
                return;
            }
            invalidate();
        }
    }

    public final void N() {
        boolean[] zArr = this.f35384n0;
        int i10 = 0;
        zArr[0] = true;
        zArr[1] = true;
        while (true) {
            ArrayList arrayList = this.P;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((View) arrayList.get(i10)).invalidate();
            i10++;
        }
    }

    public boolean O() {
        return this instanceof org.telegram.ui.jm;
    }

    public boolean P() {
        return !(this instanceof org.telegram.ui.eb);
    }

    public boolean Q() {
        return !(this instanceof org.telegram.ui.eb);
    }

    public int R() {
        View rootView = getRootView();
        Rect rect = this.f35366a;
        getWindowVisibleDisplayFrame(rect);
        if (rect.bottom == 0 && rect.top == 0) {
            return 0;
        }
        int iMax = Math.max(0, ((rootView.getHeight() - (rect.top != 0 ? AndroidUtilities.statusBarHeight : 0)) - AndroidUtilities.getViewInset(rootView)) - (rect.bottom - rect.top));
        this.f35375f = iMax;
        return iMax;
    }

    public void S() {
        if (this.v != null) {
            this.f35391y = s71.a(getMeasuredWidth(), getMeasuredHeight());
        }
        if (this.f35383n == null && this.f35387r.isEmpty()) {
            return;
        }
        this.f35375f = R();
        Point point = AndroidUtilities.displaySize;
        post(new f50(6, this, point.x > point.y));
    }

    public final void V(Drawable drawable) {
        if (this.f35368b == drawable) {
            return;
        }
        if (this.H == null) {
            ag.s0 s0Var = new ag.s0(this, getContext(), 23);
            this.H = s0Var;
            addView(s0Var, 0, h7.z5.c(-1.0f, -1));
        }
        if (drawable instanceof nb0) {
            ((nb0) drawable).r(this.H);
        }
        if (this.I) {
            Drawable drawable2 = this.f35368b;
            if (drawable2 instanceof org.telegram.ui.un) {
                ((org.telegram.ui.un) drawable2).g(this.H);
            }
        }
        this.f35368b = drawable;
        if (this.I && (drawable instanceof org.telegram.ui.un)) {
            ((org.telegram.ui.un) drawable).f(this.H);
        }
        if (this.I) {
            Drawable drawable3 = this.f35368b;
            if (drawable3 instanceof nb0) {
                ((nb0) drawable3).l();
            }
        }
        if (this.I) {
            Drawable drawable4 = this.f35368b;
            if (drawable4 instanceof nb0) {
                ((nb0) drawable4).k();
            }
        }
        U(this.f35368b);
        I();
        this.H.invalidate();
    }

    public final void W() {
        if (!this.K || this.L || !this.f35372d0 || !SharedConfig.chatBlurEnabled() || F() || Color.alpha(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23432yf, false)) == 255) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int iDp = AndroidUtilities.dp(100.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
        if (measuredWidth == 0 || iDp == 0) {
            return;
        }
        this.f35372d0 = false;
        this.L = true;
        float f10 = iDp;
        int i10 = ((int) (f10 / 12.0f)) + 34;
        float f11 = measuredWidth;
        int i11 = (int) (f11 / 12.0f);
        System.currentTimeMillis();
        ArrayList arrayList = this.O;
        vu0 vu0Var = arrayList.size() > 0 ? (vu0) com.google.android.recaptcha.internal.a.k(1, arrayList) : null;
        if (vu0Var == null) {
            vu0Var = new vu0();
            vu0Var.f34059c = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
            vu0Var.f34058b = new xu0(vu0Var.f34059c);
        } else {
            vu0Var.f34059c.eraseColor(0);
        }
        float width = vu0Var.f34059c.getWidth() / f11;
        float height = (vu0Var.f34059c.getHeight() - 34) / f10;
        int iSave = vu0Var.f34058b.save();
        vu0Var.f34057a = getScrollOffset() % 24;
        float f12 = 10.0f * height;
        vu0Var.f34058b.clipRect(1.0f, f12, vu0Var.f34059c.getWidth(), vu0Var.f34059c.getHeight() - 1);
        vu0Var.f34058b.scale(width, height);
        vu0Var.f34058b.translate(0.0f, f12 + vu0Var.f34057a);
        vu0Var.d = 1.0f / width;
        vu0Var.f34060e = 1.0f / height;
        L(vu0Var.f34058b, null);
        try {
            vu0Var.f34058b.restoreToCount(iSave);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        System.currentTimeMillis();
        int i12 = this.f35377g0 + 1;
        this.f35377g0 = i12;
        if (i12 >= 20) {
            this.f35377g0 = 0;
        }
        if (f35364q0 == null) {
            f35364q0 = new DispatchQueue("BlurQueue");
        }
        int iMax = (int) (((int) (Math.max(6, Math.max(iDp, measuredWidth) / 180) * 2.5f)) * org.telegram.ui.j5.d);
        androidx.activity.g gVar = this.f35379i0;
        gVar.f874b = iMax;
        gVar.d = vu0Var;
        f35364q0.postRunnable(gVar);
    }

    public void X() {
        if (F()) {
            N();
        }
    }

    public boolean Y() {
        return !(this instanceof gh.g6);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        boolean[] zArr = this.m0;
        zArr[0] = false;
        zArr[1] = false;
        if (this.K) {
            W();
        }
        super.dispatchDraw(canvas);
    }

    public Drawable getBackgroundImage() {
        return this.f35368b;
    }

    public int getBackgroundSizeY() {
        return getMeasuredHeight() - (this.f35368b instanceof org.telegram.ui.un ? this.A : 0);
    }

    public int getBackgroundTranslationY() {
        Drawable drawable = this.f35368b;
        if (drawable instanceof nb0) {
            return this.A;
        }
        if (drawable instanceof org.telegram.ui.un) {
            return this.A;
        }
        return 0;
    }

    public float getBlurRadiusInternal() {
        return getBlurRadius();
    }

    public float getBottomOffset() {
        return getMeasuredHeight();
    }

    public int getBottomPadding() {
        return 0;
    }

    public float getBottomTranslation() {
        return 0.0f;
    }

    public int[] getColorKeys() {
        return null;
    }

    public int getHeightWithKeyboard() {
        return getMeasuredHeight() + this.f35375f;
    }

    public int getKeyboardHeight() {
        return this.f35375f;
    }

    public float getListTranslationY() {
        return 0.0f;
    }

    public Drawable getNewDrawable() {
        return org.telegram.ui.ActionBar.g6.s0();
    }

    public boolean getNewDrawableMotion() {
        return org.telegram.ui.ActionBar.g6.f23138i0;
    }

    public org.telegram.ui.ActionBar.c6 getResourceProvider() {
        return null;
    }

    public int getScrollOffset() {
        return 0;
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.I = true;
        if (this.J && !this.K) {
            this.K = true;
            this.f35372d0 = true;
        }
        Drawable drawable = this.f35368b;
        if (drawable instanceof org.telegram.ui.un) {
            ((org.telegram.ui.un) drawable).f(this.H);
        }
        Drawable drawable2 = this.f35368b;
        if (drawable2 instanceof nb0) {
            ((nb0) drawable2).k();
        }
        Drawable drawable3 = this.d;
        if (drawable3 instanceof org.telegram.ui.un) {
            ((org.telegram.ui.un) drawable3).f(this.H);
        }
        Drawable drawable4 = this.d;
        if (drawable4 instanceof nb0) {
            ((nb0) drawable4).k();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        ArrayList arrayList;
        super.onDetachedFromWindow();
        this.I = false;
        this.S.setShader(null);
        this.T.setShader(null);
        this.U.setShader(null);
        this.V.setShader(null);
        ValueAnimator valueAnimator = this.f35371c0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        vu0 vu0Var = this.M;
        if (vu0Var != null) {
            vu0Var.f34059c.recycle();
            this.M = null;
        }
        int i10 = 0;
        while (true) {
            arrayList = this.O;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((vu0) arrayList.get(i10)).f34059c.recycle();
            }
            i10++;
        }
        arrayList.clear();
        this.K = false;
        Drawable drawable = this.f35368b;
        if (drawable instanceof org.telegram.ui.un) {
            ((org.telegram.ui.un) drawable).g(this.H);
        }
        Drawable drawable2 = this.d;
        if (drawable2 instanceof org.telegram.ui.un) {
            ((org.telegram.ui.un) drawable2).g(this.H);
        }
        Drawable drawable3 = this.f35368b;
        if (drawable3 instanceof nb0) {
            ((nb0) drawable3).l();
        }
        Drawable drawable4 = this.d;
        if (drawable4 instanceof nb0) {
            ((nb0) drawable4).l();
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        S();
    }

    public void setBackgroundTranslation(int i10) {
        if (i10 != this.A) {
            this.A = i10;
            ag.s0 s0Var = this.H;
            if (s0Var != null) {
                s0Var.invalidate();
            }
        }
    }

    public void setBottomClip(int i10) {
        if (i10 != this.h) {
            this.h = i10;
            ag.s0 s0Var = this.H;
            if (s0Var != null) {
                s0Var.invalidate();
            }
        }
    }

    public void setDelegate(yu0 yu0Var) {
        this.f35383n = yu0Var;
    }

    public void setEmojiKeyboardHeight(int i10) {
        if (this.E != i10) {
            this.E = i10;
            ag.s0 s0Var = this.H;
            if (s0Var != null) {
                s0Var.invalidate();
            }
        }
    }

    public void setOccupyStatusBar(boolean z10) {
        this.f35388s = z10;
    }

    public void setSkipBackgroundDrawing(boolean z10) {
        if (this.F != z10) {
            this.F = z10;
            ag.s0 s0Var = this.H;
            if (s0Var != null) {
                s0Var.invalidate();
            }
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == getBackgroundImage() || super.verifyDrawable(drawable);
    }

    public void T() {
    }

    public void U(Drawable drawable) {
    }

    public void d() {
    }

    public void L(Canvas canvas, ArrayList arrayList) {
    }
}
