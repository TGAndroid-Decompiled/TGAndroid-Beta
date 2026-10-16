package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.ColorFilter;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class zx extends ow {
    public final wz f31711g0;

    public zx(wz wzVar, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, pw pwVar, boolean z11) {
        super(context, c6Var, true, false, true, z10, 0, pwVar, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19933v6, c6Var), z11);
        this.f31711g0 = wzVar;
    }

    @Override
    public final boolean d() {
        return this.f31711g0.U0;
    }

    @Override
    public final void e() {
        wz wzVar = this.f31711g0;
        ArrayList arrayList = wzVar.f30740n1;
        if (arrayList.size() > 0 && ((TLRPC.StickerSetCovered) arrayList.get(0)).set != null && MessagesController.getEmojiSettings(wzVar.f30707c1).getLong("emoji_featured_hidden", 0L) != ((TLRPC.StickerSetCovered) arrayList.get(0)).set.f18943id) {
            UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
        }
    }

    @Override
    public final boolean g(jy jyVar) {
        if (!jyVar.f26153f && !this.f31711g0.f30746p1.contains(Long.valueOf(jyVar.f26151b.f18943id))) {
            return false;
        }
        return true;
    }

    @Override
    public final ColorFilter getEmojiColorFilter() {
        return this.f31711g0.f30714e2;
    }

    @Override
    public final boolean h(int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zx.h(int):boolean");
    }

    @Override
    public final void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            super.setTranslationY(f7);
            wz wzVar = this.f31711g0;
            View view = wzVar.O;
            if (view != null) {
                view.setTranslationY(f7);
            }
            wzVar.J.invalidate();
        }
    }
}
