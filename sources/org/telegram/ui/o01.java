package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class o01 implements View.OnClickListener {
    public final int f36162a;
    public final z01 f36163b;

    public o01(z01 z01Var, int i10) {
        this.f36162a = i10;
        this.f36163b = z01Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36162a) {
            case 0:
                z01 z01Var = this.f36163b;
                ProfileActivity profileActivity = z01Var.e;
                TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f31553e1));
                MessagesController messagesController = profileActivity.getMessagesController();
                ProfileActivity profileActivity2 = z01Var.e;
                messagesController.openApp(profileActivity2, user, null, profileActivity2.getClassGuid(), null);
                return;
            default:
                ProfileActivity profileActivity3 = this.f36163b.e;
                profileActivity3.O4 = !profileActivity3.O4;
                if (!profileActivity3.N4) {
                    profileActivity3.N4 = true;
                }
                profileActivity3.F4();
                view.requestLayout();
                profileActivity3.d.m(profileActivity3.O3);
                int i10 = profileActivity3.U5;
                if (i10 >= 0) {
                    profileActivity3.f31537c.h1(i10, profileActivity3.V5 - profileActivity3.f31522a.getPaddingTop());
                    return;
                }
                return;
        }
    }
}
