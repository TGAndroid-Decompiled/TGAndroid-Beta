package org.telegram.ui.Components;

import android.view.View;
public final class zd implements View.OnLongClickListener {
    public final int f30954a;
    public final ChatActivityEnterView f30955b;

    public zd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f30954a = i10;
        this.f30955b = chatActivityEnterView;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i10 = this.f30954a;
        ChatActivityEnterView chatActivityEnterView = this.f30955b;
        switch (i10) {
            case 0:
                int i11 = ChatActivityEnterView.f21974n5;
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
