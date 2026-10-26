package org.telegram.ui;

import android.app.Activity;
import android.view.View;
public final class hy0 implements View.OnClickListener {
    public final int f40104a;
    public final ProfileActivity f40105b;
    public final String f40106c;

    public hy0(ProfileActivity profileActivity, String str, int i10) {
        this.f40104a = i10;
        this.f40105b = profileActivity;
        this.f40106c = str;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f40104a;
        String str = this.f40106c;
        ProfileActivity profileActivity = this.f40105b;
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
