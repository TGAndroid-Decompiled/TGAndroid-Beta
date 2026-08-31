package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class j9 extends org.telegram.ui.Components.i51 {
    public static final int f38057a = 0;

    static {
        org.telegram.ui.Components.i51.setup(new org.telegram.ui.Components.i51());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.j51 j51Var, boolean z4, org.telegram.ui.Components.x51 x51Var, org.telegram.ui.Components.i61 i61Var) {
        String lowerCase;
        k9 k9Var = (k9) view;
        TLRPC.Chat chat = (TLRPC.Chat) j51Var.G;
        View.OnClickListener onClickListener = j51Var.D;
        k9Var.f38308c = chat;
        org.telegram.ui.Components.gi0 gi0Var = k9Var.f38307b;
        gi0Var.setTag(Long.valueOf(chat.f20843id));
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
        k9Var.f38306a.t(chat, null, null, lowerCase, false, false);
        gi0Var.setOnClickListener(onClickListener);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.tl0 tl0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new k9(context);
    }
}
