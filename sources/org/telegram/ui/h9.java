package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class h9 extends org.telegram.ui.Components.o61 {
    public static final int f38231a = 0;

    static {
        org.telegram.ui.Components.o61.setup(new org.telegram.ui.Components.o61());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.p61 p61Var, boolean z10, org.telegram.ui.Components.c71 c71Var, org.telegram.ui.Components.k71 k71Var) {
        String lowerCase;
        i9 i9Var = (i9) view;
        TLRPC.Chat chat = (TLRPC.Chat) p61Var.G;
        View.OnClickListener onClickListener = p61Var.D;
        i9Var.f38542c = chat;
        org.telegram.ui.Components.cj0 cj0Var = i9Var.f38541b;
        cj0Var.setTag(Long.valueOf(chat.f20038id));
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
        i9Var.f38540a.u(chat, null, null, lowerCase, false, false);
        cj0Var.setOnClickListener(onClickListener);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.qm0 qm0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new i9(context);
    }
}
