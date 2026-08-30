package org.telegram.ui;

import android.app.Activity;
import android.view.View;
public final class dy0 implements View.OnClickListener {
    public final int f33822a;
    public final ProfileActivity f33823b;
    public final String f33824c;

    public dy0(ProfileActivity profileActivity, String str, int i10) {
        this.f33822a = i10;
        this.f33823b = profileActivity;
        this.f33824c = str;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f33822a) {
            case 0:
                ProfileActivity profileActivity = this.f33823b;
                Activity parentActivity = profileActivity.getParentActivity();
                af.g.s(parentActivity, "https://" + profileActivity.getMessagesController().linkPrefix + "/nft/" + this.f33824c);
                return;
            default:
                ProfileActivity profileActivity2 = this.f33823b;
                Activity parentActivity2 = profileActivity2.getParentActivity();
                af.g.s(parentActivity2, "https://" + profileActivity2.getMessagesController().linkPrefix + "/nft/" + this.f33824c);
                return;
        }
    }
}
