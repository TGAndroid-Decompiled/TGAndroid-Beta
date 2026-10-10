package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_keyboard;
public final class hg implements View.OnLongClickListener {
    public final int f38366a;
    public final Object f38367b;
    public final Object f38368c;
    public final Object d;
    public final Object f38369e;

    public hg(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f38366a = i10;
        this.f38367b = obj;
        this.f38368c = obj2;
        this.d = obj3;
        this.f38369e = obj4;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f38366a) {
            case 0:
                zn znVar = (zn) this.f38367b;
                TL_keyboard.KeyboardInlineButton keyboardInlineButton = (TL_keyboard.KeyboardInlineButton) this.f38368c;
                MessageObject messageObject = (MessageObject) this.d;
                ai.q4 q4Var = (ai.q4) this.f38369e;
                TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) zf.c.a(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrl.class);
                if (znVar.getParentActivity() == null) {
                    return false;
                }
                if ((znVar.O0.getVisibility() == 0 && tL_inlineButtonTypeUrl == null && !zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) && !zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class) && !zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeGame.class) && !zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeBuy.class) && !zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) && !zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) || tL_inlineButtonTypeUrl == null) {
                    return false;
                }
                znVar.ea(null, tL_inlineButtonTypeUrl.url, true, null, messageObject);
                try {
                    q4Var.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                return true;
            default:
                return org.telegram.ui.Components.yi.r((org.telegram.ui.Components.yi) this.f38367b, (Context) this.f38368c, (org.telegram.ui.ActionBar.e6) this.d, (org.telegram.ui.ActionBar.n2) this.f38369e, view);
        }
    }
}
