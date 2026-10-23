package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class k9 extends org.telegram.ui.Components.g61 {
    public static final int f38471a = 0;

    static {
        org.telegram.ui.Components.g61.setup(new org.telegram.ui.Components.g61());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.h61 h61Var, boolean z10, org.telegram.ui.Components.u61 u61Var, org.telegram.ui.Components.c71 c71Var) {
        String lowerCase;
        l9 l9Var = (l9) view;
        TLRPC.Chat chat = (TLRPC.Chat) h61Var.G;
        View.OnClickListener onClickListener = h61Var.D;
        l9Var.f38853c = chat;
        org.telegram.ui.Components.ui0 ui0Var = l9Var.f38852b;
        ui0Var.setTag(Long.valueOf(chat.f20280id));
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
        l9Var.f38851a.u(chat, null, null, lowerCase, false, false);
        ui0Var.setOnClickListener(onClickListener);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.jm0 jm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new l9(context);
    }
}
