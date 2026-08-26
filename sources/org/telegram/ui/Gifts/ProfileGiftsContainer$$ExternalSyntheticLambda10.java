package org.telegram.ui.Gifts;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ProfileActivity;

public final class ProfileGiftsContainer$$ExternalSyntheticLambda10 implements Utilities.Callback {
    public final int $r8$classId;
    public final ProfileGiftsContainer f$0;

    public ProfileGiftsContainer$$ExternalSyntheticLambda10(ProfileGiftsContainer profileGiftsContainer, int i) {
        this.$r8$classId = i;
        this.f$0 = profileGiftsContainer;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ProfileGiftsContainer profileGiftsContainer = this.f$0;
                profileGiftsContainer.getClass();
                ProfileGiftsContainer$$ExternalSyntheticLambda10 profileGiftsContainer$$ExternalSyntheticLambda10 = new ProfileGiftsContainer$$ExternalSyntheticLambda10(profileGiftsContainer, 1);
                profileGiftsContainer.collections.createCollection((String) obj, profileGiftsContainer$$ExternalSyntheticLambda10);
                break;
            default:
                ProfileGiftsContainer profileGiftsContainer2 = this.f$0;
                profileGiftsContainer2.fillTabs(true);
                int i = ((TL_stars.TL_starGiftCollection) obj).collection_id;
                profileGiftsContainer2.tabsView.scrollToTab(i, profileGiftsContainer2.collections.indexOf(i) + 1);
                BaseFragment baseFragment = profileGiftsContainer2.fragment;
                if (baseFragment instanceof ProfileActivity) {
                    ((ProfileActivity) baseFragment).scrollToSharedMedia(true);
                }
                profileGiftsContainer2.updateTabsShown();
                break;
        }
    }
}
