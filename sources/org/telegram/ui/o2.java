package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class o2 extends View {
    public final p70 f36626a;
    public final org.telegram.ui.Components.mq f36627b;

    public o2(Context context, p70 p70Var) {
        super(context);
        this.f36626a = p70Var;
        org.telegram.ui.Components.mq mqVar = new org.telegram.ui.Components.mq(new ColorDrawable(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Qk, false)), org.telegram.ui.ActionBar.j6.U0(context, R.drawable.greydivider_bottom, -16777216));
        this.f36627b = mqVar;
        mqVar.f27116w = true;
        setBackgroundDrawable(mqVar);
        setImportantForAccessibility(2);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(12.0f));
        int i12 = org.telegram.ui.ActionBar.j6.Qk;
        ((n4) this.f36626a).getClass();
        org.telegram.ui.ActionBar.j6.v1(this.f36627b, org.telegram.ui.ActionBar.j6.w0(null, i12, false), false);
    }
}
