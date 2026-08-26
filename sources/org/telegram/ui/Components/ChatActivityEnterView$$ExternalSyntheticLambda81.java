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
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.MultiContactsSelectorBottomSheet;
import org.telegram.ui.TopicsFragment;

public final class ChatActivityEnterView$$ExternalSyntheticLambda81 implements MultiContactsSelectorBottomSheet.SelectorListener, DialogsActivity.DialogsActivityDelegate {
    public final ChatActivityEnterView f$0;
    public final MessageObject f$1;
    public final TL_keyboard.TL_buttonTypeRequestPeer f$2;

    public ChatActivityEnterView$$ExternalSyntheticLambda81(ChatActivityEnterView chatActivityEnterView, MessageObject messageObject, TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer) {
        this.f$0 = chatActivityEnterView;
        this.f$1 = messageObject;
        this.f$2 = tL_buttonTypeRequestPeer;
    }

    @Override
    public boolean canSelectStories() {
        return false;
    }

    @Override
    public boolean didSelectDialogs(DialogsActivity dialogsActivity, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, TopicsFragment topicsFragment) {
        ChatActivityEnterView chatActivityEnterView = this.f$0;
        chatActivityEnterView.getClass();
        if (!arrayList.isEmpty()) {
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            MessagesController messagesController = MessagesController.getInstance(chatActivityEnterView.currentAccount);
            MessageObject messageObject = this.f$1;
            tL_messages_sendBotRequestedPeer.peer = messagesController.getInputPeer(messageObject.messageOwner.peer_id);
            tL_messages_sendBotRequestedPeer.flags |= 1;
            tL_messages_sendBotRequestedPeer.msg_id = messageObject.getId();
            tL_messages_sendBotRequestedPeer.button_id = this.f$2.button_id;
            HashSet hashSet = new HashSet();
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                hashSet.add(Long.valueOf(((MessagesStorage.TopicKey) obj).dialogId));
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                tL_messages_sendBotRequestedPeer.requested_peers.add(MessagesController.getInstance(chatActivityEnterView.currentAccount).getInputPeer(((Long) it.next()).longValue()));
            }
            ConnectionsManager.getInstance(chatActivityEnterView.currentAccount).sendRequest(tL_messages_sendBotRequestedPeer, null);
        }
        dialogsActivity.finishFragment();
        return true;
    }

    @Override
    public boolean didSelectStories(DialogsActivity dialogsActivity) {
        return false;
    }

    @Override
    public void onUserSelected(ArrayList arrayList) {
        ChatActivityEnterView chatActivityEnterView = this.f$0;
        chatActivityEnterView.getClass();
        if (arrayList.isEmpty()) {
            return;
        }
        TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
        MessagesController messagesController = MessagesController.getInstance(chatActivityEnterView.currentAccount);
        MessageObject messageObject = this.f$1;
        tL_messages_sendBotRequestedPeer.peer = messagesController.getInputPeer(messageObject.messageOwner.peer_id);
        tL_messages_sendBotRequestedPeer.flags |= 1;
        tL_messages_sendBotRequestedPeer.msg_id = messageObject.getId();
        tL_messages_sendBotRequestedPeer.button_id = this.f$2.button_id;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            tL_messages_sendBotRequestedPeer.requested_peers.add(MessagesController.getInstance(chatActivityEnterView.currentAccount).getInputPeer(((Long) obj).longValue()));
        }
        ConnectionsManager.getInstance(chatActivityEnterView.currentAccount).sendRequest(tL_messages_sendBotRequestedPeer, null);
    }
}
