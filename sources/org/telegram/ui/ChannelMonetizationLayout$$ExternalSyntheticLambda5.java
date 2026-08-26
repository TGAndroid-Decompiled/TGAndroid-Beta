package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.BottomSheet;

public final class ChannelMonetizationLayout$$ExternalSyntheticLambda5 implements View.OnClickListener {
    public final int $r8$classId;
    public final BottomSheet f$0;

    public ChannelMonetizationLayout$$ExternalSyntheticLambda5(BottomSheet bottomSheet, int i) {
        this.$r8$classId = i;
        this.f$0 = bottomSheet;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$showGiftOfferSheet$15();
                break;
            default:
                this.f$0.lambda$showGiftOfferSheet$15();
                break;
        }
    }
}
