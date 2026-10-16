package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class m2 extends View {
    public final z70 f37899a;
    public final org.telegram.ui.Components.cr f37900b;

    public m2(Context context, z70 z70Var) {
        super(context);
        this.f37899a = z70Var;
        org.telegram.ui.Components.cr crVar = new org.telegram.ui.Components.cr(new ColorDrawable(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Qk, false)), org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider_bottom, -16777216));
        this.f37900b = crVar;
        crVar.f23883w = true;
        setBackgroundDrawable(crVar);
        setImportantForAccessibility(2);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(12.0f));
        int i12 = org.telegram.ui.ActionBar.g6.Qk;
        ((k4) this.f37899a).getClass();
        org.telegram.ui.ActionBar.g6.w1(this.f37900b, org.telegram.ui.ActionBar.g6.x0(null, i12, false), false);
    }
}
