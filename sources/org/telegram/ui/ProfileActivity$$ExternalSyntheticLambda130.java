package org.telegram.ui;

import android.view.View;

public final class ProfileActivity$$ExternalSyntheticLambda130 implements View.OnClickListener {
    public final int $r8$classId;
    public final ProfileActivity f$0;
    public final String f$1;

    public ProfileActivity$$ExternalSyntheticLambda130(ProfileActivity profileActivity, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = profileActivity;
        this.f$1 = str;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$setCollectibleGiftStatus$156(this.f$1, view);
                break;
            default:
                this.f$0.lambda$updateProfileData$107(this.f$1, view);
                break;
        }
    }
}
