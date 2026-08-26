package org.telegram.ui.Components.Premium.boosts;

import android.view.View;

public final class SelectorBottomSheet$$ExternalSyntheticLambda4 implements View.OnClickListener {
    public final int $r8$classId;
    public final SelectorBottomSheet f$0;

    public SelectorBottomSheet$$ExternalSyntheticLambda4(SelectorBottomSheet selectorBottomSheet, int i) {
        this.$r8$classId = i;
        this.f$0 = selectorBottomSheet;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.save(false);
                break;
            default:
                SelectorBottomSheet selectorBottomSheet = this.f$0;
                selectorBottomSheet.selectedIds.clear();
                selectorBottomSheet.searchField.spansContainer.removeAllSpans(true);
                selectorBottomSheet.updateList$1(true, false);
                break;
        }
    }
}
