package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class k2 extends View {
    public final t70 f39064a;
    public final org.telegram.ui.Components.fr f39065b;

    public k2(Context context, t70 t70Var) {
        super(context);
        this.f39064a = t70Var;
        org.telegram.ui.Components.fr frVar = new org.telegram.ui.Components.fr(new ColorDrawable(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Qk, false)), org.telegram.ui.ActionBar.i6.V0(context, R.drawable.greydivider_bottom, -16777216));
        this.f39065b = frVar;
        frVar.f26471w = true;
        setBackgroundDrawable(frVar);
        setImportantForAccessibility(2);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(12.0f));
        int i12 = org.telegram.ui.ActionBar.i6.Qk;
        ((i4) this.f39064a).getClass();
        org.telegram.ui.ActionBar.i6.w1(this.f39065b, org.telegram.ui.ActionBar.i6.x0(null, i12, false), false);
    }
}
