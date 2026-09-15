package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
public final class nf implements zk0 {
    public final ChatActivityEnterView f26447a;

    public nf(ChatActivityEnterView chatActivityEnterView) {
        this.f26447a = chatActivityEnterView;
    }

    @Override
    public final void d(int i10, View view) {
        if (view instanceof ei.a0) {
            String command = ((ei.a0) view).getCommand();
            if (!TextUtils.isEmpty(command)) {
                ChatActivityEnterView chatActivityEnterView = this.f26447a;
                if (chatActivityEnterView.c()) {
                    c5.M(chatActivityEnterView.N2, chatActivityEnterView.P2, new mf(0, this, command), chatActivityEnterView.V3);
                    return;
                }
                org.telegram.ui.bo boVar = chatActivityEnterView.O2;
                if (boVar == null || !boVar.e7(view)) {
                    c5.a0(chatActivityEnterView.Q, 1, chatActivityEnterView.P2, new org.telegram.ui.nf(10, this, command));
                }
            }
        }
    }
}
