package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;

public final class mb0 extends y11 {
    public mb0(Bundle bundle) {
        super(bundle);
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        AndroidUtilities.runOnUIThread(new r00(this, 16));
    }
}
