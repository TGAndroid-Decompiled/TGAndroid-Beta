package org.telegram.ui.Components;

import android.view.View;
public final class yd implements View.OnLongClickListener {
    public final int f30581a;
    public final ChatActivityEnterView f30582b;

    public yd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f30581a = i10;
        this.f30582b = chatActivityEnterView;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i10 = this.f30581a;
        ChatActivityEnterView chatActivityEnterView = this.f30582b;
        switch (i10) {
            case 0:
                int i11 = ChatActivityEnterView.f21938n5;
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
