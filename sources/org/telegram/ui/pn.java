package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.NumberTextView;
public final class pn extends org.telegram.ui.ActionBar.j5 {
    public boolean M0;
    public final qn N0;

    public pn(qn qnVar, Activity activity) {
        super(activity);
        this.N0 = qnVar;
        this.M0 = true;
    }

    @Override
    public final void d(int i10) {
        super.d(i10);
        if (this.M0 && getVisibility() == 0) {
            int dp = AndroidUtilities.dp(4.0f) + getTextWidth();
            qn qnVar = this.N0;
            qnVar.G2 = dp;
            NumberTextView numberTextView = qnVar.F2;
            if (numberTextView != null) {
                numberTextView.setTranslationX(dp);
            }
        }
    }
}
