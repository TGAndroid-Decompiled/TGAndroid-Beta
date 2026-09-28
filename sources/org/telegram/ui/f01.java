package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class f01 implements View.OnClickListener {
    public final int f33506a;
    public final q01 f33507b;

    public f01(q01 q01Var, int i10) {
        this.f33506a = i10;
        this.f33507b = q01Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f33506a) {
            case 0:
                q01 q01Var = this.f33507b;
                ProfileActivity profileActivity = q01Var.e;
                TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f31556e1));
                MessagesController messagesController = profileActivity.getMessagesController();
                ProfileActivity profileActivity2 = q01Var.e;
                messagesController.openApp(profileActivity2, user, null, profileActivity2.getClassGuid(), null);
                return;
            default:
                ProfileActivity profileActivity3 = this.f33507b.e;
                profileActivity3.O4 = !profileActivity3.O4;
                if (!profileActivity3.N4) {
                    profileActivity3.N4 = true;
                }
                profileActivity3.F4();
                view.requestLayout();
                profileActivity3.d.m(profileActivity3.O3);
                int i10 = profileActivity3.U5;
                if (i10 >= 0) {
                    profileActivity3.f31540c.h1(i10, profileActivity3.V5 - profileActivity3.f31525a.getPaddingTop());
                    return;
                }
                return;
        }
    }
}
