package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;
public final class fg extends ty {
    public final ChatActivityEnterView W2;

    public fg(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.ActionBar.g2 g2Var, boolean z10, Context context, TLRPC.ChatFull chatFull, ViewGroup viewGroup, boolean z11, org.telegram.ui.ActionBar.h6 h6Var, boolean z12, boolean z13) {
        super(g2Var, z10, true, true, context, true, chatFull, viewGroup, z11, h6Var, z12, z13);
        this.W2 = chatActivityEnterView;
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        ChatActivityEnterView chatActivityEnterView = this.W2;
        if (chatActivityEnterView.W0 != null && chatActivityEnterView.f32609e4 == 0) {
            chatActivityEnterView.P3.x(f10);
        }
    }
}
