package org.telegram.ui.Components;

import android.view.View;
public final class xd implements View.OnLongClickListener {
    public final int f34730a;
    public final ChatActivityEnterView f34731b;

    public xd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f34730a = i10;
        this.f34731b = chatActivityEnterView;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i10 = this.f34730a;
        ChatActivityEnterView chatActivityEnterView = this.f34731b;
        switch (i10) {
            case 0:
                int i11 = ChatActivityEnterView.f25845r5;
                return chatActivityEnterView.C0(view);
            default:
                pf pfVar = chatActivityEnterView.E0;
                if (pfVar != null && pfVar.length() > 0) {
                    return chatActivityEnterView.C0(view);
                }
                return false;
        }
    }
}
