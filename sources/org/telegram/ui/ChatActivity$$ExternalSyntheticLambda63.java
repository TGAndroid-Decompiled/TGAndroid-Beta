package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;

public final class ChatActivity$$ExternalSyntheticLambda63 implements View.OnLongClickListener {
    public final int $r8$classId;
    public final ChatActivity f$0;

    public ChatActivity$$ExternalSyntheticLambda63(ChatActivity chatActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = chatActivity;
    }

    @Override
    public final boolean onLongClick(View view) {
        MessageObject messageObject;
        MessageObject messageObject2;
        switch (this.$r8$classId) {
            case 0:
                ChatActivity chatActivity = this.f$0;
                int i = chatActivity.fieldPanelShown;
                if (i == 1 && (messageObject2 = chatActivity.editingMessageObject) != null) {
                    chatActivity.scrollToMessageId(messageObject2.getId(), 0, true, 0, true, 0);
                    return true;
                }
                if (chatActivity.messagePreviewParams == null || i != 2 || (messageObject = chatActivity.replyingMessageObject) == null) {
                    return false;
                }
                chatActivity.scrollToMessageId(messageObject.getId(), 0, true, 0, true, 0);
                return true;
            case 1:
                ChatActivity chatActivity2 = this.f$0;
                MessageObject messageObject3 = chatActivity2.selectedObject;
                if (messageObject3 == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject3.sponsoredUrl)) {
                    new BulletinFactory(new Bulletin.BulletinWindow(chatActivity2.getParentActivity(), null).container, chatActivity2.themeDelegate).createCopyLinkBulletin(false).show();
                }
                return true;
            default:
                return this.f$0.lambda$updateTopPanel$229();
        }
    }
}
