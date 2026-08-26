package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;

public final class AlertsCreator$$ExternalSyntheticLambda154 implements Runnable {
    public final int $r8$classId;
    public final MessagesStorage.BooleanCallback f$0;

    public AlertsCreator$$ExternalSyntheticLambda154(int i, MessagesStorage.BooleanCallback booleanCallback) {
        this.$r8$classId = i;
        this.f$0 = booleanCallback;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                AlertsCreator.lambda$createClearOrDeleteDialogAlert$73(this.f$0);
                break;
            default:
                AlertsCreator.lambda$createClearOrDeleteDialogAlert$76(this.f$0);
                break;
        }
    }
}
