package org.telegram.ui.Components;

import android.content.Context;
public final class ag extends ei.p0 {
    public final ChatActivityEnterView f22443y;

    public ag(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.f22443y = chatActivityEnterView;
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        ChatActivityEnterView chatActivityEnterView = this.f22443y;
        if (chatActivityEnterView.V0 != null && chatActivityEnterView.f21783n3 == 1) {
            chatActivityEnterView.Y2.y(f7);
        }
    }
}
