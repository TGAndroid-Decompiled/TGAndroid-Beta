package org.telegram.ui;

import android.app.Activity;
import android.graphics.RectF;
import android.view.View;
public final class ju0 implements View.OnClickListener {
    public final int f49095a;
    public final ProfileActivity f49096b;
    public final String f49097c;

    public ju0(ProfileActivity profileActivity, String str, int i7) {
        this.f49095a = i7;
        this.f49096b = profileActivity;
        this.f49097c = str;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f49095a;
        String str = this.f49097c;
        ProfileActivity profileActivity = this.f49096b;
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
