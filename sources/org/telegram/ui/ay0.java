package org.telegram.ui;

import android.app.Activity;
import android.view.View;
public final class ay0 implements View.OnClickListener {
    public final int f35456a;
    public final ProfileActivity f35457b;
    public final String f35458c;

    public ay0(ProfileActivity profileActivity, String str, int i10) {
        this.f35456a = i10;
        this.f35457b = profileActivity;
        this.f35458c = str;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35456a) {
            case 0:
                ProfileActivity profileActivity = this.f35457b;
                Activity parentActivity = profileActivity.getParentActivity();
                pf.d.r(parentActivity, "https://" + profileActivity.getMessagesController().linkPrefix + "/nft/" + this.f35458c);
                return;
            default:
                ProfileActivity profileActivity2 = this.f35457b;
                Activity parentActivity2 = profileActivity2.getParentActivity();
                pf.d.r(parentActivity2, "https://" + profileActivity2.getMessagesController().linkPrefix + "/nft/" + this.f35458c);
                return;
        }
    }
}
