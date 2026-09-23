package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class k2 extends View {
    public final r70 f34554a;
    public final org.telegram.ui.Components.qq f34555b;

    public k2(Context context, r70 r70Var) {
        super(context);
        this.f34554a = r70Var;
        org.telegram.ui.Components.qq qqVar = new org.telegram.ui.Components.qq(new ColorDrawable(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Qk, false)), org.telegram.ui.ActionBar.h6.U0(context, R.drawable.greydivider_bottom, -16777216));
        this.f34555b = qqVar;
        qqVar.f27431w = true;
        setBackgroundDrawable(qqVar);
        setImportantForAccessibility(2);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(12.0f));
        int i12 = org.telegram.ui.ActionBar.h6.Qk;
        ((i4) this.f34554a).getClass();
        org.telegram.ui.ActionBar.h6.v1(this.f34555b, org.telegram.ui.ActionBar.h6.w0(null, i12, false), false);
    }
}
