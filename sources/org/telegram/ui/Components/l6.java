package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.widget.TextView;
import org.telegram.ui.LaunchActivity;
public final class l6 extends ya {
    public l6(LaunchActivity launchActivity, org.telegram.ui.t80 t80Var) {
        super(launchActivity, null);
        org.telegram.ui.Cells.q qVar = new org.telegram.ui.Cells.q(getContext());
        TextView textView = new TextView(getContext());
        addView(qVar, b8.mf.i(30.0f, 30.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
        textView.setGravity(8388611);
        textView.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.vj, null);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(Typeface.SANS_SERIF);
        addView(textView, b8.mf.i(-1.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
        qVar.setImageDrawable(launchActivity.getDrawable(t80Var.f49735b));
        qVar.setOuterPadding(org.telegram.messenger.g0.L(8.0f));
        qVar.setBackgroundOuterPadding(org.telegram.messenger.g0.L(24.0f));
        qVar.setForeground(t80Var.f49736c);
        org.telegram.messenger.k5.r(null, null, 2131754238, new Object[]{org.telegram.messenger.bd.M0(t80Var.d, null)}, textView);
    }
}
