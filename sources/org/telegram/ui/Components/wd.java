package org.telegram.ui.Components;

import android.view.View;
public final class wd implements View.OnLongClickListener {
    public final int f32103a;
    public final ChatActivityEnterView f32104b;

    public wd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f32103a = i10;
        this.f32104b = chatActivityEnterView;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i10 = this.f32103a;
        ChatActivityEnterView chatActivityEnterView = this.f32104b;
        switch (i10) {
            case 0:
                int i11 = ChatActivityEnterView.f23905n5;
                return chatActivityEnterView.D0(view);
            default:
                pf pfVar = chatActivityEnterView.E0;
                if (pfVar != null && pfVar.length() > 0) {
                    return chatActivityEnterView.D0(view);
                }
                return false;
        }
    }
}
