package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class g9 extends org.telegram.ui.Components.a41 {
    public static final int f47378b = 0;

    static {
        org.telegram.ui.Components.a41.h(new org.telegram.ui.Components.a41());
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.b41 b41Var, boolean z10, org.telegram.ui.Components.p41 p41Var, org.telegram.ui.Components.u41 u41Var) {
        String lowerCase;
        h9 h9Var = (h9) view;
        TLRPC.Chat chat = (TLRPC.Chat) b41Var.G;
        View.OnClickListener onClickListener = b41Var.D;
        h9Var.f47640c = chat;
        org.telegram.ui.Components.dg0 dg0Var = h9Var.f47639b;
        dg0Var.setTag(Long.valueOf(chat.f28051id));
        if (org.telegram.messenger.t3.T(chat) && !chat.megagroup) {
            if (!org.telegram.messenger.t3.t0(chat)) {
                lowerCase = org.telegram.messenger.hd.M0(2131752329, null).toLowerCase();
            } else {
                lowerCase = org.telegram.messenger.hd.M0(2131752318, null).toLowerCase();
            }
        } else if (chat.has_geo) {
            lowerCase = org.telegram.messenger.hd.M0(2131748642, null);
        } else if (!org.telegram.messenger.t3.t0(chat)) {
            lowerCase = org.telegram.messenger.hd.M0(2131748641, null).toLowerCase();
        } else {
            lowerCase = org.telegram.messenger.hd.M0(2131748638, null).toLowerCase();
        }
        h9Var.f47638a.x(chat, null, null, lowerCase, false, false);
        dg0Var.setOnClickListener(onClickListener);
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.uj0 uj0Var, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        return new h9(context);
    }
}
