package org.telegram.ui.Components;

import android.view.View;
public final class xd implements View.OnLongClickListener {
    public final int f32519a;
    public final ChatActivityEnterView f32520b;

    public xd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f32519a = i10;
        this.f32520b = chatActivityEnterView;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i10 = this.f32519a;
        ChatActivityEnterView chatActivityEnterView = this.f32520b;
        switch (i10) {
            case 0:
                int i11 = ChatActivityEnterView.f23662m5;
                return chatActivityEnterView.F0(view);
            default:
                qf qfVar = chatActivityEnterView.E0;
                if (qfVar != null && qfVar.length() > 0) {
                    return chatActivityEnterView.F0(view);
                }
                return false;
        }
    }
}
