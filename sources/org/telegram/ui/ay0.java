package org.telegram.ui;

import android.app.Activity;
import android.view.View;
public final class ay0 implements View.OnClickListener {
    public final int f35452a;
    public final ProfileActivity f35453b;
    public final String f35454c;

    public ay0(ProfileActivity profileActivity, String str, int i10) {
        this.f35452a = i10;
        this.f35453b = profileActivity;
        this.f35454c = str;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35452a) {
            case 0:
                ProfileActivity profileActivity = this.f35453b;
                Activity parentActivity = profileActivity.getParentActivity();
                pf.d.r(parentActivity, "https://" + profileActivity.getMessagesController().linkPrefix + "/nft/" + this.f35454c);
                return;
            default:
                ProfileActivity profileActivity2 = this.f35453b;
                Activity parentActivity2 = profileActivity2.getParentActivity();
                pf.d.r(parentActivity2, "https://" + profileActivity2.getMessagesController().linkPrefix + "/nft/" + this.f35454c);
                return;
        }
    }
}
