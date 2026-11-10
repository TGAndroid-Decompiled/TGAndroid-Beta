package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class ag0 extends org.telegram.ui.Components.pj0 {
    public final ArrayList f43669e3;
    public final org.telegram.ui.Components.v5 f43670f3;
    public final org.telegram.ui.Components.v5 f43671g3;
    public final h6.m f43672h3;
    public final eg0 f43673i3;

    public ag0(eg0 eg0Var, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var);
        this.f43673i3 = eg0Var;
        this.f43669e3 = new ArrayList(10);
        org.telegram.ui.Components.wq wqVar = org.telegram.ui.Components.wq.h;
        this.f43670f3 = new org.telegram.ui.Components.v5(this, 0L, 360L, wqVar);
        this.f43671g3 = new org.telegram.ui.Components.v5(this, 0L, 360L, wqVar);
        this.f43672h3 = new h6.m(28);
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ag0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.Cells.q1 q1Var;
        eg0 eg0Var = this.f43673i3;
        if (eg0Var.f45297w && ((view == (q1Var = eg0Var.P) && q1Var != null && q1Var.getCurrentPosition() == null) || view == eg0Var.W)) {
            return false;
        }
        if (!(view instanceof org.telegram.ui.Cells.q1)) {
            return true;
        }
        org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) view;
        q1Var2.setInvalidatesParent(true);
        q1Var2.S0(canvas);
        canvas.save();
        canvas.translate(q1Var2.getX(), q1Var2.getY());
        canvas.scale(q1Var2.getScaleX(), q1Var2.getScaleY(), q1Var2.getPivotX(), q1Var2.getPivotY());
        if (q1Var2.L0() && q1Var2.getCurrentPosition() == null) {
            canvas.save();
            canvas.translate(0.0f, q1Var2.getPaddingTop());
            q1Var2.M0(canvas, true, false);
            canvas.restore();
        }
        canvas.restore();
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.save();
        canvas.translate(q1Var2.getX(), q1Var2.getY() + q1Var2.getPaddingTop());
        canvas.scale(q1Var2.getScaleX(), q1Var2.getScaleY(), q1Var2.getPivotX(), q1Var2.getPivotY());
        if (q1Var2.getCurrentPosition() != null && (((q1Var2.getCurrentPosition().f21455l & q1Var2.B()) != 0 && (q1Var2.getCurrentPosition().f21455l & 1) != 0) || (q1Var2.getCurrentMessagesGroup() != null && q1Var2.getCurrentMessagesGroup().f22044i))) {
            q1Var2.Q0(q1Var2.getAlpha(), canvas, false);
        }
        if (q1Var2.getCurrentPosition() != null && (((q1Var2.getCurrentPosition().f21455l & 8) != 0 && (q1Var2.getCurrentPosition().f21455l & 1) != 0) || (q1Var2.getCurrentMessagesGroup() != null && q1Var2.getCurrentMessagesGroup().f22044i))) {
            q1Var2.o1(canvas, q1Var2.getAlpha(), null);
            q1Var2.V0(canvas, q1Var2.getAlpha());
        }
        if (q1Var2.getCurrentPosition() != null) {
            q1Var2.h1(canvas, q1Var2.getAlpha());
        }
        if (q1Var2.getCurrentPosition() == null || q1Var2.getCurrentPosition().h) {
            q1Var2.x1(q1Var2.getAlpha(), canvas, true);
        }
        q1Var2.i1(canvas);
        q1Var2.getTransitionParams().d();
        canvas.restore();
        q1Var2.setInvalidatesParent(false);
        return drawChild;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getTop() != 0 && (childAt instanceof dg0)) {
                dg0 dg0Var = (dg0) childAt;
                dg0Var.f44977ld = childAt.getTop();
                dg0Var.f44978md = childAt.getBottom();
                dg0Var.f44979nd = dg0Var.getMessageObject().e1();
            }
        }
        super.onLayout(z9, i7, i10, i11, i12);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        int measuredHeight;
        int l10;
        int i11;
        eg0 eg0Var = this.f43673i3;
        if (eg0Var.M.isEmpty()) {
            f10 = -6.0f;
        } else {
            f10 = 48.0f;
        }
        int L = org.telegram.messenger.g0.L(f10);
        ViewGroup viewGroup = eg0Var.Y;
        if (viewGroup == null) {
            measuredHeight = 0;
        } else {
            measuredHeight = viewGroup.getMeasuredHeight();
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.max(0, ((org.telegram.messenger.g0.f22567q.y - (L + measuredHeight)) - org.telegram.messenger.g0.L(8.0f)) - eg0Var.d.f15123b), Integer.MIN_VALUE));
        if (eg0Var.f45284l0) {
            l10 = eg0Var.X;
        } else {
            l10 = eg0Var.V.l();
        }
        int max = Math.max(org.telegram.messenger.g0.L(12.0f) + l10, -((org.telegram.messenger.g0.L(7.0f) + eg0Var.f45286n0[0]) - getMeasuredWidth()));
        int i12 = eg0Var.N;
        int measuredWidth = getMeasuredWidth() - max;
        if (eg0Var.O.i()) {
            i11 = 0;
        } else {
            i11 = 40;
        }
        float max2 = Math.max(1, getMeasuredWidth() - max) / Math.max(1, ((getMeasuredWidth() - max) - org.telegram.messenger.g0.L(8.0f)) + Math.max(0, i12 - (measuredWidth - org.telegram.messenger.g0.L(i11 + 8))));
        setPivotX(getMeasuredWidth());
        setPivotY(getMeasuredHeight());
        setScaleX(max2);
        setScaleY(max2);
    }
}
