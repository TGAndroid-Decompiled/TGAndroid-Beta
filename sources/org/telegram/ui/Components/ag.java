package org.telegram.ui.Components;

import android.content.Context;
public final class ag extends ki.l0 {
    public final ChatActivityEnterView E;

    public ag(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var);
        this.E = chatActivityEnterView;
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        ChatActivityEnterView chatActivityEnterView = this.E;
        if (chatActivityEnterView.W0 != null && chatActivityEnterView.f32673e4 == 1) {
            chatActivityEnterView.P3.u(f10);
        }
    }
}
