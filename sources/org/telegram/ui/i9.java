package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class i9 extends org.telegram.ui.Components.u51 {
    public static final int f33562a = 0;

    static {
        org.telegram.ui.Components.u51.setup(new org.telegram.ui.Components.u51());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.v51 v51Var, boolean z10, org.telegram.ui.Components.j61 j61Var, org.telegram.ui.Components.r61 r61Var) {
        String lowerCase;
        j9 j9Var = (j9) view;
        TLRPC.Chat chat = (TLRPC.Chat) v51Var.G;
        View.OnClickListener onClickListener = v51Var.D;
        j9Var.f34057c = chat;
        org.telegram.ui.Components.hi0 hi0Var = j9Var.f34056b;
        hi0Var.setTag(Long.valueOf(chat.f17195id));
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
        j9Var.f34055a.t(chat, null, null, lowerCase, false, false);
        hi0Var.setOnClickListener(onClickListener);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new j9(context);
    }
}
