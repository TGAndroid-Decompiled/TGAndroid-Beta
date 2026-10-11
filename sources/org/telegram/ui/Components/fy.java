package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.ColorFilter;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class fy extends tw {
    public final b00 f26513g0;

    public fy(b00 b00Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, uw uwVar, boolean z11) {
        super(context, d6Var, true, false, true, z10, 0, uwVar, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21118v6, d6Var), z11);
        this.f26513g0 = b00Var;
    }

    @Override
    public final boolean d() {
        return this.f26513g0.U0;
    }

    @Override
    public final void e() {
        b00 b00Var = this.f26513g0;
        ArrayList arrayList = b00Var.f24696n1;
        if (arrayList.size() > 0 && ((TLRPC.StickerSetCovered) arrayList.get(0)).set != null && MessagesController.getEmojiSettings(b00Var.f24662c1).getLong("emoji_featured_hidden", 0L) != ((TLRPC.StickerSetCovered) arrayList.get(0)).set.f20059id) {
            UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
        }
    }

    @Override
    public final boolean g(oy oyVar) {
        if (!oyVar.f29551f && !this.f26513g0.f24702p1.contains(Long.valueOf(oyVar.f29548b.f20059id))) {
            return false;
        }
        return true;
    }

    @Override
    public final ColorFilter getEmojiColorFilter() {
        return this.f26513g0.f24670e2;
    }

    @Override
    public final boolean h(int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fy.h(int):boolean");
    }

    @Override
    public final void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            super.setTranslationY(f7);
            b00 b00Var = this.f26513g0;
            View view = b00Var.O;
            if (view != null) {
                view.setTranslationY(f7);
            }
            b00Var.J.invalidate();
        }
    }
}
