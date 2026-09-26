package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
public final class pf implements kl0 {
    public final ChatActivityEnterView f27331a;

    public pf(ChatActivityEnterView chatActivityEnterView) {
        this.f27331a = chatActivityEnterView;
    }

    @Override
    public final void d(int i10, View view) {
        if (view instanceof ei.a0) {
            String command = ((ei.a0) view).getCommand();
            if (!TextUtils.isEmpty(command)) {
                ChatActivityEnterView chatActivityEnterView = this.f27331a;
                if (chatActivityEnterView.c()) {
                    e5.M(chatActivityEnterView.O2, chatActivityEnterView.Q2, new w2(2, this, command), chatActivityEnterView.W3);
                    return;
                }
                org.telegram.ui.wn wnVar = chatActivityEnterView.P2;
                if (wnVar == null || !wnVar.e7(view)) {
                    e5.a0(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new org.telegram.ui.oc(15, this, command));
                }
            }
        }
    }
}
