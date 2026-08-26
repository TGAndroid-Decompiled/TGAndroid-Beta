package org.telegram.ui.Stars;

import org.telegram.ui.Components.SharedMediaLayout;
import org.telegram.ui.ProfileActivity;

public final class StarsController$$ExternalSyntheticLambda18 implements Runnable {
    public final int $r8$classId;
    public final ProfileActivity f$0;

    public StarsController$$ExternalSyntheticLambda18(ProfileActivity profileActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = profileActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ProfileActivity profileActivity = this.f$0;
                SharedMediaLayout sharedMediaLayout = profileActivity.sharedMediaLayout;
                if (sharedMediaLayout != null) {
                    sharedMediaLayout.scrollToPage(14);
                    profileActivity.scrollToSharedMedia();
                }
                break;
            case 1:
                this.f$0.scrollToSharedMedia(true);
                break;
            default:
                this.f$0.scrollToSharedMedia(true);
                break;
        }
    }
}
