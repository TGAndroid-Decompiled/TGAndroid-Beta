package org.telegram.ui.Components;

import android.graphics.Canvas;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_iv;
public final class sd implements Utilities.Callback {
    public final int f28723a;
    public final ChatActivityEnterView f28724b;

    public sd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f28723a = i10;
        this.f28724b = chatActivityEnterView;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f28723a;
        ChatActivityEnterView chatActivityEnterView = this.f28724b;
        switch (i10) {
            case 0:
                chatActivityEnterView.Q0((TL_iv.RichMessage) obj);
                return;
            case 1:
                CharSequence charSequence = (CharSequence) obj;
                chatActivityEnterView.B0.setText(charSequence);
                chatActivityEnterView.B0.setSelection(charSequence.length(), charSequence.length());
                return;
            default:
                int i11 = ChatActivityEnterView.f22702j5;
                chatActivityEnterView.e0((Canvas) obj, false);
                return;
        }
    }
}
