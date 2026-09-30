package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class i9 extends org.telegram.ui.Components.x51 {
    public static final int f34532a = 0;

    static {
        org.telegram.ui.Components.x51.setup(new org.telegram.ui.Components.x51());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.y51 y51Var, boolean z10, org.telegram.ui.Components.m61 m61Var, org.telegram.ui.Components.u61 u61Var) {
        String lowerCase;
        j9 j9Var = (j9) view;
        TLRPC.Chat chat = (TLRPC.Chat) y51Var.G;
        View.OnClickListener onClickListener = y51Var.D;
        j9Var.f34781c = chat;
        org.telegram.ui.Components.li0 li0Var = j9Var.f34780b;
        li0Var.setTag(Long.valueOf(chat.f18352id));
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
        j9Var.f34779a.t(chat, null, null, lowerCase, false, false);
        li0Var.setOnClickListener(onClickListener);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new j9(context);
    }
}
