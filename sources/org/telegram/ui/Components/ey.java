package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.ColorFilter;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class ey extends sw {
    public final a00 f26176g0;

    public ey(a00 a00Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, tw twVar, boolean z11) {
        super(context, e6Var, true, false, true, z10, 0, twVar, org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21128v6, e6Var), z11);
        this.f26176g0 = a00Var;
    }

    @Override
    public final boolean d() {
        return this.f26176g0.U0;
    }

    @Override
    public final void e() {
        a00 a00Var = this.f26176g0;
        ArrayList arrayList = a00Var.f24435n1;
        if (arrayList.size() > 0 && ((TLRPC.StickerSetCovered) arrayList.get(0)).set != null && MessagesController.getEmojiSettings(a00Var.f24401c1).getLong("emoji_featured_hidden", 0L) != ((TLRPC.StickerSetCovered) arrayList.get(0)).set.f20065id) {
            UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
        }
    }

    @Override
    public final boolean g(ny nyVar) {
        if (!nyVar.f29304f && !this.f26176g0.f24441p1.contains(Long.valueOf(nyVar.f29301b.f20065id))) {
            return false;
        }
        return true;
    }

    @Override
    public final ColorFilter getEmojiColorFilter() {
        return this.f26176g0.f24409e2;
    }

    @Override
    public final boolean h(int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ey.h(int):boolean");
    }

    @Override
    public final void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            super.setTranslationY(f7);
            a00 a00Var = this.f26176g0;
            View view = a00Var.O;
            if (view != null) {
                view.setTranslationY(f7);
            }
            a00Var.J.invalidate();
        }
    }
}
