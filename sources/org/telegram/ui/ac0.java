package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
public final class ac0 extends y21 {
    public ac0(Bundle bundle) {
        super(bundle);
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        AndroidUtilities.runOnUIThread(new f10(this, 16));
    }
}
