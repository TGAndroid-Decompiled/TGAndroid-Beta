package org.telegram.ui.Components;

import android.os.Bundle;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ProfileActivity;
public final class t0 implements View.OnClickListener {
    public final int f32799a;
    public final TLRPC.User f32800b;
    public final org.telegram.ui.ActionBar.r2 f32801c;
    public final AlertDialog$Builder d;

    public t0(TLRPC.User user, org.telegram.ui.ActionBar.r2 r2Var, AlertDialog$Builder alertDialog$Builder, int i10) {
        this.f32799a = i10;
        this.f32800b = user;
        this.f32801c = r2Var;
        this.d = alertDialog$Builder;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32799a) {
            case 0:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", this.f32800b.f22174id);
                org.telegram.ui.ActionBar.r2 r2Var = this.f32801c;
                if (r2Var.getMessagesController().checkCanOpenChat(bundle, r2Var)) {
                    r2Var.presentFragment(new ProfileActivity(bundle, null));
                }
                this.d.f22366a.N0.run();
                return;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", this.f32800b.f22174id);
                org.telegram.ui.ActionBar.r2 r2Var2 = this.f32801c;
                if (r2Var2.getMessagesController().checkCanOpenChat(bundle2, r2Var2)) {
                    r2Var2.presentFragment(new ProfileActivity(bundle2, null));
                }
                this.d.f22366a.N0.run();
                return;
        }
    }
}
