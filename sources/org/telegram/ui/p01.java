package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class p01 implements View.OnClickListener {
    public final int f39377a;
    public final a11 f39378b;

    public p01(a11 a11Var, int i10) {
        this.f39377a = i10;
        this.f39378b = a11Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39377a) {
            case 0:
                a11 a11Var = this.f39378b;
                ProfileActivity profileActivity = a11Var.f34291e;
                TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f33888e1));
                MessagesController messagesController = profileActivity.getMessagesController();
                ProfileActivity profileActivity2 = a11Var.f34291e;
                messagesController.openApp(profileActivity2, user, null, profileActivity2.getClassGuid(), null);
                return;
            default:
                ProfileActivity profileActivity3 = this.f39378b.f34291e;
                profileActivity3.O4 = !profileActivity3.O4;
                if (!profileActivity3.N4) {
                    profileActivity3.N4 = true;
                }
                profileActivity3.F4();
                view.requestLayout();
                profileActivity3.d.m(profileActivity3.O3);
                int i10 = profileActivity3.U5;
                if (i10 >= 0) {
                    profileActivity3.f33871c.h1(i10, profileActivity3.V5 - profileActivity3.f33856a.getPaddingTop());
                    return;
                }
                return;
        }
    }
}
