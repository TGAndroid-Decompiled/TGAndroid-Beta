package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class ei0 extends org.telegram.ui.Components.wk0 {
    public final ArrayList T2;
    public final org.telegram.ui.Components.y5 U2;
    public final org.telegram.ui.Components.y5 V2;
    public final s10 W2;
    public final li0 X2;

    public ei0(li0 li0Var, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var);
        this.X2 = li0Var;
        this.T2 = new ArrayList(10);
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
        this.U2 = new org.telegram.ui.Components.y5(this, 0L, 360L, grVar);
        this.V2 = new org.telegram.ui.Components.y5(this, 0L, 360L, grVar);
        this.W2 = new s10();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ei0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.Cells.t1 t1Var;
        li0 li0Var = this.X2;
        if (li0Var.f40176w && ((view == (t1Var = li0Var.M) && t1Var != null && t1Var.getCurrentPosition() == null) || view == li0Var.T)) {
            return false;
        }
        if (!(view instanceof org.telegram.ui.Cells.t1)) {
            return true;
        }
        org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) view;
        t1Var2.setInvalidatesParent(true);
        t1Var2.K1(canvas);
        canvas.save();
        canvas.translate(t1Var2.getX(), t1Var2.getY());
        canvas.scale(t1Var2.getScaleX(), t1Var2.getScaleY(), t1Var2.getPivotX(), t1Var2.getPivotY());
        if (t1Var2.C1() && t1Var2.getCurrentPosition() == null) {
            canvas.save();
            canvas.translate(0.0f, t1Var2.getPaddingTop());
            t1Var2.D1(canvas, true, false);
            canvas.restore();
        }
        canvas.restore();
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.save();
        canvas.translate(t1Var2.getX(), t1Var2.getY() + t1Var2.getPaddingTop());
        canvas.scale(t1Var2.getScaleX(), t1Var2.getScaleY(), t1Var2.getPivotX(), t1Var2.getPivotY());
        if (t1Var2.getCurrentPosition() != null && (((t1Var2.getCurrentPosition().flags & t1Var2.s0()) != 0 && (t1Var2.getCurrentPosition().flags & 1) != 0) || (t1Var2.getCurrentMessagesGroup() != null && t1Var2.getCurrentMessagesGroup().isDocuments))) {
            t1Var2.I1(t1Var2.getAlpha(), canvas, false);
        }
        if (t1Var2.getCurrentPosition() != null && (((t1Var2.getCurrentPosition().flags & 8) != 0 && (t1Var2.getCurrentPosition().flags & 1) != 0) || (t1Var2.getCurrentMessagesGroup() != null && t1Var2.getCurrentMessagesGroup().isDocuments))) {
            t1Var2.d2(canvas, t1Var2.getAlpha(), null);
            t1Var2.N1(canvas, t1Var2.getAlpha());
        }
        if (t1Var2.getCurrentPosition() != null) {
            t1Var2.W1(canvas, t1Var2.getAlpha());
        }
        if (t1Var2.getCurrentPosition() == null || t1Var2.getCurrentPosition().last) {
            t1Var2.m2(t1Var2.getAlpha(), canvas, true);
        }
        t1Var2.X1(canvas);
        t1Var2.getTransitionParams().i();
        canvas.restore();
        t1Var2.setInvalidatesParent(false);
        return drawChild;
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getTop() != 0 && (childAt instanceof ki0)) {
                ki0 ki0Var = (ki0) childAt;
                ki0Var.Be = childAt.getTop();
                ki0Var.Ce = childAt.getBottom();
                ki0Var.De = ki0Var.getMessageObject().getId();
            }
        }
        super.onLayout(z10, i9, i10, i11, i12);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        float f10;
        int measuredHeight;
        int l10;
        int i11;
        li0 li0Var = this.X2;
        if (li0Var.J.isEmpty()) {
            f10 = -6.0f;
        } else {
            f10 = 48.0f;
        }
        int dp = AndroidUtilities.dp(f10);
        ViewGroup viewGroup = li0Var.V;
        if (viewGroup == null) {
            measuredHeight = 0;
        } else {
            measuredHeight = viewGroup.getMeasuredHeight();
        }
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(Math.max(0, ((AndroidUtilities.displaySize.y - (dp + measuredHeight)) - AndroidUtilities.dp(8.0f)) - li0Var.f40154e.f10849b), Integer.MIN_VALUE));
        if (li0Var.f40160i0) {
            l10 = li0Var.U;
        } else {
            l10 = li0Var.S.l();
        }
        int max = Math.max(AndroidUtilities.dp(12.0f) + l10, -((AndroidUtilities.dp(7.0f) + li0Var.f40162k0[0]) - getMeasuredWidth()));
        int i12 = li0Var.K;
        int measuredWidth = getMeasuredWidth() - max;
        if (li0Var.L.i()) {
            i11 = 0;
        } else {
            i11 = 40;
        }
        float max2 = Math.max(1, getMeasuredWidth() - max) / Math.max(1, ((getMeasuredWidth() - max) - AndroidUtilities.dp(8.0f)) + Math.max(0, i12 - (measuredWidth - AndroidUtilities.dp(i11 + 8))));
        setPivotX(getMeasuredWidth());
        setPivotY(getMeasuredHeight());
        setScaleX(max2);
        setScaleY(max2);
    }
}
