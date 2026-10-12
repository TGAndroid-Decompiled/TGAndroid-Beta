package org.telegram.ui;

import android.app.Activity;
import android.view.View;
public final class dz0 implements View.OnClickListener {
    public final int f35407a;
    public final ProfileActivity f35408b;
    public final String f35409c;

    public dz0(ProfileActivity profileActivity, String str, int i10) {
        this.f35407a = i10;
        this.f35408b = profileActivity;
        this.f35409c = str;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35407a) {
            case 0:
                ProfileActivity profileActivity = this.f35408b;
                Activity parentActivity = profileActivity.getParentActivity();
                pf.d.s(parentActivity, "https://" + profileActivity.getMessagesController().linkPrefix + "/nft/" + this.f35409c);
                return;
            default:
                ProfileActivity profileActivity2 = this.f35408b;
                Activity parentActivity2 = profileActivity2.getParentActivity();
                pf.d.s(parentActivity2, "https://" + profileActivity2.getMessagesController().linkPrefix + "/nft/" + this.f35409c);
                return;
        }
    }
}
