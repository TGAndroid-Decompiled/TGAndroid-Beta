package org.telegram.ui;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;

public final class ChatActivity$$ExternalSyntheticLambda358 implements PollCreateActivity.PollCreateActivityDelegate, DialogsActivity.DialogsActivityDelegate {
    public final Object f$0;
    public final boolean f$1;
    public final Object f$2;
    public final int f$3;

    public ChatActivity$$ExternalSyntheticLambda358(ChatActivity chatActivity, boolean z, MessageObject messageObject, int i) {
        this.f$0 = chatActivity;
        this.f$1 = z;
        this.f$2 = messageObject;
        this.f$3 = i;
    }

    @Override
    public boolean canSelectStories() {
        return false;
    }

    @Override
    public boolean didSelectDialogs(DialogsActivity dialogsActivity, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, TopicsFragment topicsFragment) {
        LaunchActivity launchActivity = (LaunchActivity) this.f$0;
        launchActivity.getClass();
        long j = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        Bundle bundle = new Bundle();
        bundle.putBoolean("scrollToTopOnResume", true);
        bundle.putBoolean("hasUrl", this.f$1);
        if (DialogObject.isEncryptedDialog(j)) {
            bundle.putInt("enc_id", DialogObject.getEncryptedChatId(j));
        } else if (DialogObject.isUserDialog(j)) {
            bundle.putLong("user_id", j);
        } else {
            bundle.putLong("chat_id", -j);
        }
        int i3 = this.f$3;
        if (MessagesController.getInstance(i3).checkCanOpenChat(bundle, dialogsActivity)) {
            NotificationCenter.getInstance(i3).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
            MediaDataController.getInstance(i3).saveDraft(j, 0, (String) this.f$2, null, null, false, 0L);
            ((ActionBarLayout) launchActivity.getActionBarLayout()).presentFragment$1(new ChatActivity(bundle), true, false);
        }
        return true;
    }

    @Override
    public boolean didSelectStories(DialogsActivity dialogsActivity) {
        return false;
    }

    @Override
    public void sendPoll(TLRPC.MessageMedia messageMedia) {
        int i;
        ChatActivity chatActivity = (ChatActivity) this.f$0;
        chatActivity.getClass();
        boolean z = this.f$1;
        MessageObject messageObject = (MessageObject) this.f$2;
        if (!z) {
            if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
                TLRPC.MessageMedia messageMedia2 = messageObject.messageOwner.media;
                if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                    ((TLRPC.TL_messageMediaToDo) messageMedia).completions = ((TLRPC.TL_messageMediaToDo) messageMedia2).completions;
                }
            }
            messageObject.messageOwner.media = messageMedia;
            chatActivity.getSendMessagesHelper().editMessage(messageObject, null, null, null, null, null, null, false, false, null);
            return;
        }
        TLRPC.TL_messages_appendTodoList tL_messages_appendTodoList = new TLRPC.TL_messages_appendTodoList();
        tL_messages_appendTodoList.peer = chatActivity.getMessagesController().getInputPeer(messageObject.getDialogId());
        tL_messages_appendTodoList.msg_id = messageObject.getId();
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
            int i2 = 0;
            int iMax = 0;
            while (true) {
                i = this.f$3;
                if (i2 >= i) {
                    break;
                }
                iMax = Math.max(iMax, tL_messageMediaToDo.todo.list.get(i2).id);
                i2++;
            }
            while (i < tL_messageMediaToDo.todo.list.size()) {
                TLRPC.TodoItem todoItem = tL_messageMediaToDo.todo.list.get(i);
                if (todoItem.id <= iMax) {
                    todoItem.id = iMax + 1;
                }
                tL_messages_appendTodoList.list.add(todoItem);
                iMax = Math.max(iMax, todoItem.id);
                i++;
            }
            TLRPC.MessageMedia messageMedia3 = messageObject.messageOwner.media;
            if (messageMedia3 instanceof TLRPC.TL_messageMediaToDo) {
                tL_messageMediaToDo.completions = ((TLRPC.TL_messageMediaToDo) messageMedia3).completions;
            }
        }
        messageObject.messageOwner.media = messageMedia;
        chatActivity.getConnectionsManager().sendRequest(tL_messages_appendTodoList, null);
    }

    public ChatActivity$$ExternalSyntheticLambda358(LaunchActivity launchActivity, boolean z, int i, String str) {
        this.f$0 = launchActivity;
        this.f$1 = z;
        this.f$3 = i;
        this.f$2 = str;
    }
}
