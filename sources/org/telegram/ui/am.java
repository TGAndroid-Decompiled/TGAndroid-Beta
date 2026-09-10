package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class am extends bi.x4 {
    public final eo L0;

    public am(eo eoVar, Activity activity) {
        super(activity, 3);
        this.L0 = eoVar;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        setTranslationY(((-getTop()) - AndroidUtilities.dp(120.0f)) + this.L0.C1);
    }
}
