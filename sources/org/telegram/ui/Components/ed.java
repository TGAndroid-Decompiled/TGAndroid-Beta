package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.y91;
public final class ed implements org.telegram.ui.ug0, org.telegram.ui.ww {
    public final ChatActivityEnterView f34736a;
    public final org.telegram.messenger.fj f34737b;
    public final TL_keyboard.TL_buttonTypeRequestPeer f34738c;

    public ed(ChatActivityEnterView chatActivityEnterView, org.telegram.messenger.fj fjVar, TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer) {
        this.f34736a = chatActivityEnterView;
        this.f34737b = fjVar;
        this.f34738c = tL_buttonTypeRequestPeer;
    }

    @Override
    public boolean G() {
        return false;
    }

    @Override
    public boolean P(org.telegram.ui.cx cxVar) {
        return false;
    }

    @Override
    public void a(ArrayList arrayList) {
        int i7 = ChatActivityEnterView.f32566s7;
        if (!arrayList.isEmpty()) {
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            ChatActivityEnterView chatActivityEnterView = this.f34736a;
            org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(chatActivityEnterView.R);
            org.telegram.messenger.fj fjVar = this.f34737b;
            tL_messages_sendBotRequestedPeer.peer = u12.o1(fjVar.f23993k.peer_id);
            tL_messages_sendBotRequestedPeer.flags |= 1;
            tL_messages_sendBotRequestedPeer.msg_id = fjVar.e1();
            tL_messages_sendBotRequestedPeer.button_id = this.f34738c.button_id;
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
    public boolean y(org.telegram.ui.cx cxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, y91 y91Var) {
        int i11 = ChatActivityEnterView.f32566s7;
        if (!arrayList.isEmpty()) {
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            ChatActivityEnterView chatActivityEnterView = this.f34736a;
            org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(chatActivityEnterView.R);
            org.telegram.messenger.fj fjVar = this.f34737b;
            tL_messages_sendBotRequestedPeer.peer = u12.o1(fjVar.f23993k.peer_id);
            tL_messages_sendBotRequestedPeer.flags |= 1;
            tL_messages_sendBotRequestedPeer.msg_id = fjVar.e1();
            tL_messages_sendBotRequestedPeer.button_id = this.f34738c.button_id;
            HashSet hashSet = new HashSet();
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                hashSet.add(Long.valueOf(((org.telegram.messenger.sr) obj).f26873a));
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                tL_messages_sendBotRequestedPeer.requested_peers.add(org.telegram.messenger.mp.u1(chatActivityEnterView.R).l1(((Long) it.next()).longValue()));
            }
            ConnectionsManager.getInstance(chatActivityEnterView.R).sendRequest(tL_messages_sendBotRequestedPeer, null);
        }
        cxVar.finishFragment();
        return true;
    }
}
