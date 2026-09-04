package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.ColorFilter;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class jw extends bw {
    public final kz f27579g0;

    public jw(kz kzVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10, cw cwVar, boolean z11) {
        super(context, f6Var, true, false, true, z10, 0, cwVar, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20990v6, f6Var), z11);
        this.f27579g0 = kzVar;
    }

    @Override
    public final boolean d() {
        return this.f27579g0.U0;
    }

    @Override
    public final void e() {
        kz kzVar = this.f27579g0;
        ArrayList arrayList = kzVar.f27966n1;
        if (arrayList.size() > 0 && ((TLRPC.StickerSetCovered) arrayList.get(0)).set != null && MessagesController.getEmojiSettings(kzVar.f27932c1).getLong("emoji_featured_hidden", 0L) != ((TLRPC.StickerSetCovered) arrayList.get(0)).set.f19896id) {
            UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
        }
    }

    @Override
    public final boolean g(xx xxVar) {
        if (!xxVar.f32767f && !this.f27579g0.f27972p1.contains(Long.valueOf(xxVar.f32764b.f19896id))) {
            return false;
        }
        return true;
    }

    @Override
    public final ColorFilter getEmojiColorFilter() {
        return this.f27579g0.f27940e2;
    }

    @Override
    public final boolean h(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jw.h(int):boolean");
    }

    @Override
    public final void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            super.setTranslationY(f7);
            kz kzVar = this.f27579g0;
            View view = kzVar.O;
            if (view != null) {
                view.setTranslationY(f7);
            }
            kzVar.J.invalidate();
        }
    }
}
