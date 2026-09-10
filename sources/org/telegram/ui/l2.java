package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class l2 extends View {
    public final t70 f34522a;
    public final org.telegram.ui.Components.vq f34523b;

    public l2(Context context, t70 t70Var) {
        super(context);
        this.f34522a = t70Var;
        org.telegram.ui.Components.vq vqVar = new org.telegram.ui.Components.vq(new ColorDrawable(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Qk, false)), org.telegram.ui.ActionBar.j6.U0(context, R.drawable.greydivider_bottom, -16777216));
        this.f34523b = vqVar;
        vqVar.f28580w = true;
        setBackgroundDrawable(vqVar);
        setImportantForAccessibility(2);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(12.0f));
        int i12 = org.telegram.ui.ActionBar.j6.Qk;
        ((j4) this.f34522a).getClass();
        org.telegram.ui.ActionBar.j6.v1(this.f34523b, org.telegram.ui.ActionBar.j6.w0(null, i12, false), false);
    }
}
