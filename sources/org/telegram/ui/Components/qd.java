package org.telegram.ui.Components;

import android.view.View;
public final class qd implements View.OnLongClickListener {
    public final int f31921a;
    public final ChatActivityEnterView f31922b;

    public qd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f31921a = i10;
        this.f31922b = chatActivityEnterView;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i10 = this.f31921a;
        ChatActivityEnterView chatActivityEnterView = this.f31922b;
        switch (i10) {
            case 0:
                int i11 = ChatActivityEnterView.f26085i5;
                return chatActivityEnterView.F0(view);
            default:
                jf jfVar = chatActivityEnterView.A0;
                if (jfVar != null && jfVar.length() > 0) {
                    return chatActivityEnterView.F0(view);
                }
                return false;
        }
    }
}
