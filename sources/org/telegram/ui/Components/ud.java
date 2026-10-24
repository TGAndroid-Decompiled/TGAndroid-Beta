package org.telegram.ui.Components;

import android.view.View;
public final class ud implements View.OnLongClickListener {
    public final int f31097a;
    public final ChatActivityEnterView f31098b;

    public ud(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f31097a = i10;
        this.f31098b = chatActivityEnterView;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i10 = this.f31097a;
        ChatActivityEnterView chatActivityEnterView = this.f31098b;
        switch (i10) {
            case 0:
                int i11 = ChatActivityEnterView.f24051r5;
                return chatActivityEnterView.D0(view);
            default:
                nf nfVar = chatActivityEnterView.E0;
                if (nfVar != null && nfVar.length() > 0) {
                    return chatActivityEnterView.D0(view);
                }
                return false;
        }
    }
}
