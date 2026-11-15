package org.telegram.ui.Components;

import android.content.Context;
public final class pf extends ki.m0 {
    public final ChatActivityEnterView E;

    public pf(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.E = chatActivityEnterView;
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        ChatActivityEnterView chatActivityEnterView = this.E;
        if (chatActivityEnterView.W0 != null && chatActivityEnterView.W3 == 1) {
            chatActivityEnterView.H3.y(f10);
        }
    }
}
