package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.ColorFilter;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class ox extends cw {
    public final kz f27063g0;

    public ox(kz kzVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, dw dwVar, boolean z11) {
        super(context, e6Var, true, false, true, z10, 0, dwVar, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19393v6, e6Var), z11);
        this.f27063g0 = kzVar;
    }

    @Override
    public final boolean d() {
        return this.f27063g0.U0;
    }

    @Override
    public final void e() {
        kz kzVar = this.f27063g0;
        ArrayList arrayList = kzVar.f25925n1;
        if (arrayList.size() > 0 && ((TLRPC.StickerSetCovered) arrayList.get(0)).set != null && MessagesController.getEmojiSettings(kzVar.f25892c1).getLong("emoji_featured_hidden", 0L) != ((TLRPC.StickerSetCovered) arrayList.get(0)).set.f18323id) {
            UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
        }
    }

    @Override
    public final boolean g(xx xxVar) {
        if (!xxVar.f30389f && !this.f27063g0.f25931p1.contains(Long.valueOf(xxVar.f30387b.f18323id))) {
            return false;
        }
        return true;
    }

    @Override
    public final ColorFilter getEmojiColorFilter() {
        return this.f27063g0.f25899e2;
    }

    @Override
    public final boolean h(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ox.h(int):boolean");
    }

    @Override
    public final void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            super.setTranslationY(f7);
            kz kzVar = this.f27063g0;
            View view = kzVar.O;
            if (view != null) {
                view.setTranslationY(f7);
            }
            kzVar.J.invalidate();
        }
    }
}
