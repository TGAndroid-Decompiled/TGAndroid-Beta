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
public final class pg0 extends org.telegram.ui.Components.f6 {
    public static final float[] O = {12.0f, 12.0f, 10.0f};
    public static final int[] P = {16, 8, 4};
    public int[] A;
    public int[] B;
    public int C;
    public final q00 D;
    public boolean E;
    public final Paint F;
    public final o1.k G;
    public final o1.k H;
    public float I;
    public float J;
    public View K;
    public final HashSet L;
    public final vd.a M;
    public final wd.b N;
    public final org.telegram.ui.ActionBar.c6 f41407s;
    public int v;
    public float[] f41408w;
    public float[] f41409x;
    public int[] f41410y;

    public pg0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.D = new q00(this, 26);
        this.F = new Paint(1);
        new ArrayList();
        new ArrayList();
        o1.d dVar = o1.i.f19033s;
        o1.d dVar2 = o1.i.f19032r;
        o1.d dVar3 = o1.i.f19029o;
        o1.d dVar4 = o1.i.f19031q;
        new o1.l(1.0f);
        new ArrayList();
        new ArrayList();
        o1.d dVar5 = o1.i.f19030p;
        new o1.l(1.0f);
        o1.k kVar = new o1.k(this, new org.telegram.ui.Components.mb(1));
        this.G = kVar;
        o1.k kVar2 = new o1.k(this, new org.telegram.ui.Components.mb(2));
        this.H = kVar2;
        kVar.f19045u = th.l(1.0f, 1500.0f, 0.75f);
        o1.l lVar = new o1.l(1.0f);
        lVar.b(250.0f);
        lVar.a(0.25f);
        o1.l lVar2 = new o1.l(1.0f);
        lVar2.b(250.0f);
        lVar2.a(0.25f);
        o1.l lVar3 = new o1.l(1.0f);
        lVar3.b(1500.0f);
        lVar3.a(0.75f);
        kVar2.f19045u = lVar3;
        this.L = new HashSet();
        this.M = new vd.a(0, new xt(this, 22), org.telegram.ui.Components.jr.h, 380L, false);
        this.N = new wd.b(new h(this, 25));
        this.f41407s = c6Var;
    }

    public static void k(pg0 pg0Var, View view, float f9, float f10) {
        float f11;
        float f12;
        float width = view.getWidth();
        float height = view.getHeight();
        if (width > 0.0f && height > 0.0f) {
            float f13 = width * 0.5f;
            float f14 = height * 0.5f;
            float f15 = f9 - f13;
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

    public static void m(pg0 pg0Var, float f9, boolean z10, boolean z11) {
        View view;
        boolean z12;
        o1.k kVar = pg0Var.H;
        float f10 = Float.MAX_VALUE;
        if (pg0Var.getChildCount() != 0) {
            float f11 = -3.4028235E38f;
            boolean z13 = false;
            float f12 = Float.MAX_VALUE;
            for (int i10 = 0; i10 < pg0Var.getChildCount(); i10++) {
                View childAt = pg0Var.getChildAt(i10);
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
                if (f9 < f12) {
                    f9 = f12;
                } else if (f9 > f11) {
                    f9 = f11;
                }
            }
        }
        View view2 = null;
        if (pg0Var.getChildCount() == 0) {
            view = null;
        } else {
            view = null;
            for (int i11 = 0; i11 < pg0Var.getChildCount(); i11++) {
                View childAt2 = pg0Var.getChildAt(i11);
                if (childAt2 != null && childAt2.getVisibility() == 0) {
                    float abs = Math.abs(((childAt2.getWidth() * 0.5f) + childAt2.getX()) - f9);
                    if (abs < f10) {
                        view = childAt2;
                        f10 = abs;
                    }
                }
            }
        }
        if (z10) {
            int childCount = pg0Var.getChildCount();
            int i12 = 0;
            while (true) {
                if (i12 >= childCount) {
                    break;
                }
                View childAt3 = pg0Var.getChildAt(i12);
                if (childAt3.getVisibility() == 0 && (childAt3 instanceof zg.b) && ((zg.b) childAt3).h.f49506f) {
                    view2 = childAt3;
                    break;
                }
                i12++;
            }
            if (view2 != null) {
                float width2 = (view2.getWidth() / 2.0f) + view2.getX();
                pg0Var.I = width2;
                pg0Var.J = width2 - f9;
                o1.k kVar2 = pg0Var.G;
                if (kVar2.f19039f) {
                    kVar2.v = 0.0f;
                } else {
                    if (kVar2.f19045u == null) {
                        kVar2.f19045u = new o1.l(0.0f);
                    }
                    kVar2.f19045u.f19052i = 0.0f;
                    kVar2.f();
                }
                if (view2 != view && view != null) {
                    view.performClick();
                }
            }
            kVar.c();
        }
        if (!z11) {
            pg0Var.I = f9;
            pg0Var.invalidate();
        }
        if (view != null) {
            pg0Var.K = view;
            int childCount2 = pg0Var.getChildCount();
            for (int i13 = 0; i13 < childCount2; i13++) {
                View childAt4 = pg0Var.getChildAt(i13);
                if (childAt4 instanceof zg.b) {
                    zg.b bVar = (zg.b) childAt4;
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
                float x4 = (width3 / 2.0f) + view.getX();
                if (0.0f != width3 || 0.0f != x4) {
                    if (kVar.f19039f) {
                        kVar.v = x4;
                        return;
                    }
                    if (kVar.f19045u == null) {
                        kVar.f19045u = new o1.l(x4);
                    }
                    kVar.f19045u.f19052i = x4;
                    kVar.f();
                }
            }
        }
    }

    public static float p(View view) {
        return (view.getWidth() * 0.5f) + view.getX();
    }

    public void setSkipDrawSelector(boolean z10) {
        this.E = z10;
        if (z10) {
            this.F.setColor(org.telegram.ui.ActionBar.g6.l1(0.09f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.al, this.f41407s)));
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (childAt instanceof zg.b)) {
                ((zg.b) childAt).setSkipDrawSelector(z10);
            }
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int width;
        if (this.E) {
            float f9 = this.I + this.J;
            float f10 = 0.0f;
            if (getChildCount() != 0) {
                View view = null;
                View view2 = null;
                for (int i10 = 0; i10 < getChildCount(); i10++) {
                    View childAt = getChildAt(i10);
                    if (childAt != null && childAt.getVisibility() == 0) {
                        float width2 = (childAt.getWidth() * 0.5f) + childAt.getX();
                        if (width2 <= f9 && (view == null || width2 > p(view))) {
                            view = childAt;
                        }
                        if (width2 >= f9 && (view2 == null || width2 < p(view2))) {
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
                        float p10 = p(view);
                        float p11 = p(view2);
                        if (view != view2 && p10 != p11) {
                            width = AndroidUtilities.lerp(view.getWidth(), view2.getWidth(), (f9 - p10) / (p11 - p10));
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
            canvas2.drawRoundRect(f9 - f11, (getHeight() - height) / 2.0f, f9 + f11, (getHeight() + height) / 2.0f, f12, f12, this.F);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.N.a(motionEvent, this);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void e() {
        o();
    }

    @Override
    public final void f(View view, float f9) {
        float lerp = AndroidUtilities.lerp(0.7f, 1.0f, f9);
        view.setAlpha(f9);
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
            vd.f n10 = this.f28322c.n(i10);
            ((zg.b) ((org.telegram.ui.Components.e6) n10.f49514a).f27932a).setVisualWidth(n10.b().width());
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
        float f9;
        int i13;
        float f10;
        float f11;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
        int i14 = this.v;
        if (i14 > 0 && size > i14) {
            size = i14;
        }
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int min = Math.min(AndroidUtilities.dp(320.0f), paddingLeft);
        int i15 = 0;
        float f12 = -1.0f;
        while (true) {
            iArr = P;
            fArr = O;
            if (i15 < 3) {
                if (fArr[i15] != f12) {
                    int childCount = getChildCount();
                    float[] fArr2 = this.f41408w;
                    if (fArr2 == null || fArr2.length < childCount) {
                        this.f41408w = new float[childCount];
                        this.f41409x = new float[childCount];
                        this.f41410y = new int[childCount];
                        this.B = new int[childCount];
                        this.A = new int[childCount];
                    }
                    float f13 = 0.0f;
                    int i16 = 0;
                    for (int i17 = 0; i17 < childCount; i17++) {
                        View childAt = getChildAt(i17);
                        if (!d(childAt)) {
                            this.f41408w[i17] = -1.0f;
                        } else {
                            if (childAt instanceof og0) {
                                zg.b bVar = (zg.b) ((og0) childAt);
                                if (bVar.P == null) {
                                    bVar.P = new TextPaint(bVar.B);
                                }
                                bVar.P.setTextSize(AndroidUtilities.dp(f10));
                                f11 = bVar.P.measureText(bVar.f50859a.getText().toString());
                            } else {
                                f11 = 0.0f;
                            }
                            this.f41408w[i17] = f11;
                            f13 = Math.max(f13, f11);
                            i16++;
                        }
                    }
                    i12 = 0;
                    f9 = 0.0f;
                    Math.ceil(f13);
                    this.C = i16;
                    f12 = fArr[i15];
                } else {
                    i12 = 0;
                    f9 = 0.0f;
                }
                int dp = AndroidUtilities.dp(iArr[i15]);
                int childCount2 = getChildCount();
                float f14 = 0.0f;
                for (int i18 = 0; i18 < childCount2; i18++) {
                    if (d(getChildAt(i18))) {
                        f14 += this.f41408w[i18] + (dp * 2);
                    }
                }
                if (f14 <= paddingLeft || i15 == 2) {
                    break;
                }
                i15++;
            } else {
                i12 = 0;
                f9 = 0.0f;
                i15 = 2;
                break;
            }
        }
        float f15 = fArr[i15];
        int childCount3 = getChildCount();
        for (int i19 = 0; i19 < childCount3; i19++) {
            View childAt2 = getChildAt(i19);
            if (childAt2 instanceof og0) {
                ((zg.b) ((og0) childAt2)).setTextSizeDp(f15);
            }
        }
        int dp2 = AndroidUtilities.dp(iArr[i15]) * 2;
        int max = (paddingLeft / Math.max(1, this.C)) - dp2;
        int childCount4 = getChildCount();
        int i20 = 0;
        float f16 = 0.0f;
        for (int i21 = 0; i21 < childCount4; i21++) {
            if (!d(getChildAt(i21))) {
                float[] fArr3 = this.f41408w;
                this.f41409x[i21] = f9;
                fArr3[i21] = f9;
                this.f41410y[i21] = i12;
            } else {
                float[] fArr4 = this.f41409x;
                float f17 = this.f41408w[i21] + dp2;
                fArr4[i21] = f17;
                int[] iArr2 = this.f41410y;
                if (f17 > max + dp2) {
                    i13 = 0;
                } else {
                    i13 = 1;
                }
                iArr2[i21] = i13;
                f16 += f17;
                i20 += i13;
            }
        }
        if (i20 == 0) {
            int childCount5 = getChildCount();
            for (int i22 = 0; i22 < childCount5; i22++) {
                this.f41410y[i22] = d(getChildAt(i22)) ? 1 : 0;
            }
            i20 = this.C;
        }
        float f18 = paddingLeft;
        if (f16 > f18) {
            float f19 = f18 / f16;
            int childCount6 = getChildCount();
            for (int i23 = 0; i23 < childCount6; i23++) {
                float[] fArr5 = this.f41409x;
                fArr5[i23] = fArr5[i23] * f19;
            }
        } else {
            float f20 = min;
            if (f16 < f20) {
                float f21 = (f20 - f16) / i20;
                int childCount7 = getChildCount();
                for (int i24 = 0; i24 < childCount7; i24++) {
                    float[] fArr6 = this.f41409x;
                    fArr6[i24] = (this.f41410y[i24] * f21) + fArr6[i24];
                }
            }
        }
        int childCount8 = getChildCount();
        int i25 = 0;
        for (int i26 = 0; i26 < childCount8; i26++) {
            if (d(getChildAt(i26))) {
                this.A[i26] = Math.round(this.f41409x[i26]);
                this.B[i26] = i25;
                i25 += this.A[i26];
            }
        }
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + i25, size2);
        int childCount9 = getChildCount();
        for (int i27 = 0; i27 < childCount9; i27++) {
            getChildAt(i27).measure(View.MeasureSpec.makeMeasureSpec(this.A[i27], 1073741824), View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824));
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
    public void setScaleX(float f9) {
        super.setScaleX(f9);
        n();
    }

    @Override
    public void setScaleY(float f9) {
        super.setScaleY(f9);
        n();
    }
}
