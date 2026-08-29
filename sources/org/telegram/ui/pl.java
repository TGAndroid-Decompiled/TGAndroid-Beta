package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class pl extends nh.t3 {
    public final tn H0;

    public pl(tn tnVar, Activity activity) {
        super(activity, 3);
        this.H0 = tnVar;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        setTranslationY(((-getTop()) - AndroidUtilities.dp(120.0f)) + this.H0.f43039y1);
    }
}
