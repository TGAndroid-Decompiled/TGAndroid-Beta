package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class n01 implements View.OnClickListener {
    public final int f40046a;
    public final y01 f40047b;

    public n01(y01 y01Var, int i10) {
        this.f40046a = i10;
        this.f40047b = y01Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40046a) {
            case 0:
                y01 y01Var = this.f40047b;
                ProfileActivity profileActivity = y01Var.f44191e;
                TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f34243e1));
                MessagesController messagesController = profileActivity.getMessagesController();
                ProfileActivity profileActivity2 = y01Var.f44191e;
                messagesController.openApp(profileActivity2, user, null, profileActivity2.getClassGuid(), null);
                return;
            default:
                ProfileActivity profileActivity3 = this.f40047b.f44191e;
                profileActivity3.O4 = !profileActivity3.O4;
                if (!profileActivity3.N4) {
                    profileActivity3.N4 = true;
                }
                profileActivity3.F4();
                view.requestLayout();
                profileActivity3.d.m(profileActivity3.O3);
                int i10 = profileActivity3.U5;
                if (i10 >= 0) {
                    profileActivity3.f34226c.h1(i10, profileActivity3.V5 - profileActivity3.f34211a.getPaddingTop());
                    return;
                }
                return;
        }
    }
}
