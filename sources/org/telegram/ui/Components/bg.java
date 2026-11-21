package org.telegram.ui.Components;

import android.content.Context;
public final class bg extends ki.l0 {
    public final ChatActivityEnterView E;

    public bg(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var);
        this.E = chatActivityEnterView;
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        ChatActivityEnterView chatActivityEnterView = this.E;
        if (chatActivityEnterView.W0 != null && chatActivityEnterView.f32606e4 == 1) {
            chatActivityEnterView.P3.x(f10);
        }
    }
}
