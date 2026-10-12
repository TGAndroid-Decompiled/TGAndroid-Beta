package org.telegram.ui.Components;

import android.graphics.Canvas;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_iv;
public final class ge implements Utilities.Callback {
    public final int f26422a;
    public final ChatActivityEnterView f26423b;

    public ge(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f26422a = i10;
        this.f26423b = chatActivityEnterView;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f26422a;
        ChatActivityEnterView chatActivityEnterView = this.f26423b;
        switch (i10) {
            case 0:
                int i11 = ChatActivityEnterView.Q5;
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
