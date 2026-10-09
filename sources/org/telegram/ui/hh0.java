package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
public final class hh0 extends org.telegram.ui.Components.i6 {
    public static final float[] S = {12.0f, 12.0f, 10.0f};
    public static final int[] T = {16, 8, 4};
    public int[] E;
    public int[] F;
    public int G;
    public final uz H;
    public boolean I;
    public final Paint J;
    public final o1.k K;
    public final o1.k L;
    public float M;
    public float N;
    public View O;
    public final HashSet P;
    public final me.b Q;
    public final ne.b R;
    public final org.telegram.ui.ActionBar.e6 f38332s;
    public int v;
    public float[] f38333w;
    public float[] f38334x;
    public int[] f38335y;

    public hh0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.H = new uz(this, 27);
        this.J = new Paint(1);
        new ArrayList();
        new ArrayList();
        o1.c cVar = o1.h.f16925s;
        o1.c cVar2 = o1.h.f16924r;
        o1.c cVar3 = o1.h.f16921o;
        o1.c cVar4 = o1.h.f16923q;
        new o1.l(1.0f);
        new ArrayList();
        new ArrayList();
        o1.c cVar5 = o1.h.f16922p;
        new o1.l(1.0f);
        o1.k kVar = new o1.k(this, new org.telegram.ui.Components.tb(1));
        this.K = kVar;
        o1.k kVar2 = new o1.k(this, new org.telegram.ui.Components.tb(2));
        this.L = kVar2;
        kVar.f16938u = org.telegram.ui.Cells.c1.j(1.0f, 1500.0f, 0.75f);
        o1.l lVar = new o1.l(1.0f);
        lVar.b(250.0f);
        lVar.a(0.25f);
        o1.l lVar2 = new o1.l(1.0f);
        lVar2.b(250.0f);
        lVar2.a(0.25f);
        o1.l lVar3 = new o1.l(1.0f);
        lVar3.b(1500.0f);
        lVar3.a(0.75f);
        kVar2.f16938u = lVar3;
        this.P = new HashSet();
        this.Q = new me.b(0, new gu(this, 21), org.telegram.ui.Components.hs.h, 380L, false);
        this.R = new ne.b(new g(this, 25));
        this.f38332s = e6Var;
    }

    public static void k(hh0 hh0Var, View view, float f7, float f10) {
        float f11;
        float f12;
        float width = view.getWidth();
        float height = view.getHeight();
        if (width > 0.0f && height > 0.0f) {
            float f13 = width * 0.5f;
            float f14 = height * 0.5f;
            float f15 = f7 - f13;
            float f16 = f10 - f14;
            float f17 = f15 / f13;
            float f18 = f16 / f14;
            float sqrt = (float) Math.sqrt((f18 * f18) + (f17 * f17));
            if (sqrt > 1.0E-4f) {
                float f19 = ((1.5f * sqrt) / (0.5f + sqrt)) / sqrt;
                f11 = (f15 * f19) + f13;
                f12 = (f16 * f19) + f14;
            } else {
                f11 = f13;
                f12 = f14;
            }
            float lerp = AndroidUtilities.lerp(f13, f11, 1.0f);
            float lerp2 = AndroidUtilities.lerp(f14, f12, 3.0f);
            view.setPivotX(lerp);
            view.setPivotY(lerp2);
        }
    }

    public static void m(hh0 hh0Var, float f7, boolean z10, boolean z11) {
        View view;
        boolean z12;
        o1.k kVar = hh0Var.L;
        float f10 = Float.MAX_VALUE;
        if (hh0Var.getChildCount() != 0) {
            float f11 = -3.4028235E38f;
            float f12 = Float.MAX_VALUE;
            boolean z13 = false;
            for (int i10 = 0; i10 < hh0Var.getChildCount(); i10++) {
                View childAt = hh0Var.getChildAt(i10);
                if (childAt != null && childAt.getVisibility() == 0) {
                    float width = (childAt.getWidth() * 0.5f) + childAt.getX();
                    if (width < f12) {
                        f12 = width;
                    }
                    if (width > f11) {
                        f11 = width;
                    }
                    z13 = true;
                }
            }
            if (z13) {
                if (f7 < f12) {
                    f7 = f12;
                } else if (f7 > f11) {
                    f7 = f11;
                }
            }
        }
        View view2 = null;
        if (hh0Var.getChildCount() == 0) {
            view = null;
        } else {
            view = null;
            for (int i11 = 0; i11 < hh0Var.getChildCount(); i11++) {
                View childAt2 = hh0Var.getChildAt(i11);
                if (childAt2 != null && childAt2.getVisibility() == 0) {
                    float abs = Math.abs(((childAt2.getWidth() * 0.5f) + childAt2.getX()) - f7);
                    if (abs < f10) {
                        view = childAt2;
                        f10 = abs;
                    }
                }
            }
        }
        if (z10) {
            int childCount = hh0Var.getChildCount();
            int i12 = 0;
            while (true) {
                if (i12 >= childCount) {
                    break;
                }
                View childAt3 = hh0Var.getChildAt(i12);
                if (childAt3.getVisibility() == 0 && (childAt3 instanceof oh.b) && ((oh.b) childAt3).h.f16338f) {
                    view2 = childAt3;
                    break;
                }
                i12++;
            }
            if (view2 != null) {
                float width2 = (view2.getWidth() / 2.0f) + view2.getX();
                hh0Var.M = width2;
                hh0Var.N = width2 - f7;
                hh0Var.K.g(0.0f);
                if (view2 != view && view != null) {
                    view.performClick();
                }
            }
            kVar.c();
        }
        if (!z11) {
            hh0Var.M = f7;
            hh0Var.invalidate();
        }
        if (view != null) {
            hh0Var.O = view;
            int childCount2 = hh0Var.getChildCount();
            for (int i13 = 0; i13 < childCount2; i13++) {
                View childAt4 = hh0Var.getChildAt(i13);
                if (childAt4 instanceof oh.b) {
                    oh.b bVar = (oh.b) childAt4;
                    if (childAt4 == view) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    bVar.e(z12, true);
                }
            }
            if (z11) {
                float width3 = view.getWidth();
                float x10 = (width3 / 2.0f) + view.getX();
                if (0.0f != width3 || 0.0f != x10) {
                    kVar.g(x10);
                }
            }
        }
    }

    public static float p(View view) {
        return (view.getWidth() * 0.5f) + view.getX();
    }

    public void setSkipDrawSelector(boolean z10) {
        this.I = z10;
        if (z10) {
            this.J.setColor(org.telegram.ui.ActionBar.i6.m1(0.09f, org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.al, this.f38332s)));
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (childAt instanceof oh.b)) {
                ((oh.b) childAt).setSkipDrawSelector(z10);
            }
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int width;
        if (this.I) {
            float f7 = this.M + this.N;
            float f10 = 0.0f;
            if (getChildCount() != 0) {
                View view = null;
                View view2 = null;
                for (int i10 = 0; i10 < getChildCount(); i10++) {
                    View childAt = getChildAt(i10);
                    if (childAt != null && childAt.getVisibility() == 0) {
                        float width2 = (childAt.getWidth() * 0.5f) + childAt.getX();
                        if (width2 <= f7 && (view == null || width2 > p(view))) {
                            view = childAt;
                        }
                        if (width2 >= f7 && (view2 == null || width2 < p(view2))) {
                            view2 = childAt;
                        }
                    }
                }
                if (view != null || view2 != null) {
                    if (view == null) {
                        width = view2.getWidth();
                    } else if (view2 == null) {
                        width = view.getWidth();
                    } else {
                        float p5 = p(view);
                        float p10 = p(view2);
                        if (view != view2 && p5 != p10) {
                            width = AndroidUtilities.lerp(view.getWidth(), view2.getWidth(), (f7 - p5) / (p10 - p5));
                        } else {
                            width = view.getWidth();
                        }
                    }
                    f10 = width;
                }
            }
            float height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            float f11 = f10 / 2.0f;
            float f12 = height / 2.0f;
            canvas2 = canvas;
            canvas2.drawRoundRect(f7 - f11, (getHeight() - height) / 2.0f, f7 + f11, (getHeight() + height) / 2.0f, f12, f12, this.J);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.R.a(motionEvent, this);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void e() {
        o();
    }

    @Override
    public final void f(View view, float f7) {
        float lerp = AndroidUtilities.lerp(0.7f, 1.0f, f7);
        view.setAlpha(f7);
        view.setScaleX(lerp);
        view.setScaleY(lerp);
    }

    public final void n() {
        int i10;
        if (Math.abs(getScaleX() - 1.0f) < 1.0E-4f && Math.abs(getScaleY() - 1.0f) < 1.0E-4f) {
            i10 = 0;
        } else {
            i10 = 2;
        }
        if (getLayerType() != i10) {
            setLayerType(i10, null);
            invalidate();
        }
    }

    public final void o() {
        int entriesCount = getEntriesCount();
        for (int i10 = 0; i10 < entriesCount; i10++) {
            me.g n10 = this.f27248c.n(i10);
            ((oh.b) ((org.telegram.ui.Components.h6) n10.f16348a).f26972a).setVisualWidth(n10.b().width());
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        o();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int[] iArr;
        float[] fArr;
        int i12;
        float f7;
        int i13;
        float f10;
        int i14;
        float f11;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
        int i15 = this.v;
        if (i15 > 0 && size > i15) {
            size = i15;
        }
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int min = Math.min(AndroidUtilities.dp(320.0f), paddingLeft);
        int i16 = 0;
        float f12 = -1.0f;
        while (true) {
            iArr = T;
            fArr = S;
            if (i16 < 3) {
                if (fArr[i16] != f12) {
                    int childCount = getChildCount();
                    float[] fArr2 = this.f38333w;
                    if (fArr2 == null || fArr2.length < childCount) {
                        this.f38333w = new float[childCount];
                        this.f38334x = new float[childCount];
                        this.f38335y = new int[childCount];
                        this.F = new int[childCount];
                        this.E = new int[childCount];
                    }
                    float f13 = 0.0f;
                    int i17 = 0;
                    for (int i18 = 0; i18 < childCount; i18++) {
                        View childAt = getChildAt(i18);
                        if (!d(childAt)) {
                            this.f38333w[i18] = -1.0f;
                        } else {
                            if (childAt instanceof gh0) {
                                oh.b bVar = (oh.b) ((gh0) childAt);
                                if (bVar.T == null) {
                                    bVar.T = new TextPaint(bVar.F);
                                }
                                bVar.T.setTextSize(AndroidUtilities.dp(f10));
                                f11 = bVar.T.measureText(bVar.f17139a.getText().toString());
                            } else {
                                f11 = 0.0f;
                            }
                            this.f38333w[i18] = f11;
                            f13 = Math.max(f13, f11);
                            i17++;
                        }
                    }
                    i12 = 0;
                    f7 = 0.0f;
                    i14 = 2;
                    Math.ceil(f13);
                    this.G = i17;
                    f12 = fArr[i16];
                } else {
                    i12 = 0;
                    f7 = 0.0f;
                    i14 = 2;
                }
                int dp = AndroidUtilities.dp(iArr[i16]);
                int childCount2 = getChildCount();
                float f14 = f7;
                for (int i19 = i12; i19 < childCount2; i19++) {
                    if (d(getChildAt(i19))) {
                        f14 += this.f38333w[i19] + (dp * 2);
                    }
                }
                if (f14 <= paddingLeft || i16 == i14) {
                    break;
                }
                i16++;
            } else {
                i12 = 0;
                f7 = 0.0f;
                i16 = 2;
                break;
            }
        }
        float f15 = fArr[i16];
        int childCount3 = getChildCount();
        for (int i20 = i12; i20 < childCount3; i20++) {
            View childAt2 = getChildAt(i20);
            if (childAt2 instanceof gh0) {
                ((oh.b) ((gh0) childAt2)).setTextSizeDp(f15);
            }
        }
        int dp2 = AndroidUtilities.dp(iArr[i16]) * 2;
        int max = (paddingLeft / Math.max(1, this.G)) - dp2;
        int childCount4 = getChildCount();
        int i21 = i12;
        int i22 = i21;
        float f16 = f7;
        while (i21 < childCount4) {
            if (!d(getChildAt(i21))) {
                float[] fArr3 = this.f38333w;
                this.f38334x[i21] = f7;
                fArr3[i21] = f7;
                this.f38335y[i21] = i12;
            } else {
                float[] fArr4 = this.f38334x;
                float f17 = this.f38333w[i21] + dp2;
                fArr4[i21] = f17;
                int[] iArr2 = this.f38335y;
                if (f17 > max + dp2) {
                    i13 = i12;
                } else {
                    i13 = 1;
                }
                iArr2[i21] = i13;
                f16 += f17;
                i22 += i13;
            }
            i21++;
        }
        if (i22 == 0) {
            int childCount5 = getChildCount();
            for (int i23 = i12; i23 < childCount5; i23++) {
                this.f38335y[i23] = d(getChildAt(i23)) ? 1 : 0;
            }
            i22 = this.G;
        }
        float f18 = paddingLeft;
        if (f16 > f18) {
            float f19 = f18 / f16;
            int childCount6 = getChildCount();
            for (int i24 = i12; i24 < childCount6; i24++) {
                float[] fArr5 = this.f38334x;
                fArr5[i24] = fArr5[i24] * f19;
            }
        } else {
            float f20 = min;
            if (f16 < f20) {
                float f21 = (f20 - f16) / i22;
                int childCount7 = getChildCount();
                for (int i25 = i12; i25 < childCount7; i25++) {
                    float[] fArr6 = this.f38334x;
                    fArr6[i25] = (this.f38335y[i25] * f21) + fArr6[i25];
                }
            }
        }
        int childCount8 = getChildCount();
        int i26 = i12;
        int i27 = i26;
        while (i26 < childCount8) {
            if (d(getChildAt(i26))) {
                this.E[i26] = Math.round(this.f38334x[i26]);
                this.F[i26] = i27;
                i27 += this.E[i26];
            }
            i26++;
        }
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + i27, size2);
        int childCount9 = getChildCount();
        for (int i28 = i12; i28 < childCount9; i28++) {
            getChildAt(i28).measure(View.MeasureSpec.makeMeasureSpec(this.E[i28], 1073741824), View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824));
        }
        a();
    }

    public void setMaxWidth(int i10) {
        if (this.v != i10) {
            this.v = i10;
            requestLayout();
        }
    }

    @Override
    public void setScaleX(float f7) {
        super.setScaleX(f7);
        n();
    }

    @Override
    public void setScaleY(float f7) {
        super.setScaleY(f7);
        n();
    }
}
