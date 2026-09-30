package org.telegram.ui.Components;

import android.graphics.Canvas;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_iv;
public final class de implements Utilities.Callback {
    public final int f23632a;
    public final ChatActivityEnterView f23633b;

    public de(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f23632a = i10;
        this.f23633b = chatActivityEnterView;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f23632a;
        ChatActivityEnterView chatActivityEnterView = this.f23633b;
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
                int i11 = ChatActivityEnterView.f21954n5;
                chatActivityEnterView.e0((Canvas) obj, false);
                return;
        }
    }
}
