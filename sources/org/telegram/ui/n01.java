package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class n01 implements View.OnClickListener {
    public final int f40090a;
    public final y01 f40091b;

    public n01(y01 y01Var, int i10) {
        this.f40090a = i10;
        this.f40091b = y01Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40090a) {
            case 0:
                y01 y01Var = this.f40091b;
                ProfileActivity profileActivity = y01Var.f44235e;
                TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f34281e1));
                MessagesController messagesController = profileActivity.getMessagesController();
                ProfileActivity profileActivity2 = y01Var.f44235e;
                messagesController.openApp(profileActivity2, user, null, profileActivity2.getClassGuid(), null);
                return;
            default:
                ProfileActivity profileActivity3 = this.f40091b.f44235e;
                profileActivity3.O4 = !profileActivity3.O4;
                if (!profileActivity3.N4) {
                    profileActivity3.N4 = true;
                }
                profileActivity3.F4();
                view.requestLayout();
                profileActivity3.d.m(profileActivity3.O3);
                int i10 = profileActivity3.U5;
                if (i10 >= 0) {
                    profileActivity3.f34264c.h1(i10, profileActivity3.V5 - profileActivity3.f34249a.getPaddingTop());
                    return;
                }
                return;
        }
    }
}
