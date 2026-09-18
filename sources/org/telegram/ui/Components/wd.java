package org.telegram.ui.Components;

import android.view.View;
public final class wd implements View.OnLongClickListener {
    public final int f30025a;
    public final ChatActivityEnterView f30026b;

    public wd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f30025a = i10;
        this.f30026b = chatActivityEnterView;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i10 = this.f30025a;
        ChatActivityEnterView chatActivityEnterView = this.f30026b;
        switch (i10) {
            case 0:
                int i11 = ChatActivityEnterView.f21917m5;
                return chatActivityEnterView.F0(view);
            default:
                pf pfVar = chatActivityEnterView.E0;
                if (pfVar != null && pfVar.length() > 0) {
                    return chatActivityEnterView.F0(view);
                }
                return false;
        }
    }
}
