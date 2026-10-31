package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public final class zo {
    public final TL_communities.CommunityPeer f19568a;
    public final TLRPC.Chat f19569b;
    public final TLRPC.User f19570c;
    public final TLRPC.Dialog d;

    public zo(TLRPC.Chat chat, TLRPC.Dialog dialog, TLRPC.User user, TL_communities.CommunityPeer communityPeer) {
        this.f19568a = communityPeer;
        this.f19569b = chat;
        this.f19570c = user;
        this.d = dialog;
    }
}
