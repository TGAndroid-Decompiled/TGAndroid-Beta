package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class f9 extends org.telegram.ui.Components.q31 {
    public static final int f45219b = 0;

    static {
        org.telegram.ui.Components.q31.h(new org.telegram.ui.Components.q31());
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.r31 r31Var, boolean z10, org.telegram.ui.Components.f41 f41Var, org.telegram.ui.Components.l41 l41Var) {
        String lowerCase;
        g9 g9Var = (g9) view;
        TLRPC.Chat chat = (TLRPC.Chat) r31Var.G;
        View.OnClickListener onClickListener = r31Var.D;
        g9Var.f45606c = chat;
        org.telegram.ui.Components.dg0 dg0Var = g9Var.f45605b;
        dg0Var.setTag(Long.valueOf(chat.f27001id));
        if (org.telegram.messenger.t3.T(chat) && !chat.megagroup) {
            if (!org.telegram.messenger.t3.t0(chat)) {
                lowerCase = org.telegram.messenger.bd.M0(2131752329, null).toLowerCase();
            } else {
                lowerCase = org.telegram.messenger.bd.M0(2131752318, null).toLowerCase();
            }
        } else if (chat.has_geo) {
            lowerCase = org.telegram.messenger.bd.M0(2131748650, null);
        } else if (!org.telegram.messenger.t3.t0(chat)) {
            lowerCase = org.telegram.messenger.bd.M0(2131748649, null).toLowerCase();
        } else {
            lowerCase = org.telegram.messenger.bd.M0(2131748646, null).toLowerCase();
        }
        g9Var.f45604a.x(chat, null, null, lowerCase, false, false);
        dg0Var.setOnClickListener(onClickListener);
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.tj0 tj0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        return new g9(context);
    }
}
