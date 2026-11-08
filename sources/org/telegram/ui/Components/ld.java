package org.telegram.ui.Components;

import android.graphics.Canvas;
import org.telegram.tgnet.tl.TL_iv;
public final class ld implements org.telegram.messenger.c20 {
    public final int f35668a;
    public final ChatActivityEnterView f35669b;

    public ld(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.f35668a = i7;
        this.f35669b = chatActivityEnterView;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f35668a;
        ChatActivityEnterView chatActivityEnterView = this.f35669b;
        switch (i7) {
            case 0:
                chatActivityEnterView.Q0((TL_iv.RichMessage) obj);
                return;
            case 1:
                CharSequence charSequence = (CharSequence) obj;
                chatActivityEnterView.E0.setText(charSequence);
                chatActivityEnterView.E0.setSelection(charSequence.length(), charSequence.length());
                return;
            default:
                int i10 = ChatActivityEnterView.s5;
                chatActivityEnterView.b0((Canvas) obj, false);
                return;
        }
    }
}
