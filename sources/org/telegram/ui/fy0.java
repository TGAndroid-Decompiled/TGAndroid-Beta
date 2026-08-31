package org.telegram.ui;

import android.app.Activity;
import android.view.View;
public final class fy0 implements View.OnClickListener {
    public final int f37036a;
    public final ProfileActivity f37037b;
    public final String f37038c;

    public fy0(ProfileActivity profileActivity, String str, int i10) {
        this.f37036a = i10;
        this.f37037b = profileActivity;
        this.f37038c = str;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37036a) {
            case 0:
                ProfileActivity profileActivity = this.f37037b;
                Activity parentActivity = profileActivity.getParentActivity();
                af.g.s(parentActivity, "https://" + profileActivity.getMessagesController().linkPrefix + "/nft/" + this.f37038c);
                return;
            default:
                ProfileActivity profileActivity2 = this.f37037b;
                Activity parentActivity2 = profileActivity2.getParentActivity();
                af.g.s(parentActivity2, "https://" + profileActivity2.getMessagesController().linkPrefix + "/nft/" + this.f37038c);
                return;
        }
    }
}
