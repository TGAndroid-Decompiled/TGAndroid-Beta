package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class g9 extends org.telegram.ui.Components.w31 {
    public static final int f46048b = 0;

    static {
        org.telegram.ui.Components.w31.h(new org.telegram.ui.Components.w31());
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.x31 x31Var, boolean z9, org.telegram.ui.Components.m41 m41Var, org.telegram.ui.Components.r41 r41Var) {
        String lowerCase;
        h9 h9Var = (h9) view;
        TLRPC.Chat chat = (TLRPC.Chat) x31Var.G;
        View.OnClickListener onClickListener = x31Var.D;
        h9Var.f46276c = chat;
        org.telegram.ui.Components.ag0 ag0Var = h9Var.f46275b;
        ag0Var.setTag(Long.valueOf(chat.f26960id));
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
        h9Var.f46274a.x(chat, null, null, lowerCase, false, false);
        ag0Var.setOnClickListener(onClickListener);
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.pj0 pj0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new h9(context);
    }
}
