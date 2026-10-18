package org.telegram.ui.Components;

import android.view.View;
public final class wd implements View.OnLongClickListener {
    public final int f32113a;
    public final ChatActivityEnterView f32114b;

    public wd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f32113a = i10;
        this.f32114b = chatActivityEnterView;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i10 = this.f32113a;
        ChatActivityEnterView chatActivityEnterView = this.f32114b;
        switch (i10) {
            case 0:
                int i11 = ChatActivityEnterView.f23911n5;
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
