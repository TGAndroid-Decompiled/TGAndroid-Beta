package org.telegram.ui.Components;

import android.view.View;
public final class wd implements View.OnLongClickListener {
    public final int f32105a;
    public final ChatActivityEnterView f32106b;

    public wd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f32105a = i10;
        this.f32106b = chatActivityEnterView;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i10 = this.f32105a;
        ChatActivityEnterView chatActivityEnterView = this.f32106b;
        switch (i10) {
            case 0:
                int i11 = ChatActivityEnterView.f23907n5;
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
