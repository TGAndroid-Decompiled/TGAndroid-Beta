package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class fs extends org.telegram.ui.Cells.m8 {
    public final int M = 0;
    public final Object N;

    public fs(hs hsVar, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.N = hsVar;
    }

    @Override
    public int c(int i10) {
        switch (this.M) {
            case 2:
                ((vz0) this.N).f43803e.getClass();
                return i10;
            default:
                return i10;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.M) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                int dp = AndroidUtilities.dp(21.0f);
                int measuredHeight = getMeasuredHeight();
                hs hsVar = (hs) this.N;
                int measuredHeight2 = (measuredHeight - hsVar.Q.getMeasuredHeight()) / 2;
                org.telegram.ui.Components.t9 t9Var = hsVar.Q;
                t9Var.layout(dp, measuredHeight2, t9Var.getMeasuredWidth() + dp, hsVar.Q.getMeasuredHeight() + measuredHeight2);
                return;
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                int dp2 = AndroidUtilities.dp(21.0f);
                int measuredHeight3 = getMeasuredHeight();
                tw0 tw0Var = (tw0) this.N;
                int measuredHeight4 = (measuredHeight3 - tw0Var.d.f35960r0.getMeasuredHeight()) / 2;
                org.telegram.ui.Components.t9 t9Var2 = tw0Var.d.f35960r0;
                t9Var2.layout(dp2, measuredHeight4, t9Var2.getMeasuredWidth() + dp2, tw0Var.d.f35960r0.getMeasuredHeight() + measuredHeight4);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.M) {
            case 0:
                super.onMeasure(i10, i11);
                hs hsVar = (hs) this.N;
                hsVar.Q.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
                hsVar.Q.setRoundRadius(AndroidUtilities.dp(30.0f));
                return;
            case 1:
                super.onMeasure(i10, i11);
                tw0 tw0Var = (tw0) this.N;
                tw0Var.d.f35960r0.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
                tw0Var.d.f35960r0.setRoundRadius(AndroidUtilities.dp(30.0f));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    public fs(tw0 tw0Var, Activity activity) {
        super(activity);
        this.N = tw0Var;
    }

    public fs(vz0 vz0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(18, context, c6Var, false, false);
        this.N = vz0Var;
    }
}
