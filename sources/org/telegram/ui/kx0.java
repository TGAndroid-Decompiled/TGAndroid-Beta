package org.telegram.ui;

import android.view.View;
public final class kx0 implements View.OnClickListener {
    public final int f39014a;
    public final wx0 f39015b;

    public kx0(wx0 wx0Var, int i10) {
        this.f39014a = i10;
        this.f39015b = wx0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39014a) {
            case 0:
                ProfileActivity profileActivity = this.f39015b.e;
                profileActivity.getMessagesController().u3(profileActivity, profileActivity.getMessagesController().Z1(Long.valueOf(profileActivity.f33803d1)), null, profileActivity.getClassGuid(), null, false, false);
                return;
            default:
                ProfileActivity profileActivity2 = this.f39015b.e;
                profileActivity2.O4 = !profileActivity2.O4;
                if (!profileActivity2.N4) {
                    profileActivity2.N4 = true;
                }
                profileActivity2.T4();
                view.requestLayout();
                profileActivity2.d.g(profileActivity2.N3);
                int i10 = profileActivity2.f33858k6;
                if (i10 >= 0) {
                    profileActivity2.f33794c.h1(i10, profileActivity2.f33863l6 - profileActivity2.f33779a.getPaddingTop());
                    return;
                }
                return;
        }
    }
}
