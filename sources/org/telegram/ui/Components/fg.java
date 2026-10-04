package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;
public final class fg extends nz {
    public final ChatActivityEnterView N2;

    public fg(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.ActionBar.n2 n2Var, boolean z10, Context context, TLRPC.ChatFull chatFull, ViewGroup viewGroup, boolean z11, org.telegram.ui.ActionBar.d6 d6Var, boolean z12, boolean z13) {
        super(n2Var, z10, true, true, context, true, chatFull, viewGroup, z11, d6Var, z12, z13);
        this.N2 = chatActivityEnterView;
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        ChatActivityEnterView chatActivityEnterView = this.N2;
        if (chatActivityEnterView.V0 != null && chatActivityEnterView.f23935o3 == 0) {
            chatActivityEnterView.Z2.y(f7);
        }
    }
}
