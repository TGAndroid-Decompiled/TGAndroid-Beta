package org.telegram.ui.Components;

import android.content.Context;
public final class rf extends sh.l0 {
    public final ChatActivityEnterView f30740y;

    public rf(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.f30740y = chatActivityEnterView;
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        ChatActivityEnterView chatActivityEnterView = this.f30740y;
        if (chatActivityEnterView.S0 != null && chatActivityEnterView.f24636k3 == 1) {
            chatActivityEnterView.V2.x(f10);
        }
    }
}
