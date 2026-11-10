package org.telegram.ui.Components;

import android.content.Context;
public final class hf extends hi.k0 {
    public final ChatActivityEnterView D;

    public hf(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var);
        this.D = chatActivityEnterView;
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        ChatActivityEnterView chatActivityEnterView = this.D;
        if (chatActivityEnterView.V0 != null && chatActivityEnterView.f31117o3 == 1) {
            chatActivityEnterView.Z2.w(f10);
        }
    }
}
