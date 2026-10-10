package org.telegram.ui.Components;

import android.content.Context;
public final class dg extends ei.p0 {
    public final ChatActivityEnterView f25691y;

    public dg(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.f25691y = chatActivityEnterView;
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        ChatActivityEnterView chatActivityEnterView = this.f25691y;
        if (chatActivityEnterView.V0 != null && chatActivityEnterView.f23942o3 == 1) {
            chatActivityEnterView.Z2.z(f7);
        }
    }
}
