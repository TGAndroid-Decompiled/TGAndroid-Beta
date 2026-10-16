package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
public final class gc0 extends l31 {
    public gc0(Bundle bundle) {
        super(bundle);
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        AndroidUtilities.runOnUIThread(new zz(this, 17));
    }
}
