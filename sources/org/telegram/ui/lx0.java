package org.telegram.ui;

import android.view.View;
public final class lx0 implements View.OnClickListener {
    public final int f39424a;
    public final xx0 f39425b;

    public lx0(xx0 xx0Var, int i10) {
        this.f39424a = i10;
        this.f39425b = xx0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39424a) {
            case 0:
                ProfileActivity profileActivity = this.f39425b.e;
                profileActivity.getMessagesController().u3(profileActivity, profileActivity.getMessagesController().Z1(Long.valueOf(profileActivity.f33796d1)), null, profileActivity.getClassGuid(), null, false, false);
                return;
            default:
                ProfileActivity profileActivity2 = this.f39425b.e;
                profileActivity2.O4 = !profileActivity2.O4;
                if (!profileActivity2.N4) {
                    profileActivity2.N4 = true;
                }
                profileActivity2.S4();
                view.requestLayout();
                profileActivity2.d.g(profileActivity2.N3);
                int i10 = profileActivity2.f33844j6;
                if (i10 >= 0) {
                    profileActivity2.f33787c.h1(i10, profileActivity2.f33851k6 - profileActivity2.f33772a.getPaddingTop());
                    return;
                }
                return;
        }
    }
}
