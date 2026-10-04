package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class h01 implements View.OnClickListener {
    public final int f36816a;
    public final s01 f36817b;

    public h01(s01 s01Var, int i10) {
        this.f36816a = i10;
        this.f36817b = s01Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36816a) {
            case 0:
                s01 s01Var = this.f36817b;
                ProfileActivity profileActivity = s01Var.f40317e;
                TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f34233e1));
                MessagesController messagesController = profileActivity.getMessagesController();
                ProfileActivity profileActivity2 = s01Var.f40317e;
                messagesController.openApp(profileActivity2, user, null, profileActivity2.getClassGuid(), null);
                return;
            default:
                ProfileActivity profileActivity3 = this.f36817b.f40317e;
                profileActivity3.O4 = !profileActivity3.O4;
                if (!profileActivity3.N4) {
                    profileActivity3.N4 = true;
                }
                profileActivity3.F4();
                view.requestLayout();
                profileActivity3.d.m(profileActivity3.O3);
                int i10 = profileActivity3.U5;
                if (i10 >= 0) {
                    profileActivity3.f34216c.h1(i10, profileActivity3.V5 - profileActivity3.f34201a.getPaddingTop());
                    return;
                }
                return;
        }
    }
}
