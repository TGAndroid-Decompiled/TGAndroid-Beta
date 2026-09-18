package org.telegram.ui.Components;

import android.content.Context;
public final class ag extends ei.p0 {
    public final ChatActivityEnterView f22604y;

    public ag(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.f22604y = chatActivityEnterView;
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        ChatActivityEnterView chatActivityEnterView = this.f22604y;
        if (chatActivityEnterView.V0 != null && chatActivityEnterView.f21998n3 == 1) {
            chatActivityEnterView.Y2.y(f7);
        }
    }
}
