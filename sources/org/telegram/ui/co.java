package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.NumberTextView;
public final class co extends org.telegram.ui.ActionBar.l5 {
    public boolean M0;
    public final eo N0;

    public co(eo eoVar, Activity activity) {
        super(activity);
        this.N0 = eoVar;
        this.M0 = true;
    }

    @Override
    public final void d(int i10) {
        super.d(i10);
        if (this.M0 && getVisibility() == 0) {
            int dp = AndroidUtilities.dp(4.0f) + getTextWidth();
            eo eoVar = this.N0;
            eoVar.G2 = dp;
            NumberTextView numberTextView = eoVar.F2;
            if (numberTextView != null) {
                numberTextView.setTranslationX(dp);
            }
        }
    }
}
