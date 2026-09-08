package org.telegram.ui.Components;

import android.view.View;
public final class xd implements View.OnLongClickListener {
    public final int f32545a;
    public final ChatActivityEnterView f32546b;

    public xd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f32545a = i10;
        this.f32546b = chatActivityEnterView;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i10 = this.f32545a;
        ChatActivityEnterView chatActivityEnterView = this.f32546b;
        switch (i10) {
            case 0:
                int i11 = ChatActivityEnterView.f23688m5;
                return chatActivityEnterView.F0(view);
            default:
                qf qfVar = chatActivityEnterView.E0;
                if (qfVar != null && qfVar.length() > 0) {
                    return chatActivityEnterView.F0(view);
                }
                return false;
        }
    }
}
