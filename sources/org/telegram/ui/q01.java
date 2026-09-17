package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class q01 implements View.OnClickListener {
    public final int f36768a;
    public final b11 f36769b;

    public q01(b11 b11Var, int i10) {
        this.f36768a = i10;
        this.f36769b = b11Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36768a) {
            case 0:
                b11 b11Var = this.f36769b;
                ProfileActivity profileActivity = b11Var.e;
                TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f31282e1));
                MessagesController messagesController = profileActivity.getMessagesController();
                ProfileActivity profileActivity2 = b11Var.e;
                messagesController.openApp(profileActivity2, user, null, profileActivity2.getClassGuid(), null);
                return;
            default:
                ProfileActivity profileActivity3 = this.f36769b.e;
                profileActivity3.O4 = !profileActivity3.O4;
                if (!profileActivity3.N4) {
                    profileActivity3.N4 = true;
                }
                profileActivity3.F4();
                view.requestLayout();
                profileActivity3.d.m(profileActivity3.O3);
                int i10 = profileActivity3.U5;
                if (i10 >= 0) {
                    profileActivity3.f31266c.h1(i10, profileActivity3.V5 - profileActivity3.f31251a.getPaddingTop());
                    return;
                }
                return;
        }
    }
}
