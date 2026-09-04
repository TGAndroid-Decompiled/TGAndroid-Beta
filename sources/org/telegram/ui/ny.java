package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class ny extends org.telegram.ui.Components.ov0 {
    public VelocityTracker A0;
    public final Rect B0;
    public boolean C0;
    public final me.b D0;
    public final uy E0;
    public final Paint f39052w0;
    public int f39053x0;
    public int f39054y0;
    public int f39055z0;

    public ny(Context context, uy uyVar) {
        super(context, null);
        this.E0 = uyVar;
        this.f39052w0 = new Paint(1);
        this.B0 = new Rect();
        this.D0 = new me.b(new g(this, 15));
    }

    @Override
    public final void J(android.graphics.Canvas r10, float r11, android.graphics.Rect r12, android.graphics.Paint r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ny.J(android.graphics.Canvas, float, android.graphics.Rect, android.graphics.Paint, boolean):void");
    }

    @Override
    public final void L(Canvas canvas, ArrayList arrayList) {
        ey eyVar;
        org.telegram.ui.Components.ll0 p5;
        uy uyVar = this.E0;
        if (uyVar.f41315p3 && (eyVar = uyVar.C0) != null && eyVar.getVisibility() == 0) {
            ey eyVar2 = uyVar.C0;
            View[] viewArr = eyVar2.f27017e;
            for (int i10 = 0; i10 < viewArr.length; i10++) {
                View view = viewArr[i10];
                if (view != null && view.getVisibility() == 0 && (p5 = org.telegram.ui.Components.i81.p(viewArr[i10])) != null) {
                    for (int i11 = 0; i11 < p5.getChildCount(); i11++) {
                        View childAt = p5.getChildAt(i11);
                        if (childAt.getY() < AndroidUtilities.dp(100.0f) + AndroidUtilities.dp(203.0f)) {
                            int save = canvas.save();
                            canvas.translate(viewArr[i10].getX(), childAt.getY() + p5.getY() + viewArr[i10].getY() + eyVar2.getY());
                            childAt.draw(canvas);
                            canvas.restoreToCount(save);
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void M() {
        super.M();
        this.E0.m3();
    }

    @Override
    public final boolean O() {
        return true;
    }

    public final boolean Z() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ny.Z():boolean");
    }

    public final int a0() {
        org.telegram.ui.ActionBar.k kVar;
        float f7;
        uy uyVar = this.E0;
        kVar = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
        float height = kVar.getHeight();
        ox oxVar = uyVar.F3;
        if (oxVar != null && oxVar.c()) {
            f7 = uyVar.F3.f39103e;
        } else {
            f7 = 0.0f;
        }
        if (uyVar.K) {
            height = com.google.android.gms.internal.vision.e2.z(1.0f, uyVar.f41337t3, (1.0f - f7) * (1.0f - uyVar.f41357x1) * AndroidUtilities.dp(81.0f), height);
        }
        return (int) com.google.android.gms.internal.vision.e2.z(1.0f, f7, (1.0f - uyVar.f41357x1) * (1.0f - uyVar.f41337t3) * AndroidUtilities.dp(48.0f), height + uyVar.T);
    }

    public final int b0() {
        float f7;
        uy uyVar = this.E0;
        float f10 = uyVar.N;
        ox oxVar = uyVar.F3;
        if (oxVar != null && oxVar.c()) {
            f7 = uyVar.F3.f39103e;
        } else {
            f7 = 0.0f;
        }
        return (int) com.google.android.gms.internal.vision.e2.z(1.0f, uyVar.f41357x1, org.telegram.messenger.w1.A(1.0f, f7, 1.0f - uyVar.f41337t3, f10), -getY());
    }

    public final boolean c0(MotionEvent motionEvent, boolean z10) {
        int i10;
        org.telegram.ui.ActionBar.k kVar;
        uy uyVar = this.E0;
        sw swVar = uyVar.f41364z0;
        SparseIntArray sparseIntArray = swVar.f27618j0;
        int i11 = swVar.K;
        if (z10) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        int i12 = sparseIntArray.get(i11 + i10, -1);
        if (i12 < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        uyVar.f41299m3 = false;
        uyVar.f41296l3 = true;
        this.f39054y0 = (int) (motionEvent.getX() + uyVar.f41283i3);
        kVar = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
        kVar.setEnabled(false);
        uyVar.f41364z0.setEnabled(false);
        ty tyVar = uyVar.f41259e0[1];
        tyVar.h = i12;
        tyVar.setVisibility(0);
        uyVar.f41278h3 = z10;
        uy.f1(uyVar, false);
        uyVar.R4(true);
        if (z10) {
            ty[] tyVarArr = uyVar.f41259e0;
            tyVarArr[1].setTranslationX(tyVarArr[0].getMeasuredWidth());
            return true;
        }
        ty[] tyVarArr2 = uyVar.f41259e0;
        tyVarArr2[1].setTranslationX(-tyVarArr2[0].getMeasuredWidth());
        return true;
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ny.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.D0.a(motionEvent, this) && !super.dispatchTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        uy uyVar = this.E0;
        if (view == uyVar.K0) {
            return true;
        }
        if (org.telegram.ui.Components.ov0.f29196v0) {
            return super.drawChild(canvas, view, j3);
        }
        ty[] tyVarArr = uyVar.f41259e0;
        int i10 = 0;
        if (view != tyVarArr[0] && ((tyVarArr.length <= 1 || view != tyVarArr[1]) && view != uyVar.J1 && view != uyVar.f41364z0)) {
            kVar = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
            if (view == kVar && uyVar.X3 != 1.0f) {
                canvas.save();
                if (uyVar.Y3) {
                    canvas.translate((1.0f - uyVar.X3) * AndroidUtilities.dp(40.0f) * (-1), 0.0f);
                } else {
                    float b10 = com.google.android.gms.internal.vision.e2.b(1.0f, uyVar.X3, 0.05f, 1.0f);
                    canvas.translate((1.0f - uyVar.X3) * (-AndroidUtilities.dp(4.0f)), 0.0f);
                    kVar2 = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
                    if (kVar2.getOccupyStatusBar()) {
                        i10 = AndroidUtilities.statusBarHeight;
                    }
                    canvas.scale(b10, b10, 0.0f, (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + i10);
                }
                boolean drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild;
            }
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        if (view != uyVar.J1 && view != uyVar.f41364z0) {
            canvas.clipRect(0.0f, (-getY()) + b0() + a0(), getMeasuredWidth(), getMeasuredHeight());
        }
        float f7 = uyVar.X3;
        if (f7 != 1.0f) {
            if (uyVar.Y3) {
                canvas.translate((1.0f - uyVar.X3) * AndroidUtilities.dp(40.0f) * (-1), 0.0f);
            } else {
                float b11 = com.google.android.gms.internal.vision.e2.b(1.0f, f7, 0.05f, 1.0f);
                canvas.translate((1.0f - uyVar.X3) * (-AndroidUtilities.dp(4.0f)), 0.0f);
                canvas.scale(b11, b11, 0.0f, (-getY()) + uyVar.N + a0());
            }
        }
        boolean drawChild2 = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild2;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Components.o5 o5Var = this.E0.D3;
        if (o5Var != null) {
            o5Var.a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.o5 o5Var = this.E0.D3;
        if (o5Var != null) {
            o5Var.b();
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        sw swVar;
        int actionMasked = motionEvent.getActionMasked();
        uy uyVar = this.E0;
        if (actionMasked == 1 || actionMasked == 3) {
            kVar = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
            if (kVar.s()) {
                uyVar.Y0 = true;
            }
        }
        if (Z() || (((swVar = uyVar.f41364z0) != null && swVar.O) || onTouchEvent(motionEvent))) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ny.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        int i12;
        org.telegram.ui.ActionBar.k kVar3;
        int i13;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        int i14;
        uy uyVar = this.E0;
        int i15 = uyVar.f41236a;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (size2 > size) {
            z10 = true;
        } else {
            z10 = false;
        }
        setMeasuredDimension(size, size2);
        org.telegram.ui.ActionBar.v0 v0Var = uyVar.m0;
        if (v0Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) v0Var.getLayoutParams();
            kVar5 = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
            if (kVar5.getOccupyStatusBar()) {
                i14 = AndroidUtilities.statusBarHeight;
            } else {
                i14 = 0;
            }
            layoutParams.topMargin = i14;
            layoutParams.height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        kVar = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
        measureChildWithMargins(kVar, i10, 0, i11, 0);
        int R = R();
        int childCount = getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt != null && childAt.getVisibility() != 8) {
                kVar2 = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
                if (childAt != kVar2) {
                    if (childAt instanceof cv) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                        int size3 = View.MeasureSpec.getSize(i11);
                        int dp = AndroidUtilities.dp(10.0f);
                        int dp2 = AndroidUtilities.dp(2.0f) + size3;
                        kVar4 = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
                        childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max(dp, dp2 - kVar4.getMeasuredHeight()), 1073741824));
                    } else if (childAt instanceof ty) {
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                        int dp3 = AndroidUtilities.dp(2.0f) + size2;
                        if (uyVar.F3.c()) {
                            if (uyVar.f41349w) {
                                dp3 = AndroidUtilities.dp(50.0f) + dp3;
                            }
                            if (uyVar.K) {
                                dp3 = AndroidUtilities.dp(81.0f) + dp3;
                            }
                            dp3 = AndroidUtilities.dp(48.0f) + dp3;
                        }
                        int i17 = dp3 + uyVar.P;
                        if (uyVar.f41342u3 == null) {
                            childAt.setTranslationY(0.0f);
                        }
                        if (uyVar.Z3) {
                            i13 = (int) (i17 * 0.05f);
                        } else {
                            i13 = 0;
                        }
                        childAt.setPadding(childAt.getPaddingLeft(), childAt.getPaddingTop(), childAt.getPaddingRight(), i13);
                        childAt.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), i17 + i13), 1073741824));
                        childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                    } else {
                        ey eyVar = uyVar.C0;
                        if (childAt == eyVar) {
                            eyVar.setTranslationY(uyVar.I0);
                            uyVar.C0.f32963p0.setKeyboardHeight(R);
                            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                            int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(i15) + View.MeasureSpec.getSize(i11), 1073741824);
                            uyVar.G3(true);
                            childAt.measure(makeMeasureSpec3, makeMeasureSpec4);
                            childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                            Rect rect = AndroidUtilities.rectTmp2;
                            kVar3 = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
                            rect.set(0, (AndroidUtilities.dp(i15) + kVar3.getMeasuredHeight()) - AndroidUtilities.dp(2.0f), childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
                        } else {
                            ex exVar = uyVar.B1;
                            if (exVar != null && exVar.u0(childAt)) {
                                if (AndroidUtilities.isInMultiwindow) {
                                    if (AndroidUtilities.isTablet()) {
                                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(320.0f), getPaddingTop() + (size2 - AndroidUtilities.statusBarHeight)), 1073741824));
                                    } else {
                                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size2 - AndroidUtilities.statusBarHeight), 1073741824));
                                    }
                                } else {
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                                }
                            } else if (childAt == uyVar.F3) {
                                int size4 = View.MeasureSpec.getSize(i11);
                                if (uyVar.Z3) {
                                    i12 = (int) (size4 * 0.05f);
                                } else {
                                    i12 = 0;
                                }
                                uyVar.F3.setTransitionPaddingBottom(i12);
                                childAt.measure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), size4 + i12), 1073741824));
                            } else {
                                measureChildWithMargins(childAt, i10, 0, i11, 0);
                            }
                        }
                    }
                }
            }
        }
        if (z10 != this.C0) {
            post(new my(this, 1));
            this.C0 = z10;
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ny.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        uy uyVar = this.E0;
        if (uyVar.f41299m3 && !uyVar.f41296l3) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }
}
