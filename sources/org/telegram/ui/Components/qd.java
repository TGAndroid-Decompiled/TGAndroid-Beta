package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.m91;
public final class qd implements org.telegram.ui.jg0, org.telegram.ui.nw {
    public final ChatActivityEnterView f37443a;
    public final org.telegram.messenger.zi f37444b;
    public final TL_keyboard.TL_buttonTypeRequestPeer f37445c;

    public qd(ChatActivityEnterView chatActivityEnterView, org.telegram.messenger.zi ziVar, TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer) {
        this.f37443a = chatActivityEnterView;
        this.f37444b = ziVar;
        this.f37445c = tL_buttonTypeRequestPeer;
    }

    @Override
    public boolean G() {
        return false;
    }

    @Override
    public boolean N(org.telegram.ui.uw uwVar) {
        return false;
    }

    @Override
    public void a(ArrayList arrayList) {
        int i3 = ChatActivityEnterView.f31082t5;
        if (!arrayList.isEmpty()) {
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            ChatActivityEnterView chatActivityEnterView = this.f37443a;
            org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(chatActivityEnterView.R);
            org.telegram.messenger.zi ziVar = this.f37444b;
            tL_messages_sendBotRequestedPeer.peer = s12.m1(ziVar.f26868k.peer_id);
            tL_messages_sendBotRequestedPeer.flags |= 1;
            tL_messages_sendBotRequestedPeer.msg_id = ziVar.f1();
            tL_messages_sendBotRequestedPeer.button_id = this.f37445c.button_id;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                tL_messages_sendBotRequestedPeer.requested_peers.add(org.telegram.messenger.hp.s1(chatActivityEnterView.R).j1(((Long) obj).longValue()));
            }
            ConnectionsManager.getInstance(chatActivityEnterView.R).sendRequest(tL_messages_sendBotRequestedPeer, null);
        }
    }

    @Override
    public boolean y(org.telegram.ui.uw uwVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i3, int i10, m91 m91Var) {
        int i11 = ChatActivityEnterView.f31082t5;
        if (!arrayList.isEmpty()) {
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            ChatActivityEnterView chatActivityEnterView = this.f37443a;
            org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(chatActivityEnterView.R);
            org.telegram.messenger.zi ziVar = this.f37444b;
            tL_messages_sendBotRequestedPeer.peer = s12.m1(ziVar.f26868k.peer_id);
            tL_messages_sendBotRequestedPeer.flags |= 1;
            tL_messages_sendBotRequestedPeer.msg_id = ziVar.f1();
            tL_messages_sendBotRequestedPeer.button_id = this.f37445c.button_id;
            HashSet hashSet = new HashSet();
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                hashSet.add(Long.valueOf(((org.telegram.messenger.pr) obj).f24797a));
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                tL_messages_sendBotRequestedPeer.requested_peers.add(org.telegram.messenger.hp.s1(chatActivityEnterView.R).j1(((Long) it.next()).longValue()));
            }
            ConnectionsManager.getInstance(chatActivityEnterView.R).sendRequest(tL_messages_sendBotRequestedPeer, null);
        }
        uwVar.finishFragment();
        return true;
    }
}
