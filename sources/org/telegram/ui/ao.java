package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.NumberTextView;
public final class ao extends org.telegram.ui.ActionBar.k5 {
    public boolean M0;
    public final bo N0;

    public ao(bo boVar, Activity activity) {
        super(activity);
        this.N0 = boVar;
        this.M0 = true;
    }

    @Override
    public final void d(int i10) {
        super.d(i10);
        if (this.M0 && getVisibility() == 0) {
            int dp = AndroidUtilities.dp(4.0f) + getTextWidth();
            bo boVar = this.N0;
            boVar.G2 = dp;
            NumberTextView numberTextView = boVar.F2;
            if (numberTextView != null) {
                numberTextView.setTranslationX(dp);
            }
        }
    }
}
