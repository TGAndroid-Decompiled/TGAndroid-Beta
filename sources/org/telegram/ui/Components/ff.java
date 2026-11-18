package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
public final class ff implements oj0 {
    public final ChatActivityEnterView f35074a;

    public ff(ChatActivityEnterView chatActivityEnterView) {
        this.f35074a = chatActivityEnterView;
    }

    @Override
    public final void c(int i7, View view) {
        if (view instanceof ki.x) {
            String command = ((ki.x) view).getCommand();
            if (!TextUtils.isEmpty(command)) {
                ChatActivityEnterView chatActivityEnterView = this.f35074a;
                if (chatActivityEnterView.c()) {
                    b5.J(chatActivityEnterView.C3, chatActivityEnterView.E3, new g2(7, this, command), chatActivityEnterView.K4);
                    return;
                }
                org.telegram.ui.bn bnVar = chatActivityEnterView.D3;
                if (bnVar == null || !bnVar.t7(view)) {
                    b5.X(chatActivityEnterView.R, 1, chatActivityEnterView.E3, new li.d(27, this, command));
                }
            }
        }
    }
}
