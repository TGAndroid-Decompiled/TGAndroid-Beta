package org.telegram.ui;

import android.view.View;
public final class pv0 implements View.OnClickListener {
    public final int f48674a;
    public final bw0 f48675b;

    public pv0(bw0 bw0Var, int i3) {
        this.f48674a = i3;
        this.f48675b = bw0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f48674a) {
            case 0:
                ProfileActivity profileActivity = this.f48675b.f44157e;
                profileActivity.getMessagesController().x3(profileActivity, profileActivity.getMessagesController().a2(Long.valueOf(profileActivity.f41751e1)), null, profileActivity.getClassGuid(), null, false, false);
                return;
            default:
                ProfileActivity profileActivity2 = this.f48675b.f44157e;
                profileActivity2.P4 = !profileActivity2.P4;
                if (!profileActivity2.O4) {
                    profileActivity2.O4 = true;
                }
                profileActivity2.T4();
                view.requestLayout();
                profileActivity2.d.g(profileActivity2.O3);
                int i3 = profileActivity2.f41804l6;
                if (i3 >= 0) {
                    profileActivity2.f41735c.h1(i3, profileActivity2.f41809m6 - profileActivity2.f41719a.getPaddingTop());
                    return;
                }
                return;
        }
    }
}
