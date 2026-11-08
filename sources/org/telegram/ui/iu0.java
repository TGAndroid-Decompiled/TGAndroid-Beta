package org.telegram.ui;

import android.app.Activity;
import android.graphics.RectF;
import android.view.View;
public final class iu0 implements View.OnClickListener {
    public final int f46747a;
    public final ProfileActivity f46748b;
    public final String f46749c;

    public iu0(ProfileActivity profileActivity, String str, int i7) {
        this.f46747a = i7;
        this.f46748b = profileActivity;
        this.f46749c = str;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f46747a;
        String str = this.f46749c;
        ProfileActivity profileActivity = this.f46748b;
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
