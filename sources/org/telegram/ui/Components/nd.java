package org.telegram.ui.Components;

import android.view.View;
public final class nd implements View.OnLongClickListener {
    public final int f27238a;
    public final ChatActivityEnterView f27239b;

    public nd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f27238a = i10;
        this.f27239b = chatActivityEnterView;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i10 = this.f27238a;
        ChatActivityEnterView chatActivityEnterView = this.f27239b;
        switch (i10) {
            case 0:
                int i11 = ChatActivityEnterView.f22702j5;
                return chatActivityEnterView.F0(view);
            default:
                ff ffVar = chatActivityEnterView.B0;
                if (ffVar != null && ffVar.length() > 0) {
                    return chatActivityEnterView.F0(view);
                }
                return false;
        }
    }
}
