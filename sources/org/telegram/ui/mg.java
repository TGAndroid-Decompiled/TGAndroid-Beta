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
public final class mg implements uu0, yx {
    public final boolean f40552a;
    public final int f40553b;
    public final Object f40554c;
    public final Object d;

    public mg(tn tnVar, boolean z10, MessageObject messageObject, int i10) {
        this.f40554c = tnVar;
        this.f40552a = z10;
        this.d = messageObject;
        this.f40553b = i10;
    }

    @Override
    public boolean C() {
        return false;
    }

    @Override
    public boolean J(fy fyVar) {
        return false;
    }

    @Override
    public void a(TLRPC.MessageMedia messageMedia) {
        int i10;
        tn tnVar = (tn) this.f40554c;
        MessageObject messageObject = (MessageObject) this.d;
        if (this.f40552a) {
            TLRPC.TL_messages_appendTodoList tL_messages_appendTodoList = new TLRPC.TL_messages_appendTodoList();
            tL_messages_appendTodoList.peer = tnVar.getMessagesController().getInputPeer(messageObject.getDialogId());
            tL_messages_appendTodoList.msg_id = messageObject.getId();
            if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    i10 = this.f40553b;
                    if (i11 >= i10) {
                        break;
                    }
                    i12 = Math.max(i12, tL_messageMediaToDo.todo.list.get(i11).f22537id);
                    i11++;
                }
                while (i10 < tL_messageMediaToDo.todo.list.size()) {
                    TLRPC.TodoItem todoItem = tL_messageMediaToDo.todo.list.get(i10);
                    if (todoItem.f22537id <= i12) {
                        todoItem.f22537id = i12 + 1;
                    }
                    tL_messages_appendTodoList.list.add(todoItem);
                    i12 = Math.max(i12, todoItem.f22537id);
                    i10++;
                }
                TLRPC.MessageMedia messageMedia2 = messageObject.messageOwner.media;
                if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                    tL_messageMediaToDo.completions = ((TLRPC.TL_messageMediaToDo) messageMedia2).completions;
                }
            }
            messageObject.messageOwner.media = messageMedia;
            tnVar.getConnectionsManager().sendRequest(tL_messages_appendTodoList, null);
            return;
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.MessageMedia messageMedia3 = messageObject.messageOwner.media;
            if (messageMedia3 instanceof TLRPC.TL_messageMediaToDo) {
                ((TLRPC.TL_messageMediaToDo) messageMedia).completions = ((TLRPC.TL_messageMediaToDo) messageMedia3).completions;
            }
        }
        messageObject.messageOwner.media = messageMedia;
        tnVar.getSendMessagesHelper().editMessage(messageObject, null, null, null, null, null, null, false, false, null);
    }

    @Override
    public boolean v(fy fyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, ze1 ze1Var) {
        LaunchActivity launchActivity = (LaunchActivity) this.f40554c;
        String str = (String) this.d;
        Pattern pattern = LaunchActivity.f35560x1;
        long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        Bundle bundle = new Bundle();
        bundle.putBoolean("scrollToTopOnResume", true);
        bundle.putBoolean("hasUrl", this.f40552a);
        if (DialogObject.isEncryptedDialog(j10)) {
            bundle.putInt("enc_id", DialogObject.getEncryptedChatId(j10));
        } else if (DialogObject.isUserDialog(j10)) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        int i12 = this.f40553b;
        if (MessagesController.getInstance(i12).checkCanOpenChat(bundle, fyVar)) {
            NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
            MediaDataController.getInstance(i12).saveDraft(j10, 0, str, null, null, false, 0L);
            ((ActionBarLayout) launchActivity.O()).S(new tn(bundle), true, false);
        }
        return true;
    }

    public mg(LaunchActivity launchActivity, boolean z10, int i10, String str) {
        this.f40554c = launchActivity;
        this.f40552a = z10;
        this.f40553b = i10;
        this.d = str;
    }
}
