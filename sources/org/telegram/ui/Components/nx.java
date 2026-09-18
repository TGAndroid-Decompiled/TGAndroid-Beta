package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.ColorFilter;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class nx extends cw {
    public final kz f26558g0;

    public nx(kz kzVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10, dw dwVar, boolean z11) {
        super(context, f6Var, true, false, true, z10, 0, dwVar, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19193v6, f6Var), z11);
        this.f26558g0 = kzVar;
    }

    @Override
    public final boolean d() {
        return this.f26558g0.U0;
    }

    @Override
    public final void e() {
        kz kzVar = this.f26558g0;
        ArrayList arrayList = kzVar.f25749n1;
        if (arrayList.size() > 0 && ((TLRPC.StickerSetCovered) arrayList.get(0)).set != null && MessagesController.getEmojiSettings(kzVar.f25716c1).getLong("emoji_featured_hidden", 0L) != ((TLRPC.StickerSetCovered) arrayList.get(0)).set.f18148id) {
            UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
        }
    }

    @Override
    public final boolean g(wx wxVar) {
        if (!wxVar.f29764f && !this.f26558g0.f25755p1.contains(Long.valueOf(wxVar.f29762b.f18148id))) {
            return false;
        }
        return true;
    }

    @Override
    public final ColorFilter getEmojiColorFilter() {
        return this.f26558g0.f25723e2;
    }

    @Override
    public final boolean h(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.nx.h(int):boolean");
    }

    @Override
    public final void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            super.setTranslationY(f7);
            kz kzVar = this.f26558g0;
            View view = kzVar.O;
            if (view != null) {
                view.setTranslationY(f7);
            }
            kzVar.J.invalidate();
        }
    }
}
