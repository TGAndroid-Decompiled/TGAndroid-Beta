package org.telegram.ui;

import android.view.View;

public final class MultiContactsSelectorBottomSheet$$ExternalSyntheticLambda0 implements View.OnClickListener {
    public final int $r8$classId;
    public final MultiContactsSelectorBottomSheet f$0;

    public MultiContactsSelectorBottomSheet$$ExternalSyntheticLambda0(MultiContactsSelectorBottomSheet multiContactsSelectorBottomSheet, int i) {
        this.$r8$classId = i;
        this.f$0 = multiContactsSelectorBottomSheet;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                MultiContactsSelectorBottomSheet multiContactsSelectorBottomSheet = this.f$0;
                multiContactsSelectorBottomSheet.selectedIds.clear();
                multiContactsSelectorBottomSheet.searchField.spansContainer.removeAllSpans(true);
                multiContactsSelectorBottomSheet.updateList$2(true, false);
                break;
            default:
                this.f$0.lambda$new$2$17$1();
                break;
        }
    }
}
