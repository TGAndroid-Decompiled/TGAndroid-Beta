package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

public final class o2 extends View {

    public final d70 f40976a;

    public final org.telegram.ui.Components.dq f40977b;

    public o2(Context context, d70 d70Var) {
        super(context);
        this.f40976a = d70Var;
        org.telegram.ui.Components.dq dqVar = new org.telegram.ui.Components.dq(new ColorDrawable(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Qk, false)), org.telegram.ui.ActionBar.g6.U0(context, R.drawable.greydivider_bottom, -16777216));
        this.f40977b = dqVar;
        dqVar.f27828w = true;
        setBackgroundDrawable(dqVar);
        setImportantForAccessibility(2);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(12.0f));
        int i12 = org.telegram.ui.ActionBar.g6.Qk;
        ((m4) this.f40976a).getClass();
        org.telegram.ui.ActionBar.g6.v1(this.f40977b, org.telegram.ui.ActionBar.g6.w0(null, i12, false), false);
    }
}
