package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.y91;
public final class ed implements org.telegram.ui.ug0, org.telegram.ui.ww {
    public final ChatActivityEnterView f34734a;
    public final org.telegram.messenger.gj f34735b;
    public final TL_keyboard.TL_buttonTypeRequestPeer f34736c;

    public ed(ChatActivityEnterView chatActivityEnterView, org.telegram.messenger.gj gjVar, TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer) {
        this.f34734a = chatActivityEnterView;
        this.f34735b = gjVar;
        this.f34736c = tL_buttonTypeRequestPeer;
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
        int i7 = ChatActivityEnterView.f32569s7;
        if (!arrayList.isEmpty()) {
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            ChatActivityEnterView chatActivityEnterView = this.f34734a;
            org.telegram.messenger.np u12 = org.telegram.messenger.np.u1(chatActivityEnterView.R);
            org.telegram.messenger.gj gjVar = this.f34735b;
            tL_messages_sendBotRequestedPeer.peer = u12.o1(gjVar.f24213k.peer_id);
            tL_messages_sendBotRequestedPeer.flags |= 1;
            tL_messages_sendBotRequestedPeer.msg_id = gjVar.e1();
            tL_messages_sendBotRequestedPeer.button_id = this.f34736c.button_id;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                tL_messages_sendBotRequestedPeer.requested_peers.add(org.telegram.messenger.np.u1(chatActivityEnterView.R).l1(((Long) obj).longValue()));
            }
            ConnectionsManager.getInstance(chatActivityEnterView.R).sendRequest(tL_messages_sendBotRequestedPeer, null);
        }
    }

    @Override
    public boolean y(org.telegram.ui.cx cxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, y91 y91Var) {
        int i11 = ChatActivityEnterView.f32569s7;
        if (!arrayList.isEmpty()) {
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            ChatActivityEnterView chatActivityEnterView = this.f34734a;
            org.telegram.messenger.np u12 = org.telegram.messenger.np.u1(chatActivityEnterView.R);
            org.telegram.messenger.gj gjVar = this.f34735b;
            tL_messages_sendBotRequestedPeer.peer = u12.o1(gjVar.f24213k.peer_id);
            tL_messages_sendBotRequestedPeer.flags |= 1;
            tL_messages_sendBotRequestedPeer.msg_id = gjVar.e1();
            tL_messages_sendBotRequestedPeer.button_id = this.f34736c.button_id;
            HashSet hashSet = new HashSet();
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                hashSet.add(Long.valueOf(((org.telegram.messenger.tr) obj).f27073a));
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                tL_messages_sendBotRequestedPeer.requested_peers.add(org.telegram.messenger.np.u1(chatActivityEnterView.R).l1(((Long) it.next()).longValue()));
            }
            ConnectionsManager.getInstance(chatActivityEnterView.R).sendRequest(tL_messages_sendBotRequestedPeer, null);
        }
        cxVar.finishFragment();
        return true;
    }
}
