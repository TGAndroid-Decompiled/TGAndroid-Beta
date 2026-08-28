package org.telegram.ui.Components;

import android.os.Bundle;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ProfileActivity;
public final class t0 implements View.OnClickListener {
    public final int f32581a;
    public final TLRPC.User f32582b;
    public final org.telegram.ui.ActionBar.o2 f32583c;
    public final AlertDialog$Builder d;

    public t0(TLRPC.User user, org.telegram.ui.ActionBar.o2 o2Var, AlertDialog$Builder alertDialog$Builder, int i9) {
        this.f32581a = i9;
        this.f32582b = user;
        this.f32583c = o2Var;
        this.d = alertDialog$Builder;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32581a) {
            case 0:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", this.f32582b.f22527id);
                org.telegram.ui.ActionBar.o2 o2Var = this.f32583c;
                if (o2Var.getMessagesController().checkCanOpenChat(bundle, o2Var)) {
                    o2Var.presentFragment(new ProfileActivity(bundle, null));
                }
                this.d.f22702a.H0.run();
                return;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", this.f32582b.f22527id);
                org.telegram.ui.ActionBar.o2 o2Var2 = this.f32583c;
                if (o2Var2.getMessagesController().checkCanOpenChat(bundle2, o2Var2)) {
                    o2Var2.presentFragment(new ProfileActivity(bundle2, null));
                }
                this.d.f22702a.H0.run();
                return;
        }
    }
}
