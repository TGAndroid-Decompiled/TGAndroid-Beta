package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public final class PhotoViewer$$ExternalSyntheticLambda44 implements Runnable {
    public final int $r8$classId;
    public final View f$0;

    public PhotoViewer$$ExternalSyntheticLambda44(View view, int i) {
        this.$r8$classId = i;
        this.f$0 = view;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.setVisibility(8);
                break;
            case 1:
                AndroidUtilities.removeFromParent(this.f$0);
                break;
            case 2:
                StickersActivity.lambda$onClick$1(this.f$0);
                break;
            case 3:
                StickersActivity.lambda$onClick$2(this.f$0);
                break;
            default:
                StickersActivity.lambda$onClick$3(this.f$0);
                break;
        }
    }
}
