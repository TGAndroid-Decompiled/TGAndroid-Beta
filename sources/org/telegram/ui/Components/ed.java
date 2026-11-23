package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.w91;
public final class ed implements org.telegram.ui.sg0, org.telegram.ui.vw {
    public final ChatActivityEnterView f34690a;
    public final org.telegram.messenger.fj f34691b;
    public final TL_keyboard.TL_buttonTypeRequestPeer f34692c;

    public ed(ChatActivityEnterView chatActivityEnterView, org.telegram.messenger.fj fjVar, TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer) {
        this.f34690a = chatActivityEnterView;
        this.f34691b = fjVar;
        this.f34692c = tL_buttonTypeRequestPeer;
    }

    @Override
    public boolean F() {
        return false;
    }

    @Override
    public boolean O(org.telegram.ui.bx bxVar) {
        return false;
    }

    @Override
    public void a(ArrayList arrayList) {
        int i7 = ChatActivityEnterView.f32633s7;
        if (!arrayList.isEmpty()) {
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            ChatActivityEnterView chatActivityEnterView = this.f34690a;
            org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(chatActivityEnterView.R);
            org.telegram.messenger.fj fjVar = this.f34691b;
            tL_messages_sendBotRequestedPeer.peer = u12.o1(fjVar.f24073k.peer_id);
            tL_messages_sendBotRequestedPeer.flags |= 1;
            tL_messages_sendBotRequestedPeer.msg_id = fjVar.e1();
            tL_messages_sendBotRequestedPeer.button_id = this.f34692c.button_id;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                tL_messages_sendBotRequestedPeer.requested_peers.add(org.telegram.messenger.mp.u1(chatActivityEnterView.R).l1(((Long) obj).longValue()));
            }
            ConnectionsManager.getInstance(chatActivityEnterView.R).sendRequest(tL_messages_sendBotRequestedPeer, null);
        }
    }

    @Override
    public boolean z(org.telegram.ui.bx bxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, w91 w91Var) {
        int i11 = ChatActivityEnterView.f32633s7;
        if (!arrayList.isEmpty()) {
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            ChatActivityEnterView chatActivityEnterView = this.f34690a;
            org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(chatActivityEnterView.R);
            org.telegram.messenger.fj fjVar = this.f34691b;
            tL_messages_sendBotRequestedPeer.peer = u12.o1(fjVar.f24073k.peer_id);
            tL_messages_sendBotRequestedPeer.flags |= 1;
            tL_messages_sendBotRequestedPeer.msg_id = fjVar.e1();
            tL_messages_sendBotRequestedPeer.button_id = this.f34692c.button_id;
            HashSet hashSet = new HashSet();
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                hashSet.add(Long.valueOf(((org.telegram.messenger.sr) obj).f26946a));
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                tL_messages_sendBotRequestedPeer.requested_peers.add(org.telegram.messenger.mp.u1(chatActivityEnterView.R).l1(((Long) it.next()).longValue()));
            }
            ConnectionsManager.getInstance(chatActivityEnterView.R).sendRequest(tL_messages_sendBotRequestedPeer, null);
        }
        bxVar.finishFragment();
        return true;
    }
}
