package org.telegram.ui.Components;

import android.os.Bundle;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ProfileActivity;
public final class c1 implements View.OnClickListener {
    public final int f32404a;
    public final TLRPC.User f32405b;
    public final org.telegram.ui.ActionBar.f2 f32406c;
    public final AlertDialog$Builder d;

    public c1(TLRPC.User user, org.telegram.ui.ActionBar.f2 f2Var, AlertDialog$Builder alertDialog$Builder, int i7) {
        this.f32404a = i7;
        this.f32405b = user;
        this.f32406c = f2Var;
        this.d = alertDialog$Builder;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32404a) {
            case 0:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", this.f32405b.f27105id);
                org.telegram.ui.ActionBar.f2 f2Var = this.f32406c;
                if (f2Var.getMessagesController().E(bundle, f2Var, null, null)) {
                    f2Var.presentFragment(new ProfileActivity(bundle, null));
                }
                this.d.f27296a.L0.run();
                return;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", this.f32405b.f27105id);
                org.telegram.ui.ActionBar.f2 f2Var2 = this.f32406c;
                if (f2Var2.getMessagesController().E(bundle2, f2Var2, null, null)) {
                    f2Var2.presentFragment(new ProfileActivity(bundle2, null));
                }
                this.d.f27296a.L0.run();
                return;
        }
    }
}
