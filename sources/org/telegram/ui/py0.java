package org.telegram.ui;

import android.app.Activity;
import android.view.View;
public final class py0 implements View.OnClickListener {
    public final int f36689a;
    public final ProfileActivity f36690b;
    public final String f36691c;

    public py0(ProfileActivity profileActivity, String str, int i10) {
        this.f36689a = i10;
        this.f36690b = profileActivity;
        this.f36691c = str;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36689a) {
            case 0:
                ProfileActivity profileActivity = this.f36690b;
                Activity parentActivity = profileActivity.getParentActivity();
                nf.f.s(parentActivity, "https://" + profileActivity.getMessagesController().linkPrefix + "/nft/" + this.f36691c);
                return;
            default:
                ProfileActivity profileActivity2 = this.f36690b;
                Activity parentActivity2 = profileActivity2.getParentActivity();
                nf.f.s(parentActivity2, "https://" + profileActivity2.getMessagesController().linkPrefix + "/nft/" + this.f36691c);
                return;
        }
    }
}
