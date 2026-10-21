package org.telegram.ui.Components;

import android.view.View;
public final class wd implements View.OnLongClickListener {
    public final int f32091a;
    public final ChatActivityEnterView f32092b;

    public wd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f32091a = i10;
        this.f32092b = chatActivityEnterView;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i10 = this.f32091a;
        ChatActivityEnterView chatActivityEnterView = this.f32092b;
        switch (i10) {
            case 0:
                int i11 = ChatActivityEnterView.f23908n5;
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
