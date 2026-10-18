package org.telegram.ui;

import android.app.Activity;
import android.view.View;
public final class cy0 implements View.OnClickListener {
    public final int f35999a;
    public final ProfileActivity f36000b;
    public final String f36001c;

    public cy0(ProfileActivity profileActivity, String str, int i10) {
        this.f35999a = i10;
        this.f36000b = profileActivity;
        this.f36001c = str;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35999a) {
            case 0:
                ProfileActivity profileActivity = this.f36000b;
                Activity parentActivity = profileActivity.getParentActivity();
                pf.d.r(parentActivity, "https://" + profileActivity.getMessagesController().linkPrefix + "/nft/" + this.f36001c);
                return;
            default:
                ProfileActivity profileActivity2 = this.f36000b;
                Activity parentActivity2 = profileActivity2.getParentActivity();
                pf.d.r(parentActivity2, "https://" + profileActivity2.getMessagesController().linkPrefix + "/nft/" + this.f36001c);
                return;
        }
    }
}
