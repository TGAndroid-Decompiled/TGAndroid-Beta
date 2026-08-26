package org.telegram.ui;

import com.google.zxing.BinaryBitmap;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Stories.StoriesController;

public final class DialogsActivity$$ExternalSyntheticLambda182 implements Runnable {
    public final int $r8$classId;
    public final DialogsActivity f$0;
    public final long f$1;
    public final boolean f$2;

    public DialogsActivity$$ExternalSyntheticLambda182(DialogsActivity dialogsActivity, long j, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = dialogsActivity;
        this.f$1 = j;
        this.f$2 = z;
    }

    @Override
    public final void run() {
        String name;
        TLRPC.User user;
        boolean z = this.f$2;
        long j = this.f$1;
        DialogsActivity dialogsActivity = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                DialogsActivity dialogsActivity2 = this.f$0;
                StoriesController storiesController = dialogsActivity2.getMessagesController().getStoriesController();
                long j2 = this.f$1;
                boolean z2 = this.f$2;
                storiesController.toggleHidden(j2, z2, false);
                BinaryBitmap binaryBitmap = new BinaryBitmap(24);
                binaryBitmap.binarizer = new DialogsActivity$$ExternalSyntheticLambda182(dialogsActivity2, j2, z2, 1);
                binaryBitmap.matrix = new DialogsActivity$$ExternalSyntheticLambda182(dialogsActivity2, j2, z2, 2);
                if (j2 >= 0) {
                    TLRPC.User user2 = dialogsActivity2.getMessagesController().getUser(Long.valueOf(j2));
                    name = ContactsController.formatName(user2.first_name, null, 15);
                    user = user2;
                } else {
                    TLRPC.Chat chat = dialogsActivity2.getMessagesController().getChat(Long.valueOf(-j2));
                    name = chat.title;
                    user = chat;
                }
                dialogsActivity2.storiesBulletin = BulletinFactory.global().createUsersBulletin(Collections.singletonList(user), dialogsActivity2.isArchive() ? AndroidUtilities.replaceTags(LocaleController.formatString("StoriesMovedToDialogs", R.string.StoriesMovedToDialogs, name)) : AndroidUtilities.replaceTags(LocaleController.formatString("StoriesMovedToContacts", R.string.StoriesMovedToContacts, ContactsController.formatName(name, null, 15))), null, binaryBitmap).show();
                break;
            case 1:
                dialogsActivity.getMessagesController().getStoriesController().toggleHidden(j, !z, false);
                break;
            default:
                dialogsActivity.getMessagesController().getStoriesController().toggleHidden(j, z, true);
                break;
        }
    }
}
