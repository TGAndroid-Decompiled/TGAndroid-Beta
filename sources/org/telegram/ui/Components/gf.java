package org.telegram.ui.Components;

import android.content.Context;
public final class gf extends ii.m0 {
    public final ChatActivityEnterView E;

    public gf(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.E = chatActivityEnterView;
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        ChatActivityEnterView chatActivityEnterView = this.E;
        if (chatActivityEnterView.W0 != null && chatActivityEnterView.f31176p3 == 1) {
            chatActivityEnterView.f31087a3.x(f10);
        }
    }
}
