package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.ColorFilter;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class vx extends kw {
    public final tz f31942g0;

    public vx(tz tzVar, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, lw lwVar, boolean z11) {
        super(context, d6Var, true, false, true, z10, 0, lwVar, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21322v6, d6Var), z11);
        this.f31942g0 = tzVar;
    }

    @Override
    public final boolean d() {
        return this.f31942g0.U0;
    }

    @Override
    public final void e() {
        tz tzVar = this.f31942g0;
        ArrayList arrayList = tzVar.f30803n1;
        if (arrayList.size() > 0 && ((TLRPC.StickerSetCovered) arrayList.get(0)).set != null && MessagesController.getEmojiSettings(tzVar.f30770c1).getLong("emoji_featured_hidden", 0L) != ((TLRPC.StickerSetCovered) arrayList.get(0)).set.f20302id) {
            UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
        }
    }

    @Override
    public final boolean g(fy fyVar) {
        if (!fyVar.f26398f && !this.f31942g0.f30809p1.contains(Long.valueOf(fyVar.f26396b.f20302id))) {
            return false;
        }
        return true;
    }

    @Override
    public final ColorFilter getEmojiColorFilter() {
        return this.f31942g0.f30777e2;
    }

    @Override
    public final boolean h(int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vx.h(int):boolean");
    }

    @Override
    public final void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            super.setTranslationY(f7);
            tz tzVar = this.f31942g0;
            View view = tzVar.O;
            if (view != null) {
                view.setTranslationY(f7);
            }
            tzVar.J.invalidate();
        }
    }
}
