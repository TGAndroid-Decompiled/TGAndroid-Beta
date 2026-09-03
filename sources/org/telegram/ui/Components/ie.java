package org.telegram.ui.Components;

import android.view.View;
public final class ie implements y4, jl0 {
    public final ChatActivityEnterView f25691a;

    public ie(ChatActivityEnterView chatActivityEnterView) {
        this.f25691a = chatActivityEnterView;
    }

    @Override
    public void J(int i10, int i11, boolean z4) {
        ChatActivityEnterView chatActivityEnterView = this.f25691a;
        boolean T0 = chatActivityEnterView.T0(i10, z4, i11, true, 0L);
        cf cfVar = chatActivityEnterView.I0;
        if (cfVar != null) {
            cfVar.h(!T0);
            chatActivityEnterView.I0 = null;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        if (view instanceof rh.x) {
            ChatActivityEnterView chatActivityEnterView = this.f25691a;
            chatActivityEnterView.setFieldText(((rh.x) view).getCommand() + " ");
            chatActivityEnterView.f22759j0.c();
            return true;
        }
        return false;
    }
}
