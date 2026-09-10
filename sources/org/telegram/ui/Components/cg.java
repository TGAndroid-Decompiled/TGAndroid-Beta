package org.telegram.ui.Components;

import android.content.Context;
public final class cg extends di.s0 {
    public final ChatActivityEnterView f22124y;

    public cg(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.f22124y = chatActivityEnterView;
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        ChatActivityEnterView chatActivityEnterView = this.f22124y;
        if (chatActivityEnterView.V0 != null && chatActivityEnterView.f20897n3 == 1) {
            chatActivityEnterView.Y2.y(f7);
        }
    }
}
