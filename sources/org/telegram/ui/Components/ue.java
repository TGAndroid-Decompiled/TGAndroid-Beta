package org.telegram.ui.Components;

import android.view.View;
public final class ue implements f5, im0 {
    public final ChatActivityEnterView f31401a;

    public ue(ChatActivityEnterView chatActivityEnterView) {
        this.f31401a = chatActivityEnterView;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.f31401a;
        boolean R0 = chatActivityEnterView.R0(i10, z10, i11, true, 0L);
        pf pfVar = chatActivityEnterView.L0;
        if (pfVar != null) {
            pfVar.h(!R0);
            chatActivityEnterView.L0 = null;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        if (view instanceof ei.a0) {
            ChatActivityEnterView chatActivityEnterView = this.f31401a;
            chatActivityEnterView.setFieldText(((ei.a0) view).getCommand() + " ");
            chatActivityEnterView.m0.c();
            return true;
        }
        return false;
    }
}
