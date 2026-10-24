package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ix0 {
    public final n5 f27510a;
    public Drawable f27511b;

    public ix0(FrameLayout frameLayout) {
        this(18, frameLayout);
    }

    public final n5 a(TLObject tLObject, boolean z10, int i10) {
        if (tLObject instanceof TLRPC.User) {
            return b((TLRPC.User) tLObject, null, i10, z10);
        }
        if (tLObject instanceof TLRPC.Chat) {
            return b(null, (TLRPC.Chat) tLObject, i10, z10);
        }
        return b(null, null, i10, z10);
    }

    public final n5 b(TLRPC.User user, TLRPC.Chat chat, int i10, boolean z10) {
        n5 n5Var = this.f27510a;
        if (chat != null && chat.verified) {
            Drawable drawable = this.f27511b;
            if (drawable == null) {
                drawable = new wq(org.telegram.ui.ActionBar.k6.f21215f1, org.telegram.ui.ActionBar.k6.f21268i1);
            }
            this.f27511b = drawable;
            n5Var.g(drawable, z10);
            n5Var.k(null);
            return n5Var;
        } else if (chat != null && DialogObject.getEmojiStatusDocumentId(chat.emoji_status) != 0) {
            n5Var.j(DialogObject.getEmojiStatusDocumentId(chat.emoji_status), z10);
            n5Var.k(Integer.valueOf(i10));
            return n5Var;
        } else if (user != null && user.verified) {
            Drawable drawable2 = this.f27511b;
            if (drawable2 == null) {
                drawable2 = new wq(org.telegram.ui.ActionBar.k6.f21215f1, org.telegram.ui.ActionBar.k6.f21268i1);
            }
            this.f27511b = drawable2;
            n5Var.g(drawable2, z10);
            n5Var.k(null);
            return n5Var;
        } else if (user != null && DialogObject.getEmojiStatusDocumentId(user.emoji_status) != 0) {
            n5Var.j(DialogObject.getEmojiStatusDocumentId(user.emoji_status), z10);
            n5Var.k(Integer.valueOf(i10));
            return n5Var;
        } else if (user != null && user.premium) {
            n5Var.g(sg.b1.d().e, z10);
            n5Var.k(Integer.valueOf(i10));
            return n5Var;
        } else {
            n5Var.g(null, z10);
            n5Var.k(null);
            return n5Var;
        }
    }

    public ix0(int i10, View view) {
        this.f27510a = new n5(AndroidUtilities.dp(i10), view);
    }
}
