package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.NumberTextView;
public final class bo extends org.telegram.ui.ActionBar.j5 {
    public boolean M0;
    public final co N0;

    public bo(co coVar, Activity activity) {
        super(activity);
        this.N0 = coVar;
        this.M0 = true;
    }

    @Override
    public final void d(int i10) {
        super.d(i10);
        if (this.M0 && getVisibility() == 0) {
            int dp = AndroidUtilities.dp(4.0f) + getTextWidth();
            co coVar = this.N0;
            coVar.G2 = dp;
            NumberTextView numberTextView = coVar.F2;
            if (numberTextView != null) {
                numberTextView.setTranslationX(dp);
            }
        }
    }
}
