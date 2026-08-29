package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class o2 extends View {
    public final d70 f40957a;
    public final org.telegram.ui.Components.jq f40958b;

    public o2(Context context, d70 d70Var) {
        super(context);
        this.f40957a = d70Var;
        org.telegram.ui.Components.jq jqVar = new org.telegram.ui.Components.jq(new ColorDrawable(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Qk, false)), org.telegram.ui.ActionBar.g6.U0(context, R.drawable.greydivider_bottom, -16777216));
        this.f40958b = jqVar;
        jqVar.f29792w = true;
        setBackgroundDrawable(jqVar);
        setImportantForAccessibility(2);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(12.0f));
        int i12 = org.telegram.ui.ActionBar.g6.Qk;
        ((m4) this.f40957a).getClass();
        org.telegram.ui.ActionBar.g6.v1(this.f40958b, org.telegram.ui.ActionBar.g6.w0(null, i12, false), false);
    }
}
