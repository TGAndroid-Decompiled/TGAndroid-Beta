package org.telegram.ui.Components;

import android.os.Bundle;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ProfileActivity;
public final class c1 implements View.OnClickListener {
    public final int f24929a;
    public final TLRPC.User f24930b;
    public final org.telegram.ui.ActionBar.k2 f24931c;
    public final AlertDialog$Builder d;

    public c1(TLRPC.User user, org.telegram.ui.ActionBar.k2 k2Var, AlertDialog$Builder alertDialog$Builder, int i10) {
        this.f24929a = i10;
        this.f24930b = user;
        this.f24931c = k2Var;
        this.d = alertDialog$Builder;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f24929a) {
            case 0:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", this.f24930b.f19942id);
                org.telegram.ui.ActionBar.k2 k2Var = this.f24931c;
                if (k2Var.getMessagesController().E(bundle, k2Var, null, null)) {
                    k2Var.presentFragment(new ProfileActivity(bundle, null));
                }
                this.d.f20134a.N0.run();
                return;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", this.f24930b.f19942id);
                org.telegram.ui.ActionBar.k2 k2Var2 = this.f24931c;
                if (k2Var2.getMessagesController().E(bundle2, k2Var2, null, null)) {
                    k2Var2.presentFragment(new ProfileActivity(bundle2, null));
                }
                this.d.f20134a.N0.run();
                return;
        }
    }
}
