package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
public final class fx0 {
    public final p5 f26391a;
    public Drawable f26392b;

    public fx0(FrameLayout frameLayout) {
        this(18, frameLayout);
    }

    public final p5 a(TLRPC.User user, TLRPC.Chat chat, int i10, boolean z10) {
        p5 p5Var = this.f26391a;
        if (chat != null && chat.verified) {
            Drawable drawable = this.f26392b;
            if (drawable == null) {
                drawable = new zq(org.telegram.ui.ActionBar.h6.f21018f1, org.telegram.ui.ActionBar.h6.f21071i1);
            }
            this.f26392b = drawable;
            p5Var.g(drawable, z10);
            p5Var.k(null);
            return p5Var;
        } else if (chat != null && DialogObject.getEmojiStatusDocumentId(chat.emoji_status) != 0) {
            p5Var.j(DialogObject.getEmojiStatusDocumentId(chat.emoji_status), z10);
            p5Var.k(Integer.valueOf(i10));
            return p5Var;
        } else if (user != null && user.verified) {
            Drawable drawable2 = this.f26392b;
            if (drawable2 == null) {
                drawable2 = new zq(org.telegram.ui.ActionBar.h6.f21018f1, org.telegram.ui.ActionBar.h6.f21071i1);
            }
            this.f26392b = drawable2;
            p5Var.g(drawable2, z10);
            p5Var.k(null);
            return p5Var;
        } else if (user != null && DialogObject.getEmojiStatusDocumentId(user.emoji_status) != 0) {
            p5Var.j(DialogObject.getEmojiStatusDocumentId(user.emoji_status), z10);
            p5Var.k(Integer.valueOf(i10));
            return p5Var;
        } else if (user != null && user.premium) {
            p5Var.g(sg.b1.d().e, z10);
            p5Var.k(Integer.valueOf(i10));
            return p5Var;
        } else {
            p5Var.g(null, z10);
            p5Var.k(null);
            return p5Var;
        }
    }

    public fx0(int i10, View view) {
        this.f26391a = new p5(AndroidUtilities.dp(i10), view);
    }
}
