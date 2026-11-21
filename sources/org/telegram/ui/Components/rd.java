package org.telegram.ui.Components;

import android.view.View;
public final class rd implements View.OnLongClickListener {
    public final int f39151a;
    public final ChatActivityEnterView f39152b;

    public rd(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.f39151a = i7;
        this.f39152b = chatActivityEnterView;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i7 = this.f39151a;
        ChatActivityEnterView chatActivityEnterView = this.f39152b;
        switch (i7) {
            case 0:
                int i10 = ChatActivityEnterView.f32566s7;
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
