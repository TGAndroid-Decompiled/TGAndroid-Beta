package org.telegram.ui.Components;

import android.content.Context;
public final class cg extends fi.o0 {
    public final ChatActivityEnterView f24070y;

    public cg(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.f24070y = chatActivityEnterView;
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        ChatActivityEnterView chatActivityEnterView = this.f24070y;
        if (chatActivityEnterView.V0 != null && chatActivityEnterView.f22937o3 == 1) {
            chatActivityEnterView.Z2.z(f7);
        }
    }
}
