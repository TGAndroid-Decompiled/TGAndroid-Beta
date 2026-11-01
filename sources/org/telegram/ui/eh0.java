package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class eh0 extends org.telegram.ui.Components.uk0 {
    public final ArrayList f36826e3;
    public final org.telegram.ui.Components.t5 f36827f3;
    public final org.telegram.ui.Components.t5 f36828g3;
    public final li.k f36829h3;
    public final ih0 f36830i3;

    public eh0(ih0 ih0Var, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, p6Var);
        this.f36830i3 = ih0Var;
        this.f36826e3 = new ArrayList(10);
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
        this.f36827f3 = new org.telegram.ui.Components.t5(this, 0L, 360L, grVar);
        this.f36828g3 = new org.telegram.ui.Components.t5(this, 0L, 360L, grVar);
        this.f36829h3 = new li.k(23);
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.eh0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.Cells.q1 q1Var;
        ih0 ih0Var = this.f36830i3;
        if (ih0Var.f38086w && ((view == (q1Var = ih0Var.P) && q1Var != null && q1Var.getCurrentPosition() == null) || view == ih0Var.W)) {
            return false;
        }
        if (!(view instanceof org.telegram.ui.Cells.q1)) {
            return true;
        }
        org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) view;
        q1Var2.setInvalidatesParent(true);
        q1Var2.Q0(canvas);
        canvas.save();
        canvas.translate(q1Var2.getX(), q1Var2.getY());
        canvas.scale(q1Var2.getScaleX(), q1Var2.getScaleY(), q1Var2.getPivotX(), q1Var2.getPivotY());
        if (q1Var2.J0() && q1Var2.getCurrentPosition() == null) {
            canvas.save();
            canvas.translate(0.0f, q1Var2.getPaddingTop());
            q1Var2.K0(canvas, true, false);
            canvas.restore();
        }
        canvas.restore();
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.save();
        canvas.translate(q1Var2.getX(), q1Var2.getY() + q1Var2.getPaddingTop());
        canvas.scale(q1Var2.getScaleX(), q1Var2.getScaleY(), q1Var2.getPivotX(), q1Var2.getPivotY());
        if (q1Var2.getCurrentPosition() != null && (((q1Var2.getCurrentPosition().f15166l & q1Var2.F()) != 0 && (q1Var2.getCurrentPosition().f15166l & 1) != 0) || (q1Var2.getCurrentMessagesGroup() != null && q1Var2.getCurrentMessagesGroup().f15740i))) {
            q1Var2.O0(q1Var2.getAlpha(), canvas, false);
        }
        if (q1Var2.getCurrentPosition() != null && (((q1Var2.getCurrentPosition().f15166l & 8) != 0 && (q1Var2.getCurrentPosition().f15166l & 1) != 0) || (q1Var2.getCurrentMessagesGroup() != null && q1Var2.getCurrentMessagesGroup().f15740i))) {
            q1Var2.m1(canvas, q1Var2.getAlpha(), null);
            q1Var2.T0(canvas, q1Var2.getAlpha());
        }
        if (q1Var2.getCurrentPosition() != null) {
            q1Var2.f1(canvas, q1Var2.getAlpha());
        }
        if (q1Var2.getCurrentPosition() == null || q1Var2.getCurrentPosition().h) {
            q1Var2.v1(q1Var2.getAlpha(), canvas, true);
        }
        q1Var2.g1(canvas);
        q1Var2.getTransitionParams().d();
        canvas.restore();
        q1Var2.setInvalidatesParent(false);
        return drawChild;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getTop() != 0 && (childAt instanceof hh0)) {
                hh0 hh0Var = (hh0) childAt;
                hh0Var.f37816hd = childAt.getTop();
                hh0Var.f37817id = childAt.getBottom();
                hh0Var.f37818jd = hh0Var.getMessageObject().f1();
            }
        }
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int measuredHeight;
        int l4;
        int i12;
        ih0 ih0Var = this.f36830i3;
        if (ih0Var.M.isEmpty()) {
            f7 = -6.0f;
        } else {
            f7 = 48.0f;
        }
        int L = org.telegram.messenger.i0.L(f7);
        ViewGroup viewGroup = ih0Var.Y;
        if (viewGroup == null) {
            measuredHeight = 0;
        } else {
            measuredHeight = viewGroup.getMeasuredHeight();
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(0, ((org.telegram.messenger.i0.f16172q.y - (L + measuredHeight)) - org.telegram.messenger.i0.L(8.0f)) - ih0Var.d.f7767b), Integer.MIN_VALUE));
        if (ih0Var.f38073l0) {
            l4 = ih0Var.X;
        } else {
            l4 = ih0Var.V.l();
        }
        int max = Math.max(org.telegram.messenger.i0.L(12.0f) + l4, -((org.telegram.messenger.i0.L(7.0f) + ih0Var.f38075n0[0]) - getMeasuredWidth()));
        int i13 = ih0Var.N;
        int measuredWidth = getMeasuredWidth() - max;
        if (ih0Var.O.i()) {
            i12 = 0;
        } else {
            i12 = 40;
        }
        float max2 = Math.max(1, getMeasuredWidth() - max) / Math.max(1, ((getMeasuredWidth() - max) - org.telegram.messenger.i0.L(8.0f)) + Math.max(0, i13 - (measuredWidth - org.telegram.messenger.i0.L(i12 + 8))));
        setPivotX(getMeasuredWidth());
        setPivotY(getMeasuredHeight());
        setScaleX(max2);
        setScaleY(max2);
    }
}
