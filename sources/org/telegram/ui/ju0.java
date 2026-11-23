package org.telegram.ui;

import android.app.Activity;
import android.graphics.RectF;
import android.view.View;
public final class ju0 implements View.OnClickListener {
    public final int f49099a;
    public final ProfileActivity f49100b;
    public final String f49101c;

    public ju0(ProfileActivity profileActivity, String str, int i7) {
        this.f49099a = i7;
        this.f49100b = profileActivity;
        this.f49101c = str;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f49099a;
        String str = this.f49101c;
        ProfileActivity profileActivity = this.f49100b;
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
