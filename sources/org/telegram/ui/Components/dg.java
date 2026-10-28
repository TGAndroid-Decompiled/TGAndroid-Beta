package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;
public final class dg extends sz {
    public final ChatActivityEnterView V2;

    public dg(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.ActionBar.r2 r2Var, boolean z10, Context context, TLRPC.ChatFull chatFull, ViewGroup viewGroup, boolean z11, org.telegram.ui.ActionBar.u6 u6Var, boolean z12, boolean z13) {
        super(r2Var, z10, true, true, context, true, chatFull, viewGroup, z11, u6Var, z12, z13);
        this.V2 = chatActivityEnterView;
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        ChatActivityEnterView chatActivityEnterView = this.V2;
        if (chatActivityEnterView.V0 != null && chatActivityEnterView.f25934o3 == 0) {
            chatActivityEnterView.Z2.t(f7);
        }
    }
}
