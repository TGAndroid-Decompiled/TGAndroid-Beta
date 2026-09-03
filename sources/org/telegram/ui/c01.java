package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class c01 implements View.OnClickListener {
    public final int f35648a;
    public final n01 f35649b;

    public c01(n01 n01Var, int i10) {
        this.f35648a = i10;
        this.f35649b = n01Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35648a) {
            case 0:
                n01 n01Var = this.f35649b;
                ProfileActivity profileActivity = n01Var.f39152e;
                TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f34569b1));
                MessagesController messagesController = profileActivity.getMessagesController();
                ProfileActivity profileActivity2 = n01Var.f39152e;
                messagesController.openApp(profileActivity2, user, null, profileActivity2.getClassGuid(), null);
                return;
            default:
                ProfileActivity profileActivity3 = this.f35649b.f39152e;
                profileActivity3.L4 = !profileActivity3.L4;
                if (!profileActivity3.K4) {
                    profileActivity3.K4 = true;
                }
                profileActivity3.F4();
                view.requestLayout();
                profileActivity3.d.m(profileActivity3.L3);
                int i10 = profileActivity3.R5;
                if (i10 >= 0) {
                    profileActivity3.f34575c.h1(i10, profileActivity3.S5 - profileActivity3.f34560a.getPaddingTop());
                    return;
                }
                return;
        }
    }
}
