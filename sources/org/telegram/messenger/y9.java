package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public final class y9 implements Utilities.Callback2 {
    public final int f18781a;
    public final MessagesController f18782b;
    public final Utilities.Callback2 f18783c;

    public y9(MessagesController messagesController, Utilities.Callback2 callback2, int i10) {
        this.f18781a = i10;
        this.f18782b = messagesController;
        this.f18783c = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f18781a) {
            case 0:
                this.f18782b.lambda$toggleChatNoForwards$277(this.f18783c, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                this.f18782b.lambda$fetchCommunityPendingJoinRequests$245(this.f18783c, (TL_communities.PeerLinkRequests) obj, (TLRPC.TL_error) obj2);
                return;
            case 2:
                this.f18782b.lambda$fetchCommunityJoinedChats$246(this.f18783c, (TL_communities.ParticipantJoinedChats) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                this.f18782b.lambda$fetchChatsToAddToCommunity$251(this.f18783c, (TLRPC.messages_Chats) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
