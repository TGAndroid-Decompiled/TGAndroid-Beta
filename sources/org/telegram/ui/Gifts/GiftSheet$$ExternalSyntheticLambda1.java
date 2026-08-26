package org.telegram.ui.Gifts;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.poll.RecentVotersCell;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stories.PeerStoriesView;

public final class GiftSheet$$ExternalSyntheticLambda1 implements View.OnClickListener {
    public final int $r8$classId;
    public final Object f$0;
    public final long f$1;

    public GiftSheet$$ExternalSyntheticLambda1(Object obj, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = j;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                GiftSheet giftSheet = (GiftSheet) this.f$0;
                giftSheet.getClass();
                BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment != null) {
                    giftSheet.lambda$showGiftOfferSheet$15();
                    safeLastFragment.presentFragment(ProfileActivity.of(this.f$1));
                    break;
                }
                break;
            case 1:
                Utilities.Callback callback = ((RecentVotersCell.VotesList) this.f$0).onClick;
                if (callback != null) {
                    callback.run(Long.valueOf(this.f$1));
                }
                break;
            case 2:
                ((AuctionBidSheet) this.f$0).lambda$updateTable$7(this.f$1);
                break;
            default:
                PeerStoriesView peerStoriesView = (PeerStoriesView) this.f$0;
                peerStoriesView.getClass();
                Bundle bundle = new Bundle();
                long j = this.f$1;
                if (j >= 0) {
                    bundle.putLong("user_id", j);
                } else {
                    bundle.putLong("chat_id", -j);
                }
                peerStoriesView.storyViewer.presentFragment(new ProfileActivity(bundle));
                break;
        }
    }
}
