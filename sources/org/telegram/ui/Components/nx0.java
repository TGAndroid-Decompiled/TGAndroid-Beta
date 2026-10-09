package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
public final class nx0 {
    public final q5 f29298a;
    public Drawable f29299b;

    public nx0(FrameLayout frameLayout) {
        this(18, frameLayout);
    }

    public final q5 a(TLRPC.User user, TLRPC.Chat chat, int i10, boolean z10) {
        q5 q5Var = this.f29298a;
        if (chat != null && chat.verified) {
            Drawable drawable = this.f29299b;
            if (drawable == null) {
                drawable = new fr(org.telegram.ui.ActionBar.i6.f20829f1, org.telegram.ui.ActionBar.i6.f20883i1);
            }
            this.f29299b = drawable;
            q5Var.g(drawable, z10);
            q5Var.k(null);
            return q5Var;
        } else if (chat != null && DialogObject.getEmojiStatusDocumentId(chat.emoji_status) != 0) {
            q5Var.j(DialogObject.getEmojiStatusDocumentId(chat.emoji_status), z10);
            q5Var.k(Integer.valueOf(i10));
            return q5Var;
        } else if (user != null && user.verified) {
            Drawable drawable2 = this.f29299b;
            if (drawable2 == null) {
                drawable2 = new fr(org.telegram.ui.ActionBar.i6.f20829f1, org.telegram.ui.ActionBar.i6.f20883i1);
            }
            this.f29299b = drawable2;
            q5Var.g(drawable2, z10);
            q5Var.k(null);
            return q5Var;
        } else if (user != null && DialogObject.getEmojiStatusDocumentId(user.emoji_status) != 0) {
            q5Var.j(DialogObject.getEmojiStatusDocumentId(user.emoji_status), z10);
            q5Var.k(Integer.valueOf(i10));
            return q5Var;
        } else if (user != null && user.premium) {
            q5Var.g(rg.b1.d().f47207e, z10);
            q5Var.k(Integer.valueOf(i10));
            return q5Var;
        } else {
            q5Var.g(null, z10);
            q5Var.k(null);
            return q5Var;
        }
    }

    public nx0(int i10, View view) {
        this.f29298a = new q5(AndroidUtilities.dp(i10), view);
    }
}
