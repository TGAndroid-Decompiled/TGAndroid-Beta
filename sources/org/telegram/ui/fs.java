package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class fs extends org.telegram.ui.Cells.r8 {
    public final int W = 2;
    public final Object f37414a0;

    public fs(hs hsVar, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.f37414a0 = hsVar;
    }

    @Override
    public int e(int i10) {
        switch (this.W) {
            case 2:
                ((f01) this.f37414a0).e.getClass();
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
                hs hsVar = (hs) this.f37414a0;
                int measuredHeight2 = (measuredHeight - hsVar.U.getMeasuredHeight()) / 2;
                org.telegram.ui.Components.w9 w9Var = hsVar.U;
                w9Var.layout(dp, measuredHeight2, w9Var.getMeasuredWidth() + dp, hsVar.U.getMeasuredHeight() + measuredHeight2);
                return;
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                int dp2 = AndroidUtilities.dp(21.0f);
                int measuredHeight3 = getMeasuredHeight();
                gx0 gx0Var = (gx0) this.f37414a0;
                int measuredHeight4 = (measuredHeight3 - gx0Var.d.f33863w0.getMeasuredHeight()) / 2;
                org.telegram.ui.Components.w9 w9Var2 = gx0Var.d.f33863w0;
                w9Var2.layout(dp2, measuredHeight4, w9Var2.getMeasuredWidth() + dp2, gx0Var.d.f33863w0.getMeasuredHeight() + measuredHeight4);
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
                hs hsVar = (hs) this.f37414a0;
                hsVar.U.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
                hsVar.U.setRoundRadius(AndroidUtilities.dp(30.0f));
                return;
            case 1:
                super.onMeasure(i10, i11);
                gx0 gx0Var = (gx0) this.f37414a0;
                gx0Var.d.f33863w0.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
                gx0Var.d.f33863w0.setRoundRadius(AndroidUtilities.dp(30.0f));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    public fs(gx0 gx0Var, Activity activity) {
        super(activity);
        this.f37414a0 = gx0Var;
    }

    public fs(f01 f01Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(18, context, g6Var, false, false);
        this.f37414a0 = f01Var;
    }
}
