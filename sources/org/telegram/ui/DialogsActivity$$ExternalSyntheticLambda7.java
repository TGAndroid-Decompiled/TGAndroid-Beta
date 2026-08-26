package org.telegram.ui;

import android.content.DialogInterface;

public final class DialogsActivity$$ExternalSyntheticLambda7 implements DialogInterface.OnDismissListener {
    public final int $r8$classId;
    public final DialogsActivity f$0;

    public DialogsActivity$$ExternalSyntheticLambda7(DialogsActivity dialogsActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = dialogsActivity;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$performSelectedDialogsAction$113(dialogInterface);
                break;
            case 1:
                this.f$0.lambda$showSuggestion$123(dialogInterface);
                break;
            case 2:
                this.f$0.lambda$openSetAvatar$156(dialogInterface);
                break;
            default:
                this.f$0.lambda$performSelectedDialogsAction$114(dialogInterface);
                break;
        }
    }
}
