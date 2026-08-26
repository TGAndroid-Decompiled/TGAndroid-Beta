package org.telegram.ui;

import android.content.DialogInterface;

public final class DialogsActivity$$ExternalSyntheticLambda90 implements DialogInterface.OnDismissListener {
    public final int $r8$classId;
    public final DialogsActivity f$0;

    public DialogsActivity$$ExternalSyntheticLambda90(DialogsActivity dialogsActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = dialogsActivity;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.hideActionMode$1(true);
                break;
            case 1:
                this.f$0.lambda$openSetAvatar$156();
                break;
            case 2:
                DialogsActivity dialogsActivity = this.f$0;
                if (dialogsActivity.showingSuggestion != null) {
                    dialogsActivity.getMessagesController().removeSuggestion(0L, dialogsActivity.showingSuggestion);
                    dialogsActivity.showingSuggestion = null;
                    dialogsActivity.showNextSupportedSuggestion();
                    break;
                }
                break;
            default:
                this.f$0.hideActionMode$1(true);
                break;
        }
    }
}
