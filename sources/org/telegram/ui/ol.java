package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;

public final class ol extends lh.w3 {
    public final rn H0;

    public ol(rn rnVar, Activity activity) {
        super(activity, 3);
        this.H0 = rnVar;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        setTranslationY(((-getTop()) - AndroidUtilities.dp(120.0f)) + this.H0.f42278y1);
    }
}
