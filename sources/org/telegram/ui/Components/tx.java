package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.ColorFilter;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class tx extends iw {
    public final rz f30909g0;

    public tx(rz rzVar, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z10, jw jwVar, boolean z11) {
        super(context, g6Var, true, false, true, z10, 0, jwVar, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21517v6, g6Var), z11);
        this.f30909g0 = rzVar;
    }

    @Override
    public final boolean d() {
        return this.f30909g0.U0;
    }

    @Override
    public final void e() {
        rz rzVar = this.f30909g0;
        ArrayList arrayList = rzVar.f30343n1;
        if (arrayList.size() > 0 && ((TLRPC.StickerSetCovered) arrayList.get(0)).set != null && MessagesController.getEmojiSettings(rzVar.f30310c1).getLong("emoji_featured_hidden", 0L) != ((TLRPC.StickerSetCovered) arrayList.get(0)).set.f20371id) {
            UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
        }
    }

    @Override
    public final boolean g(dy dyVar) {
        if (!dyVar.f25858f && !this.f30909g0.f30349p1.contains(Long.valueOf(dyVar.f25856b.f20371id))) {
            return false;
        }
        return true;
    }

    @Override
    public final ColorFilter getEmojiColorFilter() {
        return this.f30909g0.f30317e2;
    }

    @Override
    public final boolean h(int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tx.h(int):boolean");
    }

    @Override
    public final void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            super.setTranslationY(f7);
            rz rzVar = this.f30909g0;
            View view = rzVar.O;
            if (view != null) {
                view.setTranslationY(f7);
            }
            rzVar.J.invalidate();
        }
    }
}
