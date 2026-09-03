package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class c01 implements View.OnClickListener {
    public final int f32972a;
    public final n01 f32973b;

    public c01(n01 n01Var, int i10) {
        this.f32972a = i10;
        this.f32973b = n01Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32972a) {
            case 0:
                n01 n01Var = this.f32973b;
                ProfileActivity profileActivity = n01Var.e;
                TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f32011b1));
                MessagesController messagesController = profileActivity.getMessagesController();
                ProfileActivity profileActivity2 = n01Var.e;
                messagesController.openApp(profileActivity2, user, null, profileActivity2.getClassGuid(), null);
                return;
            default:
                ProfileActivity profileActivity3 = this.f32973b.e;
                profileActivity3.L4 = !profileActivity3.L4;
                if (!profileActivity3.K4) {
                    profileActivity3.K4 = true;
                }
                profileActivity3.F4();
                view.requestLayout();
                profileActivity3.d.m(profileActivity3.L3);
                int i10 = profileActivity3.R5;
                if (i10 >= 0) {
                    profileActivity3.f32017c.h1(i10, profileActivity3.S5 - profileActivity3.f32002a.getPaddingTop());
                    return;
                }
                return;
        }
    }
}
