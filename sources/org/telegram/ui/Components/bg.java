package org.telegram.ui.Components;

import android.content.Context;
public final class bg extends ei.p0 {
    public final ChatActivityEnterView f23009y;

    public bg(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.f23009y = chatActivityEnterView;
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        ChatActivityEnterView chatActivityEnterView = this.f23009y;
        if (chatActivityEnterView.V0 != null && chatActivityEnterView.f22042o3 == 1) {
            chatActivityEnterView.Z2.y(f7);
        }
    }
}
