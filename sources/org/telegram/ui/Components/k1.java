package org.telegram.ui.Components;

import android.os.Bundle;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ProfileActivity;
public final class k1 implements View.OnClickListener {
    public final int f36597a;
    public final TLRPC.User f36598b;
    public final org.telegram.ui.ActionBar.g2 f36599c;
    public final AlertDialog$Builder d;

    public k1(TLRPC.User user, org.telegram.ui.ActionBar.g2 g2Var, AlertDialog$Builder alertDialog$Builder, int i7) {
        this.f36597a = i7;
        this.f36598b = user;
        this.f36599c = g2Var;
        this.d = alertDialog$Builder;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36597a) {
            case 0:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", this.f36598b.f28641id);
                org.telegram.ui.ActionBar.g2 g2Var = this.f36599c;
                if (g2Var.getMessagesController().E(bundle, g2Var, null, null)) {
                    g2Var.presentFragment(new ProfileActivity(bundle, null));
                }
                this.d.f28835a.M0.run();
                return;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", this.f36598b.f28641id);
                org.telegram.ui.ActionBar.g2 g2Var2 = this.f36599c;
                if (g2Var2.getMessagesController().E(bundle2, g2Var2, null, null)) {
                    g2Var2.presentFragment(new ProfileActivity(bundle2, null));
                }
                this.d.f28835a.M0.run();
                return;
        }
    }
}
