package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class k9 extends org.telegram.ui.Components.e61 {
    public static final int f38440a = 0;

    static {
        org.telegram.ui.Components.e61.setup(new org.telegram.ui.Components.e61());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.f61 f61Var, boolean z10, org.telegram.ui.Components.s61 s61Var, org.telegram.ui.Components.a71 a71Var) {
        String lowerCase;
        l9 l9Var = (l9) view;
        TLRPC.Chat chat = (TLRPC.Chat) f61Var.G;
        View.OnClickListener onClickListener = f61Var.D;
        l9Var.f38828c = chat;
        org.telegram.ui.Components.ti0 ti0Var = l9Var.f38827b;
        ti0Var.setTag(Long.valueOf(chat.f20272id));
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
        l9Var.f38826a.t(chat, null, null, lowerCase, false, false);
        ti0Var.setOnClickListener(onClickListener);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new l9(context);
    }
}
