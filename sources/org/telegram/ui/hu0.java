package org.telegram.ui;

import android.app.Activity;
import android.graphics.RectF;
import android.view.View;
public final class hu0 implements View.OnClickListener {
    public final int f46489a;
    public final ProfileActivity f46490b;
    public final String f46491c;

    public hu0(ProfileActivity profileActivity, String str, int i7) {
        this.f46489a = i7;
        this.f46490b = profileActivity;
        this.f46491c = str;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f46489a;
        String str = this.f46491c;
        ProfileActivity profileActivity = this.f46490b;
        switch (i7) {
            case 0:
                RectF rectF = ProfileActivity.S6;
                Activity parentActivity = profileActivity.getParentActivity();
                vf.c.t(parentActivity, "https://" + profileActivity.getMessagesController().U2 + "/nft/" + str);
                return;
            default:
                RectF rectF2 = ProfileActivity.S6;
                Activity parentActivity2 = profileActivity.getParentActivity();
                vf.c.t(parentActivity2, "https://" + profileActivity.getMessagesController().U2 + "/nft/" + str);
                return;
        }
    }
}
