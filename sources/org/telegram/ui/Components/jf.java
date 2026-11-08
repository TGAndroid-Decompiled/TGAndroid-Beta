package org.telegram.ui.Components;

import android.content.Context;
public final class jf extends hi.k0 {
    public final ChatActivityEnterView D;

    public jf(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.D = chatActivityEnterView;
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        ChatActivityEnterView chatActivityEnterView = this.D;
        if (chatActivityEnterView.V0 != null && chatActivityEnterView.f31101o3 == 1) {
            chatActivityEnterView.Z2.w(f10);
        }
    }
}
