package org.telegram.ui.Components;

import android.content.Context;
public final class uf extends ph.l0 {
    public final ChatActivityEnterView f33219y;

    public uf(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.f33219y = chatActivityEnterView;
    }

    @Override
    public final void setTranslationY(float f9) {
        super.setTranslationY(f9);
        ChatActivityEnterView chatActivityEnterView = this.f33219y;
        if (chatActivityEnterView.R0 != null && chatActivityEnterView.f26145j3 == 1) {
            chatActivityEnterView.U2.v(f9);
        }
    }
}
