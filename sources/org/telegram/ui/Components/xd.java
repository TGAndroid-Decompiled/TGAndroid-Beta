package org.telegram.ui.Components;

import android.view.View;
public final class xd implements View.OnLongClickListener {
    public final int f34698a;
    public final ChatActivityEnterView f34699b;

    public xd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f34698a = i10;
        this.f34699b = chatActivityEnterView;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i10 = this.f34698a;
        ChatActivityEnterView chatActivityEnterView = this.f34699b;
        switch (i10) {
            case 0:
                int i11 = ChatActivityEnterView.f25843r5;
                return chatActivityEnterView.D0(view);
            default:
                pf pfVar = chatActivityEnterView.E0;
                if (pfVar != null && pfVar.length() > 0) {
                    return chatActivityEnterView.D0(view);
                }
                return false;
        }
    }
}
