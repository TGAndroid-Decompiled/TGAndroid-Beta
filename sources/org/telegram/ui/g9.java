package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class g9 extends org.telegram.ui.Components.n41 {
    public static final int f47958b = 0;

    static {
        org.telegram.ui.Components.n41.h(new org.telegram.ui.Components.n41());
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.o41 o41Var, boolean z10, org.telegram.ui.Components.c51 c51Var, org.telegram.ui.Components.h51 h51Var) {
        String lowerCase;
        h9 h9Var = (h9) view;
        TLRPC.Chat chat = (TLRPC.Chat) o41Var.H;
        View.OnClickListener onClickListener = o41Var.E;
        h9Var.f48263c = chat;
        org.telegram.ui.Components.pg0 pg0Var = h9Var.f48262b;
        pg0Var.setTag(Long.valueOf(chat.f28398id));
        if (org.telegram.messenger.v3.T(chat) && !chat.megagroup) {
            if (!org.telegram.messenger.v3.t0(chat)) {
                lowerCase = org.telegram.messenger.hd.N0(2131752317, null).toLowerCase();
            } else {
                lowerCase = org.telegram.messenger.hd.N0(2131752306, null).toLowerCase();
            }
        } else if (chat.has_geo) {
            lowerCase = org.telegram.messenger.hd.N0(2131748449, null);
        } else if (!org.telegram.messenger.v3.t0(chat)) {
            lowerCase = org.telegram.messenger.hd.N0(2131748448, null).toLowerCase();
        } else {
            lowerCase = org.telegram.messenger.hd.N0(2131748445, null).toLowerCase();
        }
        h9Var.f48261a.x(chat, null, null, lowerCase, false, false);
        pg0Var.setOnClickListener(onClickListener);
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.ek0 ek0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new h9(context);
    }
}
