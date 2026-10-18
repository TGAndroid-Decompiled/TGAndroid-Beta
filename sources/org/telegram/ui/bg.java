package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_keyboard;
public final class bg implements View.OnLongClickListener {
    public final int f35654a;
    public final Object f35655b;
    public final Object f35656c;
    public final Object d;
    public final Object e;

    public bg(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f35654a = i10;
        this.f35655b = obj;
        this.f35656c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f35654a) {
            case 0:
                sn snVar = (sn) this.f35655b;
                TL_keyboard.KeyboardInlineButton keyboardInlineButton = (TL_keyboard.KeyboardInlineButton) this.f35656c;
                MessageObject messageObject = (MessageObject) this.d;
                ai.vd vdVar = (ai.vd) this.e;
                TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) ag.d.a(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrl.class);
                if (snVar.getParentActivity() == null) {
                    return false;
                }
                if ((snVar.O0.getVisibility() == 0 && tL_inlineButtonTypeUrl == null && !ag.d.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) && !ag.d.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class) && !ag.d.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeGame.class) && !ag.d.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeBuy.class) && !ag.d.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) && !ag.d.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) || tL_inlineButtonTypeUrl == null) {
                    return false;
                }
                snVar.ea(null, tL_inlineButtonTypeUrl.url, true, null, messageObject);
                try {
                    vdVar.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                return true;
            default:
                return org.telegram.ui.Components.ti.q((org.telegram.ui.Components.ti) this.f35655b, (Context) this.f35656c, (org.telegram.ui.ActionBar.d6) this.d, (org.telegram.ui.ActionBar.n2) this.e, view);
        }
    }
}
