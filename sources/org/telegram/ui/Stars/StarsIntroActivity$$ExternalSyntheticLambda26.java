package org.telegram.ui.Stars;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.browser.Browser;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.Components.StarAppsSheet;

public final class StarsIntroActivity$$ExternalSyntheticLambda26 implements Runnable {
    public final int $r8$classId;
    public final Context f$0;
    public final BottomSheet[] f$1;

    public StarsIntroActivity$$ExternalSyntheticLambda26(Context context, BottomSheet[] bottomSheetArr) {
        this.$r8$classId = 0;
        this.f$0 = context;
        this.f$1 = bottomSheetArr;
    }

    @Override
    public final void run() {
        BottomSheet bottomSheet;
        BaseFragment baseFragment;
        switch (this.$r8$classId) {
            case 0:
                StarAppsSheet starAppsSheet = new StarAppsSheet(this.f$0);
                if (!AndroidUtilities.isTablet()) {
                    BottomSheet[] bottomSheetArr = this.f$1;
                    if (!AndroidUtilities.hasDialogOnTop(bottomSheetArr[0].attachedFragment) && (bottomSheet = bottomSheetArr[0]) != null && (baseFragment = bottomSheet.attachedFragment) != null) {
                        starAppsSheet.makeAttached(baseFragment);
                    }
                }
                starAppsSheet.show();
                break;
            case 1:
                this.f$1[0].lambda$showGiftOfferSheet$15();
                Browser.openUrl(this.f$0, LocaleController.getString(R.string.CocoonFeature1TextLink));
                break;
            case 2:
                this.f$1[0].lambda$showGiftOfferSheet$15();
                Browser.openUrlInSystemBrowser(this.f$0, LocaleController.getString(R.string.CocoonFeature3TextLink));
                break;
            default:
                this.f$1[0].lambda$showGiftOfferSheet$15();
                Browser.openUrl(this.f$0, LocaleController.getString(R.string.CocoonFooterLink));
                break;
        }
    }

    public StarsIntroActivity$$ExternalSyntheticLambda26(BottomSheet[] bottomSheetArr, Context context, int i) {
        this.$r8$classId = i;
        this.f$1 = bottomSheetArr;
        this.f$0 = context;
    }
}
