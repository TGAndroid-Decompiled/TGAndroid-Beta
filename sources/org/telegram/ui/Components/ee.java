package org.telegram.ui.Components;

import android.view.View;
public final class ee implements View.OnLongClickListener {
    public final int f25676a;
    public final ChatActivityEnterView f25677b;

    public ee(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f25676a = i10;
        this.f25677b = chatActivityEnterView;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i10 = this.f25676a;
        ChatActivityEnterView chatActivityEnterView = this.f25677b;
        switch (i10) {
            case 0:
                int i11 = ChatActivityEnterView.Q5;
                return chatActivityEnterView.H0(view);
            default:
                uf ufVar = chatActivityEnterView.E0;
                if (ufVar != null && ufVar.length() > 0) {
                    return chatActivityEnterView.H0(view);
                }
                return false;
        }
    }
}
