package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
public final class of implements wl0 {
    public final ChatActivityEnterView f28979a;

    public of(ChatActivityEnterView chatActivityEnterView) {
        this.f28979a = chatActivityEnterView;
    }

    @Override
    public final void a(int i10, View view) {
        if (view instanceof gi.z) {
            String command = ((gi.z) view).getCommand();
            if (!TextUtils.isEmpty(command)) {
                ChatActivityEnterView chatActivityEnterView = this.f28979a;
                if (chatActivityEnterView.c()) {
                    f5.L(chatActivityEnterView.O2, chatActivityEnterView.Q2, new q2(command, 6, this), chatActivityEnterView.W3);
                    return;
                }
                org.telegram.ui.sn snVar = chatActivityEnterView.P2;
                if (snVar == null || !snVar.h7(view)) {
                    f5.Z(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new org.telegram.ui.ActionBar.j3(21, this, command));
                }
            }
        }
    }
}
