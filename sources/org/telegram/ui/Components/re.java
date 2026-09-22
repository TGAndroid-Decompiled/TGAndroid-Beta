package org.telegram.ui.Components;

import android.view.View;
public final class re implements c5, ol0 {
    public final ChatActivityEnterView f27936a;

    public re(ChatActivityEnterView chatActivityEnterView) {
        this.f27936a = chatActivityEnterView;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.f27936a;
        boolean T0 = chatActivityEnterView.T0(i10, z10, i11, true, 0L);
        mf mfVar = chatActivityEnterView.L0;
        if (mfVar != null) {
            mfVar.h(!T0);
            chatActivityEnterView.L0 = null;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        if (view instanceof ei.a0) {
            ChatActivityEnterView chatActivityEnterView = this.f27936a;
            chatActivityEnterView.setFieldText(((ei.a0) view).getCommand() + " ");
            chatActivityEnterView.m0.c();
            return true;
        }
        return false;
    }
}
