package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
public final class ff implements qj0 {
    public final ChatActivityEnterView f35217a;

    public ff(ChatActivityEnterView chatActivityEnterView) {
        this.f35217a = chatActivityEnterView;
    }

    @Override
    public final void c(int i7, View view) {
        if (view instanceof ki.w) {
            String command = ((ki.w) view).getCommand();
            if (!TextUtils.isEmpty(command)) {
                ChatActivityEnterView chatActivityEnterView = this.f35217a;
                if (chatActivityEnterView.c()) {
                    c5.J(chatActivityEnterView.E3, chatActivityEnterView.G3, new h2(7, this, command), chatActivityEnterView.M4);
                    return;
                }
                org.telegram.ui.bn bnVar = chatActivityEnterView.F3;
                if (bnVar == null || !bnVar.t7(view)) {
                    c5.X(chatActivityEnterView.R, 1, chatActivityEnterView.G3, new li.d(27, this, command));
                }
            }
        }
    }
}
