package org.telegram.ui.Components;

import android.graphics.Canvas;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_iv;

public final class od implements Utilities.Callback {

    public final int f31261a;

    public final ChatActivityEnterView f31262b;

    public od(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f31261a = i10;
        this.f31262b = chatActivityEnterView;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f31261a;
        ChatActivityEnterView chatActivityEnterView = this.f31262b;
        switch (i10) {
            case 0:
                chatActivityEnterView.Q0((TL_iv.RichMessage) obj);
                break;
            case 1:
                CharSequence charSequence = (CharSequence) obj;
                chatActivityEnterView.A0.setText(charSequence);
                chatActivityEnterView.A0.setSelection(charSequence.length(), charSequence.length());
                break;
            default:
                int i11 = ChatActivityEnterView.f26070i5;
                chatActivityEnterView.e0((Canvas) obj, false);
                break;
        }
    }
}
