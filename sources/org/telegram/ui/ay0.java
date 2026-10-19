package org.telegram.ui;

import android.app.Activity;
import android.view.View;
public final class ay0 implements View.OnClickListener {
    public final int f35462a;
    public final ProfileActivity f35463b;
    public final String f35464c;

    public ay0(ProfileActivity profileActivity, String str, int i10) {
        this.f35462a = i10;
        this.f35463b = profileActivity;
        this.f35464c = str;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35462a) {
            case 0:
                ProfileActivity profileActivity = this.f35463b;
                Activity parentActivity = profileActivity.getParentActivity();
                pf.d.r(parentActivity, "https://" + profileActivity.getMessagesController().linkPrefix + "/nft/" + this.f35464c);
                return;
            default:
                ProfileActivity profileActivity2 = this.f35463b;
                Activity parentActivity2 = profileActivity2.getParentActivity();
                pf.d.r(parentActivity2, "https://" + profileActivity2.getMessagesController().linkPrefix + "/nft/" + this.f35464c);
                return;
        }
    }
}
