package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class g9 extends org.telegram.ui.Components.q31 {
    public static final int f45897b = 0;

    static {
        org.telegram.ui.Components.q31.h(new org.telegram.ui.Components.q31());
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.r31 r31Var, boolean z9, org.telegram.ui.Components.f41 f41Var, org.telegram.ui.Components.k41 k41Var) {
        String lowerCase;
        h9 h9Var = (h9) view;
        TLRPC.Chat chat = (TLRPC.Chat) r31Var.G;
        View.OnClickListener onClickListener = r31Var.D;
        h9Var.f46275c = chat;
        org.telegram.ui.Components.ag0 ag0Var = h9Var.f46274b;
        ag0Var.setTag(Long.valueOf(chat.f26952id));
        if (org.telegram.messenger.t3.T(chat) && !chat.megagroup) {
            if (!org.telegram.messenger.t3.t0(chat)) {
                lowerCase = org.telegram.messenger.hd.M0(2131752329, null).toLowerCase();
            } else {
                lowerCase = org.telegram.messenger.hd.M0(2131752318, null).toLowerCase();
            }
        } else if (chat.has_geo) {
            lowerCase = org.telegram.messenger.hd.M0(2131748641, null);
        } else if (!org.telegram.messenger.t3.t0(chat)) {
            lowerCase = org.telegram.messenger.hd.M0(2131748640, null).toLowerCase();
        } else {
            lowerCase = org.telegram.messenger.hd.M0(2131748637, null).toLowerCase();
        }
        h9Var.f46273a.x(chat, null, null, lowerCase, false, false);
        ag0Var.setOnClickListener(onClickListener);
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new h9(context);
    }
}
