package org.telegram.ui.Components;

import android.graphics.Canvas;
import org.telegram.tgnet.tl.TL_iv;
public final class fd implements org.telegram.messenger.r20 {
    public final int f26130a;
    public final ChatActivityEnterView f26131b;

    public fd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f26130a = i10;
        this.f26131b = chatActivityEnterView;
    }

    @Override
    public final void a(Object obj) {
        int i10 = this.f26130a;
        ChatActivityEnterView chatActivityEnterView = this.f26131b;
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
                int i11 = ChatActivityEnterView.f23673s5;
                chatActivityEnterView.a0((Canvas) obj, false);
                return;
        }
    }
}
