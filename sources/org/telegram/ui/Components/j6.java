package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.widget.TextView;
import org.telegram.ui.LaunchActivity;
public final class j6 extends ta {
    public j6(LaunchActivity launchActivity, org.telegram.ui.ba0 ba0Var) {
        super(launchActivity, null);
        org.telegram.ui.Cells.q qVar = new org.telegram.ui.Cells.q(getContext());
        TextView textView = new TextView(getContext());
        addView(qVar, w7.b6.i(30.0f, 30.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
        textView.setGravity(8388611);
        textView.setPadding(0, org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f));
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.vj, null);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(Typeface.SANS_SERIF);
        addView(textView, w7.b6.i(-1.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
        qVar.setImageDrawable(launchActivity.getDrawable(ba0Var.f36148b));
        qVar.setOuterPadding(org.telegram.messenger.i0.L(8.0f));
        qVar.setBackgroundOuterPadding(org.telegram.messenger.i0.L(24.0f));
        qVar.setForeground(ba0Var.f36149c);
        org.telegram.messenger.m5.q(null, null, 2131754238, new Object[]{org.telegram.messenger.cd.L0(ba0Var.d, null)}, textView);
    }
}
