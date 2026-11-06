package org.telegram.ui.Components;

import android.view.View;
public final class gd implements View.OnLongClickListener {
    public final int f33895a;
    public final ChatActivityEnterView f33896b;

    public gd(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.f33895a = i7;
        this.f33896b = chatActivityEnterView;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i7 = this.f33895a;
        ChatActivityEnterView chatActivityEnterView = this.f33896b;
        switch (i7) {
            case 0:
                int i10 = ChatActivityEnterView.s5;
                return chatActivityEnterView.F0(view);
            default:
                xe xeVar = chatActivityEnterView.E0;
                if (xeVar != null && xeVar.length() > 0) {
                    return chatActivityEnterView.F0(view);
                }
                return false;
        }
    }
}
