package org.telegram.ui;

import android.app.Activity;
import android.view.View;
public final class py0 implements View.OnClickListener {
    public final int f36704a;
    public final ProfileActivity f36705b;
    public final String f36706c;

    public py0(ProfileActivity profileActivity, String str, int i10) {
        this.f36704a = i10;
        this.f36705b = profileActivity;
        this.f36706c = str;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36704a) {
            case 0:
                ProfileActivity profileActivity = this.f36705b;
                Activity parentActivity = profileActivity.getParentActivity();
                nf.f.s(parentActivity, "https://" + profileActivity.getMessagesController().linkPrefix + "/nft/" + this.f36706c);
                return;
            default:
                ProfileActivity profileActivity2 = this.f36705b;
                Activity parentActivity2 = profileActivity2.getParentActivity();
                nf.f.s(parentActivity2, "https://" + profileActivity2.getMessagesController().linkPrefix + "/nft/" + this.f36706c);
                return;
        }
    }
}
