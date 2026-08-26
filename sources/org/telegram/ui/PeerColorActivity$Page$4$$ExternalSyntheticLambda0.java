package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Gifts.ResaleGiftsFragment;

public final class PeerColorActivity$Page$4$$ExternalSyntheticLambda0 implements Utilities.Callback {
    public final int $r8$classId;
    public final PeerColorActivity.Page.AnonymousClass4 f$0;

    public PeerColorActivity$Page$4$$ExternalSyntheticLambda0(PeerColorActivity.Page.AnonymousClass4 anonymousClass4, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass4;
    }

    @Override
    public final void run(Object obj) {
        PeerColorActivity.ProfilePreview profilePreview;
        PeerColorActivity.Page page;
        switch (this.$r8$classId) {
            case 0:
                Integer num = (Integer) obj;
                PeerColorActivity.Page.AnonymousClass4 anonymousClass4 = this.f$0;
                int iIntValue = num.intValue();
                PeerColorActivity.Page page2 = PeerColorActivity.Page.this;
                TL_stars.StarGift starGift = iIntValue == 0 ? null : (TL_stars.StarGift) page2.index2gift.get(num);
                page2.selectedTabGift = starGift;
                PeerColorActivity peerColorActivity = PeerColorActivity.this;
                if (starGift == null) {
                    ResaleGiftsFragment.ResaleGiftsList resaleGiftsList = page2.resaleGifts;
                    if (resaleGiftsList != null) {
                        resaleGiftsList.cancel();
                        page2.resaleGifts = null;
                    }
                } else {
                    ResaleGiftsFragment.ResaleGiftsList resaleGiftsList2 = page2.resaleGifts;
                    if (resaleGiftsList2 == null || resaleGiftsList2.gift_id != starGift.id) {
                        ResaleGiftsFragment.ResaleGiftsList resaleGiftsList3 = new ResaleGiftsFragment.ResaleGiftsList(page2.selectedTabGift.id, ((BaseFragment) peerColorActivity).currentAccount, new PeerColorActivity$Page$4$$ExternalSyntheticLambda0(anonymousClass4, 2));
                        page2.resaleGifts = resaleGiftsList3;
                        resaleGiftsList3.load(false);
                    }
                }
                page2.update();
                (peerColorActivity.viewPager.getCurrentPosition() == 1 ? peerColorActivity.profilePage : peerColorActivity.namePage).update();
                break;
            case 1:
                PeerColorActivity.Page.AnonymousClass4 anonymousClass5 = this.f$0;
                anonymousClass5.getClass();
                int iIntValue2 = ((Integer) obj).intValue();
                PeerColorActivity.Page page3 = PeerColorActivity.Page.this;
                page3.selectedColor = iIntValue2;
                page3.selectedEmojiCollectible = null;
                page3.selectedPeerCollectible = null;
                page3.selectedResaleGift = null;
                page3.updateProfilePreview(true);
                page3.updateMessages();
                page3.updateButton();
                PeerColorActivity.Page.SetReplyIconCell setReplyIconCell = page3.setReplyIconCell;
                if (setReplyIconCell != null) {
                    setReplyIconCell.invalidate();
                }
                PeerColorActivity peerColorActivity2 = PeerColorActivity.this;
                PeerColorActivity.Page page4 = peerColorActivity2.profilePage;
                if (page4 != null && (profilePreview = page4.profilePreview) != null && (page = peerColorActivity2.namePage) != null) {
                    profilePreview.overrideAvatarColor(page.selectedColor);
                    break;
                }
                break;
            default:
                PeerColorActivity.Page.this.update();
                break;
        }
    }
}
