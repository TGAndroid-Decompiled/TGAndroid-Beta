package org.telegram.ui.Gifts;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.Theme;

public final class AuctionJoinSheet$$ExternalSyntheticLambda3 implements Runnable {
    public final int $r8$classId;
    public final Context f$0;
    public final Theme.ResourcesProvider f$1;
    public final TL_stars.StarGift f$2;

    public AuctionJoinSheet$$ExternalSyntheticLambda3(Context context, Theme.ResourcesProvider resourcesProvider, TL_stars.StarGift starGift, int i) {
        this.$r8$classId = i;
        this.f$0 = context;
        this.f$1 = resourcesProvider;
        this.f$2 = starGift;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                AuctionJoinSheet.showMoreInfo(this.f$0, this.f$1, this.f$2);
                break;
            default:
                AuctionJoinSheet.showMoreInfo(this.f$0, this.f$1, this.f$2);
                break;
        }
    }
}
