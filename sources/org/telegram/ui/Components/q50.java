package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class q50 implements View.OnClickListener {
    public final int f31830a;
    public final TLRPC.User f31831b;
    public final String f31832c;
    public final boolean d;
    public final boolean f31833e;
    public final boolean f31834f;
    public final vk0 h;

    public q50(vk0 vk0Var, TLRPC.User user, String str, boolean z10, boolean z11, boolean z12, int i9) {
        this.f31830a = i9;
        this.h = vk0Var;
        this.f31831b = user;
        this.f31832c = str;
        this.d = z10;
        this.f31833e = z11;
        this.f31834f = z12;
    }

    @Override
    public final void onClick(View view) {
        int i9;
        org.telegram.ui.ActionBar.b6 b6Var;
        switch (this.f31830a) {
            case 0:
                a60 a60Var = ((v50) this.h).f33265c;
                Context context = a60Var.getContext();
                i9 = ((org.telegram.ui.ActionBar.f3) a60Var).currentAccount;
                b6Var = ((org.telegram.ui.ActionBar.f3) a60Var).resourcesProvider;
                iz0.b(context, i9, -a60Var.f26680c0, this.f31831b, this.f31832c, this.d, this.f31833e, this.f31834f, b6Var);
                return;
            default:
                eu0 eu0Var = ((os0) this.h).f31438f;
                iz0.b(eu0Var.getContext(), eu0Var.f28160r1.getCurrentAccount(), eu0Var.f28136f1, this.f31831b, this.f31832c, this.d, this.f31833e, this.f31834f, eu0Var.B1);
                return;
        }
    }
}
