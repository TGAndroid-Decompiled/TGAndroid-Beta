package org.telegram.ui.Components;

import android.view.View;
public final class rd implements View.OnLongClickListener {
    public final int f39161a;
    public final ChatActivityEnterView f39162b;

    public rd(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.f39161a = i7;
        this.f39162b = chatActivityEnterView;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i7 = this.f39161a;
        ChatActivityEnterView chatActivityEnterView = this.f39162b;
        switch (i7) {
            case 0:
                int i10 = ChatActivityEnterView.f32569s7;
                return chatActivityEnterView.g1(view);
            default:
                gf gfVar = chatActivityEnterView.F0;
                if (gfVar != null && gfVar.length() > 0) {
                    return chatActivityEnterView.g1(view);
                }
                return false;
        }
    }
}
