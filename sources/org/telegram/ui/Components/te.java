package org.telegram.ui.Components;

import android.view.View;
public final class te implements d5, ol0 {
    public final ChatActivityEnterView f31025a;

    public te(ChatActivityEnterView chatActivityEnterView) {
        this.f31025a = chatActivityEnterView;
    }

    @Override
    public void K(int i10, int i11, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.f31025a;
        boolean T0 = chatActivityEnterView.T0(i10, z10, i11, true, 0L);
        of ofVar = chatActivityEnterView.L0;
        if (ofVar != null) {
            ofVar.h(!T0);
            chatActivityEnterView.L0 = null;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        if (view instanceof ei.b0) {
            ChatActivityEnterView chatActivityEnterView = this.f31025a;
            chatActivityEnterView.setFieldText(((ei.b0) view).getCommand() + " ");
            chatActivityEnterView.m0.c();
            return true;
        }
        return false;
    }
}
