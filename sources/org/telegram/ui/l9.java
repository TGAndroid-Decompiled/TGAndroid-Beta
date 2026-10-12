package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class l9 extends org.telegram.ui.Components.k61 {
    public static final int f37894a = 0;

    static {
        org.telegram.ui.Components.k61.setup(new org.telegram.ui.Components.k61());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.l61 l61Var, boolean z10, org.telegram.ui.Components.z61 z61Var, org.telegram.ui.Components.h71 h71Var) {
        String lowerCase;
        m9 m9Var = (m9) view;
        TLRPC.Chat chat = (TLRPC.Chat) l61Var.G;
        View.OnClickListener onClickListener = l61Var.D;
        m9Var.f38193c = chat;
        org.telegram.ui.Components.yi0 yi0Var = m9Var.f38192b;
        yi0Var.setTag(Long.valueOf(chat.f19216id));
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
        m9Var.f38191a.u(chat, null, null, lowerCase, false, false);
        yi0Var.setOnClickListener(onClickListener);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new m9(context);
    }
}
