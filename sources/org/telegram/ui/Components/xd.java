package org.telegram.ui.Components;

import android.view.View;
public final class xd implements View.OnLongClickListener {
    public final int f30242a;
    public final ChatActivityEnterView f30243b;

    public xd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f30242a = i10;
        this.f30243b = chatActivityEnterView;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i10 = this.f30242a;
        ChatActivityEnterView chatActivityEnterView = this.f30243b;
        switch (i10) {
            case 0:
                int i11 = ChatActivityEnterView.f21952m5;
                return chatActivityEnterView.F0(view);
            default:
                pf pfVar = chatActivityEnterView.E0;
                if (pfVar != null && pfVar.length() > 0) {
                    return chatActivityEnterView.F0(view);
                }
                return false;
        }
    }
}
