package org.telegram.ui.Components;

import android.os.Bundle;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ProfileActivity;
public final class z0 implements View.OnClickListener {
    public final int f42199a;
    public final TLRPC.User f42200b;
    public final org.telegram.ui.ActionBar.e2 f42201c;
    public final AlertDialog$Builder d;

    public z0(TLRPC.User user, org.telegram.ui.ActionBar.e2 e2Var, AlertDialog$Builder alertDialog$Builder, int i7) {
        this.f42199a = i7;
        this.f42200b = user;
        this.f42201c = e2Var;
        this.d = alertDialog$Builder;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f42199a) {
            case 0:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", this.f42200b.f28200id);
                org.telegram.ui.ActionBar.e2 e2Var = this.f42201c;
                if (e2Var.getMessagesController().E(bundle, e2Var, null, null)) {
                    e2Var.presentFragment(new ProfileActivity(bundle, null));
                }
                this.d.f28392a.M0.run();
                return;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", this.f42200b.f28200id);
                org.telegram.ui.ActionBar.e2 e2Var2 = this.f42201c;
                if (e2Var2.getMessagesController().E(bundle2, e2Var2, null, null)) {
                    e2Var2.presentFragment(new ProfileActivity(bundle2, null));
                }
                this.d.f28392a.M0.run();
                return;
        }
    }
}
