package org.telegram.ui.Components;

import android.content.Context;
public final class cg extends ei.q0 {
    public final ChatActivityEnterView f25362y;

    public cg(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.f25362y = chatActivityEnterView;
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        ChatActivityEnterView chatActivityEnterView = this.f25362y;
        if (chatActivityEnterView.V0 != null && chatActivityEnterView.f23935o3 == 1) {
            chatActivityEnterView.Z2.y(f7);
        }
    }
}
