package org.telegram.ui.Components;

import android.view.View;
public final class ue implements f5, mm0 {
    public final ChatActivityEnterView f31145a;

    public ue(ChatActivityEnterView chatActivityEnterView) {
        this.f31145a = chatActivityEnterView;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.f31145a;
        boolean W0 = chatActivityEnterView.W0(i10, z10, i11, true, 0L);
        rf rfVar = chatActivityEnterView.L0;
        if (rfVar != null) {
            rfVar.h(!W0);
            chatActivityEnterView.L0 = null;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        if (view instanceof ei.a0) {
            ChatActivityEnterView chatActivityEnterView = this.f31145a;
            chatActivityEnterView.setFieldText(((ei.a0) view).getCommand() + " ");
            chatActivityEnterView.m0.c();
            return true;
        }
        return false;
    }
}
