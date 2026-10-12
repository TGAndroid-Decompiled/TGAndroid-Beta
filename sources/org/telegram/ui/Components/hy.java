package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.ColorFilter;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class hy extends vw {
    public final d00 f26987g0;

    public hy(d00 d00Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, ww wwVar, boolean z11) {
        super(context, c6Var, true, false, true, z10, 0, wwVar, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20892v6, c6Var), z11);
        this.f26987g0 = d00Var;
    }

    @Override
    public final boolean d() {
        return this.f26987g0.U0;
    }

    @Override
    public final void e() {
        d00 d00Var = this.f26987g0;
        ArrayList arrayList = d00Var.f25114n1;
        if (arrayList.size() > 0 && ((TLRPC.StickerSetCovered) arrayList.get(0)).set != null && MessagesController.getEmojiSettings(d00Var.f25080c1).getLong("emoji_featured_hidden", 0L) != ((TLRPC.StickerSetCovered) arrayList.get(0)).set.f19829id) {
            UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
        }
    }

    @Override
    public final boolean g(qy qyVar) {
        if (!qyVar.f29950f && !this.f26987g0.f25120p1.contains(Long.valueOf(qyVar.f29947b.f19829id))) {
            return false;
        }
        return true;
    }

    @Override
    public final ColorFilter getEmojiColorFilter() {
        return this.f26987g0.f25088e2;
    }

    @Override
    public final boolean h(int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hy.h(int):boolean");
    }

    @Override
    public final void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            super.setTranslationY(f7);
            d00 d00Var = this.f26987g0;
            View view = d00Var.O;
            if (view != null) {
                view.setTranslationY(f7);
            }
            d00Var.J.invalidate();
        }
    }
}
