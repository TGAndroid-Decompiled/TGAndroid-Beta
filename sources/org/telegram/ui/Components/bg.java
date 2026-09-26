package org.telegram.ui.Components;

import android.content.Context;
public final class bg extends ei.p0 {
    public final ChatActivityEnterView f23003y;

    public bg(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.f23003y = chatActivityEnterView;
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        ChatActivityEnterView chatActivityEnterView = this.f23003y;
        if (chatActivityEnterView.V0 != null && chatActivityEnterView.f22039o3 == 1) {
            chatActivityEnterView.Z2.y(f7);
        }
    }
}
