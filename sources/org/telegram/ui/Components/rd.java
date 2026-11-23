package org.telegram.ui.Components;

import android.view.View;
public final class rd implements View.OnLongClickListener {
    public final int f39115a;
    public final ChatActivityEnterView f39116b;

    public rd(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.f39115a = i7;
        this.f39116b = chatActivityEnterView;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i7 = this.f39115a;
        ChatActivityEnterView chatActivityEnterView = this.f39116b;
        switch (i7) {
            case 0:
                int i10 = ChatActivityEnterView.f32535s7;
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
