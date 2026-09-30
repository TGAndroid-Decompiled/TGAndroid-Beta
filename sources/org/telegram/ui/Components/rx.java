package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.ColorFilter;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class rx extends fw {
    public final nz f28140g0;

    public rx(nz nzVar, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, gw gwVar, boolean z11) {
        super(context, d6Var, true, false, true, z10, 0, gwVar, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19407v6, d6Var), z11);
        this.f28140g0 = nzVar;
    }

    @Override
    public final boolean d() {
        return this.f28140g0.U0;
    }

    @Override
    public final void e() {
        nz nzVar = this.f28140g0;
        ArrayList arrayList = nzVar.f26851n1;
        if (arrayList.size() > 0 && ((TLRPC.StickerSetCovered) arrayList.get(0)).set != null && MessagesController.getEmojiSettings(nzVar.f26818c1).getLong("emoji_featured_hidden", 0L) != ((TLRPC.StickerSetCovered) arrayList.get(0)).set.f18379id) {
            UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
        }
    }

    @Override
    public final boolean g(ay ayVar) {
        if (!ayVar.f22727f && !this.f28140g0.f26857p1.contains(Long.valueOf(ayVar.f22725b.f18379id))) {
            return false;
        }
        return true;
    }

    @Override
    public final ColorFilter getEmojiColorFilter() {
        return this.f28140g0.f26825e2;
    }

    @Override
    public final boolean h(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rx.h(int):boolean");
    }

    @Override
    public final void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            super.setTranslationY(f7);
            nz nzVar = this.f28140g0;
            View view = nzVar.O;
            if (view != null) {
                view.setTranslationY(f7);
            }
            nzVar.J.invalidate();
        }
    }
}
