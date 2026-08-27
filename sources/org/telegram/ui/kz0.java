package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

public final class kz0 implements View.OnClickListener {

    public final int f39906a;

    public final vz0 f39907b;

    public kz0(vz0 vz0Var, int i10) {
        this.f39906a = i10;
        this.f39907b = vz0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39906a) {
            case 0:
                vz0 vz0Var = this.f39907b;
                ProfileActivity profileActivity = vz0Var.f43554e;
                TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f35923a1));
                MessagesController messagesController = profileActivity.getMessagesController();
                ProfileActivity profileActivity2 = vz0Var.f43554e;
                messagesController.openApp(profileActivity2, user, null, profileActivity2.getClassGuid(), null);
                break;
            default:
                ProfileActivity profileActivity3 = this.f39907b.f43554e;
                profileActivity3.K4 = !profileActivity3.K4;
                if (!profileActivity3.J4) {
                    profileActivity3.J4 = true;
                }
                profileActivity3.F4();
                view.requestLayout();
                profileActivity3.d.m(profileActivity3.K3);
                int i10 = profileActivity3.Q5;
                if (i10 >= 0) {
                    profileActivity3.f35935c.h1(i10, profileActivity3.R5 - profileActivity3.f35921a.getPaddingTop());
                }
                break;
        }
    }
}
