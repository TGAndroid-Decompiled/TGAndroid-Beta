package org.telegram.ui.Components;

import android.os.Bundle;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ProfileActivity;
public final class b1 implements View.OnClickListener {
    public final int f32033a;
    public final TLRPC.User f32034b;
    public final org.telegram.ui.ActionBar.d2 f32035c;
    public final AlertDialog$Builder d;

    public b1(TLRPC.User user, org.telegram.ui.ActionBar.d2 d2Var, AlertDialog$Builder alertDialog$Builder, int i3) {
        this.f32033a = i3;
        this.f32034b = user;
        this.f32035c = d2Var;
        this.d = alertDialog$Builder;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32033a) {
            case 0:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", this.f32034b.f27150id);
                org.telegram.ui.ActionBar.d2 d2Var = this.f32035c;
                if (d2Var.getMessagesController().E(bundle, d2Var, null, null)) {
                    d2Var.presentFragment(new ProfileActivity(bundle, null));
                }
                this.d.f27343a.O0.run();
                return;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", this.f32034b.f27150id);
                org.telegram.ui.ActionBar.d2 d2Var2 = this.f32035c;
                if (d2Var2.getMessagesController().E(bundle2, d2Var2, null, null)) {
                    d2Var2.presentFragment(new ProfileActivity(bundle2, null));
                }
                this.d.f27343a.O0.run();
                return;
        }
    }
}
