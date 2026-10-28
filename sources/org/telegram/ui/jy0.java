package org.telegram.ui;

import android.app.Activity;
import android.view.View;
public final class jy0 implements View.OnClickListener {
    public final int f40627a;
    public final ProfileActivity f40628b;
    public final String f40629c;

    public jy0(ProfileActivity profileActivity, String str, int i10) {
        this.f40627a = i10;
        this.f40628b = profileActivity;
        this.f40629c = str;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f40627a;
        String str = this.f40629c;
        ProfileActivity profileActivity = this.f40628b;
        switch (i10) {
            case 0:
                int i11 = ProfileActivity.R6;
                Activity parentActivity = profileActivity.getParentActivity();
                qf.d.r(parentActivity, "https://" + profileActivity.getMessagesController().linkPrefix + "/nft/" + str);
                return;
            default:
                int i12 = ProfileActivity.R6;
                Activity parentActivity2 = profileActivity.getParentActivity();
                qf.d.r(parentActivity2, "https://" + profileActivity.getMessagesController().linkPrefix + "/nft/" + str);
                return;
        }
    }
}
