package org.telegram.ui.Components;

import android.view.View;
public final class vd implements View.OnLongClickListener {
    public final int f28684a;
    public final ChatActivityEnterView f28685b;

    public vd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f28684a = i10;
        this.f28685b = chatActivityEnterView;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i10 = this.f28684a;
        ChatActivityEnterView chatActivityEnterView = this.f28685b;
        switch (i10) {
            case 0:
                int i11 = ChatActivityEnterView.f21741m5;
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
