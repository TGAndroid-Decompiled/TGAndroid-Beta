package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.view.View;
public final class ls extends org.telegram.ui.Cells.p8 {
    public final int W = 0;
    public final Object f39376a0;

    public ls(ns nsVar, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, p6Var);
        this.f39376a0 = nsVar;
    }

    @Override
    public int e(int i10) {
        switch (this.W) {
            case 2:
                ProfileActivity profileActivity = ((xx0) this.f39376a0).e;
                RectF rectF = ProfileActivity.R6;
                profileActivity.getClass();
                return i10;
            default:
                return i10;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.W) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                int L = org.telegram.messenger.i0.L(21.0f);
                int measuredHeight = getMeasuredHeight();
                ns nsVar = (ns) this.f39376a0;
                int measuredHeight2 = (measuredHeight - nsVar.U.getMeasuredHeight()) / 2;
                org.telegram.ui.Components.g9 g9Var = nsVar.U;
                g9Var.layout(L, measuredHeight2, g9Var.getMeasuredWidth() + L, nsVar.U.getMeasuredHeight() + measuredHeight2);
                return;
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                int L2 = org.telegram.messenger.i0.L(21.0f);
                int measuredHeight3 = getMeasuredHeight();
                su0 su0Var = (su0) this.f39376a0;
                int measuredHeight4 = (measuredHeight3 - su0Var.d.f33750u0.getMeasuredHeight()) / 2;
                org.telegram.ui.Components.g9 g9Var2 = su0Var.d.f33750u0;
                g9Var2.layout(L2, measuredHeight4, g9Var2.getMeasuredWidth() + L2, su0Var.d.f33750u0.getMeasuredHeight() + measuredHeight4);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.W) {
            case 0:
                super.onMeasure(i10, i11);
                ns nsVar = (ns) this.f39376a0;
                nsVar.U.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(30.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(30.0f), 1073741824));
                nsVar.U.setRoundRadius(org.telegram.messenger.i0.L(30.0f));
                return;
            case 1:
                super.onMeasure(i10, i11);
                su0 su0Var = (su0) this.f39376a0;
                su0Var.d.f33750u0.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(30.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(30.0f), 1073741824));
                su0Var.d.f33750u0.setRoundRadius(org.telegram.messenger.i0.L(30.0f));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    public ls(su0 su0Var, Activity activity) {
        super(activity);
        this.f39376a0 = su0Var;
    }

    public ls(xx0 xx0Var, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(18, context, p6Var, false, false);
        this.f39376a0 = xx0Var;
    }
}
