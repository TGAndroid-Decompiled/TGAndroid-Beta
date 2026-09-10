package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;
public final class fg extends rz {
    public final ChatActivityEnterView P2;

    public fg(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.ActionBar.p2 p2Var, boolean z10, Context context, TLRPC.ChatFull chatFull, ViewGroup viewGroup, boolean z11, org.telegram.ui.ActionBar.f6 f6Var, boolean z12, boolean z13) {
        super(p2Var, z10, true, true, context, true, chatFull, viewGroup, z11, f6Var, z12, z13);
        this.P2 = chatActivityEnterView;
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        ChatActivityEnterView chatActivityEnterView = this.P2;
        if (chatActivityEnterView.V0 != null && chatActivityEnterView.f20897n3 == 0) {
            chatActivityEnterView.Y2.y(f7);
        }
    }
}
