package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_keyboard;
public final class hg implements View.OnLongClickListener {
    public final int f33383a;
    public final Object f33384b;
    public final Object f33385c;
    public final Object d;
    public final Object e;

    public hg(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f33383a = i10;
        this.f33384b = obj;
        this.f33385c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f33383a) {
            case 0:
                eo eoVar = (eo) this.f33384b;
                TL_keyboard.KeyboardInlineButton keyboardInlineButton = (TL_keyboard.KeyboardInlineButton) this.f33385c;
                MessageObject messageObject = (MessageObject) this.d;
                di.h hVar = (di.h) this.e;
                TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) yf.c.a(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrl.class);
                if (eoVar.getParentActivity() == null) {
                    return false;
                }
                if ((eoVar.O0.getVisibility() == 0 && tL_inlineButtonTypeUrl == null && !yf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) && !yf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class) && !yf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeGame.class) && !yf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeBuy.class) && !yf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) && !yf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) || tL_inlineButtonTypeUrl == null) {
                    return false;
                }
                eoVar.Z9(null, tL_inlineButtonTypeUrl.url, true, null, messageObject);
                try {
                    hVar.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                return true;
            default:
                return org.telegram.ui.Components.yi.q((org.telegram.ui.Components.yi) this.f33384b, (Context) this.f33385c, (org.telegram.ui.ActionBar.f6) this.d, (org.telegram.ui.ActionBar.p2) this.e, view);
        }
    }
}
