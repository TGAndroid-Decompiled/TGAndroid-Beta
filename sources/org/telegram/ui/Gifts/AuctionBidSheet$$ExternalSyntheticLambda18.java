package org.telegram.ui.Gifts;

import android.text.TextUtils;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.community.CommunityUtils;

public final class AuctionBidSheet$$ExternalSyntheticLambda18 implements Utilities.Callback2 {
    public final int $r8$classId;
    public final Object f$0;
    public final long f$1;

    public AuctionBidSheet$$ExternalSyntheticLambda18(Object obj, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = j;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ((AuctionBidSheet) this.f$0).lambda$sendBid$10(this.f$1, (Boolean) obj, (String) obj2);
                break;
            case 1:
                ((GiftAuctionController) this.f$0).lambda$subscribeToGiftAuctionStateInternal$1(this.f$1, (TL_payments.TL_StarGiftAuctionState) obj, (TLRPC.TL_error) obj2);
                break;
            default:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                BaseFragment baseFragment = (BaseFragment) this.f$0;
                long j = this.f$1;
                if (tL_error == null) {
                    CommunityUtils.onCommunityLinkSuccess(baseFragment, -j, 1);
                } else if (!TextUtils.equals("COMMUNITY_REQUEST_CREATED", tL_error.text)) {
                    BulletinFactory.of(baseFragment).showForError(tL_error);
                } else {
                    CommunityUtils.onCommunityLinkSuccess(baseFragment, -j, 2);
                }
                break;
        }
    }
}
