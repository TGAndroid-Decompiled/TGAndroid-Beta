package org.telegram.ui.Components;

import android.content.Context;
public final class dg extends ei.p0 {
    public final ChatActivityEnterView f25769y;

    public dg(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.f25769y = chatActivityEnterView;
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        ChatActivityEnterView chatActivityEnterView = this.f25769y;
        if (chatActivityEnterView.V0 != null && chatActivityEnterView.f23966o3 == 1) {
            chatActivityEnterView.Z2.z(f7);
        }
    }
}
