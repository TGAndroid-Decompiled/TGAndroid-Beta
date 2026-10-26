package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.LaunchActivity;
public final class w6 extends nb {
    public w6(LaunchActivity launchActivity, org.telegram.ui.sa0 sa0Var) {
        super(launchActivity, null);
        org.telegram.ui.Cells.q qVar = new org.telegram.ui.Cells.q(getContext());
        TextView textView = new TextView(getContext());
        addView(qVar, gb1.m(30.0f, 30.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
        textView.setGravity(8388611);
        textView.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.Hi, null);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(Typeface.SANS_SERIF);
        addView(textView, gb1.m(-1.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
        qVar.setImageDrawable(launchActivity.getDrawable(sa0Var.f43438b));
        qVar.setOuterPadding(AndroidUtilities.dp(8.0f));
        qVar.setBackgroundOuterPadding(AndroidUtilities.dp(24.0f));
        qVar.setForeground(sa0Var.f43439c);
        org.telegram.messenger.vh.o(R.string.AppIconChangedTo, new Object[]{LocaleController.getString(sa0Var.d)}, textView);
    }
}
