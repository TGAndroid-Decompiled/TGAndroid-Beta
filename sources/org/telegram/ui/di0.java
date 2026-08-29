package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class di0 extends org.telegram.ui.Components.jl0 {
    public final ArrayList T2;
    public final org.telegram.ui.Components.d6 U2;
    public final org.telegram.ui.Components.d6 V2;
    public final u10 W2;
    public final ki0 X2;

    public di0(ki0 ki0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.X2 = ki0Var;
        this.T2 = new ArrayList(10);
        org.telegram.ui.Components.jr jrVar = org.telegram.ui.Components.jr.h;
        this.U2 = new org.telegram.ui.Components.d6(this, 0L, 360L, jrVar);
        this.V2 = new org.telegram.ui.Components.d6(this, 0L, 360L, jrVar);
        this.W2 = new u10();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.di0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.Cells.s1 s1Var;
        ki0 ki0Var = this.X2;
        if (ki0Var.f39901w && ((view == (s1Var = ki0Var.M) && s1Var != null && s1Var.getCurrentPosition() == null) || view == ki0Var.T)) {
            return false;
        }
        if (!(view instanceof org.telegram.ui.Cells.s1)) {
            return true;
        }
        org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) view;
        s1Var2.setInvalidatesParent(true);
        s1Var2.K1(canvas);
        canvas.save();
        canvas.translate(s1Var2.getX(), s1Var2.getY());
        canvas.scale(s1Var2.getScaleX(), s1Var2.getScaleY(), s1Var2.getPivotX(), s1Var2.getPivotY());
        if (s1Var2.C1() && s1Var2.getCurrentPosition() == null) {
            canvas.save();
            canvas.translate(0.0f, s1Var2.getPaddingTop());
            s1Var2.D1(canvas, true, false);
            canvas.restore();
        }
        canvas.restore();
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.save();
        canvas.translate(s1Var2.getX(), s1Var2.getY() + s1Var2.getPaddingTop());
        canvas.scale(s1Var2.getScaleX(), s1Var2.getScaleY(), s1Var2.getPivotX(), s1Var2.getPivotY());
        if (s1Var2.getCurrentPosition() != null && (((s1Var2.getCurrentPosition().flags & s1Var2.t0()) != 0 && (s1Var2.getCurrentPosition().flags & 1) != 0) || (s1Var2.getCurrentMessagesGroup() != null && s1Var2.getCurrentMessagesGroup().isDocuments))) {
            s1Var2.I1(s1Var2.getAlpha(), canvas, false);
        }
        if (s1Var2.getCurrentPosition() != null && (((s1Var2.getCurrentPosition().flags & 8) != 0 && (s1Var2.getCurrentPosition().flags & 1) != 0) || (s1Var2.getCurrentMessagesGroup() != null && s1Var2.getCurrentMessagesGroup().isDocuments))) {
            s1Var2.d2(canvas, s1Var2.getAlpha(), null);
            s1Var2.N1(canvas, s1Var2.getAlpha());
        }
        if (s1Var2.getCurrentPosition() != null) {
            s1Var2.W1(canvas, s1Var2.getAlpha());
        }
        if (s1Var2.getCurrentPosition() == null || s1Var2.getCurrentPosition().last) {
            s1Var2.m2(s1Var2.getAlpha(), canvas, true);
        }
        s1Var2.X1(canvas);
        s1Var2.getTransitionParams().i();
        canvas.restore();
        s1Var2.setInvalidatesParent(false);
        return drawChild;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getTop() != 0 && (childAt instanceof ji0)) {
                ji0 ji0Var = (ji0) childAt;
                ji0Var.Be = childAt.getTop();
                ji0Var.Ce = childAt.getBottom();
                ji0Var.De = ji0Var.getMessageObject().getId();
            }
        }
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f9;
        int measuredHeight;
        int l10;
        int i12;
        ki0 ki0Var = this.X2;
        if (ki0Var.J.isEmpty()) {
            f9 = -6.0f;
        } else {
            f9 = 48.0f;
        }
        int dp = AndroidUtilities.dp(f9);
        ViewGroup viewGroup = ki0Var.V;
        if (viewGroup == null) {
            measuredHeight = 0;
        } else {
            measuredHeight = viewGroup.getMeasuredHeight();
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(0, ((AndroidUtilities.displaySize.y - (dp + measuredHeight)) - AndroidUtilities.dp(8.0f)) - ki0Var.f39879e.f8187b), Integer.MIN_VALUE));
        if (ki0Var.f39885i0) {
            l10 = ki0Var.U;
        } else {
            l10 = ki0Var.S.l();
        }
        int max = Math.max(AndroidUtilities.dp(12.0f) + l10, -((AndroidUtilities.dp(7.0f) + ki0Var.f39887k0[0]) - getMeasuredWidth()));
        int i13 = ki0Var.K;
        int measuredWidth = getMeasuredWidth() - max;
        if (ki0Var.L.i()) {
            i12 = 0;
        } else {
            i12 = 40;
        }
        float max2 = Math.max(1, getMeasuredWidth() - max) / Math.max(1, ((getMeasuredWidth() - max) - AndroidUtilities.dp(8.0f)) + Math.max(0, i13 - (measuredWidth - AndroidUtilities.dp(i12 + 8))));
        setPivotX(getMeasuredWidth());
        setPivotY(getMeasuredHeight());
        setScaleX(max2);
        setScaleY(max2);
    }
}
