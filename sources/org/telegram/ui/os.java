package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class os extends org.telegram.ui.Cells.r8 {
    public final int Q = 0;
    public final Object R;

    public os(qs qsVar, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.R = qsVar;
    }

    @Override
    public int c(int i10) {
        switch (this.Q) {
            case 2:
                ((s01) this.R).f40323e.getClass();
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
                qs qsVar = (qs) this.R;
                int measuredHeight2 = (measuredHeight - qsVar.U.getMeasuredHeight()) / 2;
                org.telegram.ui.Components.w9 w9Var = qsVar.U;
                w9Var.layout(dp, measuredHeight2, w9Var.getMeasuredWidth() + dp, qsVar.U.getMeasuredHeight() + measuredHeight2);
                return;
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                int dp2 = AndroidUtilities.dp(21.0f);
                int measuredHeight3 = getMeasuredHeight();
                sx0 sx0Var = (sx0) this.R;
                int measuredHeight4 = (measuredHeight3 - sx0Var.d.f34186v0.getMeasuredHeight()) / 2;
                org.telegram.ui.Components.w9 w9Var2 = sx0Var.d.f34186v0;
                w9Var2.layout(dp2, measuredHeight4, w9Var2.getMeasuredWidth() + dp2, sx0Var.d.f34186v0.getMeasuredHeight() + measuredHeight4);
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
                qs qsVar = (qs) this.R;
                qsVar.U.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
                qsVar.U.setRoundRadius(AndroidUtilities.dp(30.0f));
                return;
            case 1:
                super.onMeasure(i10, i11);
                sx0 sx0Var = (sx0) this.R;
                sx0Var.d.f34186v0.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
                sx0Var.d.f34186v0.setRoundRadius(AndroidUtilities.dp(30.0f));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    public os(sx0 sx0Var, Activity activity) {
        super(activity);
        this.R = sx0Var;
    }

    public os(s01 s01Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(18, context, d6Var, false, false);
        this.R = s01Var;
    }
}
