package org.telegram.ui.Components;

import android.content.Context;
public final class rf extends sh.l0 {
    public final ChatActivityEnterView f30693y;

    public rf(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.f30693y = chatActivityEnterView;
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        ChatActivityEnterView chatActivityEnterView = this.f30693y;
        if (chatActivityEnterView.S0 != null && chatActivityEnterView.f24634k3 == 1) {
            chatActivityEnterView.V2.x(f10);
        }
    }
}
