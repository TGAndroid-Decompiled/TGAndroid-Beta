package org.telegram.ui.Components;

import android.os.Bundle;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ProfileActivity;
public final class t0 implements View.OnClickListener {
    public final int f30668a;
    public final TLRPC.User f30669b;
    public final org.telegram.ui.ActionBar.o2 f30670c;
    public final AlertDialog$Builder d;

    public t0(TLRPC.User user, org.telegram.ui.ActionBar.o2 o2Var, AlertDialog$Builder alertDialog$Builder, int i10) {
        this.f30668a = i10;
        this.f30669b = user;
        this.f30670c = o2Var;
        this.d = alertDialog$Builder;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f30668a) {
            case 0:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", this.f30669b.f20491id);
                org.telegram.ui.ActionBar.o2 o2Var = this.f30670c;
                if (o2Var.getMessagesController().checkCanOpenChat(bundle, o2Var)) {
                    o2Var.presentFragment(new ProfileActivity(bundle, null));
                }
                this.d.f20679a.N0.run();
                return;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", this.f30669b.f20491id);
                org.telegram.ui.ActionBar.o2 o2Var2 = this.f30670c;
                if (o2Var2.getMessagesController().checkCanOpenChat(bundle2, o2Var2)) {
                    o2Var2.presentFragment(new ProfileActivity(bundle2, null));
                }
                this.d.f20679a.N0.run();
                return;
        }
    }
}
