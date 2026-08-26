package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;

public final class DialogOrContactPickerActivity$$ExternalSyntheticLambda0 implements DialogsActivity.DialogsActivityDelegate, ContactsActivity.ContactsActivityDelegate {
    public final DialogOrContactPickerActivity f$0;

    public DialogOrContactPickerActivity$$ExternalSyntheticLambda0(DialogOrContactPickerActivity dialogOrContactPickerActivity) {
        this.f$0 = dialogOrContactPickerActivity;
    }

    @Override
    public boolean canSelectStories() {
        return false;
    }

    @Override
    public void didSelectContact(TLRPC.User user) {
        this.f$0.showBlockAlert(user);
    }

    @Override
    public boolean didSelectDialogs(DialogsActivity dialogsActivity, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, TopicsFragment topicsFragment) {
        DialogOrContactPickerActivity dialogOrContactPickerActivity = this.f$0;
        dialogOrContactPickerActivity.getClass();
        if (arrayList.isEmpty()) {
            return true;
        }
        long j = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        if (!DialogObject.isUserDialog(j)) {
            return true;
        }
        dialogOrContactPickerActivity.showBlockAlert(dialogOrContactPickerActivity.getMessagesController().getUser(Long.valueOf(j)));
        return true;
    }

    @Override
    public boolean didSelectStories(DialogsActivity dialogsActivity) {
        return false;
    }
}
