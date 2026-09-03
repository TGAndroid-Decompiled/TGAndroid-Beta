package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
public final class lw0 {
    public final j5 f28891a;
    public Drawable f28892b;

    public lw0(FrameLayout frameLayout) {
        this(18, frameLayout);
    }

    public final j5 a(TLRPC.User user, TLRPC.Chat chat, int i10, boolean z4) {
        j5 j5Var = this.f28891a;
        if (chat != null && chat.verified) {
            Drawable drawable = this.f28892b;
            if (drawable == null) {
                drawable = new pq(org.telegram.ui.ActionBar.k6.f21693f1, org.telegram.ui.ActionBar.k6.f21747i1);
            }
            this.f28892b = drawable;
            j5Var.g(drawable, z4);
            j5Var.k(null);
            return j5Var;
        } else if (chat != null && DialogObject.getEmojiStatusDocumentId(chat.emoji_status) != 0) {
            j5Var.j(DialogObject.getEmojiStatusDocumentId(chat.emoji_status), z4);
            j5Var.k(Integer.valueOf(i10));
            return j5Var;
        } else if (user != null && user.verified) {
            Drawable drawable2 = this.f28892b;
            if (drawable2 == null) {
                drawable2 = new pq(org.telegram.ui.ActionBar.k6.f21693f1, org.telegram.ui.ActionBar.k6.f21747i1);
            }
            this.f28892b = drawable2;
            j5Var.g(drawable2, z4);
            j5Var.k(null);
            return j5Var;
        } else if (user != null && DialogObject.getEmojiStatusDocumentId(user.emoji_status) != 0) {
            j5Var.j(DialogObject.getEmojiStatusDocumentId(user.emoji_status), z4);
            j5Var.k(Integer.valueOf(i10));
            return j5Var;
        } else if (user != null && user.premium) {
            j5Var.g(fg.q1.d().f6516e, z4);
            j5Var.k(Integer.valueOf(i10));
            return j5Var;
        } else {
            j5Var.g(null, z4);
            j5Var.k(null);
            return j5Var;
        }
    }

    public lw0(int i10, View view) {
        this.f28891a = new j5(AndroidUtilities.dp(i10), view);
    }
}
