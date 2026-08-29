package org.telegram.ui.Components;

import android.graphics.Canvas;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_iv;
public final class vd implements Utilities.Callback {
    public final int f33527a;
    public final ChatActivityEnterView f33528b;

    public vd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f33527a = i10;
        this.f33528b = chatActivityEnterView;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f33527a;
        ChatActivityEnterView chatActivityEnterView = this.f33528b;
        switch (i10) {
            case 0:
                chatActivityEnterView.Q0((TL_iv.RichMessage) obj);
                return;
            case 1:
                CharSequence charSequence = (CharSequence) obj;
                chatActivityEnterView.A0.setText(charSequence);
                chatActivityEnterView.A0.setSelection(charSequence.length(), charSequence.length());
                return;
            default:
                int i11 = ChatActivityEnterView.f26085i5;
                chatActivityEnterView.e0((Canvas) obj, false);
                return;
        }
    }
}
