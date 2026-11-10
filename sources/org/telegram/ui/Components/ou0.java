package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ou0 {
    public final f5 f36694a;
    public Drawable f36695b;

    public ou0(FrameLayout frameLayout) {
        this(18, frameLayout);
    }

    public final f5 a(TLObject tLObject, int i7, boolean z9) {
        if (tLObject instanceof TLRPC.User) {
            return b((TLRPC.User) tLObject, null, i7, z9);
        }
        if (tLObject instanceof TLRPC.Chat) {
            return b(null, (TLRPC.Chat) tLObject, i7, z9);
        }
        return b(null, null, i7, z9);
    }

    public final f5 b(TLRPC.User user, TLRPC.Chat chat, int i7, boolean z9) {
        f5 f5Var = this.f36694a;
        if (chat != null && chat.verified) {
            Drawable drawable = this.f36695b;
            if (drawable == null) {
                drawable = new xp(org.telegram.ui.ActionBar.m6.f27923f1, org.telegram.ui.ActionBar.m6.f27977i1);
            }
            this.f36695b = drawable;
            f5Var.g(drawable, z9);
            f5Var.k(null);
            return f5Var;
        } else if (chat != null && org.telegram.messenger.m5.f(chat.emoji_status) != 0) {
            f5Var.j(org.telegram.messenger.m5.f(chat.emoji_status), z9);
            f5Var.k(Integer.valueOf(i7));
            return f5Var;
        } else if (user != null && user.verified) {
            Drawable drawable2 = this.f36695b;
            if (drawable2 == null) {
                drawable2 = new xp(org.telegram.ui.ActionBar.m6.f27923f1, org.telegram.ui.ActionBar.m6.f27977i1);
            }
            this.f36695b = drawable2;
            f5Var.g(drawable2, z9);
            f5Var.k(null);
            return f5Var;
        } else if (user != null && org.telegram.messenger.m5.f(user.emoji_status) != 0) {
            f5Var.j(org.telegram.messenger.m5.f(user.emoji_status), z9);
            f5Var.k(Integer.valueOf(i7));
            return f5Var;
        } else if (user != null && user.premium) {
            f5Var.g((Drawable) ia.e.d().f15432f, z9);
            f5Var.k(Integer.valueOf(i7));
            return f5Var;
        } else {
            f5Var.g(null, z9);
            f5Var.k(null);
            return f5Var;
        }
    }

    public ou0(int i7, View view) {
        this.f36694a = new f5(org.telegram.messenger.g0.L(i7), view);
    }
}
