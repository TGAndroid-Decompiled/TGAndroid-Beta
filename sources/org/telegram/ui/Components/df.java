package org.telegram.ui.Components;

import android.content.Context;
public final class df extends xh.j0 {
    public final ChatActivityEnterView D;

    public df(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, p6Var);
        this.D = chatActivityEnterView;
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        ChatActivityEnterView chatActivityEnterView = this.D;
        if (chatActivityEnterView.V0 != null && chatActivityEnterView.f23762o3 == 1) {
            chatActivityEnterView.Z2.y(f7);
        }
    }
}
