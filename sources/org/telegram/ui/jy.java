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
public final class jy extends org.telegram.ui.Components.qv0 {
    public final yd.b A0;
    public final qy B0;
    public final Paint f35381t0;
    public int f35382u0;
    public int f35383v0;
    public int f35384w0;
    public VelocityTracker f35385x0;
    public final Rect f35386y0;
    public boolean f35387z0;

    public jy(Context context, qy qyVar) {
        super(context, null);
        this.B0 = qyVar;
        this.f35381t0 = new Paint(1);
        this.f35386y0 = new Rect();
        this.A0 = new yd.b(new h(this, 15));
    }

    @Override
    public final void J(android.graphics.Canvas r10, float r11, android.graphics.Rect r12, android.graphics.Paint r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jy.J(android.graphics.Canvas, float, android.graphics.Rect, android.graphics.Paint, boolean):void");
    }

    @Override
    public final void L(Canvas canvas, ArrayList arrayList) {
        zx zxVar;
        org.telegram.ui.Components.rl0 p10;
        qy qyVar = this.B0;
        if (qyVar.f37584m3 && (zxVar = qyVar.f37647z0) != null && zxVar.getVisibility() == 0) {
            zx zxVar2 = qyVar.f37647z0;
            View[] viewArr = zxVar2.e;
            for (int i10 = 0; i10 < viewArr.length; i10++) {
                View view = viewArr[i10];
                if (view != null && view.getVisibility() == 0 && (p10 = org.telegram.ui.Components.l81.p(viewArr[i10])) != null) {
                    for (int i11 = 0; i11 < p10.getChildCount(); i11++) {
                        View childAt = p10.getChildAt(i11);
                        if (childAt.getY() < AndroidUtilities.dp(100.0f) + AndroidUtilities.dp(203.0f)) {
                            int save = canvas.save();
                            canvas.translate(viewArr[i10].getX(), childAt.getY() + p10.getY() + viewArr[i10].getY() + zxVar2.getY());
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
        this.B0.m3();
    }

    @Override
    public final boolean O() {
        return true;
    }

    public final boolean Z() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jy.Z():boolean");
    }

    public final int a0() {
        org.telegram.ui.ActionBar.k kVar;
        float f10;
        qy qyVar = this.B0;
        kVar = ((org.telegram.ui.ActionBar.p2) qyVar).actionBar;
        float height = kVar.getHeight();
        lx lxVar = qyVar.C3;
        if (lxVar != null && lxVar.c()) {
            f10 = qyVar.C3.e;
        } else {
            f10 = 0.0f;
        }
        if (qyVar.H) {
            height = e2.c.w(1.0f, qyVar.f37605q3, (1.0f - f10) * (1.0f - qyVar.f37625u1) * AndroidUtilities.dp(81.0f), height);
        }
        return (int) e2.c.w(1.0f, f10, (1.0f - qyVar.f37625u1) * (1.0f - qyVar.f37605q3) * AndroidUtilities.dp(48.0f), height + qyVar.Q);
    }

    public final int b0() {
        float f10;
        qy qyVar = this.B0;
        float f11 = qyVar.K;
        lx lxVar = qyVar.C3;
        if (lxVar != null && lxVar.c()) {
            f10 = qyVar.C3.e;
        } else {
            f10 = 0.0f;
        }
        return (int) e2.c.w(1.0f, qyVar.f37625u1, org.telegram.messenger.y3.y(1.0f, f10, 1.0f - qyVar.f37605q3, f11), -getY());
    }

    public final boolean c0(MotionEvent motionEvent, boolean z4) {
        int i10;
        org.telegram.ui.ActionBar.k kVar;
        qy qyVar = this.B0;
        pw pwVar = qyVar.f37633w0;
        SparseIntArray sparseIntArray = pwVar.f26100g0;
        int i11 = pwVar.H;
        if (z4) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        int i12 = sparseIntArray.get(i11 + i10, -1);
        if (i12 < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        qyVar.f37571j3 = false;
        qyVar.f37566i3 = true;
        this.f35383v0 = (int) (motionEvent.getX() + qyVar.f37551f3);
        kVar = ((org.telegram.ui.ActionBar.p2) qyVar).actionBar;
        kVar.setEnabled(false);
        qyVar.f37633w0.setEnabled(false);
        py pyVar = qyVar.f37527b0[1];
        pyVar.h = i12;
        pyVar.setVisibility(0);
        qyVar.f37545e3 = z4;
        qy.f1(qyVar, false);
        qyVar.R4(true);
        if (z4) {
            py[] pyVarArr = qyVar.f37527b0;
            pyVarArr[1].setTranslationX(pyVarArr[0].getMeasuredWidth());
            return true;
        }
        py[] pyVarArr2 = qyVar.f37527b0;
        pyVarArr2[1].setTranslationX(-pyVarArr2[0].getMeasuredWidth());
        return true;
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jy.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.A0.a(motionEvent, this) && !super.dispatchTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        qy qyVar = this.B0;
        if (view == qyVar.H0) {
            return true;
        }
        if (org.telegram.ui.Components.qv0.f28282s0) {
            return super.drawChild(canvas, view, j10);
        }
        py[] pyVarArr = qyVar.f37527b0;
        int i10 = 0;
        if (view != pyVarArr[0] && ((pyVarArr.length <= 1 || view != pyVarArr[1]) && view != qyVar.G1 && view != qyVar.f37633w0)) {
            kVar = ((org.telegram.ui.ActionBar.p2) qyVar).actionBar;
            if (view == kVar && qyVar.U3 != 1.0f) {
                canvas.save();
                if (qyVar.V3) {
                    canvas.translate((1.0f - qyVar.U3) * AndroidUtilities.dp(40.0f) * (-1), 0.0f);
                } else {
                    float c3 = ai.c(1.0f, qyVar.U3, 0.05f, 1.0f);
                    canvas.translate((1.0f - qyVar.U3) * (-AndroidUtilities.dp(4.0f)), 0.0f);
                    kVar2 = ((org.telegram.ui.ActionBar.p2) qyVar).actionBar;
                    if (kVar2.getOccupyStatusBar()) {
                        i10 = AndroidUtilities.statusBarHeight;
                    }
                    canvas.scale(c3, c3, 0.0f, (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + i10);
                }
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            }
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        if (view != qyVar.G1 && view != qyVar.f37633w0) {
            canvas.clipRect(0.0f, (-getY()) + b0() + a0(), getMeasuredWidth(), getMeasuredHeight());
        }
        float f10 = qyVar.U3;
        if (f10 != 1.0f) {
            if (qyVar.V3) {
                canvas.translate((1.0f - qyVar.U3) * AndroidUtilities.dp(40.0f) * (-1), 0.0f);
            } else {
                float c10 = ai.c(1.0f, f10, 0.05f, 1.0f);
                canvas.translate((1.0f - qyVar.U3) * (-AndroidUtilities.dp(4.0f)), 0.0f);
                canvas.scale(c10, c10, 0.0f, (-getY()) + qyVar.K + a0());
            }
        }
        boolean drawChild2 = super.drawChild(canvas, view, j10);
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
        org.telegram.ui.Components.j5 j5Var = this.B0.A3;
        if (j5Var != null) {
            j5Var.a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.j5 j5Var = this.B0.A3;
        if (j5Var != null) {
            j5Var.b();
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        pw pwVar;
        int actionMasked = motionEvent.getActionMasked();
        qy qyVar = this.B0;
        if (actionMasked == 1 || actionMasked == 3) {
            kVar = ((org.telegram.ui.ActionBar.p2) qyVar).actionBar;
            if (kVar.s()) {
                qyVar.V0 = true;
            }
        }
        if (Z() || (((pwVar = qyVar.f37633w0) != null && pwVar.L) || onTouchEvent(motionEvent))) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jy.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z4;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        int i12;
        org.telegram.ui.ActionBar.k kVar3;
        int i13;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        int i14;
        qy qyVar = this.B0;
        int i15 = qyVar.f37521a;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (size2 > size) {
            z4 = true;
        } else {
            z4 = false;
        }
        setMeasuredDimension(size, size2);
        org.telegram.ui.ActionBar.w0 w0Var = qyVar.f37568j0;
        if (w0Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) w0Var.getLayoutParams();
            kVar5 = ((org.telegram.ui.ActionBar.p2) qyVar).actionBar;
            if (kVar5.getOccupyStatusBar()) {
                i14 = AndroidUtilities.statusBarHeight;
            } else {
                i14 = 0;
            }
            layoutParams.topMargin = i14;
            layoutParams.height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        kVar = ((org.telegram.ui.ActionBar.p2) qyVar).actionBar;
        measureChildWithMargins(kVar, i10, 0, i11, 0);
        int R = R();
        int childCount = getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt != null && childAt.getVisibility() != 8) {
                kVar2 = ((org.telegram.ui.ActionBar.p2) qyVar).actionBar;
                if (childAt != kVar2) {
                    if (childAt instanceof bv) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                        int size3 = View.MeasureSpec.getSize(i11);
                        int dp = AndroidUtilities.dp(10.0f);
                        int dp2 = AndroidUtilities.dp(2.0f) + size3;
                        kVar4 = ((org.telegram.ui.ActionBar.p2) qyVar).actionBar;
                        childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max(dp, dp2 - kVar4.getMeasuredHeight()), 1073741824));
                    } else if (childAt instanceof py) {
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                        int dp3 = AndroidUtilities.dp(2.0f) + size2;
                        if (qyVar.C3.c()) {
                            if (qyVar.f37632w) {
                                dp3 = AndroidUtilities.dp(50.0f) + dp3;
                            }
                            if (qyVar.H) {
                                dp3 = AndroidUtilities.dp(81.0f) + dp3;
                            }
                            dp3 = AndroidUtilities.dp(48.0f) + dp3;
                        }
                        int i17 = dp3 + qyVar.M;
                        if (qyVar.f37611r3 == null) {
                            childAt.setTranslationY(0.0f);
                        }
                        if (qyVar.W3) {
                            i13 = (int) (i17 * 0.05f);
                        } else {
                            i13 = 0;
                        }
                        childAt.setPadding(childAt.getPaddingLeft(), childAt.getPaddingTop(), childAt.getPaddingRight(), i13);
                        childAt.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), i17 + i13), 1073741824));
                        childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                    } else {
                        zx zxVar = qyVar.f37647z0;
                        if (childAt == zxVar) {
                            zxVar.setTranslationY(qyVar.F0);
                            qyVar.f37647z0.m0.setKeyboardHeight(R);
                            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                            int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(i15) + View.MeasureSpec.getSize(i11), 1073741824);
                            qyVar.G3(true);
                            childAt.measure(makeMeasureSpec3, makeMeasureSpec4);
                            childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                            Rect rect = AndroidUtilities.rectTmp2;
                            kVar3 = ((org.telegram.ui.ActionBar.p2) qyVar).actionBar;
                            rect.set(0, (AndroidUtilities.dp(i15) + kVar3.getMeasuredHeight()) - AndroidUtilities.dp(2.0f), childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
                        } else {
                            bx bxVar = qyVar.f37644y1;
                            if (bxVar != null && bxVar.u0(childAt)) {
                                if (AndroidUtilities.isInMultiwindow) {
                                    if (AndroidUtilities.isTablet()) {
                                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(320.0f), getPaddingTop() + (size2 - AndroidUtilities.statusBarHeight)), 1073741824));
                                    } else {
                                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size2 - AndroidUtilities.statusBarHeight), 1073741824));
                                    }
                                } else {
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                                }
                            } else if (childAt == qyVar.C3) {
                                int size4 = View.MeasureSpec.getSize(i11);
                                if (qyVar.W3) {
                                    i12 = (int) (size4 * 0.05f);
                                } else {
                                    i12 = 0;
                                }
                                qyVar.C3.setTransitionPaddingBottom(i12);
                                childAt.measure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), size4 + i12), 1073741824));
                            } else {
                                measureChildWithMargins(childAt, i10, 0, i11, 0);
                            }
                        }
                    }
                }
            }
        }
        if (z4 != this.f35387z0) {
            post(new iy(this, 1));
            this.f35387z0 = z4;
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jy.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z4) {
        qy qyVar = this.B0;
        if (qyVar.f37571j3 && !qyVar.f37566i3) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z4);
    }
}
