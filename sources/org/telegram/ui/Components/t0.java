package org.telegram.ui.Components;

import android.os.Bundle;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ProfileActivity;
public final class t0 implements View.OnClickListener {
    public final int f32792a;
    public final TLRPC.User f32793b;
    public final org.telegram.ui.ActionBar.r2 f32794c;
    public final AlertDialog$Builder d;

    public t0(TLRPC.User user, org.telegram.ui.ActionBar.r2 r2Var, AlertDialog$Builder alertDialog$Builder, int i10) {
        this.f32792a = i10;
        this.f32793b = user;
        this.f32794c = r2Var;
        this.d = alertDialog$Builder;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32792a) {
            case 0:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", this.f32793b.f22177id);
                org.telegram.ui.ActionBar.r2 r2Var = this.f32794c;
                if (r2Var.getMessagesController().checkCanOpenChat(bundle, r2Var)) {
                    r2Var.presentFragment(new ProfileActivity(bundle, null));
                }
                this.d.f22369a.N0.run();
                return;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", this.f32793b.f22177id);
                org.telegram.ui.ActionBar.r2 r2Var2 = this.f32794c;
                if (r2Var2.getMessagesController().checkCanOpenChat(bundle2, r2Var2)) {
                    r2Var2.presentFragment(new ProfileActivity(bundle2, null));
                }
                this.d.f22369a.N0.run();
                return;
        }
    }
}
