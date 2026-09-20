package org.telegram.ui.Components;

import android.os.Bundle;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ProfileActivity;
public final class u0 implements View.OnClickListener {
    public final int f28488a;
    public final TLRPC.User f28489b;
    public final org.telegram.ui.ActionBar.n2 f28490c;
    public final AlertDialog$Builder d;

    public u0(TLRPC.User user, org.telegram.ui.ActionBar.n2 n2Var, AlertDialog$Builder alertDialog$Builder, int i10) {
        this.f28488a = i10;
        this.f28489b = user;
        this.f28490c = n2Var;
        this.d = alertDialog$Builder;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28488a) {
            case 0:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", this.f28489b.f18475id);
                org.telegram.ui.ActionBar.n2 n2Var = this.f28490c;
                if (n2Var.getMessagesController().checkCanOpenChat(bundle, n2Var)) {
                    n2Var.presentFragment(new ProfileActivity(bundle, null));
                }
                this.d.f18654a.L0.run();
                return;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", this.f28489b.f18475id);
                org.telegram.ui.ActionBar.n2 n2Var2 = this.f28490c;
                if (n2Var2.getMessagesController().checkCanOpenChat(bundle2, n2Var2)) {
                    n2Var2.presentFragment(new ProfileActivity(bundle2, null));
                }
                this.d.f18654a.L0.run();
                return;
        }
    }
}
