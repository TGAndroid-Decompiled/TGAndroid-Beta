package org.telegram.ui.Components;

import android.os.Bundle;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ProfileActivity;
public final class u0 implements View.OnClickListener {
    public final int f28723a;
    public final TLRPC.User f28724b;
    public final org.telegram.ui.ActionBar.o2 f28725c;
    public final AlertDialog$Builder d;

    public u0(TLRPC.User user, org.telegram.ui.ActionBar.o2 o2Var, AlertDialog$Builder alertDialog$Builder, int i10) {
        this.f28723a = i10;
        this.f28724b = user;
        this.f28725c = o2Var;
        this.d = alertDialog$Builder;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28723a) {
            case 0:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", this.f28724b.f18476id);
                org.telegram.ui.ActionBar.o2 o2Var = this.f28725c;
                if (o2Var.getMessagesController().checkCanOpenChat(bundle, o2Var)) {
                    o2Var.presentFragment(new ProfileActivity(bundle, null));
                }
                this.d.f18655a.L0.run();
                return;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", this.f28724b.f18476id);
                org.telegram.ui.ActionBar.o2 o2Var2 = this.f28725c;
                if (o2Var2.getMessagesController().checkCanOpenChat(bundle2, o2Var2)) {
                    o2Var2.presentFragment(new ProfileActivity(bundle2, null));
                }
                this.d.f18655a.L0.run();
                return;
        }
    }
}
