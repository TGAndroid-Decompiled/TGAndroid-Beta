package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class gi0 extends org.telegram.ui.Components.im0 {
    public final ArrayList V2;
    public final org.telegram.ui.Components.f6 W2;
    public final org.telegram.ui.Components.f6 X2;
    public final u10 Y2;
    public final ni0 Z2;

    public gi0(ni0 ni0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.Z2 = ni0Var;
        this.V2 = new ArrayList(10);
        org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.h;
        this.W2 = new org.telegram.ui.Components.f6(this, 0L, 360L, bsVar);
        this.X2 = new org.telegram.ui.Components.f6(this, 0L, 360L, bsVar);
        this.Y2 = new u10();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gi0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.Cells.u1 u1Var;
        ni0 ni0Var = this.Z2;
        if (ni0Var.f39476w && ((view == (u1Var = ni0Var.Q) && u1Var != null && u1Var.getCurrentPosition() == null) || view == ni0Var.X)) {
            return false;
        }
        if (!(view instanceof org.telegram.ui.Cells.u1)) {
            return true;
        }
        org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) view;
        u1Var2.setInvalidatesParent(true);
        u1Var2.K1(canvas);
        canvas.save();
        canvas.translate(u1Var2.getX(), u1Var2.getY());
        canvas.scale(u1Var2.getScaleX(), u1Var2.getScaleY(), u1Var2.getPivotX(), u1Var2.getPivotY());
        if (u1Var2.C1() && u1Var2.getCurrentPosition() == null) {
            canvas.save();
            canvas.translate(0.0f, u1Var2.getPaddingTop());
            u1Var2.D1(canvas, true, false);
            canvas.restore();
        }
        canvas.restore();
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.save();
        canvas.translate(u1Var2.getX(), u1Var2.getY() + u1Var2.getPaddingTop());
        canvas.scale(u1Var2.getScaleX(), u1Var2.getScaleY(), u1Var2.getPivotX(), u1Var2.getPivotY());
        if (u1Var2.getCurrentPosition() != null && (((u1Var2.getCurrentPosition().flags & u1Var2.t0()) != 0 && (u1Var2.getCurrentPosition().flags & 1) != 0) || (u1Var2.getCurrentMessagesGroup() != null && u1Var2.getCurrentMessagesGroup().isDocuments))) {
            u1Var2.I1(u1Var2.getAlpha(), canvas, false);
        }
        if (u1Var2.getCurrentPosition() != null && (((u1Var2.getCurrentPosition().flags & 8) != 0 && (u1Var2.getCurrentPosition().flags & 1) != 0) || (u1Var2.getCurrentMessagesGroup() != null && u1Var2.getCurrentMessagesGroup().isDocuments))) {
            u1Var2.d2(canvas, u1Var2.getAlpha(), null);
            u1Var2.N1(canvas, u1Var2.getAlpha());
        }
        if (u1Var2.getCurrentPosition() != null) {
            u1Var2.W1(canvas, u1Var2.getAlpha());
        }
        if (u1Var2.getCurrentPosition() == null || u1Var2.getCurrentPosition().last) {
            u1Var2.m2(u1Var2.getAlpha(), canvas, true);
        }
        u1Var2.X1(canvas);
        u1Var2.getTransitionParams().i();
        canvas.restore();
        u1Var2.setInvalidatesParent(false);
        return drawChild;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getTop() != 0 && (childAt instanceof mi0)) {
                mi0 mi0Var = (mi0) childAt;
                mi0Var.Ge = childAt.getTop();
                mi0Var.He = childAt.getBottom();
                mi0Var.Ie = mi0Var.getMessageObject().getId();
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
        ni0 ni0Var = this.Z2;
        if (ni0Var.N.isEmpty()) {
            f7 = -6.0f;
        } else {
            f7 = 48.0f;
        }
        int dp = AndroidUtilities.dp(f7);
        ViewGroup viewGroup = ni0Var.Z;
        if (viewGroup == null) {
            measuredHeight = 0;
        } else {
            measuredHeight = viewGroup.getMeasuredHeight();
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(0, ((AndroidUtilities.displaySize.y - (dp + measuredHeight)) - AndroidUtilities.dp(8.0f)) - ni0Var.e.f12285b), Integer.MIN_VALUE));
        if (ni0Var.m0) {
            l4 = ni0Var.Y;
        } else {
            l4 = ni0Var.W.l();
        }
        int max = Math.max(AndroidUtilities.dp(12.0f) + l4, -((AndroidUtilities.dp(7.0f) + ni0Var.f39466o0[0]) - getMeasuredWidth()));
        int i13 = ni0Var.O;
        int measuredWidth = getMeasuredWidth() - max;
        if (ni0Var.P.i()) {
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
