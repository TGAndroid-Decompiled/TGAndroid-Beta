package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;

public final class PermissionRequest$$ExternalSyntheticLambda3 implements Utilities.Callback {
    public final int $r8$classId;
    public final Utilities.Callback f$0;

    public PermissionRequest$$ExternalSyntheticLambda3(int i, Utilities.Callback callback) {
        this.$r8$classId = i;
        this.f$0 = callback;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                PermissionRequest.lambda$requestPermission$4(this.f$0, (int[]) obj);
                break;
            default:
                ChatAttachAlertPollLayout.AnonymousClass15.lambda$didPressedButton$0(this.f$0, (String) obj);
                break;
        }
    }
}
