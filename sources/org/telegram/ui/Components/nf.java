package org.telegram.ui.Components;

import android.content.Context;

public final class nf extends nh.n0 {

    public final ChatActivityEnterView f30964y;

    public nf(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.f30964y = chatActivityEnterView;
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        ChatActivityEnterView chatActivityEnterView = this.f30964y;
        if (chatActivityEnterView.R0 == null || chatActivityEnterView.f26130j3 != 1) {
            return;
        }
        chatActivityEnterView.U2.n(f10);
    }
}
