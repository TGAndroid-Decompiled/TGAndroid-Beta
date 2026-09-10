package org.telegram.ui.Components;

import android.os.Bundle;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ProfileActivity;
public final class w0 implements View.OnClickListener {
    public final int f28614a;
    public final TLRPC.User f28615b;
    public final org.telegram.ui.ActionBar.p2 f28616c;
    public final AlertDialog$Builder d;

    public w0(TLRPC.User user, org.telegram.ui.ActionBar.p2 p2Var, AlertDialog$Builder alertDialog$Builder, int i10) {
        this.f28614a = i10;
        this.f28615b = user;
        this.f28616c = p2Var;
        this.d = alertDialog$Builder;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28614a) {
            case 0:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", this.f28615b.f17342id);
                org.telegram.ui.ActionBar.p2 p2Var = this.f28616c;
                if (p2Var.getMessagesController().checkCanOpenChat(bundle, p2Var)) {
                    p2Var.presentFragment(new ProfileActivity(bundle, null));
                }
                this.d.f17528a.L0.run();
                return;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", this.f28615b.f17342id);
                org.telegram.ui.ActionBar.p2 p2Var2 = this.f28616c;
                if (p2Var2.getMessagesController().checkCanOpenChat(bundle2, p2Var2)) {
                    p2Var2.presentFragment(new ProfileActivity(bundle2, null));
                }
                this.d.f17528a.L0.run();
                return;
        }
    }
}
