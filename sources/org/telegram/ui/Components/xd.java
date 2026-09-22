package org.telegram.ui.Components;

import android.view.View;
public final class xd implements View.OnLongClickListener {
    public final int f30308a;
    public final ChatActivityEnterView f30309b;

    public xd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f30308a = i10;
        this.f30309b = chatActivityEnterView;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i10 = this.f30308a;
        ChatActivityEnterView chatActivityEnterView = this.f30309b;
        switch (i10) {
            case 0:
                int i11 = ChatActivityEnterView.f21967n5;
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
