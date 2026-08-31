package org.telegram.ui.Components;

import android.os.Bundle;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ProfileActivity;
public final class u0 implements View.OnClickListener {
    public final int f31498a;
    public final TLRPC.User f31499b;
    public final org.telegram.ui.ActionBar.p2 f31500c;
    public final AlertDialog$Builder d;

    public u0(TLRPC.User user, org.telegram.ui.ActionBar.p2 p2Var, AlertDialog$Builder alertDialog$Builder, int i10) {
        this.f31498a = i10;
        this.f31499b = user;
        this.f31500c = p2Var;
        this.d = alertDialog$Builder;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f31498a) {
            case 0:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", this.f31499b.f20990id);
                org.telegram.ui.ActionBar.p2 p2Var = this.f31500c;
                if (p2Var.getMessagesController().checkCanOpenChat(bundle, p2Var)) {
                    p2Var.presentFragment(new ProfileActivity(bundle, null));
                }
                this.d.f21166a.I0.run();
                return;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", this.f31499b.f20990id);
                org.telegram.ui.ActionBar.p2 p2Var2 = this.f31500c;
                if (p2Var2.getMessagesController().checkCanOpenChat(bundle2, p2Var2)) {
                    p2Var2.presentFragment(new ProfileActivity(bundle2, null));
                }
                this.d.f21166a.I0.run();
                return;
        }
    }
}
