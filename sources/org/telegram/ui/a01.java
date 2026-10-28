package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class a01 implements View.OnClickListener {
    public final int f37634a;
    public final l01 f37635b;

    public a01(l01 l01Var, int i10) {
        this.f37634a = i10;
        this.f37635b = l01Var;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f37634a;
        l01 l01Var = this.f37635b;
        switch (i10) {
            case 0:
                ProfileActivity profileActivity = l01Var.e;
                int i11 = ProfileActivity.R6;
                profileActivity.D4();
                return;
            case 1:
                ProfileActivity profileActivity2 = l01Var.e;
                TLRPC.User user = profileActivity2.getMessagesController().getUser(Long.valueOf(profileActivity2.f36003e1));
                MessagesController messagesController = profileActivity2.getMessagesController();
                ProfileActivity profileActivity3 = l01Var.e;
                messagesController.openApp(profileActivity3, user, null, profileActivity3.getClassGuid(), null);
                return;
            default:
                ProfileActivity profileActivity4 = l01Var.e;
                profileActivity4.U4 = !profileActivity4.U4;
                if (!profileActivity4.T4) {
                    profileActivity4.T4 = true;
                }
                profileActivity4.N4();
                view.requestLayout();
                profileActivity4.d.m(profileActivity4.O3);
                int i12 = profileActivity4.f35986b6;
                if (i12 >= 0) {
                    profileActivity4.f35987c.h1(i12, profileActivity4.f35994c6 - profileActivity4.f35972a.getPaddingTop());
                    return;
                }
                return;
        }
    }
}
