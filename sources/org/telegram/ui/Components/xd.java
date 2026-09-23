package org.telegram.ui.Components;

import android.view.View;
public final class xd implements View.OnLongClickListener {
    public final int f29983a;
    public final ChatActivityEnterView f29984b;

    public xd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f29983a = i10;
        this.f29984b = chatActivityEnterView;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i10 = this.f29983a;
        ChatActivityEnterView chatActivityEnterView = this.f29984b;
        switch (i10) {
            case 0:
                int i11 = ChatActivityEnterView.f21701n5;
                return chatActivityEnterView.G0(view);
            default:
                pf pfVar = chatActivityEnterView.E0;
                if (pfVar != null && pfVar.length() > 0) {
                    return chatActivityEnterView.G0(view);
                }
                return false;
        }
    }
}
