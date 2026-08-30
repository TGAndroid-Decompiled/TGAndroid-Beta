package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;
public final class uf extends kz {
    public final ChatActivityEnterView M2;

    public uf(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.ActionBar.p2 p2Var, boolean z4, Context context, TLRPC.ChatFull chatFull, ViewGroup viewGroup, boolean z10, org.telegram.ui.ActionBar.f6 f6Var, boolean z11, boolean z12) {
        super(p2Var, z4, true, true, context, true, chatFull, viewGroup, z10, f6Var, z11, z12);
        this.M2 = chatActivityEnterView;
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        ChatActivityEnterView chatActivityEnterView = this.M2;
        if (chatActivityEnterView.S0 != null && chatActivityEnterView.f22794k3 == 0) {
            chatActivityEnterView.V2.x(f10);
        }
    }
}
