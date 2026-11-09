package org.telegram.ui;

import android.app.Activity;
import android.graphics.RectF;
import android.view.View;
public final class ku0 implements View.OnClickListener {
    public final int f47371a;
    public final ProfileActivity f47372b;
    public final String f47373c;

    public ku0(ProfileActivity profileActivity, String str, int i7) {
        this.f47371a = i7;
        this.f47372b = profileActivity;
        this.f47373c = str;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f47371a;
        String str = this.f47373c;
        ProfileActivity profileActivity = this.f47372b;
        switch (i7) {
            case 0:
                RectF rectF = ProfileActivity.V6;
                Activity parentActivity = profileActivity.getParentActivity();
                vf.c.t(parentActivity, "https://" + profileActivity.getMessagesController().U2 + "/nft/" + str);
                return;
            default:
                RectF rectF2 = ProfileActivity.V6;
                Activity parentActivity2 = profileActivity.getParentActivity();
                vf.c.t(parentActivity2, "https://" + profileActivity.getMessagesController().U2 + "/nft/" + str);
                return;
        }
    }
}
