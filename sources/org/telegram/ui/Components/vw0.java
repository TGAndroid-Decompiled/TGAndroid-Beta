package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
public final class vw0 {
    public final n5 f28604a;
    public Drawable f28605b;

    public vw0(FrameLayout frameLayout) {
        this(18, frameLayout);
    }

    public final n5 a(TLRPC.User user, TLRPC.Chat chat, int i10, boolean z10) {
        n5 n5Var = this.f28604a;
        if (chat != null && chat.verified) {
            Drawable drawable = this.f28605b;
            if (drawable == null) {
                drawable = new vq(org.telegram.ui.ActionBar.j6.f17959f1, org.telegram.ui.ActionBar.j6.f18012i1);
            }
            this.f28605b = drawable;
            n5Var.g(drawable, z10);
            n5Var.k(null);
            return n5Var;
        } else if (chat != null && DialogObject.getEmojiStatusDocumentId(chat.emoji_status) != 0) {
            n5Var.j(DialogObject.getEmojiStatusDocumentId(chat.emoji_status), z10);
            n5Var.k(Integer.valueOf(i10));
            return n5Var;
        } else if (user != null && user.verified) {
            Drawable drawable2 = this.f28605b;
            if (drawable2 == null) {
                drawable2 = new vq(org.telegram.ui.ActionBar.j6.f17959f1, org.telegram.ui.ActionBar.j6.f18012i1);
            }
            this.f28605b = drawable2;
            n5Var.g(drawable2, z10);
            n5Var.k(null);
            return n5Var;
        } else if (user != null && DialogObject.getEmojiStatusDocumentId(user.emoji_status) != 0) {
            n5Var.j(DialogObject.getEmojiStatusDocumentId(user.emoji_status), z10);
            n5Var.k(Integer.valueOf(i10));
            return n5Var;
        } else if (user != null && user.premium) {
            n5Var.g(qg.d1.d().e, z10);
            n5Var.k(Integer.valueOf(i10));
            return n5Var;
        } else {
            n5Var.g(null, z10);
            n5Var.k(null);
            return n5Var;
        }
    }

    public vw0(int i10, View view) {
        this.f28604a = new n5(AndroidUtilities.dp(i10), view);
    }
}
