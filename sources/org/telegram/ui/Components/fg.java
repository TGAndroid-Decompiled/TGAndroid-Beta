package org.telegram.ui.Components;

import android.content.Context;
public final class fg extends ei.p0 {
    public final ChatActivityEnterView f26058y;

    public fg(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.f26058y = chatActivityEnterView;
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        ChatActivityEnterView chatActivityEnterView = this.f26058y;
        if (chatActivityEnterView.V0 != null && chatActivityEnterView.Q3 == 1) {
            chatActivityEnterView.Z2.z(f7);
        }
    }
}
