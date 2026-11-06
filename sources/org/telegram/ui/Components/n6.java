package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.widget.TextView;
import org.telegram.ui.LaunchActivity;
public final class n6 extends za {
    public n6(LaunchActivity launchActivity, org.telegram.ui.w80 w80Var) {
        super(launchActivity, null);
        org.telegram.ui.Cells.q qVar = new org.telegram.ui.Cells.q(getContext());
        TextView textView = new TextView(getContext());
        addView(qVar, c8.ha.i(30.0f, 30.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
        textView.setGravity(8388611);
        textView.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.vj, null);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(Typeface.SANS_SERIF);
        addView(textView, c8.ha.i(-1.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
        qVar.setImageDrawable(launchActivity.getDrawable(w80Var.f51016b));
        qVar.setOuterPadding(org.telegram.messenger.g0.L(8.0f));
        qVar.setBackgroundOuterPadding(org.telegram.messenger.g0.L(24.0f));
        qVar.setForeground(w80Var.f51017c);
        org.telegram.messenger.k5.r(null, null, 2131754238, new Object[]{org.telegram.messenger.hd.M0(w80Var.d, null)}, textView);
    }
}
