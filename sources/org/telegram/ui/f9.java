package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class f9 extends org.telegram.ui.Components.v41 {
    public static final int f38042a = 0;

    static {
        org.telegram.ui.Components.v41.setup(new org.telegram.ui.Components.v41());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.w41 w41Var, boolean z10, org.telegram.ui.Components.k51 k51Var, org.telegram.ui.Components.u51 u51Var) {
        String lowerCase;
        g9 g9Var = (g9) view;
        TLRPC.Chat chat = (TLRPC.Chat) w41Var.G;
        View.OnClickListener onClickListener = w41Var.D;
        g9Var.f38491c = chat;
        org.telegram.ui.Components.th0 th0Var = g9Var.f38490b;
        th0Var.setTag(Long.valueOf(chat.f22392id));
        if (ChatObject.isChannel(chat) && !chat.megagroup) {
            if (!ChatObject.isPublic(chat)) {
                lowerCase = LocaleController.getString(R.string.ChannelPrivate).toLowerCase();
            } else {
                lowerCase = LocaleController.getString(R.string.ChannelPublic).toLowerCase();
            }
        } else if (chat.has_geo) {
            lowerCase = LocaleController.getString(R.string.MegaLocation);
        } else if (!ChatObject.isPublic(chat)) {
            lowerCase = LocaleController.getString(R.string.MegaPrivate).toLowerCase();
        } else {
            lowerCase = LocaleController.getString(R.string.MegaPublic).toLowerCase();
        }
        g9Var.f38489a.t(chat, null, null, lowerCase, false, false);
        th0Var.setOnClickListener(onClickListener);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.jl0 jl0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new g9(context);
    }
}
