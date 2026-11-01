package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;
public final class gf extends vy {
    public final ChatActivityEnterView V2;

    public gf(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.ActionBar.k2 k2Var, boolean z10, Context context, TLRPC.ChatFull chatFull, ViewGroup viewGroup, boolean z11, org.telegram.ui.ActionBar.p6 p6Var, boolean z12, boolean z13) {
        super(k2Var, z10, true, true, context, true, chatFull, viewGroup, z11, p6Var, z12, z13);
        this.V2 = chatActivityEnterView;
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        ChatActivityEnterView chatActivityEnterView = this.V2;
        if (chatActivityEnterView.V0 != null && chatActivityEnterView.f23762o3 == 0) {
            chatActivityEnterView.Z2.y(f7);
        }
    }
}
