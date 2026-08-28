package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class gs extends org.telegram.ui.Cells.p8 {
    public final int M = 0;
    public final Object N;

    public gs(is isVar, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var);
        this.N = isVar;
    }

    @Override
    public int c(int i9) {
        switch (this.M) {
            case 2:
                ((vz0) this.N).f43616e.getClass();
                return i9;
            default:
                return i9;
        }
    }

    @Override
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        switch (this.M) {
            case 0:
                super.onLayout(z10, i9, i10, i11, i12);
                int dp = AndroidUtilities.dp(21.0f);
                int measuredHeight = getMeasuredHeight();
                is isVar = (is) this.N;
                int measuredHeight2 = (measuredHeight - isVar.Q.getMeasuredHeight()) / 2;
                org.telegram.ui.Components.o9 o9Var = isVar.Q;
                o9Var.layout(dp, measuredHeight2, o9Var.getMeasuredWidth() + dp, isVar.Q.getMeasuredHeight() + measuredHeight2);
                return;
            case 1:
                super.onLayout(z10, i9, i10, i11, i12);
                int dp2 = AndroidUtilities.dp(21.0f);
                int measuredHeight3 = getMeasuredHeight();
                uw0 uw0Var = (uw0) this.N;
                int measuredHeight4 = (measuredHeight3 - uw0Var.d.f35894r0.getMeasuredHeight()) / 2;
                org.telegram.ui.Components.o9 o9Var2 = uw0Var.d.f35894r0;
                o9Var2.layout(dp2, measuredHeight4, o9Var2.getMeasuredWidth() + dp2, uw0Var.d.f35894r0.getMeasuredHeight() + measuredHeight4);
                return;
            default:
                super.onLayout(z10, i9, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i9, int i10) {
        switch (this.M) {
            case 0:
                super.onMeasure(i9, i10);
                is isVar = (is) this.N;
                isVar.Q.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
                isVar.Q.setRoundRadius(AndroidUtilities.dp(30.0f));
                return;
            case 1:
                super.onMeasure(i9, i10);
                uw0 uw0Var = (uw0) this.N;
                uw0Var.d.f35894r0.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
                uw0Var.d.f35894r0.setRoundRadius(AndroidUtilities.dp(30.0f));
                return;
            default:
                super.onMeasure(i9, i10);
                return;
        }
    }

    public gs(uw0 uw0Var, Activity activity) {
        super(activity);
        this.N = uw0Var;
    }

    public gs(vz0 vz0Var, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(18, context, b6Var, false, false);
        this.N = vz0Var;
    }
}
