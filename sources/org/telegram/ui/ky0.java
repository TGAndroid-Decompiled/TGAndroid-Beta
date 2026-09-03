package org.telegram.ui;

import android.app.Activity;
import android.view.View;
public final class ky0 implements View.OnClickListener {
    public final int f35603a;
    public final ProfileActivity f35604b;
    public final String f35605c;

    public ky0(ProfileActivity profileActivity, String str, int i10) {
        this.f35603a = i10;
        this.f35604b = profileActivity;
        this.f35605c = str;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35603a) {
            case 0:
                ProfileActivity profileActivity = this.f35604b;
                Activity parentActivity = profileActivity.getParentActivity();
                ze.d.s(parentActivity, "https://" + profileActivity.getMessagesController().linkPrefix + "/nft/" + this.f35605c);
                return;
            default:
                ProfileActivity profileActivity2 = this.f35604b;
                Activity parentActivity2 = profileActivity2.getParentActivity();
                ze.d.s(parentActivity2, "https://" + profileActivity2.getMessagesController().linkPrefix + "/nft/" + this.f35605c);
                return;
        }
    }
}
