package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.NumberTextView;
public final class pn extends org.telegram.ui.ActionBar.h5 {
    public boolean I0;
    public final qn J0;

    public pn(qn qnVar, Activity activity) {
        super(activity);
        this.J0 = qnVar;
        this.I0 = true;
    }

    @Override
    public final void d(int i9) {
        super.d(i9);
        if (this.I0 && getVisibility() == 0) {
            int dp = AndroidUtilities.dp(4.0f) + getTextWidth();
            qn qnVar = this.J0;
            qnVar.C2 = dp;
            NumberTextView numberTextView = qnVar.B2;
            if (numberTextView != null) {
                numberTextView.setTranslationX(dp);
            }
        }
    }
}
