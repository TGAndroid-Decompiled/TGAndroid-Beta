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
import org.telegram.ui.kf1;
public final class xd implements org.telegram.ui.gj0, org.telegram.ui.iy {
    public final ChatActivityEnterView f30660a;
    public final MessageObject f30661b;
    public final TL_keyboard.TL_buttonTypeRequestPeer f30662c;

    public xd(ChatActivityEnterView chatActivityEnterView, MessageObject messageObject, TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer) {
        this.f30660a = chatActivityEnterView;
        this.f30661b = messageObject;
        this.f30662c = tL_buttonTypeRequestPeer;
    }

    @Override
    public boolean C() {
        return false;
    }

    @Override
    public boolean K(org.telegram.ui.oy oyVar) {
        return false;
    }

    @Override
    public void a(ArrayList arrayList) {
        int i10 = ChatActivityEnterView.f22729j5;
        if (!arrayList.isEmpty()) {
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            ChatActivityEnterView chatActivityEnterView = this.f30660a;
            MessagesController messagesController = MessagesController.getInstance(chatActivityEnterView.N);
            MessageObject messageObject = this.f30661b;
            tL_messages_sendBotRequestedPeer.peer = messagesController.getInputPeer(messageObject.messageOwner.peer_id);
            tL_messages_sendBotRequestedPeer.flags |= 1;
            tL_messages_sendBotRequestedPeer.msg_id = messageObject.getId();
            tL_messages_sendBotRequestedPeer.button_id = this.f30662c.button_id;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                tL_messages_sendBotRequestedPeer.requested_peers.add(MessagesController.getInstance(chatActivityEnterView.N).getInputPeer(((Long) obj).longValue()));
            }
            ConnectionsManager.getInstance(chatActivityEnterView.N).sendRequest(tL_messages_sendBotRequestedPeer, null);
        }
    }

    @Override
    public boolean w(org.telegram.ui.oy oyVar, ArrayList arrayList, CharSequence charSequence, boolean z4, boolean z10, int i10, int i11, kf1 kf1Var) {
        int i12 = ChatActivityEnterView.f22729j5;
        if (!arrayList.isEmpty()) {
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            ChatActivityEnterView chatActivityEnterView = this.f30660a;
            MessagesController messagesController = MessagesController.getInstance(chatActivityEnterView.N);
            MessageObject messageObject = this.f30661b;
            tL_messages_sendBotRequestedPeer.peer = messagesController.getInputPeer(messageObject.messageOwner.peer_id);
            tL_messages_sendBotRequestedPeer.flags |= 1;
            tL_messages_sendBotRequestedPeer.msg_id = messageObject.getId();
            tL_messages_sendBotRequestedPeer.button_id = this.f30662c.button_id;
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
                tL_messages_sendBotRequestedPeer.requested_peers.add(MessagesController.getInstance(chatActivityEnterView.N).getInputPeer(((Long) it.next()).longValue()));
            }
            ConnectionsManager.getInstance(chatActivityEnterView.N).sendRequest(tL_messages_sendBotRequestedPeer, null);
        }
        oyVar.finishFragment();
        return true;
    }
}
