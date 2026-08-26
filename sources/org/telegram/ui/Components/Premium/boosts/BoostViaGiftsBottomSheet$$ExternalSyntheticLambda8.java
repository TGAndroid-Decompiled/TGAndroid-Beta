package org.telegram.ui.Components.Premium.boosts;

import android.content.DialogInterface;
import org.telegram.ui.Components.Premium.boosts.cells.HeaderCell;

public final class BoostViaGiftsBottomSheet$$ExternalSyntheticLambda8 implements DialogInterface.OnDismissListener {
    public final int $r8$classId;
    public final BoostViaGiftsBottomSheet f$0;

    public BoostViaGiftsBottomSheet$$ExternalSyntheticLambda8(BoostViaGiftsBottomSheet boostViaGiftsBottomSheet, int i) {
        this.$r8$classId = i;
        this.f$0 = boostViaGiftsBottomSheet;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$r8$classId) {
            case 0:
                HeaderCell headerCell = this.f$0.adapter.headerCell;
                if (headerCell != null) {
                    headerCell.setPaused(false);
                }
                break;
            default:
                HeaderCell headerCell2 = this.f$0.adapter.headerCell;
                if (headerCell2 != null) {
                    headerCell2.setPaused(false);
                }
                break;
        }
    }
}
