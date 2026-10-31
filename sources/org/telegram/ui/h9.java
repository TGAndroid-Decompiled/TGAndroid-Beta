package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class h9 extends org.telegram.ui.Components.z41 {
    public static final int f37850b = 0;

    static {
        org.telegram.ui.Components.z41.h(new org.telegram.ui.Components.z41());
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.a51 a51Var, boolean z10, org.telegram.ui.Components.p51 p51Var, org.telegram.ui.Components.u51 u51Var) {
        String lowerCase;
        i9 i9Var = (i9) view;
        TLRPC.Chat chat = (TLRPC.Chat) a51Var.G;
        View.OnClickListener onClickListener = a51Var.D;
        i9Var.f38212c = chat;
        org.telegram.ui.Components.ch0 ch0Var = i9Var.f38211b;
        ch0Var.setTag(Long.valueOf(chat.f19793id));
        if (org.telegram.messenger.w3.T(chat) && !chat.megagroup) {
            if (!org.telegram.messenger.w3.t0(chat)) {
                lowerCase = org.telegram.messenger.cd.L0(2131752329, null).toLowerCase();
            } else {
                lowerCase = org.telegram.messenger.cd.L0(2131752318, null).toLowerCase();
            }
        } else if (chat.has_geo) {
            lowerCase = org.telegram.messenger.cd.L0(2131748657, null);
        } else if (!org.telegram.messenger.w3.t0(chat)) {
            lowerCase = org.telegram.messenger.cd.L0(2131748656, null).toLowerCase();
        } else {
            lowerCase = org.telegram.messenger.cd.L0(2131748653, null).toLowerCase();
        }
        i9Var.f38210a.z(chat, null, null, lowerCase, false, false);
        ch0Var.setOnClickListener(onClickListener);
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.tk0 tk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new i9(context);
    }
}
