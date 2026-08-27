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

public final class pg implements xu0, zx {

    public final boolean f41346a;

    public final int f41347b;

    public final Object f41348c;
    public final Object d;

    public pg(rn rnVar, boolean z10, MessageObject messageObject, int i10) {
        this.f41348c = rnVar;
        this.f41346a = z10;
        this.d = messageObject;
        this.f41347b = i10;
    }

    @Override
    public boolean D() {
        return false;
    }

    @Override
    public boolean K(gy gyVar) {
        return false;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia) {
        int i10;
        rn rnVar = (rn) this.f41348c;
        MessageObject messageObject = (MessageObject) this.d;
        if (!this.f41346a) {
            if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
                TLRPC.MessageMedia messageMedia2 = messageObject.messageOwner.media;
                if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                    ((TLRPC.TL_messageMediaToDo) messageMedia).completions = ((TLRPC.TL_messageMediaToDo) messageMedia2).completions;
                }
            }
            messageObject.messageOwner.media = messageMedia;
            rnVar.getSendMessagesHelper().editMessage(messageObject, null, null, null, null, null, null, false, false, null);
            return;
        }
        TLRPC.TL_messages_appendTodoList tL_messages_appendTodoList = new TLRPC.TL_messages_appendTodoList();
        tL_messages_appendTodoList.peer = rnVar.getMessagesController().getInputPeer(messageObject.getDialogId());
        tL_messages_appendTodoList.msg_id = messageObject.getId();
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
            int i11 = 0;
            int iMax = 0;
            while (true) {
                i10 = this.f41347b;
                if (i11 >= i10) {
                    break;
                }
                iMax = Math.max(iMax, tL_messageMediaToDo.todo.list.get(i11).f22525id);
                i11++;
            }
            while (i10 < tL_messageMediaToDo.todo.list.size()) {
                TLRPC.TodoItem todoItem = tL_messageMediaToDo.todo.list.get(i10);
                if (todoItem.f22525id <= iMax) {
                    todoItem.f22525id = iMax + 1;
                }
                tL_messages_appendTodoList.list.add(todoItem);
                iMax = Math.max(iMax, todoItem.f22525id);
                i10++;
            }
            TLRPC.MessageMedia messageMedia3 = messageObject.messageOwner.media;
            if (messageMedia3 instanceof TLRPC.TL_messageMediaToDo) {
                tL_messageMediaToDo.completions = ((TLRPC.TL_messageMediaToDo) messageMedia3).completions;
            }
        }
        messageObject.messageOwner.media = messageMedia;
        rnVar.getConnectionsManager().sendRequest(tL_messages_appendTodoList, null);
    }

    @Override
    public boolean w(gy gyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, we1 we1Var) {
        LaunchActivity launchActivity = (LaunchActivity) this.f41348c;
        String str = (String) this.d;
        Pattern pattern = LaunchActivity.f35496x1;
        long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        Bundle bundle = new Bundle();
        bundle.putBoolean("scrollToTopOnResume", true);
        bundle.putBoolean("hasUrl", this.f41346a);
        if (DialogObject.isEncryptedDialog(j10)) {
            bundle.putInt("enc_id", DialogObject.getEncryptedChatId(j10));
        } else if (DialogObject.isUserDialog(j10)) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        int i12 = this.f41347b;
        if (MessagesController.getInstance(i12).checkCanOpenChat(bundle, gyVar)) {
            NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
            MediaDataController.getInstance(i12).saveDraft(j10, 0, str, null, null, false, 0L);
            ((ActionBarLayout) launchActivity.O()).S(new rn(bundle), true, false);
        }
        return true;
    }

    public pg(LaunchActivity launchActivity, boolean z10, int i10, String str) {
        this.f41348c = launchActivity;
        this.f41346a = z10;
        this.f41347b = i10;
        this.d = str;
    }
}
