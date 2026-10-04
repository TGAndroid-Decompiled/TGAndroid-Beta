package org.telegram.ui.Components;

import android.view.View;
public final class yd implements View.OnLongClickListener {
    public final int f33136a;
    public final ChatActivityEnterView f33137b;

    public yd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f33136a = i10;
        this.f33137b = chatActivityEnterView;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i10 = this.f33136a;
        ChatActivityEnterView chatActivityEnterView = this.f33137b;
        switch (i10) {
            case 0:
                int i11 = ChatActivityEnterView.f23847n5;
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
