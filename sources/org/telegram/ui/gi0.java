package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class gi0 extends org.telegram.ui.Components.mm0 {
    public final ArrayList f39701f3;
    public final org.telegram.ui.Components.h6 f39702g3;
    public final org.telegram.ui.Components.h6 f39703h3;
    public final w10 f39704i3;
    public final ni0 f39705j3;

    public gi0(ni0 ni0Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var);
        this.f39705j3 = ni0Var;
        this.f39701f3 = new ArrayList(10);
        org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.h;
        this.f39702g3 = new org.telegram.ui.Components.h6(this, 0L, 360L, dsVar);
        this.f39703h3 = new org.telegram.ui.Components.h6(this, 0L, 360L, dsVar);
        this.f39704i3 = new w10();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gi0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.Cells.s1 s1Var;
        ni0 ni0Var = this.f39705j3;
        if (ni0Var.v && ((view == (s1Var = ni0Var.P) && s1Var != null && s1Var.getCurrentPosition() == null) || view == ni0Var.W)) {
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
            if (childAt.getTop() != 0 && (childAt instanceof mi0)) {
                mi0 mi0Var = (mi0) childAt;
                mi0Var.He = childAt.getTop();
                mi0Var.Ie = childAt.getBottom();
                mi0Var.Je = mi0Var.getMessageObject().getId();
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
        ni0 ni0Var = this.f39705j3;
        if (ni0Var.M.isEmpty()) {
            f7 = -6.0f;
        } else {
            f7 = 48.0f;
        }
        int dp = AndroidUtilities.dp(f7);
        ViewGroup viewGroup = ni0Var.Y;
        if (viewGroup == null) {
            measuredHeight = 0;
        } else {
            measuredHeight = viewGroup.getMeasuredHeight();
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(0, ((AndroidUtilities.displaySize.y - (dp + measuredHeight)) - AndroidUtilities.dp(8.0f)) - ni0Var.d.f13451b), Integer.MIN_VALUE));
        if (ni0Var.f41919l0) {
            l4 = ni0Var.X;
        } else {
            l4 = ni0Var.V.l();
        }
        int max = Math.max(AndroidUtilities.dp(12.0f) + l4, -((AndroidUtilities.dp(7.0f) + ni0Var.f41921n0[0]) - getMeasuredWidth()));
        int i13 = ni0Var.N;
        int measuredWidth = getMeasuredWidth() - max;
        if (ni0Var.O.i()) {
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
