package org.telegram.ui.Components;

import android.view.View;
public final class wd implements View.OnLongClickListener {
    public final int f32106a;
    public final ChatActivityEnterView f32107b;

    public wd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f32106a = i10;
        this.f32107b = chatActivityEnterView;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i10 = this.f32106a;
        ChatActivityEnterView chatActivityEnterView = this.f32107b;
        switch (i10) {
            case 0:
                int i11 = ChatActivityEnterView.f23904n5;
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
