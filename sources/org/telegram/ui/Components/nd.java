package org.telegram.ui.Components;

import android.view.View;
public final class nd implements View.OnLongClickListener {
    public final int f29457a;
    public final ChatActivityEnterView f29458b;

    public nd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f29457a = i10;
        this.f29458b = chatActivityEnterView;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i10 = this.f29457a;
        ChatActivityEnterView chatActivityEnterView = this.f29458b;
        switch (i10) {
            case 0:
                int i11 = ChatActivityEnterView.f24568j5;
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
