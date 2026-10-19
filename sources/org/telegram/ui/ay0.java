package org.telegram.ui;

import android.app.Activity;
import android.view.View;
public final class ay0 implements View.OnClickListener {
    public final int f35446a;
    public final ProfileActivity f35447b;
    public final String f35448c;

    public ay0(ProfileActivity profileActivity, String str, int i10) {
        this.f35446a = i10;
        this.f35447b = profileActivity;
        this.f35448c = str;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35446a) {
            case 0:
                ProfileActivity profileActivity = this.f35447b;
                Activity parentActivity = profileActivity.getParentActivity();
                pf.d.r(parentActivity, "https://" + profileActivity.getMessagesController().linkPrefix + "/nft/" + this.f35448c);
                return;
            default:
                ProfileActivity profileActivity2 = this.f35447b;
                Activity parentActivity2 = profileActivity2.getParentActivity();
                pf.d.r(parentActivity2, "https://" + profileActivity2.getMessagesController().linkPrefix + "/nft/" + this.f35448c);
                return;
        }
    }
}
