package org.telegram.ui.Components;

import android.content.Context;
public final class bg extends fi.p0 {
    public final ChatActivityEnterView f24695y;

    public bg(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.f24695y = chatActivityEnterView;
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        ChatActivityEnterView chatActivityEnterView = this.f24695y;
        if (chatActivityEnterView.V0 != null && chatActivityEnterView.f23744n3 == 1) {
            chatActivityEnterView.Y2.x(f7);
        }
    }
}
