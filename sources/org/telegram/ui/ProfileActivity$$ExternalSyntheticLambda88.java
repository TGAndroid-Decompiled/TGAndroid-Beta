package org.telegram.ui;

import android.view.View;

public final class ProfileActivity$$ExternalSyntheticLambda88 implements View.OnClickListener {
    public final int $r8$classId;
    public final ProfileActivity f$0;

    public ProfileActivity$$ExternalSyntheticLambda88(ProfileActivity profileActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = profileActivity;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.showStarRatingBottomSheet(view);
                break;
            case 1:
                ProfileActivity.access$40000(this.f$0, view);
                break;
            case 2:
                ProfileActivity.access$40000(this.f$0, view);
                break;
            case 3:
                this.f$0.lambda$createView$37(view);
                break;
            case 4:
                this.f$0.lambda$createActionBar$3(view);
                break;
            case 5:
                this.f$0.lambda$updateProfileData$103(view);
                break;
            case 6:
                this.f$0.lambda$updateProfileData$104(view);
                break;
            case 7:
                this.f$0.lambda$updateProfileData$106(view);
                break;
            case 8:
                this.f$0.lambda$updateProfileData$108(view);
                break;
            case 9:
                this.f$0.lambda$createView$40(view);
                break;
            case 10:
                this.f$0.lambda$createView$42(view);
                break;
            case 11:
                this.f$0.lambda$createView$43(view);
                break;
            default:
                this.f$0.lambda$createView$12(view);
                break;
        }
    }
}
