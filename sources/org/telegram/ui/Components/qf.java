package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
public final class qf implements jl0 {
    public final ChatActivityEnterView f26400a;

    public qf(ChatActivityEnterView chatActivityEnterView) {
        this.f26400a = chatActivityEnterView;
    }

    @Override
    public final void d(int i10, View view) {
        if (view instanceof di.d0) {
            String command = ((di.d0) view).getCommand();
            if (!TextUtils.isEmpty(command)) {
                ChatActivityEnterView chatActivityEnterView = this.f26400a;
                if (chatActivityEnterView.c()) {
                    d5.M(chatActivityEnterView.N2, chatActivityEnterView.P2, new org.telegram.ui.oe(26, this, command), chatActivityEnterView.V3);
                    return;
                }
                org.telegram.ui.eo eoVar = chatActivityEnterView.O2;
                if (eoVar == null || !eoVar.e7(view)) {
                    d5.a0(chatActivityEnterView.Q, 1, chatActivityEnterView.P2, new org.telegram.ui.pf(10, this, command));
                }
            }
        }
    }
}
