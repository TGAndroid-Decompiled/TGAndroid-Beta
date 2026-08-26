package org.telegram.ui.Gifts;

import android.view.View;
import org.telegram.ui.Components.RecyclerListView;

public final class AuctionBidSheet$$ExternalSyntheticLambda6 implements RecyclerListView.OnItemClickListener {
    public final int $r8$classId;

    public AuctionBidSheet$$ExternalSyntheticLambda6(int i) {
        this.$r8$classId = i;
    }

    @Override
    public final void onItemClick(View view, int i) {
        switch (this.$r8$classId) {
            case 0:
                int i2 = AuctionBidSheet.$r8$clinit;
                break;
            default:
                int i3 = AcquiredGiftsSheet.$r8$clinit;
                break;
        }
    }
}
