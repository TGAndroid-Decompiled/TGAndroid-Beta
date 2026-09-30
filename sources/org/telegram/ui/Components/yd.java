package org.telegram.ui.Components;

import android.view.View;
public final class yd implements View.OnLongClickListener {
    public final int f30643a;
    public final ChatActivityEnterView f30644b;

    public yd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f30643a = i10;
        this.f30644b = chatActivityEnterView;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i10 = this.f30643a;
        ChatActivityEnterView chatActivityEnterView = this.f30644b;
        switch (i10) {
            case 0:
                int i11 = ChatActivityEnterView.f21954n5;
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
