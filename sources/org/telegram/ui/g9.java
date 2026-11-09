package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class g9 extends org.telegram.ui.Components.x31 {
    public static final int f45937b = 0;

    static {
        org.telegram.ui.Components.x31.h(new org.telegram.ui.Components.x31());
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.y31 y31Var, boolean z9, org.telegram.ui.Components.m41 m41Var, org.telegram.ui.Components.r41 r41Var) {
        String lowerCase;
        h9 h9Var = (h9) view;
        TLRPC.Chat chat = (TLRPC.Chat) y31Var.G;
        View.OnClickListener onClickListener = y31Var.D;
        h9Var.f46263c = chat;
        org.telegram.ui.Components.bg0 bg0Var = h9Var.f46262b;
        bg0Var.setTag(Long.valueOf(chat.f26956id));
        if (org.telegram.messenger.t3.T(chat) && !chat.megagroup) {
            if (!org.telegram.messenger.t3.t0(chat)) {
                lowerCase = org.telegram.messenger.id.M0(2131752329, null).toLowerCase();
            } else {
                lowerCase = org.telegram.messenger.id.M0(2131752318, null).toLowerCase();
            }
        } else if (chat.has_geo) {
            lowerCase = org.telegram.messenger.id.M0(2131748642, null);
        } else if (!org.telegram.messenger.t3.t0(chat)) {
            lowerCase = org.telegram.messenger.id.M0(2131748641, null).toLowerCase();
        } else {
            lowerCase = org.telegram.messenger.id.M0(2131748638, null).toLowerCase();
        }
        h9Var.f46261a.x(chat, null, null, lowerCase, false, false);
        bg0Var.setOnClickListener(onClickListener);
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.qj0 qj0Var, int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        return new h9(context);
    }
}
