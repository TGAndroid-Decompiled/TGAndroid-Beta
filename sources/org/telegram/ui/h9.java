package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

public final class h9 extends org.telegram.ui.Components.m41 {

    public static final int f38730a = 0;

    static {
        org.telegram.ui.Components.m41.setup(new h9());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.n41 n41Var, boolean z10, org.telegram.ui.Components.b51 b51Var, org.telegram.ui.Components.k51 k51Var) {
        String lowerCase;
        i9 i9Var = (i9) view;
        TLRPC.Chat chat = (TLRPC.Chat) n41Var.G;
        View.OnClickListener onClickListener = n41Var.D;
        i9Var.f39002c = chat;
        org.telegram.ui.Components.lh0 lh0Var = i9Var.f39001b;
        lh0Var.setTag(Long.valueOf(chat.f22380id));
        if (ChatObject.isChannel(chat) && !chat.megagroup) {
            lowerCase = !ChatObject.isPublic(chat) ? LocaleController.getString(R.string.ChannelPrivate).toLowerCase() : LocaleController.getString(R.string.ChannelPublic).toLowerCase();
        } else if (chat.has_geo) {
            lowerCase = LocaleController.getString(R.string.MegaLocation);
        } else {
            lowerCase = !ChatObject.isPublic(chat) ? LocaleController.getString(R.string.MegaPrivate).toLowerCase() : LocaleController.getString(R.string.MegaPublic).toLowerCase();
        }
        i9Var.f39000a.u(chat, null, null, lowerCase, false, false);
        lh0Var.setOnClickListener(onClickListener);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.zk0 zk0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new i9(context);
    }
}
