package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class k2 extends View {
    public final w70 f39345a;
    public final org.telegram.ui.Components.hr f39346b;

    public k2(Context context, w70 w70Var) {
        super(context);
        this.f39345a = w70Var;
        org.telegram.ui.Components.hr hrVar = new org.telegram.ui.Components.hr(new ColorDrawable(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Qk, false)), org.telegram.ui.ActionBar.h6.V0(context, R.drawable.greydivider_bottom, -16777216));
        this.f39346b = hrVar;
        hrVar.f26883w = true;
        setBackgroundDrawable(hrVar);
        setImportantForAccessibility(2);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(12.0f));
        int i12 = org.telegram.ui.ActionBar.h6.Qk;
        ((i4) this.f39345a).getClass();
        org.telegram.ui.ActionBar.h6.w1(this.f39346b, org.telegram.ui.ActionBar.h6.x0(null, i12, false), false);
    }
}
