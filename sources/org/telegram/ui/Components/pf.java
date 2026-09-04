package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
public final class pf implements zk0 {
    public final ChatActivityEnterView f29366a;

    public pf(ChatActivityEnterView chatActivityEnterView) {
        this.f29366a = chatActivityEnterView;
    }

    @Override
    public final void a(int i10, View view) {
        if (view instanceof fi.a0) {
            String command = ((fi.a0) view).getCommand();
            if (!TextUtils.isEmpty(command)) {
                ChatActivityEnterView chatActivityEnterView = this.f29366a;
                if (chatActivityEnterView.c()) {
                    e5.M(chatActivityEnterView.N2, chatActivityEnterView.P2, new b3(1, this, command), chatActivityEnterView.V3);
                    return;
                }
                org.telegram.ui.co coVar = chatActivityEnterView.O2;
                if (coVar == null || !coVar.e7(view)) {
                    e5.a0(chatActivityEnterView.Q, 1, chatActivityEnterView.P2, new org.telegram.ui.nf(10, this, command));
                }
            }
        }
    }
}
