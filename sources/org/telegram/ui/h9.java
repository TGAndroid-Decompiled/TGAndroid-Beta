package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class h9 extends org.telegram.ui.Components.a51 {
    public static final int f37760b = 0;

    static {
        org.telegram.ui.Components.a51.h(new org.telegram.ui.Components.a51());
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.b51 b51Var, boolean z10, org.telegram.ui.Components.q51 q51Var, org.telegram.ui.Components.v51 v51Var) {
        String lowerCase;
        i9 i9Var = (i9) view;
        TLRPC.Chat chat = (TLRPC.Chat) b51Var.G;
        View.OnClickListener onClickListener = b51Var.D;
        i9Var.f37980c = chat;
        org.telegram.ui.Components.dh0 dh0Var = i9Var.f37979b;
        dh0Var.setTag(Long.valueOf(chat.f19794id));
        if (org.telegram.messenger.w3.T(chat) && !chat.megagroup) {
            if (!org.telegram.messenger.w3.t0(chat)) {
                lowerCase = org.telegram.messenger.dd.L0(2131752329, null).toLowerCase();
            } else {
                lowerCase = org.telegram.messenger.dd.L0(2131752318, null).toLowerCase();
            }
        } else if (chat.has_geo) {
            lowerCase = org.telegram.messenger.dd.L0(2131748657, null);
        } else if (!org.telegram.messenger.w3.t0(chat)) {
            lowerCase = org.telegram.messenger.dd.L0(2131748656, null).toLowerCase();
        } else {
            lowerCase = org.telegram.messenger.dd.L0(2131748653, null).toLowerCase();
        }
        i9Var.f37978a.z(chat, null, null, lowerCase, false, false);
        dh0Var.setOnClickListener(onClickListener);
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.uk0 uk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new i9(context);
    }
}
