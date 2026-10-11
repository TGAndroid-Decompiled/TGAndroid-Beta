package org.telegram.ui.Components;

import android.os.Bundle;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ProfileActivity;
public final class u0 implements View.OnClickListener {
    public final int f31193a;
    public final TLRPC.User f31194b;
    public final org.telegram.ui.ActionBar.m2 f31195c;
    public final AlertDialog$Builder d;

    public u0(TLRPC.User user, org.telegram.ui.ActionBar.m2 m2Var, AlertDialog$Builder alertDialog$Builder, int i10) {
        this.f31193a = i10;
        this.f31194b = user;
        this.f31195c = m2Var;
        this.d = alertDialog$Builder;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f31193a) {
            case 0:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", this.f31194b.f20179id);
                org.telegram.ui.ActionBar.m2 m2Var = this.f31195c;
                if (m2Var.getMessagesController().checkCanOpenChat(bundle, m2Var)) {
                    m2Var.presentFragment(new ProfileActivity(bundle, null));
                }
                this.d.f20368a.L0.run();
                return;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", this.f31194b.f20179id);
                org.telegram.ui.ActionBar.m2 m2Var2 = this.f31195c;
                if (m2Var2.getMessagesController().checkCanOpenChat(bundle2, m2Var2)) {
                    m2Var2.presentFragment(new ProfileActivity(bundle2, null));
                }
                this.d.f20368a.L0.run();
                return;
        }
    }
}
