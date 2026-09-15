package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.ColorFilter;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class nx extends cw {
    public final kz f26607g0;

    public nx(kz kzVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, dw dwVar, boolean z11) {
        super(context, e6Var, true, false, true, z10, 0, dwVar, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19166v6, e6Var), z11);
        this.f26607g0 = kzVar;
    }

    @Override
    public final boolean d() {
        return this.f26607g0.U0;
    }

    @Override
    public final void e() {
        kz kzVar = this.f26607g0;
        ArrayList arrayList = kzVar.f25736n1;
        if (arrayList.size() > 0 && ((TLRPC.StickerSetCovered) arrayList.get(0)).set != null && MessagesController.getEmojiSettings(kzVar.f25703c1).getLong("emoji_featured_hidden", 0L) != ((TLRPC.StickerSetCovered) arrayList.get(0)).set.f18139id) {
            UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
        }
    }

    @Override
    public final boolean g(wx wxVar) {
        if (!wxVar.f29825f && !this.f26607g0.f25742p1.contains(Long.valueOf(wxVar.f29823b.f18139id))) {
            return false;
        }
        return true;
    }

    @Override
    public final ColorFilter getEmojiColorFilter() {
        return this.f26607g0.f25710e2;
    }

    @Override
    public final boolean h(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.nx.h(int):boolean");
    }

    @Override
    public final void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            super.setTranslationY(f7);
            kz kzVar = this.f26607g0;
            View view = kzVar.O;
            if (view != null) {
                view.setTranslationY(f7);
            }
            kzVar.J.invalidate();
        }
    }
}
