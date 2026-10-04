package org.telegram.ui.Components;

import android.view.View;
public final class yd implements View.OnLongClickListener {
    public final int f33142a;
    public final ChatActivityEnterView f33143b;

    public yd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f33142a = i10;
        this.f33143b = chatActivityEnterView;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i10 = this.f33142a;
        ChatActivityEnterView chatActivityEnterView = this.f33143b;
        switch (i10) {
            case 0:
                int i11 = ChatActivityEnterView.f23851n5;
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
