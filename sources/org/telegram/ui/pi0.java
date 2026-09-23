package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class pi0 extends org.telegram.ui.Components.ml0 {
    public final ArrayList X2;
    public final org.telegram.ui.Components.e6 Y2;
    public final org.telegram.ui.Components.e6 Z2;
    public final i20 f36120a3;
    public final wi0 f36121b3;

    public pi0(wi0 wi0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.f36121b3 = wi0Var;
        this.X2 = new ArrayList(10);
        org.telegram.ui.Components.rr rrVar = org.telegram.ui.Components.rr.h;
        this.Y2 = new org.telegram.ui.Components.e6(this, 0L, 360L, rrVar);
        this.Z2 = new org.telegram.ui.Components.e6(this, 0L, 360L, rrVar);
        this.f36120a3 = new i20();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pi0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.Cells.t1 t1Var;
        wi0 wi0Var = this.f36121b3;
        if (wi0Var.f39024w && ((view == (t1Var = wi0Var.Q) && t1Var != null && t1Var.getCurrentPosition() == null) || view == wi0Var.X)) {
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
        boolean drawChild = super.drawChild(canvas, view, j3);
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
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getTop() != 0 && (childAt instanceof vi0)) {
                vi0 vi0Var = (vi0) childAt;
                vi0Var.Ge = childAt.getTop();
                vi0Var.He = childAt.getBottom();
                vi0Var.Ie = vi0Var.getMessageObject().getId();
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
        wi0 wi0Var = this.f36121b3;
        if (wi0Var.N.isEmpty()) {
            f7 = -6.0f;
        } else {
            f7 = 48.0f;
        }
        int dp = AndroidUtilities.dp(f7);
        ViewGroup viewGroup = wi0Var.Z;
        if (viewGroup == null) {
            measuredHeight = 0;
        } else {
            measuredHeight = viewGroup.getMeasuredHeight();
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(0, ((AndroidUtilities.displaySize.y - (dp + measuredHeight)) - AndroidUtilities.dp(8.0f)) - wi0Var.e.f10577b), Integer.MIN_VALUE));
        if (wi0Var.m0) {
            l4 = wi0Var.Y;
        } else {
            l4 = wi0Var.W.l();
        }
        int max = Math.max(AndroidUtilities.dp(12.0f) + l4, -((AndroidUtilities.dp(7.0f) + wi0Var.f39014o0[0]) - getMeasuredWidth()));
        int i13 = wi0Var.O;
        int measuredWidth = getMeasuredWidth() - max;
        if (wi0Var.P.i()) {
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
