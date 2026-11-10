package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.z91;
public final class rd implements org.telegram.ui.sg0, org.telegram.ui.tw {
    public final ChatActivityEnterView f37608a;
    public final org.telegram.messenger.ij f37609b;
    public final TL_keyboard.TL_buttonTypeRequestPeer f37610c;

    public rd(ChatActivityEnterView chatActivityEnterView, org.telegram.messenger.ij ijVar, TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer) {
        this.f37608a = chatActivityEnterView;
        this.f37609b = ijVar;
        this.f37610c = tL_buttonTypeRequestPeer;
    }

    @Override
    public boolean G() {
        return false;
    }

    @Override
    public boolean N(org.telegram.ui.zw zwVar) {
        return false;
    }

    @Override
    public void a(ArrayList arrayList) {
        int i7 = ChatActivityEnterView.s5;
        if (!arrayList.isEmpty()) {
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            ChatActivityEnterView chatActivityEnterView = this.f37608a;
            org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(chatActivityEnterView.Q);
            org.telegram.messenger.ij ijVar = this.f37609b;
            tL_messages_sendBotRequestedPeer.peer = s12.m1(ijVar.f23266k.peer_id);
            tL_messages_sendBotRequestedPeer.flags |= 1;
            tL_messages_sendBotRequestedPeer.msg_id = ijVar.e1();
            tL_messages_sendBotRequestedPeer.button_id = this.f37610c.button_id;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                tL_messages_sendBotRequestedPeer.requested_peers.add(org.telegram.messenger.qp.s1(chatActivityEnterView.Q).j1(((Long) obj).longValue()));
            }
            ConnectionsManager.getInstance(chatActivityEnterView.Q).sendRequest(tL_messages_sendBotRequestedPeer, null);
        }
    }

    @Override
    public boolean y(org.telegram.ui.zw zwVar, ArrayList arrayList, CharSequence charSequence, boolean z9, boolean z10, int i7, int i10, z91 z91Var) {
        int i11 = ChatActivityEnterView.s5;
        if (!arrayList.isEmpty()) {
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            ChatActivityEnterView chatActivityEnterView = this.f37608a;
            org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(chatActivityEnterView.Q);
            org.telegram.messenger.ij ijVar = this.f37609b;
            tL_messages_sendBotRequestedPeer.peer = s12.m1(ijVar.f23266k.peer_id);
            tL_messages_sendBotRequestedPeer.flags |= 1;
            tL_messages_sendBotRequestedPeer.msg_id = ijVar.e1();
            tL_messages_sendBotRequestedPeer.button_id = this.f37610c.button_id;
            HashSet hashSet = new HashSet();
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                hashSet.add(Long.valueOf(((org.telegram.messenger.xr) obj).f26524a));
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                tL_messages_sendBotRequestedPeer.requested_peers.add(org.telegram.messenger.qp.s1(chatActivityEnterView.Q).j1(((Long) it.next()).longValue()));
            }
            ConnectionsManager.getInstance(chatActivityEnterView.Q).sendRequest(tL_messages_sendBotRequestedPeer, null);
        }
        zwVar.finishFragment();
        return true;
    }
}
