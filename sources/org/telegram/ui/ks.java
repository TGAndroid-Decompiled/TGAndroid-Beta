package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ks extends org.telegram.ui.Cells.r8 {
    public final int Q = 0;
    public final Object R;

    public ks(ms msVar, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.R = msVar;
    }

    @Override
    public int c(int i10) {
        switch (this.Q) {
            case 2:
                ((q01) this.R).e.getClass();
                return i10;
            default:
                return i10;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.Q) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                int dp = AndroidUtilities.dp(21.0f);
                int measuredHeight = getMeasuredHeight();
                ms msVar = (ms) this.R;
                int measuredHeight2 = (measuredHeight - msVar.U.getMeasuredHeight()) / 2;
                org.telegram.ui.Components.w9 w9Var = msVar.U;
                w9Var.layout(dp, measuredHeight2, w9Var.getMeasuredWidth() + dp, msVar.U.getMeasuredHeight() + measuredHeight2);
                return;
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                int dp2 = AndroidUtilities.dp(21.0f);
                int measuredHeight3 = getMeasuredHeight();
                qx0 qx0Var = (qx0) this.R;
                int measuredHeight4 = (measuredHeight3 - qx0Var.d.f31489v0.getMeasuredHeight()) / 2;
                org.telegram.ui.Components.w9 w9Var2 = qx0Var.d.f31489v0;
                w9Var2.layout(dp2, measuredHeight4, w9Var2.getMeasuredWidth() + dp2, qx0Var.d.f31489v0.getMeasuredHeight() + measuredHeight4);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.Q) {
            case 0:
                super.onMeasure(i10, i11);
                ms msVar = (ms) this.R;
                msVar.U.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
                msVar.U.setRoundRadius(AndroidUtilities.dp(30.0f));
                return;
            case 1:
                super.onMeasure(i10, i11);
                qx0 qx0Var = (qx0) this.R;
                qx0Var.d.f31489v0.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
                qx0Var.d.f31489v0.setRoundRadius(AndroidUtilities.dp(30.0f));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    public ks(qx0 qx0Var, Activity activity) {
        super(activity);
        this.R = qx0Var;
    }

    public ks(q01 q01Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(18, context, d6Var, false, false);
        this.R = q01Var;
    }
}
