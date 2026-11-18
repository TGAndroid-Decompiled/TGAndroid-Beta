package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class g9 extends org.telegram.ui.Components.k41 {
    public static final int f47937b = 0;

    static {
        org.telegram.ui.Components.k41.h(new org.telegram.ui.Components.k41());
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.l41 l41Var, boolean z10, org.telegram.ui.Components.z41 z41Var, org.telegram.ui.Components.e51 e51Var) {
        String lowerCase;
        h9 h9Var = (h9) view;
        TLRPC.Chat chat = (TLRPC.Chat) l41Var.H;
        View.OnClickListener onClickListener = l41Var.E;
        h9Var.f48220c = chat;
        org.telegram.ui.Components.ng0 ng0Var = h9Var.f48219b;
        ng0Var.setTag(Long.valueOf(chat.f28403id));
        if (org.telegram.messenger.v3.T(chat) && !chat.megagroup) {
            if (!org.telegram.messenger.v3.t0(chat)) {
                lowerCase = org.telegram.messenger.gd.M0(2131752318, null).toLowerCase();
            } else {
                lowerCase = org.telegram.messenger.gd.M0(2131752307, null).toLowerCase();
            }
        } else if (chat.has_geo) {
            lowerCase = org.telegram.messenger.gd.M0(2131748450, null);
        } else if (!org.telegram.messenger.v3.t0(chat)) {
            lowerCase = org.telegram.messenger.gd.M0(2131748449, null).toLowerCase();
        } else {
            lowerCase = org.telegram.messenger.gd.M0(2131748446, null).toLowerCase();
        }
        h9Var.f48218a.x(chat, null, null, lowerCase, false, false);
        ng0Var.setOnClickListener(onClickListener);
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.ck0 ck0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new h9(context);
    }
}
