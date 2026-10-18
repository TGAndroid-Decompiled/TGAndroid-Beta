package org.telegram.ui.Components;

import android.graphics.Canvas;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_iv;
public final class be implements Utilities.Callback {
    public final int f24961a;
    public final ChatActivityEnterView f24962b;

    public be(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f24961a = i10;
        this.f24962b = chatActivityEnterView;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f24961a;
        ChatActivityEnterView chatActivityEnterView = this.f24962b;
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
                int i11 = ChatActivityEnterView.f23911n5;
                chatActivityEnterView.c0((Canvas) obj, false);
                return;
        }
    }
}
