package org.telegram.ui.Components;

import android.os.Bundle;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ProfileActivity;
public final class v0 implements View.OnClickListener {
    public final int f31053a;
    public final TLRPC.User f31054b;
    public final org.telegram.ui.ActionBar.n2 f31055c;
    public final AlertDialog$Builder d;

    public v0(TLRPC.User user, org.telegram.ui.ActionBar.n2 n2Var, AlertDialog$Builder alertDialog$Builder, int i10) {
        this.f31053a = i10;
        this.f31054b = user;
        this.f31055c = n2Var;
        this.d = alertDialog$Builder;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f31053a) {
            case 0:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", this.f31054b.f20043id);
                org.telegram.ui.ActionBar.n2 n2Var = this.f31055c;
                if (n2Var.getMessagesController().checkCanOpenChat(bundle, n2Var)) {
                    n2Var.presentFragment(new ProfileActivity(bundle, null));
                }
                this.d.f20225a.L0.run();
                return;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", this.f31054b.f20043id);
                org.telegram.ui.ActionBar.n2 n2Var2 = this.f31055c;
                if (n2Var2.getMessagesController().checkCanOpenChat(bundle2, n2Var2)) {
                    n2Var2.presentFragment(new ProfileActivity(bundle2, null));
                }
                this.d.f20225a.L0.run();
                return;
        }
    }
}
