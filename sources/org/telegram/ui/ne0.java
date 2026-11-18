package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
public final class ne0 extends org.telegram.ui.Components.e6 implements org.telegram.ui.Components.v60 {
    public static final float[] T = {12.0f, 12.0f, 10.0f};
    public static final int[] U = {16, 8, 4};
    public int[] E;
    public int[] F;
    public int[] G;
    public int H;
    public final lz I;
    public boolean J;
    public final Paint K;
    public final r1.g L;
    public final r1.g M;
    public float N;
    public float O;
    public View P;
    public final HashSet Q;
    public final te.a R;
    public final org.telegram.ui.Cells.l9 S;
    public final org.telegram.ui.ActionBar.i6 f50165s;
    public int f50166w;
    public float[] f50167x;
    public float[] f50168y;

    public ne0(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.I = new lz(this, 29);
        this.K = new Paint(1);
        new ArrayList();
        new ArrayList();
        r1.b bVar = r1.g.f56312u;
        r1.b bVar2 = r1.g.f56311t;
        r1.b bVar3 = r1.g.f56308q;
        r1.b bVar4 = r1.g.f56310s;
        new r1.h(1.0f);
        new ArrayList();
        new ArrayList();
        r1.b bVar5 = r1.g.f56309r;
        new r1.h(1.0f);
        r1.g gVar = new r1.g(this, new org.telegram.ui.Components.hb(1));
        this.L = gVar;
        r1.g gVar2 = new r1.g(this, new org.telegram.ui.Components.hb(2));
        this.M = gVar2;
        gVar.f56323m = org.telegram.ui.Cells.c0.p(1.0f, 1500.0f, 0.75f);
        r1.h hVar = new r1.h(1.0f);
        hVar.b(250.0f);
        hVar.a(0.25f);
        r1.h hVar2 = new r1.h(1.0f);
        hVar2.b(250.0f);
        hVar2.a(0.25f);
        r1.h hVar3 = new r1.h(1.0f);
        hVar3.b(1500.0f);
        hVar3.a(0.75f);
        gVar2.f56323m = hVar3;
        this.Q = new HashSet();
        this.R = new te.a(0, new zr(this, 22), org.telegram.ui.Components.lr.h, 380L, false);
        this.S = new org.telegram.ui.Cells.l9(new f(this, 24));
        this.f50165s = i6Var;
    }

    public static void l(ne0 ne0Var, View view, float f10, float f11) {
        float f12;
        float f13;
        float width = view.getWidth();
        float height = view.getHeight();
        if (width > 0.0f && height > 0.0f) {
            float f14 = width * 0.5f;
            float f15 = height * 0.5f;
            float f16 = f10 - f14;
            float f17 = f11 - f15;
            float f18 = f16 / f14;
            float f19 = f17 / f15;
            float sqrt = (float) Math.sqrt((f19 * f19) + (f18 * f18));
            if (sqrt > 1.0E-4f) {
                float f20 = ((1.5f * sqrt) / (0.5f + sqrt)) / sqrt;
                f12 = (f16 * f20) + f14;
                f13 = (f17 * f20) + f15;
            } else {
                f12 = f14;
                f13 = f15;
            }
            float T1 = org.telegram.messenger.g0.T1(f14, f12, 1.0f);
            float T12 = org.telegram.messenger.g0.T1(f15, f13, 3.0f);
            view.setPivotX(T1);
            view.setPivotY(T12);
        }
    }

    public static void m(ne0 ne0Var) {
        ne0Var.setSkipDrawSelector(true);
    }

    public static void n(ne0 ne0Var, float f10, boolean z10, boolean z11) {
        View view;
        r1.g gVar = ne0Var.M;
        float f11 = Float.MAX_VALUE;
        int i7 = 0;
        if (ne0Var.getChildCount() != 0) {
            float f12 = -3.4028235E38f;
            float f13 = Float.MAX_VALUE;
            boolean z12 = false;
            for (int i10 = 0; i10 < ne0Var.getChildCount(); i10++) {
                View childAt = ne0Var.getChildAt(i10);
                if (childAt != null && childAt.getVisibility() == 0) {
                    float width = (childAt.getWidth() * 0.5f) + childAt.getX();
                    if (width < f13) {
                        f13 = width;
                    }
                    if (width > f12) {
                        f12 = width;
                    }
                    z12 = true;
                }
            }
            if (z12) {
                if (f10 < f13) {
                    f10 = f13;
                } else if (f10 > f12) {
                    f10 = f12;
                }
            }
        }
        View view2 = null;
        if (ne0Var.getChildCount() == 0) {
            view = null;
        } else {
            view = null;
            for (int i11 = 0; i11 < ne0Var.getChildCount(); i11++) {
                View childAt2 = ne0Var.getChildAt(i11);
                if (childAt2 != null && childAt2.getVisibility() == 0) {
                    float abs = Math.abs(((childAt2.getWidth() * 0.5f) + childAt2.getX()) - f10);
                    if (abs < f11) {
                        view = childAt2;
                        f11 = abs;
                    }
                }
            }
        }
        if (z10) {
            int childCount = ne0Var.getChildCount();
            while (true) {
                if (i7 >= childCount) {
                    break;
                }
                View childAt3 = ne0Var.getChildAt(i7);
                if (childAt3.getVisibility() == 0 && (childAt3 instanceof qh.b) && ((qh.b) childAt3).h.f57658f) {
                    view2 = childAt3;
                    break;
                }
                i7++;
            }
            if (view2 != null) {
                float width2 = (view2.getWidth() / 2.0f) + view2.getX();
                ne0Var.N = width2;
                ne0Var.O = width2 - f10;
                ne0Var.L.c(0.0f);
                if (view2 != view && view != null) {
                    view.performClick();
                }
            }
            gVar.d();
        }
        if (!z11) {
            ne0Var.N = f10;
            ne0Var.invalidate();
        }
        if (view != null) {
            ne0Var.P = view;
            ne0Var.r(view, true);
            if (z11) {
                float width3 = view.getWidth();
                float x10 = (width3 / 2.0f) + view.getX();
                if (0.0f != width3 || 0.0f != x10) {
                    gVar.c(x10);
                }
            }
        }
    }

    public static float q(View view) {
        return (view.getWidth() * 0.5f) + view.getX();
    }

    public void setSkipDrawSelector(boolean z10) {
        this.J = z10;
        if (z10) {
            this.K.setColor(org.telegram.ui.ActionBar.n6.r1(0.09f, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Rl, this.f50165s)));
        }
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() == 0 && (childAt instanceof qh.b)) {
                ((qh.b) childAt).setSkipDrawSelector(z10);
            }
        }
        invalidate();
    }

    @Override
    public final void c(org.telegram.ui.Components.t60 t60Var) {
        if (getBackground() instanceof fh.g) {
            t60Var.a(((fh.g) getBackground()).R.f11647k);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int width;
        if (this.J) {
            float f10 = this.N + this.O;
            float f11 = 0.0f;
            if (getChildCount() != 0) {
                View view = null;
                View view2 = null;
                for (int i7 = 0; i7 < getChildCount(); i7++) {
                    View childAt = getChildAt(i7);
                    if (childAt != null && childAt.getVisibility() == 0) {
                        float width2 = (childAt.getWidth() * 0.5f) + childAt.getX();
                        if (width2 <= f10 && (view == null || width2 > q(view))) {
                            view = childAt;
                        }
                        if (width2 >= f10 && (view2 == null || width2 < q(view2))) {
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
                        float q10 = q(view);
                        float q11 = q(view2);
                        if (view != view2 && q10 != q11) {
                            width = org.telegram.messenger.g0.W1((f10 - q10) / (q11 - q10), view.getWidth(), view2.getWidth());
                        } else {
                            width = view.getWidth();
                        }
                    }
                    f11 = width;
                }
            }
            float height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            float f12 = f11 / 2.0f;
            float f13 = height / 2.0f;
            canvas2 = canvas;
            canvas2.drawRoundRect(f10 - f12, (getHeight() - height) / 2.0f, f10 + f12, (getHeight() + height) / 2.0f, f13, f13, this.K);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.S.a(this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void f() {
        p();
    }

    @Override
    public final void g(View view, float f10) {
        float T1 = org.telegram.messenger.g0.T1(0.7f, 1.0f, f10);
        view.setAlpha(f10);
        view.setScaleX(T1);
        view.setScaleY(T1);
    }

    public final void o() {
        int i7;
        if (Math.abs(getScaleX() - 1.0f) < 1.0E-4f && Math.abs(getScaleY() - 1.0f) < 1.0E-4f) {
            i7 = 0;
        } else {
            i7 = 2;
        }
        if (getLayerType() != i7) {
            setLayerType(i7, null);
            invalidate();
        }
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        p();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int[] iArr;
        float[] fArr;
        int i11;
        float f10;
        int i12;
        float f11;
        int i13;
        float f12;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
        int i14 = this.f50166w;
        if (i14 > 0 && size > i14) {
            size = i14;
        }
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int min = Math.min(org.telegram.messenger.g0.L(320.0f), paddingLeft);
        int i15 = 0;
        float f13 = -1.0f;
        while (true) {
            iArr = U;
            fArr = T;
            if (i15 < 3) {
                if (fArr[i15] != f13) {
                    int childCount = getChildCount();
                    float[] fArr2 = this.f50167x;
                    if (fArr2 == null || fArr2.length < childCount) {
                        this.f50167x = new float[childCount];
                        this.f50168y = new float[childCount];
                        this.E = new int[childCount];
                        this.G = new int[childCount];
                        this.F = new int[childCount];
                    }
                    float f14 = 0.0f;
                    int i16 = 0;
                    for (int i17 = 0; i17 < childCount; i17++) {
                        View childAt = getChildAt(i17);
                        if (!e(childAt)) {
                            this.f50167x[i17] = -1.0f;
                        } else {
                            if (childAt instanceof me0) {
                                qh.b bVar = (qh.b) ((me0) childAt);
                                if (bVar.U == null) {
                                    bVar.U = new TextPaint(bVar.G);
                                }
                                bVar.U.setTextSize(org.telegram.messenger.g0.L(f11));
                                f12 = bVar.U.measureText(bVar.f56156a.getText().toString());
                            } else {
                                f12 = 0.0f;
                            }
                            this.f50167x[i17] = f12;
                            f14 = Math.max(f14, f12);
                            i16++;
                        }
                    }
                    i11 = 0;
                    f10 = 0.0f;
                    i13 = 2;
                    Math.ceil(f14);
                    this.H = i16;
                    f13 = fArr[i15];
                } else {
                    i11 = 0;
                    f10 = 0.0f;
                    i13 = 2;
                }
                int L = org.telegram.messenger.g0.L(iArr[i15]);
                int childCount2 = getChildCount();
                float f15 = f10;
                for (int i18 = i11; i18 < childCount2; i18++) {
                    if (e(getChildAt(i18))) {
                        f15 += this.f50167x[i18] + (L * 2);
                    }
                }
                if (f15 <= paddingLeft || i15 == i13) {
                    break;
                }
                i15++;
            } else {
                i11 = 0;
                f10 = 0.0f;
                i15 = 2;
                break;
            }
        }
        float f16 = fArr[i15];
        int childCount3 = getChildCount();
        for (int i19 = i11; i19 < childCount3; i19++) {
            View childAt2 = getChildAt(i19);
            if (childAt2 instanceof me0) {
                ((qh.b) ((me0) childAt2)).setTextSizeDp(f16);
            }
        }
        int L2 = org.telegram.messenger.g0.L(iArr[i15]) * 2;
        int max = (paddingLeft / Math.max(1, this.H)) - L2;
        int childCount4 = getChildCount();
        int i20 = i11;
        int i21 = i20;
        float f17 = f10;
        while (i20 < childCount4) {
            if (!e(getChildAt(i20))) {
                float[] fArr3 = this.f50167x;
                this.f50168y[i20] = f10;
                fArr3[i20] = f10;
                this.E[i20] = i11;
            } else {
                float[] fArr4 = this.f50168y;
                float f18 = this.f50167x[i20] + L2;
                fArr4[i20] = f18;
                int[] iArr2 = this.E;
                if (f18 > max + L2) {
                    i12 = i11;
                } else {
                    i12 = 1;
                }
                iArr2[i20] = i12;
                f17 += f18;
                i21 += i12;
            }
            i20++;
        }
        if (i21 == 0) {
            int childCount5 = getChildCount();
            for (int i22 = i11; i22 < childCount5; i22++) {
                this.E[i22] = e(getChildAt(i22)) ? 1 : 0;
            }
            i21 = this.H;
        }
        float f19 = paddingLeft;
        if (f17 > f19) {
            float f20 = f19 / f17;
            int childCount6 = getChildCount();
            for (int i23 = i11; i23 < childCount6; i23++) {
                float[] fArr5 = this.f50168y;
                fArr5[i23] = fArr5[i23] * f20;
            }
        } else {
            float f21 = min;
            if (f17 < f21) {
                float f22 = (f21 - f17) / i21;
                int childCount7 = getChildCount();
                for (int i24 = i11; i24 < childCount7; i24++) {
                    float[] fArr6 = this.f50168y;
                    fArr6[i24] = (this.E[i24] * f22) + fArr6[i24];
                }
            }
        }
        int childCount8 = getChildCount();
        int i25 = i11;
        int i26 = i25;
        while (i25 < childCount8) {
            if (e(getChildAt(i25))) {
                this.F[i25] = Math.round(this.f50168y[i25]);
                this.G[i25] = i26;
                i26 += this.F[i25];
            }
            i25++;
        }
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + i26, size2);
        int childCount9 = getChildCount();
        for (int i27 = i11; i27 < childCount9; i27++) {
            getChildAt(i27).measure(View.MeasureSpec.makeMeasureSpec(this.F[i27], 1073741824), View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824));
        }
        a();
    }

    public final void p() {
        int entriesCount = getEntriesCount();
        for (int i7 = 0; i7 < entriesCount; i7++) {
            te.e i10 = this.f34616c.i(i7);
            ((qh.b) ((org.telegram.ui.Components.d6) i10.f57666a).f34281a).setVisualWidth(i10.b().width());
        }
    }

    public final void r(View view, boolean z10) {
        boolean z11;
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof qh.b) {
                qh.b bVar = (qh.b) childAt;
                if (childAt == view) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                bVar.f(z11, z10);
            }
        }
    }

    public void setMaxWidth(int i7) {
        if (this.f50166w != i7) {
            this.f50166w = i7;
            requestLayout();
        }
    }

    @Override
    public void setScaleX(float f10) {
        super.setScaleX(f10);
        o();
    }

    @Override
    public void setScaleY(float f10) {
        super.setScaleY(f10);
        o();
    }
}
