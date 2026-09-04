package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
public final class dc0 extends g31 {
    public dc0(Bundle bundle) {
        super(bundle);
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        AndroidUtilities.runOnUIThread(new g10(this, 16));
    }
}
