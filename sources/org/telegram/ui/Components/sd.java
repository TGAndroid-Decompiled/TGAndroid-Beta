package org.telegram.ui.Components;

import android.graphics.Canvas;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_iv;
public final class sd implements Utilities.Callback {
    public final int f32444a;
    public final ChatActivityEnterView f32445b;

    public sd(ChatActivityEnterView chatActivityEnterView, int i9) {
        this.f32444a = i9;
        this.f32445b = chatActivityEnterView;
    }

    @Override
    public final void run(Object obj) {
        int i9 = this.f32444a;
        ChatActivityEnterView chatActivityEnterView = this.f32445b;
        switch (i9) {
            case 0:
                chatActivityEnterView.Q0((TL_iv.RichMessage) obj);
                return;
            case 1:
                CharSequence charSequence = (CharSequence) obj;
                chatActivityEnterView.A0.setText(charSequence);
                chatActivityEnterView.A0.setSelection(charSequence.length(), charSequence.length());
                return;
            default:
                int i10 = ChatActivityEnterView.f26074i5;
                chatActivityEnterView.d0((Canvas) obj, false);
                return;
        }
    }
}
