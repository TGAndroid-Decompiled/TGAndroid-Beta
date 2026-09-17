package org.telegram.ui.Components;

import android.graphics.Canvas;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_iv;
public final class ae implements Utilities.Callback {
    public final int f22386a;
    public final ChatActivityEnterView f22387b;

    public ae(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f22386a = i10;
        this.f22387b = chatActivityEnterView;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f22386a;
        ChatActivityEnterView chatActivityEnterView = this.f22387b;
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
                int i11 = ChatActivityEnterView.f21741m5;
                chatActivityEnterView.e0((Canvas) obj, false);
                return;
        }
    }
}
