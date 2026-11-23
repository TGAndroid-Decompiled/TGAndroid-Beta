package org.telegram.ui.Components;

import android.graphics.Canvas;
import org.telegram.tgnet.tl.TL_iv;
public final class ud implements org.telegram.messenger.y10 {
    public final int f40319a;
    public final ChatActivityEnterView f40320b;

    public ud(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.f40319a = i7;
        this.f40320b = chatActivityEnterView;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f40319a;
        ChatActivityEnterView chatActivityEnterView = this.f40320b;
        switch (i7) {
            case 0:
                int i10 = ChatActivityEnterView.f32569s7;
                chatActivityEnterView.v0((Canvas) obj, false);
                return;
            case 1:
                chatActivityEnterView.t1((TL_iv.RichMessage) obj);
                return;
            default:
                CharSequence charSequence = (CharSequence) obj;
                chatActivityEnterView.F0.setText(charSequence);
                chatActivityEnterView.F0.setSelection(charSequence.length(), charSequence.length());
                return;
        }
    }
}
