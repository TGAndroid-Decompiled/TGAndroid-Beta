package org.telegram.ui.Components;

import android.view.View;
public final class se implements f5, cm0 {
    public final ChatActivityEnterView f28827a;

    public se(ChatActivityEnterView chatActivityEnterView) {
        this.f28827a = chatActivityEnterView;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.f28827a;
        boolean R0 = chatActivityEnterView.R0(i10, z10, i11, true, 0L);
        of ofVar = chatActivityEnterView.L0;
        if (ofVar != null) {
            ofVar.h(!R0);
            chatActivityEnterView.L0 = null;
        }
    }

    @Override
    public boolean a(int i10, View view) {
        if (view instanceof fi.z) {
            ChatActivityEnterView chatActivityEnterView = this.f28827a;
            chatActivityEnterView.setFieldText(((fi.z) view).getCommand() + " ");
            chatActivityEnterView.m0.c();
            return true;
        }
        return false;
    }
}
