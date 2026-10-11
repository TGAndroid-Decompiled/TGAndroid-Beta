package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class m01 implements View.OnClickListener {
    public final int f39787a;
    public final x01 f39788b;

    public m01(x01 x01Var, int i10) {
        this.f39787a = i10;
        this.f39788b = x01Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39787a) {
            case 0:
                x01 x01Var = this.f39788b;
                ProfileActivity profileActivity = x01Var.f43916e;
                TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f34271e1));
                MessagesController messagesController = profileActivity.getMessagesController();
                ProfileActivity profileActivity2 = x01Var.f43916e;
                messagesController.openApp(profileActivity2, user, null, profileActivity2.getClassGuid(), null);
                return;
            default:
                ProfileActivity profileActivity3 = this.f39788b.f43916e;
                profileActivity3.O4 = !profileActivity3.O4;
                if (!profileActivity3.N4) {
                    profileActivity3.N4 = true;
                }
                profileActivity3.F4();
                view.requestLayout();
                profileActivity3.d.m(profileActivity3.O3);
                int i10 = profileActivity3.U5;
                if (i10 >= 0) {
                    profileActivity3.f34254c.h1(i10, profileActivity3.V5 - profileActivity3.f34239a.getPaddingTop());
                    return;
                }
                return;
        }
    }
}
