package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;

public final class DialogsActivity$$ExternalSyntheticLambda40 implements MessagesStorage.IntCallback {
    public final int $r8$classId;
    public final DialogsActivity f$0;

    public DialogsActivity$$ExternalSyntheticLambda40(DialogsActivity dialogsActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = dialogsActivity;
    }

    @Override
    public final void run(int i) {
        switch (this.$r8$classId) {
            case 0:
                DialogsActivity dialogsActivity = this.f$0;
                dialogsActivity.getClass();
                dialogsActivity.askAboutContacts = i != 0;
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts", dialogsActivity.askAboutContacts).commit();
                dialogsActivity.askForPermissons$1(false);
                break;
            default:
                DialogsActivity dialogsActivity2 = this.f$0;
                dialogsActivity2.getClass();
                dialogsActivity2.askAboutContacts = i != 0;
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts", dialogsActivity2.askAboutContacts).apply();
                dialogsActivity2.askForPermissons$1(false);
                break;
        }
    }
}
