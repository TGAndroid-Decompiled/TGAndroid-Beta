package org.telegram.ui.Components.Premium.boosts;

import android.content.DialogInterface;
import org.telegram.ui.Components.Premium.boosts.cells.HeaderCell;

public final class BoostViaGiftsBottomSheet$$ExternalSyntheticLambda9 implements DialogInterface.OnShowListener {
    public final int $r8$classId;
    public final BoostViaGiftsBottomSheet f$0;

    public BoostViaGiftsBottomSheet$$ExternalSyntheticLambda9(BoostViaGiftsBottomSheet boostViaGiftsBottomSheet, int i) {
        this.$r8$classId = i;
        this.f$0 = boostViaGiftsBottomSheet;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.$r8$classId) {
            case 0:
                HeaderCell headerCell = this.f$0.adapter.headerCell;
                if (headerCell != null) {
                    headerCell.setPaused(true);
                }
                break;
            default:
                HeaderCell headerCell2 = this.f$0.adapter.headerCell;
                if (headerCell2 != null) {
                    headerCell2.setPaused(true);
                }
                break;
        }
    }
}
