package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.ColorFilter;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class hw extends zv {
    public final mz f27639d0;

    public hw(mz mzVar, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z4, aw awVar, boolean z10) {
        super(context, g6Var, true, false, true, z4, 0, awVar, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21981v6, g6Var), z10);
        this.f27639d0 = mzVar;
    }

    @Override
    public final boolean d() {
        return this.f27639d0.R0;
    }

    @Override
    public final void e() {
        mz mzVar = this.f27639d0;
        ArrayList arrayList = mzVar.f29300k1;
        if (arrayList.size() > 0 && ((TLRPC.StickerSetCovered) arrayList.get(0)).set != null && MessagesController.getEmojiSettings(mzVar.Z0).getLong("emoji_featured_hidden", 0L) != ((TLRPC.StickerSetCovered) arrayList.get(0)).set.f20872id) {
            UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
        }
    }

    @Override
    public final boolean g(xx xxVar) {
        if (!xxVar.f33215f && !this.f27639d0.f29304m1.contains(Long.valueOf(xxVar.f33212b.f20872id))) {
            return false;
        }
        return true;
    }

    @Override
    public final ColorFilter getEmojiColorFilter() {
        return this.f27639d0.f29271b2;
    }

    @Override
    public final boolean h(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hw.h(int):boolean");
    }

    @Override
    public final void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            super.setTranslationY(f10);
            mz mzVar = this.f27639d0;
            View view = mzVar.L;
            if (view != null) {
                view.setTranslationY(f10);
            }
            mzVar.G.invalidate();
        }
    }
}
