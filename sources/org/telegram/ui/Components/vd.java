package org.telegram.ui.Components;

import android.view.View;
public final class vd implements q4, ik0 {
    public final ChatActivityEnterView f31215a;

    public vd(ChatActivityEnterView chatActivityEnterView) {
        this.f31215a = chatActivityEnterView;
    }

    @Override
    public void K(int i10, int i11, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.f31215a;
        boolean R0 = chatActivityEnterView.R0(z10, i10, i11, 0L, true);
        pe peVar = chatActivityEnterView.L0;
        if (peVar != null) {
            peVar.g(!R0);
            chatActivityEnterView.L0 = null;
        }
    }

    @Override
    public boolean f(int i10, View view) {
        if (view instanceof xh.u) {
            ChatActivityEnterView chatActivityEnterView = this.f31215a;
            chatActivityEnterView.setFieldText(((xh.u) view).getCommand() + " ");
            chatActivityEnterView.m0.c();
            return true;
        }
        return false;
    }
}
