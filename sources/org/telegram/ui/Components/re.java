package org.telegram.ui.Components;

import android.view.View;
public final class re implements e5, bm0 {
    public final ChatActivityEnterView f32237a;

    public re(ChatActivityEnterView chatActivityEnterView) {
        this.f32237a = chatActivityEnterView;
    }

    @Override
    public void G(int i10, int i11, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.f32237a;
        boolean R0 = chatActivityEnterView.R0(i10, z10, i11, true, 0L);
        mf mfVar = chatActivityEnterView.L0;
        if (mfVar != null) {
            mfVar.g(!R0);
            chatActivityEnterView.L0 = null;
        }
    }

    @Override
    public boolean c(int i10, View view) {
        if (view instanceof hi.g0) {
            ChatActivityEnterView chatActivityEnterView = this.f32237a;
            chatActivityEnterView.setFieldText(((hi.g0) view).getCommand() + " ");
            chatActivityEnterView.m0.c();
            return true;
        }
        return false;
    }
}
