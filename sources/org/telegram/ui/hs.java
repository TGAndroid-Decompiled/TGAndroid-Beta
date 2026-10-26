package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class hs extends org.telegram.ui.Cells.v8 {
    public final int W = 2;
    public final Object f40064a0;

    public hs(js jsVar, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var);
        this.f40064a0 = jsVar;
    }

    @Override
    public int e(int i10) {
        switch (this.W) {
            case 2:
                ProfileActivity profileActivity = ((j01) this.f40064a0).e;
                int i11 = ProfileActivity.R6;
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
                int dp = AndroidUtilities.dp(21.0f);
                int measuredHeight = getMeasuredHeight();
                js jsVar = (js) this.f40064a0;
                int measuredHeight2 = (measuredHeight - jsVar.U.getMeasuredHeight()) / 2;
                org.telegram.ui.Components.y9 y9Var = jsVar.U;
                y9Var.layout(dp, measuredHeight2, y9Var.getMeasuredWidth() + dp, jsVar.U.getMeasuredHeight() + measuredHeight2);
                return;
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                int dp2 = AndroidUtilities.dp(21.0f);
                int measuredHeight3 = getMeasuredHeight();
                kx0 kx0Var = (kx0) this.f40064a0;
                int measuredHeight4 = (measuredHeight3 - kx0Var.d.f35926u0.getMeasuredHeight()) / 2;
                org.telegram.ui.Components.y9 y9Var2 = kx0Var.d.f35926u0;
                y9Var2.layout(dp2, measuredHeight4, y9Var2.getMeasuredWidth() + dp2, kx0Var.d.f35926u0.getMeasuredHeight() + measuredHeight4);
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
                js jsVar = (js) this.f40064a0;
                jsVar.U.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
                jsVar.U.setRoundRadius(AndroidUtilities.dp(30.0f));
                return;
            case 1:
                super.onMeasure(i10, i11);
                kx0 kx0Var = (kx0) this.f40064a0;
                kx0Var.d.f35926u0.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
                kx0Var.d.f35926u0.setRoundRadius(AndroidUtilities.dp(30.0f));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    public hs(kx0 kx0Var, Activity activity) {
        super(activity);
        this.f40064a0 = kx0Var;
    }

    public hs(j01 j01Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(18, context, u6Var, false, false);
        this.f40064a0 = j01Var;
    }
}
