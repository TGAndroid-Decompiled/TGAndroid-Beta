package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ns extends org.telegram.ui.Cells.r8 {
    public final int R = 0;
    public final Object S;

    public ns(ps psVar, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.S = psVar;
    }

    @Override
    public int c(int i10) {
        switch (this.R) {
            case 2:
                ((x01) this.S).f43916e.getClass();
                return i10;
            default:
                return i10;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.R) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                int dp = AndroidUtilities.dp(21.0f);
                int measuredHeight = getMeasuredHeight();
                ps psVar = (ps) this.S;
                int measuredHeight2 = (measuredHeight - psVar.U.getMeasuredHeight()) / 2;
                org.telegram.ui.Components.y9 y9Var = psVar.U;
                y9Var.layout(dp, measuredHeight2, y9Var.getMeasuredWidth() + dp, psVar.U.getMeasuredHeight() + measuredHeight2);
                return;
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                int dp2 = AndroidUtilities.dp(21.0f);
                int measuredHeight3 = getMeasuredHeight();
                xx0 xx0Var = (xx0) this.S;
                int measuredHeight4 = (measuredHeight3 - xx0Var.d.f34217v0.getMeasuredHeight()) / 2;
                org.telegram.ui.Components.y9 y9Var2 = xx0Var.d.f34217v0;
                y9Var2.layout(dp2, measuredHeight4, y9Var2.getMeasuredWidth() + dp2, xx0Var.d.f34217v0.getMeasuredHeight() + measuredHeight4);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.R) {
            case 0:
                super.onMeasure(i10, i11);
                ps psVar = (ps) this.S;
                psVar.U.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
                psVar.U.setRoundRadius(AndroidUtilities.dp(30.0f));
                return;
            case 1:
                super.onMeasure(i10, i11);
                xx0 xx0Var = (xx0) this.S;
                xx0Var.d.f34217v0.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
                xx0Var.d.f34217v0.setRoundRadius(AndroidUtilities.dp(30.0f));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    public ns(xx0 xx0Var, Activity activity) {
        super(activity);
        this.S = xx0Var;
    }

    public ns(x01 x01Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(18, context, d6Var, false, false);
        this.S = x01Var;
    }
}
