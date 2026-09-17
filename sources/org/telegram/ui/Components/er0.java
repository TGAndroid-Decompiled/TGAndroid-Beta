package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class er0 implements Runnable {
    public final int f25783a;
    public final Object f25784b;
    public final Object f25785c;
    public final Object d;

    public er0(Object obj, Object obj2, Object obj3, int i10) {
        this.f25783a = i10;
        this.f25784b = obj;
        this.f25785c = obj2;
        this.d = obj3;
    }

    private final void a() {
        TLRPC.User user;
        TLObject tLObject = (TLObject) this.f25784b;
        MessagesController messagesController = (MessagesController) this.f25785c;
        ug.y0 y0Var = (ug.y0) this.d;
        if (tLObject instanceof TLRPC.TL_channels_channelParticipants) {
            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
            messagesController.putUsers(tL_channels_channelParticipants.users, false);
            messagesController.putChats(tL_channels_channelParticipants.chats, false);
            long clientUserId = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < tL_channels_channelParticipants.participants.size(); i10++) {
                TLRPC.Peer peer = tL_channels_channelParticipants.participants.get(i10).peer;
                if (peer != null && MessageObject.getPeerId(peer) != clientUserId && (user = messagesController.getUser(Long.valueOf(peer.user_id))) != null && !UserObject.isDeleted(user) && !user.bot) {
                    arrayList.add(messagesController.getInputPeer(peer));
                }
            }
            y0Var.run(arrayList);
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.er0.run():void");
    }

    public er0(org.telegram.ui.web.h1 h1Var, ArrayList arrayList, String str) {
        this.f25783a = 19;
        this.f25784b = h1Var;
        this.d = arrayList;
        this.f25785c = str;
    }
}
