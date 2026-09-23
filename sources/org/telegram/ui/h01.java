package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class h01 implements View.OnClickListener {
    public final int f33698a;
    public final s01 f33699b;

    public h01(s01 s01Var, int i10) {
        this.f33698a = i10;
        this.f33699b = s01Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f33698a) {
            case 0:
                s01 s01Var = this.f33699b;
                ProfileActivity profileActivity = s01Var.e;
                TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f31240e1));
                MessagesController messagesController = profileActivity.getMessagesController();
                ProfileActivity profileActivity2 = s01Var.e;
                messagesController.openApp(profileActivity2, user, null, profileActivity2.getClassGuid(), null);
                return;
            default:
                ProfileActivity profileActivity3 = this.f33699b.e;
                profileActivity3.O4 = !profileActivity3.O4;
                if (!profileActivity3.N4) {
                    profileActivity3.N4 = true;
                }
                profileActivity3.F4();
                view.requestLayout();
                profileActivity3.d.m(profileActivity3.O3);
                int i10 = profileActivity3.U5;
                if (i10 >= 0) {
                    profileActivity3.f31224c.h1(i10, profileActivity3.V5 - profileActivity3.f31209a.getPaddingTop());
                    return;
                }
                return;
        }
    }
}
