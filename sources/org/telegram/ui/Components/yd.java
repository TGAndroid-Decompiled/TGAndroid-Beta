package org.telegram.ui.Components;

import android.view.View;
public final class yd implements View.OnLongClickListener {
    public final int f33259a;
    public final ChatActivityEnterView f33260b;

    public yd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f33259a = i10;
        this.f33260b = chatActivityEnterView;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i10 = this.f33259a;
        ChatActivityEnterView chatActivityEnterView = this.f33260b;
        switch (i10) {
            case 0:
                int i11 = ChatActivityEnterView.f23854n5;
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
