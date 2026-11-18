package org.telegram.ui.Components;

import android.os.Bundle;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ProfileActivity;
public final class k1 implements View.OnClickListener {
    public final int f36611a;
    public final TLRPC.User f36612b;
    public final org.telegram.ui.ActionBar.h2 f36613c;
    public final AlertDialog$Builder d;

    public k1(TLRPC.User user, org.telegram.ui.ActionBar.h2 h2Var, AlertDialog$Builder alertDialog$Builder, int i7) {
        this.f36611a = i7;
        this.f36612b = user;
        this.f36613c = h2Var;
        this.d = alertDialog$Builder;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36611a) {
            case 0:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", this.f36612b.f28552id);
                org.telegram.ui.ActionBar.h2 h2Var = this.f36613c;
                if (h2Var.getMessagesController().E(bundle, h2Var, null, null)) {
                    h2Var.presentFragment(new ProfileActivity(bundle, null));
                }
                this.d.f28744a.M0.run();
                return;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", this.f36612b.f28552id);
                org.telegram.ui.ActionBar.h2 h2Var2 = this.f36613c;
                if (h2Var2.getMessagesController().E(bundle2, h2Var2, null, null)) {
                    h2Var2.presentFragment(new ProfileActivity(bundle2, null));
                }
                this.d.f28744a.M0.run();
                return;
        }
    }
}
