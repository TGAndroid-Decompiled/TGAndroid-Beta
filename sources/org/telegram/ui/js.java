package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class js extends org.telegram.ui.Cells.v8 {
    public final int W = 2;
    public final Object f40589a0;

    public js(ls lsVar, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var);
        this.f40589a0 = lsVar;
    }

    @Override
    public int e(int i10) {
        switch (this.W) {
            case 2:
                ProfileActivity profileActivity = ((l01) this.f40589a0).e;
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
                ls lsVar = (ls) this.f40589a0;
                int measuredHeight2 = (measuredHeight - lsVar.U.getMeasuredHeight()) / 2;
                org.telegram.ui.Components.y9 y9Var = lsVar.U;
                y9Var.layout(dp, measuredHeight2, y9Var.getMeasuredWidth() + dp, lsVar.U.getMeasuredHeight() + measuredHeight2);
                return;
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                int dp2 = AndroidUtilities.dp(21.0f);
                int measuredHeight3 = getMeasuredHeight();
                mx0 mx0Var = (mx0) this.f40589a0;
                int measuredHeight4 = (measuredHeight3 - mx0Var.d.f35950u0.getMeasuredHeight()) / 2;
                org.telegram.ui.Components.y9 y9Var2 = mx0Var.d.f35950u0;
                y9Var2.layout(dp2, measuredHeight4, y9Var2.getMeasuredWidth() + dp2, mx0Var.d.f35950u0.getMeasuredHeight() + measuredHeight4);
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
                ls lsVar = (ls) this.f40589a0;
                lsVar.U.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
                lsVar.U.setRoundRadius(AndroidUtilities.dp(30.0f));
                return;
            case 1:
                super.onMeasure(i10, i11);
                mx0 mx0Var = (mx0) this.f40589a0;
                mx0Var.d.f35950u0.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
                mx0Var.d.f35950u0.setRoundRadius(AndroidUtilities.dp(30.0f));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    public js(mx0 mx0Var, Activity activity) {
        super(activity);
        this.f40589a0 = mx0Var;
    }

    public js(l01 l01Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(18, context, u6Var, false, false);
        this.f40589a0 = l01Var;
    }
}
