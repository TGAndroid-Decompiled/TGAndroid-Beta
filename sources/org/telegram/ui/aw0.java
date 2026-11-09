package org.telegram.ui;

import android.view.View;
public final class aw0 implements View.OnClickListener {
    public final int f43800a;
    public final lw0 f43801b;

    public aw0(lw0 lw0Var, int i7) {
        this.f43800a = i7;
        this.f43801b = lw0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f43800a) {
            case 0:
                ProfileActivity profileActivity = this.f43801b.f47690e;
                profileActivity.getMessagesController().x3(profileActivity, profileActivity.getMessagesController().a2(Long.valueOf(profileActivity.f41723d1)), null, profileActivity.getClassGuid(), null, false, false);
                return;
            default:
                ProfileActivity profileActivity2 = this.f43801b.f47690e;
                profileActivity2.O4 = !profileActivity2.O4;
                if (!profileActivity2.N4) {
                    profileActivity2.N4 = true;
                }
                profileActivity2.W4();
                view.requestLayout();
                profileActivity2.d.g(profileActivity2.N3);
                int i7 = profileActivity2.f41796n6;
                if (i7 >= 0) {
                    profileActivity2.f41714c.h1(i7, profileActivity2.f41802o6 - profileActivity2.f41698a.getPaddingTop());
                    return;
                }
                return;
        }
    }
}
