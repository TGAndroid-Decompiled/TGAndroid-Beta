package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.ColorFilter;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class ow extends gw {
    public final rz f25924g0;

    public ow(rz rzVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10, hw hwVar, boolean z11) {
        super(context, f6Var, true, false, true, z10, 0, hwVar, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18254v6, f6Var), z11);
        this.f25924g0 = rzVar;
    }

    @Override
    public final boolean d() {
        return this.f25924g0.U0;
    }

    @Override
    public final void e() {
        rz rzVar = this.f25924g0;
        ArrayList arrayList = rzVar.f26838n1;
        if (arrayList.size() > 0 && ((TLRPC.StickerSetCovered) arrayList.get(0)).set != null && MessagesController.getEmojiSettings(rzVar.f26805c1).getLong("emoji_featured_hidden", 0L) != ((TLRPC.StickerSetCovered) arrayList.get(0)).set.f17222id) {
            UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
        }
    }

    @Override
    public final boolean g(dy dyVar) {
        if (!dyVar.f22501f && !this.f25924g0.f26844p1.contains(Long.valueOf(dyVar.f22499b.f17222id))) {
            return false;
        }
        return true;
    }

    @Override
    public final ColorFilter getEmojiColorFilter() {
        return this.f25924g0.f26812e2;
    }

    @Override
    public final boolean h(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ow.h(int):boolean");
    }

    @Override
    public final void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            super.setTranslationY(f7);
            rz rzVar = this.f25924g0;
            View view = rzVar.O;
            if (view != null) {
                view.setTranslationY(f7);
            }
            rzVar.J.invalidate();
        }
    }
}
