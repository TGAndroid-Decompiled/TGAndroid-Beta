package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;

public final class ImageUpdater$$ExternalSyntheticLambda3 implements Utilities.Callback0Return {
    public final int $r8$classId;
    public final Object f$0;

    public ImageUpdater$$ExternalSyntheticLambda3(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final Object run() {
        switch (this.$r8$classId) {
            case 0:
                return ((ImageUpdater.ImageUpdaterDelegate) this.f$0).getCloseIntoObject();
            default:
                return Boolean.valueOf(((EditTextBoldCursor) this.f$0).shouldShowQuoteButton());
        }
    }
}
