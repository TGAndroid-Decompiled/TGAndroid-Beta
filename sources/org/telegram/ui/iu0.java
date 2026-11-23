package org.telegram.ui;

import android.app.Activity;
import android.graphics.RectF;
import android.view.View;
public final class iu0 implements View.OnClickListener {
    public final int f48922a;
    public final ProfileActivity f48923b;
    public final String f48924c;

    public iu0(ProfileActivity profileActivity, String str, int i7) {
        this.f48922a = i7;
        this.f48923b = profileActivity;
        this.f48924c = str;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f48922a;
        String str = this.f48924c;
        ProfileActivity profileActivity = this.f48923b;
        switch (i7) {
            case 0:
                RectF rectF = ProfileActivity.Z6;
                Activity parentActivity = profileActivity.getParentActivity();
                vf.c.t(parentActivity, "https://" + profileActivity.getMessagesController().X2 + "/nft/" + str);
                return;
            default:
                RectF rectF2 = ProfileActivity.Z6;
                Activity parentActivity2 = profileActivity.getParentActivity();
                vf.c.t(parentActivity2, "https://" + profileActivity.getMessagesController().X2 + "/nft/" + str);
                return;
        }
    }
}
