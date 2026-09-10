package org.telegram.ui;

import android.app.Activity;
import android.view.View;
public final class az0 implements View.OnClickListener {
    public final int f31108a;
    public final ProfileActivity f31109b;
    public final String f31110c;

    public az0(ProfileActivity profileActivity, String str, int i10) {
        this.f31108a = i10;
        this.f31109b = profileActivity;
        this.f31110c = str;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f31108a) {
            case 0:
                ProfileActivity profileActivity = this.f31109b;
                Activity parentActivity = profileActivity.getParentActivity();
                nf.f.s(parentActivity, "https://" + profileActivity.getMessagesController().linkPrefix + "/nft/" + this.f31110c);
                return;
            default:
                ProfileActivity profileActivity2 = this.f31109b;
                Activity parentActivity2 = profileActivity2.getParentActivity();
                nf.f.s(parentActivity2, "https://" + profileActivity2.getMessagesController().linkPrefix + "/nft/" + this.f31110c);
                return;
        }
    }
}
