package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
public final class gf implements qj0 {
    public final ChatActivityEnterView f35409a;

    public gf(ChatActivityEnterView chatActivityEnterView) {
        this.f35409a = chatActivityEnterView;
    }

    @Override
    public final void b(int i7, View view) {
        if (view instanceof ki.w) {
            String command = ((ki.w) view).getCommand();
            if (!TextUtils.isEmpty(command)) {
                ChatActivityEnterView chatActivityEnterView = this.f35409a;
                if (chatActivityEnterView.c()) {
                    b5.J(chatActivityEnterView.E3, chatActivityEnterView.G3, new g2(7, this, command), chatActivityEnterView.M4);
                    return;
                }
                org.telegram.ui.bn bnVar = chatActivityEnterView.F3;
                if (bnVar == null || !bnVar.t7(view)) {
                    b5.X(chatActivityEnterView.R, 1, chatActivityEnterView.G3, new ki.n2(28, this, command));
                }
            }
        }
    }
}
