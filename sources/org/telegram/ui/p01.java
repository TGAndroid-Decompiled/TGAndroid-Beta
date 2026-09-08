package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class p01 implements View.OnClickListener {
    public final int f39404a;
    public final a11 f39405b;

    public p01(a11 a11Var, int i10) {
        this.f39404a = i10;
        this.f39405b = a11Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39404a) {
            case 0:
                a11 a11Var = this.f39405b;
                ProfileActivity profileActivity = a11Var.f34318e;
                TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f33915e1));
                MessagesController messagesController = profileActivity.getMessagesController();
                ProfileActivity profileActivity2 = a11Var.f34318e;
                messagesController.openApp(profileActivity2, user, null, profileActivity2.getClassGuid(), null);
                return;
            default:
                ProfileActivity profileActivity3 = this.f39405b.f34318e;
                profileActivity3.O4 = !profileActivity3.O4;
                if (!profileActivity3.N4) {
                    profileActivity3.N4 = true;
                }
                profileActivity3.F4();
                view.requestLayout();
                profileActivity3.d.m(profileActivity3.O3);
                int i10 = profileActivity3.U5;
                if (i10 >= 0) {
                    profileActivity3.f33898c.h1(i10, profileActivity3.V5 - profileActivity3.f33883a.getPaddingTop());
                    return;
                }
                return;
        }
    }
}
