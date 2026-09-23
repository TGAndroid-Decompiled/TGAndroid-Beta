package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_keyboard;
public final class fg implements View.OnLongClickListener {
    public final int f33309a;
    public final Object f33310b;
    public final Object f33311c;
    public final Object d;
    public final Object e;

    public fg(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f33309a = i10;
        this.f33310b = obj;
        this.f33311c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f33309a) {
            case 0:
                xn xnVar = (xn) this.f33310b;
                TL_keyboard.KeyboardInlineButton keyboardInlineButton = (TL_keyboard.KeyboardInlineButton) this.f33311c;
                MessageObject messageObject = (MessageObject) this.d;
                ai.p4 p4Var = (ai.p4) this.e;
                TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) zf.c.a(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrl.class);
                if (xnVar.getParentActivity() == null) {
                    return false;
                }
                if ((xnVar.O0.getVisibility() == 0 && tL_inlineButtonTypeUrl == null && !zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) && !zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class) && !zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeGame.class) && !zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeBuy.class) && !zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) && !zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) || tL_inlineButtonTypeUrl == null) {
                    return false;
                }
                xnVar.Z9(null, tL_inlineButtonTypeUrl.url, true, null, messageObject);
                try {
                    p4Var.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                return true;
            default:
                return org.telegram.ui.Components.wi.q((org.telegram.ui.Components.wi) this.f33310b, (Context) this.f33311c, (org.telegram.ui.ActionBar.d6) this.d, (org.telegram.ui.ActionBar.n2) this.e, view);
        }
    }
}
