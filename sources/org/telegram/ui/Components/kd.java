package org.telegram.ui.Components;

import android.graphics.Canvas;
import org.telegram.tgnet.tl.TL_iv;
public final class kd implements org.telegram.messenger.z10 {
    public final int f36387a;
    public final ChatActivityEnterView f36388b;

    public kd(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.f36387a = i7;
        this.f36388b = chatActivityEnterView;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f36387a;
        ChatActivityEnterView chatActivityEnterView = this.f36388b;
        switch (i7) {
            case 0:
                chatActivityEnterView.h1((TL_iv.RichMessage) obj);
                return;
            case 1:
                CharSequence charSequence = (CharSequence) obj;
                chatActivityEnterView.F0.setText(charSequence);
                chatActivityEnterView.F0.setSelection(charSequence.length(), charSequence.length());
                return;
            default:
                int i10 = ChatActivityEnterView.N6;
                chatActivityEnterView.k0((Canvas) obj, false);
                return;
        }
    }
}
