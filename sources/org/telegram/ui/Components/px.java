package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.ColorFilter;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class px extends dw {
    public final lz f27440g0;

    public px(lz lzVar, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, ew ewVar, boolean z11) {
        super(context, d6Var, true, false, true, z10, 0, ewVar, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19390v6, d6Var), z11);
        this.f27440g0 = lzVar;
    }

    @Override
    public final boolean d() {
        return this.f27440g0.U0;
    }

    @Override
    public final void e() {
        lz lzVar = this.f27440g0;
        ArrayList arrayList = lzVar.f26269n1;
        if (arrayList.size() > 0 && ((TLRPC.StickerSetCovered) arrayList.get(0)).set != null && MessagesController.getEmojiSettings(lzVar.f26236c1).getLong("emoji_featured_hidden", 0L) != ((TLRPC.StickerSetCovered) arrayList.get(0)).set.f18362id) {
            UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
        }
    }

    @Override
    public final boolean g(yx yxVar) {
        if (!yxVar.f30717f && !this.f27440g0.f26275p1.contains(Long.valueOf(yxVar.f30715b.f18362id))) {
            return false;
        }
        return true;
    }

    @Override
    public final ColorFilter getEmojiColorFilter() {
        return this.f27440g0.f26243e2;
    }

    @Override
    public final boolean h(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.px.h(int):boolean");
    }

    @Override
    public final void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            super.setTranslationY(f7);
            lz lzVar = this.f27440g0;
            View view = lzVar.O;
            if (view != null) {
                view.setTranslationY(f7);
            }
            lzVar.J.invalidate();
        }
    }
}
