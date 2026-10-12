package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.NumberTextView;
public final class eo extends org.telegram.ui.ActionBar.h5 {
    public boolean M0;
    public final fo N0;

    public eo(fo foVar, Activity activity) {
        super(activity);
        this.N0 = foVar;
        this.M0 = true;
    }

    @Override
    public final void d(int i10) {
        super.d(i10);
        if (this.M0 && getVisibility() == 0) {
            int dp = AndroidUtilities.dp(4.0f) + getTextWidth();
            fo foVar = this.N0;
            foVar.G2 = dp;
            NumberTextView numberTextView = foVar.F2;
            if (numberTextView != null) {
                numberTextView.setTranslationX(dp);
            }
        }
    }
}
