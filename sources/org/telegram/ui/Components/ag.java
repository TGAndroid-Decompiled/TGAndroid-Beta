package org.telegram.ui.Components;

import android.content.Context;
public final class ag extends gi.n0 {
    public final ChatActivityEnterView f24713y;

    public ag(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.f24713y = chatActivityEnterView;
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        ChatActivityEnterView chatActivityEnterView = this.f24713y;
        if (chatActivityEnterView.V0 != null && chatActivityEnterView.f24139o3 == 1) {
            chatActivityEnterView.Z2.z(f7);
        }
    }
}
