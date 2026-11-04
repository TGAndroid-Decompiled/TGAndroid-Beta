package org.telegram.ui.Components;

import android.view.View;
public final class ed implements View.OnLongClickListener {
    public final int f33358a;
    public final ChatActivityEnterView f33359b;

    public ed(ChatActivityEnterView chatActivityEnterView, int i3) {
        this.f33358a = i3;
        this.f33359b = chatActivityEnterView;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i3 = this.f33358a;
        ChatActivityEnterView chatActivityEnterView = this.f33359b;
        switch (i3) {
            case 0:
                int i10 = ChatActivityEnterView.f31082t5;
                return chatActivityEnterView.E0(view);
            default:
                ve veVar = chatActivityEnterView.F0;
                if (veVar != null && veVar.length() > 0) {
                    return chatActivityEnterView.E0(view);
                }
                return false;
        }
    }
}
