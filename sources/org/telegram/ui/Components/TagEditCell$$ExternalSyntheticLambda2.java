package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.ActionBar.BottomSheet;

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
                ChatGreetingsView.lambda$showPremiumSheet$3(this.f$0, view);
                break;
            default:
                this.f$0.lambda$showGiftOfferSheet$15();
                break;
        }
    }
}
