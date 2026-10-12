package org.telegram.ui.Components;

import android.view.View;
public final class yd implements View.OnLongClickListener {
    public final int f31547a;
    public final ChatActivityEnterView f31548b;

    public yd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f31547a = i10;
        this.f31548b = chatActivityEnterView;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i10 = this.f31547a;
        ChatActivityEnterView chatActivityEnterView = this.f31548b;
        switch (i10) {
            case 0:
                int i11 = ChatActivityEnterView.f22849n5;
                return chatActivityEnterView.D0(view);
            default:
                rf rfVar = chatActivityEnterView.E0;
                if (rfVar != null && rfVar.length() > 0) {
                    return chatActivityEnterView.D0(view);
                }
                return false;
        }
    }
}
