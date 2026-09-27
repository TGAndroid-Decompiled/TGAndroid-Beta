package org.telegram.ui.Components;

import android.graphics.Canvas;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_iv;
public final class ce implements Utilities.Callback {
    public final int f23300a;
    public final ChatActivityEnterView f23301b;

    public ce(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f23300a = i10;
        this.f23301b = chatActivityEnterView;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f23300a;
        ChatActivityEnterView chatActivityEnterView = this.f23301b;
        switch (i10) {
            case 0:
                chatActivityEnterView.Q0((TL_iv.RichMessage) obj);
                return;
            case 1:
                CharSequence charSequence = (CharSequence) obj;
                chatActivityEnterView.E0.setText(charSequence);
                chatActivityEnterView.E0.setSelection(charSequence.length(), charSequence.length());
                return;
            default:
                int i11 = ChatActivityEnterView.f21955n5;
                chatActivityEnterView.e0((Canvas) obj, false);
                return;
        }
    }
}
