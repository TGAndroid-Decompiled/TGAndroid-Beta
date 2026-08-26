package org.telegram.ui.Components.Premium;

import android.view.ViewGroup;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.QrActivity;

public final class LimitReachedBottomSheet$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final LimitReachedBottomSheet f$0;

    public LimitReachedBottomSheet$$ExternalSyntheticLambda2(LimitReachedBottomSheet limitReachedBottomSheet, int i) {
        this.$r8$classId = i;
        this.f$0 = limitReachedBottomSheet;
    }

    @Override
    public final void run() {
        LimitReachedBottomSheet limitReachedBottomSheet = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                limitReachedBottomSheet.lambda$new$2();
                break;
            case 1:
                limitReachedBottomSheet.limitPreviewView.setBoosts(limitReachedBottomSheet.boostsStatus, false);
                limitReachedBottomSheet.limitPreviewIncreaseCurrentValue();
                break;
            case 2:
                limitReachedBottomSheet.getClass();
                if (LaunchActivity.getLastFragment() != null) {
                    BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
                    bottomSheetParams.transitionFromLeft = true;
                    limitReachedBottomSheet.parentFragment.showAsSheet(new PremiumPreviewFragment(0, "noncontacts"), bottomSheetParams);
                    break;
                }
                break;
            case 3:
                limitReachedBottomSheet.getClass();
                BulletinFactory bulletinFactoryGlobal = BulletinFactory.global();
                if (bulletinFactoryGlobal != null) {
                    HashSet hashSet = limitReachedBottomSheet.selectedChats;
                    if (hashSet.size() != 1) {
                        bulletinFactoryGlobal.createSimpleBulletinWithIconSize(R.raw.voip_invite, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("InviteLinkSent", hashSet.size(), Integer.valueOf(hashSet.size())))).show();
                    } else {
                        bulletinFactoryGlobal.createSimpleBulletinWithIconSize(R.raw.voip_invite, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.InviteLinkSentSingle, ContactsController.formatName((TLRPC.User) hashSet.iterator().next())))).show();
                    }
                }
                break;
            default:
                if (ChatObject.hasAdminRights(limitReachedBottomSheet.getChat$1$1())) {
                    if (limitReachedBottomSheet.premiumButtonView.getParent() != null) {
                        ((ViewGroup) limitReachedBottomSheet.premiumButtonView.getParent()).removeView(limitReachedBottomSheet.premiumButtonView);
                    }
                    QrActivity.AnonymousClass2 anonymousClass2 = limitReachedBottomSheet.divider;
                    if (anonymousClass2 != null && anonymousClass2.getParent() != null) {
                        ((ViewGroup) limitReachedBottomSheet.divider.getParent()).removeView(limitReachedBottomSheet.divider);
                    }
                    limitReachedBottomSheet.recyclerListView.setPadding(0, 0, 0, 0);
                }
                break;
        }
    }
}
