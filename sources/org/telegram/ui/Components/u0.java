package org.telegram.ui.Components;

import android.os.Bundle;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ProfileActivity;
public final class u0 implements View.OnClickListener {
    public final int f28662a;
    public final TLRPC.User f28663b;
    public final org.telegram.ui.ActionBar.m2 f28664c;
    public final AlertDialog$Builder d;

    public u0(TLRPC.User user, org.telegram.ui.ActionBar.m2 m2Var, AlertDialog$Builder alertDialog$Builder, int i10) {
        this.f28662a = i10;
        this.f28663b = user;
        this.f28664c = m2Var;
        this.d = alertDialog$Builder;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28662a) {
            case 0:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", this.f28663b.f18484id);
                org.telegram.ui.ActionBar.m2 m2Var = this.f28664c;
                if (m2Var.getMessagesController().checkCanOpenChat(bundle, m2Var)) {
                    m2Var.presentFragment(new ProfileActivity(bundle, null));
                }
                this.d.f18663a.L0.run();
                return;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", this.f28663b.f18484id);
                org.telegram.ui.ActionBar.m2 m2Var2 = this.f28664c;
                if (m2Var2.getMessagesController().checkCanOpenChat(bundle2, m2Var2)) {
                    m2Var2.presentFragment(new ProfileActivity(bundle2, null));
                }
                this.d.f18663a.L0.run();
                return;
        }
    }
}
