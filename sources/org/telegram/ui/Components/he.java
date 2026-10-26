package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.af1;
public final class he implements org.telegram.ui.bj0, org.telegram.ui.ux {
    public final ChatActivityEnterView f28951a;
    public final MessageObject f28952b;
    public final TL_keyboard.TL_buttonTypeRequestPeer f28953c;

    public he(ChatActivityEnterView chatActivityEnterView, MessageObject messageObject, TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer) {
        this.f28951a = chatActivityEnterView;
        this.f28952b = messageObject;
        this.f28953c = tL_buttonTypeRequestPeer;
    }

    @Override
    public boolean C() {
        return false;
    }

    @Override
    public boolean K(org.telegram.ui.cy cyVar) {
        return false;
    }

    @Override
    public void a(ArrayList arrayList) {
        int i10 = ChatActivityEnterView.f25843r5;
        if (!arrayList.isEmpty()) {
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            ChatActivityEnterView chatActivityEnterView = this.f28951a;
            MessagesController messagesController = MessagesController.getInstance(chatActivityEnterView.Q);
            MessageObject messageObject = this.f28952b;
            tL_messages_sendBotRequestedPeer.peer = messagesController.getInputPeer(messageObject.messageOwner.peer_id);
            tL_messages_sendBotRequestedPeer.flags |= 1;
            tL_messages_sendBotRequestedPeer.msg_id = messageObject.getId();
            tL_messages_sendBotRequestedPeer.button_id = this.f28953c.button_id;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                tL_messages_sendBotRequestedPeer.requested_peers.add(MessagesController.getInstance(chatActivityEnterView.Q).getInputPeer(((Long) obj).longValue()));
            }
            ConnectionsManager.getInstance(chatActivityEnterView.Q).sendRequest(tL_messages_sendBotRequestedPeer, null);
        }
    }

    @Override
    public boolean v(org.telegram.ui.cy cyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, af1 af1Var) {
        int i12 = ChatActivityEnterView.f25843r5;
        if (!arrayList.isEmpty()) {
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            ChatActivityEnterView chatActivityEnterView = this.f28951a;
            MessagesController messagesController = MessagesController.getInstance(chatActivityEnterView.Q);
            MessageObject messageObject = this.f28952b;
            tL_messages_sendBotRequestedPeer.peer = messagesController.getInputPeer(messageObject.messageOwner.peer_id);
            tL_messages_sendBotRequestedPeer.flags |= 1;
            tL_messages_sendBotRequestedPeer.msg_id = messageObject.getId();
            tL_messages_sendBotRequestedPeer.button_id = this.f28953c.button_id;
            HashSet hashSet = new HashSet();
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList.get(i13);
                i13++;
                hashSet.add(Long.valueOf(((MessagesStorage.TopicKey) obj).dialogId));
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                tL_messages_sendBotRequestedPeer.requested_peers.add(MessagesController.getInstance(chatActivityEnterView.Q).getInputPeer(((Long) it.next()).longValue()));
            }
            ConnectionsManager.getInstance(chatActivityEnterView.Q).sendRequest(tL_messages_sendBotRequestedPeer, null);
        }
        cyVar.finishFragment();
        return true;
    }
}
