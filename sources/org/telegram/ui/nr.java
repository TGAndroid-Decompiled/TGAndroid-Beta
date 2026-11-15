package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.view.View;
public final class nr extends org.telegram.ui.Cells.l8 {
    public final int f49612a0 = 1;
    public final Object f49613b0;

    public nr(pr prVar, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.f49613b0 = prVar;
    }

    @Override
    public int e(int i7) {
        switch (this.f49612a0) {
            case 2:
                ProfileActivity profileActivity = ((iw0) this.f49613b0).f48138e;
                RectF rectF = ProfileActivity.X6;
                profileActivity.getClass();
                return i7;
            default:
                return i7;
        }
    }

    @Override
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.f49612a0) {
            case 0:
                super.onLayout(z10, i7, i10, i11, i12);
                int L = org.telegram.messenger.g0.L(21.0f);
                int measuredHeight = getMeasuredHeight();
                pr prVar = (pr) this.f49613b0;
                int measuredHeight2 = (measuredHeight - prVar.V.getMeasuredHeight()) / 2;
                org.telegram.ui.Components.i9 i9Var = prVar.V;
                i9Var.layout(L, measuredHeight2, i9Var.getMeasuredWidth() + L, prVar.V.getMeasuredHeight() + measuredHeight2);
                return;
            case 1:
                super.onLayout(z10, i7, i10, i11, i12);
                int L2 = org.telegram.messenger.g0.L(21.0f);
                int measuredHeight3 = getMeasuredHeight();
                ht0 ht0Var = (ht0) this.f49613b0;
                int measuredHeight4 = (measuredHeight3 - ht0Var.d.f43043x0.getMeasuredHeight()) / 2;
                org.telegram.ui.Components.i9 i9Var2 = ht0Var.d.f43043x0;
                i9Var2.layout(L2, measuredHeight4, i9Var2.getMeasuredWidth() + L2, ht0Var.d.f43043x0.getMeasuredHeight() + measuredHeight4);
                return;
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f49612a0) {
            case 0:
                super.onMeasure(i7, i10);
                pr prVar = (pr) this.f49613b0;
                prVar.V.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), 1073741824));
                prVar.V.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
                return;
            case 1:
                super.onMeasure(i7, i10);
                ht0 ht0Var = (ht0) this.f49613b0;
                ht0Var.d.f43043x0.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), 1073741824));
                ht0Var.d.f43043x0.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    public nr(ht0 ht0Var, Activity activity) {
        super(activity);
        this.f49613b0 = ht0Var;
    }

    public nr(iw0 iw0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(18, context, e6Var, false, false);
        this.f49613b0 = iw0Var;
    }
}
