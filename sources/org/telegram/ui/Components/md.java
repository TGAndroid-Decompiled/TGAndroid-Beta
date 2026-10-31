package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.pb1;
public final class md implements org.telegram.ui.vh0, org.telegram.ui.ux {
    public final ChatActivityEnterView f28417a;
    public final org.telegram.messenger.jj f28418b;
    public final TL_keyboard.TL_buttonTypeRequestPeer f28419c;

    public md(ChatActivityEnterView chatActivityEnterView, org.telegram.messenger.jj jjVar, TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer) {
        this.f28417a = chatActivityEnterView;
        this.f28418b = jjVar;
        this.f28419c = tL_buttonTypeRequestPeer;
    }

    @Override
    public boolean G() {
        return false;
    }

    @Override
    public boolean N(org.telegram.ui.ay ayVar) {
        return false;
    }

    @Override
    public void a(ArrayList arrayList) {
        int i10 = ChatActivityEnterView.f23672s5;
        if (!arrayList.isEmpty()) {
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            ChatActivityEnterView chatActivityEnterView = this.f28417a;
            org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(chatActivityEnterView.Q);
            org.telegram.messenger.jj jjVar = this.f28418b;
            tL_messages_sendBotRequestedPeer.peer = r12.l1(jjVar.f16337k.peer_id);
            tL_messages_sendBotRequestedPeer.flags |= 1;
            tL_messages_sendBotRequestedPeer.msg_id = jjVar.f1();
            tL_messages_sendBotRequestedPeer.button_id = this.f28419c.button_id;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                tL_messages_sendBotRequestedPeer.requested_peers.add(org.telegram.messenger.vp.r1(chatActivityEnterView.Q).i1(((Long) obj).longValue()));
            }
            ConnectionsManager.getInstance(chatActivityEnterView.Q).sendRequest(tL_messages_sendBotRequestedPeer, null);
        }
    }

    @Override
    public boolean y(org.telegram.ui.ay ayVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, pb1 pb1Var) {
        int i12 = ChatActivityEnterView.f23672s5;
        if (!arrayList.isEmpty()) {
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            ChatActivityEnterView chatActivityEnterView = this.f28417a;
            org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(chatActivityEnterView.Q);
            org.telegram.messenger.jj jjVar = this.f28418b;
            tL_messages_sendBotRequestedPeer.peer = r12.l1(jjVar.f16337k.peer_id);
            tL_messages_sendBotRequestedPeer.flags |= 1;
            tL_messages_sendBotRequestedPeer.msg_id = jjVar.f1();
            tL_messages_sendBotRequestedPeer.button_id = this.f28419c.button_id;
            HashSet hashSet = new HashSet();
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList.get(i13);
                i13++;
                hashSet.add(Long.valueOf(((org.telegram.messenger.gs) obj).f15760a));
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                tL_messages_sendBotRequestedPeer.requested_peers.add(org.telegram.messenger.vp.r1(chatActivityEnterView.Q).i1(((Long) it.next()).longValue()));
            }
            ConnectionsManager.getInstance(chatActivityEnterView.Q).sendRequest(tL_messages_sendBotRequestedPeer, null);
        }
        ayVar.finishFragment();
        return true;
    }
}
