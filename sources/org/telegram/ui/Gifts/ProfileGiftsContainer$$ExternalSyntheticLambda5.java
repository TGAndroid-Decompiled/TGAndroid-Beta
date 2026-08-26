package org.telegram.ui.Gifts;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.BirthdayController;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.Premium.boosts.UserSelectorBottomSheet;
import org.telegram.ui.Components.SharedMediaLayout;
import org.telegram.ui.Stories.recorder.StoryRecorder;

public final class ProfileGiftsContainer$$ExternalSyntheticLambda5 implements View.OnClickListener {
    public final int $r8$classId;
    public final FrameLayout f$0;
    public final boolean f$1;
    public final int f$2;

    public ProfileGiftsContainer$$ExternalSyntheticLambda5(FrameLayout frameLayout, boolean z, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = frameLayout;
        this.f$1 = z;
        this.f$2 = i;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                SharedMediaLayout.AnonymousClass13 anonymousClass13 = (SharedMediaLayout.AnonymousClass13) this.f$0;
                if (anonymousClass13.collections.isMine() && anonymousClass13.viewPager.getCurrentPosition() != 0) {
                    anonymousClass13.addGifts();
                } else {
                    boolean z = this.f$1;
                    int i = this.f$2;
                    if (!z) {
                        UserSelectorBottomSheet.open(2, BirthdayController.getInstance(i).getState());
                    } else {
                        GiftSheet giftSheet = new GiftSheet(anonymousClass13.getContext(), i, anonymousClass13.dialogId, null, null);
                        giftSheet.birthday = BirthdayController.getInstance(i).isToday(anonymousClass13.dialogId);
                        giftSheet.adapter.update(false);
                        giftSheet.show();
                    }
                }
                break;
            default:
                SharedMediaLayout sharedMediaLayout = (SharedMediaLayout) this.f$0;
                BaseFragment baseFragment = sharedMediaLayout.profileActivity;
                if (!this.f$1) {
                    baseFragment.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                    StoryRecorder.getInstance(baseFragment.getParentActivity(), baseFragment.getCurrentAccount()).open(null);
                } else {
                    sharedMediaLayout.openAddStoriesToAlbumSheet(baseFragment, sharedMediaLayout.dialog_id, this.f$2);
                }
                break;
        }
    }
}
