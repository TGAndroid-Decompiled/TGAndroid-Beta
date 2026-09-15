package org.telegram.ui.Components;

import android.view.View;
public final class vd implements View.OnLongClickListener {
    public final int f28691a;
    public final ChatActivityEnterView f28692b;

    public vd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f28691a = i10;
        this.f28692b = chatActivityEnterView;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i10 = this.f28691a;
        ChatActivityEnterView chatActivityEnterView = this.f28692b;
        switch (i10) {
            case 0:
                int i11 = ChatActivityEnterView.f21731m5;
                return chatActivityEnterView.F0(view);
            default:
                of ofVar = chatActivityEnterView.E0;
                if (ofVar != null && ofVar.length() > 0) {
                    return chatActivityEnterView.F0(view);
                }
                return false;
        }
    }
}
