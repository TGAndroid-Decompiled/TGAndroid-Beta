package org.telegram.ui.Gifts;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;

public final class SendGiftSheet$$ExternalSyntheticLambda1 implements View.OnClickListener {
    public final int $r8$classId;
    public final Object f$0;
    public final long f$1;
    public final Context f$2;
    public final Object f$3;
    public final Object f$4;

    public SendGiftSheet$$ExternalSyntheticLambda1(Context context, Theme.ResourcesProvider resourcesProvider, long j, TL_stars.StarGift starGift, ArrayList arrayList) {
        this.$r8$classId = 3;
        this.f$2 = context;
        this.f$0 = resourcesProvider;
        this.f$1 = j;
        this.f$4 = starGift;
        this.f$3 = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                ((SendGiftSheet) this.f$0).lambda$new$0(this.f$1, this.f$2, (Runnable) this.f$3, (TL_stars.StarGift) this.f$4);
                break;
            case 1:
                ((AuctionJoinSheet) this.f$0).lambda$new$6(this.f$1, this.f$2, (Theme.ResourcesProvider) this.f$3, (GiftSheet$$ExternalSyntheticLambda10) this.f$4);
                break;
            case 2:
                AuctionWearingSheet auctionWearingSheet = (AuctionWearingSheet) this.f$0;
                auctionWearingSheet.getClass();
                AuctionBidSheet auctionBidSheet = new AuctionBidSheet(this.f$2, (Theme.ResourcesProvider) this.f$3, new AuctionBidSheet.Params(this.f$1, true, null), auctionWearingSheet.auction);
                auctionBidSheet.show();
                auctionBidSheet.closeParentSheet = (GiftSheet$$ExternalSyntheticLambda10) this.f$4;
                auctionWearingSheet.lambda$showGiftOfferSheet$15();
                break;
            default:
                new AuctionWearingSheet(this.f$2, (Theme.ResourcesProvider) this.f$0, this.f$1, (TL_stars.StarGift) this.f$4, (ArrayList) this.f$3, null, true).show();
                break;
        }
    }

    public SendGiftSheet$$ExternalSyntheticLambda1(BottomSheetWithRecyclerListView bottomSheetWithRecyclerListView, long j, Context context, Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = bottomSheetWithRecyclerListView;
        this.f$1 = j;
        this.f$2 = context;
        this.f$3 = obj;
        this.f$4 = obj2;
    }
}
