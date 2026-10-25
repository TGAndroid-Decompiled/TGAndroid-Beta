package org.telegram.ui.Components;

import android.content.Context;
public final class ag extends hi.u0 {
    public final ChatActivityEnterView f26496y;

    public ag(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var);
        this.f26496y = chatActivityEnterView;
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        ChatActivityEnterView chatActivityEnterView = this.f26496y;
        if (chatActivityEnterView.V0 != null && chatActivityEnterView.f25930o3 == 1) {
            chatActivityEnterView.Z2.t(f7);
        }
    }
}
