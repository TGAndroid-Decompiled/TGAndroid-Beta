package org.telegram.ui.Components;

import android.view.View;
public final class zc implements View.OnLongClickListener {
    public final int f33003a;
    public final ChatActivityEnterView f33004b;

    public zc(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f33003a = i10;
        this.f33004b = chatActivityEnterView;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i10 = this.f33003a;
        ChatActivityEnterView chatActivityEnterView = this.f33004b;
        switch (i10) {
            case 0:
                int i11 = ChatActivityEnterView.f23672s5;
                return chatActivityEnterView.D0(view);
            default:
                se seVar = chatActivityEnterView.E0;
                if (seVar != null && seVar.length() > 0) {
                    return chatActivityEnterView.D0(view);
                }
                return false;
        }
    }
}
