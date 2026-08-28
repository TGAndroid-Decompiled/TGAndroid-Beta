package org.telegram.ui.Components;

import android.view.View;
public final class ie implements x4, ok0 {
    public final ChatActivityEnterView f29421a;

    public ie(ChatActivityEnterView chatActivityEnterView) {
        this.f29421a = chatActivityEnterView;
    }

    @Override
    public void B(int i9, int i10, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.f29421a;
        boolean T0 = chatActivityEnterView.T0(i9, z10, i10, true, 0L);
        cf cfVar = chatActivityEnterView.H0;
        if (cfVar != null) {
            cfVar.h(!T0);
            chatActivityEnterView.H0 = null;
        }
    }

    @Override
    public boolean a(int i9, View view) {
        if (view instanceof mh.a0) {
            ChatActivityEnterView chatActivityEnterView = this.f29421a;
            chatActivityEnterView.setFieldText(((mh.a0) view).getCommand() + " ");
            chatActivityEnterView.f26126i0.c();
            return true;
        }
        return false;
    }
}
