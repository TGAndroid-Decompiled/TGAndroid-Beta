package org.telegram.ui;

import android.app.Activity;
import android.view.View;
public final class ey0 implements View.OnClickListener {
    public final int f37171a;
    public final ProfileActivity f37172b;
    public final String f37173c;

    public ey0(ProfileActivity profileActivity, String str, int i10) {
        this.f37171a = i10;
        this.f37172b = profileActivity;
        this.f37173c = str;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37171a) {
            case 0:
                ProfileActivity profileActivity = this.f37172b;
                Activity parentActivity = profileActivity.getParentActivity();
                pf.d.r(parentActivity, "https://" + profileActivity.getMessagesController().linkPrefix + "/nft/" + this.f37173c);
                return;
            default:
                ProfileActivity profileActivity2 = this.f37172b;
                Activity parentActivity2 = profileActivity2.getParentActivity();
                pf.d.r(parentActivity2, "https://" + profileActivity2.getMessagesController().linkPrefix + "/nft/" + this.f37173c);
                return;
        }
    }
}
