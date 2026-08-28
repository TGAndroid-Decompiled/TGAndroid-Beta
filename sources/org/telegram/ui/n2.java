package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class n2 extends View {
    public final a70 f40582a;
    public final org.telegram.ui.Components.fq f40583b;

    public n2(Context context, a70 a70Var) {
        super(context);
        this.f40582a = a70Var;
        org.telegram.ui.Components.fq fqVar = new org.telegram.ui.Components.fq(new ColorDrawable(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Qk, false)), org.telegram.ui.ActionBar.f6.U0(context, R.drawable.greydivider_bottom, -16777216));
        this.f40583b = fqVar;
        fqVar.f28550w = true;
        setBackgroundDrawable(fqVar);
        setImportantForAccessibility(2);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i9), AndroidUtilities.dp(12.0f));
        int i11 = org.telegram.ui.ActionBar.f6.Qk;
        ((l4) this.f40582a).getClass();
        org.telegram.ui.ActionBar.f6.v1(this.f40583b, org.telegram.ui.ActionBar.f6.w0(null, i11, false), false);
    }
}
