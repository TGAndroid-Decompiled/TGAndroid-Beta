package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mu0 {
    public final e5 f36254a;
    public Drawable f36255b;

    public mu0(FrameLayout frameLayout) {
        this(18, frameLayout);
    }

    public final e5 a(TLObject tLObject, int i3, boolean z10) {
        if (tLObject instanceof TLRPC.User) {
            return b((TLRPC.User) tLObject, null, i3, z10);
        }
        if (tLObject instanceof TLRPC.Chat) {
            return b(null, (TLRPC.Chat) tLObject, i3, z10);
        }
        return b(null, null, i3, z10);
    }

    public final e5 b(TLRPC.User user, TLRPC.Chat chat, int i3, boolean z10) {
        e5 e5Var = this.f36254a;
        if (chat != null && chat.verified) {
            Drawable drawable = this.f36255b;
            if (drawable == null) {
                drawable = new xp(org.telegram.ui.ActionBar.k6.f27912f1, org.telegram.ui.ActionBar.k6.f27968i1);
            }
            this.f36255b = drawable;
            e5Var.g(drawable, z10);
            e5Var.k(null);
            return e5Var;
        } else if (chat != null && org.telegram.messenger.m5.f(chat.emoji_status) != 0) {
            e5Var.j(org.telegram.messenger.m5.f(chat.emoji_status), z10);
            e5Var.k(Integer.valueOf(i3));
            return e5Var;
        } else if (user != null && user.verified) {
            Drawable drawable2 = this.f36255b;
            if (drawable2 == null) {
                drawable2 = new xp(org.telegram.ui.ActionBar.k6.f27912f1, org.telegram.ui.ActionBar.k6.f27968i1);
            }
            this.f36255b = drawable2;
            e5Var.g(drawable2, z10);
            e5Var.k(null);
            return e5Var;
        } else if (user != null && org.telegram.messenger.m5.f(user.emoji_status) != 0) {
            e5Var.j(org.telegram.messenger.m5.f(user.emoji_status), z10);
            e5Var.k(Integer.valueOf(i3));
            return e5Var;
        } else if (user != null && user.premium) {
            e5Var.g((Drawable) ha.e.d().f14384f, z10);
            e5Var.k(Integer.valueOf(i3));
            return e5Var;
        } else {
            e5Var.g(null, z10);
            e5Var.k(null);
            return e5Var;
        }
    }

    public mu0(int i3, View view) {
        this.f36254a = new e5(org.telegram.messenger.g0.L(i3), view);
    }
}
