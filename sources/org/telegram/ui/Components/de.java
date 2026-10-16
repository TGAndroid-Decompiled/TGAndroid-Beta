package org.telegram.ui.Components;

import android.graphics.Canvas;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_iv;
public final class de implements Utilities.Callback {
    public final int f24101a;
    public final ChatActivityEnterView f24102b;

    public de(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f24101a = i10;
        this.f24102b = chatActivityEnterView;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f24101a;
        ChatActivityEnterView chatActivityEnterView = this.f24102b;
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
                int i11 = ChatActivityEnterView.f22549n5;
                chatActivityEnterView.c0((Canvas) obj, false);
                return;
        }
    }
}
