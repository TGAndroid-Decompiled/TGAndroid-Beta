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
public final class py extends org.telegram.ui.Components.aw0 {
    public VelocityTracker A0;
    public final Rect B0;
    public boolean C0;
    public final me.b D0;
    public final wy E0;
    public final Paint f35923w0;
    public int f35924x0;
    public int f35925y0;
    public int f35926z0;

    public py(Context context, wy wyVar) {
        super(context, null);
        this.E0 = wyVar;
        this.f35923w0 = new Paint(1);
        this.B0 = new Rect();
        this.D0 = new me.b(new g(this, 15));
    }

    @Override
    public final void J(android.graphics.Canvas r10, float r11, android.graphics.Rect r12, android.graphics.Paint r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.py.J(android.graphics.Canvas, float, android.graphics.Rect, android.graphics.Paint, boolean):void");
    }

    @Override
    public final void L(Canvas canvas, ArrayList arrayList) {
        gy gyVar;
        org.telegram.ui.Components.vl0 p5;
        wy wyVar = this.E0;
        if (wyVar.f38487p3 && (gyVar = wyVar.C0) != null && gyVar.getVisibility() == 0) {
            gy gyVar2 = wyVar.C0;
            View[] viewArr = gyVar2.e;
            for (int i10 = 0; i10 < viewArr.length; i10++) {
                View view = viewArr[i10];
                if (view != null && view.getVisibility() == 0 && (p5 = org.telegram.ui.Components.v81.p(viewArr[i10])) != null) {
                    for (int i11 = 0; i11 < p5.getChildCount(); i11++) {
                        View childAt = p5.getChildAt(i11);
                        if (childAt.getY() < AndroidUtilities.dp(100.0f) + AndroidUtilities.dp(203.0f)) {
                            int save = canvas.save();
                            canvas.translate(viewArr[i10].getX(), childAt.getY() + p5.getY() + viewArr[i10].getY() + gyVar2.getY());
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.py.Z():boolean");
    }

    public final int a0() {
        org.telegram.ui.ActionBar.l lVar;
        float f7;
        wy wyVar = this.E0;
        lVar = ((org.telegram.ui.ActionBar.p2) wyVar).actionBar;
        float height = lVar.getHeight();
        qx qxVar = wyVar.F3;
        if (qxVar != null && qxVar.c()) {
            f7 = wyVar.F3.e;
        } else {
            f7 = 0.0f;
        }
        if (wyVar.K) {
            height = com.google.android.gms.internal.vision.e2.z(1.0f, wyVar.f38509t3, (1.0f - f7) * (1.0f - wyVar.f38529x1) * AndroidUtilities.dp(81.0f), height);
        }
        return (int) com.google.android.gms.internal.vision.e2.z(1.0f, f7, (1.0f - wyVar.f38529x1) * (1.0f - wyVar.f38509t3) * AndroidUtilities.dp(48.0f), height + wyVar.T);
    }

    public final int b0() {
        float f7;
        wy wyVar = this.E0;
        float f10 = wyVar.N;
        qx qxVar = wyVar.F3;
        if (qxVar != null && qxVar.c()) {
            f7 = wyVar.F3.e;
        } else {
            f7 = 0.0f;
        }
        return (int) com.google.android.gms.internal.vision.e2.z(1.0f, wyVar.f38529x1, org.telegram.messenger.a2.A(1.0f, f7, 1.0f - wyVar.f38509t3, f10), -getY());
    }

    public final boolean c0(MotionEvent motionEvent, boolean z10) {
        int i10;
        org.telegram.ui.ActionBar.l lVar;
        wy wyVar = this.E0;
        uw uwVar = wyVar.f38536z0;
        SparseIntArray sparseIntArray = uwVar.f26525j0;
        int i11 = uwVar.K;
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
        wyVar.f38471m3 = false;
        wyVar.f38468l3 = true;
        this.f35925y0 = (int) (motionEvent.getX() + wyVar.f38455i3);
        lVar = ((org.telegram.ui.ActionBar.p2) wyVar).actionBar;
        lVar.setEnabled(false);
        wyVar.f38536z0.setEnabled(false);
        vy vyVar = wyVar.f38431e0[1];
        vyVar.h = i12;
        vyVar.setVisibility(0);
        wyVar.f38450h3 = z10;
        wy.f1(wyVar, false);
        wyVar.R4(true);
        if (z10) {
            vy[] vyVarArr = wyVar.f38431e0;
            vyVarArr[1].setTranslationX(vyVarArr[0].getMeasuredWidth());
            return true;
        }
        vy[] vyVarArr2 = wyVar.f38431e0;
        vyVarArr2[1].setTranslationX(-vyVarArr2[0].getMeasuredWidth());
        return true;
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.py.dispatchDraw(android.graphics.Canvas):void");
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
        wy wyVar = this.E0;
        if (view == wyVar.K0) {
            return true;
        }
        if (org.telegram.ui.Components.aw0.f21621v0) {
            return super.drawChild(canvas, view, j3);
        }
        vy[] vyVarArr = wyVar.f38431e0;
        int i10 = 0;
        if (view != vyVarArr[0] && ((vyVarArr.length <= 1 || view != vyVarArr[1]) && view != wyVar.J1 && view != wyVar.f38536z0)) {
            lVar = ((org.telegram.ui.ActionBar.p2) wyVar).actionBar;
            if (view == lVar && wyVar.X3 != 1.0f) {
                canvas.save();
                if (wyVar.Y3) {
                    canvas.translate((1.0f - wyVar.X3) * AndroidUtilities.dp(40.0f) * (-1), 0.0f);
                } else {
                    float a2 = com.google.android.gms.internal.vision.e2.a(1.0f, wyVar.X3, 0.05f, 1.0f);
                    canvas.translate((1.0f - wyVar.X3) * (-AndroidUtilities.dp(4.0f)), 0.0f);
                    lVar2 = ((org.telegram.ui.ActionBar.p2) wyVar).actionBar;
                    if (lVar2.getOccupyStatusBar()) {
                        i10 = AndroidUtilities.statusBarHeight;
                    }
                    canvas.scale(a2, a2, 0.0f, (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2.0f) + i10);
                }
                boolean drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild;
            }
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        if (view != wyVar.J1 && view != wyVar.f38536z0) {
            canvas.clipRect(0.0f, (-getY()) + b0() + a0(), getMeasuredWidth(), getMeasuredHeight());
        }
        float f7 = wyVar.X3;
        if (f7 != 1.0f) {
            if (wyVar.Y3) {
                canvas.translate((1.0f - wyVar.X3) * AndroidUtilities.dp(40.0f) * (-1), 0.0f);
            } else {
                float a10 = com.google.android.gms.internal.vision.e2.a(1.0f, f7, 0.05f, 1.0f);
                canvas.translate((1.0f - wyVar.X3) * (-AndroidUtilities.dp(4.0f)), 0.0f);
                canvas.scale(a10, a10, 0.0f, (-getY()) + wyVar.N + a0());
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
        org.telegram.ui.Components.n5 n5Var = this.E0.D3;
        if (n5Var != null) {
            n5Var.a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.n5 n5Var = this.E0.D3;
        if (n5Var != null) {
            n5Var.b();
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.l lVar;
        uw uwVar;
        int actionMasked = motionEvent.getActionMasked();
        wy wyVar = this.E0;
        if (actionMasked == 1 || actionMasked == 3) {
            lVar = ((org.telegram.ui.ActionBar.p2) wyVar).actionBar;
            if (lVar.s()) {
                wyVar.Y0 = true;
            }
        }
        if (Z() || (((uwVar = wyVar.f38536z0) != null && uwVar.O) || onTouchEvent(motionEvent))) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.py.onLayout(boolean, int, int, int, int):void");
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
        wy wyVar = this.E0;
        int i15 = wyVar.f38409a;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (size2 > size) {
            z10 = true;
        } else {
            z10 = false;
        }
        setMeasuredDimension(size, size2);
        org.telegram.ui.ActionBar.w0 w0Var = wyVar.m0;
        if (w0Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) w0Var.getLayoutParams();
            lVar5 = ((org.telegram.ui.ActionBar.p2) wyVar).actionBar;
            if (lVar5.getOccupyStatusBar()) {
                i14 = AndroidUtilities.statusBarHeight;
            } else {
                i14 = 0;
            }
            layoutParams.topMargin = i14;
            layoutParams.height = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        }
        lVar = ((org.telegram.ui.ActionBar.p2) wyVar).actionBar;
        measureChildWithMargins(lVar, i10, 0, i11, 0);
        int R = R();
        int childCount = getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt != null && childAt.getVisibility() != 8) {
                lVar2 = ((org.telegram.ui.ActionBar.p2) wyVar).actionBar;
                if (childAt != lVar2) {
                    if (childAt instanceof dv) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                        int size3 = View.MeasureSpec.getSize(i11);
                        int dp = AndroidUtilities.dp(10.0f);
                        int dp2 = AndroidUtilities.dp(2.0f) + size3;
                        lVar4 = ((org.telegram.ui.ActionBar.p2) wyVar).actionBar;
                        childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max(dp, dp2 - lVar4.getMeasuredHeight()), 1073741824));
                    } else if (childAt instanceof vy) {
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                        int dp3 = AndroidUtilities.dp(2.0f) + size2;
                        if (wyVar.F3.c()) {
                            if (wyVar.f38521w) {
                                dp3 = AndroidUtilities.dp(50.0f) + dp3;
                            }
                            if (wyVar.K) {
                                dp3 = AndroidUtilities.dp(81.0f) + dp3;
                            }
                            dp3 = AndroidUtilities.dp(48.0f) + dp3;
                        }
                        int i17 = dp3 + wyVar.P;
                        if (wyVar.f38514u3 == null) {
                            childAt.setTranslationY(0.0f);
                        }
                        if (wyVar.Z3) {
                            i13 = (int) (i17 * 0.05f);
                        } else {
                            i13 = 0;
                        }
                        childAt.setPadding(childAt.getPaddingLeft(), childAt.getPaddingTop(), childAt.getPaddingRight(), i13);
                        childAt.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), i17 + i13), 1073741824));
                        childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                    } else {
                        gy gyVar = wyVar.C0;
                        if (childAt == gyVar) {
                            gyVar.setTranslationY(wyVar.I0);
                            wyVar.C0.f23726p0.setKeyboardHeight(R);
                            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                            int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(i15) + View.MeasureSpec.getSize(i11), 1073741824);
                            wyVar.G3(true);
                            childAt.measure(makeMeasureSpec3, makeMeasureSpec4);
                            childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                            Rect rect = AndroidUtilities.rectTmp2;
                            lVar3 = ((org.telegram.ui.ActionBar.p2) wyVar).actionBar;
                            rect.set(0, (AndroidUtilities.dp(i15) + lVar3.getMeasuredHeight()) - AndroidUtilities.dp(2.0f), childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
                        } else {
                            gx gxVar = wyVar.B1;
                            if (gxVar != null && gxVar.u0(childAt)) {
                                if (AndroidUtilities.isInMultiwindow) {
                                    if (AndroidUtilities.isTablet()) {
                                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(320.0f), getPaddingTop() + (size2 - AndroidUtilities.statusBarHeight)), 1073741824));
                                    } else {
                                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size2 - AndroidUtilities.statusBarHeight), 1073741824));
                                    }
                                } else {
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                                }
                            } else if (childAt == wyVar.F3) {
                                int size4 = View.MeasureSpec.getSize(i11);
                                if (wyVar.Z3) {
                                    i12 = (int) (size4 * 0.05f);
                                } else {
                                    i12 = 0;
                                }
                                wyVar.F3.setTransitionPaddingBottom(i12);
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
            post(new oy(this, 1));
            this.C0 = z10;
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.py.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        wy wyVar = this.E0;
        if (wyVar.f38471m3 && !wyVar.f38468l3) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }
}
