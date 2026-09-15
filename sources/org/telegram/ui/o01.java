package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class o01 implements View.OnClickListener {
    public final int f36079a;
    public final z01 f36080b;

    public o01(z01 z01Var, int i10) {
        this.f36079a = i10;
        this.f36080b = z01Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36079a) {
            case 0:
                z01 z01Var = this.f36080b;
                ProfileActivity profileActivity = z01Var.e;
                TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f31269e1));
                MessagesController messagesController = profileActivity.getMessagesController();
                ProfileActivity profileActivity2 = z01Var.e;
                messagesController.openApp(profileActivity2, user, null, profileActivity2.getClassGuid(), null);
                return;
            default:
                ProfileActivity profileActivity3 = this.f36080b.e;
                profileActivity3.O4 = !profileActivity3.O4;
                if (!profileActivity3.N4) {
                    profileActivity3.N4 = true;
                }
                profileActivity3.F4();
                view.requestLayout();
                profileActivity3.d.m(profileActivity3.O3);
                int i10 = profileActivity3.U5;
                if (i10 >= 0) {
                    profileActivity3.f31253c.h1(i10, profileActivity3.V5 - profileActivity3.f31238a.getPaddingTop());
                    return;
                }
                return;
        }
    }
}
