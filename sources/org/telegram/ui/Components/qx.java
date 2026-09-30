package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.ColorFilter;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class qx extends fw {
    public final mz f27843g0;

    public qx(mz mzVar, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, gw gwVar, boolean z11) {
        super(context, d6Var, true, false, true, z10, 0, gwVar, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19392v6, d6Var), z11);
        this.f27843g0 = mzVar;
    }

    @Override
    public final boolean d() {
        return this.f27843g0.U0;
    }

    @Override
    public final void e() {
        mz mzVar = this.f27843g0;
        ArrayList arrayList = mzVar.f26564n1;
        if (arrayList.size() > 0 && ((TLRPC.StickerSetCovered) arrayList.get(0)).set != null && MessagesController.getEmojiSettings(mzVar.f26531c1).getLong("emoji_featured_hidden", 0L) != ((TLRPC.StickerSetCovered) arrayList.get(0)).set.f18364id) {
            UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
        }
    }

    @Override
    public final boolean g(zx zxVar) {
        if (!zxVar.f30983f && !this.f27843g0.f26570p1.contains(Long.valueOf(zxVar.f30981b.f18364id))) {
            return false;
        }
        return true;
    }

    @Override
    public final ColorFilter getEmojiColorFilter() {
        return this.f27843g0.f26538e2;
    }

    @Override
    public final boolean h(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qx.h(int):boolean");
    }

    @Override
    public final void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            super.setTranslationY(f7);
            mz mzVar = this.f27843g0;
            View view = mzVar.O;
            if (view != null) {
                view.setTranslationY(f7);
            }
            mzVar.J.invalidate();
        }
    }
}
