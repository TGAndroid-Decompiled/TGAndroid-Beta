package org.telegram.ui.Gifts;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.SharedMediaLayout;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarsController;

public final class ProfileGiftsContainer$Page$$ExternalSyntheticLambda24 implements Utilities.Callback {
    public final int $r8$classId;
    public final ProfileGiftsContainer.Page f$0;
    public final TL_stars.SavedStarGift f$1;

    public ProfileGiftsContainer$Page$$ExternalSyntheticLambda24(ProfileGiftsContainer.Page page, TL_stars.SavedStarGift savedStarGift, int i) {
        this.$r8$classId = i;
        this.f$0 = page;
        this.f$1 = savedStarGift;
    }

    @Override
    public final void run(Object obj) {
        TL_stars.SavedStarGift savedStarGift = this.f$1;
        ProfileGiftsContainer.Page page = this.f$0;
        int i = 1;
        switch (this.$r8$classId) {
            case 0:
                page.parent.collections.createCollection((String) obj, new ProfileGiftsContainer$Page$$ExternalSyntheticLambda24(page, savedStarGift, i));
                break;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                SharedMediaLayout.AnonymousClass13 anonymousClass13 = page.parent;
                StarsController.GiftsCollections giftsCollections = anonymousClass13.collections;
                int i2 = tL_starGiftCollection.collection_id;
                giftsCollections.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(savedStarGift);
                giftsCollections.addGifts(i2, arrayList);
                anonymousClass13.fillTabs(true);
                int i3 = tL_starGiftCollection.collection_id;
                anonymousClass13.tabsView.scrollToTab(i3, anonymousClass13.collections.indexOf(i3) + 1);
                BaseFragment baseFragment = anonymousClass13.fragment;
                if (baseFragment instanceof ProfileActivity) {
                    ((ProfileActivity) baseFragment).scrollToSharedMedia(true);
                }
                anonymousClass13.updateTabsShown();
                BulletinFactory.of(baseFragment).createSimpleMultiBulletin(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, StarGiftSheet.getGiftName(savedStarGift.gift), tL_starGiftCollection.title))).show();
                break;
        }
    }
}
