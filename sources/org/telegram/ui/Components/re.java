package org.telegram.ui.Components;

import android.view.View;
public final class re implements e5, yl0 {
    public final ChatActivityEnterView f29919a;

    public re(ChatActivityEnterView chatActivityEnterView) {
        this.f29919a = chatActivityEnterView;
    }

    @Override
    public void C(int i10, int i11, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.f29919a;
        boolean R0 = chatActivityEnterView.R0(i10, z10, i11, true, 0L);
        mf mfVar = chatActivityEnterView.L0;
        if (mfVar != null) {
            mfVar.h(!R0);
            chatActivityEnterView.L0 = null;
        }
    }

    @Override
    public boolean a(int i10, View view) {
        if (view instanceof gi.z) {
            ChatActivityEnterView chatActivityEnterView = this.f29919a;
            chatActivityEnterView.setFieldText(((gi.z) view).getCommand() + " ");
            chatActivityEnterView.m0.c();
            return true;
        }
        return false;
    }
}
