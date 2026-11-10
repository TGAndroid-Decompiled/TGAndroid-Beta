package org.telegram.ui.Components;

import android.view.View;
public final class fd implements View.OnLongClickListener {
    public final int f33524a;
    public final ChatActivityEnterView f33525b;

    public fd(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.f33524a = i7;
        this.f33525b = chatActivityEnterView;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i7 = this.f33524a;
        ChatActivityEnterView chatActivityEnterView = this.f33525b;
        switch (i7) {
            case 0:
                int i10 = ChatActivityEnterView.s5;
                return chatActivityEnterView.F0(view);
            default:
                we weVar = chatActivityEnterView.E0;
                if (weVar != null && weVar.length() > 0) {
                    return chatActivityEnterView.F0(view);
                }
                return false;
        }
    }
}
