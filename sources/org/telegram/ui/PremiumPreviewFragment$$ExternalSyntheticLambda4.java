package org.telegram.ui;

import java.util.Comparator;
import org.telegram.messenger.MessagesController;

public final class PremiumPreviewFragment$$ExternalSyntheticLambda4 implements Comparator {
    public final int $r8$classId;
    public final MessagesController f$0;

    public PremiumPreviewFragment$$ExternalSyntheticLambda4(MessagesController messagesController, int i) {
        this.$r8$classId = i;
        this.f$0 = messagesController;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        PremiumPreviewFragment.PremiumFeatureData premiumFeatureData = (PremiumPreviewFragment.PremiumFeatureData) obj;
        PremiumPreviewFragment.PremiumFeatureData premiumFeatureData2 = (PremiumPreviewFragment.PremiumFeatureData) obj2;
        switch (this.$r8$classId) {
            case 0:
                return PremiumPreviewFragment.lambda$fillBusinessFeaturesList$8(this.f$0, premiumFeatureData, premiumFeatureData2);
            default:
                return PremiumPreviewFragment.lambda$fillPremiumFeaturesList$7(this.f$0, premiumFeatureData, premiumFeatureData2);
        }
    }
}
