package org.telegram.ui.Components;

import android.view.View;
public final class wd implements View.OnLongClickListener {
    public final int f32228a;
    public final ChatActivityEnterView f32229b;

    public wd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f32228a = i10;
        this.f32229b = chatActivityEnterView;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i10 = this.f32228a;
        ChatActivityEnterView chatActivityEnterView = this.f32229b;
        switch (i10) {
            case 0:
                int i11 = ChatActivityEnterView.f24050r5;
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
