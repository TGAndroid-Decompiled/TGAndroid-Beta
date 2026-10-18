package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
public final class ex0 {
    public final p5 f26010a;
    public Drawable f26011b;

    public ex0(FrameLayout frameLayout) {
        this(18, frameLayout);
    }

    public final p5 a(TLRPC.User user, TLRPC.Chat chat, int i10, boolean z10) {
        p5 p5Var = this.f26010a;
        if (chat != null && chat.verified) {
            Drawable drawable = this.f26011b;
            if (drawable == null) {
                drawable = new zq(org.telegram.ui.ActionBar.h6.f21017f1, org.telegram.ui.ActionBar.h6.f21070i1);
            }
            this.f26011b = drawable;
            p5Var.g(drawable, z10);
            p5Var.k(null);
            return p5Var;
        } else if (chat != null && DialogObject.getEmojiStatusDocumentId(chat.emoji_status) != 0) {
            p5Var.j(DialogObject.getEmojiStatusDocumentId(chat.emoji_status), z10);
            p5Var.k(Integer.valueOf(i10));
            return p5Var;
        } else if (user != null && user.verified) {
            Drawable drawable2 = this.f26011b;
            if (drawable2 == null) {
                drawable2 = new zq(org.telegram.ui.ActionBar.h6.f21017f1, org.telegram.ui.ActionBar.h6.f21070i1);
            }
            this.f26011b = drawable2;
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

    public ex0(int i10, View view) {
        this.f26010a = new p5(AndroidUtilities.dp(i10), view);
    }
}
