package org.telegram.ui.Components;

import android.os.Bundle;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ProfileActivity;
public final class l1 implements View.OnClickListener {
    public final int f37067a;
    public final TLRPC.User f37068b;
    public final org.telegram.ui.ActionBar.g2 f37069c;
    public final AlertDialog$Builder d;

    public l1(TLRPC.User user, org.telegram.ui.ActionBar.g2 g2Var, AlertDialog$Builder alertDialog$Builder, int i7) {
        this.f37067a = i7;
        this.f37068b = user;
        this.f37069c = g2Var;
        this.d = alertDialog$Builder;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37067a) {
            case 0:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", this.f37068b.f28583id);
                org.telegram.ui.ActionBar.g2 g2Var = this.f37069c;
                if (g2Var.getMessagesController().E(bundle, g2Var, null, null)) {
                    g2Var.presentFragment(new ProfileActivity(bundle, null));
                }
                this.d.f28777a.M0.run();
                return;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", this.f37068b.f28583id);
                org.telegram.ui.ActionBar.g2 g2Var2 = this.f37069c;
                if (g2Var2.getMessagesController().E(bundle2, g2Var2, null, null)) {
                    g2Var2.presentFragment(new ProfileActivity(bundle2, null));
                }
                this.d.f28777a.M0.run();
                return;
        }
    }
}
