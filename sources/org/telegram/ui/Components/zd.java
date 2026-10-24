package org.telegram.ui.Components;

import android.graphics.Canvas;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_iv;
public final class zd implements Utilities.Callback {
    public final int f33248a;
    public final ChatActivityEnterView f33249b;

    public zd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f33248a = i10;
        this.f33249b = chatActivityEnterView;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f33248a;
        ChatActivityEnterView chatActivityEnterView = this.f33249b;
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
                int i11 = ChatActivityEnterView.f24051r5;
                chatActivityEnterView.b0((Canvas) obj, false);
                return;
        }
    }
}
