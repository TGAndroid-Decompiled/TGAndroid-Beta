package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_keyboard;
public final class ag implements View.OnLongClickListener {
    public final int f35170a;
    public final Object f35171b;
    public final Object f35172c;
    public final Object d;
    public final Object f35173e;

    public ag(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f35170a = i10;
        this.f35171b = obj;
        this.f35172c = obj2;
        this.d = obj3;
        this.f35173e = obj4;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f35170a) {
            case 0:
                xn xnVar = (xn) this.f35171b;
                TL_keyboard.KeyboardInlineButton keyboardInlineButton = (TL_keyboard.KeyboardInlineButton) this.f35172c;
                MessageObject messageObject = (MessageObject) this.d;
                hg.q qVar = (hg.q) this.f35173e;
                TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) mf.c.a(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrl.class);
                if (xnVar.getParentActivity() == null) {
                    return false;
                }
                if ((xnVar.L0.getVisibility() == 0 && tL_inlineButtonTypeUrl == null && !mf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) && !mf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class) && !mf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeGame.class) && !mf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeBuy.class) && !mf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) && !mf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) || tL_inlineButtonTypeUrl == null) {
                    return false;
                }
                xnVar.Z9(null, tL_inlineButtonTypeUrl.url, true, null, messageObject);
                try {
                    qVar.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                return true;
            default:
                return org.telegram.ui.Components.mi.q((org.telegram.ui.Components.mi) this.f35171b, (Context) this.f35172c, (org.telegram.ui.ActionBar.g6) this.d, (org.telegram.ui.ActionBar.p2) this.f35173e, view);
        }
    }
}
