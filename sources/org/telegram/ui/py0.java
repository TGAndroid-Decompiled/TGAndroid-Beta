package org.telegram.ui;

import android.app.Activity;
import android.view.View;
public final class py0 implements View.OnClickListener {
    public final int f36703a;
    public final ProfileActivity f36704b;
    public final String f36705c;

    public py0(ProfileActivity profileActivity, String str, int i10) {
        this.f36703a = i10;
        this.f36704b = profileActivity;
        this.f36705c = str;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36703a) {
            case 0:
                ProfileActivity profileActivity = this.f36704b;
                Activity parentActivity = profileActivity.getParentActivity();
                nf.f.s(parentActivity, "https://" + profileActivity.getMessagesController().linkPrefix + "/nft/" + this.f36705c);
                return;
            default:
                ProfileActivity profileActivity2 = this.f36704b;
                Activity parentActivity2 = profileActivity2.getParentActivity();
                nf.f.s(parentActivity2, "https://" + profileActivity2.getMessagesController().linkPrefix + "/nft/" + this.f36705c);
                return;
        }
    }
}
