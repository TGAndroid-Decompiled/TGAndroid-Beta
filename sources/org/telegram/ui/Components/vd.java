package org.telegram.ui.Components;

import android.view.View;
public final class vd implements View.OnLongClickListener {
    public final int f28687a;
    public final ChatActivityEnterView f28688b;

    public vd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f28687a = i10;
        this.f28688b = chatActivityEnterView;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i10 = this.f28687a;
        ChatActivityEnterView chatActivityEnterView = this.f28688b;
        switch (i10) {
            case 0:
                int i11 = ChatActivityEnterView.f21743n5;
                return chatActivityEnterView.G0(view);
            default:
                of ofVar = chatActivityEnterView.E0;
                if (ofVar != null && ofVar.length() > 0) {
                    return chatActivityEnterView.G0(view);
                }
                return false;
        }
    }
}
