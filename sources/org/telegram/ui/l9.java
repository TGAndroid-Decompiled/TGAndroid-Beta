package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class l9 extends org.telegram.ui.Components.w51 {
    public static final int f35286a = 0;

    static {
        org.telegram.ui.Components.w51.setup(new org.telegram.ui.Components.w51());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.x51 x51Var, boolean z10, org.telegram.ui.Components.l61 l61Var, org.telegram.ui.Components.t61 t61Var) {
        String lowerCase;
        m9 m9Var = (m9) view;
        TLRPC.Chat chat = (TLRPC.Chat) x51Var.G;
        View.OnClickListener onClickListener = x51Var.D;
        m9Var.f35553c = chat;
        org.telegram.ui.Components.ki0 ki0Var = m9Var.f35552b;
        ki0Var.setTag(Long.valueOf(chat.f18329id));
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
        m9Var.f35551a.t(chat, null, null, lowerCase, false, false);
        ki0Var.setOnClickListener(onClickListener);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.yl0 yl0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new m9(context);
    }
}
