package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.BulletinFactory;

public final class ChatActivity$ChatMessageCellDelegate$$ExternalSyntheticLambda34 implements Runnable {
    public final int $r8$classId;
    public final ChatActivity.ChatMessageCellDelegate f$0;
    public final TLRPC.Chat f$1;

    public ChatActivity$ChatMessageCellDelegate$$ExternalSyntheticLambda34(ChatActivity.ChatMessageCellDelegate chatMessageCellDelegate, TLRPC.Chat chat, int i) {
        this.$r8$classId = i;
        this.f$0 = chatMessageCellDelegate;
        this.f$1 = chat;
    }

    @Override
    public final void run() {
        TLRPC.Chat chat = this.f$1;
        ChatActivity.ChatMessageCellDelegate chatMessageCellDelegate = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                chatMessageCellDelegate.getClass();
                if (chat != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", chat.id);
                    bundle.putBoolean("expandPhoto", false);
                    ChatActivity.this.presentFragment(new ProfileActivity(bundle, null));
                }
                break;
            case 1:
                chatMessageCellDelegate.appendMention(chat);
                break;
            case 2:
                ChatActivity.this.openSearchWithChat(chat);
                break;
            default:
                BulletinFactory.of(ChatActivity.this).createSimpleBulletinWithIconSize(R.raw.contact_check, 36, LocaleController.formatString(R.string.YouJoinedChannel, chat == null ? "" : chat.title)).show(true);
                break;
        }
    }
}
