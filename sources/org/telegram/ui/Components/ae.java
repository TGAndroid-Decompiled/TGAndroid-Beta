package org.telegram.ui.Components;

import android.view.View;
public final class ae implements View.OnLongClickListener {
    public final int f24548a;
    public final ChatActivityEnterView f24549b;

    public ae(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f24548a = i10;
        this.f24549b = chatActivityEnterView;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i10 = this.f24548a;
        ChatActivityEnterView chatActivityEnterView = this.f24549b;
        switch (i10) {
            case 0:
                int i11 = ChatActivityEnterView.f23854n5;
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
