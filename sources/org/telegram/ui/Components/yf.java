package org.telegram.ui.Components;

import android.content.Context;
public final class yf extends ki.m0 {
    public final ChatActivityEnterView E;

    public yf(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var);
        this.E = chatActivityEnterView;
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        ChatActivityEnterView chatActivityEnterView = this.E;
        if (chatActivityEnterView.W0 != null && chatActivityEnterView.f32562c4 == 1) {
            chatActivityEnterView.N3.x(f10);
        }
    }
}
