package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class li0 extends org.telegram.ui.Components.sl0 {
    public final ArrayList U2;
    public final org.telegram.ui.Components.z5 V2;
    public final org.telegram.ui.Components.z5 W2;
    public final g20 X2;
    public final si0 Y2;

    public li0(si0 si0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.Y2 = si0Var;
        this.U2 = new ArrayList(10);
        org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.h;
        this.V2 = new org.telegram.ui.Components.z5(this, 0L, 360L, nrVar);
        this.W2 = new org.telegram.ui.Components.z5(this, 0L, 360L, nrVar);
        this.X2 = new g20();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.li0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.Cells.t1 t1Var;
        si0 si0Var = this.Y2;
        if (si0Var.f38378w && ((view == (t1Var = si0Var.N) && t1Var != null && t1Var.getCurrentPosition() == null) || view == si0Var.U)) {
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
        if (t1Var2.getCurrentPosition() != null && (((t1Var2.getCurrentPosition().flags & t1Var2.t0()) != 0 && (t1Var2.getCurrentPosition().flags & 1) != 0) || (t1Var2.getCurrentMessagesGroup() != null && t1Var2.getCurrentMessagesGroup().isDocuments))) {
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
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getTop() != 0 && (childAt instanceof ri0)) {
                ri0 ri0Var = (ri0) childAt;
                ri0Var.Ce = childAt.getTop();
                ri0Var.De = childAt.getBottom();
                ri0Var.Ee = ri0Var.getMessageObject().getId();
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
        si0 si0Var = this.Y2;
        if (si0Var.K.isEmpty()) {
            f10 = -6.0f;
        } else {
            f10 = 48.0f;
        }
        int dp = AndroidUtilities.dp(f10);
        ViewGroup viewGroup = si0Var.W;
        if (viewGroup == null) {
            measuredHeight = 0;
        } else {
            measuredHeight = viewGroup.getMeasuredHeight();
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(0, ((AndroidUtilities.displaySize.y - (dp + measuredHeight)) - AndroidUtilities.dp(8.0f)) - si0Var.e.f7214b), Integer.MIN_VALUE));
        if (si0Var.f38363j0) {
            l10 = si0Var.V;
        } else {
            l10 = si0Var.T.l();
        }
        int max = Math.max(AndroidUtilities.dp(12.0f) + l10, -((AndroidUtilities.dp(7.0f) + si0Var.f38365l0[0]) - getMeasuredWidth()));
        int i13 = si0Var.L;
        int measuredWidth = getMeasuredWidth() - max;
        if (si0Var.M.i()) {
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
