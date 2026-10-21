package org.telegram.ui;

import android.app.Activity;
import android.view.View;
public final class ay0 implements View.OnClickListener {
    public final int f35453a;
    public final ProfileActivity f35454b;
    public final String f35455c;

    public ay0(ProfileActivity profileActivity, String str, int i10) {
        this.f35453a = i10;
        this.f35454b = profileActivity;
        this.f35455c = str;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35453a) {
            case 0:
                ProfileActivity profileActivity = this.f35454b;
                Activity parentActivity = profileActivity.getParentActivity();
                pf.d.r(parentActivity, "https://" + profileActivity.getMessagesController().linkPrefix + "/nft/" + this.f35455c);
                return;
            default:
                ProfileActivity profileActivity2 = this.f35454b;
                Activity parentActivity2 = profileActivity2.getParentActivity();
                pf.d.r(parentActivity2, "https://" + profileActivity2.getMessagesController().linkPrefix + "/nft/" + this.f35455c);
                return;
        }
    }
}
