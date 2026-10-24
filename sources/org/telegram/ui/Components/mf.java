package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
public final class mf implements zl0 {
    public final ChatActivityEnterView f28590a;

    public mf(ChatActivityEnterView chatActivityEnterView) {
        this.f28590a = chatActivityEnterView;
    }

    @Override
    public final void d(int i10, View view) {
        if (view instanceof gi.z) {
            String command = ((gi.z) view).getCommand();
            if (!TextUtils.isEmpty(command)) {
                ChatActivityEnterView chatActivityEnterView = this.f28590a;
                if (chatActivityEnterView.c()) {
                    d5.L(chatActivityEnterView.O2, chatActivityEnterView.Q2, new o2(command, 6, this), chatActivityEnterView.W3);
                    return;
                }
                org.telegram.ui.sn snVar = chatActivityEnterView.P2;
                if (snVar == null || !snVar.h7(view)) {
                    d5.Z(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new org.telegram.ui.ActionBar.m3(21, this, command));
                }
            }
        }
    }
}
