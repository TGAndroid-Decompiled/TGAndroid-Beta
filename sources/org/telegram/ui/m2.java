package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class m2 extends View {
    public final o70 f38830a;
    public final org.telegram.ui.Components.pq f38831b;

    public m2(Context context, o70 o70Var) {
        super(context);
        this.f38830a = o70Var;
        org.telegram.ui.Components.pq pqVar = new org.telegram.ui.Components.pq(new ColorDrawable(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Qk, false)), org.telegram.ui.ActionBar.k6.U0(context, R.drawable.greydivider_bottom, -16777216));
        this.f38831b = pqVar;
        pqVar.f30166w = true;
        setBackgroundDrawable(pqVar);
        setImportantForAccessibility(2);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(12.0f));
        int i12 = org.telegram.ui.ActionBar.k6.Qk;
        ((l4) this.f38830a).getClass();
        org.telegram.ui.ActionBar.k6.v1(this.f38831b, org.telegram.ui.ActionBar.k6.w0(null, i12, false), false);
    }
}
