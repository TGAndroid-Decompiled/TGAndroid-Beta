package org.telegram.ui.Components;

import android.os.Bundle;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ProfileActivity;

public final class t0 implements View.OnClickListener {

    public final int f32604a;

    public final TLRPC.User f32605b;

    public final org.telegram.ui.ActionBar.n2 f32606c;
    public final AlertDialog$Builder d;

    public t0(TLRPC.User user, org.telegram.ui.ActionBar.n2 n2Var, AlertDialog$Builder alertDialog$Builder, int i10) {
        this.f32604a = i10;
        this.f32605b = user;
        this.f32606c = n2Var;
        this.d = alertDialog$Builder;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32604a) {
            case 0:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", this.f32605b.f22527id);
                org.telegram.ui.ActionBar.n2 n2Var = this.f32606c;
                if (n2Var.getMessagesController().checkCanOpenChat(bundle, n2Var)) {
                    n2Var.presentFragment(new ProfileActivity(bundle, null));
                }
                this.d.f22702a.H0.run();
                break;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", this.f32605b.f22527id);
                org.telegram.ui.ActionBar.n2 n2Var2 = this.f32606c;
                if (n2Var2.getMessagesController().checkCanOpenChat(bundle2, n2Var2)) {
                    n2Var2.presentFragment(new ProfileActivity(bundle2, null));
                }
                this.d.f22702a.H0.run();
                break;
        }
    }
}
