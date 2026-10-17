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
public final class qg implements gv0, xx {
    public final boolean f40422a;
    public final int f40423b;
    public final Object f40424c;
    public final Object d;

    public qg(sn snVar, boolean z10, MessageObject messageObject, int i10) {
        this.f40424c = snVar;
        this.f40422a = z10;
        this.d = messageObject;
        this.f40423b = i10;
    }

    @Override
    public boolean D() {
        return false;
    }

    @Override
    public boolean K(ey eyVar) {
        return false;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia) {
        int i10;
        sn snVar = (sn) this.f40424c;
        MessageObject messageObject = (MessageObject) this.d;
        if (this.f40422a) {
            TLRPC.TL_messages_appendTodoList tL_messages_appendTodoList = new TLRPC.TL_messages_appendTodoList();
            tL_messages_appendTodoList.peer = snVar.getMessagesController().getInputPeer(messageObject.getDialogId());
            tL_messages_appendTodoList.msg_id = messageObject.getId();
            if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    i10 = this.f40423b;
                    if (i11 >= i10) {
                        break;
                    }
                    i12 = Math.max(i12, tL_messageMediaToDo.todo.list.get(i11).f20417id);
                    i11++;
                }
                while (i10 < tL_messageMediaToDo.todo.list.size()) {
                    TLRPC.TodoItem todoItem = tL_messageMediaToDo.todo.list.get(i10);
                    if (todoItem.f20417id <= i12) {
                        todoItem.f20417id = i12 + 1;
                    }
                    tL_messages_appendTodoList.list.add(todoItem);
                    i12 = Math.max(i12, todoItem.f20417id);
                    i10++;
                }
                TLRPC.MessageMedia messageMedia2 = messageObject.messageOwner.media;
                if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                    tL_messageMediaToDo.completions = ((TLRPC.TL_messageMediaToDo) messageMedia2).completions;
                }
            }
            messageObject.messageOwner.media = messageMedia;
            snVar.getConnectionsManager().sendRequest(tL_messages_appendTodoList, null);
            return;
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.MessageMedia messageMedia3 = messageObject.messageOwner.media;
            if (messageMedia3 instanceof TLRPC.TL_messageMediaToDo) {
                ((TLRPC.TL_messageMediaToDo) messageMedia).completions = ((TLRPC.TL_messageMediaToDo) messageMedia3).completions;
            }
        }
        messageObject.messageOwner.media = messageMedia;
        snVar.getSendMessagesHelper().editMessage(messageObject, null, null, null, null, null, null, false, false, null);
    }

    @Override
    public boolean w(ey eyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, te1 te1Var) {
        LaunchActivity launchActivity = (LaunchActivity) this.f40424c;
        String str = (String) this.d;
        Pattern pattern = LaunchActivity.C1;
        long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        Bundle bundle = new Bundle();
        bundle.putBoolean("scrollToTopOnResume", true);
        bundle.putBoolean("hasUrl", this.f40422a);
        if (DialogObject.isEncryptedDialog(j10)) {
            bundle.putInt("enc_id", DialogObject.getEncryptedChatId(j10));
        } else if (DialogObject.isUserDialog(j10)) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        int i12 = this.f40423b;
        if (MessagesController.getInstance(i12).checkCanOpenChat(bundle, eyVar)) {
            NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
            MediaDataController.getInstance(i12).saveDraft(j10, 0, str, null, null, false, 0L);
            ((ActionBarLayout) launchActivity.O()).S(new sn(bundle), true, false);
        }
        return true;
    }

    public qg(LaunchActivity launchActivity, boolean z10, int i10, String str) {
        this.f40424c = launchActivity;
        this.f40422a = z10;
        this.f40423b = i10;
        this.d = str;
    }
}
