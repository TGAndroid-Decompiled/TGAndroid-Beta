package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;

public final class qf extends yy {
    public final ChatActivityEnterView L2;

    public qf(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.ActionBar.n2 n2Var, boolean z10, Context context, TLRPC.ChatFull chatFull, ViewGroup viewGroup, boolean z11, org.telegram.ui.ActionBar.c6 c6Var, boolean z12, boolean z13) {
        super(n2Var, z10, true, true, context, true, chatFull, viewGroup, z11, c6Var, z12, z13);
        this.L2 = chatActivityEnterView;
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        ChatActivityEnterView chatActivityEnterView = this.L2;
        if (chatActivityEnterView.R0 == null || chatActivityEnterView.f26130j3 != 0) {
            return;
        }
        chatActivityEnterView.U2.n(f10);
    }
}
