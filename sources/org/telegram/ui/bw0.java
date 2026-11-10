package org.telegram.ui;

import android.view.View;
public final class bw0 implements View.OnClickListener {
    public final int f44150a;
    public final mw0 f44151b;

    public bw0(mw0 mw0Var, int i7) {
        this.f44150a = i7;
        this.f44151b = mw0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f44150a) {
            case 0:
                ProfileActivity profileActivity = this.f44151b.f48065e;
                profileActivity.getMessagesController().x3(profileActivity, profileActivity.getMessagesController().a2(Long.valueOf(profileActivity.f41714d1)), null, profileActivity.getClassGuid(), null, false, false);
                return;
            default:
                ProfileActivity profileActivity2 = this.f44151b.f48065e;
                profileActivity2.O4 = !profileActivity2.O4;
                if (!profileActivity2.N4) {
                    profileActivity2.N4 = true;
                }
                profileActivity2.W4();
                view.requestLayout();
                profileActivity2.d.g(profileActivity2.N3);
                int i7 = profileActivity2.f41787n6;
                if (i7 >= 0) {
                    profileActivity2.f41705c.h1(i7, profileActivity2.f41793o6 - profileActivity2.f41689a.getPaddingTop());
                    return;
                }
                return;
        }
    }
}
