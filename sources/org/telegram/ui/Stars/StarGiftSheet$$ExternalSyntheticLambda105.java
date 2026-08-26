package org.telegram.ui.Stars;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ImageUpdater;

public final class StarGiftSheet$$ExternalSyntheticLambda105 implements Utilities.Callback0Return {
    public final int $r8$classId;
    public final Object f$0;

    public StarGiftSheet$$ExternalSyntheticLambda105(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final Object run() {
        switch (this.$r8$classId) {
            case 0:
                return ((StarGiftSheet) this.f$0).getBulletinFactory();
            case 1:
                return Boolean.valueOf(((EditTextBoldCursor) this.f$0).shouldShowQuoteButton());
            default:
                return ((ImageUpdater.ImageUpdaterDelegate) this.f$0).getCloseIntoObject();
        }
    }
}
