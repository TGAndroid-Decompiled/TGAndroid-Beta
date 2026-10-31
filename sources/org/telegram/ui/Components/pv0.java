package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pv0 {
    public final d5 f29441a;
    public Drawable f29442b;

    public pv0(FrameLayout frameLayout) {
        this(18, frameLayout);
    }

    public final d5 a(TLObject tLObject, int i10, boolean z10) {
        if (tLObject instanceof TLRPC.User) {
            return b((TLRPC.User) tLObject, null, i10, z10);
        }
        if (tLObject instanceof TLRPC.Chat) {
            return b(null, (TLRPC.Chat) tLObject, i10, z10);
        }
        return b(null, null, i10, z10);
    }

    public final d5 b(TLRPC.User user, TLRPC.Chat chat, int i10, boolean z10) {
        d5 d5Var = this.f29441a;
        if (chat != null && chat.verified) {
            Drawable drawable = this.f29442b;
            if (drawable == null) {
                drawable = new eq(org.telegram.ui.ActionBar.t6.f20961f1, org.telegram.ui.ActionBar.t6.f21015i1);
            }
            this.f29442b = drawable;
            d5Var.g(drawable, z10);
            d5Var.k(null);
            return d5Var;
        } else if (chat != null && org.telegram.messenger.o5.f(chat.emoji_status) != 0) {
            d5Var.j(org.telegram.messenger.o5.f(chat.emoji_status), z10);
            d5Var.k(Integer.valueOf(i10));
            return d5Var;
        } else if (user != null && user.verified) {
            Drawable drawable2 = this.f29442b;
            if (drawable2 == null) {
                drawable2 = new eq(org.telegram.ui.ActionBar.t6.f20961f1, org.telegram.ui.ActionBar.t6.f21015i1);
            }
            this.f29442b = drawable2;
            d5Var.g(drawable2, z10);
            d5Var.k(null);
            return d5Var;
        } else if (user != null && org.telegram.messenger.o5.f(user.emoji_status) != 0) {
            d5Var.j(org.telegram.messenger.o5.f(user.emoji_status), z10);
            d5Var.k(Integer.valueOf(i10));
            return d5Var;
        } else if (user != null && user.premium) {
            d5Var.g((Drawable) ea.f.d().f6476f, z10);
            d5Var.k(Integer.valueOf(i10));
            return d5Var;
        } else {
            d5Var.g(null, z10);
            d5Var.k(null);
            return d5Var;
        }
    }

    public pv0(int i10, View view) {
        this.f29441a = new d5(org.telegram.messenger.i0.L(i10), view);
    }
}
