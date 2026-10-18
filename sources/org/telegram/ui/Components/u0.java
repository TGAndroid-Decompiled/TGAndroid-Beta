package org.telegram.ui.Components;

import android.os.Bundle;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ProfileActivity;
public final class u0 implements View.OnClickListener {
    public final int f30845a;
    public final TLRPC.User f30846b;
    public final org.telegram.ui.ActionBar.n2 f30847c;
    public final AlertDialog$Builder d;

    public u0(TLRPC.User user, org.telegram.ui.ActionBar.n2 n2Var, AlertDialog$Builder alertDialog$Builder, int i10) {
        this.f30845a = i10;
        this.f30846b = user;
        this.f30847c = n2Var;
        this.d = alertDialog$Builder;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f30845a) {
            case 0:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", this.f30846b.f20419id);
                org.telegram.ui.ActionBar.n2 n2Var = this.f30847c;
                if (n2Var.getMessagesController().checkCanOpenChat(bundle, n2Var)) {
                    n2Var.presentFragment(new ProfileActivity(bundle, null));
                }
                this.d.f20601a.L0.run();
                return;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", this.f30846b.f20419id);
                org.telegram.ui.ActionBar.n2 n2Var2 = this.f30847c;
                if (n2Var2.getMessagesController().checkCanOpenChat(bundle2, n2Var2)) {
                    n2Var2.presentFragment(new ProfileActivity(bundle2, null));
                }
                this.d.f20601a.L0.run();
                return;
        }
    }
}
