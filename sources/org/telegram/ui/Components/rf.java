package org.telegram.ui.Components;

import android.content.Context;
public final class rf extends rh.l0 {
    public final ChatActivityEnterView f28468y;

    public rf(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.f28468y = chatActivityEnterView;
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        ChatActivityEnterView chatActivityEnterView = this.f28468y;
        if (chatActivityEnterView.S0 != null && chatActivityEnterView.f22767k3 == 1) {
            chatActivityEnterView.V2.x(f10);
        }
    }
}
