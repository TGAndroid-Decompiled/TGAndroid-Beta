package org.telegram.ui;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class pg implements nv0, xx {
    public final boolean f42395a;
    public final int f42396b;
    public final Object f42397c;
    public final Object d;

    public pg(wn wnVar, boolean z10, MessageObject messageObject, int i10) {
        this.f42397c = wnVar;
        this.f42395a = z10;
        this.d = messageObject;
        this.f42396b = i10;
    }

    @Override
    public boolean C() {
        return false;
    }

    @Override
    public boolean K(ey eyVar) {
        return false;
    }

    @Override
    public void a(TLRPC.MessageMedia messageMedia) {
        int i10;
        wn wnVar = (wn) this.f42397c;
        MessageObject messageObject = (MessageObject) this.d;
        if (this.f42395a) {
            TLRPC.TL_messages_appendTodoList tL_messages_appendTodoList = new TLRPC.TL_messages_appendTodoList();
            tL_messages_appendTodoList.peer = wnVar.getMessagesController().getInputPeer(messageObject.getDialogId());
            tL_messages_appendTodoList.msg_id = messageObject.getId();
            if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    i10 = this.f42396b;
                    if (i11 >= i10) {
                        break;
                    }
                    i12 = Math.max(i12, tL_messageMediaToDo.todo.list.get(i11).f22175id);
                    i11++;
                }
                while (i10 < tL_messageMediaToDo.todo.list.size()) {
                    TLRPC.TodoItem todoItem = tL_messageMediaToDo.todo.list.get(i10);
                    if (todoItem.f22175id <= i12) {
                        todoItem.f22175id = i12 + 1;
                    }
                    tL_messages_appendTodoList.list.add(todoItem);
                    i12 = Math.max(i12, todoItem.f22175id);
                    i10++;
                }
                TLRPC.MessageMedia messageMedia2 = messageObject.messageOwner.media;
                if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                    tL_messageMediaToDo.completions = ((TLRPC.TL_messageMediaToDo) messageMedia2).completions;
                }
            }
            messageObject.messageOwner.media = messageMedia;
            wnVar.getConnectionsManager().sendRequest(tL_messages_appendTodoList, null);
            return;
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.MessageMedia messageMedia3 = messageObject.messageOwner.media;
            if (messageMedia3 instanceof TLRPC.TL_messageMediaToDo) {
                ((TLRPC.TL_messageMediaToDo) messageMedia).completions = ((TLRPC.TL_messageMediaToDo) messageMedia3).completions;
            }
        }
        messageObject.messageOwner.media = messageMedia;
        wnVar.getSendMessagesHelper().editMessage(messageObject, null, null, null, null, null, null, false, false, null);
    }

    @Override
    public boolean v(ey eyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, cf1 cf1Var) {
        LaunchActivity launchActivity = (LaunchActivity) this.f42397c;
        String str = (String) this.d;
        Pattern pattern = LaunchActivity.D1;
        long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        Bundle bundle = new Bundle();
        bundle.putBoolean("scrollToTopOnResume", true);
        bundle.putBoolean("hasUrl", this.f42395a);
        if (DialogObject.isEncryptedDialog(j10)) {
            bundle.putInt("enc_id", DialogObject.getEncryptedChatId(j10));
        } else if (DialogObject.isUserDialog(j10)) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        int i12 = this.f42396b;
        if (MessagesController.getInstance(i12).checkCanOpenChat(bundle, eyVar)) {
            NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
            MediaDataController.getInstance(i12).saveDraft(j10, 0, str, null, null, false, 0L);
            ((ActionBarLayout) launchActivity.O()).U(new wn(bundle), true, false);
        }
        return true;
    }

    public pg(LaunchActivity launchActivity, boolean z10, int i10, String str) {
        this.f42397c = launchActivity;
        this.f42395a = z10;
        this.f42396b = i10;
        this.d = str;
    }
}
