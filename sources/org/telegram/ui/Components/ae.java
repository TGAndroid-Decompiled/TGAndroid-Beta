package org.telegram.ui.Components;

import android.graphics.Canvas;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_iv;
public final class ae implements Utilities.Callback {
    public final int f22371a;
    public final ChatActivityEnterView f22372b;

    public ae(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f22371a = i10;
        this.f22372b = chatActivityEnterView;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f22371a;
        ChatActivityEnterView chatActivityEnterView = this.f22372b;
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
                int i11 = ChatActivityEnterView.f21731m5;
                chatActivityEnterView.e0((Canvas) obj, false);
                return;
        }
    }
}
