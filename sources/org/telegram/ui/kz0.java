package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class kz0 implements View.OnClickListener {
    public final int f40045a;
    public final vz0 f40046b;

    public kz0(vz0 vz0Var, int i10) {
        this.f40045a = i10;
        this.f40046b = vz0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40045a) {
            case 0:
                vz0 vz0Var = this.f40046b;
                ProfileActivity profileActivity = vz0Var.f43803e;
                TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f35986a1));
                MessagesController messagesController = profileActivity.getMessagesController();
                ProfileActivity profileActivity2 = vz0Var.f43803e;
                messagesController.openApp(profileActivity2, user, null, profileActivity2.getClassGuid(), null);
                return;
            default:
                ProfileActivity profileActivity3 = this.f40046b.f43803e;
                profileActivity3.K4 = !profileActivity3.K4;
                if (!profileActivity3.J4) {
                    profileActivity3.J4 = true;
                }
                profileActivity3.F4();
                view.requestLayout();
                profileActivity3.d.m(profileActivity3.K3);
                int i10 = profileActivity3.Q5;
                if (i10 >= 0) {
                    profileActivity3.f35999c.h1(i10, profileActivity3.R5 - profileActivity3.f35984a.getPaddingTop());
                    return;
                }
                return;
        }
    }
}
