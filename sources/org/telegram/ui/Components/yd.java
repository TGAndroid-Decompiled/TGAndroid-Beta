package org.telegram.ui.Components;

import android.view.View;
public final class yd implements View.OnLongClickListener {
    public final int f30591a;
    public final ChatActivityEnterView f30592b;

    public yd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f30591a = i10;
        this.f30592b = chatActivityEnterView;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i10 = this.f30591a;
        ChatActivityEnterView chatActivityEnterView = this.f30592b;
        switch (i10) {
            case 0:
                int i11 = ChatActivityEnterView.f21952n5;
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
