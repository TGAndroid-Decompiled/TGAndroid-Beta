package org.telegram.ui.Components;

import android.os.Bundle;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ProfileActivity;
public final class w0 implements View.OnClickListener {
    public final int f34249a;
    public final TLRPC.User f34250b;
    public final org.telegram.ui.ActionBar.o2 f34251c;
    public final AlertDialog$Builder d;

    public w0(TLRPC.User user, org.telegram.ui.ActionBar.o2 o2Var, AlertDialog$Builder alertDialog$Builder, int i10) {
        this.f34249a = i10;
        this.f34250b = user;
        this.f34251c = o2Var;
        this.d = alertDialog$Builder;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f34249a) {
            case 0:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", this.f34250b.f22539id);
                org.telegram.ui.ActionBar.o2 o2Var = this.f34251c;
                if (o2Var.getMessagesController().checkCanOpenChat(bundle, o2Var)) {
                    o2Var.presentFragment(new ProfileActivity(bundle, null));
                }
                this.d.f22714a.H0.run();
                return;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", this.f34250b.f22539id);
                org.telegram.ui.ActionBar.o2 o2Var2 = this.f34251c;
                if (o2Var2.getMessagesController().checkCanOpenChat(bundle2, o2Var2)) {
                    o2Var2.presentFragment(new ProfileActivity(bundle2, null));
                }
                this.d.f22714a.H0.run();
                return;
        }
    }
}
