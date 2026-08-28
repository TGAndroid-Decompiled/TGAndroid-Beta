package org.telegram.ui.Components;

import android.content.Context;
public final class rf extends mh.o0 {
    public final ChatActivityEnterView f32153y;

    public rf(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var);
        this.f32153y = chatActivityEnterView;
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        ChatActivityEnterView chatActivityEnterView = this.f32153y;
        if (chatActivityEnterView.R0 != null && chatActivityEnterView.f26134j3 == 1) {
            chatActivityEnterView.U2.o(f10);
        }
    }
}
