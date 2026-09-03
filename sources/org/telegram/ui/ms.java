package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ms extends org.telegram.ui.Cells.o8 {
    public final int N = 1;
    public final Object O;

    public ms(os osVar, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.O = osVar;
    }

    @Override
    public int c(int i10) {
        switch (this.N) {
            case 2:
                ((n01) this.O).f39152e.getClass();
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
                os osVar = (os) this.O;
                int measuredHeight2 = (measuredHeight - osVar.R.getMeasuredHeight()) / 2;
                org.telegram.ui.Components.p9 p9Var = osVar.R;
                p9Var.layout(dp, measuredHeight2, p9Var.getMeasuredWidth() + dp, osVar.R.getMeasuredHeight() + measuredHeight2);
                return;
            case 1:
                super.onLayout(z4, i10, i11, i12, i13);
                int dp2 = AndroidUtilities.dp(21.0f);
                int measuredHeight3 = getMeasuredHeight();
                lx0 lx0Var = (lx0) this.O;
                int measuredHeight4 = (measuredHeight3 - lx0Var.d.f34538s0.getMeasuredHeight()) / 2;
                org.telegram.ui.Components.p9 p9Var2 = lx0Var.d.f34538s0;
                p9Var2.layout(dp2, measuredHeight4, p9Var2.getMeasuredWidth() + dp2, lx0Var.d.f34538s0.getMeasuredHeight() + measuredHeight4);
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
                os osVar = (os) this.O;
                osVar.R.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
                osVar.R.setRoundRadius(AndroidUtilities.dp(30.0f));
                return;
            case 1:
                super.onMeasure(i10, i11);
                lx0 lx0Var = (lx0) this.O;
                lx0Var.d.f34538s0.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
                lx0Var.d.f34538s0.setRoundRadius(AndroidUtilities.dp(30.0f));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    public ms(lx0 lx0Var, Activity activity) {
        super(activity);
        this.O = lx0Var;
    }

    public ms(n01 n01Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(18, context, g6Var, false, false);
        this.O = n01Var;
    }
}
