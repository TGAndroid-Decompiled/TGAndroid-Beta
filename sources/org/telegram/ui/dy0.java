package org.telegram.ui;

import android.app.Activity;
import android.view.View;
public final class dy0 implements View.OnClickListener {
    public final int f36747a;
    public final ProfileActivity f36748b;
    public final String f36749c;

    public dy0(ProfileActivity profileActivity, String str, int i10) {
        this.f36747a = i10;
        this.f36748b = profileActivity;
        this.f36749c = str;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36747a) {
            case 0:
                ProfileActivity profileActivity = this.f36748b;
                Activity parentActivity = profileActivity.getParentActivity();
                pf.d.r(parentActivity, "https://" + profileActivity.getMessagesController().linkPrefix + "/nft/" + this.f36749c);
                return;
            default:
                ProfileActivity profileActivity2 = this.f36748b;
                Activity parentActivity2 = profileActivity2.getParentActivity();
                pf.d.r(parentActivity2, "https://" + profileActivity2.getMessagesController().linkPrefix + "/nft/" + this.f36749c);
                return;
        }
    }
}
