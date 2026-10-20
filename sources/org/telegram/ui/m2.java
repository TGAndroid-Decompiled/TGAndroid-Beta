package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class m2 extends View {
    public final b70 f39097a;
    public final org.telegram.ui.Components.zq f39098b;

    public m2(Context context, b70 b70Var) {
        super(context);
        this.f39097a = b70Var;
        org.telegram.ui.Components.zq zqVar = new org.telegram.ui.Components.zq(new ColorDrawable(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Qk, false)), org.telegram.ui.ActionBar.h6.V0(context, R.drawable.greydivider_bottom, -16777216));
        this.f39098b = zqVar;
        zqVar.f33023w = true;
        setBackgroundDrawable(zqVar);
        setImportantForAccessibility(2);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(12.0f));
        int i12 = org.telegram.ui.ActionBar.h6.Qk;
        ((l4) this.f39097a).getClass();
        org.telegram.ui.ActionBar.h6.w1(this.f39098b, org.telegram.ui.ActionBar.h6.x0(null, i12, false), false);
    }
}
