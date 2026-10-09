package org.telegram.ui.Components;

import android.content.Context;
public final class dg extends ei.p0 {
    public final ChatActivityEnterView f25701y;

    public dg(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.f25701y = chatActivityEnterView;
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        ChatActivityEnterView chatActivityEnterView = this.f25701y;
        if (chatActivityEnterView.V0 != null && chatActivityEnterView.f23938o3 == 1) {
            chatActivityEnterView.Z2.z(f7);
        }
    }
}
