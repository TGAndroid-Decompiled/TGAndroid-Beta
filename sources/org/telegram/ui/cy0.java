package org.telegram.ui;

import android.app.Activity;
import android.view.View;
public final class cy0 implements View.OnClickListener {
    public final int f36006a;
    public final ProfileActivity f36007b;
    public final String f36008c;

    public cy0(ProfileActivity profileActivity, String str, int i10) {
        this.f36006a = i10;
        this.f36007b = profileActivity;
        this.f36008c = str;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36006a) {
            case 0:
                ProfileActivity profileActivity = this.f36007b;
                Activity parentActivity = profileActivity.getParentActivity();
                pf.d.r(parentActivity, "https://" + profileActivity.getMessagesController().linkPrefix + "/nft/" + this.f36008c);
                return;
            default:
                ProfileActivity profileActivity2 = this.f36007b;
                Activity parentActivity2 = profileActivity2.getParentActivity();
                pf.d.r(parentActivity2, "https://" + profileActivity2.getMessagesController().linkPrefix + "/nft/" + this.f36008c);
                return;
        }
    }
}
