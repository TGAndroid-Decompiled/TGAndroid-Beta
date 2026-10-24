package org.telegram.ui.Components;

import android.content.Context;
public final class yf extends gi.n0 {
    public final ChatActivityEnterView f32904y;

    public yf(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.f32904y = chatActivityEnterView;
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        ChatActivityEnterView chatActivityEnterView = this.f32904y;
        if (chatActivityEnterView.V0 != null && chatActivityEnterView.f24140o3 == 1) {
            chatActivityEnterView.Z2.z(f7);
        }
    }
}
