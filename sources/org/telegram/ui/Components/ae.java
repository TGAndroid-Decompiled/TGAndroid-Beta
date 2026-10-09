package org.telegram.ui.Components;

import android.view.View;
public final class ae implements View.OnLongClickListener {
    public final int f24672a;
    public final ChatActivityEnterView f24673b;

    public ae(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f24672a = i10;
        this.f24673b = chatActivityEnterView;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i10 = this.f24672a;
        ChatActivityEnterView chatActivityEnterView = this.f24673b;
        switch (i10) {
            case 0:
                int i11 = ChatActivityEnterView.f23850n5;
                return chatActivityEnterView.D0(view);
            default:
                sf sfVar = chatActivityEnterView.E0;
                if (sfVar != null && sfVar.length() > 0) {
                    return chatActivityEnterView.D0(view);
                }
                return false;
        }
    }
}
