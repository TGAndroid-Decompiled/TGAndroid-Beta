package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;
public final class eg extends mz {
    public final ChatActivityEnterView N2;

    public eg(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.ActionBar.o2 o2Var, boolean z10, Context context, TLRPC.ChatFull chatFull, ViewGroup viewGroup, boolean z11, org.telegram.ui.ActionBar.e6 e6Var, boolean z12, boolean z13) {
        super(o2Var, z10, true, true, context, true, chatFull, viewGroup, z11, e6Var, z12, z13);
        this.N2 = chatActivityEnterView;
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        ChatActivityEnterView chatActivityEnterView = this.N2;
        if (chatActivityEnterView.V0 != null && chatActivityEnterView.f22042o3 == 0) {
            chatActivityEnterView.Z2.y(f7);
        }
    }
}
