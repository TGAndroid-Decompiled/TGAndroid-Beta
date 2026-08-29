package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public final class z9 implements Utilities.Callback2 {
    public final int f22339a;
    public final MessagesController f22340b;
    public final Utilities.Callback2 f22341c;

    public z9(MessagesController messagesController, Utilities.Callback2 callback2, int i10) {
        this.f22339a = i10;
        this.f22340b = messagesController;
        this.f22341c = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f22339a) {
            case 0:
                this.f22340b.lambda$toggleChatNoForwards$278(this.f22341c, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                this.f22340b.lambda$fetchCommunityPendingJoinRequests$246(this.f22341c, (TL_communities.PeerLinkRequests) obj, (TLRPC.TL_error) obj2);
                return;
            case 2:
                this.f22340b.lambda$fetchCommunityJoinedChats$247(this.f22341c, (TL_communities.ParticipantJoinedChats) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                this.f22340b.lambda$fetchChatsToAddToCommunity$252(this.f22341c, (TLRPC.messages_Chats) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
