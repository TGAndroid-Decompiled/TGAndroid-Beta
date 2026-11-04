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
public final class mw extends org.telegram.ui.Components.qt0 {
    public final Paint f47794g0;
    public int f47795h0;
    public int f47796i0;
    public int f47797j0;
    public VelocityTracker f47798k0;
    public final Rect f47799l0;
    public boolean m0;
    public final org.telegram.ui.Cells.k9 f47800n0;
    public final uw f47801o0;

    public mw(Context context, uw uwVar) {
        super(context, null);
        this.f47801o0 = uwVar;
        this.f47794g0 = new Paint(1);
        this.f47799l0 = new Rect();
        this.f47800n0 = new org.telegram.ui.Cells.k9(new f(this, 14));
    }

    @Override
    public final void H(android.graphics.Canvas r10, float r11, android.graphics.Rect r12, android.graphics.Paint r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mw.H(android.graphics.Canvas, float, android.graphics.Rect, android.graphics.Paint, boolean):void");
    }

    @Override
    public final void J(Canvas canvas, ArrayList arrayList) {
        cw cwVar;
        org.telegram.ui.Components.tj0 l10;
        uw uwVar = this.f47801o0;
        if (uwVar.f50290r3 && (cwVar = uwVar.D0) != null && cwVar.getVisibility() == 0) {
            cw cwVar2 = uwVar.D0;
            View[] viewArr = cwVar2.f36386e;
            for (int i3 = 0; i3 < viewArr.length; i3++) {
                View view = viewArr[i3];
                if (view != null && view.getVisibility() == 0 && (l10 = org.telegram.ui.Components.n61.l(viewArr[i3])) != null) {
                    for (int i10 = 0; i10 < l10.getChildCount(); i10++) {
                        View childAt = l10.getChildAt(i10);
                        if (childAt.getY() < org.telegram.messenger.g0.L(100.0f) + org.telegram.messenger.g0.L(203.0f)) {
                            int save = canvas.save();
                            canvas.translate(viewArr[i3].getX(), childAt.getY() + l10.getY() + viewArr[i3].getY() + cwVar2.getY());
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
        pi.q qVar;
        org.telegram.messenger.az.f();
        qVar = ((org.telegram.ui.ActionBar.d2) this.f47801o0).glassEngine;
        qVar.g();
    }

    @Override
    public final boolean N() {
        return true;
    }

    public final boolean X() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mw.X():boolean");
    }

    public final int Y() {
        org.telegram.ui.ActionBar.k kVar;
        float f10;
        uw uwVar = this.f47801o0;
        kVar = ((org.telegram.ui.ActionBar.d2) uwVar).actionBar;
        float height = kVar.getHeight();
        pv pvVar = uwVar.G3;
        if (pvVar != null && pvVar.c()) {
            f10 = uwVar.G3.f47828e;
        } else {
            f10 = 0.0f;
        }
        if (uwVar.L) {
            height = com.google.android.recaptcha.internal.a.y(1.0f, uwVar.f50311v3, (1.0f - f10) * (1.0f - uwVar.f50327y1) * org.telegram.messenger.g0.L(81.0f), height);
        }
        return (int) com.google.android.recaptcha.internal.a.y(1.0f, f10, (1.0f - uwVar.f50327y1) * (1.0f - uwVar.f50311v3) * org.telegram.messenger.g0.L(48.0f), height + uwVar.U);
    }

    public final int Z() {
        float f10;
        uw uwVar = this.f47801o0;
        float f11 = uwVar.O;
        pv pvVar = uwVar.G3;
        if (pvVar != null && pvVar.c()) {
            f10 = uwVar.G3.f47828e;
        } else {
            f10 = 0.0f;
        }
        return (int) com.google.android.recaptcha.internal.a.y(1.0f, uwVar.f50327y1, org.telegram.messenger.k5.A(1.0f, f10, 1.0f - uwVar.f50311v3, f11), -getY());
    }

    public final boolean a0(MotionEvent motionEvent, boolean z10) {
        int i3;
        org.telegram.ui.ActionBar.k kVar;
        tw[] twVarArr;
        tw[] twVarArr2;
        uw uwVar = this.f47801o0;
        jw jwVar = uwVar.A0;
        SparseIntArray sparseIntArray = jwVar.f32457k0;
        int i10 = jwVar.L;
        if (z10) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        int i11 = sparseIntArray.get(i10 + i3, -1);
        if (i11 < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        uwVar.f50274o3 = false;
        uwVar.f50270n3 = true;
        this.f47796i0 = (int) (motionEvent.getX() + uwVar.f50256k3);
        kVar = ((org.telegram.ui.ActionBar.d2) uwVar).actionBar;
        kVar.setEnabled(false);
        uwVar.A0.setEnabled(false);
        tw twVar = uwVar.f50230f0[1];
        twVar.h = i11;
        twVar.setVisibility(0);
        uwVar.f50252j3 = z10;
        uw.j1(uwVar, false);
        uwVar.d5(true);
        if (z10) {
            uwVar.f50230f0[1].setTranslationX(twVarArr2[0].getMeasuredWidth());
            return true;
        }
        uwVar.f50230f0[1].setTranslationX(-twVarArr[0].getMeasuredWidth());
        return true;
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mw.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f47800n0.a(this, motionEvent) && !super.dispatchTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        uw uwVar = this.f47801o0;
        if (view == uwVar.L0) {
            return true;
        }
        if (org.telegram.ui.Components.qt0.f37525f0) {
            return super.drawChild(canvas, view, j10);
        }
        tw[] twVarArr = uwVar.f50230f0;
        int i3 = 0;
        if (view != twVarArr[0] && ((twVarArr.length <= 1 || view != twVarArr[1]) && view != uwVar.K1 && view != uwVar.A0)) {
            kVar = ((org.telegram.ui.ActionBar.d2) uwVar).actionBar;
            if (view == kVar && uwVar.X3 != 1.0f) {
                canvas.save();
                if (uwVar.Y3) {
                    canvas.translate((1.0f - uwVar.X3) * org.telegram.messenger.g0.L(40.0f) * (-1), 0.0f);
                } else {
                    float D = a1.g.D(1.0f, uwVar.X3, 0.05f, 1.0f);
                    canvas.translate((1.0f - uwVar.X3) * (-org.telegram.messenger.g0.L(4.0f)), 0.0f);
                    kVar2 = ((org.telegram.ui.ActionBar.d2) uwVar).actionBar;
                    if (kVar2.getOccupyStatusBar()) {
                        i3 = org.telegram.messenger.g0.f22602m;
                    }
                    canvas.scale(D, D, 0.0f, (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + i3);
                }
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            }
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        if (view != uwVar.K1 && view != uwVar.A0) {
            canvas.clipRect(0.0f, (-getY()) + Z() + Y(), getMeasuredWidth(), getMeasuredHeight());
        }
        float f10 = uwVar.X3;
        if (f10 != 1.0f) {
            if (uwVar.Y3) {
                canvas.translate((1.0f - uwVar.X3) * org.telegram.messenger.g0.L(40.0f) * (-1), 0.0f);
            } else {
                float D2 = a1.g.D(1.0f, f10, 0.05f, 1.0f);
                canvas.translate((1.0f - uwVar.X3) * (-org.telegram.messenger.g0.L(4.0f)), 0.0f);
                canvas.scale(D2, D2, 0.0f, (-getY()) + uwVar.O + Y());
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
        org.telegram.ui.Components.e5 e5Var = this.f47801o0.E3;
        if (e5Var != null) {
            e5Var.a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.e5 e5Var = this.f47801o0.E3;
        if (e5Var != null) {
            e5Var.b();
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        jw jwVar;
        int actionMasked = motionEvent.getActionMasked();
        uw uwVar = this.f47801o0;
        if (actionMasked == 1 || actionMasked == 3) {
            kVar = ((org.telegram.ui.ActionBar.d2) uwVar).actionBar;
            if (kVar.v()) {
                uwVar.Z0 = true;
            }
        }
        if (X() || (((jwVar = uwVar.A0) != null && jwVar.P) || onTouchEvent(motionEvent))) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mw.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        boolean z10;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        int i11;
        org.telegram.ui.ActionBar.k kVar3;
        int i12;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        int i13;
        uw uwVar = this.f47801o0;
        int i14 = uwVar.f50201a;
        int size = View.MeasureSpec.getSize(i3);
        int size2 = View.MeasureSpec.getSize(i10);
        if (size2 > size) {
            z10 = true;
        } else {
            z10 = false;
        }
        setMeasuredDimension(size, size2);
        org.telegram.ui.ActionBar.q0 q0Var = uwVar.f50267n0;
        if (q0Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) q0Var.getLayoutParams();
            kVar5 = ((org.telegram.ui.ActionBar.d2) uwVar).actionBar;
            if (kVar5.getOccupyStatusBar()) {
                i13 = org.telegram.messenger.g0.f22602m;
            } else {
                i13 = 0;
            }
            layoutParams.topMargin = i13;
            layoutParams.height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        kVar = ((org.telegram.ui.ActionBar.d2) uwVar).actionBar;
        measureChildWithMargins(kVar, i3, 0, i10, 0);
        int Q = Q();
        int childCount = getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt != null && childAt.getVisibility() != 8) {
                kVar2 = ((org.telegram.ui.ActionBar.d2) uwVar).actionBar;
                if (childAt != kVar2) {
                    if (childAt instanceof kt) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                        int size3 = View.MeasureSpec.getSize(i10);
                        int L = org.telegram.messenger.g0.L(10.0f);
                        int L2 = org.telegram.messenger.g0.L(2.0f) + size3;
                        kVar4 = ((org.telegram.ui.ActionBar.d2) uwVar).actionBar;
                        childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max(L, L2 - kVar4.getMeasuredHeight()), 1073741824));
                    } else if (childAt instanceof tw) {
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                        int L3 = org.telegram.messenger.g0.L(2.0f) + size2;
                        if (uwVar.G3.c()) {
                            if (uwVar.f50319x) {
                                L3 = org.telegram.messenger.g0.L(50.0f) + L3;
                            }
                            if (uwVar.L) {
                                L3 = org.telegram.messenger.g0.L(81.0f) + L3;
                            }
                            L3 = org.telegram.messenger.g0.L(48.0f) + L3;
                        }
                        int i16 = L3 + uwVar.Q;
                        if (uwVar.f50317w3 == null) {
                            childAt.setTranslationY(0.0f);
                        }
                        if (uwVar.Z3) {
                            i12 = (int) (i16 * 0.05f);
                        } else {
                            i12 = 0;
                        }
                        childAt.setPadding(childAt.getPaddingLeft(), childAt.getPaddingTop(), childAt.getPaddingRight(), i12);
                        childAt.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max(org.telegram.messenger.g0.L(10.0f), i16 + i12), 1073741824));
                        childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                    } else {
                        cw cwVar = uwVar.D0;
                        if (childAt == cwVar) {
                            cwVar.setTranslationY(uwVar.J0);
                            uwVar.D0.f34764s0.setKeyboardHeight(Q);
                            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                            int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(i14) + View.MeasureSpec.getSize(i10), 1073741824);
                            uwVar.S3(true);
                            childAt.measure(makeMeasureSpec3, makeMeasureSpec4);
                            childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                            Rect rect = org.telegram.messenger.g0.Q;
                            kVar3 = ((org.telegram.ui.ActionBar.d2) uwVar).actionBar;
                            rect.set(0, (org.telegram.messenger.g0.L(i14) + kVar3.getMeasuredHeight()) - org.telegram.messenger.g0.L(2.0f), childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
                        } else {
                            gv gvVar = uwVar.C1;
                            if (gvVar != null && gvVar.s0(childAt)) {
                                if (org.telegram.messenger.g0.E) {
                                    if (org.telegram.messenger.g0.Q1()) {
                                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(320.0f), getPaddingTop() + (size2 - org.telegram.messenger.g0.f22602m)), 1073741824));
                                    } else {
                                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size2 - org.telegram.messenger.g0.f22602m), 1073741824));
                                    }
                                } else {
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                                }
                            } else if (childAt == uwVar.G3) {
                                int size4 = View.MeasureSpec.getSize(i10);
                                if (uwVar.Z3) {
                                    i11 = (int) (size4 * 0.05f);
                                } else {
                                    i11 = 0;
                                }
                                uwVar.G3.setTransitionPaddingBottom(i11);
                                childAt.measure(i3, View.MeasureSpec.makeMeasureSpec(Math.max(org.telegram.messenger.g0.L(10.0f), size4 + i11), 1073741824));
                            } else {
                                measureChildWithMargins(childAt, i3, 0, i10, 0);
                            }
                        }
                    }
                }
            }
        }
        if (z10 != this.m0) {
            post(new lw(this, 1));
            this.m0 = z10;
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mw.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        uw uwVar = this.f47801o0;
        if (uwVar.f50274o3 && !uwVar.f50270n3) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }
}
