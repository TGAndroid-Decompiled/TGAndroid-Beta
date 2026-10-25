package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.ColorFilter;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class ux extends kw {
    public final sz f33502g0;

    public ux(sz szVar, Context context, org.telegram.ui.ActionBar.u6 u6Var, boolean z10, lw lwVar, boolean z11) {
        super(context, u6Var, true, false, true, z10, 0, lwVar, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23690v6, u6Var), z11);
        this.f33502g0 = szVar;
    }

    @Override
    public final boolean d() {
        return this.f33502g0.U0;
    }

    @Override
    public final void e() {
        sz szVar = this.f33502g0;
        ArrayList arrayList = szVar.f32749n1;
        if (arrayList.size() > 0 && ((TLRPC.StickerSetCovered) arrayList.get(0)).set != null && MessagesController.getEmojiSettings(szVar.f32716c1).getLong("emoji_featured_hidden", 0L) != ((TLRPC.StickerSetCovered) arrayList.get(0)).set.f22054id) {
            UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
        }
    }

    @Override
    public final boolean g(ey eyVar) {
        if (!eyVar.f28008f && !this.f33502g0.f32755p1.contains(Long.valueOf(eyVar.f28006b.f22054id))) {
            return false;
        }
        return true;
    }

    @Override
    public final ColorFilter getEmojiColorFilter() {
        return this.f33502g0.f32723e2;
    }

    @Override
    public final boolean h(int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ux.h(int):boolean");
    }

    @Override
    public final void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            super.setTranslationY(f7);
            sz szVar = this.f33502g0;
            View view = szVar.O;
            if (view != null) {
                view.setTranslationY(f7);
            }
            szVar.J.invalidate();
        }
    }
}
