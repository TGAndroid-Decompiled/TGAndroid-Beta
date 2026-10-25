package org.telegram.ui.Components;

import android.view.View;
public final class xd implements View.OnLongClickListener {
    public final int f34695a;
    public final ChatActivityEnterView f34696b;

    public xd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f34695a = i10;
        this.f34696b = chatActivityEnterView;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i10 = this.f34695a;
        ChatActivityEnterView chatActivityEnterView = this.f34696b;
        switch (i10) {
            case 0:
                int i11 = ChatActivityEnterView.f25841r5;
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
