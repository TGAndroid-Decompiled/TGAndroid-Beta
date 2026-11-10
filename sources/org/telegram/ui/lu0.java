package org.telegram.ui;

import android.app.Activity;
import android.graphics.RectF;
import android.view.View;
public final class lu0 implements View.OnClickListener {
    public final int f47695a;
    public final ProfileActivity f47696b;
    public final String f47697c;

    public lu0(ProfileActivity profileActivity, String str, int i7) {
        this.f47695a = i7;
        this.f47696b = profileActivity;
        this.f47697c = str;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f47695a;
        String str = this.f47697c;
        ProfileActivity profileActivity = this.f47696b;
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
