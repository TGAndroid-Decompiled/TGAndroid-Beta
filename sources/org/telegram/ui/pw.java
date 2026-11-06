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
public final class pw extends org.telegram.ui.Components.rt0 {
    public final Paint f48930f0;
    public int f48931g0;
    public int f48932h0;
    public int f48933i0;
    public VelocityTracker f48934j0;
    public final Rect f48935k0;
    public boolean f48936l0;
    public final org.telegram.ui.Cells.l9 m0;
    public final ww f48937n0;

    public pw(Context context, ww wwVar) {
        super(context, null);
        this.f48937n0 = wwVar;
        this.f48930f0 = new Paint(1);
        this.f48935k0 = new Rect();
        this.m0 = new org.telegram.ui.Cells.l9(new f(this, 14));
    }

    @Override
    public final void H(android.graphics.Canvas r10, float r11, android.graphics.Rect r12, android.graphics.Paint r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pw.H(android.graphics.Canvas, float, android.graphics.Rect, android.graphics.Paint, boolean):void");
    }

    @Override
    public final void J(Canvas canvas, ArrayList arrayList) {
        fw fwVar;
        org.telegram.ui.Components.pj0 p10;
        ww wwVar = this.f48937n0;
        if (wwVar.f51594q3 && (fwVar = wwVar.C0) != null && fwVar.getVisibility() == 0) {
            fw fwVar2 = wwVar.C0;
            View[] viewArr = fwVar2.f36906e;
            for (int i7 = 0; i7 < viewArr.length; i7++) {
                View view = viewArr[i7];
                if (view != null && view.getVisibility() == 0 && (p10 = org.telegram.ui.Components.p61.p(viewArr[i7])) != null) {
                    for (int i10 = 0; i10 < p10.getChildCount(); i10++) {
                        View childAt = p10.getChildAt(i10);
                        if (childAt.getY() < org.telegram.messenger.g0.L(100.0f) + org.telegram.messenger.g0.L(203.0f)) {
                            int save = canvas.save();
                            canvas.translate(viewArr[i7].getX(), childAt.getY() + p10.getY() + viewArr[i7].getY() + fwVar2.getY());
                            childAt.draw(canvas);
                            canvas.restoreToCount(save);
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void L() {
        oi.q qVar;
        org.telegram.messenger.iz.f();
        qVar = ((org.telegram.ui.ActionBar.f2) this.f48937n0).glassEngine;
        qVar.g();
    }

    @Override
    public final boolean N() {
        return true;
    }

    public final boolean X() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pw.X():boolean");
    }

    public final int Y() {
        org.telegram.ui.ActionBar.k kVar;
        float f10;
        ww wwVar = this.f48937n0;
        kVar = ((org.telegram.ui.ActionBar.f2) wwVar).actionBar;
        float height = kVar.getHeight();
        sv svVar = wwVar.F3;
        if (svVar != null && svVar.c()) {
            f10 = wwVar.F3.f51665e;
        } else {
            f10 = 0.0f;
        }
        if (wwVar.K) {
            height = com.google.android.recaptcha.internal.a.z(1.0f, wwVar.f51616u3, (1.0f - f10) * (1.0f - wwVar.f51631x1) * org.telegram.messenger.g0.L(81.0f), height);
        }
        return (int) com.google.android.recaptcha.internal.a.z(1.0f, f10, (1.0f - wwVar.f51631x1) * (1.0f - wwVar.f51616u3) * org.telegram.messenger.g0.L(48.0f), height + wwVar.T);
    }

    public final int Z() {
        float f10;
        ww wwVar = this.f48937n0;
        float f11 = wwVar.N;
        sv svVar = wwVar.F3;
        if (svVar != null && svVar.c()) {
            f10 = wwVar.F3.f51665e;
        } else {
            f10 = 0.0f;
        }
        return (int) com.google.android.recaptcha.internal.a.z(1.0f, wwVar.f51631x1, org.telegram.messenger.k5.A(1.0f, f10, 1.0f - wwVar.f51616u3, f11), -getY());
    }

    public final boolean a0(MotionEvent motionEvent, boolean z9) {
        int i7;
        org.telegram.ui.ActionBar.k kVar;
        vw[] vwVarArr;
        vw[] vwVarArr2;
        ww wwVar = this.f48937n0;
        mw mwVar = wwVar.f51639z0;
        SparseIntArray sparseIntArray = mwVar.f33389j0;
        int i10 = mwVar.K;
        if (z9) {
            i7 = 1;
        } else {
            i7 = -1;
        }
        int i11 = sparseIntArray.get(i10 + i7, -1);
        if (i11 < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        wwVar.f51580n3 = false;
        wwVar.f51575m3 = true;
        this.f48932h0 = (int) (motionEvent.getX() + wwVar.j3);
        kVar = ((org.telegram.ui.ActionBar.f2) wwVar).actionBar;
        kVar.setEnabled(false);
        wwVar.f51639z0.setEnabled(false);
        vw vwVar = wwVar.f51534e0[1];
        vwVar.h = i11;
        vwVar.setVisibility(0);
        wwVar.f51558i3 = z9;
        ww.j1(wwVar, false);
        wwVar.d5(true);
        if (z9) {
            wwVar.f51534e0[1].setTranslationX(vwVarArr2[0].getMeasuredWidth());
            return true;
        }
        wwVar.f51534e0[1].setTranslationX(-vwVarArr[0].getMeasuredWidth());
        return true;
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pw.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.m0.a(this, motionEvent) && !super.dispatchTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        ww wwVar = this.f48937n0;
        if (view == wwVar.K0) {
            return true;
        }
        if (org.telegram.ui.Components.rt0.f37836e0) {
            return super.drawChild(canvas, view, j3);
        }
        vw[] vwVarArr = wwVar.f51534e0;
        int i7 = 0;
        if (view != vwVarArr[0] && ((vwVarArr.length <= 1 || view != vwVarArr[1]) && view != wwVar.J1 && view != wwVar.f51639z0)) {
            kVar = ((org.telegram.ui.ActionBar.f2) wwVar).actionBar;
            if (view == kVar && wwVar.W3 != 1.0f) {
                canvas.save();
                if (wwVar.X3) {
                    canvas.translate((1.0f - wwVar.W3) * org.telegram.messenger.g0.L(40.0f) * (-1), 0.0f);
                } else {
                    float v = com.google.android.recaptcha.internal.a.v(1.0f, wwVar.W3, 0.05f, 1.0f);
                    canvas.translate((1.0f - wwVar.W3) * (-org.telegram.messenger.g0.L(4.0f)), 0.0f);
                    kVar2 = ((org.telegram.ui.ActionBar.f2) wwVar).actionBar;
                    if (kVar2.getOccupyStatusBar()) {
                        i7 = org.telegram.messenger.g0.f22531m;
                    }
                    canvas.scale(v, v, 0.0f, (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + i7);
                }
                boolean drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild;
            }
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        if (view != wwVar.J1 && view != wwVar.f51639z0) {
            canvas.clipRect(0.0f, (-getY()) + Z() + Y(), getMeasuredWidth(), getMeasuredHeight());
        }
        float f10 = wwVar.W3;
        if (f10 != 1.0f) {
            if (wwVar.X3) {
                canvas.translate((1.0f - wwVar.W3) * org.telegram.messenger.g0.L(40.0f) * (-1), 0.0f);
            } else {
                float v10 = com.google.android.recaptcha.internal.a.v(1.0f, f10, 0.05f, 1.0f);
                canvas.translate((1.0f - wwVar.W3) * (-org.telegram.messenger.g0.L(4.0f)), 0.0f);
                canvas.scale(v10, v10, 0.0f, (-getY()) + wwVar.N + Y());
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
        org.telegram.ui.Components.g5 g5Var = this.f48937n0.D3;
        if (g5Var != null) {
            g5Var.a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.g5 g5Var = this.f48937n0.D3;
        if (g5Var != null) {
            g5Var.b();
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        mw mwVar;
        int actionMasked = motionEvent.getActionMasked();
        ww wwVar = this.f48937n0;
        if (actionMasked == 1 || actionMasked == 3) {
            kVar = ((org.telegram.ui.ActionBar.f2) wwVar).actionBar;
            if (kVar.v()) {
                wwVar.Y0 = true;
            }
        }
        if (X() || (((mwVar = wwVar.f51639z0) != null && mwVar.O) || onTouchEvent(motionEvent))) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pw.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        boolean z9;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        int i11;
        org.telegram.ui.ActionBar.k kVar3;
        int i12;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        int i13;
        ww wwVar = this.f48937n0;
        int i14 = wwVar.f51511a;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        if (size2 > size) {
            z9 = true;
        } else {
            z9 = false;
        }
        setMeasuredDimension(size, size2);
        org.telegram.ui.ActionBar.r0 r0Var = wwVar.m0;
        if (r0Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) r0Var.getLayoutParams();
            kVar5 = ((org.telegram.ui.ActionBar.f2) wwVar).actionBar;
            if (kVar5.getOccupyStatusBar()) {
                i13 = org.telegram.messenger.g0.f22531m;
            } else {
                i13 = 0;
            }
            layoutParams.topMargin = i13;
            layoutParams.height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        kVar = ((org.telegram.ui.ActionBar.f2) wwVar).actionBar;
        measureChildWithMargins(kVar, i7, 0, i10, 0);
        int Q = Q();
        int childCount = getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt != null && childAt.getVisibility() != 8) {
                kVar2 = ((org.telegram.ui.ActionBar.f2) wwVar).actionBar;
                if (childAt != kVar2) {
                    if (childAt instanceof mt) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                        int size3 = View.MeasureSpec.getSize(i10);
                        int L = org.telegram.messenger.g0.L(10.0f);
                        int L2 = org.telegram.messenger.g0.L(2.0f) + size3;
                        kVar4 = ((org.telegram.ui.ActionBar.f2) wwVar).actionBar;
                        childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max(L, L2 - kVar4.getMeasuredHeight()), 1073741824));
                    } else if (childAt instanceof vw) {
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                        int L3 = org.telegram.messenger.g0.L(2.0f) + size2;
                        if (wwVar.F3.c()) {
                            if (wwVar.f51629x) {
                                L3 = org.telegram.messenger.g0.L(50.0f) + L3;
                            }
                            if (wwVar.K) {
                                L3 = org.telegram.messenger.g0.L(81.0f) + L3;
                            }
                            L3 = org.telegram.messenger.g0.L(48.0f) + L3;
                        }
                        int i16 = L3 + wwVar.P;
                        if (wwVar.f51621v3 == null) {
                            childAt.setTranslationY(0.0f);
                        }
                        if (wwVar.Y3) {
                            i12 = (int) (i16 * 0.05f);
                        } else {
                            i12 = 0;
                        }
                        childAt.setPadding(childAt.getPaddingLeft(), childAt.getPaddingTop(), childAt.getPaddingRight(), i12);
                        childAt.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max(org.telegram.messenger.g0.L(10.0f), i16 + i12), 1073741824));
                        childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                    } else {
                        fw fwVar = wwVar.C0;
                        if (childAt == fwVar) {
                            fwVar.setTranslationY(wwVar.I0);
                            wwVar.C0.f33650r0.setKeyboardHeight(Q);
                            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                            int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(i14) + View.MeasureSpec.getSize(i10), 1073741824);
                            wwVar.S3(true);
                            childAt.measure(makeMeasureSpec3, makeMeasureSpec4);
                            childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                            Rect rect = org.telegram.messenger.g0.Q;
                            kVar3 = ((org.telegram.ui.ActionBar.f2) wwVar).actionBar;
                            rect.set(0, (org.telegram.messenger.g0.L(i14) + kVar3.getMeasuredHeight()) - org.telegram.messenger.g0.L(2.0f), childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
                        } else {
                            jv jvVar = wwVar.B1;
                            if (jvVar != null && jvVar.t0(childAt)) {
                                if (org.telegram.messenger.g0.E) {
                                    if (org.telegram.messenger.g0.Q1()) {
                                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(320.0f), getPaddingTop() + (size2 - org.telegram.messenger.g0.f22531m)), 1073741824));
                                    } else {
                                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size2 - org.telegram.messenger.g0.f22531m), 1073741824));
                                    }
                                } else {
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                                }
                            } else if (childAt == wwVar.F3) {
                                int size4 = View.MeasureSpec.getSize(i10);
                                if (wwVar.Y3) {
                                    i11 = (int) (size4 * 0.05f);
                                } else {
                                    i11 = 0;
                                }
                                wwVar.F3.setTransitionPaddingBottom(i11);
                                childAt.measure(i7, View.MeasureSpec.makeMeasureSpec(Math.max(org.telegram.messenger.g0.L(10.0f), size4 + i11), 1073741824));
                            } else {
                                measureChildWithMargins(childAt, i7, 0, i10, 0);
                            }
                        }
                    }
                }
            }
        }
        if (z9 != this.f48936l0) {
            post(new ow(this, 1));
            this.f48936l0 = z9;
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pw.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z9) {
        ww wwVar = this.f48937n0;
        if (wwVar.f51580n3 && !wwVar.f51575m3) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z9);
    }
}
