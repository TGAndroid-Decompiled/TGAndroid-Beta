package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.view.View;
public final class jr extends org.telegram.ui.Cells.l8 {
    public final int f46679a0 = 1;
    public final Object f46680b0;

    public jr(lr lrVar, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.f46680b0 = lrVar;
    }

    @Override
    public int e(int i3) {
        switch (this.f46679a0) {
            case 2:
                ProfileActivity profileActivity = ((bw0) this.f46680b0).f44157e;
                RectF rectF = ProfileActivity.T6;
                profileActivity.getClass();
                return i3;
            default:
                return i3;
        }
    }

    @Override
    public void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        switch (this.f46679a0) {
            case 0:
                super.onLayout(z10, i3, i10, i11, i12);
                int L = org.telegram.messenger.g0.L(21.0f);
                int measuredHeight = getMeasuredHeight();
                lr lrVar = (lr) this.f46680b0;
                int measuredHeight2 = (measuredHeight - lrVar.V.getMeasuredHeight()) / 2;
                org.telegram.ui.Components.k9 k9Var = lrVar.V;
                k9Var.layout(L, measuredHeight2, k9Var.getMeasuredWidth() + L, lrVar.V.getMeasuredHeight() + measuredHeight2);
                return;
            case 1:
                super.onLayout(z10, i3, i10, i11, i12);
                int L2 = org.telegram.messenger.g0.L(21.0f);
                int measuredHeight3 = getMeasuredHeight();
                at0 at0Var = (at0) this.f46680b0;
                int measuredHeight4 = (measuredHeight3 - at0Var.d.f41700x0.getMeasuredHeight()) / 2;
                org.telegram.ui.Components.k9 k9Var2 = at0Var.d.f41700x0;
                k9Var2.layout(L2, measuredHeight4, k9Var2.getMeasuredWidth() + L2, at0Var.d.f41700x0.getMeasuredHeight() + measuredHeight4);
                return;
            default:
                super.onLayout(z10, i3, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i3, int i10) {
        switch (this.f46679a0) {
            case 0:
                super.onMeasure(i3, i10);
                lr lrVar = (lr) this.f46680b0;
                lrVar.V.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), 1073741824));
                lrVar.V.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
                return;
            case 1:
                super.onMeasure(i3, i10);
                at0 at0Var = (at0) this.f46680b0;
                at0Var.d.f41700x0.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), 1073741824));
                at0Var.d.f41700x0.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
                return;
            default:
                super.onMeasure(i3, i10);
                return;
        }
    }

    public jr(at0 at0Var, Activity activity) {
        super(activity);
        this.f46680b0 = at0Var;
    }

    public jr(bw0 bw0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(18, context, e6Var, false, false);
        this.f46680b0 = bw0Var;
    }
}
