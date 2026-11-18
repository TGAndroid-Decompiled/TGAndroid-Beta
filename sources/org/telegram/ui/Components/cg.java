package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;
public final class cg extends ry {
    public final ChatActivityEnterView W2;

    public cg(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.ActionBar.h2 h2Var, boolean z10, Context context, TLRPC.ChatFull chatFull, ViewGroup viewGroup, boolean z11, org.telegram.ui.ActionBar.i6 i6Var, boolean z12, boolean z13) {
        super(h2Var, z10, true, true, context, true, chatFull, viewGroup, z11, i6Var, z12, z13);
        this.W2 = chatActivityEnterView;
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        ChatActivityEnterView chatActivityEnterView = this.W2;
        if (chatActivityEnterView.W0 != null && chatActivityEnterView.f32562c4 == 0) {
            chatActivityEnterView.N3.x(f10);
        }
    }
}
