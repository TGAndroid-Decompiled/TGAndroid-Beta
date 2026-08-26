package org.telegram.ui.Gifts;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.Premium.boosts.BoostRepository;
import org.telegram.ui.Components.UniversalAdapter;

public final class GiftSheet$$ExternalSyntheticLambda7 implements Utilities.Callback {
    public final int $r8$classId;
    public final GiftSheet f$0;

    public GiftSheet$$ExternalSyntheticLambda7(GiftSheet giftSheet, int i) {
        this.$r8$classId = i;
        this.f$0 = giftSheet;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                List list = (List) obj;
                GiftSheet giftSheet = this.f$0;
                if (giftSheet.getContext() != null && giftSheet.isShown()) {
                    ArrayList arrayListFilterGiftOptions = BoostRepository.filterGiftOptions(1, list);
                    giftSheet.options = arrayListFilterGiftOptions;
                    ArrayList arrayListFilterGiftOptionsByBilling = BoostRepository.filterGiftOptionsByBilling(arrayListFilterGiftOptions);
                    giftSheet.options = arrayListFilterGiftOptionsByBilling;
                    if (!arrayListFilterGiftOptionsByBilling.isEmpty()) {
                        giftSheet.updatePremiumTiers();
                        UniversalAdapter universalAdapter = giftSheet.adapter;
                        if (universalAdapter != null) {
                            universalAdapter.update(true);
                        }
                    }
                    break;
                }
                break;
            default:
                int iIntValue = ((Integer) obj).intValue();
                GiftSheet giftSheet2 = this.f$0;
                if (giftSheet2.selectedTab != iIntValue) {
                    giftSheet2.selectedTab = iIntValue;
                    giftSheet2.itemAnimator.endAnimations();
                    giftSheet2.adapter.update(true);
                    break;
                }
                break;
        }
    }
}
