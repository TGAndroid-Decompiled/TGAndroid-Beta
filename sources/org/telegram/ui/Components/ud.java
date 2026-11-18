package org.telegram.ui.Components;

import android.graphics.Canvas;
import org.telegram.tgnet.tl.TL_iv;
public final class ud implements org.telegram.messenger.x10 {
    public final int f40302a;
    public final ChatActivityEnterView f40303b;

    public ud(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.f40302a = i7;
        this.f40303b = chatActivityEnterView;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f40302a;
        ChatActivityEnterView chatActivityEnterView = this.f40303b;
        switch (i7) {
            case 0:
                int i10 = ChatActivityEnterView.f32538n7;
                chatActivityEnterView.r0((Canvas) obj, false);
                return;
            case 1:
                chatActivityEnterView.p1((TL_iv.RichMessage) obj);
                return;
            default:
                CharSequence charSequence = (CharSequence) obj;
                chatActivityEnterView.F0.setText(charSequence);
                chatActivityEnterView.F0.setSelection(charSequence.length(), charSequence.length());
                return;
        }
    }
}
