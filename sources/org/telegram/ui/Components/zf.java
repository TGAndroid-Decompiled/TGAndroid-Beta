package org.telegram.ui.Components;

import android.content.Context;
public final class zf extends ei.p0 {
    public final ChatActivityEnterView f30509y;

    public zf(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.f30509y = chatActivityEnterView;
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        ChatActivityEnterView chatActivityEnterView = this.f30509y;
        if (chatActivityEnterView.V0 != null && chatActivityEnterView.f21822n3 == 1) {
            chatActivityEnterView.Y2.y(f7);
        }
    }
}
