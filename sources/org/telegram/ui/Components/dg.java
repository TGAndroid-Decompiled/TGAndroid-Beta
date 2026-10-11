package org.telegram.ui.Components;

import android.content.Context;
public final class dg extends ei.p0 {
    public final ChatActivityEnterView f25591y;

    public dg(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.f25591y = chatActivityEnterView;
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        ChatActivityEnterView chatActivityEnterView = this.f25591y;
        if (chatActivityEnterView.V0 != null && chatActivityEnterView.f23930o3 == 1) {
            chatActivityEnterView.Z2.z(f7);
        }
    }
}
