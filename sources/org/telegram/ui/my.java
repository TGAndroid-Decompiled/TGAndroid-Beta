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
public final class my extends org.telegram.ui.Components.cw0 {
    public VelocityTracker A0;
    public final Rect B0;
    public boolean C0;
    public final me.b D0;
    public final ty E0;
    public final Paint f35770w0;
    public int f35771x0;
    public int f35772y0;
    public int f35773z0;

    public my(Context context, ty tyVar) {
        super(context, null);
        this.E0 = tyVar;
        this.f35770w0 = new Paint(1);
        this.B0 = new Rect();
        this.D0 = new me.b(new g(this, 15));
    }

    @Override
    public final void J(android.graphics.Canvas r10, float r11, android.graphics.Rect r12, android.graphics.Paint r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.my.J(android.graphics.Canvas, float, android.graphics.Rect, android.graphics.Paint, boolean):void");
    }

    @Override
    public final void L(Canvas canvas, ArrayList arrayList) {
        ay ayVar;
        org.telegram.ui.Components.yl0 p5;
        ty tyVar = this.E0;
        if (tyVar.f38032p3 && (ayVar = tyVar.C0) != null && ayVar.getVisibility() == 0) {
            ay ayVar2 = tyVar.C0;
            View[] viewArr = ayVar2.e;
            for (int i10 = 0; i10 < viewArr.length; i10++) {
                View view = viewArr[i10];
                if (view != null && view.getVisibility() == 0 && (p5 = org.telegram.ui.Components.y81.p(viewArr[i10])) != null) {
                    for (int i11 = 0; i11 < p5.getChildCount(); i11++) {
                        View childAt = p5.getChildAt(i11);
                        if (childAt.getY() < AndroidUtilities.dp(100.0f) + AndroidUtilities.dp(203.0f)) {
                            int save = canvas.save();
                            canvas.translate(viewArr[i10].getX(), childAt.getY() + p5.getY() + viewArr[i10].getY() + ayVar2.getY());
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
        li.l lVar;
        super.M();
        lVar = ((org.telegram.ui.ActionBar.o2) this.E0).glassEngine;
        lVar.f();
    }

    @Override
    public final boolean O() {
        return true;
    }

    public final boolean Z() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.my.Z():boolean");
    }

    public final int a0() {
        org.telegram.ui.ActionBar.l lVar;
        float f7;
        ty tyVar = this.E0;
        lVar = ((org.telegram.ui.ActionBar.o2) tyVar).actionBar;
        float height = lVar.getHeight();
        kx kxVar = tyVar.F3;
        if (kxVar != null && kxVar.c()) {
            f7 = tyVar.F3.e;
        } else {
            f7 = 0.0f;
        }
        if (tyVar.K) {
            height = com.google.android.gms.internal.vision.e2.z(1.0f, tyVar.f38054t3, (1.0f - f7) * (1.0f - tyVar.f38072x1) * AndroidUtilities.dp(81.0f), height);
        }
        return (int) com.google.android.gms.internal.vision.e2.z(1.0f, f7, (1.0f - tyVar.f38072x1) * (1.0f - tyVar.f38054t3) * AndroidUtilities.dp(48.0f), height + tyVar.T);
    }

    public final int b0() {
        float f7;
        ty tyVar = this.E0;
        float f10 = tyVar.N;
        kx kxVar = tyVar.F3;
        if (kxVar != null && kxVar.c()) {
            f7 = tyVar.F3.e;
        } else {
            f7 = 0.0f;
        }
        return (int) com.google.android.gms.internal.vision.e2.z(1.0f, tyVar.f38072x1, org.telegram.messenger.l0.z(1.0f, f7, 1.0f - tyVar.f38054t3, f10), -getY());
    }

    public final boolean c0(MotionEvent motionEvent, boolean z10) {
        int i10;
        org.telegram.ui.ActionBar.l lVar;
        ty tyVar = this.E0;
        iy iyVar = tyVar.f38079z0;
        SparseIntArray sparseIntArray = iyVar.f26254j0;
        int i11 = iyVar.K;
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
        tyVar.f38016m3 = false;
        tyVar.f38013l3 = true;
        this.f35772y0 = (int) (motionEvent.getX() + tyVar.f38000i3);
        lVar = ((org.telegram.ui.ActionBar.o2) tyVar).actionBar;
        lVar.setEnabled(false);
        tyVar.f38079z0.setEnabled(false);
        sy syVar = tyVar.f37976e0[1];
        syVar.h = i12;
        syVar.setVisibility(0);
        tyVar.f37995h3 = z10;
        ty.j1(tyVar, false);
        tyVar.a5(true);
        if (z10) {
            sy[] syVarArr = tyVar.f37976e0;
            syVarArr[1].setTranslationX(syVarArr[0].getMeasuredWidth());
            return true;
        }
        sy[] syVarArr2 = tyVar.f37976e0;
        syVarArr2[1].setTranslationX(-syVarArr2[0].getMeasuredWidth());
        return true;
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.my.dispatchDraw(android.graphics.Canvas):void");
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
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        ty tyVar = this.E0;
        if (view == tyVar.K0) {
            return true;
        }
        if (org.telegram.ui.Components.cw0.f23424v0) {
            return super.drawChild(canvas, view, j3);
        }
        sy[] syVarArr = tyVar.f37976e0;
        int i10 = 0;
        if (view != syVarArr[0] && ((syVarArr.length <= 1 || view != syVarArr[1]) && view != tyVar.J1 && view != tyVar.f38079z0)) {
            lVar = ((org.telegram.ui.ActionBar.o2) tyVar).actionBar;
            if (view == lVar && tyVar.W3 != 1.0f) {
                canvas.save();
                if (tyVar.X3) {
                    canvas.translate((1.0f - tyVar.W3) * AndroidUtilities.dp(40.0f) * (-1), 0.0f);
                } else {
                    float b10 = com.google.android.gms.internal.vision.e2.b(1.0f, tyVar.W3, 0.05f, 1.0f);
                    canvas.translate((1.0f - tyVar.W3) * (-AndroidUtilities.dp(4.0f)), 0.0f);
                    lVar2 = ((org.telegram.ui.ActionBar.o2) tyVar).actionBar;
                    if (lVar2.getOccupyStatusBar()) {
                        i10 = AndroidUtilities.statusBarHeight;
                    }
                    canvas.scale(b10, b10, 0.0f, (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2.0f) + i10);
                }
                boolean drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild;
            }
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        if (view != tyVar.J1 && view != tyVar.f38079z0) {
            canvas.clipRect(0.0f, (-getY()) + b0() + a0(), getMeasuredWidth(), getMeasuredHeight());
        }
        float f7 = tyVar.W3;
        if (f7 != 1.0f) {
            if (tyVar.X3) {
                canvas.translate((1.0f - tyVar.W3) * AndroidUtilities.dp(40.0f) * (-1), 0.0f);
            } else {
                float b11 = com.google.android.gms.internal.vision.e2.b(1.0f, f7, 0.05f, 1.0f);
                canvas.translate((1.0f - tyVar.W3) * (-AndroidUtilities.dp(4.0f)), 0.0f);
                canvas.scale(b11, b11, 0.0f, (-getY()) + tyVar.N + a0());
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
        org.telegram.ui.ActionBar.l lVar;
        iy iyVar;
        int actionMasked = motionEvent.getActionMasked();
        ty tyVar = this.E0;
        if (actionMasked == 1 || actionMasked == 3) {
            lVar = ((org.telegram.ui.ActionBar.o2) tyVar).actionBar;
            if (lVar.t()) {
                tyVar.Y0 = true;
            }
        }
        if (Z() || (((iyVar = tyVar.f38079z0) != null && iyVar.O) || onTouchEvent(motionEvent))) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.my.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        int i12;
        org.telegram.ui.ActionBar.l lVar3;
        int i13;
        org.telegram.ui.ActionBar.l lVar4;
        org.telegram.ui.ActionBar.l lVar5;
        int i14;
        ty tyVar = this.E0;
        int i15 = tyVar.f37954a;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (size2 > size) {
            z10 = true;
        } else {
            z10 = false;
        }
        setMeasuredDimension(size, size2);
        org.telegram.ui.ActionBar.w0 w0Var = tyVar.m0;
        if (w0Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) w0Var.getLayoutParams();
            lVar5 = ((org.telegram.ui.ActionBar.o2) tyVar).actionBar;
            if (lVar5.getOccupyStatusBar()) {
                i14 = AndroidUtilities.statusBarHeight;
            } else {
                i14 = 0;
            }
            layoutParams.topMargin = i14;
            layoutParams.height = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        }
        lVar = ((org.telegram.ui.ActionBar.o2) tyVar).actionBar;
        measureChildWithMargins(lVar, i10, 0, i11, 0);
        int R = R();
        int childCount = getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt != null && childAt.getVisibility() != 8) {
                lVar2 = ((org.telegram.ui.ActionBar.o2) tyVar).actionBar;
                if (childAt != lVar2) {
                    if (childAt instanceof zu) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                        int size3 = View.MeasureSpec.getSize(i11);
                        int dp = AndroidUtilities.dp(10.0f);
                        int dp2 = AndroidUtilities.dp(2.0f) + size3;
                        lVar4 = ((org.telegram.ui.ActionBar.o2) tyVar).actionBar;
                        childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max(dp, dp2 - lVar4.getMeasuredHeight()), 1073741824));
                    } else if (childAt instanceof sy) {
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                        int dp3 = AndroidUtilities.dp(2.0f) + size2;
                        if (tyVar.F3.c()) {
                            if (tyVar.f38065w) {
                                dp3 = AndroidUtilities.dp(50.0f) + dp3;
                            }
                            if (tyVar.K) {
                                dp3 = AndroidUtilities.dp(81.0f) + dp3;
                            }
                            dp3 = AndroidUtilities.dp(48.0f) + dp3;
                        }
                        int i17 = dp3 + tyVar.P;
                        if (tyVar.f38059u3 == null) {
                            childAt.setTranslationY(0.0f);
                        }
                        if (tyVar.Y3) {
                            i13 = (int) (i17 * 0.05f);
                        } else {
                            i13 = 0;
                        }
                        childAt.setPadding(childAt.getPaddingLeft(), childAt.getPaddingTop(), childAt.getPaddingRight(), i13);
                        childAt.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), i17 + i13), 1073741824));
                        childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                    } else {
                        ay ayVar = tyVar.C0;
                        if (childAt == ayVar) {
                            ayVar.setTranslationY(tyVar.I0);
                            tyVar.C0.f26509q0.setKeyboardHeight(R);
                            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                            int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(i15) + View.MeasureSpec.getSize(i11), 1073741824);
                            tyVar.P3(true);
                            childAt.measure(makeMeasureSpec3, makeMeasureSpec4);
                            childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                            Rect rect = AndroidUtilities.rectTmp2;
                            lVar3 = ((org.telegram.ui.ActionBar.o2) tyVar).actionBar;
                            rect.set(0, (AndroidUtilities.dp(i15) + lVar3.getMeasuredHeight()) - AndroidUtilities.dp(2.0f), childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
                        } else {
                            ax axVar = tyVar.B1;
                            if (axVar != null && axVar.u0(childAt)) {
                                if (AndroidUtilities.isInMultiwindow) {
                                    if (AndroidUtilities.isTablet()) {
                                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(320.0f), getPaddingTop() + (size2 - AndroidUtilities.statusBarHeight)), 1073741824));
                                    } else {
                                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size2 - AndroidUtilities.statusBarHeight), 1073741824));
                                    }
                                } else {
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                                }
                            } else if (childAt == tyVar.F3) {
                                int size4 = View.MeasureSpec.getSize(i11);
                                if (tyVar.Y3) {
                                    i12 = (int) (size4 * 0.05f);
                                } else {
                                    i12 = 0;
                                }
                                tyVar.F3.setTransitionPaddingBottom(i12);
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
            post(new ly(this, 1));
            this.C0 = z10;
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.my.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        ty tyVar = this.E0;
        if (tyVar.f38016m3 && !tyVar.f38013l3) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }
}
