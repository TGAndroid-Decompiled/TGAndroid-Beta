package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public final class y9 implements Utilities.Callback2 {
    public final int f19656a;
    public final MessagesController f19657b;
    public final Utilities.Callback2 f19658c;

    public y9(MessagesController messagesController, Utilities.Callback2 callback2, int i10) {
        this.f19656a = i10;
        this.f19657b = messagesController;
        this.f19658c = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f19656a) {
            case 0:
                this.f19657b.lambda$toggleChatNoForwards$277(this.f19658c, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                this.f19657b.lambda$fetchCommunityPendingJoinRequests$245(this.f19658c, (TL_communities.PeerLinkRequests) obj, (TLRPC.TL_error) obj2);
                return;
            case 2:
                this.f19657b.lambda$fetchCommunityJoinedChats$246(this.f19658c, (TL_communities.ParticipantJoinedChats) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                this.f19657b.lambda$fetchChatsToAddToCommunity$251(this.f19658c, (TLRPC.messages_Chats) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
