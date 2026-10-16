package org.telegram.ui;

import android.app.Activity;
import android.view.View;
public final class dz0 implements View.OnClickListener {
    public final int f35156a;
    public final ProfileActivity f35157b;
    public final String f35158c;

    public dz0(ProfileActivity profileActivity, String str, int i10) {
        this.f35156a = i10;
        this.f35157b = profileActivity;
        this.f35158c = str;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35156a) {
            case 0:
                ProfileActivity profileActivity = this.f35157b;
                Activity parentActivity = profileActivity.getParentActivity();
                pf.d.r(parentActivity, "https://" + profileActivity.getMessagesController().linkPrefix + "/nft/" + this.f35158c);
                return;
            default:
                ProfileActivity profileActivity2 = this.f35157b;
                Activity parentActivity2 = profileActivity2.getParentActivity();
                pf.d.r(parentActivity2, "https://" + profileActivity2.getMessagesController().linkPrefix + "/nft/" + this.f35158c);
                return;
        }
    }
}
