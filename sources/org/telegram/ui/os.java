package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class os extends org.telegram.ui.Cells.r8 {
    public final int R = 0;
    public final Object S;

    public os(qs qsVar, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.S = qsVar;
    }

    @Override
    public int c(int i10) {
        switch (this.R) {
            case 2:
                ((y01) this.S).f44235e.getClass();
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
                qs qsVar = (qs) this.S;
                int measuredHeight2 = (measuredHeight - qsVar.U.getMeasuredHeight()) / 2;
                org.telegram.ui.Components.y9 y9Var = qsVar.U;
                y9Var.layout(dp, measuredHeight2, y9Var.getMeasuredWidth() + dp, qsVar.U.getMeasuredHeight() + measuredHeight2);
                return;
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                int dp2 = AndroidUtilities.dp(21.0f);
                int measuredHeight3 = getMeasuredHeight();
                yx0 yx0Var = (yx0) this.S;
                int measuredHeight4 = (measuredHeight3 - yx0Var.d.f34227v0.getMeasuredHeight()) / 2;
                org.telegram.ui.Components.y9 y9Var2 = yx0Var.d.f34227v0;
                y9Var2.layout(dp2, measuredHeight4, y9Var2.getMeasuredWidth() + dp2, yx0Var.d.f34227v0.getMeasuredHeight() + measuredHeight4);
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
                qs qsVar = (qs) this.S;
                qsVar.U.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
                qsVar.U.setRoundRadius(AndroidUtilities.dp(30.0f));
                return;
            case 1:
                super.onMeasure(i10, i11);
                yx0 yx0Var = (yx0) this.S;
                yx0Var.d.f34227v0.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
                yx0Var.d.f34227v0.setRoundRadius(AndroidUtilities.dp(30.0f));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    public os(yx0 yx0Var, Activity activity) {
        super(activity);
        this.S = yx0Var;
    }

    public os(y01 y01Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(18, context, e6Var, false, false);
        this.S = y01Var;
    }
}
