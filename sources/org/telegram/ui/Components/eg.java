package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;
public final class eg extends lz {
    public final ChatActivityEnterView P2;

    public eg(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.ActionBar.m2 m2Var, boolean z10, Context context, TLRPC.ChatFull chatFull, ViewGroup viewGroup, boolean z11, org.telegram.ui.ActionBar.d6 d6Var, boolean z12, boolean z13) {
        super(m2Var, z10, true, true, context, true, chatFull, viewGroup, z11, d6Var, z12, z13);
        this.P2 = chatActivityEnterView;
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        ChatActivityEnterView chatActivityEnterView = this.P2;
        if (chatActivityEnterView.V0 != null && chatActivityEnterView.f22025o3 == 0) {
            chatActivityEnterView.Z2.y(f7);
        }
    }
}
