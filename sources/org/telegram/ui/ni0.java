package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class ni0 extends org.telegram.ui.Components.rl0 {
    public final ArrayList U2;
    public final org.telegram.ui.Components.z5 V2;
    public final org.telegram.ui.Components.z5 W2;
    public final i20 X2;
    public final ui0 Y2;

    public ni0(ui0 ui0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.Y2 = ui0Var;
        this.U2 = new ArrayList(10);
        org.telegram.ui.Components.mr mrVar = org.telegram.ui.Components.mr.h;
        this.V2 = new org.telegram.ui.Components.z5(this, 0L, 360L, mrVar);
        this.W2 = new org.telegram.ui.Components.z5(this, 0L, 360L, mrVar);
        this.X2 = new i20();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ni0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.Cells.s1 s1Var;
        ui0 ui0Var = this.Y2;
        if (ui0Var.f38853w && ((view == (s1Var = ui0Var.N) && s1Var != null && s1Var.getCurrentPosition() == null) || view == ui0Var.U)) {
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
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getTop() != 0 && (childAt instanceof ti0)) {
                ti0 ti0Var = (ti0) childAt;
                ti0Var.Ce = childAt.getTop();
                ti0Var.De = childAt.getBottom();
                ti0Var.Ee = ti0Var.getMessageObject().getId();
            }
        }
        super.onLayout(z4, i10, i11, i12, i13);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f10;
        int measuredHeight;
        int l10;
        int i12;
        ui0 ui0Var = this.Y2;
        if (ui0Var.K.isEmpty()) {
            f10 = -6.0f;
        } else {
            f10 = 48.0f;
        }
        int dp = AndroidUtilities.dp(f10);
        ViewGroup viewGroup = ui0Var.W;
        if (viewGroup == null) {
            measuredHeight = 0;
        } else {
            measuredHeight = viewGroup.getMeasuredHeight();
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(0, ((AndroidUtilities.displaySize.y - (dp + measuredHeight)) - AndroidUtilities.dp(8.0f)) - ui0Var.e.f7197b), Integer.MIN_VALUE));
        if (ui0Var.f38838j0) {
            l10 = ui0Var.V;
        } else {
            l10 = ui0Var.T.l();
        }
        int max = Math.max(AndroidUtilities.dp(12.0f) + l10, -((AndroidUtilities.dp(7.0f) + ui0Var.f38840l0[0]) - getMeasuredWidth()));
        int i13 = ui0Var.L;
        int measuredWidth = getMeasuredWidth() - max;
        if (ui0Var.M.i()) {
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
