package org.telegram.ui.Components;

import android.content.Context;
public final class ag extends gi.n0 {
    public final ChatActivityEnterView f24591y;

    public ag(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.f24591y = chatActivityEnterView;
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        ChatActivityEnterView chatActivityEnterView = this.f24591y;
        if (chatActivityEnterView.V0 != null && chatActivityEnterView.f23999o3 == 1) {
            chatActivityEnterView.Z2.z(f7);
        }
    }
}
