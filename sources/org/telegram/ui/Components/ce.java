package org.telegram.ui.Components;

import android.graphics.Canvas;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_iv;
public final class ce implements Utilities.Callback {
    public final int f27131a;
    public final ChatActivityEnterView f27132b;

    public ce(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f27131a = i10;
        this.f27132b = chatActivityEnterView;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f27131a;
        ChatActivityEnterView chatActivityEnterView = this.f27132b;
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
                int i11 = ChatActivityEnterView.f25841r5;
                chatActivityEnterView.b0((Canvas) obj, false);
                return;
        }
    }
}
