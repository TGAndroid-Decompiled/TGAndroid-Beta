package org.telegram.ui;

import android.app.Activity;
import android.graphics.RectF;
import android.view.View;
public final class ku0 implements View.OnClickListener {
    public final int f49360a;
    public final ProfileActivity f49361b;
    public final String f49362c;

    public ku0(ProfileActivity profileActivity, String str, int i7) {
        this.f49360a = i7;
        this.f49361b = profileActivity;
        this.f49362c = str;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f49360a;
        String str = this.f49362c;
        ProfileActivity profileActivity = this.f49361b;
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
