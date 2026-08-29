package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
public final class hf implements zk0 {
    public final ChatActivityEnterView f29173a;

    public hf(ChatActivityEnterView chatActivityEnterView) {
        this.f29173a = chatActivityEnterView;
    }

    @Override
    public final void c(int i10, View view) {
        if (view instanceof ph.x) {
            String command = ((ph.x) view).getCommand();
            if (!TextUtils.isEmpty(command)) {
                ChatActivityEnterView chatActivityEnterView = this.f29173a;
                if (chatActivityEnterView.c()) {
                    c5.M(chatActivityEnterView.J2, chatActivityEnterView.L2, new j1(10, this, command), chatActivityEnterView.R3);
                    return;
                }
                org.telegram.ui.tn tnVar = chatActivityEnterView.K2;
                if (tnVar == null || !tnVar.e7(view)) {
                    c5.a0(chatActivityEnterView.M, 1, chatActivityEnterView.L2, new org.telegram.ui.tm(5, this, command));
                }
            }
        }
    }
}
