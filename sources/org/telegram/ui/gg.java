package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_keyboard;
public final class gg implements View.OnLongClickListener {
    public final int f36663a;
    public final Object f36664b;
    public final Object f36665c;
    public final Object d;
    public final Object f36666e;

    public gg(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f36663a = i10;
        this.f36664b = obj;
        this.f36665c = obj2;
        this.d = obj3;
        this.f36666e = obj4;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f36663a) {
            case 0:
                co coVar = (co) this.f36664b;
                TL_keyboard.KeyboardInlineButton keyboardInlineButton = (TL_keyboard.KeyboardInlineButton) this.f36665c;
                MessageObject messageObject = (MessageObject) this.d;
                bi.c4 c4Var = (bi.c4) this.f36666e;
                TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) zf.c.a(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrl.class);
                if (coVar.getParentActivity() == null) {
                    return false;
                }
                if ((coVar.O0.getVisibility() == 0 && tL_inlineButtonTypeUrl == null && !zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) && !zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class) && !zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeGame.class) && !zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeBuy.class) && !zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) && !zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) || tL_inlineButtonTypeUrl == null) {
                    return false;
                }
                coVar.Z9(null, tL_inlineButtonTypeUrl.url, true, null, messageObject);
                try {
                    c4Var.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                return true;
            default:
                return org.telegram.ui.Components.vi.q((org.telegram.ui.Components.vi) this.f36664b, (Context) this.f36665c, (org.telegram.ui.ActionBar.f6) this.d, (org.telegram.ui.ActionBar.n2) this.f36666e, view);
        }
    }
}
