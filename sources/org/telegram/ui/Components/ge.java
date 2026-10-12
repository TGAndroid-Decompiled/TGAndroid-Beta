package org.telegram.ui.Components;

import android.graphics.Canvas;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_iv;
public final class ge implements Utilities.Callback {
    public final int f26420a;
    public final ChatActivityEnterView f26421b;

    public ge(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f26420a = i10;
        this.f26421b = chatActivityEnterView;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f26420a;
        ChatActivityEnterView chatActivityEnterView = this.f26421b;
        switch (i10) {
            case 0:
                int i11 = ChatActivityEnterView.S5;
                chatActivityEnterView.f0((Canvas) obj, false);
                return;
            case 1:
                chatActivityEnterView.T0((TL_iv.RichMessage) obj);
                return;
            default:
                CharSequence charSequence = (CharSequence) obj;
                chatActivityEnterView.E0.setText(charSequence);
                chatActivityEnterView.E0.setSelection(charSequence.length(), charSequence.length());
                return;
        }
    }
}
