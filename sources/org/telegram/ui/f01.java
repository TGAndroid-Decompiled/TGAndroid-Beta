package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class f01 implements View.OnClickListener {
    public final int f33590a;
    public final q01 f33591b;

    public f01(q01 q01Var, int i10) {
        this.f33590a = i10;
        this.f33591b = q01Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f33590a) {
            case 0:
                q01 q01Var = this.f33591b;
                ProfileActivity profileActivity = q01Var.e;
                TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f31629e1));
                MessagesController messagesController = profileActivity.getMessagesController();
                ProfileActivity profileActivity2 = q01Var.e;
                messagesController.openApp(profileActivity2, user, null, profileActivity2.getClassGuid(), null);
                return;
            default:
                ProfileActivity profileActivity3 = this.f33591b.e;
                profileActivity3.O4 = !profileActivity3.O4;
                if (!profileActivity3.N4) {
                    profileActivity3.N4 = true;
                }
                profileActivity3.F4();
                view.requestLayout();
                profileActivity3.d.m(profileActivity3.O3);
                int i10 = profileActivity3.U5;
                if (i10 >= 0) {
                    profileActivity3.f31613c.h1(i10, profileActivity3.V5 - profileActivity3.f31598a.getPaddingTop());
                    return;
                }
                return;
        }
    }
}
