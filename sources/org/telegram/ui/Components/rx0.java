package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rx0 {
    public final r5 f32396a;
    public Drawable f32397b;

    public rx0(FrameLayout frameLayout) {
        this(18, frameLayout);
    }

    public final r5 a(TLObject tLObject, boolean z10, int i10) {
        if (tLObject instanceof TLRPC.User) {
            return b((TLRPC.User) tLObject, null, i10, z10);
        }
        if (tLObject instanceof TLRPC.Chat) {
            return b(null, (TLRPC.Chat) tLObject, i10, z10);
        }
        return b(null, null, i10, z10);
    }

    public final r5 b(TLRPC.User user, TLRPC.Chat chat, int i10, boolean z10) {
        r5 r5Var = this.f32396a;
        if (chat != null && chat.verified) {
            Drawable drawable = this.f32397b;
            if (drawable == null) {
                drawable = new ar(org.telegram.ui.ActionBar.y6.f23389f1, org.telegram.ui.ActionBar.y6.f23444i1);
            }
            this.f32397b = drawable;
            r5Var.g(drawable, z10);
            r5Var.k(null);
            return r5Var;
        } else if (chat != null && DialogObject.getEmojiStatusDocumentId(chat.emoji_status) != 0) {
            r5Var.j(DialogObject.getEmojiStatusDocumentId(chat.emoji_status), z10);
            r5Var.k(Integer.valueOf(i10));
            return r5Var;
        } else if (user != null && user.verified) {
            Drawable drawable2 = this.f32397b;
            if (drawable2 == null) {
                drawable2 = new ar(org.telegram.ui.ActionBar.y6.f23389f1, org.telegram.ui.ActionBar.y6.f23444i1);
            }
            this.f32397b = drawable2;
            r5Var.g(drawable2, z10);
            r5Var.k(null);
            return r5Var;
        } else if (user != null && DialogObject.getEmojiStatusDocumentId(user.emoji_status) != 0) {
            r5Var.j(DialogObject.getEmojiStatusDocumentId(user.emoji_status), z10);
            r5Var.k(Integer.valueOf(i10));
            return r5Var;
        } else if (user != null && user.premium) {
            r5Var.g(tg.b1.d().e, z10);
            r5Var.k(Integer.valueOf(i10));
            return r5Var;
        } else {
            r5Var.g(null, z10);
            r5Var.k(null);
            return r5Var;
        }
    }

    public rx0(int i10, View view) {
        this.f32396a = new r5(AndroidUtilities.dp(i10), view);
    }
}
