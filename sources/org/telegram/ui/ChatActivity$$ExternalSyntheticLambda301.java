package org.telegram.ui;

import android.text.style.CharacterStyle;
import java.io.Serializable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.ScrimOptions;

public final class ChatActivity$$ExternalSyntheticLambda301 implements Utilities.Callback2 {
    public final int $r8$classId = 0;
    public final ChatActivity f$0;
    public final Browser.Progress f$1;
    public final ChatMessageCell f$2;
    public final Serializable f$3;
    public final Object f$4;

    public ChatActivity$$ExternalSyntheticLambda301(ChatActivity chatActivity, ChatActivity.AnonymousClass127 anonymousClass127, ChatMessageCell chatMessageCell, String str, CharacterStyle characterStyle) {
        this.f$0 = chatActivity;
        this.f$1 = anonymousClass127;
        this.f$2 = chatMessageCell;
        this.f$3 = str;
        this.f$4 = characterStyle;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        long j;
        boolean zIsChannelAndNotMegaGroup;
        boolean z;
        int i;
        TL_iv.RichMessage richMessage;
        MessageObject messageObject;
        TLRPC.Message message;
        ChatMessageCell chatMessageCell;
        switch (this.$r8$classId) {
            case 0:
                TLObject tLObject = (TLObject) obj;
                Boolean bool = (Boolean) obj2;
                ChatActivity chatActivity = this.f$0;
                chatActivity.getClass();
                ((ChatActivity.AnonymousClass127) this.f$1).end(false);
                if (tLObject instanceof TLRPC.User) {
                    j = ((TLRPC.User) tLObject).id;
                    zIsChannelAndNotMegaGroup = false;
                    z = true;
                } else {
                    if (tLObject instanceof TLRPC.Chat) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                        j = -chat.id;
                        zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
                    } else {
                        j = 0;
                        zIsChannelAndNotMegaGroup = false;
                    }
                    z = false;
                }
                ChatMessageCell chatMessageCell2 = this.f$2;
                ItemOptions itemOptions = new ItemOptions(chatActivity, chatMessageCell2, true, true);
                ScrimOptions scrimOptions = new ScrimOptions(chatActivity.getParentActivity(), chatActivity.themeDelegate);
                itemOptions.dismissListener = new ChatActivity$$ExternalSyntheticLambda112(scrimOptions, 0);
                if (j != 0) {
                    itemOptions.add(zIsChannelAndNotMegaGroup ? R.drawable.msg_channel : R.drawable.msg_discussion, LocaleController.getString(zIsChannelAndNotMegaGroup ? R.string.ViewChannel : R.string.SendMessage), new ChatActivity$$ExternalSyntheticLambda103(chatActivity, j, 4), false);
                }
                int i2 = R.drawable.msg_copy;
                String string = LocaleController.getString(R.string.ProfileCopyUsername);
                String str = (String) this.f$3;
                boolean z2 = zIsChannelAndNotMegaGroup;
                itemOptions.add(i2, string, new ChatActivity$$ExternalSyntheticLambda134(chatActivity, scrimOptions, str, 1), false);
                if (bool.booleanValue()) {
                    itemOptions.add(R.drawable.outline_gram_24, LocaleController.getString(R.string.BuyUsernameOnFragment), new ChatActivity$$ExternalSyntheticLambda114(chatActivity, str, 11), false);
                }
                itemOptions.addGap();
                if (j != 0) {
                    if (z) {
                        i = R.string.ViewProfile;
                    } else {
                        i = z2 ? R.string.ViewChannelProfile : R.string.ViewGroupProfile;
                    }
                    itemOptions.addProfile(tLObject, LocaleController.getString(i), new ChatActivity$$ExternalSyntheticLambda103(chatActivity, j, 5));
                } else {
                    itemOptions.addText(13, AndroidUtilities.dp(200.0f), LocaleController.getString(R.string.NoUsernameFound2));
                }
                scrimOptions.setItemOptions(itemOptions);
                scrimOptions.setScrim(chatMessageCell2, (CharacterStyle) this.f$4, null, false);
                chatActivity.showDialog(scrimOptions);
                break;
            default:
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                ChatActivity chatActivity2 = this.f$0;
                Browser.Progress progress = chatActivity2.progressDialogCurrent;
                ChatActivity.AnonymousClass128 anonymousClass128 = (ChatActivity.AnonymousClass128) this.f$1;
                if (progress == anonymousClass128) {
                    ((int[]) this.f$3)[0] = 0;
                    anonymousClass128.end(false);
                    if (messages_messages != null) {
                        chatActivity2.getMessagesController().putUsers(messages_messages.users, false);
                        chatActivity2.getMessagesController().putChats(messages_messages.chats, false);
                        int i3 = 0;
                        while (true) {
                            if (i3 < messages_messages.messages.size()) {
                                TLRPC.Message message2 = messages_messages.messages.get(i3);
                                if (message2 == null || (richMessage = message2.rich_message) == null) {
                                    i3++;
                                }
                            } else {
                                richMessage = null;
                            }
                        }
                        if (richMessage != null && (message = (messageObject = (MessageObject) this.f$4).messageOwner) != null) {
                            message.rich_message = richMessage;
                            messageObject.richLayout = null;
                            ChatActivity.ChatMessageCellDelegate chatMessageCellDelegate = chatActivity2.chatMessageCellDelegate;
                            if (chatMessageCellDelegate != null && (chatMessageCell = this.f$2) != null) {
                                chatMessageCellDelegate.forceUpdate(chatMessageCell, true, false, true);
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }

    public ChatActivity$$ExternalSyntheticLambda301(ChatActivity chatActivity, ChatActivity.AnonymousClass128 anonymousClass128, int[] iArr, ChatMessageCell chatMessageCell, MessageObject messageObject) {
        this.f$0 = chatActivity;
        this.f$1 = anonymousClass128;
        this.f$3 = iArr;
        this.f$2 = chatMessageCell;
        this.f$4 = messageObject;
    }
}
