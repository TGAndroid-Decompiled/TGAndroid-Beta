package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;
public final class sf extends ly {
    public final ChatActivityEnterView W2;

    public sf(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.ActionBar.e2 e2Var, boolean z10, Context context, TLRPC.ChatFull chatFull, ViewGroup viewGroup, boolean z11, org.telegram.ui.ActionBar.e6 e6Var, boolean z12, boolean z13) {
        super(e2Var, z10, true, true, context, true, chatFull, viewGroup, z11, e6Var, z12, z13);
        this.W2 = chatActivityEnterView;
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        ChatActivityEnterView chatActivityEnterView = this.W2;
        if (chatActivityEnterView.W0 != null && chatActivityEnterView.W3 == 0) {
            chatActivityEnterView.H3.y(f10);
        }
    }
}
