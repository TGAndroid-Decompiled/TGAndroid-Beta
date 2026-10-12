package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_keyboard;
public final class lg implements View.OnLongClickListener {
    public final int f39739a;
    public final Object f39740b;
    public final Object f39741c;
    public final Object d;
    public final Object f39742e;

    public lg(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f39739a = i10;
        this.f39740b = obj;
        this.f39741c = obj2;
        this.d = obj3;
        this.f39742e = obj4;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f39739a) {
            case 0:
                eo eoVar = (eo) this.f39740b;
                TL_keyboard.KeyboardInlineButton keyboardInlineButton = (TL_keyboard.KeyboardInlineButton) this.f39741c;
                MessageObject messageObject = (MessageObject) this.d;
                ai.q4 q4Var = (ai.q4) this.f39742e;
                TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) zf.c.a(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrl.class);
                if (eoVar.getParentActivity() == null) {
                    return false;
                }
                if ((eoVar.O0.getVisibility() == 0 && tL_inlineButtonTypeUrl == null && !zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) && !zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class) && !zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeGame.class) && !zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeBuy.class) && !zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) && !zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) || tL_inlineButtonTypeUrl == null) {
                    return false;
                }
                eoVar.ea(null, tL_inlineButtonTypeUrl.url, true, null, messageObject);
                try {
                    q4Var.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                return true;
            default:
                return org.telegram.ui.Components.aj.r((org.telegram.ui.Components.aj) this.f39740b, (Context) this.f39741c, (org.telegram.ui.ActionBar.c6) this.d, (org.telegram.ui.ActionBar.m2) this.f39742e, view);
        }
    }
}
