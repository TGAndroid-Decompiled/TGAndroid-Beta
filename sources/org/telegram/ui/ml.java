package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class ml extends kh.x3 {
    public final qn H0;

    public ml(qn qnVar, Activity activity) {
        super(activity, 3);
        this.H0 = qnVar;
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        setTranslationY(((-getTop()) - AndroidUtilities.dp(120.0f)) + this.H0.f42142y1);
    }
}
