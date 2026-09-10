package org.telegram.ui.Components;

import android.view.View;
public final class se implements c5, ll0 {
    public final ChatActivityEnterView f27008a;

    public se(ChatActivityEnterView chatActivityEnterView) {
        this.f27008a = chatActivityEnterView;
    }

    @Override
    public void I(int i10, int i11, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.f27008a;
        boolean T0 = chatActivityEnterView.T0(i10, z10, i11, true, 0L);
        of ofVar = chatActivityEnterView.L0;
        if (ofVar != null) {
            ofVar.h(!T0);
            chatActivityEnterView.L0 = null;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        if (view instanceof di.d0) {
            ChatActivityEnterView chatActivityEnterView = this.f27008a;
            chatActivityEnterView.setFieldText(((di.d0) view).getCommand() + " ");
            chatActivityEnterView.m0.c();
            return true;
        }
        return false;
    }
}
