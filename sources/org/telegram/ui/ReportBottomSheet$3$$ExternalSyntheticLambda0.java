package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;

public final class ReportBottomSheet$3$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final BulletinFactory f$0;

    public ReportBottomSheet$3$$ExternalSyntheticLambda0(int i, BulletinFactory bulletinFactory) {
        this.$r8$classId = i;
        this.f$0 = bulletinFactory;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                if (LaunchActivity.getSafeLastFragment() != null) {
                    BulletinFactory bulletinFactoryOf = this.f$0;
                    if (bulletinFactoryOf == null) {
                        bulletinFactoryOf = BulletinFactory.of(LaunchActivity.getSafeLastFragment());
                    }
                    if (bulletinFactoryOf != null) {
                        Bulletin bulletinCreateSimpleBulletin = bulletinFactoryOf.createSimpleBulletin(LocaleController.getString(R.string.ReportChatSent), LocaleController.getString(R.string.Reported2), R.raw.msg_antispam);
                        bulletinCreateSimpleBulletin.duration = 5000;
                        bulletinCreateSimpleBulletin.show();
                        break;
                    }
                }
                break;
            default:
                BulletinFactory bulletinFactory = this.f$0;
                new PremiumFeatureBottomSheet(bulletinFactory.getContext(), 42, bulletinFactory.resourcesProvider).show();
                break;
        }
    }
}
