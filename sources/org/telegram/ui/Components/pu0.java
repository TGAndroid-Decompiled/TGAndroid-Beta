package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pu0 {
    public final e5 f38413a;
    public Drawable f38414b;

    public pu0(FrameLayout frameLayout) {
        this(18, frameLayout);
    }

    public final e5 a(TLObject tLObject, int i7, boolean z10) {
        if (tLObject instanceof TLRPC.User) {
            return b((TLRPC.User) tLObject, null, i7, z10);
        }
        if (tLObject instanceof TLRPC.Chat) {
            return b(null, (TLRPC.Chat) tLObject, i7, z10);
        }
        return b(null, null, i7, z10);
    }

    public final e5 b(TLRPC.User user, TLRPC.Chat chat, int i7, boolean z10) {
        e5 e5Var = this.f38413a;
        if (chat != null && chat.verified) {
            Drawable drawable = this.f38414b;
            if (drawable == null) {
                drawable = new fq(org.telegram.ui.ActionBar.j6.f28882f1, org.telegram.ui.ActionBar.j6.f28936i1);
            }
            this.f38414b = drawable;
            e5Var.g(drawable, z10);
            e5Var.k(null);
            return e5Var;
        } else if (chat != null && org.telegram.messenger.m5.f(chat.emoji_status) != 0) {
            e5Var.j(org.telegram.messenger.m5.f(chat.emoji_status), z10);
            e5Var.k(Integer.valueOf(i7));
            return e5Var;
        } else if (user != null && user.verified) {
            Drawable drawable2 = this.f38414b;
            if (drawable2 == null) {
                drawable2 = new fq(org.telegram.ui.ActionBar.j6.f28882f1, org.telegram.ui.ActionBar.j6.f28936i1);
            }
            this.f38414b = drawable2;
            e5Var.g(drawable2, z10);
            e5Var.k(null);
            return e5Var;
        } else if (user != null && org.telegram.messenger.m5.f(user.emoji_status) != 0) {
            e5Var.j(org.telegram.messenger.m5.f(user.emoji_status), z10);
            e5Var.k(Integer.valueOf(i7));
            return e5Var;
        } else if (user != null && user.premium) {
            e5Var.g((Drawable) ia.f.d().f15887f, z10);
            e5Var.k(Integer.valueOf(i7));
            return e5Var;
        } else {
            e5Var.g(null, z10);
            e5Var.k(null);
            return e5Var;
        }
    }

    public pu0(int i7, View view) {
        this.f38413a = new e5(org.telegram.messenger.g0.L(i7), view);
    }
}
