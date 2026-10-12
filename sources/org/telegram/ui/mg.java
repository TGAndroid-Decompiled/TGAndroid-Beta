package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_keyboard;
public final class mg implements View.OnLongClickListener {
    public final int f38253a;
    public final Object f38254b;
    public final Object f38255c;
    public final Object d;
    public final Object e;

    public mg(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f38253a = i10;
        this.f38254b = obj;
        this.f38255c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f38253a) {
            case 0:
                fo foVar = (fo) this.f38254b;
                TL_keyboard.KeyboardInlineButton keyboardInlineButton = (TL_keyboard.KeyboardInlineButton) this.f38255c;
                MessageObject messageObject = (MessageObject) this.d;
                bi.f4 f4Var = (bi.f4) this.e;
                TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) ag.c.a(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrl.class);
                if (foVar.getParentActivity() == null) {
                    return false;
                }
                if ((foVar.O0.getVisibility() == 0 && tL_inlineButtonTypeUrl == null && !ag.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) && !ag.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class) && !ag.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeGame.class) && !ag.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeBuy.class) && !ag.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) && !ag.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) || tL_inlineButtonTypeUrl == null) {
                    return false;
                }
                foVar.ea(null, tL_inlineButtonTypeUrl.url, true, null, messageObject);
                try {
                    f4Var.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                return true;
            default:
                return org.telegram.ui.Components.vi.r((org.telegram.ui.Components.vi) this.f38254b, (Context) this.f38255c, (org.telegram.ui.ActionBar.c6) this.d, (org.telegram.ui.ActionBar.m2) this.e, view);
        }
    }
}
