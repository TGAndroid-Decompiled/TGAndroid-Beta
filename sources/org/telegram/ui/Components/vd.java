package org.telegram.ui.Components;

import android.view.View;
public final class vd implements View.OnLongClickListener {
    public final int f28688a;
    public final ChatActivityEnterView f28689b;

    public vd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f28688a = i10;
        this.f28689b = chatActivityEnterView;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i10 = this.f28688a;
        ChatActivityEnterView chatActivityEnterView = this.f28689b;
        switch (i10) {
            case 0:
                int i11 = ChatActivityEnterView.f21727n5;
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
