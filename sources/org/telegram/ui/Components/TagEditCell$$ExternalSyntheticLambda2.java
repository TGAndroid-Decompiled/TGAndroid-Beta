package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

public final class TagEditCell$$ExternalSyntheticLambda2 implements View.OnClickListener {
    public final int $r8$classId;
    public final BottomSheet f$0;

    public TagEditCell$$ExternalSyntheticLambda2(BottomSheet bottomSheet, int i) {
        this.$r8$classId = i;
        this.f$0 = bottomSheet;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$showGiftOfferSheet$15();
                break;
            case 1:
                this.f$0.lambda$showGiftOfferSheet$15();
                break;
            case 2:
                this.f$0.lambda$showGiftOfferSheet$15();
                break;
            case 3:
                this.f$0.lambda$showGiftOfferSheet$15();
                break;
            case 4:
                BaseFragment lastFragment = LaunchActivity.getLastFragment();
                if (lastFragment != null) {
                    lastFragment.presentFragment(new PremiumPreviewFragment(0, "contact"));
                    this.f$0.lambda$showGiftOfferSheet$15();
                }
                break;
            default:
                this.f$0.lambda$showGiftOfferSheet$15();
                break;
        }
    }
}
