package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
public final class cw0 {
    public final n5 f27580a;
    public Drawable f27581b;

    public cw0(FrameLayout frameLayout) {
        this(18, frameLayout);
    }

    public final n5 a(TLRPC.User user, TLRPC.Chat chat, int i10, boolean z10) {
        n5 n5Var = this.f27580a;
        if (chat != null && chat.verified) {
            Drawable drawable = this.f27581b;
            if (drawable == null) {
                drawable = new jq(org.telegram.ui.ActionBar.g6.f23094f1, org.telegram.ui.ActionBar.g6.f23147i1);
            }
            this.f27581b = drawable;
            n5Var.g(drawable, z10);
            n5Var.k(null);
            return n5Var;
        } else if (chat != null && DialogObject.getEmojiStatusDocumentId(chat.emoji_status) != 0) {
            n5Var.j(DialogObject.getEmojiStatusDocumentId(chat.emoji_status), z10);
            n5Var.k(Integer.valueOf(i10));
            return n5Var;
        } else if (user != null && user.verified) {
            Drawable drawable2 = this.f27581b;
            if (drawable2 == null) {
                drawable2 = new jq(org.telegram.ui.ActionBar.g6.f23094f1, org.telegram.ui.ActionBar.g6.f23147i1);
            }
            this.f27581b = drawable2;
            n5Var.g(drawable2, z10);
            n5Var.k(null);
            return n5Var;
        } else if (user != null && DialogObject.getEmojiStatusDocumentId(user.emoji_status) != 0) {
            n5Var.j(DialogObject.getEmojiStatusDocumentId(user.emoji_status), z10);
            n5Var.k(Integer.valueOf(i10));
            return n5Var;
        } else if (user != null && user.premium) {
            n5Var.g(cg.s1.d().f3363e, z10);
            n5Var.k(Integer.valueOf(i10));
            return n5Var;
        } else {
            n5Var.g(null, z10);
            n5Var.k(null);
            return n5Var;
        }
    }

    public cw0(int i10, View view) {
        this.f27580a = new n5(AndroidUtilities.dp(i10), view);
    }
}
