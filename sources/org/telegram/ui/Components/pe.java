package org.telegram.ui.Components;

import android.view.View;
public final class pe implements b5, bm0 {
    public final ChatActivityEnterView f29549a;

    public pe(ChatActivityEnterView chatActivityEnterView) {
        this.f29549a = chatActivityEnterView;
    }

    @Override
    public void C(int i10, int i11, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.f29549a;
        boolean R0 = chatActivityEnterView.R0(i10, z10, i11, true, 0L);
        kf kfVar = chatActivityEnterView.L0;
        if (kfVar != null) {
            kfVar.g(!R0);
            chatActivityEnterView.L0 = null;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        if (view instanceof gi.z) {
            ChatActivityEnterView chatActivityEnterView = this.f29549a;
            chatActivityEnterView.setFieldText(((gi.z) view).getCommand() + " ");
            chatActivityEnterView.m0.c();
            return true;
        }
        return false;
    }
}
