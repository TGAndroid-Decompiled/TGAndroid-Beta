package org.telegram.ui.Stars;

import org.telegram.ui.ProfileActivity;

public final class StarsController$$ExternalSyntheticLambda22 implements Runnable {
    public final int $r8$classId;
    public final ProfileActivity f$0;

    public StarsController$$ExternalSyntheticLambda22(ProfileActivity profileActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = profileActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ProfileActivity profileActivity = this.f$0;
                ProfileActivity.AnonymousClass9 anonymousClass9 = profileActivity.sharedMediaLayout;
                if (anonymousClass9 != null) {
                    anonymousClass9.scrollToPage(14);
                    profileActivity.scrollToSharedMedia(false);
                }
                break;
            default:
                this.f$0.scrollToSharedMedia(true);
                break;
        }
    }
}
