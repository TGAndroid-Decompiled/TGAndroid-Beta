package org.telegram.ui.Components;

import android.content.Context;
public final class zf extends ei.p0 {
    public final ChatActivityEnterView f30586y;

    public zf(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.f30586y = chatActivityEnterView;
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        ChatActivityEnterView chatActivityEnterView = this.f30586y;
        if (chatActivityEnterView.V0 != null && chatActivityEnterView.f21812n3 == 1) {
            chatActivityEnterView.Y2.y(f7);
        }
    }
}
