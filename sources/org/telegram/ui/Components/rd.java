package org.telegram.ui.Components;

import android.view.View;
public final class rd implements View.OnLongClickListener {
    public final int f39276a;
    public final ChatActivityEnterView f39277b;

    public rd(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.f39276a = i7;
        this.f39277b = chatActivityEnterView;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i7 = this.f39276a;
        ChatActivityEnterView chatActivityEnterView = this.f39277b;
        switch (i7) {
            case 0:
                int i10 = ChatActivityEnterView.f32633s7;
                return chatActivityEnterView.h1(view);
            default:
                hf hfVar = chatActivityEnterView.F0;
                if (hfVar != null && hfVar.length() > 0) {
                    return chatActivityEnterView.h1(view);
                }
                return false;
        }
    }
}
