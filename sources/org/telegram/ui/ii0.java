package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class ii0 extends org.telegram.ui.Components.nm0 {
    public final ArrayList f40191f3;
    public final org.telegram.ui.Components.h6 f40192g3;
    public final org.telegram.ui.Components.h6 f40193h3;
    public final y10 f40194i3;
    public final pi0 f40195j3;

    public ii0(pi0 pi0Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var);
        this.f40195j3 = pi0Var;
        this.f40191f3 = new ArrayList(10);
        org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.h;
        this.f40192g3 = new org.telegram.ui.Components.h6(this, 0L, 360L, dsVar);
        this.f40193h3 = new org.telegram.ui.Components.h6(this, 0L, 360L, dsVar);
        this.f40194i3 = new y10();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ii0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.Cells.s1 s1Var;
        pi0 pi0Var = this.f40195j3;
        if (pi0Var.v && ((view == (s1Var = pi0Var.P) && s1Var != null && s1Var.getCurrentPosition() == null) || view == pi0Var.W)) {
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
        if (s1Var2.getCurrentPosition() != null && (((s1Var2.getCurrentPosition().flags & s1Var2.s0()) != 0 && (s1Var2.getCurrentPosition().flags & 1) != 0) || (s1Var2.getCurrentMessagesGroup() != null && s1Var2.getCurrentMessagesGroup().isDocuments))) {
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
            if (childAt.getTop() != 0 && (childAt instanceof oi0)) {
                oi0 oi0Var = (oi0) childAt;
                oi0Var.He = childAt.getTop();
                oi0Var.Ie = childAt.getBottom();
                oi0Var.Je = oi0Var.getMessageObject().getId();
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
        pi0 pi0Var = this.f40195j3;
        if (pi0Var.M.isEmpty()) {
            f7 = -6.0f;
        } else {
            f7 = 48.0f;
        }
        int dp = AndroidUtilities.dp(f7);
        ViewGroup viewGroup = pi0Var.Y;
        if (viewGroup == null) {
            measuredHeight = 0;
        } else {
            measuredHeight = viewGroup.getMeasuredHeight();
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(0, ((AndroidUtilities.displaySize.y - (dp + measuredHeight)) - AndroidUtilities.dp(8.0f)) - pi0Var.d.f13450b), Integer.MIN_VALUE));
        if (pi0Var.f42422l0) {
            l4 = pi0Var.X;
        } else {
            l4 = pi0Var.V.l();
        }
        int max = Math.max(AndroidUtilities.dp(12.0f) + l4, -((AndroidUtilities.dp(7.0f) + pi0Var.f42424n0[0]) - getMeasuredWidth()));
        int i13 = pi0Var.N;
        int measuredWidth = getMeasuredWidth() - max;
        if (pi0Var.O.i()) {
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
