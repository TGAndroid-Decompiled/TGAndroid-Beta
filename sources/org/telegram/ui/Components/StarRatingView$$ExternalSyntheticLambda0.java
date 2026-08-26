package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ProfileActivity$$ExternalSyntheticLambda7;

public final class StarRatingView$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final StarRatingView f$0;

    public StarRatingView$$ExternalSyntheticLambda0(StarRatingView starRatingView, int i) {
        this.$r8$classId = i;
        this.f$0 = starRatingView;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                StarRatingView starRatingView = this.f$0;
                starRatingView.invalidate();
                AndroidUtilities.runOnUIThread(new StarRatingView$$ExternalSyntheticLambda0(starRatingView, 1));
                break;
            default:
                StarRatingView starRatingView2 = this.f$0;
                StarRatingView.Delegate delegate = starRatingView2.delegate;
                if (delegate != null) {
                    starRatingView2.getVisibilityFactor();
                    ProfileActivity profileActivity = ((ProfileActivity$$ExternalSyntheticLambda7) delegate).f$0;
                    SimpleTextView[] simpleTextViewArr = profileActivity.onlineTextView;
                    simpleTextViewArr[1].setTranslationX(profileActivity.getOnlineTextViewTranslationXWithOffsets(profileActivity.lastOnlineTextViewX));
                    simpleTextViewArr[1].setTranslationY(profileActivity.getOnlineTextViewTranslationYWithOffsets(profileActivity.lastOnlineTextViewY));
                }
                break;
        }
    }
}
