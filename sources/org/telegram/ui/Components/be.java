package org.telegram.ui.Components;

import android.graphics.Canvas;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_iv;
public final class be implements Utilities.Callback {
    public final int f24925a;
    public final ChatActivityEnterView f24926b;

    public be(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f24925a = i10;
        this.f24926b = chatActivityEnterView;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f24925a;
        ChatActivityEnterView chatActivityEnterView = this.f24926b;
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
                int i11 = ChatActivityEnterView.f23912n5;
                chatActivityEnterView.c0((Canvas) obj, false);
                return;
        }
    }
}
