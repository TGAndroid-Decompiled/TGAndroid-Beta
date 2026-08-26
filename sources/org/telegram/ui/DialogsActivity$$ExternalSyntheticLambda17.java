package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;

public final class DialogsActivity$$ExternalSyntheticLambda17 implements Utilities.Callback {
    public final int $r8$classId;
    public final DialogsActivity f$0;

    public DialogsActivity$$ExternalSyntheticLambda17(DialogsActivity dialogsActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = dialogsActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                DialogsActivity dialogsActivity = this.f$0;
                dialogsActivity.cacheSize = (Long) obj;
                dialogsActivity.updateDialogsHint();
                break;
            default:
                this.f$0.lambda$updateDialogsHint$48((TL_account.TL_birthday) obj);
                break;
        }
    }
}
