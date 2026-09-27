package org.telegram.ui.Components;

import android.view.View;
public final class xd implements View.OnLongClickListener {
    public final int f30393a;
    public final ChatActivityEnterView f30394b;

    public xd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f30393a = i10;
        this.f30394b = chatActivityEnterView;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i10 = this.f30393a;
        ChatActivityEnterView chatActivityEnterView = this.f30394b;
        switch (i10) {
            case 0:
                int i11 = ChatActivityEnterView.f21955n5;
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
