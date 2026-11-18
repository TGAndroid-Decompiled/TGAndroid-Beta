package org.telegram.ui.Components;

import android.view.View;
public final class rd implements View.OnLongClickListener {
    public final int f39108a;
    public final ChatActivityEnterView f39109b;

    public rd(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.f39108a = i7;
        this.f39109b = chatActivityEnterView;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i7 = this.f39108a;
        ChatActivityEnterView chatActivityEnterView = this.f39109b;
        switch (i7) {
            case 0:
                int i10 = ChatActivityEnterView.f32538n7;
                return chatActivityEnterView.c1(view);
            default:
                gf gfVar = chatActivityEnterView.F0;
                if (gfVar != null && gfVar.length() > 0) {
                    return chatActivityEnterView.c1(view);
                }
                return false;
        }
    }
}
