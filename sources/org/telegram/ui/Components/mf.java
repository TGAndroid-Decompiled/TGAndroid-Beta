package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;
public final class mf extends hy {
    public final ChatActivityEnterView V2;

    public mf(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.ActionBar.f2 f2Var, boolean z9, Context context, TLRPC.ChatFull chatFull, ViewGroup viewGroup, boolean z10, org.telegram.ui.ActionBar.f6 f6Var, boolean z11, boolean z12) {
        super(f2Var, z9, true, true, context, true, chatFull, viewGroup, z10, f6Var, z11, z12);
        this.V2 = chatActivityEnterView;
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        ChatActivityEnterView chatActivityEnterView = this.V2;
        if (chatActivityEnterView.V0 != null && chatActivityEnterView.f31101o3 == 0) {
            chatActivityEnterView.Z2.w(f10);
        }
    }
}
