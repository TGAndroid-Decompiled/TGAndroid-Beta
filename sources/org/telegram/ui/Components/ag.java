package org.telegram.ui.Components;

import android.content.Context;
public final class ag extends ei.p0 {
    public final ChatActivityEnterView f22653y;

    public ag(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.f22653y = chatActivityEnterView;
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        ChatActivityEnterView chatActivityEnterView = this.f22653y;
        if (chatActivityEnterView.V0 != null && chatActivityEnterView.f22054o3 == 1) {
            chatActivityEnterView.Z2.y(f7);
        }
    }
}
