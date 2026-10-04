package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_keyboard;
public final class fg implements View.OnLongClickListener {
    public final int f36304a;
    public final Object f36305b;
    public final Object f36306c;
    public final Object d;
    public final Object f36307e;

    public fg(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f36304a = i10;
        this.f36305b = obj;
        this.f36306c = obj2;
        this.d = obj3;
        this.f36307e = obj4;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f36304a) {
            case 0:
                yn ynVar = (yn) this.f36305b;
                TL_keyboard.KeyboardInlineButton keyboardInlineButton = (TL_keyboard.KeyboardInlineButton) this.f36306c;
                MessageObject messageObject = (MessageObject) this.d;
                ai.p4 p4Var = (ai.p4) this.f36307e;
                TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) zf.c.a(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrl.class);
                if (ynVar.getParentActivity() == null) {
                    return false;
                }
                if ((ynVar.M0.getVisibility() == 0 && tL_inlineButtonTypeUrl == null && !zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) && !zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class) && !zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeGame.class) && !zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeBuy.class) && !zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) && !zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) || tL_inlineButtonTypeUrl == null) {
                    return false;
                }
                ynVar.Y9(null, tL_inlineButtonTypeUrl.url, true, null, messageObject);
                try {
                    p4Var.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                return true;
            default:
                return org.telegram.ui.Components.xi.w((org.telegram.ui.Components.xi) this.f36305b, (Context) this.f36306c, (org.telegram.ui.ActionBar.d6) this.d, (org.telegram.ui.ActionBar.n2) this.f36307e, view);
        }
    }
}
