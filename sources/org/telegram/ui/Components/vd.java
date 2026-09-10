package org.telegram.ui.Components;

import android.view.View;
public final class vd implements View.OnLongClickListener {
    public final int f27921a;
    public final ChatActivityEnterView f27922b;

    public vd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f27921a = i10;
        this.f27922b = chatActivityEnterView;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i10 = this.f27921a;
        ChatActivityEnterView chatActivityEnterView = this.f27922b;
        switch (i10) {
            case 0:
                int i11 = ChatActivityEnterView.f20816m5;
                return chatActivityEnterView.F0(view);
            default:
                rf rfVar = chatActivityEnterView.E0;
                if (rfVar != null && rfVar.length() > 0) {
                    return chatActivityEnterView.F0(view);
                }
                return false;
        }
    }
}
