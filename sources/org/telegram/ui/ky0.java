package org.telegram.ui;

import android.app.Activity;
import android.view.View;
public final class ky0 implements View.OnClickListener {
    public final int f38442a;
    public final ProfileActivity f38443b;
    public final String f38444c;

    public ky0(ProfileActivity profileActivity, String str, int i10) {
        this.f38442a = i10;
        this.f38443b = profileActivity;
        this.f38444c = str;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f38442a) {
            case 0:
                ProfileActivity profileActivity = this.f38443b;
                Activity parentActivity = profileActivity.getParentActivity();
                af.g.s(parentActivity, "https://" + profileActivity.getMessagesController().linkPrefix + "/nft/" + this.f38444c);
                return;
            default:
                ProfileActivity profileActivity2 = this.f38443b;
                Activity parentActivity2 = profileActivity2.getParentActivity();
                af.g.s(parentActivity2, "https://" + profileActivity2.getMessagesController().linkPrefix + "/nft/" + this.f38444c);
                return;
        }
    }
}
