package org.telegram.ui.Components;

import android.graphics.Canvas;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_iv;
public final class ce implements Utilities.Callback {
    public final int f27143a;
    public final ChatActivityEnterView f27144b;

    public ce(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f27143a = i10;
        this.f27144b = chatActivityEnterView;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f27143a;
        ChatActivityEnterView chatActivityEnterView = this.f27144b;
        switch (i10) {
            case 0:
                chatActivityEnterView.N0((TL_iv.RichMessage) obj);
                return;
            case 1:
                CharSequence charSequence = (CharSequence) obj;
                chatActivityEnterView.E0.setText(charSequence);
                chatActivityEnterView.E0.setSelection(charSequence.length(), charSequence.length());
                return;
            default:
                int i11 = ChatActivityEnterView.f25845r5;
                chatActivityEnterView.a0((Canvas) obj, false);
                return;
        }
    }
}
