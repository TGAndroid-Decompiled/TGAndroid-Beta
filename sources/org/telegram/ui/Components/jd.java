package org.telegram.ui.Components;

import android.view.View;
public final class jd implements View.OnLongClickListener {
    public final int f35966a;
    public final ChatActivityEnterView f35967b;

    public jd(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.f35966a = i7;
        this.f35967b = chatActivityEnterView;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i7 = this.f35966a;
        ChatActivityEnterView chatActivityEnterView = this.f35967b;
        switch (i7) {
            case 0:
                int i10 = ChatActivityEnterView.N6;
                return chatActivityEnterView.U0(view);
            default:
                xe xeVar = chatActivityEnterView.F0;
                if (xeVar != null && xeVar.length() > 0) {
                    return chatActivityEnterView.U0(view);
                }
                return false;
        }
    }
}
