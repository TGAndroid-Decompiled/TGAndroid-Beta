package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class j2 extends View {
    public final u70 f34776a;
    public final org.telegram.ui.Components.pq f34777b;

    public j2(Context context, u70 u70Var) {
        super(context);
        this.f34776a = u70Var;
        org.telegram.ui.Components.pq pqVar = new org.telegram.ui.Components.pq(new ColorDrawable(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Qk, false)), org.telegram.ui.ActionBar.i6.U0(context, R.drawable.greydivider_bottom, -16777216));
        this.f34777b = pqVar;
        pqVar.f27122w = true;
        setBackgroundDrawable(pqVar);
        setImportantForAccessibility(2);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(12.0f));
        int i12 = org.telegram.ui.ActionBar.i6.Qk;
        ((h4) this.f34776a).getClass();
        org.telegram.ui.ActionBar.i6.v1(this.f34777b, org.telegram.ui.ActionBar.i6.w0(null, i12, false), false);
    }
}
