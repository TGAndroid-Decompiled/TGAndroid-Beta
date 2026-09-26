package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.ColorFilter;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class qx extends ew {
    public final mz f27772g0;

    public qx(mz mzVar, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, fw fwVar, boolean z11) {
        super(context, d6Var, true, false, true, z10, 0, fwVar, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19390v6, d6Var), z11);
        this.f27772g0 = mzVar;
    }

    @Override
    public final boolean d() {
        return this.f27772g0.U0;
    }

    @Override
    public final void e() {
        mz mzVar = this.f27772g0;
        ArrayList arrayList = mzVar.f26581n1;
        if (arrayList.size() > 0 && ((TLRPC.StickerSetCovered) arrayList.get(0)).set != null && MessagesController.getEmojiSettings(mzVar.f26548c1).getLong("emoji_featured_hidden", 0L) != ((TLRPC.StickerSetCovered) arrayList.get(0)).set.f18362id) {
            UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
        }
    }

    @Override
    public final boolean g(zx zxVar) {
        if (!zxVar.f30994f && !this.f27772g0.f26587p1.contains(Long.valueOf(zxVar.f30992b.f18362id))) {
            return false;
        }
        return true;
    }

    @Override
    public final ColorFilter getEmojiColorFilter() {
        return this.f27772g0.f26555e2;
    }

    @Override
    public final boolean h(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qx.h(int):boolean");
    }

    @Override
    public final void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            super.setTranslationY(f7);
            mz mzVar = this.f27772g0;
            View view = mzVar.O;
            if (view != null) {
                view.setTranslationY(f7);
            }
            mzVar.J.invalidate();
        }
    }
}
