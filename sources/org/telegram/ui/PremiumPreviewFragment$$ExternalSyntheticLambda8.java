package org.telegram.ui;

import java.util.Comparator;
import org.telegram.messenger.MessagesController;

public final class PremiumPreviewFragment$$ExternalSyntheticLambda8 implements Comparator {
    public final int $r8$classId;
    public final MessagesController f$0;

    public PremiumPreviewFragment$$ExternalSyntheticLambda8(MessagesController messagesController, int i) {
        this.$r8$classId = i;
        this.f$0 = messagesController;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        PremiumPreviewFragment.PremiumFeatureData premiumFeatureData = (PremiumPreviewFragment.PremiumFeatureData) obj;
        PremiumPreviewFragment.PremiumFeatureData premiumFeatureData2 = (PremiumPreviewFragment.PremiumFeatureData) obj2;
        switch (this.$r8$classId) {
            case 0:
                MessagesController messagesController = this.f$0;
                return messagesController.businessFeaturesTypesToPosition.get(premiumFeatureData.type, Integer.MAX_VALUE) - messagesController.businessFeaturesTypesToPosition.get(premiumFeatureData2.type, Integer.MAX_VALUE);
            default:
                MessagesController messagesController2 = this.f$0;
                return messagesController2.premiumFeaturesTypesToPosition.get(premiumFeatureData.type, Integer.MAX_VALUE) - messagesController2.premiumFeaturesTypesToPosition.get(premiumFeatureData2.type, Integer.MAX_VALUE);
        }
    }
}
