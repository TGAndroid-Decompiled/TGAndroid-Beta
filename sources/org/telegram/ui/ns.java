package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ns extends org.telegram.ui.Cells.n8 {
    public final int N = 1;
    public final Object O;

    public ns(ps psVar, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.O = psVar;
    }

    @Override
    public int c(int i10) {
        switch (this.N) {
            case 2:
                ((n01) this.O).e.getClass();
                return i10;
            default:
                return i10;
        }
    }

    @Override
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        switch (this.N) {
            case 0:
                super.onLayout(z4, i10, i11, i12, i13);
                int dp = AndroidUtilities.dp(21.0f);
                int measuredHeight = getMeasuredHeight();
                ps psVar = (ps) this.O;
                int measuredHeight2 = (measuredHeight - psVar.R.getMeasuredHeight()) / 2;
                org.telegram.ui.Components.p9 p9Var = psVar.R;
                p9Var.layout(dp, measuredHeight2, p9Var.getMeasuredWidth() + dp, psVar.R.getMeasuredHeight() + measuredHeight2);
                return;
            case 1:
                super.onLayout(z4, i10, i11, i12, i13);
                int dp2 = AndroidUtilities.dp(21.0f);
                int measuredHeight3 = getMeasuredHeight();
                lx0 lx0Var = (lx0) this.O;
                int measuredHeight4 = (measuredHeight3 - lx0Var.d.f31981s0.getMeasuredHeight()) / 2;
                org.telegram.ui.Components.p9 p9Var2 = lx0Var.d.f31981s0;
                p9Var2.layout(dp2, measuredHeight4, p9Var2.getMeasuredWidth() + dp2, lx0Var.d.f31981s0.getMeasuredHeight() + measuredHeight4);
                return;
            default:
                super.onLayout(z4, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.N) {
            case 0:
                super.onMeasure(i10, i11);
                ps psVar = (ps) this.O;
                psVar.R.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
                psVar.R.setRoundRadius(AndroidUtilities.dp(30.0f));
                return;
            case 1:
                super.onMeasure(i10, i11);
                lx0 lx0Var = (lx0) this.O;
                lx0Var.d.f31981s0.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
                lx0Var.d.f31981s0.setRoundRadius(AndroidUtilities.dp(30.0f));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    public ns(lx0 lx0Var, Activity activity) {
        super(activity);
        this.O = lx0Var;
    }

    public ns(n01 n01Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(18, context, f6Var, false, false);
        this.O = n01Var;
    }
}
