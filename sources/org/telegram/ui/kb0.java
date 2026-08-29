package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
public final class kb0 extends a21 {
    public kb0(Bundle bundle) {
        super(bundle);
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        AndroidUtilities.runOnUIThread(new q00(this, 16));
    }
}
