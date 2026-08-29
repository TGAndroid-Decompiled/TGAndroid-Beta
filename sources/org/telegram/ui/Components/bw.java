package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.ColorFilter;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class bw extends tv {
    public final fz f27241c0;

    public bw(fz fzVar, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, uv uvVar, boolean z11) {
        super(context, c6Var, true, false, true, z10, 0, uvVar, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23383v6, c6Var), z11);
        this.f27241c0 = fzVar;
    }

    @Override
    public final boolean d() {
        return this.f27241c0.Q0;
    }

    @Override
    public final void e() {
        fz fzVar = this.f27241c0;
        ArrayList arrayList = fzVar.f28606j1;
        if (arrayList.size() > 0 && ((TLRPC.StickerSetCovered) arrayList.get(0)).set != null && MessagesController.getEmojiSettings(fzVar.Y0).getLong("emoji_featured_hidden", 0L) != ((TLRPC.StickerSetCovered) arrayList.get(0)).set.f22419id) {
            UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
        }
    }

    @Override
    public final boolean g(rx rxVar) {
        if (!rxVar.f32405f && !this.f27241c0.l1.contains(Long.valueOf(rxVar.f32402b.f22419id))) {
            return false;
        }
        return true;
    }

    @Override
    public final ColorFilter getEmojiColorFilter() {
        return this.f27241c0.a2;
    }

    @Override
    public final boolean h(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bw.h(int):boolean");
    }

    @Override
    public final void setTranslationY(float f9) {
        if (getTranslationY() != f9) {
            super.setTranslationY(f9);
            fz fzVar = this.f27241c0;
            View view = fzVar.K;
            if (view != null) {
                view.setTranslationY(f9);
            }
            fzVar.F.invalidate();
        }
    }
}
