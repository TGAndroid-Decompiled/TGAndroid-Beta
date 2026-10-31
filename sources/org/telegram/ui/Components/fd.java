package org.telegram.ui.Components;

import android.graphics.Canvas;
import org.telegram.tgnet.tl.TL_iv;
public final class fd implements org.telegram.messenger.q20 {
    public final int f26031a;
    public final ChatActivityEnterView f26032b;

    public fd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f26031a = i10;
        this.f26032b = chatActivityEnterView;
    }

    @Override
    public final void a(Object obj) {
        int i10 = this.f26031a;
        ChatActivityEnterView chatActivityEnterView = this.f26032b;
        switch (i10) {
            case 0:
                chatActivityEnterView.O0((TL_iv.RichMessage) obj);
                return;
            case 1:
                CharSequence charSequence = (CharSequence) obj;
                chatActivityEnterView.E0.setText(charSequence);
                chatActivityEnterView.E0.setSelection(charSequence.length(), charSequence.length());
                return;
            default:
                int i11 = ChatActivityEnterView.f23672s5;
                chatActivityEnterView.a0((Canvas) obj, false);
                return;
        }
    }
}
