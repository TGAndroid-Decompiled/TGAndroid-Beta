package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
public final class ww0 {
    public final o5 f30218a;
    public Drawable f30219b;

    public ww0(FrameLayout frameLayout) {
        this(18, frameLayout);
    }

    public final o5 a(TLRPC.User user, TLRPC.Chat chat, int i10, boolean z10) {
        o5 o5Var = this.f30218a;
        if (chat != null && chat.verified) {
            Drawable drawable = this.f30219b;
            if (drawable == null) {
                drawable = new rq(org.telegram.ui.ActionBar.h6.f19090f1, org.telegram.ui.ActionBar.h6.f19143i1);
            }
            this.f30219b = drawable;
            o5Var.g(drawable, z10);
            o5Var.k(null);
            return o5Var;
        } else if (chat != null && DialogObject.getEmojiStatusDocumentId(chat.emoji_status) != 0) {
            o5Var.j(DialogObject.getEmojiStatusDocumentId(chat.emoji_status), z10);
            o5Var.k(Integer.valueOf(i10));
            return o5Var;
        } else if (user != null && user.verified) {
            Drawable drawable2 = this.f30219b;
            if (drawable2 == null) {
                drawable2 = new rq(org.telegram.ui.ActionBar.h6.f19090f1, org.telegram.ui.ActionBar.h6.f19143i1);
            }
            this.f30219b = drawable2;
            o5Var.g(drawable2, z10);
            o5Var.k(null);
            return o5Var;
        } else if (user != null && DialogObject.getEmojiStatusDocumentId(user.emoji_status) != 0) {
            o5Var.j(DialogObject.getEmojiStatusDocumentId(user.emoji_status), z10);
            o5Var.k(Integer.valueOf(i10));
            return o5Var;
        } else if (user != null && user.premium) {
            o5Var.g(rg.a1.d().e, z10);
            o5Var.k(Integer.valueOf(i10));
            return o5Var;
        } else {
            o5Var.g(null, z10);
            o5Var.k(null);
            return o5Var;
        }
    }

    public ww0(int i10, View view) {
        this.f30218a = new o5(AndroidUtilities.dp(i10), view);
    }
}
