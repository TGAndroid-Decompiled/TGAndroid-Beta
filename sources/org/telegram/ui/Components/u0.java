package org.telegram.ui.Components;

import android.os.Bundle;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ProfileActivity;
public final class u0 implements View.OnClickListener {
    public final int f31454a;
    public final TLRPC.User f31455b;
    public final org.telegram.ui.ActionBar.p2 f31456c;
    public final AlertDialog$Builder d;

    public u0(TLRPC.User user, org.telegram.ui.ActionBar.p2 p2Var, AlertDialog$Builder alertDialog$Builder, int i10) {
        this.f31454a = i10;
        this.f31455b = user;
        this.f31456c = p2Var;
        this.d = alertDialog$Builder;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f31454a) {
            case 0:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", this.f31455b.f20992id);
                org.telegram.ui.ActionBar.p2 p2Var = this.f31456c;
                if (p2Var.getMessagesController().checkCanOpenChat(bundle, p2Var)) {
                    p2Var.presentFragment(new ProfileActivity(bundle, null));
                }
                this.d.f21168a.I0.run();
                return;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", this.f31455b.f20992id);
                org.telegram.ui.ActionBar.p2 p2Var2 = this.f31456c;
                if (p2Var2.getMessagesController().checkCanOpenChat(bundle2, p2Var2)) {
                    p2Var2.presentFragment(new ProfileActivity(bundle2, null));
                }
                this.d.f21168a.I0.run();
                return;
        }
    }
}
