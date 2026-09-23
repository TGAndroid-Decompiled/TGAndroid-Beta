package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.ColorFilter;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class ox extends dw {
    public final lz f26878g0;

    public ox(lz lzVar, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, ew ewVar, boolean z11) {
        super(context, d6Var, true, false, true, z10, 0, ewVar, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19118v6, d6Var), z11);
        this.f26878g0 = lzVar;
    }

    @Override
    public final boolean d() {
        return this.f26878g0.U0;
    }

    @Override
    public final void e() {
        lz lzVar = this.f26878g0;
        ArrayList arrayList = lzVar.f26001n1;
        if (arrayList.size() > 0 && ((TLRPC.StickerSetCovered) arrayList.get(0)).set != null && MessagesController.getEmojiSettings(lzVar.f25968c1).getLong("emoji_featured_hidden", 0L) != ((TLRPC.StickerSetCovered) arrayList.get(0)).set.f18110id) {
            UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
        }
    }

    @Override
    public final boolean g(xx xxVar) {
        if (!xxVar.f30090f && !this.f26878g0.f26007p1.contains(Long.valueOf(xxVar.f30088b.f18110id))) {
            return false;
        }
        return true;
    }

    @Override
    public final ColorFilter getEmojiColorFilter() {
        return this.f26878g0.f25975e2;
    }

    @Override
    public final boolean h(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ox.h(int):boolean");
    }

    @Override
    public final void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            super.setTranslationY(f7);
            lz lzVar = this.f26878g0;
            View view = lzVar.O;
            if (view != null) {
                view.setTranslationY(f7);
            }
            lzVar.J.invalidate();
        }
    }
}
