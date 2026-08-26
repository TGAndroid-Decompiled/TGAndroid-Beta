package org.telegram.ui.Stars;

import android.view.View;
import org.telegram.ui.ActionBar.BottomSheet;

public final class StarsIntroActivity$$ExternalSyntheticLambda3 implements View.OnClickListener {
    public final int $r8$classId;
    public final BottomSheet[] f$0;

    public StarsIntroActivity$$ExternalSyntheticLambda3(BottomSheet[] bottomSheetArr, int i) {
        this.$r8$classId = i;
        this.f$0 = bottomSheetArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                BottomSheet bottomSheet = this.f$0[0];
                if (bottomSheet != null) {
                    bottomSheet.lambda$showGiftOfferSheet$15();
                }
                break;
            case 1:
                this.f$0[0].lambda$showGiftOfferSheet$15();
                break;
            default:
                this.f$0[0].lambda$showGiftOfferSheet$15();
                break;
        }
    }
}
