package org.telegram.ui;

import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.VideoEditTextureView$$ExternalSyntheticLambda1;

public final class FiltersSetupActivity$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final FiltersSetupActivity f$0;

    public FiltersSetupActivity$$ExternalSyntheticLambda1(FiltersSetupActivity filtersSetupActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = filtersSetupActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                FiltersSetupActivity filtersSetupActivity = this.f$0;
                filtersSetupActivity.listView.highlightRowInternal(new VideoEditTextureView$$ExternalSyntheticLambda1(filtersSetupActivity, 22), 700, true);
                break;
            case 1:
                FiltersSetupActivity filtersSetupActivity2 = this.f$0;
                filtersSetupActivity2.getClass();
                filtersSetupActivity2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                break;
            default:
                FiltersSetupActivity filtersSetupActivity3 = this.f$0;
                filtersSetupActivity3.getClass();
                filtersSetupActivity3.showDialog(new PremiumFeatureBottomSheet(filtersSetupActivity3, filtersSetupActivity3.getParentActivity(), filtersSetupActivity3.getCurrentAccount(), false, 9, true, null));
                break;
        }
    }
}
