package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class m2 extends View {
    public final n70 f36165a;
    public final org.telegram.ui.Components.nq f36166b;

    public m2(Context context, n70 n70Var) {
        super(context);
        this.f36165a = n70Var;
        org.telegram.ui.Components.nq nqVar = new org.telegram.ui.Components.nq(new ColorDrawable(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Qk, false)), org.telegram.ui.ActionBar.j6.U0(context, R.drawable.greydivider_bottom, -16777216));
        this.f36166b = nqVar;
        nqVar.f27342w = true;
        setBackgroundDrawable(nqVar);
        setImportantForAccessibility(2);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(12.0f));
        int i12 = org.telegram.ui.ActionBar.j6.Qk;
        ((l4) this.f36165a).getClass();
        org.telegram.ui.ActionBar.j6.v1(this.f36166b, org.telegram.ui.ActionBar.j6.w0(null, i12, false), false);
    }
}
