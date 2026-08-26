package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.browser.Browser;

public final class ProfileActivity$$ExternalSyntheticLambda39 implements View.OnClickListener {
    public final int $r8$classId;
    public final ProfileActivity f$0;
    public final String f$1;

    public ProfileActivity$$ExternalSyntheticLambda39(ProfileActivity profileActivity, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = profileActivity;
        this.f$1 = str;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                ProfileActivity profileActivity = this.f$0;
                Browser.openUrl(profileActivity.getParentActivity(), "https://" + profileActivity.getMessagesController().linkPrefix + "/nft/" + this.f$1);
                break;
            default:
                ProfileActivity profileActivity2 = this.f$0;
                Browser.openUrl(profileActivity2.getParentActivity(), "https://" + profileActivity2.getMessagesController().linkPrefix + "/nft/" + this.f$1);
                break;
        }
    }
}
