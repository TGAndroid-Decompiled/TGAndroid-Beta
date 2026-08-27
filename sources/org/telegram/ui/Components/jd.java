package org.telegram.ui.Components;

import android.view.View;

public final class jd implements View.OnLongClickListener {

    public final int f29675a;

    public final ChatActivityEnterView f29676b;

    public jd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f29675a = i10;
        this.f29676b = chatActivityEnterView;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i10 = this.f29675a;
        ChatActivityEnterView chatActivityEnterView = this.f29676b;
        switch (i10) {
            case 0:
                int i11 = ChatActivityEnterView.f26070i5;
                return chatActivityEnterView.F0(view);
            default:
                bf bfVar = chatActivityEnterView.A0;
                if (bfVar == null || bfVar.length() <= 0) {
                    return false;
                }
                return chatActivityEnterView.F0(view);
        }
    }
}
