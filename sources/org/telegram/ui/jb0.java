package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
public final class jb0 extends ai.z0 {
    public jb0(Bundle bundle) {
        super(bundle);
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        AndroidUtilities.runOnUIThread(new p00(this, 18));
    }
}
