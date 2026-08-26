package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;

public final class AlertsCreator$$ExternalSyntheticLambda188 implements Runnable {
    public final int $r8$classId;
    public final MessagesStorage.BooleanCallback f$0;

    public AlertsCreator$$ExternalSyntheticLambda188(MessagesStorage.BooleanCallback booleanCallback, int i) {
        this.$r8$classId = i;
        this.f$0 = booleanCallback;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                MessagesStorage.BooleanCallback booleanCallback = this.f$0;
                if (booleanCallback != null) {
                    booleanCallback.run(false);
                }
                break;
            default:
                MessagesStorage.BooleanCallback booleanCallback2 = this.f$0;
                if (booleanCallback2 != null) {
                    booleanCallback2.run(false);
                }
                break;
        }
    }
}
