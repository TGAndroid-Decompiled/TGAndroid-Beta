package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
public final class qf implements ml0 {
    public final ChatActivityEnterView f30021a;

    public qf(ChatActivityEnterView chatActivityEnterView) {
        this.f30021a = chatActivityEnterView;
    }

    @Override
    public final void d(int i10, View view) {
        if (view instanceof ei.b0) {
            String command = ((ei.b0) view).getCommand();
            if (!TextUtils.isEmpty(command)) {
                ChatActivityEnterView chatActivityEnterView = this.f30021a;
                if (chatActivityEnterView.c()) {
                    e5.M(chatActivityEnterView.O2, chatActivityEnterView.Q2, new w2(this, command, false, 3), chatActivityEnterView.W3);
                    return;
                }
                org.telegram.ui.yn ynVar = chatActivityEnterView.P2;
                if (ynVar == null || !ynVar.e7(view)) {
                    e5.a0(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new org.telegram.ui.qc(15, this, command));
                }
            }
        }
    }
}
