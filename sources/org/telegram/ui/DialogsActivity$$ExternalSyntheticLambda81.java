package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;

public final class DialogsActivity$$ExternalSyntheticLambda81 implements MessagesStorage.IntCallback {
    public final int $r8$classId;
    public final DialogsActivity f$0;

    public DialogsActivity$$ExternalSyntheticLambda81(DialogsActivity dialogsActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = dialogsActivity;
    }

    @Override
    public final void run(int i) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$askForPermissons$118(i);
                break;
            default:
                this.f$0.lambda$onResume$81(i);
                break;
        }
    }
}
