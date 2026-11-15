package org.telegram.ui;

import android.app.Activity;
import android.graphics.RectF;
import android.view.View;
public final class gu0 implements View.OnClickListener {
    public final int f47525a;
    public final ProfileActivity f47526b;
    public final String f47527c;

    public gu0(ProfileActivity profileActivity, String str, int i7) {
        this.f47525a = i7;
        this.f47526b = profileActivity;
        this.f47527c = str;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f47525a;
        String str = this.f47527c;
        ProfileActivity profileActivity = this.f47526b;
        switch (i7) {
            case 0:
                RectF rectF = ProfileActivity.X6;
                Activity parentActivity = profileActivity.getParentActivity();
                vf.c.t(parentActivity, "https://" + profileActivity.getMessagesController().V2 + "/nft/" + str);
                return;
            default:
                RectF rectF2 = ProfileActivity.X6;
                Activity parentActivity2 = profileActivity.getParentActivity();
                vf.c.t(parentActivity2, "https://" + profileActivity.getMessagesController().V2 + "/nft/" + str);
                return;
        }
    }
}
