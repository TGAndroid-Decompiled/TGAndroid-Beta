package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
public final class lw0 {
    public final m5 f25983a;
    public Drawable f25984b;

    public lw0(FrameLayout frameLayout) {
        this(18, frameLayout);
    }

    public final m5 a(TLRPC.User user, TLRPC.Chat chat, int i10, boolean z10) {
        m5 m5Var = this.f25983a;
        if (chat != null && chat.verified) {
            Drawable drawable = this.f25984b;
            if (drawable == null) {
                drawable = new pq(org.telegram.ui.ActionBar.j6.f18894f1, org.telegram.ui.ActionBar.j6.f18948i1);
            }
            this.f25984b = drawable;
            m5Var.g(drawable, z10);
            m5Var.k(null);
            return m5Var;
        } else if (chat != null && DialogObject.getEmojiStatusDocumentId(chat.emoji_status) != 0) {
            m5Var.j(DialogObject.getEmojiStatusDocumentId(chat.emoji_status), z10);
            m5Var.k(Integer.valueOf(i10));
            return m5Var;
        } else if (user != null && user.verified) {
            Drawable drawable2 = this.f25984b;
            if (drawable2 == null) {
                drawable2 = new pq(org.telegram.ui.ActionBar.j6.f18894f1, org.telegram.ui.ActionBar.j6.f18948i1);
            }
            this.f25984b = drawable2;
            m5Var.g(drawable2, z10);
            m5Var.k(null);
            return m5Var;
        } else if (user != null && DialogObject.getEmojiStatusDocumentId(user.emoji_status) != 0) {
            m5Var.j(DialogObject.getEmojiStatusDocumentId(user.emoji_status), z10);
            m5Var.k(Integer.valueOf(i10));
            return m5Var;
        } else if (user != null && user.premium) {
            m5Var.g(rg.a1.d().e, z10);
            m5Var.k(Integer.valueOf(i10));
            return m5Var;
        } else {
            m5Var.g(null, z10);
            m5Var.k(null);
            return m5Var;
        }
    }

    public lw0(int i10, View view) {
        this.f25983a = new m5(AndroidUtilities.dp(i10), view);
    }
}
