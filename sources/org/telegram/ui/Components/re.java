package org.telegram.ui.Components;

import android.view.View;
public final class re implements d5, bl0 {
    public final ChatActivityEnterView f30018a;

    public re(ChatActivityEnterView chatActivityEnterView) {
        this.f30018a = chatActivityEnterView;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.f30018a;
        boolean T0 = chatActivityEnterView.T0(i10, z10, i11, true, 0L);
        nf nfVar = chatActivityEnterView.L0;
        if (nfVar != null) {
            nfVar.h(!T0);
            chatActivityEnterView.L0 = null;
        }
    }

    @Override
    public boolean a(int i10, View view) {
        if (view instanceof fi.a0) {
            ChatActivityEnterView chatActivityEnterView = this.f30018a;
            chatActivityEnterView.setFieldText(((fi.a0) view).getCommand() + " ");
            chatActivityEnterView.m0.c();
            return true;
        }
        return false;
    }
}
