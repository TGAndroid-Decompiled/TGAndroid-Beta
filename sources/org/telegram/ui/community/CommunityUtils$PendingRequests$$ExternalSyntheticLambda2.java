package org.telegram.ui.community;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;

public final class CommunityUtils$PendingRequests$$ExternalSyntheticLambda2 implements Utilities.Callback2 {
    public final int $r8$classId;
    public final CommunityUtils.PendingRequests f$0;

    public CommunityUtils$PendingRequests$$ExternalSyntheticLambda2(CommunityUtils.PendingRequests pendingRequests, int i) {
        this.$r8$classId = i;
        this.f$0 = pendingRequests;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                CommunityUtils.PendingRequests pendingRequests = this.f$0;
                pendingRequests.progressDialog.dismiss();
                pendingRequests.progressDialog = null;
                pendingRequests.reqId = 0;
                if (tL_error == null) {
                    CommunityUtils.PendingRequests.Delegate delegate = pendingRequests.delegate;
                    if (delegate != null) {
                        delegate.close();
                    }
                } else {
                    pendingRequests.bulletinFactory.showForError(false, tL_error);
                }
                break;
            case 1:
                TL_communities.PeerLinkRequests peerLinkRequests = (TL_communities.PeerLinkRequests) obj;
                CommunityUtils.PendingRequests pendingRequests2 = this.f$0;
                pendingRequests2.loading = false;
                if (peerLinkRequests != null) {
                    ArrayList arrayList = pendingRequests2.pendingRequests;
                    if (arrayList == null) {
                        pendingRequests2.pendingRequests = new ArrayList(peerLinkRequests.requests);
                    } else {
                        arrayList.addAll(peerLinkRequests.requests);
                    }
                    String str = peerLinkRequests.next_offset;
                    pendingRequests2.nextOffset = str;
                    pendingRequests2.totalCount = peerLinkRequests.total_count;
                    pendingRequests2.finished = str == null;
                    pendingRequests2.calcUnreadPendingRequests();
                    CommunityUtils.PendingRequests.Delegate delegate2 = pendingRequests2.delegate;
                    if (delegate2 != null) {
                        delegate2.updateAdapter();
                    }
                }
                break;
            default:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                CommunityUtils.PendingRequests pendingRequests3 = this.f$0;
                if (tL_error2 == null) {
                    pendingRequests3.getClass();
                } else {
                    pendingRequests3.bulletinFactory.showForError(false, tL_error2);
                }
                break;
        }
    }
}
