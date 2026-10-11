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
public final class ly extends org.telegram.ui.Components.tw0 {
    public VelocityTracker A0;
    public final Rect B0;
    public boolean C0;
    public final ne.b D0;
    public final sy E0;
    public final Paint f39799w0;
    public int f39800x0;
    public int f39801y0;
    public int f39802z0;

    public ly(Context context, sy syVar) {
        super(context, null);
        this.E0 = syVar;
        this.f39799w0 = new Paint(1);
        this.B0 = new Rect();
        this.D0 = new ne.b(new g(this, 15));
    }

    @Override
    public final void J(android.graphics.Canvas r10, float r11, android.graphics.Rect r12, android.graphics.Paint r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ly.J(android.graphics.Canvas, float, android.graphics.Rect, android.graphics.Paint, boolean):void");
    }

    @Override
    public final void L(Canvas canvas, ArrayList arrayList) {
        cy cyVar;
        org.telegram.ui.Components.rm0 p5;
        sy syVar = this.E0;
        if (syVar.f41997p3 && (cyVar = syVar.C0) != null && cyVar.getVisibility() == 0) {
            cy cyVar2 = syVar.C0;
            View[] viewArr = cyVar2.f29798e;
            for (int i10 = 0; i10 < viewArr.length; i10++) {
                View view = viewArr[i10];
                if (view != null && view.getVisibility() == 0 && (p5 = org.telegram.ui.Components.p91.p(viewArr[i10])) != null) {
                    for (int i11 = 0; i11 < p5.getChildCount(); i11++) {
                        View childAt = p5.getChildAt(i11);
                        if (childAt.getY() < AndroidUtilities.dp(100.0f) + AndroidUtilities.dp(203.0f)) {
                            int save = canvas.save();
                            canvas.translate(viewArr[i10].getX(), childAt.getY() + p5.getY() + viewArr[i10].getY() + cyVar2.getY());
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
        this.E0.j3();
    }

    @Override
    public final boolean O() {
        return true;
    }

    public final boolean Z() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ly.Z():boolean");
    }

    public final int a0() {
        org.telegram.ui.ActionBar.k kVar;
        float f7;
        sy syVar = this.E0;
        kVar = ((org.telegram.ui.ActionBar.m2) syVar).actionBar;
        float height = kVar.getHeight();
        mx mxVar = syVar.F3;
        if (mxVar != null && mxVar.c()) {
            f7 = syVar.F3.f39229e;
        } else {
            f7 = 0.0f;
        }
        if (syVar.K) {
            height = com.google.android.gms.internal.vision.e2.y(1.0f, syVar.f42019t3, (1.0f - f7) * (1.0f - syVar.f42038x1) * AndroidUtilities.dp(81.0f), height);
        }
        return (int) com.google.android.gms.internal.vision.e2.y(1.0f, f7, (1.0f - syVar.f42038x1) * (1.0f - syVar.f42019t3) * AndroidUtilities.dp(48.0f), height + syVar.T);
    }

    public final int b0() {
        float f7;
        sy syVar = this.E0;
        float f10 = syVar.N;
        mx mxVar = syVar.F3;
        if (mxVar != null && mxVar.c()) {
            f7 = syVar.F3.f39229e;
        } else {
            f7 = 0.0f;
        }
        return (int) com.google.android.gms.internal.vision.e2.y(1.0f, syVar.f42038x1, org.telegram.messenger.q.z(1.0f, f7, 1.0f - syVar.f42019t3, f10), -getY());
    }

    public final boolean c0(MotionEvent motionEvent, boolean z10) {
        int i10;
        org.telegram.ui.ActionBar.k kVar;
        ry[] ryVarArr;
        ry[] ryVarArr2;
        sy syVar = this.E0;
        qw qwVar = syVar.f42045z0;
        SparseIntArray sparseIntArray = qwVar.f24826j0;
        int i11 = qwVar.K;
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
        syVar.f41981m3 = false;
        syVar.f41978l3 = true;
        this.f39801y0 = (int) (motionEvent.getX() + syVar.f41965i3);
        kVar = ((org.telegram.ui.ActionBar.m2) syVar).actionBar;
        kVar.setEnabled(false);
        syVar.f42045z0.setEnabled(false);
        ry ryVar = syVar.f41941e0[1];
        ryVar.h = i12;
        ryVar.setVisibility(0);
        syVar.f41960h3 = z10;
        sy.c1(syVar, false);
        syVar.O4(true);
        if (z10) {
            syVar.f41941e0[1].setTranslationX(ryVarArr2[0].getMeasuredWidth());
            return true;
        }
        syVar.f41941e0[1].setTranslationX(-ryVarArr[0].getMeasuredWidth());
        return true;
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ly.dispatchDraw(android.graphics.Canvas):void");
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
        sy syVar = this.E0;
        if (view == syVar.K0) {
            return true;
        }
        if (org.telegram.ui.Components.tw0.f31360v0) {
            return super.drawChild(canvas, view, j3);
        }
        ry[] ryVarArr = syVar.f41941e0;
        int i10 = 0;
        if (view != ryVarArr[0] && ((ryVarArr.length <= 1 || view != ryVarArr[1]) && view != syVar.J1 && view != syVar.f42045z0)) {
            kVar = ((org.telegram.ui.ActionBar.m2) syVar).actionBar;
            if (view == kVar && syVar.W3 != 1.0f) {
                canvas.save();
                if (syVar.X3) {
                    canvas.translate((1.0f - syVar.W3) * AndroidUtilities.dp(40.0f) * (-1), 0.0f);
                } else {
                    float b10 = com.google.android.gms.internal.vision.e2.b(1.0f, syVar.W3, 0.05f, 1.0f);
                    canvas.translate((1.0f - syVar.W3) * (-AndroidUtilities.dp(4.0f)), 0.0f);
                    kVar2 = ((org.telegram.ui.ActionBar.m2) syVar).actionBar;
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
        if (view != syVar.J1 && view != syVar.f42045z0) {
            canvas.clipRect(0.0f, (-getY()) + b0() + a0(), getMeasuredWidth(), getMeasuredHeight());
        }
        float f7 = syVar.W3;
        if (f7 != 1.0f) {
            if (syVar.X3) {
                canvas.translate((1.0f - syVar.W3) * AndroidUtilities.dp(40.0f) * (-1), 0.0f);
            } else {
                float b11 = com.google.android.gms.internal.vision.e2.b(1.0f, f7, 0.05f, 1.0f);
                canvas.translate((1.0f - syVar.W3) * (-AndroidUtilities.dp(4.0f)), 0.0f);
                canvas.scale(b11, b11, 0.0f, (-getY()) + syVar.N + a0());
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
        org.telegram.ui.Components.q5 q5Var = this.E0.D3;
        if (q5Var != null) {
            q5Var.a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.q5 q5Var = this.E0.D3;
        if (q5Var != null) {
            q5Var.b();
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        qw qwVar;
        int actionMasked = motionEvent.getActionMasked();
        sy syVar = this.E0;
        if (actionMasked == 1 || actionMasked == 3) {
            kVar = ((org.telegram.ui.ActionBar.m2) syVar).actionBar;
            if (kVar.t()) {
                syVar.Y0 = true;
            }
        }
        if (Z() || (((qwVar = syVar.f42045z0) != null && qwVar.O) || onTouchEvent(motionEvent))) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ly.onLayout(boolean, int, int, int, int):void");
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
        sy syVar = this.E0;
        int i15 = syVar.f41918a;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (size2 > size) {
            z10 = true;
        } else {
            z10 = false;
        }
        setMeasuredDimension(size, size2);
        org.telegram.ui.ActionBar.u0 u0Var = syVar.m0;
        if (u0Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) u0Var.getLayoutParams();
            kVar5 = ((org.telegram.ui.ActionBar.m2) syVar).actionBar;
            if (kVar5.getOccupyStatusBar()) {
                i14 = AndroidUtilities.statusBarHeight;
            } else {
                i14 = 0;
            }
            layoutParams.topMargin = i14;
            layoutParams.height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        kVar = ((org.telegram.ui.ActionBar.m2) syVar).actionBar;
        measureChildWithMargins(kVar, i10, 0, i11, 0);
        int R = R();
        int childCount = getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt != null && childAt.getVisibility() != 8) {
                kVar2 = ((org.telegram.ui.ActionBar.m2) syVar).actionBar;
                if (childAt != kVar2) {
                    if (childAt instanceof zu) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                        int size3 = View.MeasureSpec.getSize(i11);
                        int dp = AndroidUtilities.dp(10.0f);
                        int dp2 = AndroidUtilities.dp(2.0f) + size3;
                        kVar4 = ((org.telegram.ui.ActionBar.m2) syVar).actionBar;
                        childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max(dp, dp2 - kVar4.getMeasuredHeight()), 1073741824));
                    } else if (childAt instanceof ry) {
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                        int dp3 = AndroidUtilities.dp(2.0f) + size2;
                        if (syVar.F3.c()) {
                            if (syVar.f42031w) {
                                dp3 = AndroidUtilities.dp(50.0f) + dp3;
                            }
                            if (syVar.K) {
                                dp3 = AndroidUtilities.dp(81.0f) + dp3;
                            }
                            dp3 = AndroidUtilities.dp(48.0f) + dp3;
                        }
                        int i17 = dp3 + syVar.P;
                        if (syVar.f42024u3 == null) {
                            childAt.setTranslationY(0.0f);
                        }
                        if (syVar.Y3) {
                            i13 = (int) (i17 * 0.05f);
                        } else {
                            i13 = 0;
                        }
                        childAt.setPadding(childAt.getPaddingLeft(), childAt.getPaddingTop(), childAt.getPaddingRight(), i13);
                        childAt.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), i17 + i13), 1073741824));
                        childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                    } else {
                        cy cyVar = syVar.C0;
                        if (childAt == cyVar) {
                            cyVar.setTranslationY(syVar.I0);
                            syVar.C0.f26178p0.setKeyboardHeight(R);
                            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                            int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(i15) + View.MeasureSpec.getSize(i11), 1073741824);
                            syVar.D3(true);
                            childAt.measure(makeMeasureSpec3, makeMeasureSpec4);
                            childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                            Rect rect = AndroidUtilities.rectTmp2;
                            kVar3 = ((org.telegram.ui.ActionBar.m2) syVar).actionBar;
                            rect.set(0, (AndroidUtilities.dp(i15) + kVar3.getMeasuredHeight()) - AndroidUtilities.dp(2.0f), childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
                        } else {
                            cx cxVar = syVar.B1;
                            if (cxVar != null && cxVar.s0(childAt)) {
                                if (AndroidUtilities.isInMultiwindow) {
                                    if (AndroidUtilities.isTablet()) {
                                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(320.0f), getPaddingTop() + (size2 - AndroidUtilities.statusBarHeight)), 1073741824));
                                    } else {
                                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size2 - AndroidUtilities.statusBarHeight), 1073741824));
                                    }
                                } else {
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                                }
                            } else if (childAt == syVar.F3) {
                                int size4 = View.MeasureSpec.getSize(i11);
                                if (syVar.Y3) {
                                    i12 = (int) (size4 * 0.05f);
                                } else {
                                    i12 = 0;
                                }
                                syVar.F3.setTransitionPaddingBottom(i12);
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
            post(new ky(this, 1));
            this.C0 = z10;
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ly.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        sy syVar = this.E0;
        if (syVar.f41981m3 && !syVar.f41978l3) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }
}
