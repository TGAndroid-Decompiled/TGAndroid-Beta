package org.telegram.ui.Components;

import android.view.View;
public final class md implements View.OnLongClickListener {
    public final int f30795a;
    public final ChatActivityEnterView f30796b;

    public md(ChatActivityEnterView chatActivityEnterView, int i9) {
        this.f30795a = i9;
        this.f30796b = chatActivityEnterView;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i9 = this.f30795a;
        ChatActivityEnterView chatActivityEnterView = this.f30796b;
        switch (i9) {
            case 0:
                int i10 = ChatActivityEnterView.f26074i5;
                return chatActivityEnterView.E0(view);
            default:
                ff ffVar = chatActivityEnterView.A0;
                if (ffVar != null && ffVar.length() > 0) {
                    return chatActivityEnterView.E0(view);
                }
                return false;
        }
    }
}
