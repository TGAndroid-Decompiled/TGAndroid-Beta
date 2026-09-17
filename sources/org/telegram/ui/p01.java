package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class p01 implements View.OnClickListener {
    public final int f39378a;
    public final a11 f39379b;

    public p01(a11 a11Var, int i10) {
        this.f39378a = i10;
        this.f39379b = a11Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39378a) {
            case 0:
                a11 a11Var = this.f39379b;
                ProfileActivity profileActivity = a11Var.f34292e;
                TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f33889e1));
                MessagesController messagesController = profileActivity.getMessagesController();
                ProfileActivity profileActivity2 = a11Var.f34292e;
                messagesController.openApp(profileActivity2, user, null, profileActivity2.getClassGuid(), null);
                return;
            default:
                ProfileActivity profileActivity3 = this.f39379b.f34292e;
                profileActivity3.O4 = !profileActivity3.O4;
                if (!profileActivity3.N4) {
                    profileActivity3.N4 = true;
                }
                profileActivity3.F4();
                view.requestLayout();
                profileActivity3.d.m(profileActivity3.O3);
                int i10 = profileActivity3.U5;
                if (i10 >= 0) {
                    profileActivity3.f33872c.h1(i10, profileActivity3.V5 - profileActivity3.f33857a.getPaddingTop());
                    return;
                }
                return;
        }
    }
}
