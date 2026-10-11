package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_keyboard;
public final class gg implements View.OnLongClickListener {
    public final int f38080a;
    public final Object f38081b;
    public final Object f38082c;
    public final Object d;
    public final Object f38083e;

    public gg(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f38080a = i10;
        this.f38081b = obj;
        this.f38082c = obj2;
        this.d = obj3;
        this.f38083e = obj4;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f38080a) {
            case 0:
                zn znVar = (zn) this.f38081b;
                TL_keyboard.KeyboardInlineButton keyboardInlineButton = (TL_keyboard.KeyboardInlineButton) this.f38082c;
                MessageObject messageObject = (MessageObject) this.d;
                ai.q4 q4Var = (ai.q4) this.f38083e;
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
                return org.telegram.ui.Components.yi.r((org.telegram.ui.Components.yi) this.f38081b, (Context) this.f38082c, (org.telegram.ui.ActionBar.d6) this.d, (org.telegram.ui.ActionBar.m2) this.f38083e, view);
        }
    }
}
