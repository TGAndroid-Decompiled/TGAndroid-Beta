package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class l2 extends View {
    public final s70 f35229a;
    public final org.telegram.ui.Components.rq f35230b;

    public l2(Context context, s70 s70Var) {
        super(context);
        this.f35229a = s70Var;
        org.telegram.ui.Components.rq rqVar = new org.telegram.ui.Components.rq(new ColorDrawable(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Qk, false)), org.telegram.ui.ActionBar.i6.U0(context, R.drawable.greydivider_bottom, -16777216));
        this.f35230b = rqVar;
        rqVar.f28069w = true;
        setBackgroundDrawable(rqVar);
        setImportantForAccessibility(2);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(12.0f));
        int i12 = org.telegram.ui.ActionBar.i6.Qk;
        ((j4) this.f35229a).getClass();
        org.telegram.ui.ActionBar.i6.v1(this.f35230b, org.telegram.ui.ActionBar.i6.w0(null, i12, false), false);
    }
}
