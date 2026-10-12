package org.telegram.ui.Components;

import android.os.Bundle;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ProfileActivity;
public final class u0 implements View.OnClickListener {
    public final int f31010a;
    public final TLRPC.User f31011b;
    public final org.telegram.ui.ActionBar.m2 f31012c;
    public final AlertDialog$Builder d;

    public u0(TLRPC.User user, org.telegram.ui.ActionBar.m2 m2Var, AlertDialog$Builder alertDialog$Builder, int i10) {
        this.f31010a = i10;
        this.f31011b = user;
        this.f31012c = m2Var;
        this.d = alertDialog$Builder;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f31010a) {
            case 0:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", this.f31011b.f19949id);
                org.telegram.ui.ActionBar.m2 m2Var = this.f31012c;
                if (m2Var.getMessagesController().checkCanOpenChat(bundle, m2Var)) {
                    m2Var.presentFragment(new ProfileActivity(bundle, null));
                }
                this.d.f20141a.L0.run();
                return;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", this.f31011b.f19949id);
                org.telegram.ui.ActionBar.m2 m2Var2 = this.f31012c;
                if (m2Var2.getMessagesController().checkCanOpenChat(bundle2, m2Var2)) {
                    m2Var2.presentFragment(new ProfileActivity(bundle2, null));
                }
                this.d.f20141a.L0.run();
                return;
        }
    }
}
