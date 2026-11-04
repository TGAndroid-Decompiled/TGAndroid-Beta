package org.telegram.ui.Components;

import android.graphics.Canvas;
import org.telegram.tgnet.tl.TL_iv;
public final class jd implements org.telegram.messenger.u10 {
    public final int f35043a;
    public final ChatActivityEnterView f35044b;

    public jd(ChatActivityEnterView chatActivityEnterView, int i3) {
        this.f35043a = i3;
        this.f35044b = chatActivityEnterView;
    }

    @Override
    public final void a(Object obj) {
        int i3 = this.f35043a;
        ChatActivityEnterView chatActivityEnterView = this.f35044b;
        switch (i3) {
            case 0:
                chatActivityEnterView.P0((TL_iv.RichMessage) obj);
                return;
            case 1:
                CharSequence charSequence = (CharSequence) obj;
                chatActivityEnterView.F0.setText(charSequence);
                chatActivityEnterView.F0.setSelection(charSequence.length(), charSequence.length());
                return;
            default:
                int i10 = ChatActivityEnterView.f31082t5;
                chatActivityEnterView.b0((Canvas) obj, false);
                return;
        }
    }
}
