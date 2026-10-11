package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class g9 extends org.telegram.ui.Components.q61 {
    public static final int f37991a = 0;

    static {
        org.telegram.ui.Components.q61.setup(new org.telegram.ui.Components.q61());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.r61 r61Var, boolean z10, org.telegram.ui.Components.e71 e71Var, org.telegram.ui.Components.m71 m71Var) {
        String lowerCase;
        h9 h9Var = (h9) view;
        TLRPC.Chat chat = (TLRPC.Chat) r61Var.G;
        View.OnClickListener onClickListener = r61Var.D;
        h9Var.f38313c = chat;
        org.telegram.ui.Components.ej0 ej0Var = h9Var.f38312b;
        ej0Var.setTag(Long.valueOf(chat.f20032id));
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
        h9Var.f38311a.u(chat, null, null, lowerCase, false, false);
        ej0Var.setOnClickListener(onClickListener);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.sm0 sm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new h9(context);
    }
}
