package org.telegram.ui.Components;

import android.content.Context;
public final class bg extends ei.p0 {
    public final ChatActivityEnterView f22997y;

    public bg(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.f22997y = chatActivityEnterView;
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        ChatActivityEnterView chatActivityEnterView = this.f22997y;
        if (chatActivityEnterView.V0 != null && chatActivityEnterView.f22040o3 == 1) {
            chatActivityEnterView.Z2.y(f7);
        }
    }
}
