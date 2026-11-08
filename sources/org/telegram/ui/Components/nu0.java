package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nu0 {
    public final g5 f36451a;
    public Drawable f36452b;

    public nu0(FrameLayout frameLayout) {
        this(18, frameLayout);
    }

    public final g5 a(TLObject tLObject, int i7, boolean z9) {
        if (tLObject instanceof TLRPC.User) {
            return b((TLRPC.User) tLObject, null, i7, z9);
        }
        if (tLObject instanceof TLRPC.Chat) {
            return b(null, (TLRPC.Chat) tLObject, i7, z9);
        }
        return b(null, null, i7, z9);
    }

    public final g5 b(TLRPC.User user, TLRPC.Chat chat, int i7, boolean z9) {
        g5 g5Var = this.f36451a;
        if (chat != null && chat.verified) {
            Drawable drawable = this.f36452b;
            if (drawable == null) {
                drawable = new xp(org.telegram.ui.ActionBar.k6.f27885f1, org.telegram.ui.ActionBar.k6.f27939i1);
            }
            this.f36452b = drawable;
            g5Var.g(drawable, z9);
            g5Var.k(null);
            return g5Var;
        } else if (chat != null && org.telegram.messenger.m5.f(chat.emoji_status) != 0) {
            g5Var.j(org.telegram.messenger.m5.f(chat.emoji_status), z9);
            g5Var.k(Integer.valueOf(i7));
            return g5Var;
        } else if (user != null && user.verified) {
            Drawable drawable2 = this.f36452b;
            if (drawable2 == null) {
                drawable2 = new xp(org.telegram.ui.ActionBar.k6.f27885f1, org.telegram.ui.ActionBar.k6.f27939i1);
            }
            this.f36452b = drawable2;
            g5Var.g(drawable2, z9);
            g5Var.k(null);
            return g5Var;
        } else if (user != null && org.telegram.messenger.m5.f(user.emoji_status) != 0) {
            g5Var.j(org.telegram.messenger.m5.f(user.emoji_status), z9);
            g5Var.k(Integer.valueOf(i7));
            return g5Var;
        } else if (user != null && user.premium) {
            g5Var.g((Drawable) ia.e.d().f15430f, z9);
            g5Var.k(Integer.valueOf(i7));
            return g5Var;
        } else {
            g5Var.g(null, z9);
            g5Var.k(null);
            return g5Var;
        }
    }

    public nu0(int i7, View view) {
        this.f36451a = new g5(org.telegram.messenger.g0.L(i7), view);
    }
}
